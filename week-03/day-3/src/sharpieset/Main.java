package sharpieset;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SharpieSet sharpieSet = new SharpieSet(initializeSharpies());
        System.out.println(sharpieSet);
        System.out.println(sharpieSet.countUsable());
        sharpieSet.removeTrash();
        System.out.println(sharpieSet);
    }

    public static List<Sharpie> initializeSharpies() {
        List<Sharpie> sharpielist = new ArrayList<>();
        sharpielist.add(new Sharpie("blue", 1.5));
        sharpielist.add(new Sharpie("green", 0.9, 20));
        sharpielist.add(new Sharpie("black", 2.0, 0));
        sharpielist.add(new Sharpie("red", 0.5, 80));
        sharpielist.add(new Sharpie("black", 0.4, 0));
        sharpielist.add(new Sharpie("blue", 2.0));

        return sharpielist;
    }

}
