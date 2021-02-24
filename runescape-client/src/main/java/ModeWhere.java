import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("ModeWhere")
public enum ModeWhere implements Enumerated {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lgw;"
   )
   field2420("", 0, new class200[]{class200.field2397}),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lgw;"
   )
   field2402("", 1, new class200[]{class200.field2398, class200.field2397}),
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lgw;"
   )
   field2404("", 2, new class200[]{class200.field2398, class200.field2401, class200.field2397}),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lgw;"
   )
   field2405("", 3, new class200[]{class200.field2398}),
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lgw;"
   )
   field2403("", 4),
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lgw;"
   )
   field2407("", 5, new class200[]{class200.field2398, class200.field2397}),
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lgw;"
   )
   field2408("", 6, new class200[]{class200.field2397}),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lgw;"
   )
   field2415("", 8, new class200[]{class200.field2398, class200.field2397}),
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lgw;"
   )
   field2410("", 9, new class200[]{class200.field2398, class200.field2401}),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lgw;"
   )
   field2411("", 10, new class200[]{class200.field2398}),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lgw;"
   )
   field2412("", 11, new class200[]{class200.field2398}),
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Lgw;"
   )
   field2413("", 12, new class200[]{class200.field2398, class200.field2397}),
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lgw;"
   )
   field2414("", 13, new class200[]{class200.field2398});

   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      intValue = -1707495011
   )
   public static int field2417;
   @ObfuscatedName("dw")
   @ObfuscatedSignature(
      descriptor = "Liy;"
   )
   @Export("archive8")
   static Archive archive8;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 505828619
   )
   @Export("id")
   final int id;
   @ObfuscatedName("k")
   final Set field2416 = new HashSet();

   static {
      method3870();
   }

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I[Lgx;)V"
   )
   ModeWhere(String var3, int var4, class200[] var5) {
      this.id = var4;
      class200[] var6 = var5;

      for(int var7 = 0; var7 < var6.length; ++var7) {
         class200 var8 = var6[var7];
         this.field2416.add(var8);
      }

   }

   ModeWhere(String var3, int var4) {
      this.id = var4;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "63"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(S)[Lgw;",
      garbageValue = "128"
   )
   static ModeWhere[] method3870() {
      return new ModeWhere[]{field2402, field2405, field2407, field2415, field2420, field2410, field2414, field2412, field2413, field2404, field2408, field2403, field2411};
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "420566665"
   )
   public static boolean method3867(int var0) {
      return (var0 >> 29 & 1) != 0;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "1"
   )
   static final int method3877() {
      return ViewportMouse.ViewportMouse_y;
   }

   @ObfuscatedName("je")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "20"
   )
   static boolean method3875() {
      return Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81];
   }

   @ObfuscatedName("jh")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "50"
   )
   static final void method3878() {
      PacketBufferNode var0 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2283, Client.packetWriter.isaacCipher);
      Client.packetWriter.addNode(var0);

      for(InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
         if (var1.type == 0 || var1.type == 3) {
            GrandExchangeOffer.closeInterface(var1, true);
         }
      }

      if (Client.meslayerContinueWidget != null) {
         IsaacCipher.invalidateWidget(Client.meslayerContinueWidget);
         Client.meslayerContinueWidget = null;
      }

   }

   @ObfuscatedName("kf")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1954380312"
   )
   static void method3871(int var0) {
      for(IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) {
         if ((long)var0 == (var1.key >> 48 & 65535L)) {
            var1.remove();
         }
      }

   }
}
