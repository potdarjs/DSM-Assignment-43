// Databricks notebook source
// DBTITLE 1,Task 2
//
/*
Given a list of strings - List[String] (“alpha”, “gamma”, “omega”, “zeta”, “beta”)
  - find count of all strings with length 4
  - convert the list of string to a list of integers, where each string is mapped to its corresponding length
  - find count of all strings which contain alphabet ‘m’
  - find the count of all strings which start with the alphabet ‘a’
*/

// COMMAND ----------

// DBTITLE 0,Create List
// Creat List
val list = List("alpha", "gamma", "omega", "zeta", "beta")

// COMMAND ----------

// find count of all strings with length 4
list.count(_.length == 4)

// COMMAND ----------

// convert the list of string to a list of integers, where each string is mapped to its corresponding length
list.map(s => (s.length))

// COMMAND ----------

// - find count of all strings which contain alphabet ‘m’ 
list.map(s => s.count(_ == 'm')).count(s => s != 0)

// COMMAND ----------

// - find the count of all strings which start with the alphabet ‘a’
list.map(s => s(0) == 'a').count(s => s == true)

// COMMAND ----------

// DBTITLE 1,Task 3
def gcd(a: Int, b: Int): Int = if (b == 0) a.abs else gcd(b, a % b)

// COMMAND ----------

gcd(10,100)

// COMMAND ----------

gcd(12,100)
