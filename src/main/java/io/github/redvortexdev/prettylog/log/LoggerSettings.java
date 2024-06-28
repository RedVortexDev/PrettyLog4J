package io.github.redvortexdev.prettylog.log;

import io.github.redvortexdev.prettylog.log.style.LoggerStyle;

public class LoggerSettings {
    public static boolean saveToFile = true;
    public static String saveDirectoryPath = "./logs/";
    public static LoggerStyle loggerStyle = LoggerStyle.PREFIX;
    public static String logFileNameFormat = "yyyy-MM-dd-Hms";
}
