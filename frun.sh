#!/bin/bash

export CONTAINER_NAME=sgipd-quarkus
export CONTAINER_IMAGE=quarkus/sgipd-quarkus
export CVOLUME=/opt/sigobsol
export SGIPD_HOST="sgipd.mined.gob.sv:172.17.0.1"
export POD_NET=network-keycloak

docker run --privileged --restart unless-stopped  -d -p 80:7777 --add-host $SGIPD_HOST --net=$POD_NET  --name=$CONTAINER_NAME $CONTAINER_IMAGE

