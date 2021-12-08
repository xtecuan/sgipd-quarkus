#!/bin/bash

export CONTAINER_NAME=sigobsol-documents-loader

docker stop $CONTAINER_NAME
docker rm $CONTAINER_NAME

