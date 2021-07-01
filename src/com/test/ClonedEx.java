package com.test;

import java.util.*;

 class Employee implements Cloneable {


	 


    private int id;


    private String name;


    private Map<String, String> props;



    

    /// Setters & Getters





    public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public Map<String, String> getProps() {
		return props;
	}





	public void setProps(Map<String, String> props) {
		this.props = props;
	}





	@Override


    public Object clone() throws CloneNotSupportedException {


        return super.clone();


    }





}





public class ClonedEx {





    public static void main(String[] args) throws CloneNotSupportedException {





        Employee emp = new Employee();


        emp.setId(1);


        emp.setName("Pankaj");


        Map<String, String> props = new HashMap<>();


        props.put("salary", "10000");


        props.put("city", "Bangalore");


        emp.setProps(props);


        Employee clonedEmp = (Employee) emp.clone();


        System.out.println("emp and clonedEmp == test: " + (emp == clonedEmp));


        System.out.println("emp and clonedEmp HashMap == test: " + (emp.getProps() == clonedEmp.getProps()));


        emp.getProps().put("title", "CEO");


        emp.getProps().put("city", "New York");


        System.out.println("clonedEmp props:" + clonedEmp.getProps());


        emp.setName("new");


        System.out.println("clonedEmp name:" + clonedEmp.getName());





    }


}