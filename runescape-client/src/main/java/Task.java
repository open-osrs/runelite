import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
@Implements("Task")
public class Task {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lfl;"
   )
   @Export("next")
   Task next;
   @ObfuscatedName("y")
   @Export("status")
   public volatile int status = 0;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -710231709
   )
   @Export("type")
   int type;
   @ObfuscatedName("z")
   @Export("intArgument")
   public int intArgument;
   @ObfuscatedName("e")
   @Export("objectArgument")
   Object objectArgument;
   @ObfuscatedName("q")
   @Export("result")
   public volatile Object result;
}
