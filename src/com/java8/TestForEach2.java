package com.java8;

import java.util.Collections;
import java.util.*;

//Serif@123
public class TestForEach2 {
	private Set<Client> requests = Collections.synchronizedSet(new HashSet<>());

	public void reset() {
		requests.add(new Client());
		requests.add(new Client());
		requests.add(new Client());
		requests.add(new Client());

		Client request = null;
		synchronized (requests) {
			requests.stream().filter(r -> r.ping() == true).forEach(x -> x.execute());

		}

	}

	private class Client {
		public void execute() {
			System.out.println("Dispose");
		}

		public boolean ping() {
			return true;
		}
	}

	public static void main(String[] args) {

		TestForEach2 t = new TestForEach2();
		t.reset();
	}

}
