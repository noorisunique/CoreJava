package morgan.standly;

public class Test9 {

	public static void main(String[] args) {
		dnbyone(2);

	}
	
	public static void dnbyone(int a){
		if(a>=0){
			dnbyone(a-1);
		}
		System.out.println(a);
	}
}
