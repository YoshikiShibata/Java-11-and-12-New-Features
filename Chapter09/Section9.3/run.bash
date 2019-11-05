#!/bin/bash

javac HelloWorld.java
if [ $? != 0 ];
then
		exit 1
fi
java -XX:StartFlightRecording,filename=hello.jfr HelloWorld
