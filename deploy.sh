#!/usr/bin/env bash

set -e

echo "stop exercise"
docker stop exercise || true
docker rm exercise || true

echo "run exercise"
docker run --name exercise -p 8080:8080 --link mysql:db exercise:latest
