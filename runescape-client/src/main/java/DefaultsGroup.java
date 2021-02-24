import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("DefaultsGroup")
public class DefaultsGroup {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Llw;"
   )
   static final DefaultsGroup field3837 = new DefaultsGroup(3);
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "[[Lhz;"
   )
   @Export("Widget_interfaceComponents")
   public static Widget[][] Widget_interfaceComponents;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1717211989
   )
   @Export("group")
   final int group;

   DefaultsGroup(int var1) {
      this.group = var1;
   }
}
