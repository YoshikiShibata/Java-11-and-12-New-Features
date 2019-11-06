#!/bin/bash

javac AThread.java TestFlightRecorder.java
if [ $? != 0 ];
then
		exit 1
fi
java -XX:+UnlockExperimentalVMOptions \
     -XX:+UseEpsilonGC \
     -XX:StartFlightRecording,filename=Epsilon.jfr \
     TestFlightRecorder
