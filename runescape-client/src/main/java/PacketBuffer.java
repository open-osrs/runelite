import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
   @ObfuscatedName("v")
   static final int[] field3738 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lmw;"
   )
   @Export("isaacCipher")
   IsaacCipher isaacCipher;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1273165901
   )
   @Export("bitIndex")
   int bitIndex;

   public PacketBuffer(int var1) {
      super(var1);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "([II)V",
      garbageValue = "-20223224"
   )
   @Export("newIsaacCipher")
   public void newIsaacCipher(int[] var1) {
      this.isaacCipher = new IsaacCipher(var1);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lmw;B)V",
      garbageValue = "-10"
   )
   @Export("setIsaacCipher")
   public void setIsaacCipher(IsaacCipher var1) {
      this.isaacCipher = var1;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "31106"
   )
   @Export("writeByteIsaac")
   public void writeByteIsaac(int var1) {
      super.array[++super.offset - 1] = (byte)(var1 + this.isaacCipher.nextInt());
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "150314526"
   )
   @Export("readByteIsaac")
   public int readByteIsaac() {
      return super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1479248666"
   )
   public boolean method5634() {
      int var1 = super.array[super.offset] - this.isaacCipher.method6474() & 255;
      return var1 >= 128;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "726838641"
   )
   @Export("readSmartByteShortIsaac")
   public int readSmartByteShortIsaac() {
      int var1 = super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
      return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "([BIIS)V",
      garbageValue = "-3177"
   )
   public void method5642(byte[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var4 + var2] = (byte)(super.array[++super.offset - 1] - this.isaacCipher.nextInt());
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1484486196"
   )
   @Export("importIndex")
   public void importIndex() {
      this.bitIndex = super.offset * 8;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-102"
   )
   @Export("readBits")
   public int readBits(int var1) {
      int var2 = this.bitIndex >> 3;
      int var3 = 8 - (this.bitIndex & 7);
      int var4 = 0;

      for(this.bitIndex += var1; var1 > var3; var3 = 8) {
         var4 += (super.array[var2++] & field3738[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var3 == var1) {
         var4 += super.array[var2] & field3738[var3];
      } else {
         var4 += super.array[var2] >> var3 - var1 & field3738[var1];
      }

      return var4;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1519575230"
   )
   @Export("exportIndex")
   public void exportIndex() {
      super.offset = (this.bitIndex + 7) / 8;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "716997837"
   )
   @Export("bitsRemaining")
   public int bitsRemaining(int var1) {
      return var1 * 8 - this.bitIndex;
   }
}
