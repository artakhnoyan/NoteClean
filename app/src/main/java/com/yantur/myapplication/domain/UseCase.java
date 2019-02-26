package com.yantur.myapplication.domain;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UseCase {
	private static final int THREAD_NUMBER = 4;
	private final ExecutorService executor = Executors.newFixedThreadPool(THREAD_NUMBER);
	private Future future;

	protected void execute(Runnable block) {
		if (future != null) {
			future.cancel(true);
		}
		future = executor.submit(block);
	}
}
