import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class191 {
      @ObfuscatedName("z")
      @ObfuscatedSignature(
            signature = "Lgl;"
      )
      static final class191 field2344 = new class191();
      @ObfuscatedName("n")
      @ObfuscatedSignature(
            signature = "Lgl;"
      )
      static final class191 field2345 = new class191();
      @ObfuscatedName("v")
      @ObfuscatedSignature(
            signature = "Lgl;"
      )
      static final class191 field2346 = new class191();

      @ObfuscatedName("v")
      @ObfuscatedSignature(
            signature = "(I)V",
            garbageValue = "1561368496"
      )
      @Export("KeyHandler_exit")
      public static void KeyHandler_exit() {
            if (KeyHandler.KeyHandler_instance != null) {
                  KeyHandler var0 = KeyHandler.KeyHandler_instance;
                  synchronized(KeyHandler.KeyHandler_instance) {
                        KeyHandler.KeyHandler_instance = null;
                  }
            }

      }

      @ObfuscatedName("fa")
      @ObfuscatedSignature(
            signature = "(Lby;I)V",
            garbageValue = "616240991"
      )
      static final void method3630(Actor var0) {
            int var1 = var0.field948 - Client.cycle;
            int var2 = var0.size * -527978816 + var0.field971 * 128;
            int var3 = var0.size * -527978816 + var0.field973 * 128;
            var0.field_27 += (var2 - var0.field_27) / var1;
            var0.field_28 += (var3 - var0.field_28 * 682054857) / var1 * -944175751;
            var0.field949 = 0;
            var0.orientation = var0.field977;
      }
}
