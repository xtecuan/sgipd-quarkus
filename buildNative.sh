#!/bin/bash

./mvnw clean package -Pnative -Dquarkus.native.container-build=true
