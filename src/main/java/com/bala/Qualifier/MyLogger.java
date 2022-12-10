package com.bala.Qualifier;

import jakarta.inject.Singleton;

@Singleton
public class MyLogger implements Logger{
    @Override
    public void log() {
        System.out.println("print MyLogger");
    }
}
