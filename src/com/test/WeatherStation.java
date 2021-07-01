package com.test;
interface IObservable 
public class WeatherStation implements IObservable {

	 

    int temp = 0;



    @Override

    public void add(IObservor o) {

        observorsList.add(o);

    }



    @Override

    public void delete(IObservor o) {

        observorsList.remove(o);

    }



    @Override

    public void notify() {

        for (IObservor o : observorsList) {

            o.update();

        }

    }



    public int getTemp() {

        return temp;

    }



    public void setTemp(int temp) {

        this.temp = temp;

        this.notify();

    }



}



 class PhoneDisplay implements IDisplayObservor {



    public WeatherStation x;



    public PhoneDisplay(WeatherStation o) {

        this.x = o;

    }



    @Override

    public void update() {

        int temp = x.getTemp();

        System.out.println("Updated Phone Display : " + temp);

    }





}



 class WindowDisplay implements IDisplayObservor {



    public WeatherStation x;



    public WindowDisplay(WeatherStation o) {

        this.x = o;

    }



    @Override

    public void update() {

        int temp = x.getTemp();

        System.out.println("Updated Window Display : " + temp);

    }



}