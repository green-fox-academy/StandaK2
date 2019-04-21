package pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    List<Pirate> pirates;
    private int workForBattle = 5;

    public Ship(List<Pirate> pirates) {
        this.pirates = pirates;
    }

    public void addPirate(Pirate newPirate) {
        if (newPirate.captain && this.hasCaptain()) {
            this.pirates.add(newPirate);
            newPirate.captain = false;
        } else{
            this.pirates.add(newPirate);
        }
    }

    public boolean hasCaptain() {
        for (Pirate pirate : this.pirates) {
            if (pirate.captain) {
                return true;
            }
        }
        return false;
    }

    public List<Pirate> getPoorPirates() {
        List<Pirate> poorPirates = new ArrayList<>();
        for (Pirate pirate : this.pirates) {
            if (pirate.woodenLeg && pirate.amountOfGold < 15) {
                poorPirates.add(pirate);
            }
        }
        return poorPirates;
    }

    public int getGolds() {
        int golds = 0;
        for (Pirate pirate : this.pirates) {
            golds += pirate.amountOfGold;
        }
        return golds;
    }

    public void lastDayOnTheShip() {
        for (Pirate pirate : this.pirates) {
            pirate.party();
        }
    }

    public void prepareForBattle() {
        for (int i = 0; i < this.workForBattle; i++) {
            for (Pirate pirate : this.pirates) {
                pirate.work();
            }
        }
        for (Pirate pirate : this.pirates) {
            pirate.work();
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Pirate pirate : this.pirates) {
            result += ("name: " + pirate.name + ", gold: " + pirate.amountOfGold + ", health: " + pirate.healthPoints +
                    ", captain: " + pirate.captain + ", wooden leg: " + pirate.woodenLeg + "\n");
        }
        return result + "Golds: " + this.getGolds() + "\n" + "Number of poor pirates: " + this.getPoorPirates().size() + "\n";
    }
}

