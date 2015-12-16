package com.aezin.workshop.benchmark.jmh.concatstring;

public class ConcatString {

    public static String concatStringsWithPlus(int concatIter) {
    	String text = "";
        for (int i = 0; i < concatIter; i++) {
        	text += "*";
        }
        return text;
    }

    public static String concatStringsWithConcat(int concatIter) {
    	String text = "";
        for (int i = 0; i < concatIter; i++) {
        	text = text.concat("*");
        }
        return text;
    }
    
    public static String concatStringsWithStringBuilder(int concatIter) {
    	StringBuilder text = new StringBuilder();
        for (int i = 0; i < concatIter; i++) {
        	text.append("*");
        }
        return text.toString();
    }
    
    public static String concatStringsWithStringBuffer(int concatIter) {
    	StringBuffer text = new StringBuffer();
        for (int i = 0; i < concatIter; i++) {
        	text.append("*");
        }
        return text.toString();
    }

}
