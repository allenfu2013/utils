package org.allen.sample.future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureTest1 {
    public static class Task implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.submit(new Task());
        }
        if (!executorService.isShutdown()) {
            executorService.shutdown();
        }
    }
}
