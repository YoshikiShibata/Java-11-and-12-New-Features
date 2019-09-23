#!/bin/bash 

# Copyright (C) 2019 Yoshiki Shibata. All rights reserved.

rm -f appcds.jar AppCDS.class com/ejavaguru/appcds/*.class myappCDS.lst

javac AppCDS.java com/ejavaguru/appcds/*.java
if [ $? != 0 ]; then
	exit 1
fi

jar cvf appcds.jar com/ejavaguru/appcds/*.class
if [ $? != 0 ]; then
	exit 1
fi

java -Xshare:off -XX:DumpLoadedClassList=myappCDS.lst -cp appcds.jar:. AppCDS
if [ $? != 0 ]; then
	exit 1
fi

echo ""
echo "Search myappCDS.lst file:"
grep -n AppCDS myappCDS.lst
grep -n com/ejavaguru/appcds/ myappCDS.lst
