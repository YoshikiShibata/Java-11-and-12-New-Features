#!/bin/bash 

# Copyright (C) 2019 Yoshiki Shibata. All rights reserved.

rm -f appcds.jar \
		AppCDS.class \
		com/ejavaguru/appcds/*.class \
		myappCDS.lst \
		appCDS.jsa

javac AppCDS.java com/ejavaguru/appcds/*.java
if [ $? != 0 ]; then
	exit 1
fi

jar cvf appcds.jar com/ejavaguru/appcds/*.class AppCDS.class
if [ $? != 0 ]; then
	exit 1
fi

java -XX:ArchiveClassesAtExit=appCDS.jsa -cp appcds.jar AppCDS
if [ $? != 0 ]; then
	exit 1
fi

java -Xshare:on -XX:SharedArchiveFile=appCDS.jsa -cp appcds.jar AppCDS

