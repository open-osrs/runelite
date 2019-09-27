import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enumerated {
      @ObfuscatedName("z")
      @ObfuscatedSignature(
            signature = "Ls;"
      )
      @Export("WORLDMAPSECTIONTYPE0")
      WORLDMAPSECTIONTYPE0(0, (byte)0),
      @ObfuscatedName("n")
      @ObfuscatedSignature(
            signature = "Ls;"
      )
      @Export("WORLDMAPSECTIONTYPE1")
      WORLDMAPSECTIONTYPE1(3, (byte)1),
      @ObfuscatedName("v")
      @ObfuscatedSignature(
            signature = "Ls;"
      )
      @Export("WORLDMAPSECTIONTYPE2")
      WORLDMAPSECTIONTYPE2(2, (byte)2),
      @ObfuscatedName("u")
      @ObfuscatedSignature(
            signature = "Ls;"
      )
      @Export("WORLDMAPSECTIONTYPE3")
      WORLDMAPSECTIONTYPE3(1, (byte)3);

      @ObfuscatedName("c")
      @Export("musicTrackBoolean")
      public static boolean musicTrackBoolean;
      @ObfuscatedName("bk")
      static String field150;
      @ObfuscatedName("r")
      @ObfuscatedGetter(
            intValue = 19347147
      )
      @Export("type")
      final int type;
      // $FF: renamed from: id byte
      @ObfuscatedName("p")
      @Export("id")
      final byte field_51;

      WorldMapSectionType(int var3, byte var4) {
            this.type = var3;
            this.field_51 = var4;
      }

      @ObfuscatedName("v")
      @ObfuscatedSignature(
            signature = "(S)I",
            garbageValue = "221"
      )
      @Export("rsOrdinal")
      public int rsOrdinal() {
            return this.field_51;
      }

      @ObfuscatedName("jf")
      @ObfuscatedSignature(
            signature = "(Lho;I)V",
            garbageValue = "529400812"
      )
      @Export("invalidateWidget")
      static void invalidateWidget(Widget var0) {
            if (var0.cycle == Client.field638) {
                  Client.field841[var0.rootIndex] = true;
            }

      }

      @ObfuscatedName("ks")
      @ObfuscatedSignature(
            signature = "(Lho;B)Z",
            garbageValue = "7"
      )
      @Export("isComponentHidden")
      static boolean isComponentHidden(Widget var0) {
            return var0.isHidden;
      }

      @ObfuscatedName("kj")
      @ObfuscatedSignature(
            signature = "(Ljava/lang/String;I)Ljava/lang/String;",
            garbageValue = "-1617760184"
      )
      @Export("removeImageTag")
      static String removeImageTag(String var0) {
            PlayerType[] var1 = class226.PlayerType_values();

            for(int var2 = 0; var2 < var1.length; ++var2) {
                  PlayerType var3 = var1[var2];
                  if (var3.modIcon != -1 && var0.startsWith(class247.getModIconString(var3.modIcon))) {
                        var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
                        break;
                  }
            }

            return var0;
      }
}
