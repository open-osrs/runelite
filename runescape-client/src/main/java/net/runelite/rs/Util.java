package net.runelite.rs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Util {

    public static void main(String[] args)
    {
        Scanner inFile1 = null;
        try {
            int count = 0;
            for (File f : Objects.requireNonNull(new File("./runescape-client/src/main/java/").listFiles()))
            {
                if (f.isDirectory())
                    continue;

                inFile1 = new Scanner(f);
                List<String> tokens = new ArrayList<>();
                while (inFile1.hasNext()) {
                    tokens.add(inFile1.nextLine());
                }
                String[] fileLines = tokens.toArray(new String[0]);
                ArrayList<String> newFileLines = new ArrayList<>();
                for (String line : fileLines)
                {
                    if (line.contains("import net.runelite.mapping.Export;"))
                        continue;

                    if (line.contains("@Export"))
                    {
                        count++;
                        continue;
                    }

                    newFileLines.add(line);
                }
                write(f.getAbsolutePath(), newFileLines.toArray(new String[0]));
            }
            System.out.println(count + " exports removed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write (String filename, String[] lines) throws IOException {
        BufferedWriter outputWriter;
        outputWriter = new BufferedWriter(new FileWriter(filename));
        for (String line : lines)
        {
            outputWriter.write(line);
            outputWriter.newLine();
        }
        outputWriter.flush();
        outputWriter.close();
    }
}
