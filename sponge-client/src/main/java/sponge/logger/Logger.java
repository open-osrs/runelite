package sponge.logger;

import java.lang.reflect.Method;

public class Logger {

    public void info(String s)
    {
        System.out.println("[Info] " + s);
    }

    public void warn(String s)
    {
        System.out.println("[Warn] " + s);
    }

    public void error(String s)
    {
        System.out.println("[ERROR] " + s);
    }

    public void info(String s, Throwable e)
    {
        System.out.println("[Info] " + s);
    }

    public void warn(String s, Throwable e)
    {
        System.out.println("[Warn] " + s);
    }

    public void error(String s, Throwable e)
    {
        System.out.println("[ERROR] " + s);
    }

    public void debug(String s) {
        System.out.println("[Debug] " + s);
    }
}
