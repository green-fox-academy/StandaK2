package com.greenfox.standak2.demo.models.arrayhandler;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ResultArray {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Integer> result;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String error;

    public ResultArray(String what, List<Integer> numbers) {

        if (numbers.size() == 0 || what == null || numbers == null || what.equals("")) {
            this.error = "Please provide what to do with the numbers!";
        } else {
            this.result = new ArrayList<>();
            countResult(what, numbers);
        }
    }

    private void countResult(String what, List<Integer> numbers) {

        if (what.equals("double")) {
            numbers.stream()
                    .map(number -> number * 2)
                    .forEach(number -> this.result.add(number));
        } else if (what.equals("sum")) {
            result.add(numbers.stream()
                    .reduce(0, (a, b) -> a + b));

        } else if (what.equals("multiply")) {
            result.add(numbers.stream()
                    .reduce(1, (a, b) -> a * b));
        }
    }

    public List<Integer> getResult() {
        return result;
    }

    public void setResult(List<Integer> result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}


