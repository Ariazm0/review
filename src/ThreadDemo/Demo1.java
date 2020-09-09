package ThreadDemo;

import java.util.concurrent.Callable;

public class Demo1 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int i = 0;
        for (int j = 0; j < 20; j++) {
            i++;
        }
        return i;
    }
}
