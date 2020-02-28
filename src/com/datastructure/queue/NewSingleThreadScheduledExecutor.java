package com.datastructure.queue;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
//https://www.codejava.net/java-core/concurrency/java-concurrency-scheduling-tasks-to-execute-after-a-given-delay-or-periodically

public class NewSingleThreadScheduledExecutor {

	public static void main(String[] args) {
		NewSingleThreadScheduledExecutor demo = new NewSingleThreadScheduledExecutor();
		demo.newSingleThreadScheduledExecutor();
	}

	public void newSingleThreadScheduledExecutor() {
		ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

		Runnable task = () -> {
			System.out.println("Executing the task1 at:" + new Date());
		};

		// scheduledExecutorService.scheduleAtFixedRate(task, 0, 2,
		// TimeUnit.SECONDS);
		scheduledExecutorService.schedule(task, 2, TimeUnit.SECONDS);
		scheduledExecutorService.shutdown();
		//scheduledExecutorService.scheduleWithFixedDelay(task, 0, 2, TimeUnit.SECONDS);
		System.out.println("Thread main finished");
	}

}
