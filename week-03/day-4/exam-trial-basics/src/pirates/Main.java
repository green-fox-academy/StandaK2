package pirates;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Ship myShip = new Ship(initializePirates());
        System.out.println(myShip);

        myShip.addPirate(new Pirate("Long John", true, false));
        System.out.println(myShip);

        myShip.prepareForBattle();
        System.out.println(myShip);
    }

    public static List<Pirate> initializePirates() {
        List<Pirate> pirateList = new ArrayList<>();
        pirateList.add(new Pirate("OneEye Jack", true, false));
        pirateList.add(new Pirate("Deaf Jimmy"));
        pirateList.add(new Pirate("Big George"));
        pirateList.add(new Pirate("Small Donald", false, true));
        pirateList.add(new Pirate("Smart Dennis", false, true));
        pirateList.add(new Pirate("Fast Andy"));
        return pirateList;
    }
}
