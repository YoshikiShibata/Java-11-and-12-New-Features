import java.util.function.Predicate;
import java.util.function.Function;

class Championship {
    static boolean reward(Integer lapTime) {
        return(lapTime < 60);
    }
    static boolean reward(String lap) {
        return(lap.equalsIgnoreCase("final "));
    }

	static void someMethod(Predicate<String> p) {
	}

	static void someMethod(Function<String,String> p) {
	}

	public static void main(String[] args) {
			someMethod(Championship::reward);
    }

}
