import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("MidiFileReader")
public class MidiFileReader {
   @ObfuscatedName("x")
   static final byte[] field491;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgr;"
   )
   @Export("buffer")
   Buffer buffer;
   @ObfuscatedName("f")
   @Export("division")
   int division;
   @ObfuscatedName("q")
   @Export("trackStarts")
   int[] trackStarts;
   @ObfuscatedName("w")
   @Export("trackPositions")
   int[] trackPositions;
   @ObfuscatedName("o")
   @Export("trackLengths")
   int[] trackLengths;
   @ObfuscatedName("u")
   int[] field492;
   @ObfuscatedName("g")
   int field493;
   @ObfuscatedName("e")
   long field494;

   MidiFileReader(byte[] var1) {
      this.buffer = new Buffer((byte[])null);
      this.parse(var1);
   }

   MidiFileReader() {
      this.buffer = new Buffer((byte[])null);
   }

   @ObfuscatedName("m")
   @Export("parse")
   void parse(byte[] var1) {
      this.buffer.array = var1;
      this.buffer.index = 10;
      int var2 = this.buffer.method43();
      this.division = this.buffer.method43();
      this.field493 = 500000;
      this.trackStarts = new int[var2];

      Buffer var10000;
      int var3;
      int var4;
      for (var3 = 0; var3 < var2; var10000.index += var4) {
         int var5 = this.buffer.readInt();
         var4 = this.buffer.readInt();
         if (var5 == 1297379947) {
            this.trackStarts[var3] = this.buffer.index;
            ++var3;
         }

         var10000 = this.buffer;
      }

      this.field494 = 0L;
      this.trackPositions = new int[var2];

      for (var3 = 0; var3 < var2; ++var3) {
         this.trackPositions[var3] = this.trackStarts[var3];
      }

      this.trackLengths = new int[var2];
      this.field492 = new int[var2];
   }

   @ObfuscatedName("f")
   @Export("clear")
   void clear() {
      this.buffer.array = null;
      this.trackStarts = null;
      this.trackPositions = null;
      this.trackLengths = null;
      this.field492 = null;
   }

   @ObfuscatedName("q")
   @Export("isReady")
   boolean isReady() {
      return this.buffer.array != null;
   }

   @ObfuscatedName("w")
   @Export("trackCount")
   int trackCount() {
      return this.trackPositions.length;
   }

   @ObfuscatedName("o")
   @Export("gotoTrack")
   void gotoTrack(int var1) {
      this.buffer.index = this.trackPositions[var1];
   }

   @ObfuscatedName("u")
   @Export("markTrackPosition")
   void markTrackPosition(int var1) {
      this.trackPositions[var1] = this.buffer.index;
   }

   @ObfuscatedName("g")
   @Export("setTrackDone")
   void setTrackDone() {
      this.buffer.index = -1;
   }

   @ObfuscatedName("l")
   @Export("readTrackLength")
   void readTrackLength(int var1) {
      int var2 = this.buffer.method52();
      int[] var10000 = this.trackLengths;
      var10000[var1] += var2;
   }

   @ObfuscatedName("e")
   @Export("readMessage")
   int readMessage(int var1) {
      int var2 = this.readMessage0(var1);
      return var2;
   }

   @ObfuscatedName("x")
   @Export("readMessage0")
   int readMessage0(int var1) {
      byte var2 = this.buffer.array[this.buffer.index];
      int var3;
      if (var2 < 0) {
         var3 = var2 & 255;
         this.field492[var1] = var3;
         ++this.buffer.index;
      } else {
         var3 = this.field492[var1];
      }

      if (var3 != 240 && var3 != 247) {
         return this.method167(var1, var3);
      } else {
         int var4 = this.buffer.method52();
         if (var3 == 247 && var4 > 0) {
            int var5 = this.buffer.array[this.buffer.index] & 255;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
               ++this.buffer.index;
               this.field492[var1] = var5;
               return this.method167(var1, var5);
            }
         }

         Buffer var10000 = this.buffer;
         var10000.index += var4;
         return 0;
      }
   }

   @ObfuscatedName("d")
   int method167(int var1, int var2) {
      int var3;
      if (var2 == 255) {
         int var7 = this.buffer.readUnsignedByte();
         var3 = this.buffer.method52();
         Buffer var10000;
         if (var7 == 47) {
            var10000 = this.buffer;
            var10000.index += var3;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.buffer.readMedium();
            var3 -= 3;
            int var6 = this.trackLengths[var1];
            this.field494 += (long)var6 * (long)(this.field493 - var5);
            this.field493 = var5;
            var10000 = this.buffer;
            var10000.index += var3;
            return 2;
         } else {
            var10000 = this.buffer;
            var10000.index += var3;
            return 3;
         }
      } else {
         byte var4 = field491[var2 - 128];
         var3 = var2;
         if (var4 >= 1) {
            var3 = var2 | this.buffer.readUnsignedByte() << 8;
         }

         if (var4 >= 2) {
            var3 |= this.buffer.readUnsignedByte() << 16;
         }

         return var3;
      }
   }

   @ObfuscatedName("a")
   long method168(int var1) {
      return this.field494 + (long)var1 * (long)this.field493;
   }

   @ObfuscatedName("z")
   @Export("getPrioritizedTrack")
   int getPrioritizedTrack() {
      int var1 = this.trackPositions.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for (int var4 = 0; var4 < var1; ++var4) {
         if (this.trackPositions[var4] >= 0 && this.trackLengths[var4] < var3) {
            var2 = var4;
            var3 = this.trackLengths[var4];
         }
      }

      return var2;
   }

   @ObfuscatedName("j")
   @Export("isDone")
   boolean isDone() {
      int var1 = this.trackPositions.length;

      for (int var2 = 0; var2 < var1; ++var2) {
         if (this.trackPositions[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @ObfuscatedName("s")
   @Export("reset")
   void reset(long var1) {
      this.field494 = var1;
      int var3 = this.trackPositions.length;

      for (int var4 = 0; var4 < var3; ++var4) {
         this.trackLengths[var4] = 0;
         this.field492[var4] = 0;
         this.buffer.index = this.trackStarts[var4];
         this.readTrackLength(var4);
         this.trackPositions[var4] = this.buffer.index;
      }

   }

   static {
      field491 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   }
}
