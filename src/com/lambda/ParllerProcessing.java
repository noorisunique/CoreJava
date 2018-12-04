package com.lambda;

import java.util.stream.Stream;

public class ParllerProcessing {
	public static void main(String[] args) {
		Stream<String> list = Stream.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13");
		//list.forEach(x->System.out.println(x)); 	Serial Processing order
		
		list.parallel()
		.forEach(x->System.out.println(x));		//	Parallel Processing  no order
	}
}
