#!/bin/sh
cd $(dirname ${0})

this=$(PWD)/..

cd ${this}
./scripts/source.sh

cd ${this}/site
docker-compose -f docker-compose.production.yml up

cd ..
cp -r ./site/_site/ ./docs/

cd ${this}