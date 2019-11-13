package net.runelite.client.plugins.theatre.rooms;

import com.google.gson.JsonParseException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import net.runelite.api.Point;
import net.runelite.api.util.Text;
import net.runelite.http.api.RuneLiteAPI;
import net.runelite.http.api.chat.Task;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

class MazeCommunication
{
    private static final String taskName = "Vanguards";

    static int[] getMazeLayourSeedTask(String name) throws IOException
    {
        HttpUrl url = RuneLiteAPI.getApiBase().newBuilder()
                .addPathSegment("chat")
                .addPathSegment("task")
                .addQueryParameter("name", name)
                .build();


        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = RuneLiteAPI.CLIENT.newCall(request).execute())
        {
            if (!response.isSuccessful())
            {
                throw new IOException("Unable to look up task!");
            }

            InputStream in = response.body().byteStream();
            Task task = RuneLiteAPI.GSON.fromJson(new InputStreamReader(in), Task.class);
            if (task == null || !task.getTask().equals(taskName) || task.getAmount() < 0 || task.getInitialAmount() < 0)
            {
                return null;
            }
            return new int[] { task.getAmount(), task.getInitialAmount() };
        }
        catch (JsonParseException ex)
        {
            throw new IOException(ex);
        }
    }
    static boolean setMazeLayourSeedTask(int[] mazeLayout, String name) throws IOException
    {
        return setMazeLayourSeedTask(taskName, mazeLayout, name);
    }

    static boolean setMazeLayourSeedTask(String taskName, int[] mazeLayout, String name) throws IOException
    {
        HttpUrl url = RuneLiteAPI.getApiBase().newBuilder()
                .addPathSegment("chat")
                .addPathSegment("task")
                .addQueryParameter("name", name)
                .addQueryParameter("task", taskName)
                .addQueryParameter("amount", Integer.toString(mazeLayout[0]))
                .addQueryParameter("initialAmount", Integer.toString(mazeLayout[1]))
                .addQueryParameter("location", "")
                .build();

        Request request = new Request.Builder()
                .post(RequestBody.create(null, new byte[0]))
                .url(url)
                .build();

        try (Response response = RuneLiteAPI.CLIENT.newCall(request).execute())
        {
            return response.isSuccessful();
        }
    }

    static boolean isMazeComplete(Set<Point> redTiles)
    {
        if (redTiles.isEmpty())
        {
            return false;
        }

        if (redTiles.size() < 15)
        {
            return false;
        }

        HashMap<Integer, HashSet<Integer>> ymap = new HashMap<>();
        for (Point p : redTiles)
        {
            if (ymap.containsKey(p.getY()))
            {
                ymap.get(p.getY()).add(p.getX());
            }
            else
            {
                HashSet<Integer> xset = new HashSet<>();
                xset.add(p.getX());
                ymap.put(p.getY(), xset);
            }
        }

        if (ymap.keySet().size() < 15)
        {
            return false;
        }

        for (int y = 0; y < 14; y+=2)
        {
            if (!ymap.containsKey(y) || !ymap.containsKey(y+1))
            {
                return false;
            }

            boolean connected = false;
            int x = ymap.get(y).iterator().next();
            for (int x1 : ymap.get(y+1))
            {
                if (x1 == x)
                {
                    connected = true;
                    break;
                }
            }

            if (!connected)
            {
                return false;
            }
        }
        return true;
    }

    static int[] getMazeSeed(Set<Point> redTiles)
    {
        int i1 = 0;
        int i2 = 0;
        for (Point point : redTiles)
        {
            if (point.getY() % 2 == 0)
            {
                if (point.getY() < 14)
                {
                    i1 |= getBitShiftedPos(point.getX(), point.getY());
                }
                else
                {
                    i2 |= getBitShiftedPos(point.getX(), 0);
                }
            }
        }
        return new int[]{i1, i2};
    }

    private static int getBitShiftedPos(int x, int y)
    {
        return x << (y * 2);
    }

    private static int getXFromSeed(int seed, int y)
    {
        return (seed & (15 << (y * 2))) >> (y * 2);
    }

    static HashSet<Point> pointSetFromSeed(int[] seed)
    {
        HashSet<Point> result = new HashSet<>();
        Point lastPoint = null;
        for (int y = 0; y < 15; y+= 2)
        {
            int acseed;
            Point p;
            if (y < 14)
            {
                acseed = seed[0];
                p = new Point(getXFromSeed(acseed, y), y);
            }
            else
            {
                acseed = seed[1];
                p = new Point(getXFromSeed(acseed, 0), y);
            }
            result.add(p);
            if (y > 0)
            {
                int xmin = Math.min(p.getX(), lastPoint.getX());
                int xmax = Math.max(p.getX(), lastPoint.getX());
                for (int x = xmin; x < xmax + 1; x++)
                {
                    result.add(new Point(x, y - 1));
                }
            }
            lastPoint = p;
        }
        return result;
    }

    // Seriously fuck you runescape
    static String unfuckName(String name)
    {
        return Text.removeTags(name).replace('\u00A0', ' ');
    }
}
