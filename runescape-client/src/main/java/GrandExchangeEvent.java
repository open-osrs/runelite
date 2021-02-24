import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
   @ObfuscatedName("gw")
   @ObfuscatedGetter(
      intValue = 646144783
   )
   static int field82;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -327146803
   )
   @Export("world")
   public final int world;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      longValue = 986642853943479863L
   )
   @Export("age")
   public final long age;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lg;"
   )
   @Export("grandExchangeOffer")
   public final GrandExchangeOffer grandExchangeOffer;
   @ObfuscatedName("c")
   @Export("offerName")
   String offerName;
   @ObfuscatedName("y")
   @Export("previousOfferName")
   String previousOfferName;

   @ObfuscatedSignature(
      descriptor = "(Lkx;BI)V"
   )
   GrandExchangeEvent(Buffer var1, byte var2, int var3) {
      this.offerName = var1.readStringCp1252NullTerminated();
      this.previousOfferName = var1.readStringCp1252NullTerminated();
      this.world = var1.readUnsignedShort();
      this.age = var1.readLong();
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      this.grandExchangeOffer = new GrandExchangeOffer();
      this.grandExchangeOffer.method166(2);
      this.grandExchangeOffer.method168(var2);
      this.grandExchangeOffer.unitPrice = var4;
      this.grandExchangeOffer.totalQuantity = var5;
      this.grandExchangeOffer.currentQuantity = 0;
      this.grandExchangeOffer.currentPrice = 0;
      this.grandExchangeOffer.id = var3;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "73"
   )
   @Export("getOfferName")
   public String getOfferName() {
      return this.offerName;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "59"
   )
   @Export("getPreviousOfferName")
   public String getPreviousOfferName() {
      return this.previousOfferName;
   }

   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      descriptor = "(Lcv;I)V",
      garbageValue = "878562406"
   )
   static final void method147(Actor var0) {
      int var1 = Math.max(1, var0.field999 - Client.cycle);
      int var2 = var0.field992 * 128 + var0.field1007 * 64;
      int var3 = var0.field952 * 128 + var0.field1007 * 64;
      var0.x += (var2 - var0.x) / var1;
      var0.y += (var3 - var0.y) / var1;
      var0.field989 = 0;
      var0.orientation = var0.field1001;
   }

   @ObfuscatedName("jm")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1637672427"
   )
   @Export("Widget_resetModelFrames")
   static final void Widget_resetModelFrames(int var0) {
      if (WorldMapCacheName.loadInterface(var0)) {
         Widget[] var1 = DefaultsGroup.Widget_interfaceComponents[var0];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            Widget var3 = var1[var2];
            if (var3 != null) {
               var3.modelFrame = 0;
               var3.modelFrameCycle = 0;
            }
         }

      }
   }
}
