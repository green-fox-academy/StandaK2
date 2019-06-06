package com.greenfox.standak2.demo.unit;

import com.greenfox.standak2.demo.models.arrayhandler.ResultArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ResultArrayTest {

    @Test
    public void getResultGetSumOfAllNumbers(){

//        Arrange
        String what = "sum";
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 8);
        ResultArray resultArray = new ResultArray(what, numbers);

//        Act

//        Assert
        List<Integer> result = Arrays.asList(20);
        Assert.assertEquals(result, resultArray.getResult());

    }

    @Test
    public void getResultGetDoubleOfAllNumbers(){

//        Arrange
        String what = "double";
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 8);
        ResultArray resultArray = new ResultArray(what, numbers);

//        Act

//        Assert
        List<Integer> result = Arrays.asList(2, 4, 6, 12, 16);
        Assert.assertEquals(result, resultArray.getResult());

    }

    @Test
    public void getResultGetMultiplyOfAllNumbers(){

//        Arrange
        String what = "multiply";
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 8);
        ResultArray resultArray = new ResultArray(what, numbers);

//        Act

//        Assert
        List<Integer> result = Arrays.asList(288);
        Assert.assertEquals(result, resultArray.getResult());

    }
}
