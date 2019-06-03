package com.greenfoxacademy.springstart.models;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

    ///private String content;
    public static AtomicLong id = new AtomicLong();
    private String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Neitring Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    public Greeting() {
        this.id.getAndIncrement();
        //this.content = getRandomHello();
    }

    public AtomicLong getId() {
        return id;
    }

    public String getRandomHello(){
        return this.hellos[getRandomNumber(0, this.hellos.length)];
        }

    private static int getRandomNumber(int lowerInt, int upperInt){
        return (int)(Math.random()*(upperInt - lowerInt)) + lowerInt;
    }
    public String getRandomStyle(){

        String styleText = "color:rgb(" + getRandomNumber(0,256) + ", " + getRandomNumber(0,256) + ", " +
                getRandomNumber(0,256) + ");font-size:" + getRandomNumber(10,70) + "px;";
        return styleText;
    }
}
