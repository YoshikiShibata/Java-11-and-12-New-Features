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
        for (int i = 0; i < 100_000; i++) {
            list.add(numGenerator.nextDouble());
            // System.out.println("Allocated : " + name + "[" + i + "]");
        }
    }
}
