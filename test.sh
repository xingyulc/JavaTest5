#!/usr/bin/env bash
#JAVA_IP=123.123.

if [ "" = "$1" ] ;then
   JAVA_IP=192.168.99.100
else
   JAVA_IP=$1
fi

echo $JAVA_IP