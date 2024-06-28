# PrettyLog4J

A Kotlin logging library ported to Java focused on readability in console.
PrettyLog takes advantage of ANSI color codes to make your logs look ✨ ***pretty*** ✨.

## Installation
I currently do not know how to set up publishing to maven central, for now clone the project.

[//]: # ()
[//]: # (<img src="https://cdn.worldvectorlogo.com/logos/kotlin-2.svg" width="16px"></img>)

[//]: # (**Kotlin DSL**)

[//]: # (```kotlin)

[//]: # (repositories {)

[//]: # (    maven {)

[//]: # (        name = "devOS")

[//]: # (        url = uri&#40;"https://mvn.devos.one/releases"&#41;)

[//]: # (    })

[//]: # (})

[//]: # ()
[//]: # (dependencies {)

[//]: # (    implementation&#40;"cz.lukynka:pretty-log:1.3"&#41;)

[//]: # (})

[//]: # (```)

[//]: # (<img src="https://github.com/LukynkaCZE/PrettyLog/assets/48604271/3293feca-7395-4100-8b61-257ba40dbe3c" width="18px"></img>)

[//]: # (**Gradle Groovy**)

[//]: # (```groovy)

[//]: # (repositories {)

[//]: # (    mavenCentral&#40;&#41;)

[//]: # (    maven {)

[//]: # (        name "devOS")

[//]: # (        url "https://mvn.devos.one/releases")

[//]: # (    })

[//]: # (})

[//]: # ()
[//]: # (dependencies {)

[//]: # (    implementation 'cz.lukynka:pretty-log:1.3')

[//]: # (})

[//]: # (```)
## Logging
Logging is very easy, just call the `log(message, type)` method. `type` parameter is optional and defaults to `RUNTIME`
```java
log("Hello there!");
log("general kenobi", LogType.NETWORK);
```
![image](https://github.com/LukynkaCZE/PrettyLog/assets/48604271/4052e4f2-6b69-4e95-a2ee-ba130615d82f)


You can also log exceptions!
```java
} catch (Exception exception) {
    log(exception);
}
```
![image](https://github.com/LukynkaCZE/PrettyLog/assets/48604271/a5268ff2-7736-43df-bfb0-2a82bfc6ecc3)
*Excuse the Kotlin stacktrace*

## Logger Settings
You can change settings by simply setting `LoggerSettings.<setting>` to its new value

```java
// Should the logs be saved to file?
LoggerSettings.saveToFile = true;
// The path to the logs directory
LoggerSettings.saveDirectoryPath = "./logs/";
// Format of the log file name
LoggerSettings.logFileNameFormat = "yyyy-MM-dd-Hms";
// Style of the logger in console
LoggerSettings.loggerStyle = LoggerStyle.PREFIX;
```

### Logger Styles
There are 7 logger styles in total:

![image](https://github.com/LukynkaCZE/PrettyLog/assets/48604271/17c8ab17-3003-4c5a-a4dd-91c0b08203f8)

## Log Types
There are 16 default log types: **Debug**, **Information**, **Runtime**, **Network**, **Success**, **Warning**, **Error**, **Exception**, **Critical**, **Audit**, **Trace**, **Security**, **User Action**, **Performance**, **Config**, and **Fatal**.

![image](https://github.com/LukynkaCZE/PrettyLog/assets/48604271/ee41b3a2-b2af-4ba8-a5d5-cfb7410b1065)

### Custom Log Types
You can make custom log types by making a class and then making `public static CustomLogType` variables in it with the `new CustomLogType(name, AnsiPair)` record class

```java
public class CustomLogTypes {
    public static CustomLogType CUTE = new CustomLogType("≽^•⩊•^≼", AnsiPair.CUTE_PINK);
    public static CustomLogType GIT = new CustomLogType("\uD83E\uDD16 Git", AnsiPair.AQUA);
    public static CustomLogType FIRE_WARNING = new CustomLogType("\uD83D\uDD25 Fire Warning", AnsiPair.ORANGE);
}
```
```java
log("T-This is vewy cuwute message OwO", CustomLogTypes.CUTE);
log("refusing to merge unrelated histories", CustomLogTypes.GIT);
log("SERVER ROOM ON FIRE, DONT LET ASO RUN WHILE LOOPS EVER AGAIN", CustomLogTypes.FIRE_WARNING);
```

![image](https://github.com/LukynkaCZE/PrettyLog/assets/48604271/93f82bab-1ccc-470b-8827-cfe4a1409a55)
