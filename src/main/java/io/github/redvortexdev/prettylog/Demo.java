package io.github.redvortexdev.prettylog;

import io.github.redvortexdev.prettylog.log.LoggerFileWriter;
import io.github.redvortexdev.prettylog.log.type.LogType;

import static io.github.redvortexdev.prettylog.log.Logger.log;

public class Demo {
    public static void main(String[] args) {
        LoggerFileWriter.load();

        log("Running main() in Demo.java..", LogType.DEBUG);
        log("Very informative information", LogType.INFORMATION);
        log("I am running on time!", LogType.RUNTIME);
        log("Downloading maxwell.mp3", LogType.NETWORK);
        log("maxwell.mp3 has been downloaded!", LogType.SUCCESS);
        log("Warning.. file maxwell.mp3 may be corrupted!", LogType.WARNING);
        log("maxwell.mp3 cannot be played!", LogType.ERROR);

        log("Critical issue detected in the payment system!", LogType.CRITICAL);
        log("User xXMegaGamerXx accessed the admin panel", LogType.AUDIT);
        log("Entering detailed trace mode for debugging", LogType.TRACE);
        log("Security breach attempt detected!", LogType.SECURITY);
        log("NeuroSama updated her profile picture to bread.png", LogType.USER_ACTION);
        log("Response time is 250ms", LogType.PERFORMANCE);
        log("MaxConnections set to 1000", LogType.CONFIG);
        log("Your life will be terminated",LogType.FATAL);

        try {
            throw new RuntimeException("Cannot play maxwell.mp3!");
        } catch (Exception exception) {
            log(exception);
        }
    }
}
