package org.example;

import org.apache.log4j.Logger;

public class Log4jTest {

    private static final Logger logger = Logger.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        // 记录DEBUG级别的信息
        if (Logger.getRootLogger().isDebugEnabled()) {
            logger.debug("This is debug message.");
        }
        // 记录INFO级别的信息
        if (Logger.getRootLogger().isInfoEnabled()) {
            logger.info("This is info message.");
        }
        // 记录ERROR级别的信息
        logger.error("This is error message.");
    }

}
