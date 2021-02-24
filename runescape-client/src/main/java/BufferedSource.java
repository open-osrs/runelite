import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("BufferedSource")
public class BufferedSource implements Runnable {
   @ObfuscatedName("n")
   @Export("thread")
   Thread thread;
   @ObfuscatedName("v")
   @Export("inputStream")
   InputStream inputStream;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1953404091
   )
   @Export("capacity")
   int capacity;
   @ObfuscatedName("c")
   @Export("buffer")
   byte[] buffer;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -2146586711
   )
   @Export("position")
   int position = 0;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 2116402287
   )
   @Export("limit")
   int limit = 0;
   @ObfuscatedName("z")
   @Export("exception")
   IOException exception;

   BufferedSource(InputStream var1, int var2) {
      this.inputStream = var1;
      this.capacity = var2 + 1;
      this.buffer = new byte[this.capacity];
      this.thread = new Thread(this);
      this.thread.setDaemon(true);
      this.thread.start();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1444651631"
   )
   @Export("isAvailable")
   boolean isAvailable(int var1) throws IOException {
      if (var1 == 0) {
         return true;
      } else if (var1 > 0 && var1 < this.capacity) {
         synchronized(this) {
            int var3;
            if (this.position <= this.limit) {
               var3 = this.limit - this.position;
            } else {
               var3 = this.capacity - this.position + this.limit;
            }

            if (var3 < var1) {
               if (this.exception != null) {
                  throw new IOException(this.exception.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "5789"
   )
   @Export("available")
   int available() throws IOException {
      synchronized(this) {
         int var2;
         if (this.position <= this.limit) {
            var2 = this.limit - this.position;
         } else {
            var2 = this.capacity - this.position + this.limit;
         }

         if (var2 <= 0 && this.exception != null) {
            throw new IOException(this.exception.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1306188380"
   )
   @Export("readUnsignedByte")
   int readUnsignedByte() throws IOException {
      synchronized(this) {
         if (this.limit == this.position) {
            if (this.exception != null) {
               throw new IOException(this.exception.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.buffer[this.position] & 255;
            this.position = (this.position + 1) % this.capacity;
            this.notifyAll();
            return var2;
         }
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "([BIII)I",
      garbageValue = "255172200"
   )
   @Export("read")
   int read(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var5;
            if (this.position <= this.limit) {
               var5 = this.limit - this.position;
            } else {
               var5 = this.capacity - this.position + this.limit;
            }

            if (var3 > var5) {
               var3 = var5;
            }

            if (var3 == 0 && this.exception != null) {
               throw new IOException(this.exception.toString());
            } else {
               if (var3 + this.position <= this.capacity) {
                  System.arraycopy(this.buffer, this.position, var1, var2, var3);
               } else {
                  int var6 = this.capacity - this.position;
                  System.arraycopy(this.buffer, this.position, var1, var2, var6);
                  System.arraycopy(this.buffer, 0, var1, var6 + var2, var3 - var6);
               }

               this.position = (var3 + this.position) % this.capacity;
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-489650908"
   )
   @Export("close")
   void close() {
      synchronized(this) {
         if (this.exception == null) {
            this.exception = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.thread.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   public void run() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if (this.exception != null) {
                  return;
               }

               if (this.position == 0) {
                  var1 = this.capacity - this.limit - 1;
               } else if (this.position <= this.limit) {
                  var1 = this.capacity - this.limit;
               } else {
                  var1 = this.position - this.limit - 1;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var10) {
                  ;
               }
            }
         }

         int var7;
         try {
            var7 = this.inputStream.read(this.buffer, this.limit, var1);
            if (var7 == -1) {
               throw new EOFException();
            }
         } catch (IOException var11) {
            IOException var3 = var11;
            synchronized(this) {
               this.exception = var3;
               return;
            }
         }

         synchronized(this) {
            this.limit = (var7 + this.limit) % this.capacity;
         }
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lig;III)Llm;",
      garbageValue = "34379622"
   )
   @Export("SpriteBuffer_getSprite")
   public static Sprite SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
      byte[] var4 = var0.takeFile(var1, var2);
      boolean var3;
      if (var4 == null) {
         var3 = false;
      } else {
         GrandExchangeOfferNameComparator.SpriteBuffer_decode(var4);
         var3 = true;
      }

      if (!var3) {
         return null;
      } else {
         Sprite var5 = new Sprite();
         var5.width = class336.SpriteBuffer_spriteWidth;
         var5.height = class336.SpriteBuffer_spriteHeight;
         var5.xOffset = class105.SpriteBuffer_xOffsets[0];
         var5.yOffset = class336.SpriteBuffer_yOffsets[0];
         var5.subWidth = class336.SpriteBuffer_spriteWidths[0];
         var5.subHeight = class225.SpriteBuffer_spriteHeights[0];
         int var6 = var5.subHeight * var5.subWidth;
         byte[] var7 = class2.SpriteBuffer_pixels[0];
         var5.pixels = new int[var6];

         for(int var8 = 0; var8 < var6; ++var8) {
            var5.pixels[var8] = HorizontalAlignment.SpriteBuffer_spritePalette[var7[var8] & 255];
         }

         class105.SpriteBuffer_xOffsets = null;
         class336.SpriteBuffer_yOffsets = null;
         class336.SpriteBuffer_spriteWidths = null;
         class225.SpriteBuffer_spriteHeights = null;
         HorizontalAlignment.SpriteBuffer_spritePalette = null;
         class2.SpriteBuffer_pixels = null;
         return var5;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)[Llm;",
      garbageValue = "49"
   )
   static Sprite[] method6103() {
      Sprite[] var0 = new Sprite[class336.SpriteBuffer_spriteCount];

      for(int var1 = 0; var1 < class336.SpriteBuffer_spriteCount; ++var1) {
         Sprite var2 = var0[var1] = new Sprite();
         var2.width = class336.SpriteBuffer_spriteWidth;
         var2.height = class336.SpriteBuffer_spriteHeight;
         var2.xOffset = class105.SpriteBuffer_xOffsets[var1];
         var2.yOffset = class336.SpriteBuffer_yOffsets[var1];
         var2.subWidth = class336.SpriteBuffer_spriteWidths[var1];
         var2.subHeight = class225.SpriteBuffer_spriteHeights[var1];
         int var3 = var2.subHeight * var2.subWidth;
         byte[] var4 = class2.SpriteBuffer_pixels[var1];
         var2.pixels = new int[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            var2.pixels[var5] = HorizontalAlignment.SpriteBuffer_spritePalette[var4[var5] & 255];
         }
      }

      class105.SpriteBuffer_xOffsets = null;
      class336.SpriteBuffer_yOffsets = null;
      class336.SpriteBuffer_spriteWidths = null;
      class225.SpriteBuffer_spriteHeights = null;
      HorizontalAlignment.SpriteBuffer_spritePalette = null;
      class2.SpriteBuffer_pixels = null;
      return var0;
   }
}
