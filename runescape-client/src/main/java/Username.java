import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("Username")
public class Username implements Comparable {
   @ObfuscatedName("q")
   @Export("Interpreter_intLocals")
   static int[] Interpreter_intLocals;
   @ObfuscatedName("m")
   @Export("name0")
   String name0;
   @ObfuscatedName("f")
   @Export("cleanName")
   String cleanName;

   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Llx;)V"
   )
   public Username(String var1, LoginType var2) {
      this.name0 = var1;
      this.cleanName = Message.method1229(var1, var2);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "1065850055"
   )
   @Export("getName")
   public String getName() {
      return this.name0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1468109942"
   )
   @Export("hasCleanName")
   public boolean hasCleanName() {
      return this.cleanName != null;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lkp;B)I",
      garbageValue = "8"
   )
   @Export("compareTo0")
   public int compareTo0(Username var1) {
      return this.cleanName == null ? (var1.cleanName == null ? 0 : 1) : (var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName));
   }

   @Export("equals")
   @ObfuscatedName("equals")
   public boolean equals(Object var1) {
      if (var1 instanceof Username) {
         Username var2 = (Username)var1;
         if (this.cleanName == null) {
            return var2.cleanName == null;
         } else {
            return var2.cleanName != null && this.method352() == var2.method352() && this.cleanName.equals(var2.cleanName);
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("hashCode")
   public int method352() {
      return this.cleanName == null ? 0 : this.cleanName.hashCode();
   }

   @ObfuscatedName("toString")
   public String method353() {
      return this.getName();
   }

   @Export("compareTo")
   @ObfuscatedName("compareTo")
   public int compareTo(Object var1) {
      return this.compareTo0((Username)var1);
   }
}
