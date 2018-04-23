#!/bin/sh
cd $(dirname ${0})

this=$(PWD)

./source.sh

cd ${this}/jekyll

docker-compose up

cd ${this} 
cp -r jekyll/_site/ docs/
