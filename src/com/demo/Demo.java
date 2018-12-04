package com.demo;

abstract class Computer1 {
	public abstract String getHD();

	public abstract String getRAM();

	public abstract String getCPU();

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getHD() + " " + this.getRAM() + " " + this.getCPU();
	}
}

class PC1 extends Computer1 {

	private String ram;
	private String hdd;
	private String cpu;

	public PC1(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getHD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

}

class Server1 extends Computer1 {
	private String ram;
	private String hdd;
	private String cpu;

	public Server1(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getHD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

}

class ComputerFactory1 {
	public static Computer1 getComputer(String type, String hd, String ram, String cpu) {
		if ("PC".equalsIgnoreCase(type)) {
			return new PC1(ram, hd, cpu);
		} else if ("Server".equalsIgnoreCase(type)) {
			return new Server1(ram, hd, cpu);
		}
		return null;
	}
}

public class Demo {

	public static void main(String[] args) {
		Computer1 c1=ComputerFactory1.getComputer("PC", " 1 tera buye", "4 GB", "Intell");
		Computer1 c2=ComputerFactory1.getComputer("Server", " 2 tera buye", "4 GB", "Intell");
		System.out.println(c1);
		System.out.println(c2);
	}

}
