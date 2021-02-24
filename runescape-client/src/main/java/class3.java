import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
public class class3 implements Enumerated {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lc;"
   )
   public static final class3 field26 = new class3(1, 0, Integer.class, new class1());
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lc;"
   )
   public static final class3 field17 = new class3(0, 1, Long.class, new class2());
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lc;"
   )
   public static final class3 field18 = new class3(2, 2, String.class, new class4());
   @ObfuscatedName("gj")
   @ObfuscatedGetter(
      intValue = 585723225
   )
   static int field24;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -313002573
   )
   final int field19;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 252641843
   )
   public final int field22;
   @ObfuscatedName("h")
   public final Class field21;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Ln;"
   )
   final class0 field20;

   @ObfuscatedSignature(
      descriptor = "(IILjava/lang/Class;Ln;)V"
   )
   class3(int var1, int var2, Class var3, class0 var4) {
      this.field19 = var1;
      this.field22 = var2;
      this.field21 = var3;
      this.field20 = var4;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "63"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field22;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lkx;S)Ljava/lang/Object;",
      garbageValue = "8209"
   )
   public Object method32(Buffer var1) {
      return this.field20.vmethod45(var1);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Lkx;I)V",
      garbageValue = "1884916613"
   )
   public static void method30(Object var0, Buffer var1) {
      Class var3 = var0.getClass();
      class3[] var5 = new class3[]{field18, field26, field17};
      class3[] var6 = var5;
      int var7 = 0;

      class3 var4;
      while(true) {
         if (var7 >= var6.length) {
            var4 = null;
            break;
         }

         class3 var8 = var6[var7];
         if (var3 == var8.field21) {
            var4 = var8;
            break;
         }

         ++var7;
      }

      if (var4 == null) {
         throw new IllegalArgumentException();
      } else {
         class0 var2 = var4.field20;
         var2.vmethod48(var0, var1);
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Ljava/io/File;B)V",
      garbageValue = "1"
   )
   static void method36(File var0) {
      FileSystem.FileSystem_cacheDir = var0;
      if (!FileSystem.FileSystem_cacheDir.exists()) {
         throw new RuntimeException("");
      } else {
         FileSystem.FileSystem_hasPermissions = true;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lig;Lig;I)V",
      garbageValue = "614126080"
   )
   public static void method41(AbstractArchive var0, AbstractArchive var1) {
      NPCComposition.NpcDefinition_archive = var0;
      NPCComposition.NpcDefinition_modelArchive = var1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;B)[B",
      garbageValue = "-110"
   )
   public static byte[] method40(CharSequence var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) {
            var2[var3] = (byte)var4;
         } else if (var4 == 8364) {
            var2[var3] = -128;
         } else if (var4 == 8218) {
            var2[var3] = -126;
         } else if (var4 == 402) {
            var2[var3] = -125;
         } else if (var4 == 8222) {
            var2[var3] = -124;
         } else if (var4 == 8230) {
            var2[var3] = -123;
         } else if (var4 == 8224) {
            var2[var3] = -122;
         } else if (var4 == 8225) {
            var2[var3] = -121;
         } else if (var4 == 710) {
            var2[var3] = -120;
         } else if (var4 == 8240) {
            var2[var3] = -119;
         } else if (var4 == 352) {
            var2[var3] = -118;
         } else if (var4 == 8249) {
            var2[var3] = -117;
         } else if (var4 == 338) {
            var2[var3] = -116;
         } else if (var4 == 381) {
            var2[var3] = -114;
         } else if (var4 == 8216) {
            var2[var3] = -111;
         } else if (var4 == 8217) {
            var2[var3] = -110;
         } else if (var4 == 8220) {
            var2[var3] = -109;
         } else if (var4 == 8221) {
            var2[var3] = -108;
         } else if (var4 == 8226) {
            var2[var3] = -107;
         } else if (var4 == 8211) {
            var2[var3] = -106;
         } else if (var4 == 8212) {
            var2[var3] = -105;
         } else if (var4 == 732) {
            var2[var3] = -104;
         } else if (var4 == 8482) {
            var2[var3] = -103;
         } else if (var4 == 353) {
            var2[var3] = -102;
         } else if (var4 == 8250) {
            var2[var3] = -101;
         } else if (var4 == 339) {
            var2[var3] = -100;
         } else if (var4 == 382) {
            var2[var3] = -98;
         } else if (var4 == 376) {
            var2[var3] = -97;
         } else {
            var2[var3] = 63;
         }
      }

      return var2;
   }
}
