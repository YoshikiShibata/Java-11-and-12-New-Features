#!/bin/bash 

javac --enable-preview --release 13 -Xlint:preview JSONData.java
java --enable-preview JSONData
