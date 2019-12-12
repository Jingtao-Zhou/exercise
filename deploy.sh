#!/usr/bin/env bash

set -e

echo "stop exercise"
docker stop exercise || true
docker rm exercise || true

echo "run exercise"
docker run --name -d exercise -p 8888:2333 --network=host exercise:latest
