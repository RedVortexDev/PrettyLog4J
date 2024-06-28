package io.github.redvortexdev.prettylog;

import io.github.redvortexdev.prettylog.log.LoggerFileWriter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LoggerFileWriter.load();

    }
}