package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        this.name = "Electric guitar";
        this.numberOfStrings = 6;
    }

    public ElectricGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        this.name = "Electric guitar";
    }

    @Override
    public String sound() {
        return "Twang";
    }
}

