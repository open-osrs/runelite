import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
   @ObfuscatedName("n")
   int field1466;

   @ObfuscatedName("n")
   @Export("remove2")
   abstract void remove2();

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ldi;)I"
   )
   @Export("update")
   abstract int update();
}
