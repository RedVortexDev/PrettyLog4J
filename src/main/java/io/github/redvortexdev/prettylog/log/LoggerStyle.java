package io.github.redvortexdev.prettylog.log;

@SuppressWarnings("unused")
public enum LoggerStyle {
    FULL("<background><black><prefix>: <message>"),
    PREFIX("<background><black><prefix>:<reset> <foreground><message>"),
    SUFFIX("<foreground><prefix>: <background><black><message>"),
    TEXT_ONLY("<foreground><prefix>: <message>"),
    PREFIX_WHITE_TEXT("<background><black><prefix>:<reset> <message>"),
    BRACKET_PREFIX("<foreground><bold>[<prefix>]<reset><foreground> <message>"),
    BRACKET_PREFIX_WHITE_TEXT("<foreground><bold>[<prefix>] <reset><message>");

    public final String pattern;
    LoggerStyle(String pattern) {
        this.pattern = pattern;
    }
}
