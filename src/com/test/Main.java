package com.test;

class A {

	 

    public void print() {

        System.out.println("A Print");

    }

}



class B extends A {



    public void print() {

        System.out.println("B Print");

    }

}



public class Main {



    public static void main(String s[]) {

        

        A a = new A();

        B b = new B();      

        A a1 = new B();

        B b1 = new B();

        b = (B)a;   // Line 5

        b1 = (B)a1;   // Line 6

        

        a.print();

        b.print();

        b1.print();

        

    }

}