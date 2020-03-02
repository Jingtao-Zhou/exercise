#!/usr/bin/env bash

set -e

echo "stop exercise"
docker stop exercise || true
docker rm exercise || true

echo "delete old images"
docker rmi $(docker images | grep "none" | awk '{print $3}') || true

echo "run exercise"
docker run --name exercise -u campaign-admin -g staff -v /home/campaign-admin/:/test -p 2333:8888 -d exercise:latest
