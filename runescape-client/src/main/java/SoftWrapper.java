import java.lang.ref.SoftReference;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ft")
@Implements("SoftWrapper")
public class SoftWrapper extends Wrapper {
   @ObfuscatedName("n")
   @Export("ref")
   SoftReference ref;

   SoftWrapper(Object var1, int var2) {
      super(var2);
      this.ref = new SoftReference(var1);
   }

   @ObfuscatedName("n")
   @Export("get")
   Object get() {
      return this.ref.get();
   }

   @ObfuscatedName("v")
   @Export("isSoft")
   boolean isSoft() {
      return true;
   }
}
