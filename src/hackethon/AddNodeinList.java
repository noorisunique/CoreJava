package hackethon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddNodeinList {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int total=scanner.nextInt();
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<total;i++) {
			list.add(scanner.nextInt());
		}
		System.out.println("jjj");
		int index=scanner.nextInt();
		int data=scanner.nextInt();
		
		list.add(index, data);
		System.out.println(list);
		int deletedData=scanner.nextInt();
		list.remove(deletedData);
		System.out.println(list);
		
	}
}
