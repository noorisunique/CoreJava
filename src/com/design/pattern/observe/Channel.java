package com.design.pattern.observe;

import java.util.ArrayList;
import java.util.List;


public class Channel implements Subject {
	private List<Subscriber> subs = new ArrayList<>();
	private String title;

	/* (non-Javadoc)
	 * @see com.design.pattern.observe.Subject#subscribe(com.design.pattern.observe.Subscriber)
	 */
	@Override
	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}

	/* (non-Javadoc)
	 * @see com.design.pattern.observe.Subject#unSubscribe(com.design.pattern.observe.Subscriber)
	 */
	@Override
	public void unSubscribe(Observer sub) {
		subs.remove(sub);
	}

	/* (non-Javadoc)
	 * @see com.design.pattern.observe.Subject#notifyAllSubscriber()
	 */
	@Override
	public void notifyAllSubscriber() {
		for (Observer subscriber : subs) {
			subscriber.update();
		}
	}

	/* (non-Javadoc)
	 * @see com.design.pattern.observe.Subject#upload(java.lang.String)
	 */
	@Override
	public void upload(String title) {
		this.title = title;
		notifyAllSubscriber();
	}
}
