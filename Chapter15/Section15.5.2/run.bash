#!/bin/bash 

javac --enable-preview --release 13 -Xlint:preview XMLData.java
java --enable-preview XMLData
