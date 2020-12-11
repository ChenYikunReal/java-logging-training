package org.example;

import java.util.logging.*;

public class LoggingLevelTest {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LoggingLevelTest.class.getName());
        logger.setLevel(Level.INFO);
        // FINEST级别 低于INFO级别 不打印
        logger.finest("FINEST");
        // FINER级别 低于INFO级别 不打印
        logger.finer("FINER");
        // FINE级别 低于INFO级别 不打印
        logger.fine("FINE");
        // CONFIG级别 低于INFO级别 不打印
        logger.config("CONFIG");
        // INFO级别 平于INFO级别 打印
        logger.info("INFO");
        // WARNING级别 高于INFO级别 打印
        logger.warning("WARNING");
        // SEVERE级别 高于INFO级别 打印
        logger.severe("SEVERE");
    }

}
