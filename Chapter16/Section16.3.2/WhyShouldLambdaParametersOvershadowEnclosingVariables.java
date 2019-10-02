import java.util.List;

/*
The code won't compile with Java 13. Lambda leftovers is in works at Oracle.
 */

public class WhyShouldLambdaParametersOvershadowEnclosingVariables {
    static void process() {
        List<String> talks = List.of("Kubernetes", "Docker", "Java 11");
        String key = "Docker"; // local variable key
        talks.stream()
                .map(key -> key.toUpperCase())         // WON'T compile : 'key' redefined
                .forEach(System.out::println);
    }

	public static void main(String[] args) {
		process();
	}
}
