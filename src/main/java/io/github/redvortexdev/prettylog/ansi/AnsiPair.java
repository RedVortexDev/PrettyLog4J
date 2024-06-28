package io.github.redvortexdev.prettylog.ansi;

@SuppressWarnings("unused")
public enum AnsiPair {
    BLACK(AnsiColor.BLACK_BACKGROUND, AnsiColor.BLACK),
    RED(AnsiColor.RED_BACKGROUND, AnsiColor.RED),
    GREEN(AnsiColor.GREEN_BACKGROUND, AnsiColor.GREEN),
    YELLOW(AnsiColor.YELLOW_BACKGROUND, AnsiColor.YELLOW),
    BLUE(AnsiColor.BLUE_BACKGROUND, AnsiColor.BLUE),
    PURPLE(AnsiColor.PURPLE_BACKGROUND, AnsiColor.PURPLE),
    CYAN(AnsiColor.CYAN_BACKGROUND, AnsiColor.CYAN),
    WHITE(AnsiColor.WHITE_BACKGROUND, AnsiColor.WHITE),
    BRIGHT_BLACK(AnsiColor.BRIGHT_BLACK_BACKGROUND, AnsiColor.BRIGHT_BLACK),
    BRIGHT_RED(AnsiColor.BRIGHT_RED_BACKGROUND, AnsiColor.BRIGHT_RED),
    BRIGHT_GREEN(AnsiColor.BRIGHT_GREEN_BACKGROUND, AnsiColor.BRIGHT_GREEN),
    BRIGHT_YELLOW(AnsiColor.BRIGHT_YELLOW_BACKGROUND, AnsiColor.BRIGHT_YELLOW),
    BRIGHT_BLUE(AnsiColor.BRIGHT_BLUE_BACKGROUND, AnsiColor.BRIGHT_BLUE),
    BRIGHT_PURPLE(AnsiColor.BRIGHT_PURPLE_BACKGROUND, AnsiColor.BRIGHT_PURPLE),
    BRIGHT_CYAN(AnsiColor.BRIGHT_CYAN_BACKGROUND, AnsiColor.BRIGHT_CYAN),
    BRIGHT_WHITE(AnsiColor.BRIGHT_WHITE_BACKGROUND, AnsiColor.BRIGHT_WHITE),
    GRAY(AnsiColor.GRAY_BACKGROUND, AnsiColor.GRAY),
    ORANGE(AnsiColor.ORANGE_BACKGROUND, AnsiColor.ORANGE),
    PINK(AnsiColor.PINK_BACKGROUND, AnsiColor.PINK),
    CUTE_PINK(AnsiColor.CUTE_PINK_BACKGROUND, AnsiColor.CUTE_PINK),
    AQUA(AnsiColor.AQUA_BACKGROUND, AnsiColor.AQUA),
    GOLD(AnsiColor.GOLD_BACKGROUND, AnsiColor.GOLD),
    LIGHT_GREEN(AnsiColor.LIGHT_GREEN_BACKGROUND, AnsiColor.LIGHT_GREEN),
    LIGHT_BLUE(AnsiColor.LIGHT_BLUE_BACKGROUND, AnsiColor.LIGHT_BLUE),
    MAGENTA(AnsiColor.MAGENTA_BACKGROUND, AnsiColor.MAGENTA),
    LIGHT_CYAN(AnsiColor.LIGHT_CYAN_BACKGROUND, AnsiColor.LIGHT_CYAN),
    LIGHT_GRAY(AnsiColor.LIGHT_GRAY_BACKGROUND, AnsiColor.LIGHT_GRAY),
    DARK_RED(AnsiColor.DARK_RED_BACKGROUND, AnsiColor.DARK_RED),
    DARK_GREEN(AnsiColor.DARK_GREEN_BACKGROUND, AnsiColor.DARK_GREEN),
    DARK_BLUE(AnsiColor.DARK_BLUE_BACKGROUND, AnsiColor.DARK_BLUE),
    DARK_YELLOW(AnsiColor.DARK_YELLOW_BACKGROUND, AnsiColor.DARK_YELLOW),
    DARK_PURPLE(AnsiColor.DARK_PURPLE_BACKGROUND, AnsiColor.DARK_PURPLE);
    
    public final AnsiColor background;
    public final AnsiColor foreground;
    
    AnsiPair(AnsiColor background, AnsiColor foreground) {
        this.background = background;
        this.foreground = foreground;
    }
    
}
