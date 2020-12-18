package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

public class LogbackTest {

    private static final Logger logger = LoggerFactory.getLogger(LogbackTest.class);

    public static void main(String[] args) {
        // 记录TRACE级别的信息
        logger.trace("This is trace message.");
        // 记录DEBUG级别的信息
        logger.debug("This is debug message.");
        // 记录INFO级别的信息
        logger.info("This is info message.");
        // 记录WARN级别的信息
        logger.warn("This is warn message.");
        // 记录ERROR级别的信息
        logger.error("This is error message.");
        // print internal state
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(loggerContext);
    }

}
