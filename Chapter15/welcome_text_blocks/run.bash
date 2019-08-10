#!/bin/bash -x

javac --enable-preview --release 13 -Xlint:preview WelcomeTextBlocks.java
cd ..
java --enable-preview welcome_text_blocks.WelcomeTextBlocks
