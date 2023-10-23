#!/bin/bash

rm -rf dist
mkdir dist
mvn clean install -DskipTests
mv ./hawkbit-runtime/hawkbit-update-server/target/hawkbit-update-server-0.3.0-SNAPSHOT.jar dist/hawkbit-update-server.jar
