package morgan.standly;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class Test8 {

	public static int sum(List<Integer> list){
		int sum=0;
		//for(Iterator iter=list.iterator();iter.hasNext()){
		for (int integer : list) {
			
	
			
			sum+=integer;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		
	}
}
