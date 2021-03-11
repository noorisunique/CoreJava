

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DublicateValueInArray {
	public static void main(String[] args) {
		//int ary[]={1,3,4,5,6,1,2,3,8,9};
		List<Integer> ary=Arrays.asList(1,2,3,4,4);
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer string : ary) {

			if (map.get(string) != null) {
				map.put(string, 1 + map.get(string));
			} else {
				map.put(string, 1);
			}
		}
		for (Entry<Integer, Integer> e : map.entrySet()) { 
            if (e.getValue() > 1) { 
                System.out.print(e.getKey() + " "); 
            } 
        } 
		//map.forEach((k,v)->System.out.println(k+" "+v));
	}
}
