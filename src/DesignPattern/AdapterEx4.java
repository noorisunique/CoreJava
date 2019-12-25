package DesignPattern;
//https://www.youtube.com/watch?v=Y7DYhe6efQY

interface Pen {
	void write(String str);
}

class AssignmentWork {
	private Pen p;

	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}

	public void writeAssignment(String str) {
		p.write(str);
	}
}

// i will get only .class
class PilotPen {
	public void mark(String str) {
		System.out.println(str);
	}
}

class PenAddapter implements Pen {

	PilotPen pp = new PilotPen();// Composition

	@Override
	public void write(String str) {
		pp.mark(str);
	}

}

public class AdapterEx4 {

	public static void main(String[] args) {

		Pen p = new PenAddapter();
		AssignmentWork aw = new AssignmentWork();

		aw.setP(p);
		aw.writeAssignment("I am bit tired to write assignment");
	}
}
