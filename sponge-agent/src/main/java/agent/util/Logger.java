package agent.util;

public class Logger {
    public void info(String s) {
        System.out.println("[Info] " + s);
    }

    public void warn(String s) {
        System.out.println("[Warn] " + s);
    }

    public void error(String s) {
        System.out.println("[ERROR] " + s);
    }

    public void debug(String s) {
        System.out.println("[Debug] " + s);
    }
}
