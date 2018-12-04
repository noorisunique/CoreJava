
public class PrimeExample {
	public static void main(String args[]) {
		int n=25,flag=0;
		if(n==0 || n==1){
			System.out.println(n+" is not prime");
		}else{
			for(int i=2;i<=n/2;i++){
				if(n%2==0){
					System.out.println(n+" is not prime");
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println(n+" is prime");
			}
		}
	}
}