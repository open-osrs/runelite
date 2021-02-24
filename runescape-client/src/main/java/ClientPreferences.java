import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("ClientPreferences")
public class ClientPreferences {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 921813781
   )
   @Export("ClientPreferences_optionCount")
   static int ClientPreferences_optionCount = 7;
   @ObfuscatedName("d")
   @Export("roofsHidden")
   boolean roofsHidden;
   @ObfuscatedName("c")
   @Export("titleMusicDisabled")
   boolean titleMusicDisabled;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1342258111
   )
   @Export("windowMode")
   int windowMode = 1;
   @ObfuscatedName("h")
   @Export("rememberedUsername")
   String rememberedUsername = null;
   @ObfuscatedName("z")
   @Export("hideUsername")
   boolean hideUsername = false;
   @ObfuscatedName("e")
   double field1072 = 0.8D;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1550375763
   )
   @Export("musicVolume")
   int musicVolume = 127;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 625718061
   )
   @Export("soundEffectsVolume")
   int soundEffectsVolume = 127;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -429932721
   )
   @Export("areaSoundEffectsVolume")
   int areaSoundEffectsVolume = 127;
   @ObfuscatedName("b")
   @Export("parameters")
   LinkedHashMap parameters = new LinkedHashMap();

   ClientPreferences() {
      this.method1963(true);
   }

   @ObfuscatedSignature(
      descriptor = "(Lkx;)V"
   )
   ClientPreferences(Buffer var1) {
      if (var1 != null && var1.array != null) {
         int var2 = var1.readUnsignedByte();
         if (var2 >= 0 && var2 <= ClientPreferences_optionCount) {
            if (var1.readUnsignedByte() == 1) {
               this.roofsHidden = true;
            }

            if (var2 > 1) {
               this.titleMusicDisabled = var1.readUnsignedByte() == 1;
            }

            if (var2 > 3) {
               this.windowMode = var1.readUnsignedByte();
            }

            if (var2 > 2) {
               int var3 = var1.readUnsignedByte();

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.readInt();
                  int var6 = var1.readInt();
                  this.parameters.put(var5, var6);
               }
            }

            if (var2 > 4) {
               this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull();
            }

            if (var2 > 5) {
               this.hideUsername = var1.readBoolean();
            }

            if (var2 > 6) {
               this.field1072 = (double)var1.readUnsignedByte() / 100.0D;
               this.musicVolume = var1.readUnsignedByte();
               this.soundEffectsVolume = var1.readUnsignedByte();
               this.areaSoundEffectsVolume = var1.readUnsignedByte();
            }
         } else {
            this.method1963(true);
         }
      } else {
         this.method1963(true);
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-83879013"
   )
   void method1963(boolean var1) {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Lkx;",
      garbageValue = "241772586"
   )
   @Export("toBuffer")
   Buffer toBuffer() {
      Buffer var1 = new Buffer(100);
      var1.writeByte(ClientPreferences_optionCount);
      var1.writeByte(this.roofsHidden ? 1 : 0);
      var1.writeByte(this.titleMusicDisabled ? 1 : 0);
      var1.writeByte(this.windowMode);
      var1.writeByte(this.parameters.size());
      Iterator var2 = this.parameters.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.writeInt((Integer)var3.getKey());
         var1.writeInt((Integer)var3.getValue());
      }

      var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : "");
      var1.writeBoolean(this.hideUsername);
      var1.writeByte((int)(this.field1072 * 100.0D));
      var1.writeByte(this.musicVolume);
      var1.writeByte(this.soundEffectsVolume);
      var1.writeByte(this.areaSoundEffectsVolume);
      return var1;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;II)Z",
      garbageValue = "433818884"
   )
   static boolean method1972(String var0, int var1) {
      return class204.method3888(var0, var1, "openjs");
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(II)Lel;",
      garbageValue = "1792916984"
   )
   @Export("getFrames")
   static Frames getFrames(int var0) {
      Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         var1 = class171.method3642(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false);
         if (var1 != null) {
            SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
         }

         return var1;
      }
   }

   @ObfuscatedName("it")
   @ObfuscatedSignature(
      descriptor = "(Lhz;III)V",
      garbageValue = "1981013350"
   )
   @Export("alignWidgetPosition")
   static void alignWidgetPosition(Widget var0, int var1, int var2) {
      if (var0.xAlignment == 0) {
         var0.x = var0.rawX;
      } else if (var0.xAlignment == 1) {
         var0.x = var0.rawX + (var1 - var0.width) / 2;
      } else if (var0.xAlignment == 2) {
         var0.x = var1 - var0.width - var0.rawX;
      } else if (var0.xAlignment == 3) {
         var0.x = var0.rawX * var1 >> 14;
      } else if (var0.xAlignment == 4) {
         var0.x = (var1 - var0.width) / 2 + (var0.rawX * var1 >> 14);
      } else {
         var0.x = var1 - var0.width - (var0.rawX * var1 >> 14);
      }

      if (var0.yAlignment == 0) {
         var0.y = var0.rawY;
      } else if (var0.yAlignment == 1) {
         var0.y = (var2 - var0.height) / 2 + var0.rawY;
      } else if (var0.yAlignment == 2) {
         var0.y = var2 - var0.height - var0.rawY;
      } else if (var0.yAlignment == 3) {
         var0.y = var2 * var0.rawY >> 14;
      } else if (var0.yAlignment == 4) {
         var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height) / 2;
      } else {
         var0.y = var2 - var0.height - (var2 * var0.rawY >> 14);
      }

   }
}
