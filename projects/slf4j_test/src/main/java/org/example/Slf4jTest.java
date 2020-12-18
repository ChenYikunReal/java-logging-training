package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jTest {

    private static final Logger logger = LoggerFactory.getLogger(Slf4jTest.class);

    public static void main(String[] args) {
        // 记录trace级别的信息
        logger.trace("This is trace message.");
        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");
        // 记录warn级别的信息
        logger.warn("This is warn message.");
    }

}
