import jdk.jfr.Event;
import jdk.jfr.Label;

class MyEvent extends Event {
    @Label("EventMessage")
    String message;
}
