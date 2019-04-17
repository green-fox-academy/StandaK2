//Create Sharpie class
//We should know about each sharpie their color (which should be a string), width (which will be a floating point
// number), inkAmount (another floating point number)
//        When creating one, we need to specify the color and the width
//        Every sharpie is created with a default 100 as inkAmount
//        We can use() the sharpie objects
//        which decreases inkAmount

package sharpieset;

public class Sharpie {

    String color;
    Double width;
    Double inkAmount;

    public Sharpie(String color, double width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100.0;
    }

    public Sharpie(String color, double width, double inkAmount) {
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }

    public void use() {
        this.inkAmount *= 0.9;
    }
}
