import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public class class235 {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lig;Lig;I)V",
      garbageValue = "-1015609755"
   )
   public static void method4331(AbstractArchive var0, AbstractArchive var1) {
      KitDefinition.KitDefinition_archive = var0;
      KitDefinition.KitDefinition_modelsArchive = var1;
      KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
   }
}
