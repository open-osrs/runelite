import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
public class class248 {
   @ObfuscatedName("e")
   static int[] field1141;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 662119345
   )
   static int field1142;
   @ObfuscatedName("m")
   final HashMap field3267;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lla;"
   )
   Bounds field3263;
   @ObfuscatedName("q")
   int[] field3271;
   @ObfuscatedName("w")
   int[] field3262;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1072223029
   )
   int field3266;

   public class248() {
      this.field3267 = new HashMap();
      this.field3263 = new Bounds(0, 0);
      this.field3271 = new int[2048];
      this.field3262 = new int[2048];
      this.field3266 = 0;
      Login.method2056();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "2027223388"
   )
   void method4716(int var1) {
      int var2 = var1 * 2 + 1;
      double[] var3 = Bounds.method5905(0.0D, (double)((float)var1 / 3.0F), var1);
      double var4 = var3[var1] * var3[var1];
      int[] var6 = new int[var2 * var2];
      boolean var7 = false;

      for (int var8 = 0; var8 < var2; ++var8) {
         for (int var9 = 0; var9 < var2; ++var9) {
            int var10 = var6[var9 + var2 * var8] = (int)(256.0D * (var3[var9] * var3[var8] / var4));
            if (!var7 && var10 > 0) {
               var7 = true;
            }
         }
      }

      Sprite var11 = new Sprite(var6, var2, var2);
      this.field3267.put(var1, var11);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)Lln;",
      garbageValue = "-1847730067"
   )
   Sprite method4718(int var1) {
      if (!this.field3267.containsKey(var1)) {
         this.method4716(var1);
      }

      return (Sprite)this.field3267.get(var1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-703491177"
   )
   public final void method4738(int var1, int var2) {
      if (this.field3266 < this.field3271.length) {
         this.field3271[this.field3266] = var1;
         this.field3262[this.field3266] = var2;
         ++this.field3266;
      }

   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "20019778"
   )
   public final void method4719() {
      this.field3266 = 0;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IILln;FI)V",
      garbageValue = "1523665695"
   )
   public final void method4720(int var1, int var2, Sprite var3, float var4) {
      int var5 = (int)(18.0F * var4);
      Sprite var6 = this.method4718(var5);
      int var7 = var5 * 2 + 1;
      Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
      Bounds var9 = new Bounds(0, 0);
      this.field3263.method29(var7, var7);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for (var10 = 0; var10 < this.field3266; ++var10) {
         var11 = this.field3271[var10];
         var12 = this.field3262[var10];
         int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
         int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5;
         this.field3263.method28(var13, var14);
         this.field3263.method30(var8, var9);
         this.method4721(var6, var3, var9);
      }

      System.nanoTime();
      System.nanoTime();

      for (var10 = 0; var10 < var3.pixels.length; ++var10) {
         if (var3.pixels[var10] == 0) {
            var3.pixels[var10] = -16777216;
         } else {
            var11 = (var3.pixels[var10] + 64 - 1) / 256;
            if (var11 <= 0) {
               var3.pixels[var10] = -16777216;
            } else {
               if (var11 > field1141.length) {
                  var11 = field1141.length;
               }

               var12 = field1141[var11 - 1];
               var3.pixels[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lln;Lln;Lla;B)V",
      garbageValue = "112"
   )
   void method4721(Sprite var1, Sprite var2, Bounds var3) {
      if (var3.field43 != 0 && var3.field44 != 0) {
         int var4 = 0;
         int var5 = 0;
         if (var3.field41 == 0) {
            var4 = var1.subWidth - var3.field43;
         }

         if (var3.field42 == 0) {
            var5 = var1.subHeight - var3.field44;
         }

         int var6 = var4 + var5 * var1.subWidth;
         int var7 = var2.subWidth * var3.field42 + var3.field41;

         for (int var8 = 0; var8 < var3.field44; ++var8) {
            for (int var9 = 0; var9 < var3.field43; ++var9) {
               int var10 = var7++;
               int[] var11 = var2.pixels;
               var11[var10] += var1.pixels[var6++];
            }

            var6 += var1.subWidth - var3.field43;
            var7 += var2.subWidth - var3.field43;
         }
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(ILcg;ZI)I",
      garbageValue = "2033111880"
   )
   static int method4741(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == 3903) {
         var3 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++RouteStrategy.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
         return 1;
      } else if (var0 == 3904) {
         var3 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++RouteStrategy.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
         return 1;
      } else if (var0 == 3905) {
         var3 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++RouteStrategy.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
         return 1;
      } else if (var0 == 3906) {
         var3 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++RouteStrategy.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
         return 1;
      } else if (var0 == 3907) {
         var3 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++RouteStrategy.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
         return 1;
      } else if (var0 == 3908) {
         var3 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++RouteStrategy.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
         return 1;
      } else {
         int var4;
         if (var0 == 3910) {
            var3 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
            var4 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++RouteStrategy.Interpreter_intStackSize - 1] = var4 == 0 ? 1 : 0;
            return 1;
         } else if (var0 == 3911) {
            var3 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
            var4 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++RouteStrategy.Interpreter_intStackSize - 1] = var4 == 2 ? 1 : 0;
            return 1;
         } else if (var0 == 3912) {
            var3 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
            var4 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++RouteStrategy.Interpreter_intStackSize - 1] = var4 == 5 ? 1 : 0;
            return 1;
         } else if (var0 == 3913) {
            var3 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
            var4 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++RouteStrategy.Interpreter_intStackSize - 1] = var4 == 1 ? 1 : 0;
            return 1;
         } else {
            boolean var5;
            if (var0 == 3914) {
               var5 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize] == 1;
               if (FloorDecoration.grandExchangeEvents != null) {
                  FloorDecoration.grandExchangeEvents.sort(GrandExchangeEvents.field373, var5);
               }

               return 1;
            } else if (var0 == 3915) {
               var5 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize] == 1;
               if (FloorDecoration.grandExchangeEvents != null) {
                  FloorDecoration.grandExchangeEvents.sort(GrandExchangeEvents.field372, var5);
               }

               return 1;
            } else if (var0 == 3916) {
               RouteStrategy.Interpreter_intStackSize -= 2;
               var5 = Interpreter.Interpreter_intStack[RouteStrategy.Interpreter_intStackSize] == 1;
               boolean var13 = Interpreter.Interpreter_intStack[RouteStrategy.Interpreter_intStackSize + 1] == 1;
               if (FloorDecoration.grandExchangeEvents != null) {
                  Client.field159.field666 = var13;
                  FloorDecoration.grandExchangeEvents.sort(Client.field159, var5);
               }

               return 1;
            } else if (var0 == 3917) {
               var5 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize] == 1;
               if (FloorDecoration.grandExchangeEvents != null) {
                  FloorDecoration.grandExchangeEvents.sort(GrandExchangeEvents.field371, var5);
               }

               return 1;
            } else if (var0 == 3918) {
               var5 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize] == 1;
               if (FloorDecoration.grandExchangeEvents != null) {
                  FloorDecoration.grandExchangeEvents.sort(GrandExchangeEvents.field374, var5);
               }

               return 1;
            } else if (var0 == 3919) {
               Interpreter.Interpreter_intStack[++RouteStrategy.Interpreter_intStackSize - 1] = FloorDecoration.grandExchangeEvents == null ? 0 : FloorDecoration.grandExchangeEvents.events.size();
               return 1;
            } else {
               GrandExchangeEvent var6;
               if (var0 == 3920) {
                  var3 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
                  var6 = (GrandExchangeEvent)FloorDecoration.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++RouteStrategy.Interpreter_intStackSize - 1] = var6.world;
                  return 1;
               } else if (var0 == 3921) {
                  var3 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
                  var6 = (GrandExchangeEvent)FloorDecoration.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var6.method119();
                  return 1;
               } else if (var0 == 3922) {
                  var3 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
                  var6 = (GrandExchangeEvent)FloorDecoration.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var6.method120();
                  return 1;
               } else if (var0 == 3923) {
                  var3 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
                  var6 = (GrandExchangeEvent)FloorDecoration.grandExchangeEvents.events.get(var3);
                  long var7 = class203.currentTimeMs() - class15.field1113 - var6.field370;
                  int var9 = (int)(var7 / 3600000L);
                  int var10 = (int)((var7 - (long)(var9 * 3600000)) / 60000L);
                  int var11 = (int)((var7 - (long)(var9 * 3600000) - (long)(var10 * 60000)) / 1000L);
                  String var12 = var9 + ":" + var10 / 10 + var10 % 10 + ":" + var11 / 10 + var11 % 10;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var12;
                  return 1;
               } else if (var0 == 3924) {
                  var3 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
                  var6 = (GrandExchangeEvent)FloorDecoration.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++RouteStrategy.Interpreter_intStackSize - 1] = var6.grandExchangeOffer.totalQuantity;
                  return 1;
               } else if (var0 == 3925) {
                  var3 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
                  var6 = (GrandExchangeEvent)FloorDecoration.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++RouteStrategy.Interpreter_intStackSize - 1] = var6.grandExchangeOffer.unitPrice;
                  return 1;
               } else if (var0 == 3926) {
                  var3 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
                  var6 = (GrandExchangeEvent)FloorDecoration.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++RouteStrategy.Interpreter_intStackSize - 1] = var6.grandExchangeOffer.id;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }
}
