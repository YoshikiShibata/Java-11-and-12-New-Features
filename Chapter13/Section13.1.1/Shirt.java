import java.awt.Color;

class Shirt {
    Size size; // Size型のインスタンス変数
    Color color;
    
    // SizeオブジェクトでShirtのインスタンス化
    Shirt(Size size, Color color) { 
        this.size = size;
        this.color = color;
    }
}
