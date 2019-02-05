package com.scjp1;

class Hobbit {
	int countGold(int x, int y) {
		return x + y;
	}

}

class Test5 extends Hobbit {

	public static void main(String[] args) {
		Short myGold = 7;
		System.out.println(countGold(myGold, 6));
	}
}
