package org.example;

import java.util.logging.*;

public class LoggerTest {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LoggerTest.class.getName());
        logger.info("Logger Info ...");
    }

}
