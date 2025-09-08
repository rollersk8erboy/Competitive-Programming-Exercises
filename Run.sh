#!/bin/bash
CLASS=PalindromeChecker
if [ -f "$CLASS.java" ]; then javac "$CLASS.java"; fi
if [ -f "$CLASS.java" ]; then java "$CLASS.java"; fi
if [ -f "$CLASS.class" ]; then rm -rf "$CLASS.class"; fi