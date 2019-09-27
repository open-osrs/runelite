import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("PrivateChatMode")
public class PrivateChatMode {
      @ObfuscatedName("z")
      @ObfuscatedSignature(
            signature = "Lkp;"
      )
      static final PrivateChatMode field3794 = new PrivateChatMode(3);
      @ObfuscatedName("n")
      @ObfuscatedGetter(
            intValue = 779550305
      )
      @Export("group")
      final int group;

      PrivateChatMode(int var1) {
            this.group = var1;
      }
}
