package com.greenfox.standak2.demo.models.arrayhandler;

import java.util.List;

public class GivenArray {

    private List numbers;
    private String what;

    public GivenArray(String what, List numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public GivenArray() {
    }

    public List getNumbers() {
        return numbers;
    }

    public void setNumbers(List numbers) {
        this.numbers = numbers;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }
}
