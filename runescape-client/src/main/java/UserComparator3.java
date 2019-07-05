import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      signature = "Lit;"
   )
   @Export("indexCache6")
   static IndexCache indexCache6;
   @ObfuscatedName("fl")
   @ObfuscatedSignature(
      signature = "Lfm;"
   )
   @Export("socketTask")
   static Task socketTask;
   @ObfuscatedName("m")
   final boolean field934;

   public UserComparator3(boolean var1) {
      this.field934 = var1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lke;Lke;I)I",
      garbageValue = "-1157645406"
   )
   int method344(Buddy var1, Buddy var2) {
      return var2.world0 != var1.world0 ? (this.field934 ? var1.world0 - var2.world0 : var2.world0 - var1.world0) : this.method12(var1, var2);
   }

   @Export("compare")
   @ObfuscatedName("compare")
   public int compare(Object var1, Object var2) {
      return this.method344((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "699084605"
   )
   public static void method3379() {
      SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
      SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
   }
}
