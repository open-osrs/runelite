import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1297483725
   )
   @Export("compass")
   public int compass = -1;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1189696731
   )
   public int field3847 = -1;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -189041471
   )
   @Export("mapScenes")
   public int mapScenes = -1;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 326124555
   )
   @Export("headIconsPk")
   public int headIconsPk = -1;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1371228557
   )
   public int field3838 = -1;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1164105375
   )
   public int field3843 = -1;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -981893847
   )
   public int field3839 = -1;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1322267677
   )
   public int field3845 = -1;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 357472757
   )
   public int field3846 = -1;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1091910485
   )
   public int field3840 = -1;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -20558633
   )
   public int field3848 = -1;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lig;I)V",
      garbageValue = "-1311104999"
   )
   @Export("decode")
   public void decode(AbstractArchive var1) {
      byte[] var2 = var1.takeFileFlat(DefaultsGroup.field3837.group);
      Buffer var3 = new Buffer(var2);

      while(true) {
         int var4 = var3.readUnsignedByte();
         if (var4 == 0) {
            return;
         }

         switch(var4) {
         case 1:
            var3.readMedium();
            break;
         case 2:
            this.compass = var3.method5833();
            this.field3847 = var3.method5833();
            this.mapScenes = var3.method5833();
            this.headIconsPk = var3.method5833();
            this.field3838 = var3.method5833();
            this.field3843 = var3.method5833();
            this.field3839 = var3.method5833();
            this.field3845 = var3.method5833();
            this.field3846 = var3.method5833();
            this.field3840 = var3.method5833();
            this.field3848 = var3.method5833();
         }
      }
   }
}
