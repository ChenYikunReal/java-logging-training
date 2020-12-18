package org.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JclTest {

    private static final Log logger = LogFactory.getLog(JclTest.class);

    public static void main(String[] args) {
        // 记录TRACE级别的信息
        if (logger.isTraceEnabled()) {
            logger.trace("This is trace message.");
        }
        // 记录DEBUG级别的信息
        if (logger.isDebugEnabled()) {
            logger.debug("This is debug message.");
        }
        // 记录INFO级别的信息
        if (logger.isInfoEnabled()) {
            logger.info("This is info message.");
        }
        // 记录WARN级别的信息
        if (logger.isWarnEnabled()) {
            logger.warn("This is warn message.");
        }
        // 记录ERROR级别的信息
        if (logger.isErrorEnabled()) {
            logger.error("This is error message.");
        }
        // 记录FATAL级别的信息
        if (logger.isFatalEnabled()) {
            logger.fatal("This is fatal message.");
        }
    }

}
