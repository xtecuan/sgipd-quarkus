#!/bin/bash

export CONTAINER_NAME=sgipd-quarkus
export CONTAINER_IMAGE=quarkus/sgipd-quarkus
export CVOLUME=/opt/sigobsol
export SGIPD_HOST="sgipd.mined.gob.sv:192.168.36.157"

docker logs -f $CONTAINER_NAME

