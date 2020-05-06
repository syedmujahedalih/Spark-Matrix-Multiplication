# Matrix Multiplication Using Spark

Code for multiplying two  **1000*1000** randomly generated matrices. This was done as a simple exercise to compare the execution times of standalone Scala implementation, Spark implementation and Breeze implementation. 

## Prerequisites to run the code:
1. I strongly suggest you to use a Linux based environment for working with Scala and Spark.
2. Make sure you have Scala and Spark environment set up on your system. If you don't have it set up, you can refer to this blog post on Medium : https://medium.com/@josemarcialportilla/installing-scala-and-spark-on-ubuntu-5665ee4b62b1
3. In addition to installing Scala and Spark, you need to install `sbt` in order to compile, run and package Scala code. Guide to install `sbt` : https://www.scala-sbt.org/1.x/docs/Installing-sbt-on-Linux.html 
4. Once you have the set up ready, clone or download the repository to your local system.

## Running Standalone Scala Implementation:
1. Navigate into the root folder (ScalaMatMul) of standalone Scala implementation using the terminal.
2. Type `sbt compile` in the terminal and hit `Enter` to compile the code.
3. Once the code compiles successfully, type `sbt run` in the terminal and hit `Enter` to run the code and see the execution times on the terminal.
