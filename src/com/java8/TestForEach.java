package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.*;
import java.util.Map;

//Serif@123
public class TestForEach {
	private Map<String, Client> clients = Collections.synchronizedMap(new HashMap<>());
	private Set<Request> requests = Collections.synchronizedSet(new HashSet<>());

	public boolean cancel(int id) {
		Request request = null;
		synchronized (requests) {
			request = requests.stream().filter(r -> r.id() == id).findFirst().orElse(null);
		}
		return false;
	}

	synchronized public void reset() {
		synchronized (clients) {
			// each client cancels their own requests
			clients.put("SSs1", new Client());
			clients.put("SSs2", new Client());
			clients.put("SSs3", new Client());

			clients.values().forEach(q -> q.dispose());
			clients.clear();
		}

	}

	private class Client {
		public void dispose() {
			System.out.println("Dispose");
		}
	}

	private class Request {
		int id() {
			return hashCode();
		}
	}

	public static void main(String[] args) {
		// create a list of integers
		List<Integer> number = Arrays.asList(2, 3, 4, 5);
		int even = number.stream().filter(x -> x % 2 == 1).reduce(0, (ans, i) -> ans + i);
		System.out.println(even);

		TestForEach t = new TestForEach();
		t.reset();
	}

}
