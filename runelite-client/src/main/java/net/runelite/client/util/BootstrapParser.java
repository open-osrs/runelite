package net.runelite.client.util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class BootstrapParser
{
    private static String clientPatchesUrl, runeliteApiUrl, runescapeApiUrl;
    
    public static void run() throws IOException, ParseException
    {
        String pageText = WebUtils.getUrlContent("https://static.runelite.net/bootstrap.json");
        JSONParser parser = new JSONParser();
        JSONObject rootObject = (JSONObject) parser.parse(pageText);
        JSONArray artifactArray = (JSONArray) rootObject.get("artifacts");
        for(Object object : artifactArray)
        {
            JSONObject artifact = (JSONObject) object;
            String artifactName = (String) artifact.get("name");
            if(artifactName.startsWith("client-patch-"))
            {
                clientPatchesUrl = (String) artifact.get("path");
            }
            else if(artifactName.startsWith("runelite-api-"))
            {
                runeliteApiUrl = (String) artifact.get("path");
            }
            else if(artifactName.startsWith("runescape-api-"))
            {
                runescapeApiUrl = (String) artifact.get("path");
            }
        }
    }
    
    public static String getClientPatchesUrl()
    {
        return clientPatchesUrl;
    }
    
    public static String getRuneliteApiUrl()
    {
        return runeliteApiUrl;
    }
    
    public static String getRunescapeApiUrl()
    {
        return runescapeApiUrl;
    }
}
