import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("Actor")
public abstract class Actor extends Entity {
   @ObfuscatedName("hs")
   @ObfuscatedSignature(
      descriptor = "[Lly;"
   )
   @Export("modIconSprites")
   static IndexedSprite[] modIconSprites;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 136172069
   )
   @Export("x")
   int x;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1402910771
   )
   @Export("y")
   int y;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1011628117
   )
   @Export("rotation")
   int rotation;
   @ObfuscatedName("at")
   @Export("isWalking")
   boolean isWalking = false;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -477017185
   )
   int field1007 = 1;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1508823583
   )
   @Export("playerCycle")
   int playerCycle;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1984168657
   )
   @Export("idleSequence")
   int idleSequence = -1;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 845088399
   )
   @Export("turnLeftSequence")
   int turnLeftSequence = -1;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1336726555
   )
   @Export("turnRightSequence")
   int turnRightSequence = -1;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1451963771
   )
   @Export("walkSequence")
   int walkSequence = -1;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 2000722135
   )
   @Export("walkBackSequence")
   int walkBackSequence = -1;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 207993293
   )
   @Export("walkLeftSequence")
   int walkLeftSequence = -1;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 1423094315
   )
   @Export("walkRightSequence")
   int walkRightSequence = -1;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1748919145
   )
   @Export("runSequence")
   int runSequence = -1;
   @ObfuscatedName("aj")
   @Export("overheadText")
   String overheadText = null;
   @ObfuscatedName("an")
   @Export("isAutoChatting")
   boolean isAutoChatting;
   @ObfuscatedName("ai")
   boolean field968 = false;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -263246735
   )
   @Export("overheadTextCyclesRemaining")
   int overheadTextCyclesRemaining = 100;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1742046101
   )
   @Export("overheadTextColor")
   int overheadTextColor = 0;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -815377649
   )
   @Export("overheadTextEffect")
   int overheadTextEffect = 0;
   @ObfuscatedName("av")
   @Export("hitSplatCount")
   byte hitSplatCount = 0;
   @ObfuscatedName("ao")
   @Export("hitSplatTypes")
   int[] hitSplatTypes = new int[4];
   @ObfuscatedName("bj")
   @Export("hitSplatValues")
   int[] hitSplatValues = new int[4];
   @ObfuscatedName("bn")
   @Export("hitSplatCycles")
   int[] hitSplatCycles = new int[4];
   @ObfuscatedName("bi")
   @Export("hitSplatTypes2")
   int[] hitSplatTypes2 = new int[4];
   @ObfuscatedName("bp")
   @Export("hitSplatValues2")
   int[] hitSplatValues2 = new int[4];
   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("healthBars")
   IterableNodeDeque healthBars = new IterableNodeDeque();
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = -1403434087
   )
   @Export("targetIndex")
   int targetIndex = -1;
   @ObfuscatedName("bx")
   @Export("false0")
   boolean false0 = false;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = 1507873993
   )
   int field981 = -1;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -203452431
   )
   @Export("movementSequence")
   int movementSequence = -1;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -1749828811
   )
   @Export("movementFrame")
   int movementFrame = 0;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = -1321307133
   )
   @Export("movementFrameCycle")
   int movementFrameCycle = 0;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = -1530341969
   )
   @Export("sequence")
   int sequence = -1;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = -1363131469
   )
   @Export("sequenceFrame")
   int sequenceFrame = 0;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 2014778209
   )
   @Export("sequenceFrameCycle")
   int sequenceFrameCycle = 0;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = -1060389691
   )
   @Export("sequenceDelay")
   int sequenceDelay = 0;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = 1582636697
   )
   int field973 = 0;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = -1271026177
   )
   @Export("spotAnimation")
   int spotAnimation = -1;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -416499547
   )
   @Export("spotAnimationFrame")
   int spotAnimationFrame = 0;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 1172946753
   )
   @Export("spotAnimationFrameCycle")
   int spotAnimationFrameCycle = 0;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = 1898700159
   )
   int field993;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = -2097471137
   )
   int field994;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -1384002081
   )
   int field992;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = -2137511937
   )
   int field996;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -2030426109
   )
   int field952;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -593176361
   )
   int field998;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = 798187101
   )
   int field999;
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      intValue = 145719275
   )
   int field1000;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = 423082639
   )
   int field1001;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = -724191925
   )
   @Export("npcCycle")
   int npcCycle = 0;
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      intValue = -250505211
   )
   @Export("defaultHeight")
   int defaultHeight = 200;
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      intValue = 373581305
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("cp")
   @ObfuscatedGetter(
      intValue = -1380674587
   )
   int field957 = 0;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = -1991830867
   )
   int field1006 = 32;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = 1201240635
   )
   @Export("pathLength")
   int pathLength = 0;
   @ObfuscatedName("cj")
   @Export("pathX")
   int[] pathX = new int[10];
   @ObfuscatedName("cr")
   @Export("pathY")
   int[] pathY = new int[10];
   @ObfuscatedName("ca")
   @Export("pathTraversed")
   byte[] pathTraversed = new byte[10];
   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      intValue = 349923111
   )
   int field989 = 0;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = -1293926575
   )
   int field1012 = 0;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-251916247"
   )
   @Export("isVisible")
   boolean isVisible() {
      return false;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1387787360"
   )
   final void method1848() {
      this.pathLength = 0;
      this.field1012 = 0;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIB)V",
      garbageValue = "104"
   )
   @Export("addHitSplat")
   final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         if (this.hitSplatCycles[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      var9 = -1;
      int var10 = -1;
      int var11 = 0;
      if (var1 >= 0) {
         HitSplatDefinition var12 = ScriptFrame.method1222(var1);
         var10 = var12.field3375;
         var11 = var12.field3364;
      }

      int var14;
      if (var8) {
         if (var10 == -1) {
            return;
         }

         var9 = 0;
         var14 = 0;
         if (var10 == 0) {
            var14 = this.hitSplatCycles[0];
         } else if (var10 == 1) {
            var14 = this.hitSplatValues[0];
         }

         for(int var13 = 1; var13 < 4; ++var13) {
            if (var10 == 0) {
               if (this.hitSplatCycles[var13] < var14) {
                  var9 = var13;
                  var14 = this.hitSplatCycles[var13];
               }
            } else if (var10 == 1 && this.hitSplatValues[var13] < var14) {
               var9 = var13;
               var14 = this.hitSplatValues[var13];
            }
         }

         if (var10 == 1 && var14 >= var2) {
            return;
         }
      } else {
         if (var7) {
            this.hitSplatCount = 0;
         }

         for(var14 = 0; var14 < 4; ++var14) {
            byte var15 = this.hitSplatCount;
            this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
            if (this.hitSplatCycles[var15] <= var5) {
               var9 = var15;
               break;
            }
         }
      }

      if (var9 >= 0) {
         this.hitSplatTypes[var9] = var1;
         this.hitSplatValues[var9] = var2;
         this.hitSplatTypes2[var9] = var3;
         this.hitSplatValues2[var9] = var4;
         this.hitSplatCycles[var9] = var5 + var11 + var6;
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIB)V",
      garbageValue = "0"
   )
   @Export("addHealthBar")
   final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
      HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
      HealthBarDefinition var7;
      if (var8 != null) {
         var7 = var8;
      } else {
         byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
         var8 = new HealthBarDefinition();
         if (var9 != null) {
            var8.decode(new Buffer(var9));
         }

         HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long)var1);
         var7 = var8;
      }

      var8 = var7;
      HealthBar var14 = null;
      HealthBar var10 = null;
      int var11 = var7.int2;
      int var12 = 0;

      HealthBar var13;
      for(var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) {
         ++var12;
         if (var13.definition.field3312 == var8.field3312) {
            var13.put(var2 + var4, var5, var6, var3);
            return;
         }

         if (var13.definition.int1 <= var8.int1) {
            var14 = var13;
         }

         if (var13.definition.int2 > var11) {
            var10 = var13;
            var11 = var13.definition.int2;
         }
      }

      if (var10 != null || var12 < 4) {
         var13 = new HealthBar(var8);
         if (var14 == null) {
            this.healthBars.addLast(var13);
         } else {
            IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14);
         }

         var13.put(var2 + var4, var5, var6, var3);
         if (var12 >= 4) {
            var10.remove();
         }

      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "24"
   )
   @Export("removeHealthBar")
   final void removeHealthBar(int var1) {
      HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
      HealthBarDefinition var2;
      if (var3 != null) {
         var2 = var3;
      } else {
         byte[] var4 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
         var3 = new HealthBarDefinition();
         if (var4 != null) {
            var3.decode(new Buffer(var4));
         }

         HealthBarDefinition.HealthBarDefinition_cached.put(var3, (long)var1);
         var2 = var3;
      }

      var3 = var2;

      for(HealthBar var5 = (HealthBar)this.healthBars.last(); var5 != null; var5 = (HealthBar)this.healthBars.previous()) {
         if (var3 == var5.definition) {
            var5.remove();
            return;
         }
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "424984717"
   )
   public static void method1867(boolean var0) {
      if (class297.NetCache_socket != null) {
         try {
            Buffer var1 = new Buffer(4);
            var1.writeByte(var0 ? 2 : 3);
            var1.writeMedium(0);
            class297.NetCache_socket.write(var1.array, 0, 4);
         } catch (IOException var4) {
            try {
               class297.NetCache_socket.close();
            } catch (Exception var3) {
               ;
            }

            ++NetCache.NetCache_ioExceptions;
            class297.NetCache_socket = null;
         }

      }
   }

   @ObfuscatedName("fu")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1068788857"
   )
   static final void method1868() {
      int[] var0 = Players.Players_indices;

      int var1;
      for(var1 = 0; var1 < Players.Players_count; ++var1) {
         Player var4 = Client.players[var0[var1]];
         if (var4 != null && var4.overheadTextCyclesRemaining > 0) {
            --var4.overheadTextCyclesRemaining;
            if (var4.overheadTextCyclesRemaining == 0) {
               var4.overheadText = null;
            }
         }
      }

      for(var1 = 0; var1 < Client.npcCount; ++var1) {
         int var2 = Client.npcIndices[var1];
         NPC var3 = Client.npcs[var2];
         if (var3 != null && var3.overheadTextCyclesRemaining > 0) {
            --var3.overheadTextCyclesRemaining;
            if (var3.overheadTextCyclesRemaining == 0) {
               var3.overheadText = null;
            }
         }
      }

   }
}
