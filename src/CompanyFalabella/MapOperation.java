package CompanyFalabella;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapOperation {

	public static void main(String[] args) throws InterruptedException {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("a", 1);

		Collections.unmodifiableMap(map);
		map.put("b", 2);

		System.out.println(map);
	}

}
