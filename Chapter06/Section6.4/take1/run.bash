#!/bin/bash

javac EpMap.java
java -XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC -Xlog:gc* -Xmx40M EpMap
