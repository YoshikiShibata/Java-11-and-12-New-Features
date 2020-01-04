import java.util.ArrayList;
import java.util.Random;

class AThread implements Runnable {
    String name = "default";
	static final int LIST_SIZE = 10_000;

    private Random numGenerator = new Random();
    private ArrayList<Double> list = new ArrayList<>(LIST_SIZE);

    AThread(String name) {
        this.name = name;
    }
    public void run() {
        for (int i = 0; i < LIST_SIZE; i++) {
            list.add(numGenerator.nextDouble());
            System.out.println("Allocated : " + name + "[" + i + "]");
        }
    }
}
