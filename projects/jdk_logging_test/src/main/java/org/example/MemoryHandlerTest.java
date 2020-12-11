package org.example;

import java.io.IOException;
import java.util.logging.*;

public class MemoryHandlerTest {

    public static void main(String[] args) throws IOException {
        // 在buffer中维护5条日志信息，仅记录Level大于等于Warning的日志条目并刷新buffer中的日志条目到fileHandler中处理
        int bufferSize = 5;
        FileHandler fileHandler = new FileHandler("MemoryHandlerLog.log");
        MemoryHandler memoryHandler = new MemoryHandler(fileHandler, bufferSize, Level.WARNING);
        Logger logger = Logger.getLogger(MemoryHandlerTest.class.getName());
        logger.addHandler(memoryHandler);
        logger.log(Level.WARNING, "This is a WARNING log ...");
    }

}
