package com.aezin.workshop.benchmark.jmh.concatstring;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Fork(4)
@Measurement(iterations = 20)
@Warmup(iterations = 20)
public class BenchmarkConcatString {

	private static final int TWO_CONCATS = 2;
	private static final int THREE_CONCATS = 3;
	private static final int FOUR_CONCATS = 4;
	private static final int LONG_CONCATS = 50;

	//
	// TWO CONCATS
	//
	
	@Benchmark
	public String testTwoConcatStringsWithPlus() {
		return ConcatString.concatStringsWithPlus(TWO_CONCATS);
	}

	@Benchmark
	public String testTwoConcatStringsWithConcat() {
		return ConcatString.concatStringsWithConcat(TWO_CONCATS);
	}

	@Benchmark
	public String testTwoConcatStringsWithStringBuilder() {
		return ConcatString.concatStringsWithStringBuilder(TWO_CONCATS);
	}
	
	@Benchmark
	public String testTwoConcatStringsWithStringBuffer() {
		return ConcatString.concatStringsWithStringBuffer(TWO_CONCATS);
	}
	
	//
	// THREE CONCATS
	//
	
	@Benchmark
	public String testThreeConcatStringsWithPlus() {
		return ConcatString.concatStringsWithPlus(THREE_CONCATS);
	}

	@Benchmark
	public String testThreeConcatStringsWithConcat() {
		return ConcatString.concatStringsWithConcat(THREE_CONCATS);
	}

	@Benchmark
	public String testThreeConcatStringsWithStringBuilder() {
		return ConcatString.concatStringsWithStringBuilder(THREE_CONCATS);
	}
	
	@Benchmark
	public String testThreeConcatStringsWithStringBuffer() {
		return ConcatString.concatStringsWithStringBuffer(THREE_CONCATS);
	}
	
	//
	// FOUR CONCATS
	//
	
	@Benchmark
	public String testFourConcatStringsWithPlus() {
		return ConcatString.concatStringsWithPlus(FOUR_CONCATS);
	}

	@Benchmark
	public String testFourConcatStringsWithConcat() {
		return ConcatString.concatStringsWithConcat(FOUR_CONCATS);
	}

	@Benchmark
	public String testFourConcatStringsWithStringBuilder() {
		return ConcatString.concatStringsWithStringBuilder(FOUR_CONCATS);
	}
	
	@Benchmark
	public String testFourConcatStringsWithStringBuffer() {
		return ConcatString.concatStringsWithStringBuffer(FOUR_CONCATS);
	}
	
	//
	// LONG CONCATS
	//
	
	@Benchmark
	public String testLongConcatStringsWithPlus() {
		return ConcatString.concatStringsWithPlus(LONG_CONCATS);
	}

	@Benchmark
	public String testLongConcatStringsWithConcat() {
		return ConcatString.concatStringsWithConcat(LONG_CONCATS);
	}

	@Benchmark
	public String testLongConcatStringsWithStringBuilder() {
		return ConcatString.concatStringsWithStringBuilder(LONG_CONCATS);
	}
	
	@Benchmark
	public String testLongConcatStringsWithStringBuffer() {
		return ConcatString.concatStringsWithStringBuffer(LONG_CONCATS);
	}
	

	/*
     * ============================== HOW TO RUN THIS TEST: ====================================
     *
     * You can run this test:
     *
     * a) Via the command line:
     *    $ mvn clean install
     *    $ java -jar target/benchmarks.jar BenchmarkConcatString -wi 20 -i 20 -f 4
     *    (we requested 20 warmup/measurement iterations, 4 forks. Total time aprox: 40 minutes)
     *
     * b) Via the Java API (main):
     *    (see the JMH homepage for possible caveats when running from IDE:
     *      http://openjdk.java.net/projects/code-tools/jmh/)
     */
	
	public static void main(String[] args) throws Exception {
		
		Options options = new OptionsBuilder()
				.include(".*" + BenchmarkConcatString.class.getSimpleName() + ".*")
				.forks(4)
				.warmupIterations(20)
				.measurementIterations(20)
				.build();
		new Runner(options).run();
		
		/* 
		 =========================================================
		 		 
		 Result:		 
			# Run complete. Total time: 00:43:11

			Benchmark                                                      Mode  Cnt  Score    Error  Units
			BenchmarkConcatString.testFourConcatStringsWithConcat          avgt   80  0,159 ±  0,006  us/op
			BenchmarkConcatString.testFourConcatStringsWithPlus            avgt   80  0,060 ±  0,002  us/op
			BenchmarkConcatString.testFourConcatStringsWithStringBuffer    avgt   80  0,040 ±  0,001  us/op
			BenchmarkConcatString.testFourConcatStringsWithStringBuilder   avgt   80  0,040 ±  0,001  us/op
			BenchmarkConcatString.testLongConcatStringsWithConcat          avgt   80  2,037 ±  0,067  us/op
			BenchmarkConcatString.testLongConcatStringsWithPlus            avgt   80  0,860 ±  0,016  us/op
			BenchmarkConcatString.testLongConcatStringsWithStringBuffer    avgt   80  0,621 ±  0,019  us/op
			BenchmarkConcatString.testLongConcatStringsWithStringBuilder   avgt   80  0,600 ±  0,020  us/op
			BenchmarkConcatString.testThreeConcatStringsWithConcat         avgt   80  0,047 ±  0,002  us/op
			BenchmarkConcatString.testThreeConcatStringsWithPlus           avgt   80  0,035 ±  0,001  us/op
			BenchmarkConcatString.testThreeConcatStringsWithStringBuffer   avgt   80  0,034 ±  0,002  us/op
			BenchmarkConcatString.testThreeConcatStringsWithStringBuilder  avgt   80  0,039 ±  0,003  us/op
			BenchmarkConcatString.testTwoConcatStringsWithConcat           avgt   80  0,030 ±  0,001  us/op
			BenchmarkConcatString.testTwoConcatStringsWithPlus             avgt   80  0,022 ±  0,001  us/op
			BenchmarkConcatString.testTwoConcatStringsWithStringBuffer     avgt   80  0,027 ±  0,001  us/op
			BenchmarkConcatString.testTwoConcatStringsWithStringBuilder    avgt   80  0,026 ±  0,001  us/op

		 
		 Summary:
		 	- 02 concats: String.concat > StringBuffer > StringBuilder > '+'
		 	- 03 concats: String.concat > StringBuilder > '+' > StringBuffer
		 	- 04 concats: String.concat > '+' > StringBuffer/StringBuilder
		 	- 50 concats: String.concat > '+' > StringBuffer > StringBuilder
		 	
		 Conclusion:
		 	- Use '+' for 2 or 3 concat Strings.
		 	- Use 'StringBuilder' for 4 or more concat Strings.
		 	- Do not use 'String.concat'
		 
		 =========================================================
		 */
	}
}
