/**
 * @author  Mala Gupta
 */

class Marathon {
    public static void main(String[] args) {
        var aRunner = new Child();          // Inferred type is Child
        start(aRunner);                     // ok to pass it to method start
                                            // (param - MarathonRunner)
    }

    public static void start(MarathonRunner runner) {
        runner.run();
    }
}
