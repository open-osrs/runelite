import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lji;"
   )
   @Export("ArchiveDiskActionHandler_requestQueue")
   public static NodeDeque ArchiveDiskActionHandler_requestQueue = new NodeDeque();
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lji;"
   )
   @Export("ArchiveDiskActionHandler_responseQueue")
   public static NodeDeque ArchiveDiskActionHandler_responseQueue = new NodeDeque();
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1788680015
   )
   public static int field3187 = 0;
   @ObfuscatedName("c")
   @Export("ArchiveDiskActionHandler_lock")
   public static Object ArchiveDiskActionHandler_lock = new Object();
   @ObfuscatedName("y")
   @Export("ArchiveDiskActionHandler_thread")
   static Thread ArchiveDiskActionHandler_thread;

   public void run() {
      try {
         while(true) {
            NodeDeque var2 = ArchiveDiskActionHandler_requestQueue;
            ArchiveDiskAction var1;
            synchronized(ArchiveDiskActionHandler_requestQueue) {
               var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
            }

            Object var14;
            if (var1 != null) {
               if (var1.type == 0) {
                  var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length);
                  var2 = ArchiveDiskActionHandler_requestQueue;
                  synchronized(ArchiveDiskActionHandler_requestQueue) {
                     var1.remove();
                  }
               } else if (var1.type == 1) {
                  var1.data = var1.archiveDisk.read((int)var1.key);
                  var2 = ArchiveDiskActionHandler_requestQueue;
                  synchronized(ArchiveDiskActionHandler_requestQueue) {
                     ArchiveDiskActionHandler_responseQueue.addFirst(var1);
                  }
               }

               var14 = ArchiveDiskActionHandler_lock;
               synchronized(ArchiveDiskActionHandler_lock) {
                  if (field3187 <= 1) {
                     field3187 = 0;
                     ArchiveDiskActionHandler_lock.notifyAll();
                     return;
                  }

                  field3187 = 600;
               }
            } else {
               ApproximateRouteStrategy.sleepExact(100L);
               var14 = ArchiveDiskActionHandler_lock;
               synchronized(ArchiveDiskActionHandler_lock) {
                  if (field3187 <= 1) {
                     field3187 = 0;
                     ArchiveDiskActionHandler_lock.notifyAll();
                     return;
                  }

                  --field3187;
               }
            }
         }
      } catch (Exception var13) {
         SequenceDefinition.RunException_sendStackTrace((String)null, var13);
      }
   }
}
