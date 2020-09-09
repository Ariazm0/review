package ThreadDemo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo2 {
    private static int sum = 10;
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < sum; i++) {
            RunnableThread  thread  = new RunnableThread();
            executorService.execute(thread);
        }
    }
}
class RunnableThread implements Runnable {
    private static int Thread_sum = 10;

    @Override
    public void run() {
        for (int i = 0; i < Thread_sum; i++) {
            System.out.println("线程" + Thread.currentThread() + "" + i);
        }
    }
}
