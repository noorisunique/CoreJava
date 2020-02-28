package com.design.pattern.decorator;

public class DecoratorPatternTest {
	public static void main(String[] args) {
		Dress sportydress=new SportyDress(new BasicDress());
		sportydress.assemble();
		
		Dress fancydress=new FancyDress(new BasicDress());
		sportydress.assemble();
		
		Dress scasualdress=new CasualDress(new BasicDress());
		sportydress.assemble();
		
		
		Dress sportyFancydress=new SportyDress(new FancyDress(new BasicDress()));
		sportydress.assemble();
		
				
		Dress casualFancydress=new CasualDress(new FancyDress(new BasicDress()));
		sportydress.assemble();
	}
}
