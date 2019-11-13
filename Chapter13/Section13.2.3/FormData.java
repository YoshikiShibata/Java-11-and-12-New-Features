public class FormData {
    public <T> void add(Data<T> type, T value) {
        // ... コード
    }

    public static void main(String[] args) {
        FormData data = new FormData();
        data.add(Data.NAME, "Pavni");         // OK：NAMEと"Pavni"は文字列
        data.add(Data.AGE, 22);               // OK；AGEと22の型はInteger
        data.add(Data.ADDRESS, "California"); // コンパイルされない。
                                              // "California"はStringで
                                              // Addressインスタンスではない
    }
}
