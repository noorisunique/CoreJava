package com.design.pattern;

//subclasses are responsible to create the instance of the class
//It promotes the loose-coupling
//https://www.javatpoint.com/factory-method-design-pattern
abstract class Plan {
	protected double rate;

	abstract void getRate();

	public void calculateBill(int units) {
		System.out.println(units * rate);
	}
}

class DomesticPlan extends Plan {

	@Override
	void getRate() {
		rate = 3.50;
	}
}

class CommercialPlan extends Plan {

	@Override
	void getRate() {
		rate = 5.50;
	}
}

class InstitutionalPlan extends Plan {

	@Override
	void getRate() {
		rate = 3.40;
	}
}

class GetPlanFactory {

	public Plan getPlan(String planType) {
		if (planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		} else if (planType.equalsIgnoreCase("COMERCIALPLAN")) {
			return new CommercialPlan();
		} else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new InstitutionalPlan();
		}
		return null;
	}
}

public class FactoryMethodPattern {
	public static void main(String[] args) {
		GetPlanFactory factory = new GetPlanFactory();
		Plan p = factory.getPlan("DOMESTICPLAN");
		p.getRate();
		p.calculateBill(10);
	}
}
