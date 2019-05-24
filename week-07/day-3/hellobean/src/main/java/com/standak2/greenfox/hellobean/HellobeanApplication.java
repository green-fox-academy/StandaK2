package com.standak2.greenfox.hellobean;

import com.standak2.greenfox.hellobean.services.printer.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanApplication implements CommandLineRunner {

    private MyColor colorBlue;
    private MyColor colorRed;
    private MyColor colorGreen;

    @Autowired
    public HellobeanApplication(@Qualifier("blue") MyColor colorBlue,
                                @Qualifier("red") MyColor colorRed,
                                @Qualifier("green") MyColor colorGreen) {
        this.colorBlue = colorBlue;
        this.colorGreen = colorGreen;
        this.colorRed = colorRed;
    }

    public static void main(String[] args) {
        SpringApplication.run(HellobeanApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        colorRed.printColor();
        colorBlue.printColor();
        colorGreen.printColor();
    }
}
