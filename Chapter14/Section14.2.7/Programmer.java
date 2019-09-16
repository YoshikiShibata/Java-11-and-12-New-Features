record Programmer(String name, int age, String programmingLang)
    implements Organizer, Speaker { // 複数のインタフェースを実装
    public void conferenceTalk() {  // Speakerインタフェースから
        // ... コード               // 抽象メソッドを実装
    }
}
