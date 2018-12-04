
public class StringPalindrom {

	public static void main(String[] args) {
		String word="MADAM";
		String n="";
		for(int i=word.length()-1;i>=0;i--){
			n=word.charAt(i)+n;
		}
		
		//System.out.println(n);
		if(word.equals(n)){
			System.out.println("Same");
		}

	}

}
