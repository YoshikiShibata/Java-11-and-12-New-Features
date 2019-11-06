public class Outer {
    private int outerInt = 20;

    public class Inner {
        // InnerはouterIntへアクセスできるか
        int innerInt = outerInt; 
    }
}
