#!/usr/bin/env bash
set -e

NAME=${NAME:-exercise}

JAR=$(find . -name ${NAME}*.jar|head -1)

java -Xms64m -Xmx64m -jar "${JAR}"