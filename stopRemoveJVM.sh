#!/bin/bash

export CONTAINER_NAME=sgipd-quarkus-jvm

docker stop $CONTAINER_NAME
docker rm $CONTAINER_NAME

