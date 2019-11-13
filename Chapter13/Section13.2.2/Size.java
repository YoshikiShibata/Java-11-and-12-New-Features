class Measurement {}               // 基底クラス
class Small extends Measurement {  // 派生クラス
    String text = "Small";         // Smallクラスに固有の状態
}
class Medium extends Measurement { // 派生クラス
    public int getLength() {       // Mediumクラスに固有の振る舞い
        return 9999;
    }
}
class Large extends Measurement {} // 派生クラス

enum Size {
    SMALL(new Small()),   // Samllインスタンスを持つ定数
    MEDIUM(new Medium()), // Mediumインスタンスを持つ定数
    LARGE(new Large());   // Largeインスタンスを持つ定数

    private Measurement mObj; // Measurementは、Smallクラス、
                              // Mediumクラス、Largeクラスの基底クラス
    
    Size(Measurement obj) { // enumインスタンスに
                            // Measurementインスタンスを保持する
        mObj = obj;
    }
    Measurement getMeasurement() { // 保持しているインスタンスを返す
        return mObj;
    }
}
