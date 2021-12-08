#!/bin/bash

export CONTAINER_NAME=sgipd-quarkus
export CONTAINER_IMAGE=quarkus/sgipd-quarkus

docker build -f src/main/docker/Dockerfile.native -t $CONTAINER_IMAGE .

