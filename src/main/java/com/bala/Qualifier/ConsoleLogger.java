package com.bala.Qualifier;

import jakarta.inject.Singleton;

@Singleton
public class ConsoleLogger implements Logger{


    @Override
    public void log() {
        System.out.println("Console logger to file");
    }
}
