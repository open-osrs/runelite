import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
public class class92 {
   @ObfuscatedName("n")
   static final BigInteger field1184 = new BigInteger("10001", 16);
   @ObfuscatedName("v")
   static final BigInteger field1177 = new BigInteger("b86386fafabb20bd78c0e5781c43f01792afb1811072a0927a86b2c060909e11def31c8145178d8e18079e9b7200a42bc81f0acd93da0c99c2d892add24ced64d66d75b89088142c4a1045f82b3c9f445bb54cddeb2b6b3771a9cb2d247a69dbd6facc6be331020f34dffd4b3417a5eefc9526e1db8ac97eabddbc50b48a760f", 16);
   @ObfuscatedName("gd")
   @Export("regionMapArchiveIds")
   static int[] regionMapArchiveIds;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "([BZB)Ljava/lang/Object;",
      garbageValue = "8"
   )
   public static Object method2195(byte[] var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else if (var0.length > 136) {
         DirectByteArrayCopier var2 = new DirectByteArrayCopier();
         var2.set(var0);
         return var2;
      } else {
         return var0;
      }
   }
}
