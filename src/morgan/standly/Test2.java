package morgan.standly;

class Exce0 extends Exception{}
class Exce1 extends Exce0{}

public class Test2 {

	public static void main(String[] args) {
		try {
			throw new Exce1();
		} catch (Exce0 e) {
			System.out.println("Exce0");
		}catch (Exception e) {
			System.out.println("Exception");
		}

	}

}
