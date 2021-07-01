package com.generics.add;

class GenericsArithmetic<T> {
    private T number1, number2,sum,product,difference;

    public void AddNumbers(T number1, T number2){
        this.number1 = number1;
        this.number2 = number2;     
    }

    public T getSum(){
    	if (number1.getClass() == Integer.class) {
    	 sum = (T)(Integer) ((Integer) number1 + (Integer) number2);
    	}
        return sum;
    }

    public void MultNumbers (T number1, T number2){
        this.number1 = number1;
        this.number2 = number2;
//      product = number1 + number2;
    }

    public T getProd (){
        return product;
    }

    public void subtractNumbers (T number1, T number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public T getDifference(){
        return difference;
    }

}

class DemoGenericsArithmetic {
    public static void main(String[] args) {
        GenericsArithmetic<Integer> integerNumbers = new GenericsArithmetic<>();
        integerNumbers.AddNumbers(100, 100);
        System.out.println("The addition of two numbers is: "+integerNumbers.getSum());
    }
}