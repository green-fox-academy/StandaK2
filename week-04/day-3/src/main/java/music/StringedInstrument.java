package main.java.music;

public abstract class StringedInstrument extends Instrument {
    int numberOfStrings;

    @Override
    public void play() {
        System.out.println(this.name + " " + this.numberOfStrings + "-stringed instrument that goes" + " " + sound());
    }

    public abstract String sound();

}
