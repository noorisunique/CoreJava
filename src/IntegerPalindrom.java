
public class IntegerPalindrom {

	public static void main(String[] args) {
		int n=121;
		int s=0;
		int r=0;
		while(n>=1){
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		System.out.println(s);
	}

}
