import java.awt.Color;

class GarmentFactory {
    void createShirts() {
        Shirt redShirtS = new Shirt(Size.SMALL, Color.red);
        Shirt greenShirtM = new Shirt(Size.MEDIUM, Color.green);
        Shirt redShirtL = new Shirt(Size.LARGE, Color.red);
    }
}
