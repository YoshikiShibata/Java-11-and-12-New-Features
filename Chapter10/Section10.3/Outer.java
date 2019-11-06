public class Outer {
    private int outerInt = 20;

    public class Inner {
        // InnerはouterIntへアクセスできるか
        int innerInt = outerInt; 
    }

	public static void main(String[] args) {
	    // Java 11 or later	
        for (Class<?> c: Outer.class.getNestMembers()) {
	        System.out.println(c);
        }
	}
}
