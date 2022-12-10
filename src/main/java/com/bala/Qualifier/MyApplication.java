package com.bala.Qualifier;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
public class MyApplication {

    private final Logger logger;


    public MyApplication(@Named("mylogger") Logger logger) {
        this.logger = logger;
    }
    public void Display(){
        System.out.println("Print the logger file!");

        logger.log();
    }
}
