

import java.util.HashMap;
import java.util.Map;

public class DublicateValueInArray {
	public static void main(String[] args) {
		int ary[]={1,3,4,5,6,1,2,3,8,9};

		Map<Integer, Integer> map = new HashMap<>();
		for (Integer string : ary) {

			if (map.get(string) != null) {
				map.put(string, 1 + map.get(string));
			} else {
				map.put(string, 1);
			}
		}
		map.forEach((k,v)->System.out.println(k+" "+v));
	}
}
