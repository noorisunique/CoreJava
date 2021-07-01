import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exmple {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		List<Integer> newlist = list.stream().map(x -> x * 2).collect(Collectors.toList());
		System.out.println(newlist);

		System.out.println(list.stream().reduce(1, (a, b) -> a * b));

		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> l2 = Arrays.asList(11, 12, 13, 14, 15);
		List<Integer> l3 = Arrays.asList(21, 22, 23, 24, 25);

		List<List<Integer>> flatlist = Arrays.asList(l1, l2, l3);

		List<Integer> flettening = flatlist.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println(flettening);

	}
}
