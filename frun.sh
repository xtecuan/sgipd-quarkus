#!/bin/bash

export CONTAINER_NAME=sigobsol-documents-loader
export CONTAINER_IMAGE=quarkus/sigobsol-documents-loader
export CVOLUME=/opt/sigobsol

docker run --privileged --restart unless-stopped  -d -p 7777:7777 -v $CVOLUME:$CVOLUME  --name=$CONTAINER_NAME $CONTAINER_IMAGE

