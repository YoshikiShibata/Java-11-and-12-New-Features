#!/bin/bash 

javac --enable-preview --release 13 -Xlint:preview UseDatabaseQuery.java
java --enable-preview UseDatabaseQuery
