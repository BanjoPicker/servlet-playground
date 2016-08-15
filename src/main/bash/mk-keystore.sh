#!/bin/bash

# Helkper script to make a keystore and to prompt along the way about what
# parameters to use.
# Run this tool to create your keystore.jks file and then copy it into
# $CATALINA_HOME/conf/keystore.jks and edit the server.xml to expose an
# ssl connector with path "conf/keystore.jks".

set -u
set -e

declare -r keyalg="RSA"
keystore=""
keyalias=""
certfile=""

# Print an error message and exit.
function die() {
  echo "Error: $*"
  exit 1;
}

keytool=${JAVA_HOME}/bin/keytool
[ -x $keytool ] || die "No keytool found at $keytool..."

echo "Welcome to the super awesome keystore maker..."
echo ""

echo -n "Please enter a filename to save the keystore to: "
read keystore

[ x"$keystore" != x ] || die "You must specify a filename for the new keystore."
[ ! -f $keystore ] || die "File $keystore already exists, try again."

echo -n "Please enter an alias for the new key: "
read keyalias
[ x"$keyalias" != x ] || die "You must specify an alias for the new key."

echo -n "Please enter the certificate file for the new csr: "
read certfile
[ x"$certfile" != x ] || die "You must specify an alias for the new key."
[ ! -f $certfile ] || die "File $certfile already exists, try again."

echo $keytool -genkey -alias "$keyalias" -keyalg "$keyalg" -keystore "$keystore"
$keytool -genkey -alias "$keyalias" -keyalg "$keyalg" -keystore "$keystore"

echo $keytool -certreq -keyalg "$keyalg" -alias "$keyalias" -file "$certreq" -keystore "$keystore"
$keytool -certreq -keyalg "$keyalg" -alias "$keyalias" -file "$certreq" -keystore "$keystore"
