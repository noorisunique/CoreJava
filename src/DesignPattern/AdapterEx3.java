package DesignPattern;

import java.util.Random;

//https://www.youtube.com/watch?v=qG286LQM6BU
interface EnemyAttracker {
	void fireWeapon();

	void driveForward();

	void assignDriver(String name);
}

class EnemyTank implements EnemyAttracker {

	Random rand = new Random();

	@Override
	public void fireWeapon() {
		int attackDamage = rand.nextInt(10) + 1;
		System.out.println("Enemy Tank does" + attackDamage + " Damage");

	}

	@Override
	public void driveForward() {
		int movement = rand.nextInt(5) + 1;
		System.out.println("Enemy Tank moves" + movement + " space");

	}

	@Override
	public void assignDriver(String name) {
		System.out.println(name + " is driving tank");

	}

}

class EnemyRobotAdapter implements EnemyAttracker {
	EnemyRobot theRobot;

	EnemyRobotAdapter(EnemyRobot theRobot) {
		this.theRobot = theRobot;
	}

	@Override
	public void fireWeapon() {
		theRobot.smashWithHand();

	}

	@Override
	public void driveForward() {
		theRobot.walkForward();

	}

	@Override
	public void assignDriver(String name) {
		theRobot.reactToHuman(name);

	}

}

class EnemyRobot {
	Random rand = new Random();

	public void smashWithHand() {
		int attackDamage = rand.nextInt(10) + 1;
		System.out.println("Enemy Robot Causes does " + attackDamage + " Damag with Its hand ");
	}

	public void walkForward() {
		int movement = rand.nextInt(5) + 1;
		System.out.println("Enemy Robot walks forward " + movement + " space");
	}

	public void reactToHuman(String name) {
		System.out.println("Enemy Robot Trams on " + name);

	}
}

public class AdapterEx3 {

	public static void main(String[] args) {
		EnemyTank rx7Tank = new EnemyTank();
		EnemyRobot fredTheRobot = new EnemyRobot();
		EnemyAttracker robotAdapter = new EnemyRobotAdapter(fredTheRobot);
		System.out.println("the Robot");

		fredTheRobot.reactToHuman("Paul");
		fredTheRobot.walkForward();
		fredTheRobot.smashWithHand();

		System.out.println("The enemy Tank");
		rx7Tank.fireWeapon();
		rx7Tank.driveForward();
		rx7Tank.assignDriver("Frank");

		System.out.println("The Robot with Adapter");
		
		robotAdapter.assignDriver("Mark");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
		
	}
}
