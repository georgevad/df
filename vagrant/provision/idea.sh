#!/usr/bin/env bash

echo ">>> Installing IntelliJ IDEA..."

# We need root to install
[ $(id -u) != "0" ] && exec sudo "$0" "$@"

# Attempt to install a JDK
# apt-get install openjdk-8-jdk
# add-apt-repository ppa:webupd8team/java && apt-get update && apt-get install oracle-java8-installer

ed=C
# Fetch the most recent version
VERSION=$(wget "https://www.jetbrains.com/intellij-repository/releases" -qO- | grep -P -o -m 1 "(?<=https://www.jetbrains.com/intellij-repository/releases/com/jetbrains/intellij/idea/BUILD/)[^/]+(?=/)")

# Prepend base URL for download
URL="https://www.jetbrains.com/intellij-repository/releases/com/jetbrains/intellij/idea/ideaI$ed/$VERSION/ideaI$ed-$VERSION.zip"

echo $URL

# Truncate filename
FILE=$(basename ${URL})

# Set download directory and create it if it does not exist
DEST=~/Downloads/$FILE
mkdir -p ~/Downloads

echo "Downloading idea-I$ed-$VERSION to $DEST..."

# Download binary
wget -cO ${DEST} ${URL} --read-timeout=5 --tries=0

echo "Download complete!"

# Set directory name
DIR="/opt/idea-I$ed-$VERSION"

echo "Installing to $DIR"

if [ -d "$DIR" ]; then
    echo "Directory alread exists, cleaning it"
    rm -rf "$DIR"
fi

# Untar file
if mkdir ${DIR}; then
    unzip ${DEST} -d ${DIR}
fi

# Grab executable folder
BIN="$DIR/bin"

# Add permissions to install directory
chmod -R +rwx ${DIR}

# Set desktop shortcut path
DESK=/usr/share/applications/IDEA.desktop

# Add desktop shortcut
cat <<EOT >>${DESK}
[Desktop Entry]
Encoding=UTF-8
Name=IntelliJ IDEA
Comment=IntelliJ IDEA
Exec=${BIN}/idea.sh
Icon=${BIN}/idea.png
Terminal=false
StartupNotify=true
Type=Application
EOT

# Create symlink entry
ln -sf ${BIN}/idea.sh /usr/local/bin/idea

#Clean the downloaded tar
rm ~/Downloads/$FILE

echo "Done."
