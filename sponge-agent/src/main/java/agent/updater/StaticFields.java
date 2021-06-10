package agent.updater;

import agent.util.Logger;
import org.spongepowered.asm.lib.tree.ClassNode;
import org.spongepowered.asm.lib.tree.FieldNode;
import org.spongepowered.asm.lib.tree.MethodNode;

import java.util.HashMap;
import java.util.Map;

import static agent.updater.UpdateMappings.buildMappingField;
import static org.spongepowered.asm.lib.Opcodes.ACC_STATIC;

public class StaticFields {
    public static Map<String, Boolean> foundFields = new HashMap<>();
    public static Map<String, Boolean> expected = new HashMap<>();
    static Logger logger = new Logger();

    public static void findClientInstanceClass(FieldNode f, ClassNode node) {
        checkForStaticField("client", f, node, "clientInstance");
    }


    private static void checkForStaticField(String fieldToFind, FieldNode f, ClassNode node, String optionalName)
    {
        expected.put(fieldToFind, true);
        if (f.name.equals(fieldToFind) && (f.access == ACC_STATIC || f.access == 24)) {
            if (foundFields.containsKey(fieldToFind))
                logger.error("Duplicate static " + fieldToFind + " found!");
            foundFields.put(fieldToFind, true);
            buildMappingField(optionalName + "Class", node.name);
        }
    }
}
