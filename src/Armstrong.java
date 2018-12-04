
public class Armstrong {

	public static void main(String[] args) {
		int n=5;
		int s=0;
		int r=0;
		while(n>=1){
			r=n%10;
			s=s+r*r*r;
			n=n/10;
		}
		System.out.println(s);
	}

}
