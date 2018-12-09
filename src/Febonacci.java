
public class Febonacci {

	public static void main(String[] args) {
		int n=1;
		int f=1;
		int b=2;
		int c=0;
		System.out.println(f);
		System.out.println(b);
		while(n<=10){
			c=f+b;
			f=b;
			b=c;
			//if(c%2==0)
			System.out.println(c);
			n++;
		}

	}

}
