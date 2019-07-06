import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
@Implements("BufferedSource")
public class BufferedSource implements Runnable {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static AbstractIndexCache field54;
   @ObfuscatedName("m")
   @Export("thread")
   Thread thread;
   @ObfuscatedName("f")
   @Export("inputStream")
   InputStream inputStream;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1970062431
   )
   @Export("capacity")
   int capacity;
   @ObfuscatedName("w")
   @Export("buffer")
   byte[] buffer;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 267006153
   )
   @Export("position")
   int position;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1507905677
   )
   @Export("limit")
   int limit;
   @ObfuscatedName("g")
   @Export("exception")
   IOException exception;

   BufferedSource(InputStream var1, int var2) {
      this.position = 0;
      this.limit = 0;
      this.inputStream = var1;
      this.capacity = var2 + 1;
      this.buffer = new byte[this.capacity];
      this.thread = new Thread(this);
      this.thread.setDaemon(true);
      this.thread.start();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1727240458"
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

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1475171419"
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

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1907345200"
   )
   @Export("readUnsignedByte")
   int readUnsignedByte() throws IOException {
      synchronized(this) {
         if (this.position == this.limit) {
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

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([BIIB)I",
      garbageValue = "-37"
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

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "886033980"
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
      }

   }

   @Export("run")
   @ObfuscatedName("run")
   public void run() {
      while (true) {
         int var1;
         synchronized(this) {
            while (true) {
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
               }
            }
         }

         int var2;
         try {
            var2 = this.inputStream.read(this.buffer, this.limit, var1);
            if (var2 == -1) {
               throw new EOFException();
            }
         } catch (IOException var11) {
            IOException var4 = var11;
            synchronized(this) {
               this.exception = var4;
               return;
            }
         }

         synchronized(this) {
            this.limit = (var2 + this.limit) % this.capacity;
         }
      }
   }

   @ObfuscatedName("gy")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "6"
   )
   static final void method3423(boolean var0) {
      for (int var1 = 0; var1 < Client.npcCount; ++var1) {
         NPC var2 = Client.npcs[Client.npcIndices[var1]];
         if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.method229()) {
            int var3 = var2.x >> 7;
            int var4 = var2.y >> 7;
            if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
               if (var2.size == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
                  if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
                     continue;
                  }

                  Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
               }

               long var5 = FontName.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
               var2.playerCycle = Client.cycle;
               class65.scene.method285(SoundSystem.plane, var2.x, var2.y, class32.getTileHeight(var2.size * 64 - 64 + var2.x, var2.size * 64 - 64 + var2.y, SoundSystem.plane), var2.size * 64 - 64 + 60, var2, var2.field9, var5, var2.field10);
            }
         }
      }

   }
}
