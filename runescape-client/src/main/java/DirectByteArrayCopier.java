import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("Widget_modelsArchive")
   static AbstractArchive Widget_modelsArchive;
   @ObfuscatedName("n")
   @Export("directBuffer")
   ByteBuffer directBuffer;

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)[B",
      garbageValue = "1361682252"
   )
   @Export("get")
   byte[] get() {
      byte[] var1 = new byte[this.directBuffer.capacity()];
      this.directBuffer.position(0);
      this.directBuffer.get(var1);
      return var1;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "262833794"
   )
   @Export("set")
   void set(byte[] var1) {
      this.directBuffer = ByteBuffer.allocateDirect(var1.length);
      this.directBuffer.position(0);
      this.directBuffer.put(var1);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lig;I)V",
      garbageValue = "292233920"
   )
   public static void method4147(AbstractArchive var0) {
      StructComposition.StructDefinition_archive = var0;
   }
}
