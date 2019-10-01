import java.util.function.BiFunction;

/*
The code won't compile with Java 12. Lambda leftovers is in works at Oracle.
 */

public class Example {
    BiFunction<Integer, String, Boolean> calc = (age, _) -> age > 10;
}
