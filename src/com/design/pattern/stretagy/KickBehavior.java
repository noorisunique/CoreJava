package com.design.pattern.stretagy;

interface KickBehavior {
	public void kick();
}

class LightningKick implements KickBehavior {
	public void kick() {
		System.out.println("Lightning Kick");
	}
}

class TornadoKick implements KickBehavior {
	public void kick() {
		System.out.println("Tornado Kick");
	}
}