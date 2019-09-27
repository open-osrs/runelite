import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("StudioGame")
public enum StudioGame implements Enumerated {
      @ObfuscatedName("z")
      @ObfuscatedSignature(
            signature = "Lha;"
      )
      @Export("runescape")
      runescape("runescape", "RuneScape", 0),
      @ObfuscatedName("n")
      @ObfuscatedSignature(
            signature = "Lha;"
      )
      @Export("stellardawn")
      stellardawn("stellardawn", "Stellar Dawn", 1),
      @ObfuscatedName("v")
      @ObfuscatedSignature(
            signature = "Lha;"
      )
      @Export("game3")
      game3("game3", "Game 3", 2),
      @ObfuscatedName("u")
      @ObfuscatedSignature(
            signature = "Lha;"
      )
      @Export("game4")
      game4("game4", "Game 4", 3),
      @ObfuscatedName("r")
      @ObfuscatedSignature(
            signature = "Lha;"
      )
      @Export("game5")
      game5("game5", "Game 5", 4),
      @ObfuscatedName("p")
      @ObfuscatedSignature(
            signature = "Lha;"
      )
      @Export("oldscape")
      oldscape("oldscape", "RuneScape 2007", 5);

      @ObfuscatedName("sy")
      @ObfuscatedSignature(
            signature = "Lib;"
      )
      public static class237 field3086;
      @ObfuscatedName("q")
      @Export("name")
      public final String name;
      // $FF: renamed from: id int
      @ObfuscatedName("m")
      @ObfuscatedGetter(
            intValue = 275633543
      )
      @Export("id")
      final int field_52;

      StudioGame(String var3, String var4, int var5) {
            this.name = var3;
            this.field_52 = var5;
      }

      @ObfuscatedName("v")
      @ObfuscatedSignature(
            signature = "(S)I",
            garbageValue = "221"
      )
      @Export("rsOrdinal")
      public int rsOrdinal() {
            return this.field_52;
      }

      @ObfuscatedName("n")
      @ObfuscatedSignature(
            signature = "(II)Lig;",
            garbageValue = "-61677673"
      )
      public static class239 method4096(int var0) {
            class239 var1 = (class239)class239.field3178.get((long)var0);
            if (var1 != null) {
                  return var1;
            } else {
                  byte[] var2 = class239.InvDefinition_archive.takeFile(5, var0);
                  var1 = new class239();
                  if (var2 != null) {
                        var1.method4311(new Buffer(var2));
                  }

                  class239.field3178.put(var1, (long)var0);
                  return var1;
            }
      }
}
