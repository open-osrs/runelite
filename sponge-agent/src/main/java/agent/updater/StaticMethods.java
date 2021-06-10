package agent.updater;

import agent.util.Logger;
import org.spongepowered.asm.lib.tree.ClassNode;
import org.spongepowered.asm.lib.tree.MethodNode;

import java.util.HashMap;
import java.util.Map;

import static agent.updater.UpdateMappings.buildMappingField;
import static org.spongepowered.asm.lib.Opcodes.ACC_STATIC;

public class StaticMethods {
    public static Map<String, Boolean> foundMethods = new HashMap<>();
    public static Map<String, Boolean> expected = new HashMap<>();
    static Logger logger = new Logger();

    public static void findUpdateGameStateClass(MethodNode m, ClassNode node) {
        checkForStaticMethod("updateGameState", m, node);
    }

    public static void findAddGameMessageClass(MethodNode m, ClassNode node) {
        checkForStaticMethod("addGameMessage", m, node);
    }

    public static void findUpdateNpcsClass(MethodNode m, ClassNode node) {
        checkForStaticMethod("updateNpcs", m, node);
    }

    private static void checkForStaticMethod(String methodToFind, MethodNode m, ClassNode node)
    {
        expected.put(methodToFind, true);
        if (m.name.equals(methodToFind) && (m.access == ACC_STATIC || m.access == 24)) {
            if (foundMethods.containsKey(methodToFind))
                logger.error("Duplicate static " + methodToFind + " found!");
            foundMethods.put(methodToFind, true);
            buildMappingField(methodToFind + "Class", node.name);
        }
    }
}
