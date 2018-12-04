
public class ArrayThreeOrFour {
	public static void main(String[] args) {
		int aar[] = { 'a', 'b', 'c', 'd', 'e', 'g', 'h', 'i', 1, 5, 8, 6, 7 ,90,11,22,33,44};
		int i =0;
		int temp=3;
		while(i<aar.length-1) {
			if(temp==3){
				i = i+2;
				System.out.println(aar[i]);
				temp=4;
			}
			else{
				i = i+3;
				temp=3;
				System.out.println(aar[i]);
			}
			i++;
		}
	}
}


//c h 5 