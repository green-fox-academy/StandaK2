//        Create a Pirate2 class. While you can add other fields and methods, you must have these methods:-
//
//        drinkSomeRum() - intoxicates the Pirate2 some
//        howsItGoingMate() - when called, the Pirate2 replies, if drinkSomeRun was called:-
//        0 to 4 times, "Pour me anudder!"
//        else, "Arghh, I'ma Pirate2. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
//        If you manage to get this far, then you can try to do the following.
//
//        die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
//        brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
//        And... if you get that far...
//
//        Add a parrot.

        package pirates2;

public class Pirate2 {
    int drinkCount = 0;
    boolean live;

    public Pirate2(){
    }

    public void drinkSomeRum() {
        if (live) {
            this.drinkCount++;
        } else {
            Pirate2
        }
    }
    public String howsItGoingMate(){
        if (drinkCount > 4){
            return "Pour me anudder!";
        } else{
            return "Arghh, I'ma Pirate2. How d'ya d'ink its goin?";
        }
    }
        public String die(){
        this.live = false;
        return "Pirate2 is dead. RIP."
        }

}
