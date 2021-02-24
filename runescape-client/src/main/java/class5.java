import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
public class class5 implements class12 {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lkx;)Lkx;"
   )
   public Buffer vmethod120(Buffer var1) {
      Buffer var2 = new Buffer(100);
      this.method63(var1, var2);
      return var2;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lkx;Lkx;)V"
   )
   void method63(Buffer var1, Buffer var2) {
      class10 var3 = new class10(var1);
      class6 var4 = new class6(var3);

      long var5;
      for(var5 = 0L; !var4.method64(var3.method111(), var3.method115(), var5); ++var5) {
         ;
      }

      var2.writeLong(var5);
   }
}
