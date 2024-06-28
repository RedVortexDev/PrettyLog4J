package io.github.redvortexdev.prettylog.log;

import io.github.redvortexdev.prettylog.ansi.AnsiColor;
import io.github.redvortexdev.prettylog.log.type.CustomLogType;
import io.github.redvortexdev.prettylog.log.type.LogType;

public class Logger {

    public static void log(String message, CustomLogType type) {
        var pattern = LoggerSettings.loggerStyle.pattern;
        if(type == LogType.FATAL) pattern = LoggerStyle.FULL.pattern;
        pattern = pattern.replace("<background>", type.colorPair().background.code);
        pattern = pattern.replace("<foreground>", type.colorPair().foreground.code);
        pattern = pattern.replace("<black>", AnsiColor.BLACK.code);
        pattern = pattern.replace("<prefix>", type.name());
        pattern = pattern.replace("<message>", message);
        pattern = pattern.replace("<reset>", AnsiColor.RESET.code);
        pattern = pattern.replace("<bold>", AnsiColor.BOLD.code);

        System.out.println(pattern + AnsiColor.RESET);
        if(LoggerSettings.saveToFile) LoggerFileWriter.writeToFile(message, type);
    }

    public static void log(String message) {
        log(message, LogType.RUNTIME);
    }

    public static void log(Exception exception) {
        log(exception.getMessage(), LogType.EXCEPTION);
        for (var line : exception.getStackTrace()) {
            log("   " + line, LogType.EXCEPTION);
        }
    }
}

