package igtsolutions.com;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	Integer id;

	Test(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id.toString();
	}

	@Override
	public int hashCode() {
		int result = 1;
		result = 31 + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public boolean equals(Test obj) {
		// TODO Auto-generated method stub
		return this.id.equals(((Test) obj).id);
	}

	public static void main(String[] args) {
		Set s = new TreeSet();
		Test t1 = new Test(1);
		Test t3 = new Test(2);

		s.add(t1);
		s.add(t3);

		System.out.println(s.size());
		Iterator it = s.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}
