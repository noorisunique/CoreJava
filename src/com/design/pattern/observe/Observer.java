package com.design.pattern.observe;

public interface Observer {

	void update();

	void subscribeChannel(Subject ch);

}