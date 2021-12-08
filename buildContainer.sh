#!/bin/bash

export CONTAINER_NAME=sigobsol-documents-loader
export CONTAINER_IMAGE=quarkus/sigobsol-documents-loader

docker build -f src/main/docker/Dockerfile.native -t $CONTAINER_IMAGE .

