package com.design.pattern.observe;

public interface Subject {

	void subscribe(Subscriber sub);

	void unSubscribe(Observer sub);

	void notifyAllSubscriber();

	void upload(String title);

}