class Test1 {
    public static void main(String args[]) {
        var large = Size.LARGE;
        
        // コンパイルされない。
        // enum定数が代入されている変数の型は、Measurement
        System.out.println(large.getMeasurement().getLength()); 
    }
}
