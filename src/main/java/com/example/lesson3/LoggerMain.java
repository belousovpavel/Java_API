package com.example.lesson3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerMain {

    static Logger logger = Logger.getLogger(LoggerMain.class.getName());

    public static void main(String[] args) {
        // FATAL, ERROR, WARN,INFO, DEBUG, TRACE
        // уровни логгеров, критичность сообщения

        //stderr
        logger.setLevel(Level.FINE);
        logger.log(Level.SEVERE, "error");

        //logger (level, message) ->
    }
}
