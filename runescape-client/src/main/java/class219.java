import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hh")
public class class219 {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lhp;"
   )
   @Export("huffman")
   public static Huffman huffman;

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZI)I",
      garbageValue = "-1015901506"
   )
   static int method4173(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
         return 1;
      } else {
         int var13;
         if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0;
            return 1;
         } else {
            boolean var12;
            if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
               var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               if (WorldMapSectionType.grandExchangeEvents != null) {
                  WorldMapSectionType.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
               var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               if (WorldMapSectionType.grandExchangeEvents != null) {
                  WorldMapSectionType.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
               Interpreter.Interpreter_intStackSize -= 2;
               var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1;
               boolean var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
               if (WorldMapSectionType.grandExchangeEvents != null) {
                  Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
                  WorldMapSectionType.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
               var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               if (WorldMapSectionType.grandExchangeEvents != null) {
                  WorldMapSectionType.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
               var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               if (WorldMapSectionType.grandExchangeEvents != null) {
                  WorldMapSectionType.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSectionType.grandExchangeEvents == null ? 0 : WorldMapSectionType.grandExchangeEvents.events.size();
               return 1;
            } else {
               GrandExchangeEvent var4;
               if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)WorldMapSectionType.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.world;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)WorldMapSectionType.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getOfferName();
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)WorldMapSectionType.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName();
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)WorldMapSectionType.grandExchangeEvents.events.get(var3);
                  long var5 = Tiles.currentTimeMillis() - class9.field57 - var4.age;
                  int var7 = (int)(var5 / 3600000L);
                  int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
                  int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * '\uea60')) / 1000L);
                  String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)WorldMapSectionType.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)WorldMapSectionType.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)WorldMapSectionType.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   @ObfuscatedName("jf")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "74818443"
   )
   static void method4171() {
      for(InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
         int var1 = var0.group;
         if (WorldMapCacheName.loadInterface(var1)) {
            boolean var2 = true;
            Widget[] var3 = DefaultsGroup.Widget_interfaceComponents[var1];

            int var4;
            for(var4 = 0; var4 < var3.length; ++var4) {
               if (var3[var4] != null) {
                  var2 = var3[var4].isIf3;
                  break;
               }
            }

            if (!var2) {
               var4 = (int)var0.key;
               Widget var5 = class237.getWidget(var4);
               if (var5 != null) {
                  IsaacCipher.invalidateWidget(var5);
               }
            }
         }
      }

   }

   @ObfuscatedName("kp")
   @ObfuscatedSignature(
      descriptor = "(IIII)Lbs;",
      garbageValue = "-1314120201"
   )
   static final InterfaceParent method4172(int var0, int var1, int var2) {
      InterfaceParent var3 = new InterfaceParent();
      var3.group = var1;
      var3.type = var2;
      Client.interfaceParents.put(var3, (long)var0);
      GrandExchangeEvent.Widget_resetModelFrames(var1);
      Widget var4 = class237.getWidget(var0);
      IsaacCipher.invalidateWidget(var4);
      if (Client.meslayerContinueWidget != null) {
         IsaacCipher.invalidateWidget(Client.meslayerContinueWidget);
         Client.meslayerContinueWidget = null;
      }

      AbstractWorldMapData.method352();
      class182.revalidateWidgetScroll(DefaultsGroup.Widget_interfaceComponents[var0 >> 16], var4, false);
      SoundSystem.runWidgetOnLoadListener(var1);
      if (Client.rootInterface != -1) {
         class228.runIntfCloseListeners(Client.rootInterface, 1);
      }

      return var3;
   }
}
