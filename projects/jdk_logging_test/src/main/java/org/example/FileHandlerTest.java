package org.example;

import java.io.IOException;
import java.util.logging.*;

public class FileHandlerTest {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(FileHandlerTest.class.getName());
        String fileName = "FileHandlerLog.log";
        FileHandler fileHandler = new FileHandler(fileName, true);
        // 绑定文件
        logger.addHandler(fileHandler);
        // SEVERE Log
        logger.log(Level.SEVERE, "This is a SEVERE log ...");
        // WARNING Log
        logger.log(Level.WARNING, "This is a WARNING log ...");
        // 解除绑定文件
        logger.removeHandler(fileHandler);
        // WARNING Log
        logger.log(Level.WARNING, "This is a WARNING log ...");
    }

}
