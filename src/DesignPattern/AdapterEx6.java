package DesignPattern;
//https://www.youtube.com/watch?v=NwaabHqPHeM
interface ITarget {
	void request();
}

class Adapter implements ITarget {

	private Adaptee adaptee;

	Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		adaptee.specifiRequest();

	}

}

class Adaptee {
	public void specifiRequest() {
		System.out.println("specifiRequest");
	}
}

public class AdapterEx6 {

	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		ITarget itTarget = new Adapter(adaptee);
		itTarget.request();
	}

}
