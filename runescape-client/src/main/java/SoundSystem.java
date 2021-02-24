import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
   @ObfuscatedName("sl")
   @ObfuscatedSignature(
      descriptor = "Lmf;"
   )
   @Export("worldMap")
   static WorldMap worldMap;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -2100372523
   )
   @Export("musicTrackFileId")
   public static int musicTrackFileId;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Lkx;"
   )
   @Export("NetCache_reference")
   public static Buffer NetCache_reference;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "[Ldh;"
   )
   @Export("players")
   volatile PcmPlayer[] players = new PcmPlayer[2];

   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            PcmPlayer var2 = this.players[var1];
            if (var2 != null) {
               var2.run();
            }
         }
      } catch (Exception var4) {
         SequenceDefinition.RunException_sendStackTrace((String)null, var4);
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-422098598"
   )
   @Export("runWidgetOnLoadListener")
   static void runWidgetOnLoadListener(int var0) {
      if (var0 != -1) {
         if (WorldMapCacheName.loadInterface(var0)) {
            Widget[] var1 = DefaultsGroup.Widget_interfaceComponents[var0];

            for(int var2 = 0; var2 < var1.length; ++var2) {
               Widget var3 = var1[var2];
               if (var3.onLoad != null) {
                  ScriptEvent var4 = new ScriptEvent();
                  var4.widget = var3;
                  var4.args = var3.onLoad;
                  GrandExchangeOfferWorldComparator.runScript(var4, 5000000);
               }
            }

         }
      }
   }
}
