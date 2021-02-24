import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("EnumDefinition_archive")
   public static AbstractArchive EnumDefinition_archive;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   @Export("EnumDefinition_cached")
   static EvictingDualNodeHashTable EnumDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("d")
   @Export("inputType")
   public char inputType;
   @ObfuscatedName("c")
   @Export("outputType")
   public char outputType;
   @ObfuscatedName("y")
   @Export("defaultStr")
   public String defaultStr = "null";
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 977907101
   )
   @Export("defaultInt")
   public int defaultInt;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1947625869
   )
   @Export("outputCount")
   public int outputCount = 0;
   @ObfuscatedName("e")
   @Export("keys")
   public int[] keys;
   @ObfuscatedName("q")
   @Export("intVals")
   public int[] intVals;
   @ObfuscatedName("l")
   @Export("strVals")
   public String[] strVals;

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)V",
      garbageValue = "1374661087"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lkx;IB)V",
      garbageValue = "112"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.inputType = (char)var1.readUnsignedByte();
      } else if (var2 == 2) {
         this.outputType = (char)var1.readUnsignedByte();
      } else if (var2 == 3) {
         this.defaultStr = var1.readStringCp1252NullTerminated();
      } else if (var2 == 4) {
         this.defaultInt = var1.readInt();
      } else {
         int var3;
         if (var2 == 5) {
            this.outputCount = var1.readUnsignedShort();
            this.keys = new int[this.outputCount];
            this.strVals = new String[this.outputCount];

            for(var3 = 0; var3 < this.outputCount; ++var3) {
               this.keys[var3] = var1.readInt();
               this.strVals[var3] = var1.readStringCp1252NullTerminated();
            }
         } else if (var2 == 6) {
            this.outputCount = var1.readUnsignedShort();
            this.keys = new int[this.outputCount];
            this.intVals = new int[this.outputCount];

            for(var3 = 0; var3 < this.outputCount; ++var3) {
               this.keys[var3] = var1.readInt();
               this.intVals[var3] = var1.readInt();
            }
         }
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2129947174"
   )
   @Export("size")
   public int size() {
      return this.outputCount;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(CLgp;B)I",
      garbageValue = "40"
   )
   @Export("lowercaseChar")
   static int lowercaseChar(char var0, Language var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = (var0 << 4) + 1;
      }

      if (var0 == 241 && var1 == Language.Language_ES) {
         var2 = 1762;
      }

      return var2;
   }
}
