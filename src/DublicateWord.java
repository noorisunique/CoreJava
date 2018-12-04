

import java.util.HashMap;
import java.util.Map;

public class DublicateWord {
	public static void main(String[] args) {
		String name = "AA BB BB CC";
		String[] words = name.split(" ");

		Map<String, Integer> map = new HashMap<>();
		for (String string : words) {

			if (map.get(string) != null) {
				map.put(string, 1 + map.get(string));
			} else {
				map.put(string, 1);
			}
		}
		map.forEach((k,v)->System.out.println(k+" "+v));
	}
}
