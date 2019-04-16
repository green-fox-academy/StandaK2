package sharpie;

public class Main {
    public static void main(String[] args) {

        Sharpie inkPen = new Sharpie("green", 0.5);

        System.out.println(inkPen.inkAmount);
        inkPen.use();
        System.out.println(inkPen.inkAmount);
    }
}
