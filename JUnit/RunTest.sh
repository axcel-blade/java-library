#!/bin/sh
#####################################################################
# Author - Srikanth Fernando                                        #
# Title - Run Test                                                  #
# Description - To do unit test using JUnit java in command line    #
# Created - 30/08/2024                                              #
# Last Modified - 30/08/2024                                        #
#####################################################################

echo "Enter JUnit java code name: "
readonly javaFileName

#javac -cp "<Path to JUnit jar + Selenium Server jar + Selenium Java jar>;." FileName.java
javac -cp "junit-4.13.1.jar;selenium-server-4.0.0-alpha-6.jar;selenium-java-4.0.0-alpha-6.jar;." $javaFileName".java"


#java -cp "<Path to JUnit jar + Selenium Server jar + Selenium Java jar + hamcrest jar>;." org.junit.runner.JUnitCore FileName
java -cp "junit-4.13.1.jar;selenium-server-4.0.0-alpha-6.jar;selenium-java-4.0.0-alpha-6.jar;." org.junit.runner.JUnitCore $javaFileName

echo "Test Complete!"