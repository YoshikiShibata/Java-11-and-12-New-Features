enum Size <T extends Measurement> { // 型パラメータを持つenum
    SMALL<Small>(new Small()),
    MEDIUM<Medium>(new Medium()),
    LARGE<Large>(new Large());

    private T mObj;

    Size(T obj) {
        mObj = obj;
    }
    T getMeasurement() {
        return mObj;
    }

    public static void main(String[] args) {
        var large = Size.LARGE;
        System.out.println(large.getMeasurement().getLength());
    }
}

class Measurement {}
class Small extends Measurement {
    String text = "Small";
}
class Medium extends Measurement {}
class Large extends Measurement {
    public int getLength() {
        return 40;
    }
}
