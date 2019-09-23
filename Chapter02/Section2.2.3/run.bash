#/bin/bash

# Copyright (C) 2019 Yoshiki Shibata. All rights reserved.

rm -f *.log *.log.*

javac ConquerWorld.java
if [ $? != 0 ]; then
	exit 1
fi

java -Xlog:class+load:file=myCDSlog.log ConquerWorld
if [ $? != 0 ]; then
	exit 1
fi

java -Xshare:off -Xlog:class+load:file=myCDSshareoff.log ConquerWorld

echo ""
echo "Share On (Auto)"
tail -n 1 myCDSlog.log

echo ""
echo "Share Off"
tail -n 1 myCDSshareoff.log
