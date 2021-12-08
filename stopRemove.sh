#!/bin/bash

export CONTAINER_NAME=sgipd-quarkus

docker stop $CONTAINER_NAME
docker rm $CONTAINER_NAME

