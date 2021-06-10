package agent.updater;

import org.spongepowered.asm.lib.ClassReader;
import org.spongepowered.asm.lib.tree.ClassNode;
import org.spongepowered.asm.lib.tree.FieldNode;
import org.spongepowered.asm.lib.tree.MethodNode;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

// This class is responsible for generating targets for mixins based on the osrs package of :client (oprs deob)
public class UpdateMappings {

    public static String mappingsPRE =
            "//This file is auto-generated via agent.updater.UpdateMappings\n" +
                    "package agent;\n\n" +
                    "public class Mappings {\n";
    public static StringBuilder mappings = new StringBuilder(mappingsPRE);
    private static int expected = 2;
    private static int found = 0;

    public static void main(String args[]) {
        System.out.println("---SpongeOSRS Mappings Generator---");
        long start = System.currentTimeMillis();
        File deob = new File("./client/build/libs/client-1.0-SNAPSHOT.jar");
        scanGamepack(deob);
        System.out.println("Found " + found + "/" + (StaticMethods.expected.size() + StaticFields.expected.size()) + "\nUpdate took " + (System.currentTimeMillis() - start) + "ms");
    }

    public static void scanGamepack(File f) {
        try (ZipFile zf = new ZipFile(f)) {
            Enumeration<? extends ZipEntry> entries = zf.entries();
            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                if (entry.getName().endsWith(".class")) {
                    if (!entry.getName().startsWith("osrs/")) // Only check deob classes
                        continue;
                    ClassReader reader = new ClassReader(zf.getInputStream(entry));
                    ClassNode node = new ClassNode();
                    reader.accept(node, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
                    for (MethodNode m : node.methods) {
                        findStaticMethods(m, node);
                    }
                    for (FieldNode fn : node.fields) {
                        findStaticFields(fn, node);
                    }
                }
            }
            mappings.append("}");
            try (PrintWriter out = new PrintWriter("./agent/src/main/java/agent/Mappings.java")) {
                out.println(mappings);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    private static void findStaticMethods(MethodNode m, ClassNode node) {
        StaticMethods.findUpdateGameStateClass(m, node);
        StaticMethods.findAddGameMessageClass(m, node);
        StaticMethods.findUpdateNpcsClass(m, node);
    }

    private static void findStaticFields(FieldNode f, ClassNode node) {
        StaticFields.findClientInstanceClass(f, node);
    }

    public static void buildMappingField(String fieldName, String refClassName) {
        mappings.append("   public static final String " + fieldName + " = \"" + refClassName + "\";\n");
        found++;
    }
}
