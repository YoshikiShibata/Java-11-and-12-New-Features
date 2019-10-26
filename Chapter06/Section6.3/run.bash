#!/bin/bash

javac HelloEpsilonGC.java
java -Xlog:gc* -XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC HelloEpsilonGC
