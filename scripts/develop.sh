#!/bin/sh
cd $(dirname ${0})

this=$(PWD)/..

cd ${this}
./scripts/source.sh

cd ${this}/site
docker-compose up

cd ${this}