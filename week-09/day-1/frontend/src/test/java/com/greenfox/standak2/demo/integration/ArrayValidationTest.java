package com.greenfox.standak2.demo.integration;

import com.greenfox.standak2.demo.controllers.MainRestController;
import com.greenfox.standak2.demo.models.arrayhandler.ResultArray;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MainRestController.class)
@AutoConfigureMockMvc
public class ArrayValidationTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    ResultArray resultArray;

    @Test
    public void jsonWithArrayShouldBeReturnedIfWhatAndNumbersArrayIsGiven() throws Exception {
        //arrange
        String content = "{\n" +
                "  \"what\":\"double\",\n" +
                "  \"numbers\": [1, 2, 3, 6, 8]\n" +
                "}";

        List<Integer> expectedResult = Arrays.asList(2, 4, 6, 12, 16);

        mockMvc.perform(post("/arrays")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result").isArray());
    }

    @Test
    public void jsonWithErrorStringShouldBeReturnedIfWhatOrNumbersMissing() throws Exception {
        //arrange
        String content = "{\n" +
                "  \"what\":\"\",\n" +
                "  \"numbers\": [1, 2, 3, 6, 8]\n" +
                "}";

        List<Integer> expectedResult = Arrays.asList(2, 4, 6, 12, 16);

        mockMvc.perform(post("/arrays")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.error").isString());
    }
}
