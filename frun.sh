#!/bin/bash

export CONTAINER_NAME=sgipd-quarkus
export CONTAINER_IMAGE=quarkus/sgipd-quarkus
export CVOLUME=/opt/sigobsol
export SGIPD_HOST="sgipd.mined.gob.sv:192.168.36.157"

docker run --privileged --restart unless-stopped  -d -p 7777:7777 --add-host $SGIPD_HOST  --name=$CONTAINER_NAME $CONTAINER_IMAGE

