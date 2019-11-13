enum Size {
    SMALL(36, 19),
    MEDIUM(32, 20) {     // 定数固有のクラス本体
        int number = 10; // MEDIUMに固有の変数
        int getSize() {  // MEDIUMに固有のメソッド
            return length + width;
        }
    },
    LARGE(34, 22) {
        @Override
        public String toText() { // 定数LARGE向けに
            return "LARGE";      // toText()メソッドをオーバーライド
        }
    };
    
    int length; // すべてのenum定数からアクセス可能なインスタンス変数
    int width;  // 

    Size(int length, int width) { // enumのコンストラクタ
                                  // lengthとwidthを受け取る
        this.length = length; 
        this.width = width;
    }

    int getLength() { // すべてのenum定数からアクセス可能なメソッド
        return length; 
    }

    int getWidth() { // すべてのenum定数からアクセス可能なメソッド
        return width;  
    }

    public String toText() { // すべてのenum定数からアクセス可能なメソッド
        return length + " X " + width; 
    }

	public static void main(String[] args) {
        System.out.println(Size.SMALL.toText()); // toTextはすべての定数に定義されている
		System.out.println(Size.LARGE.toText());
		System.out.println(Size.MEDIUM.number);    // コンパイルされない
System.out.println(Size.MEDIUM.getSize()); // コンパイルされない
	}
}
