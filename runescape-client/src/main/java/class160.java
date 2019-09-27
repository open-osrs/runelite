import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public enum class160 implements Enumerated {
      @ObfuscatedName("z")
      @ObfuscatedSignature(
            signature = "Lff;"
      )
      field1979(3, 0),
      @ObfuscatedName("n")
      @ObfuscatedSignature(
            signature = "Lff;"
      )
      field1976(1, 1),
      @ObfuscatedName("v")
      @ObfuscatedSignature(
            signature = "Lff;"
      )
      field1985(2, 2),
      @ObfuscatedName("u")
      @ObfuscatedSignature(
            signature = "Lff;"
      )
      field1977(0, 3);

      @ObfuscatedName("ei")
      @Export("worldHost")
      static String worldHost;
      @ObfuscatedName("r")
      @ObfuscatedGetter(
            intValue = -1676935957
      )
      public final int field1984;
      // $FF: renamed from: id int
      @ObfuscatedName("p")
      @ObfuscatedGetter(
            intValue = 1779758939
      )
      @Export("id")
      final int field_58;

      class160(int var3, int var4) {
            this.field1984 = var3;
            this.field_58 = var4;
      }

      @ObfuscatedName("v")
      @ObfuscatedSignature(
            signature = "(S)I",
            garbageValue = "221"
      )
      @Export("rsOrdinal")
      public int rsOrdinal() {
            return this.field_58;
      }

      @ObfuscatedName("o")
      @ObfuscatedSignature(
            signature = "(IIB)I",
            garbageValue = "18"
      )
      static final int method3412(int var0, int var1) {
            int var2 = var0 + var1 * 57;
            var2 ^= var2 << 13;
            int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
            return var3 >> 19 & 255;
      }

      @ObfuscatedName("gz")
      @ObfuscatedSignature(
            signature = "(B)V",
            garbageValue = "-44"
      )
      static final void method3413() {
            for(PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
                  if (var0.hitpoints > 0) {
                        --var0.hitpoints;
                  }

                  boolean var1;
                  int var2;
                  int var3;
                  ObjectDefinition var4;
                  if (var0.hitpoints == 0) {
                        if (var0.objectId >= 0) {
                              var2 = var0.objectId;
                              var3 = var0.field921;
                              var4 = GrandExchangeOfferOwnWorldComparator.getObjectDefinition(var2);
                              if (var3 == 11) {
                                    var3 = 10;
                              }

                              if (var3 >= 5 && var3 <= 8) {
                                    var3 = 4;
                              }

                              var1 = var4.method4555(var3);
                              if (!var1) {
                                    continue;
                              }
                        }

                        class1.addPendingSpawnToScene(var0.plane, var0.type, var0.field_4, var0.field_5, var0.objectId, var0.field922, var0.field921);
                        var0.remove();
                  } else {
                        if (var0.delay > 0) {
                              --var0.delay;
                        }

                        if (var0.delay == 0 && var0.field_4 >= 1 && var0.field_5 >= 1 && var0.field_4 <= 102 && var0.field_5 <= 102) {
                              if (var0.field_6 >= 0) {
                                    var2 = var0.field_6;
                                    var3 = var0.field916;
                                    var4 = GrandExchangeOfferOwnWorldComparator.getObjectDefinition(var2);
                                    if (var3 == 11) {
                                          var3 = 10;
                                    }

                                    if (var3 >= 5 && var3 <= 8) {
                                          var3 = 4;
                                    }

                                    var1 = var4.method4555(var3);
                                    if (!var1) {
                                          continue;
                                    }
                              }

                              class1.addPendingSpawnToScene(var0.plane, var0.type, var0.field_4, var0.field_5, var0.field_6, var0.orientation, var0.field916);
                              var0.delay = -1;
                              if (var0.objectId == var0.field_6 && var0.objectId == -1) {
                                    var0.remove();
                              } else if (var0.field_6 == var0.objectId && var0.field922 == var0.orientation && var0.field921 == var0.field916) {
                                    var0.remove();
                              }
                        }
                  }
            }

      }
}
