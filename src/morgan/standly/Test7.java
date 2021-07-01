package morgan.standly;

import java.util.HashSet;
import java.util.Set;

class keyMaster {
	public int i;

	public keyMaster(int i) {
		this.i = i;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return i == ((keyMaster) obj).i;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return i;
	}
}

public class Test7 {

	public static void main(String[] args) {
		Set<keyMaster> set=new HashSet<>();
		keyMaster k1=new keyMaster(1);
		keyMaster k2=new keyMaster(2);
		
		set.add(k1);
		set.add(k1);
		set.add(k2);
		set.add(k2);
		System.out.println(set.size()+":");
		k2.i=1;
		System.out.println(set.size()+":");
		set.remove(k1);
		System.out.println(set.size()+":");
		set.remove(k2);
		System.out.println(set.size()+":");
		
	}
}
