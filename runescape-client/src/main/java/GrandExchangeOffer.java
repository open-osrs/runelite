import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
   @ObfuscatedName("op")
   @ObfuscatedSignature(
      descriptor = "Lcg;"
   )
   @Export("varcs")
   static Varcs varcs;
   @ObfuscatedName("le")
   @ObfuscatedSignature(
      descriptor = "Lhz;"
   )
   static Widget field100;
   @ObfuscatedName("n")
   @Export("state")
   byte state;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1764119781
   )
   @Export("id")
   public int id;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1987297797
   )
   @Export("unitPrice")
   public int unitPrice;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 795872735
   )
   @Export("totalQuantity")
   public int totalQuantity;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 252650677
   )
   @Export("currentQuantity")
   public int currentQuantity;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 710426357
   )
   @Export("currentPrice")
   public int currentPrice;

   public GrandExchangeOffer() {
   }

   @ObfuscatedSignature(
      descriptor = "(Lkx;Z)V",
      garbageValue = "0"
   )
   public GrandExchangeOffer(Buffer var1, boolean var2) {
      this.state = var1.readByte();
      this.id = var1.readUnsignedShort();
      this.unitPrice = var1.readInt();
      this.totalQuantity = var1.readInt();
      this.currentQuantity = var1.readInt();
      this.currentPrice = var1.readInt();
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-15"
   )
   @Export("status")
   public int status() {
      return this.state & 7;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-522457380"
   )
   @Export("type")
   public int type() {
      return (this.state & 8) == 8 ? 1 : 0;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "575158813"
   )
   void method166(int var1) {
      this.state &= -8;
      this.state = (byte)(this.state | var1 & 7);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "656048251"
   )
   void method168(int var1) {
      this.state &= -9;
      if (var1 == 1) {
         this.state = (byte)(this.state | 8);
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Lfu;III)Ldh;",
      garbageValue = "779350721"
   )
   public static final PcmPlayer method167(TaskHandler var0, int var1, int var2) {
      if (StructDefinition.field3338 * 22050 == 0) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 256) {
            var2 = 256;
         }

         try {
            PcmPlayer var3 = class2.pcmPlayerProvider.player();
            var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)];
            var3.field1427 = var2;
            var3.init();
            var3.capacity = (var2 & -1024) + 1024;
            if (var3.capacity > 16384) {
               var3.capacity = 16384;
            }

            var3.open(var3.capacity);
            if (PcmPlayer.field1419 > 0 && PcmPlayer.soundSystem == null) {
               PcmPlayer.soundSystem = new SoundSystem();
               PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1);
               PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (PcmPlayer.soundSystem != null) {
               if (PcmPlayer.soundSystem.players[var1] != null) {
                  throw new IllegalArgumentException();
               }

               PcmPlayer.soundSystem.players[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            return new PcmPlayer();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "1"
   )
   @Export("getGcDuration")
   protected static int getGcDuration() {
      int var0 = 0;
      if (WorldMapID.garbageCollector == null || !WorldMapID.garbageCollector.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if (var2.isValid()) {
                  WorldMapID.garbageCollector = var2;
                  GameShell.garbageCollectorLastCheckTimeMs = -1L;
                  GameShell.garbageCollectorLastCollectionTime = -1L;
               }
            }
         } catch (Throwable var11) {
            ;
         }
      }

      if (WorldMapID.garbageCollector != null) {
         long var9 = Tiles.currentTimeMillis();
         long var3 = WorldMapID.garbageCollector.getCollectionTime();
         if (GameShell.garbageCollectorLastCollectionTime != -1L) {
            long var5 = var3 - GameShell.garbageCollectorLastCollectionTime;
            long var7 = var9 - GameShell.garbageCollectorLastCheckTimeMs;
            if (0L != var7) {
               var0 = (int)(100L * var5 / var7);
            }
         }

         GameShell.garbageCollectorLastCollectionTime = var3;
         GameShell.garbageCollectorLastCheckTimeMs = var9;
      }

      return var0;
   }

   @ObfuscatedName("ih")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/lang/String;",
      garbageValue = "-64"
   )
   static final String method187(int var0) {
      return var0 < 999999999 ? Integer.toString(var0) : "*";
   }

   @ObfuscatedName("ku")
   @ObfuscatedSignature(
      descriptor = "(Lbs;ZS)V",
      garbageValue = "-4659"
   )
   @Export("closeInterface")
   static final void closeInterface(InterfaceParent var0, boolean var1) {
      int var2 = var0.group;
      int var3 = (int)var0.key;
      var0.remove();
      if (var1 && var2 != -1 && Widget.Widget_loadedInterfaces[var2]) {
         FontName.Widget_archive.clearFilesGroup(var2);
         if (DefaultsGroup.Widget_interfaceComponents[var2] != null) {
            boolean var4 = true;

            for(int var5 = 0; var5 < DefaultsGroup.Widget_interfaceComponents[var2].length; ++var5) {
               if (DefaultsGroup.Widget_interfaceComponents[var2][var5] != null) {
                  if (DefaultsGroup.Widget_interfaceComponents[var2][var5].type != 2) {
                     DefaultsGroup.Widget_interfaceComponents[var2][var5] = null;
                  } else {
                     var4 = false;
                  }
               }
            }

            if (var4) {
               DefaultsGroup.Widget_interfaceComponents[var2] = null;
            }

            Widget.Widget_loadedInterfaces[var2] = false;
         }
      }

      ModeWhere.method3871(var2);
      Widget var6 = class237.getWidget(var3);
      if (var6 != null) {
         IsaacCipher.invalidateWidget(var6);
      }

      AbstractWorldMapData.method352();
      if (Client.rootInterface != -1) {
         class228.runIntfCloseListeners(Client.rootInterface, 1);
      }

   }
}
