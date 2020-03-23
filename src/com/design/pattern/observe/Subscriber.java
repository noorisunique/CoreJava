package com.design.pattern.observe;

public class Subscriber implements Observer {
	private String name;
	private Subject channel = new Channel();

	Subscriber(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see com.design.pattern.observe.Observe#update()
	 */
	@Override
	public void update() {
		System.out.println("Hey " + name + " Video uploaded");
	}

	/* (non-Javadoc)
	 * @see com.design.pattern.observe.Observe#subscribeChannel(com.design.pattern.observe.Subject)
	 */
	@Override
	public void subscribeChannel(Subject ch) {
		channel = ch;
	}
}
