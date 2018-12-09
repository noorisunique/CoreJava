package com.association;

class Engine {
	public void work() {
		System.out.println("Engine of car has been started ");
	}
}

final class Car {
	private final Engine engine; // Composition
	private Engine engine1;//Aggregation
	Car(Engine engine) {
		this.engine = engine;
	}

	// car start moving by starting engine
	public void move() {
		{
			engine.work();
			System.out.println("Car is moving ");
		}
	}
}

class Composition2 {
	public static void main(String[] args) {
		Engine engine = new Engine();
		Car car = new Car(engine);
		car.move();
	}
}