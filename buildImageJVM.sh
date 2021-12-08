#!/bin/bash

export CONTAINER_NAME=sgipd-quarkus-jvm
export CONTAINER_IMAGE=quarkus/sgipd-quarkus-jvm

docker build -f src/main/docker/Dockerfile.jvm -t $CONTAINER_IMAGE .

