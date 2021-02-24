import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "136255387"
   )
   @Export("close")
   public abstract void close();

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-29"
   )
   @Export("readUnsignedByte")
   public abstract int readUnsignedByte() throws IOException;

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "1"
   )
   @Export("available")
   public abstract int available() throws IOException;

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1621767276"
   )
   @Export("isAvailable")
   public abstract boolean isAvailable(int var1) throws IOException;

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "([BIIB)I",
      garbageValue = "-127"
   )
   @Export("read")
   public abstract int read(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "1032488862"
   )
   @Export("write")
   public abstract void write(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/String;[SIII)V",
      garbageValue = "-632113899"
   )
   @Export("sortItemsByName")
   static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         sortItemsByName(var0, var1, var2, var5 - 1);
         sortItemsByName(var0, var1, var5 + 1, var3);
      }

   }

   @ObfuscatedName("fd")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "0"
   )
   @Export("playSong")
   static void playSong(int var0) {
      if (var0 == -1 && !Client.field899) {
         ScriptEvent.method1272();
      } else if (var0 != -1 && var0 != Client.currentTrackGroupId && WorldMapSectionType.clientPreferences.musicVolume != 0 && !Client.field899) {
         GrandExchangeOfferOwnWorldComparator.method1376(2, UrlRequester.archive6, var0, 0, WorldMapSectionType.clientPreferences.musicVolume, false);
      }

      Client.currentTrackGroupId = var0;
   }
}
