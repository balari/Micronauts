package com.bala;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HelloController {

    @Get("/")
    public String getHelloWorld(){

        return "HelloWorld";
    }


}
