package net.runelite.client.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class WebUtils
{
    
    public static String getUrlContent(String url) throws IOException
    {
        String pageText;
        URLConnection conn = new URL(url).openConnection();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8)))
        {
            pageText = reader.lines().collect(Collectors.joining("\n"));
        }
        return pageText;
    }
    
}
