package com.danilojakob.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private final static Logger LOGGER = LoggerFactory.getLogger(Main.class);
    private final static Logger LOGGER_FILE = LoggerFactory.getLogger("file_logger");
    private final static Logger LOGGER_MAIL = LoggerFactory.getLogger("mail_logger");

    public static void main(String[] args) {
        LOGGER.info("Hello World!");
        LOGGER_FILE.info("Hello World!");
        LOGGER_FILE.warn("Hello World!");
        LOGGER_FILE.error("Hello World!");
        LOGGER_MAIL.error("Sample Error");
    }
}
