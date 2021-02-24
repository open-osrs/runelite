import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
   @ObfuscatedName("n")
   @Export("javaVendor")
   public static String javaVendor;
   @ObfuscatedName("v")
   @Export("javaVersion")
   public static String javaVersion;
   @ObfuscatedName("e")
   static byte[][][] field2045;
   @ObfuscatedName("a")
   @Export("Tiles_hueMultiplier")
   static int[] Tiles_hueMultiplier;
   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      descriptor = "Lfl;"
   )
   @Export("js5SocketTask")
   static Task js5SocketTask;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lfl;"
   )
   @Export("current")
   Task current = null;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lfl;"
   )
   @Export("task")
   Task task = null;
   @ObfuscatedName("y")
   @Export("thread")
   Thread thread;
   @ObfuscatedName("h")
   @Export("isClosed")
   boolean isClosed = false;

   public TaskHandler() {
      javaVendor = "Unknown";
      javaVersion = "1.6";

      try {
         javaVendor = System.getProperty("java.vendor");
         javaVersion = System.getProperty("java.version");
      } catch (Exception var2) {
         ;
      }

      this.isClosed = false;
      this.thread = new Thread(this);
      this.thread.setPriority(10);
      this.thread.setDaemon(true);
      this.thread.start();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1153020803"
   )
   @Export("close")
   public final void close() {
      synchronized(this) {
         this.isClosed = true;
         this.notifyAll();
      }

      try {
         this.thread.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIILjava/lang/Object;I)Lfl;",
      garbageValue = "1365505014"
   )
   @Export("newTask")
   final Task newTask(int var1, int var2, int var3, Object var4) {
      Task var5 = new Task();
      var5.type = var1;
      var5.intArgument = var2;
      var5.objectArgument = var4;
      synchronized(this) {
         if (this.task != null) {
            this.task.next = var5;
            this.task = var5;
         } else {
            this.task = this.current = var5;
         }

         this.notify();
         return var5;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;II)Lfl;",
      garbageValue = "-1223563808"
   )
   @Export("newSocketTask")
   public final Task newSocketTask(String var1, int var2) {
      return this.newTask(1, var2, 0, var1);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Runnable;II)Lfl;",
      garbageValue = "-1832147507"
   )
   @Export("newThreadTask")
   public final Task newThreadTask(Runnable var1, int var2) {
      return this.newTask(2, var2, 0, var1);
   }

   public final void run() {
      while(true) {
         Task var1;
         synchronized(this) {
            while(true) {
               if (this.isClosed) {
                  return;
               }

               if (this.current != null) {
                  var1 = this.current;
                  this.current = this.current.next;
                  if (this.current == null) {
                     this.task = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var8) {
                  ;
               }
            }
         }

         try {
            int var5 = var1.type;
            if (var5 == 1) {
               var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument);
            } else if (var5 == 2) {
               Thread var3 = new Thread((Runnable)var1.objectArgument);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.intArgument);
               var1.result = var3;
            } else if (var5 == 4) {
               var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
            }

            var1.status = 1;
         } catch (ThreadDeath var6) {
            throw var6;
         } catch (Throwable var7) {
            var1.status = 2;
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lhz;I[B[BI)V",
      garbageValue = "-944892435"
   )
   @Export("Widget_setKey")
   static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
      if (var0.field2668 == null) {
         if (var2 == null) {
            return;
         }

         var0.field2668 = new byte[11][];
         var0.field2669 = new byte[11][];
         var0.field2686 = new int[11];
         var0.field2599 = new int[11];
      }

      var0.field2668[var1] = var2;
      if (var2 != null) {
         var0.field2667 = true;
      } else {
         var0.field2667 = false;

         for(int var4 = 0; var4 < var0.field2668.length; ++var4) {
            if (var0.field2668[var4] != null) {
               var0.field2667 = true;
               break;
            }
         }
      }

      var0.field2669[var1] = var3;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IIIIIZI)Llm;",
      garbageValue = "1451657661"
   )
   @Export("getItemSprite")
   public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var1 == -1) {
         var4 = 0;
      } else if (var4 == 2 && var1 != 1) {
         var4 = 1;
      }

      long var6 = ((long)var3 << 42) + ((long)var4 << 40) + ((long)var1 << 16) + (long)var0 + ((long)var2 << 38);
      SpritePixels var8;
      if (!var5) {
         var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6);
         if (var8 != null) {
            return var8;
         }
      }

      ItemComposition var9 = class281.ItemDefinition_get(var0);
      if (var1 > 1 && var9.countobj != null) {
         int var10 = -1;

         for(int var11 = 0; var11 < 10; ++var11) {
            if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) {
               var10 = var9.countobj[var11];
            }
         }

         if (var10 != -1) {
            var9 = class281.ItemDefinition_get(var10);
         }
      }

      Model var19 = var9.getModel(1);
      if (var19 == null) {
         return null;
      } else {
         SpritePixels var20 = null;
         if (var9.noteTemplate != -1) {
            var20 = getItemSprite(var9.note, 10, 1, 0, 0, true);
            if (var20 == null) {
               return null;
            }
         } else if (var9.notedId != -1) {
            var20 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false);
            if (var20 == null) {
               return null;
            }
         } else if (var9.placeholderTemplate != -1) {
            var20 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false);
            if (var20 == null) {
               return null;
            }
         }

         int[] var12 = Rasterizer2D.Rasterizer2D_pixels;
         int var13 = Rasterizer2D.Rasterizer2D_width;
         int var14 = Rasterizer2D.Rasterizer2D_height;
         int[] var15 = new int[4];
         Rasterizer2D.Rasterizer2D_getClipArray(var15);
         var8 = new SpritePixels(36, 32);
         Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32);
         Rasterizer2D.Rasterizer2D_clear();
         Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
         Rasterizer3D.method3169(16, 16);
         Rasterizer3D.field1777 = false;
         if (var9.placeholderTemplate != -1) {
            var20.drawTransBgAt(0, 0);
         }

         int var16 = var9.zoom2d;
         if (var5) {
            var16 = (int)(1.5D * (double)var16);
         } else if (var2 == 2) {
            var16 = (int)(1.04D * (double)var16);
         }

         int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16;
         int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16;
         var19.calculateBoundsCylinder();
         var19.method3106(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var19.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d);
         if (var9.notedId != -1) {
            var20.drawTransBgAt(0, 0);
         }

         if (var2 >= 1) {
            var8.outline(1);
         }

         if (var2 >= 2) {
            var8.outline(16777215);
         }

         if (var3 != 0) {
            var8.shadow(var3);
         }

         Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32);
         if (var9.noteTemplate != -1) {
            var20.drawTransBgAt(0, 0);
         }

         if (var4 == 1 || var4 == 2 && var9.isStackable == 1) {
            ItemComposition.ItemDefinition_fontPlain11.draw(SoundCache.inventoryQuantityFormat(var1), 0, 9, 16776960, 1);
         }

         if (!var5) {
            ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
         }

         Rasterizer2D.Rasterizer2D_replace(var12, var13, var14);
         Rasterizer2D.Rasterizer2D_setClipArray(var15);
         Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
         Rasterizer3D.field1777 = true;
         return var8;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-1388427542"
   )
   static final boolean method3673(int var0, int var1) {
      ObjectComposition var2 = WorldMapAreaData.getObjectDefinition(var0);
      if (var1 == 11) {
         var1 = 10;
      }

      if (var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      return var2.method4806(var1);
   }
}
