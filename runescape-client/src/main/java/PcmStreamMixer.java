import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lji;"
   )
   @Export("subStreams")
   NodeDeque subStreams = new NodeDeque();
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lji;"
   )
   NodeDeque field1353 = new NodeDeque();
   @ObfuscatedName("d")
   int field1354 = 0;
   @ObfuscatedName("c")
   int field1355 = -1;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Ldw;)V"
   )
   @Export("addSubStream")
   public final synchronized void addSubStream(PcmStream var1) {
      this.subStreams.addLast(var1);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ldw;)V"
   )
   @Export("removeSubStream")
   public final synchronized void removeSubStream(PcmStream var1) {
      var1.remove();
   }

   @ObfuscatedName("d")
   void method2456() {
      if (this.field1354 > 0) {
         for(PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field1353.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field1353.previous()) {
            var1.field1466 -= this.field1354;
         }

         this.field1355 -= this.field1354;
         this.field1354 = 0;
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lga;Ldr;)V"
   )
   void method2458(Node var1, PcmStreamMixerListener var2) {
      while(this.field1353.sentinel != var1 && ((PcmStreamMixerListener)var1).field1466 <= var2.field1466) {
         var1 = var1.previous;
      }

      NodeDeque.NodeDeque_addBefore(var2, var1);
      this.field1355 = ((PcmStreamMixerListener)this.field1353.sentinel.previous).field1466;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Ldr;)V"
   )
   void method2459(PcmStreamMixerListener var1) {
      var1.remove();
      var1.remove2();
      Node var2 = this.field1353.sentinel.previous;
      if (var2 == this.field1353.sentinel) {
         this.field1355 = -1;
      } else {
         this.field1355 = ((PcmStreamMixerListener)var2).field1466;
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "()Ldw;"
   )
   @Export("firstSubStream")
   protected PcmStream firstSubStream() {
      return (PcmStream)this.subStreams.last();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "()Ldw;"
   )
   @Export("nextSubStream")
   protected PcmStream nextSubStream() {
      return (PcmStream)this.subStreams.previous();
   }

   @ObfuscatedName("e")
   protected int vmethod4099() {
      return 0;
   }

   @ObfuscatedName("q")
   @Export("fill")
   public final synchronized void fill(int[] var1, int var2, int var3) {
      do {
         if (this.field1355 < 0) {
            this.updateSubStreams(var1, var2, var3);
            return;
         }

         if (var3 + this.field1354 < this.field1355) {
            this.field1354 += var3;
            this.updateSubStreams(var1, var2, var3);
            return;
         }

         int var4 = this.field1355 - this.field1354;
         this.updateSubStreams(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field1354 += var4;
         this.method2456();
         PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field1353.last();
         synchronized(var5) {
            int var7 = var5.update();
            if (var7 < 0) {
               var5.field1466 = 0;
               this.method2459(var5);
            } else {
               var5.field1466 = var7;
               this.method2458(var5.previous, var5);
            }
         }
      } while(var3 != 0);

   }

   @ObfuscatedName("l")
   @Export("updateSubStreams")
   void updateSubStreams(int[] var1, int var2, int var3) {
      for(PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
         var4.update(var1, var2, var3);
      }

   }

   @ObfuscatedName("s")
   @Export("skip")
   public final synchronized void skip(int var1) {
      do {
         if (this.field1355 < 0) {
            this.skipSubStreams(var1);
            return;
         }

         if (this.field1354 + var1 < this.field1355) {
            this.field1354 += var1;
            this.skipSubStreams(var1);
            return;
         }

         int var2 = this.field1355 - this.field1354;
         this.skipSubStreams(var2);
         var1 -= var2;
         this.field1354 += var2;
         this.method2456();
         PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field1353.last();
         synchronized(var3) {
            int var5 = var3.update();
            if (var5 < 0) {
               var3.field1466 = 0;
               this.method2459(var3);
            } else {
               var3.field1466 = var5;
               this.method2458(var3.previous, var3);
            }
         }
      } while(var1 != 0);

   }

   @ObfuscatedName("b")
   @Export("skipSubStreams")
   void skipSubStreams(int var1) {
      for(PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
         var2.skip(var1);
      }

   }
}
