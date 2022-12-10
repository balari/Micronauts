package com.bala.Qualifier;

import jakarta.inject.Singleton;

@Singleton
public class FileManager implements Logger {


    @Override
    public void log() {

        System.out.println("filelogger to file");



    }
}
