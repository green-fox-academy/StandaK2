package com.greenfox.standak2.demo.models.dountil;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Result {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer result;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String error;

    public Result(String action, Integer number) {

        if (number == 0) {
            this.error = "Please provide a number!";
        } else {

            this.result = countResult(action, number);
        }
    }

    public int countResult(String action, Integer number) {

        if (action.equals("sum")) {
            return sumNumber(number);
        } else if (action.equals("factor")) {
            return factorNumber(number);
        } else return 0;
    }

    private Integer sumNumber(Integer number) {
        int result = 0;
        for (int i = 0; i < number + 1; i++) {
            result += i;
        }
        return result;
    }

    private Integer factorNumber(Integer number) {

        int result = 1;
        for (int i = 2; i < number + 1; i++) {
            result *= i;
        }
        return result;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}


