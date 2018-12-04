package scjp;

public class Test6 {

	public static void main(String[] args) {
		 final char a = 'A', d = 'D';
		  char grade = 'B';
		  switch(grade) {
		  case a :
		  case 'B' :
		  System.out.print("great");
		  case 'C' :
		  System.out.print("passed");
		  break;
		  case d :
		  case 'F' :
		  System.out.print("not good");
		  } 
	}
}
