package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        this.name = "Bass guitar";
        this.numberOfStrings = 4;

    }

    public BassGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        this.name = "Bass guitar";

    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }
}
