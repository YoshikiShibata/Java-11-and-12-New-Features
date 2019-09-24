#!/bin/bash 

javac --enable-preview --release 13 -Xlint:preview WelcomeTextBlocks.java
java --enable-preview WelcomeTextBlocks
