package com.design.pattern.observe;


public class Youtube {
	public static void main(String[] args) {
		Subject telusko = new Channel();

		Subscriber s1 = new Subscriber("Noor1");
		Subscriber s2 = new Subscriber("Noor2");
		Subscriber s3 = new Subscriber("Noor3");
		Subscriber s4 = new Subscriber("Noor4");
		Subscriber s5 = new Subscriber("Noor5");

		telusko.subscribe(s1);
		telusko.subscribe(s2);
		telusko.subscribe(s3);
		telusko.subscribe(s4);
		telusko.subscribe(s5);

		telusko.unSubscribe(s2);
		s1.subscribeChannel(telusko);
		s2.subscribeChannel(telusko);
		s3.subscribeChannel(telusko);
		s4.subscribeChannel(telusko);
		s5.subscribeChannel(telusko);

		telusko.upload("How to learn Java");

	}
}
