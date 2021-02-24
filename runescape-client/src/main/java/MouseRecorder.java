import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bb")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
   @ObfuscatedName("em")
   @ObfuscatedGetter(
      intValue = -1626344665
   )
   @Export("port1")
   static int port1;
   @ObfuscatedName("n")
   @Export("isRunning")
   boolean isRunning = true;
   @ObfuscatedName("v")
   @Export("lock")
   Object lock = new Object();
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1370756697
   )
   @Export("index")
   int index = 0;
   @ObfuscatedName("c")
   @Export("xs")
   int[] xs = new int[500];
   @ObfuscatedName("y")
   @Export("ys")
   int[] ys = new int[500];
   @ObfuscatedName("h")
   @Export("millis")
   long[] millis = new long[500];

   public void run() {
      for(; this.isRunning; ApproximateRouteStrategy.sleepExact(50L)) {
         Object var1 = this.lock;
         synchronized(this.lock) {
            if (this.index < 500) {
               this.xs[this.index] = MouseHandler.MouseHandler_x;
               this.ys[this.index] = MouseHandler.MouseHandler_y;
               this.millis[this.index] = MouseHandler.MouseHandler_millis;
               ++this.index;
            }
         }
      }

   }
}
