import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("PcmPlayer")
public class PcmPlayer {
   @ObfuscatedName("h")
   @Export("PcmPlayer_stereo")
   public static boolean PcmPlayer_stereo;
   @ObfuscatedName("e")
   @Export("soundSystemExecutor")
   static ScheduledExecutorService soundSystemExecutor;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 967437073
   )
   public static int field1419;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Ldp;"
   )
   @Export("soundSystem")
   static SoundSystem soundSystem;
   @ObfuscatedName("ai")
   @Export("hasFocus")
   protected static boolean hasFocus;
   @ObfuscatedName("w")
   @Export("samples")
   protected int[] samples;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Ldw;"
   )
   @Export("stream")
   PcmStream stream;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -464372219
   )
   int field1424 = 32;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      longValue = 2749366115172109131L
   )
   @Export("timeMs")
   long timeMs = Tiles.currentTimeMillis();
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 167448973
   )
   @Export("capacity")
   int capacity;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 237802631
   )
   int field1427;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1086019069
   )
   int field1430;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      longValue = 5727430496503551515L
   )
   long field1429 = 0L;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 319512497
   )
   int field1428 = 0;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1292152149
   )
   int field1439 = 0;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -264782125
   )
   int field1432 = 0;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      longValue = 4709147703826691947L
   )
   long field1425 = 0L;
   @ObfuscatedName("j")
   boolean field1433 = true;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1127821299
   )
   int field1417 = 0;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "[Ldw;"
   )
   PcmStream[] field1437 = new PcmStream[8];
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "[Ldw;"
   )
   PcmStream[] field1438 = new PcmStream[8];

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   @Export("init")
   protected void init() throws Exception {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1929759603"
   )
   @Export("open")
   protected void open(int var1) throws Exception {
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "6543"
   )
   @Export("position")
   protected int position() throws Exception {
      return this.capacity;
   }

   @ObfuscatedName("c")
   @Export("write")
   protected void write() throws Exception {
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "64"
   )
   @Export("close")
   protected void close() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-674709942"
   )
   @Export("discard")
   protected void discard() throws Exception {
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Ldw;I)V",
      garbageValue = "-1612898797"
   )
   @Export("setStream")
   public final synchronized void setStream(PcmStream var1) {
      this.stream = var1;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-310510465"
   )
   @Export("run")
   public final synchronized void run() {
      if (this.samples != null) {
         long var1 = Tiles.currentTimeMillis();

         try {
            if (this.field1429 != 0L) {
               if (var1 < this.field1429) {
                  return;
               }

               this.open(this.capacity);
               this.field1429 = 0L;
               this.field1433 = true;
            }

            int var3 = this.position();
            if (this.field1432 - var3 > this.field1428) {
               this.field1428 = this.field1432 - var3;
            }

            int var4 = this.field1427 + this.field1430;
            if (var4 + 256 > 16384) {
               var4 = 16128;
            }

            if (var4 + 256 > this.capacity) {
               this.capacity += 1024;
               if (this.capacity > 16384) {
                  this.capacity = 16384;
               }

               this.close();
               this.open(this.capacity);
               var3 = 0;
               this.field1433 = true;
               if (var4 + 256 > this.capacity) {
                  var4 = this.capacity - 256;
                  this.field1430 = var4 - this.field1427;
               }
            }

            while(var3 < var4) {
               this.fill(this.samples, 256);
               this.write();
               var3 += 256;
            }

            if (var1 > this.field1425) {
               if (!this.field1433) {
                  if (this.field1428 == 0 && this.field1439 == 0) {
                     this.close();
                     this.field1429 = 2000L + var1;
                     return;
                  }

                  this.field1430 = Math.min(this.field1439, this.field1428);
                  this.field1439 = this.field1428;
               } else {
                  this.field1433 = false;
               }

               this.field1428 = 0;
               this.field1425 = 2000L + var1;
            }

            this.field1432 = var3;
         } catch (Exception var7) {
            this.close();
            this.field1429 = 2000L + var1;
         }

         try {
            if (var1 > 500000L + this.timeMs) {
               var1 = this.timeMs;
            }

            while(var1 > this.timeMs + 5000L) {
               this.skip(256);
               this.timeMs += (long)(256000 / (StructComposition.field3338 * 22050));
            }
         } catch (Exception var6) {
            this.timeMs = var1;
         }

      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   public final void method2612() {
      this.field1433 = true;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-44"
   )
   @Export("tryDiscard")
   public final synchronized void tryDiscard() {
      this.field1433 = true;

      try {
         this.discard();
      } catch (Exception var2) {
         this.close();
         this.field1429 = Tiles.currentTimeMillis() + 2000L;
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "10262"
   )
   @Export("shutdown")
   public final synchronized void shutdown() {
      if (soundSystem != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if (this == soundSystem.players[var2]) {
               soundSystem.players[var2] = null;
            }

            if (soundSystem.players[var2] != null) {
               var1 = false;
            }
         }

         if (var1) {
            soundSystemExecutor.shutdownNow();
            soundSystemExecutor = null;
            soundSystem = null;
         }
      }

      this.close();
      this.samples = null;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-108727695"
   )
   @Export("skip")
   final void skip(int var1) {
      this.field1417 -= var1;
      if (this.field1417 < 0) {
         this.field1417 = 0;
      }

      if (this.stream != null) {
         this.stream.skip(var1);
      }

   }

   @ObfuscatedName("ak")
   @Export("fill")
   final void fill(int[] var1, int var2) {
      int var3 = var2;
      if (PcmPlayer_stereo) {
         var3 = var2 << 1;
      }

      class311.clearIntArray(var1, 0, var3);
      this.field1417 -= var2;
      if (this.stream != null && this.field1417 <= 0) {
         this.field1417 += StructComposition.field3338 * 22050 >> 4;
         ReflectionCheck.PcmStream_disable(this.stream);
         this.method2658(this.stream, this.stream.vmethod2880());
         int var4 = 0;
         int var5 = 255;

         int var6;
         PcmStream var10;
         label109:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if ((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  PcmStream var11 = this.field1437[var7];

                  label103:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label103;
                        }

                        AbstractSound var12 = var11.sound;
                        if (var12 != null && var12.position > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.after;
                        } else {
                           var11.active = true;
                           int var13 = var11.vmethod4099();
                           var4 += var13;
                           if (var12 != null) {
                              var12.position += var13;
                           }

                           if (var4 >= this.field1424) {
                              break label109;
                           }

                           PcmStream var14 = var11.firstSubStream();
                           if (var14 != null) {
                              for(int var15 = var11.field1511; var14 != null; var14 = var11.nextSubStream()) {
                                 this.method2658(var14, var15 * var14.vmethod2880() >> 8);
                              }
                           }

                           PcmStream var18 = var11.after;
                           var11.after = null;
                           if (var10 == null) {
                              this.field1437[var7] = var18;
                           } else {
                              var10.after = var18;
                           }

                           if (var18 == null) {
                              this.field1438[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            PcmStream var16 = this.field1437[var6];
            PcmStream[] var17 = this.field1437;
            this.field1438[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.after;
               var16.after = null;
            }
         }
      }

      if (this.field1417 < 0) {
         this.field1417 = 0;
      }

      if (this.stream != null) {
         this.stream.fill(var1, 0, var2);
      }

      this.timeMs = Tiles.currentTimeMillis();
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Ldw;IB)V",
      garbageValue = "-16"
   )
   final void method2658(PcmStream var1, int var2) {
      int var3 = var2 >> 5;
      PcmStream var4 = this.field1438[var3];
      if (var4 == null) {
         this.field1437[var3] = var1;
      } else {
         var4.after = var1;
      }

      this.field1438[var3] = var1;
      var1.field1511 = var2;
   }

   @ObfuscatedName("ho")
   @ObfuscatedSignature(
      descriptor = "(IIZI)V",
      garbageValue = "-392680019"
   )
   static final void method2661(int var0, int var1, boolean var2) {
      if (!var2 || var0 != class3.field24 || class39.field284 != var1) {
         class3.field24 = var0;
         class39.field284 = var1;
         ItemContainer.updateGameState(25);
         WorldMapIcon_1.drawLoadingMessage("Loading - please wait.", true);
         int var3 = GrandExchangeOfferNameComparator.baseX * 64;
         int var4 = NetCache.baseY * 64;
         GrandExchangeOfferNameComparator.baseX = (var0 - 6) * 8;
         NetCache.baseY = (var1 - 6) * 8;
         int var5 = GrandExchangeOfferNameComparator.baseX * 64 - var3;
         int var6 = NetCache.baseY * 64 - var4;
         var3 = GrandExchangeOfferNameComparator.baseX * 64;
         var4 = NetCache.baseY * 64;

         int var7;
         int var9;
         for(var7 = 0; var7 < 32768; ++var7) {
            NPC var19 = Client.npcs[var7];
            if (var19 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var19.pathX[var9] -= var5;
                  var19.pathY[var9] -= var6;
               }

               var19.x -= var5 * 128;
               var19.y -= var6 * 128;
            }
         }

         for(var7 = 0; var7 < 2048; ++var7) {
            Player var22 = Client.players[var7];
            if (var22 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var22.pathX[var9] -= var5;
                  var22.pathY[var9] -= var6;
               }

               var22.x -= var5 * 128;
               var22.y -= var6 * 128;
            }
         }

         byte var20 = 0;
         byte var8 = 104;
         byte var21 = 1;
         if (var5 < 0) {
            var20 = 103;
            var8 = -1;
            var21 = -1;
         }

         byte var10 = 0;
         byte var11 = 104;
         byte var12 = 1;
         if (var6 < 0) {
            var10 = 103;
            var11 = -1;
            var12 = -1;
         }

         int var14;
         for(int var13 = var20; var13 != var8; var13 += var21) {
            for(var14 = var10; var11 != var14; var14 += var12) {
               int var15 = var5 + var13;
               int var16 = var6 + var14;

               for(int var17 = 0; var17 < 4; ++var17) {
                  if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                     Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
                  } else {
                     Client.groundItems[var17][var13][var14] = null;
                  }
               }
            }
         }

         for(PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) {
            var18.x -= var5;
            var18.y -= var6;
            if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) {
               var18.remove();
            }
         }

         if (Client.destinationX != 0) {
            Client.destinationX -= var5;
            Client.destinationY -= var6;
         }

         Client.soundEffectCount = 0;
         Client.isCameraLocked = false;
         SecureRandomFuture.cameraX -= var5 << 7;
         ObjectSound.cameraZ -= var6 << 7;
         HealthBarUpdate.oculusOrbFocalPointX -= var5 << 7;
         ApproximateRouteStrategy.oculusOrbFocalPointY -= var6 << 7;
         Client.field889 = -1;
         Client.graphicsObjects.clear();
         Client.projectiles.clear();

         for(var14 = 0; var14 < 4; ++var14) {
            Client.collisionMaps[var14].clear();
         }

      }
   }
}
