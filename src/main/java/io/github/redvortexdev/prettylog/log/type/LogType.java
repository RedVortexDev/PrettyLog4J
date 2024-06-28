package io.github.redvortexdev.prettylog.log.type;

import io.github.redvortexdev.prettylog.ansi.AnsiPair;

public class LogType {
    public static CustomLogType INFORMATION = new CustomLogType("ℹ\uFE0F Information", AnsiPair.CYAN);
    public static CustomLogType RUNTIME = new CustomLogType("✨ Runtime", AnsiPair.MAGENTA);
    public static CustomLogType DEBUG = new CustomLogType("\uD83D\uDD27 Debug", AnsiPair.GRAY);
    public static CustomLogType NETWORK = new CustomLogType("\uD83D\uDD0C Network", AnsiPair.BLUE);
    public static CustomLogType SUCCESS = new CustomLogType("✔\uFE0F Success", AnsiPair.BRIGHT_GREEN);
    public static CustomLogType WARNING = new CustomLogType("⚠\uFE0F Warning", AnsiPair.BRIGHT_YELLOW);
    public static CustomLogType ERROR = new CustomLogType("⛔ Error", AnsiPair.RED);
    public static CustomLogType EXCEPTION = new CustomLogType("\uD83D\uDCA3 Exception", AnsiPair.RED);
    public static CustomLogType CRITICAL = new CustomLogType("🚨 Critical", AnsiPair.BRIGHT_RED);
    public static CustomLogType AUDIT = new CustomLogType("📋 Audit", AnsiPair.YELLOW);
    public static CustomLogType TRACE = new CustomLogType("🔍 Trace", AnsiPair.LIGHT_BLUE);
    public static CustomLogType SECURITY = new CustomLogType("🔒 Security", AnsiPair.PURPLE);
    public static CustomLogType USER_ACTION = new CustomLogType("🧍 User Action", AnsiPair.CUTE_PINK);
    public static CustomLogType PERFORMANCE = new CustomLogType("⏱️ Performance", AnsiPair.PINK);
    public static CustomLogType CONFIG = new CustomLogType("⚙️ Config", AnsiPair.LIGHT_GRAY);
    public static CustomLogType FATAL = new CustomLogType("☠️ Fatal", AnsiPair.DARK_RED);
}

