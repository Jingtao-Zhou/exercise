#!/usr/bin/env bash
set -e

NAME=${NAME:-exercise}

JAR=$(find . -name ${NAME}*.jar|head -1)

java -Xms128m -Xmx128m -Djava.net.preferIPv4Stack=true -jar "${JAR}"