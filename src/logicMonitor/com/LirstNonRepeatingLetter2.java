package logicMonitor.com;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LirstNonRepeatingLetter2 {
	public static char findFirstNonRepChar(String string) {
	    Map<Integer,Long> characters = string.chars().boxed()
	            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
	    return (char)(int)characters.entrySet().stream()
	            .filter(e -> e.getValue() == 1L)
	            .findFirst()
	            .map(Map.Entry::getKey)
	            .orElseThrow(() -> new RuntimeException("No unrepeated character"));
	}

	public static String firstNonRepeatingLetter(String str) {
		
		char ch=findFirstNonRepChar(str);
		
		return Character.toString(ch);
	}

	public static void main(String[] args) {
		System.out.println(firstNonRepeatingLetter("jsdjshdjsdjs"));

	}

}
