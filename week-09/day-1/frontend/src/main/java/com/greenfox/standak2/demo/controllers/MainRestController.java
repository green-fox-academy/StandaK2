package com.greenfox.standak2.demo.controllers;

import com.greenfox.standak2.demo.models.AppendA;
import com.greenfox.standak2.demo.models.Result;
import com.greenfox.standak2.demo.models.Greeter;
import com.greenfox.standak2.demo.models.GivenNumber;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

    @GetMapping("/doubling")
    public String doubling(@RequestParam(required = false) Integer input) {
        if (input == null) {
            return "{\"error\": \"Please provide an input!\"}";
        } else {
            int doubledValue = input * 2;

            String json = "{ \"received\": \"" + input + "\", \"result\": " + doubledValue + " }";
            return json;
        }
    }

    @GetMapping("/greeter")
    public Greeter greeter(@RequestParam(required = false) String name,
                           @RequestParam(required = false) String title) {

        return new Greeter(name, title);
    }

    @GetMapping("/appenda/{appendable}")
    public AppendA appendA(@PathVariable String appendable) {

        return new AppendA(appendable);
    }

    @PostMapping("/dountil/{action}")
    public Result doUntil(@PathVariable String action, @RequestBody(required = false) GivenNumber until) {

        return new Result(action, until.getUntil());
    }
}


