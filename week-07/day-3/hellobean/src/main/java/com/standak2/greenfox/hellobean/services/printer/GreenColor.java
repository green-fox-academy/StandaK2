package com.standak2.greenfox.hellobean.services.printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("green")
public class GreenColor implements MyColor {

    @Autowired
    Printer printer;

    @Override
    public void printColor() {
        printer.log("It is green in color...");
    }
}
