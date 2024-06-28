package io.github.redvortexdev.prettylog.util;

public class AnsiUtil {
    public static String foreColor(int code) {
        return "\u001B[38;5;" + code + "m";
    }

    public static String backColor(int code) {
        return "\u001B[48;5;" + code + "m";
    }
}
