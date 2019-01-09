package com.association;

/*
https://stackoverflow.com/questions/2399544/difference-between-inheritance-and-composition
Composition means HAS A
Inheritance means IS A
Ex:Car has a Engine and Car is a Automobile
*/
class Engine3 {
} // The Engine class.

class Automobile {
} // Automobile class which is parent to Car class.

class Car3 extends Automobile { // Car is an Automobile, so Car class extends
								// Automobile class.
	private Engine3 engine; // Car has an Engine so, Car class has an instance
							// of Engine class as its member.
}

public class CompositionAndInheritance {

}
