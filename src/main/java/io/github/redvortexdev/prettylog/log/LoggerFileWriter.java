package io.github.redvortexdev.prettylog.log;

import io.github.redvortexdev.prettylog.util.Pair;
import io.github.redvortexdev.prettylog.log.type.CustomLogType;
import io.github.redvortexdev.prettylog.log.type.LogType;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static io.github.redvortexdev.prettylog.log.Logger.log;

public class LoggerFileWriter {
    private static boolean isLoaded = false;
    private static File file;
    private static final String logFileName = new SimpleDateFormat(LoggerSettings.logFileNameFormat).format(Calendar.getInstance().getTime());

    // Store the logs that come before the FileWriter is loaded
    private static final List<Pair<String, CustomLogType>> unloadedLogQueue = new ArrayList<>();

    public static void load() {
        if (isLoaded) {
            log("[PrettyLog] FileWriter is already loaded!", LogType.ERROR);
            return;
        }

        //Make sure the path has the correct format
        if(!LoggerSettings.saveDirectoryPath.endsWith("/")) LoggerSettings.saveDirectoryPath += "/";
        file = new File(LoggerSettings.saveDirectoryPath + logFileName + ".log");

        // Create the directory if it doesn't exist
        if(!directoryExists(LoggerSettings.saveDirectoryPath)) {
            log(
                    "[PrettyLog] Specified log directory (" + LoggerSettings.saveDirectoryPath + ") was not found, creating one..",
                    LogType.WARNING
            );
            Path path = Paths.get(LoggerSettings.saveDirectoryPath);
            try {
                Files.createDirectories(path);
            } catch (IOException exception) {
                log("Failed to create directory!", LogType.ERROR);
                return;
            }
            log("[PrettyLog] Log directory created!", LogType.SUCCESS);
        }

        // Create the file if it doesn't exist
        try {
            if(!file.exists()) {
                if (!file.createNewFile()) { // Kept warning me about not using the result of createNewFile
                    log("[PrettyLog] Seems like the file already existed somehow.");
                }
            }
        } catch (IOException exception) {
            log("Failed to create log file!", LogType.ERROR);
            return;
        }

        // Mark the FileWriter as loaded
        isLoaded = true;

        // Write all logs that came before the FileWriter is loaded
        unloadedLogQueue.forEach(pair -> {
            writeToFile(pair.getFirst(), pair.getSecond());
        });
    }

    public static boolean isLoaded() {
        return isLoaded;
    }

    static void writeToFile(String message, CustomLogType type) {
        if(!LoggerFileWriter.isLoaded()) {
            unloadedLogQueue.add(new Pair<>(message, type));
            return;
        }
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());

       try {
           FileWriter fw = new FileWriter(file, true);
           BufferedWriter bw = new BufferedWriter(fw);
           bw.write(date + " [" + type.name().toUpperCase() + "] " + message);
           bw.newLine();
           bw.close();

       } catch (IOException exception) {
           log("[PrettyLog] Failed to write to file!", LogType.ERROR);
       }
    }

    private static boolean directoryExists(String directoryPath) {
        Path path = Paths.get(directoryPath);
        return Files.exists(path) && Files.isDirectory(path);
    }
}