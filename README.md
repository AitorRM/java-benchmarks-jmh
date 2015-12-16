#Microbenchmark JMH

Maven project for Java benchmarking with OpenJDK JMH library.

- String concat: compare performance of String.concat vs StringBuffer vs StringBuilder vs '+' operator
  - Conclusion:
    - Use '+' for 2 or 3 concat Strings.
    - Use 'StringBuilder' for 4 or more concat Strings.
    - Do not use 'String.concat'
