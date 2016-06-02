#Microbenchmark JMH

Maven project for Java benchmarking with OpenJDK JMH library.

- String concat: compare performance of String.concat vs StringBuffer vs StringBuilder vs '+' operator
  - Conclusion:
    - Use '+' for small concatenations up to 4 Strings.
    - Use 'StringBuffer' or 'StringBuilder' for large String concatenations.
    - Do not use 'String.concat'

You can see more details on my blog (in Spanish): http://aitorrm.github.io/c%C3%B3digo%20efectivo/java_microbenchmarking_con_jmh/
