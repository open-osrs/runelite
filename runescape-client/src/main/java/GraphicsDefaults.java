import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
      @ObfuscatedName("fz")
      @ObfuscatedSignature(
            signature = "Lkn;"
      )
      @Export("fontPlain12")
      static Font fontPlain12;
      @ObfuscatedName("z")
      @ObfuscatedGetter(
            intValue = 1913101075
      )
      @Export("compass")
      public int compass = -1;
      @ObfuscatedName("n")
      @ObfuscatedGetter(
            intValue = -245940859
      )
      public int field3797 = -1;
      @ObfuscatedName("v")
      @ObfuscatedGetter(
            intValue = 2030709025
      )
      @Export("mapScenes")
      public int mapScenes = -1;
      @ObfuscatedName("u")
      @ObfuscatedGetter(
            intValue = 936076039
      )
      @Export("headIconsPk")
      public int headIconsPk = -1;
      @ObfuscatedName("r")
      @ObfuscatedGetter(
            intValue = -1090087377
      )
      public int field3800 = -1;
      @ObfuscatedName("p")
      @ObfuscatedGetter(
            intValue = 1274199689
      )
      public int field3796 = -1;
      @ObfuscatedName("q")
      @ObfuscatedGetter(
            intValue = 423516137
      )
      public int field3802 = -1;
      @ObfuscatedName("m")
      @ObfuscatedGetter(
            intValue = 1649613365
      )
      public int field3803 = -1;
      @ObfuscatedName("y")
      @ObfuscatedGetter(
            intValue = -1828299055
      )
      public int field3804 = -1;
      @ObfuscatedName("i")
      @ObfuscatedGetter(
            intValue = 495147529
      )
      public int field3807 = -1;
      @ObfuscatedName("c")
      @ObfuscatedGetter(
            intValue = 1539500843
      )
      public int field3806 = -1;

      @ObfuscatedName("z")
      @ObfuscatedSignature(
            signature = "(Lhp;I)V",
            garbageValue = "1722575536"
      )
      @Export("decode")
      public void decode(AbstractArchive var1) {
            byte[] var2 = var1.takeFileFlat(DefaultsGroup.field3794.group);
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
                        this.compass = var3.method5438();
                        this.field3797 = var3.method5438();
                        this.mapScenes = var3.method5438();
                        this.headIconsPk = var3.method5438();
                        this.field3800 = var3.method5438();
                        this.field3796 = var3.method5438();
                        this.field3802 = var3.method5438();
                        this.field3803 = var3.method5438();
                        this.field3804 = var3.method5438();
                        this.field3807 = var3.method5438();
                        this.field3806 = var3.method5438();
                  }
            }
      }
}
