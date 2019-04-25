package reservations;

import java.util.Random;

public class Reservation implements Reservationy{

    private String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String[] dow = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    Random random = new Random();

    @Override
    public String getDowBooking() {
        return dow[(int)(Math.random()*7)];
    }

    @Override
    public String getCodeBooking() {
        String codeBooking = "";
        for (int i = 0; i < 8; i++) {
            codeBooking += alphabet.charAt(random.nextInt(alphabet.length()));
        }
        return codeBooking;
    }
}
