enum Size {
    SMALL(36, 19),
    MEDIUM(32, 20),
    LARGE(34, 22);
    int length; // すべてのenum定数がアクセスできるインスタンス変数
    int width;  // 

    Size(int length, int width) { // enumのコンストラクタ
        this.length = length;     // lengthとwidthを受け取る
        this.width = width;
    }
    int getSize() {
        if (this == MEDIUM)
            return length + width;
        else // MEDIUM以外の定数が使ったら実行時例外をスローする
            throw new UnsupportedOperationException(); 
    } 

    public static void main(String[] args) {
        System.out.println(MEDIUM.getSize());
		System.out.println(LARGE.getSize());
    }
}
