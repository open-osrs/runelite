import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
   @ObfuscatedName("se")
   @ObfuscatedSignature(
      descriptor = "Lio;"
   )
   public static class248 field1016;
   @ObfuscatedName("id")
   @ObfuscatedGetter(
      intValue = -871307957
   )
   @Export("oculusOrbFocalPointX")
   static int oculusOrbFocalPointX;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1783692297
   )
   @Export("cycle")
   int cycle;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -2047753623
   )
   @Export("health")
   int health;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1943828551
   )
   @Export("health2")
   int health2;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1709538301
   )
   @Export("cycleOffset")
   int cycleOffset;

   HealthBarUpdate(int var1, int var2, int var3, int var4) {
      this.cycle = var1;
      this.health = var2;
      this.health2 = var3;
      this.cycleOffset = var4;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "72"
   )
   @Export("set")
   void set(int var1, int var2, int var3, int var4) {
      this.cycle = var1;
      this.health = var2;
      this.health2 = var3;
      this.cycleOffset = var4;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/String;[SB)V",
      garbageValue = "1"
   )
   public static void method1873(String[] var0, short[] var1) {
      AbstractSocket.sortItemsByName(var0, var1, 0, var0.length - 1);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IB)Lij;",
      garbageValue = "-64"
   )
   @Export("getInvDefinition")
   public static InvDefinition getInvDefinition(int var0) {
      InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
         var1 = new InvDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         InvDefinition.InvDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-698681386"
   )
   @Export("Messages_getLastChatID")
   static int Messages_getLastChatID(int var0) {
      Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
      }
   }
}
