#!/bin/bash

javac AThread.java ReadFRData.java MyEvent.java  WithCustomEvents.java
if [ $? != 0 ];
then
	exit 1
fi
java -XX:+UnlockExperimentalVMOptions \
     -XX:StartFlightRecording,filename=CustomeEvents.jfr \
     WithCustomEvents
