import java.lang.Math;

public class Bmi {
    public static void main(String[] args) {
        double massInKg = 80;
        double heightInM = 1.92;

        // Print the Body mass index (BMI) based on these values

        double bmiIndex = massInKg / Math.sqrt(heightInM);

        System.out.println(bmiIndex);


    }
}
