import java.util.ArrayList;
import java.util.Random;

class AThread implements Runnable {
    String name = "default";
    private Random numGenerator = new Random();
    private ArrayList<Double> list = new ArrayList<Double>(100_000);

    AThread(String name) {
        this.name = name;
    }

    public void run() {
        MyEvent event;
        for (int i = 0; i < 100_000; i++) {
            list.add(numGenerator.nextDouble());
            event = new MyEvent();
            event.message = "Allocated : " + name + "[" + i + "]";
            event.commit();
        }
    }
}
