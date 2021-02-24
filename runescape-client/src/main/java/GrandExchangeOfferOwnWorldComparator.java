import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
   @ObfuscatedName("ny")
   @ObfuscatedGetter(
      intValue = -1660740811
   )
   static int field656;
   @ObfuscatedName("n")
   @Export("filterWorlds")
   boolean filterWorlds;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lx;Lx;I)I",
      garbageValue = "2015971420"
   )
   @Export("compare_bridged")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      if (var2.world == var1.world) {
         return 0;
      } else {
         if (this.filterWorlds) {
            if (Client.worldId == var1.world) {
               return -1;
            }

            if (var2.world == Client.worldId) {
               return 1;
            }
         }

         return var1.world < var2.world ? -1 : 1;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "1"
   )
   static int method1375(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var2 == null) {
         return -1;
      } else {
         return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2139827308"
   )
   public static boolean method1366() {
      ReflectionCheck var0 = (ReflectionCheck)class105.reflectionChecks.last();
      return var0 != null;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(ILig;IIIZI)V",
      garbageValue = "1340227558"
   )
   public static void method1376(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
      class206.musicPlayerStatus = 1;
      class206.musicTrackArchive = var1;
      class206.musicTrackGroupId = var2;
      SoundSystem.musicTrackFileId = var3;
      DevicePcmPlayerProvider.musicTrackVolume = var4;
      class206.musicTrackBoolean = var5;
      class7.pcmSampleLength = var0;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(IZI)Ljava/lang/String;",
      garbageValue = "147453853"
   )
   @Export("intToString")
   public static String intToString(int var0, boolean var1) {
      if (var1 && var0 >= 0) {
         int var3 = var0;
         String var2;
         if (var1 && var0 >= 0) {
            int var4 = 2;

            for(int var5 = var0 / 10; var5 != 0; ++var4) {
               var5 /= 10;
            }

            char[] var6 = new char[var4];
            var6[0] = '+';

            for(int var7 = var4 - 1; var7 > 0; --var7) {
               int var8 = var3;
               var3 /= 10;
               int var9 = var8 - var3 * 10;
               if (var9 >= 10) {
                  var6[var7] = (char)(var9 + 87);
               } else {
                  var6[var7] = (char)(var9 + 48);
               }
            }

            var2 = new String(var6);
         } else {
            var2 = Integer.toString(var0, 10);
         }

         return var2;
      } else {
         return Integer.toString(var0);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1311209187"
   )
   @Export("Login_promptCredentials")
   static void Login_promptCredentials(boolean var0) {
      Login.Login_response1 = "";
      Login.Login_response2 = "Enter your username/email & password.";
      Login.Login_response3 = "";
      Login.loginIndex = 2;
      if (var0) {
         Login.Login_password = "";
      }

      class248.method4514();
      class8.method88();
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "([BII)I",
      garbageValue = "-1467177624"
   )
   public static int method1380(byte[] var0, int var1) {
      return Player.method1317(var0, 0, var1);
   }

   @ObfuscatedName("kh")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)V",
      garbageValue = "-1869683138"
   )
   static void method1378(Buffer var0) {
      if (Client.randomDatData != null) {
         var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
      } else {
         byte[] var1 = Projectile.method2260();
         var0.writeBytes(var1, 0, var1.length);
      }
   }
}
