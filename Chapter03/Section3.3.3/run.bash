#!/bin/bash

javac TriggerG1FullGC.java
if [ $? != 0 ];
then
		exit $?
fi
java -Xlog:gc* -Xlog:gc*:myG1log.log TriggerG1FullGC
