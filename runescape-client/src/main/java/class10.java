import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
public class class10 {
   @ObfuscatedName("n")
   final int field60;
   @ObfuscatedName("v")
   final int field61;
   @ObfuscatedName("d")
   final String field62;

   @ObfuscatedSignature(
      descriptor = "(Lkx;)V"
   )
   class10(Buffer var1) {
      this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
   }

   class10(int var1, int var2, String var3) {
      this.field60 = var1;
      this.field61 = var2;
      this.field62 = var3;
   }

   @ObfuscatedName("n")
   String method115() {
      return Integer.toHexString(this.field60) + Integer.toHexString(this.field61) + this.field62;
   }

   @ObfuscatedName("v")
   int method111() {
      return this.field61;
   }
}
