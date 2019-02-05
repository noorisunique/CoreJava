package com.scjp1;

class Electronic implements Device {
	public void dolt() {
	}
}

abstract class Phone extends Electronic {
}

abstract class Phone2 extends Electronic {
	public void dolt() {
	}
}

class Phone3 extends Electronic implements Device {
	public void dolt() {
	}
}

abstract class Phone4 implements Device {

}

interface Device {
	public void dolt();
}

public class Test3 {

}
