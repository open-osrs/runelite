import java.awt.Image;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
public class PacketBuffer extends Buffer {
	@ObfuscatedName("k")
	static final int[] field3729;
	@ObfuscatedName("aa")
	static Image field3725;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = 1400093691
	)
	static int cameraPitch;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	IsaacCipher isaacCipher;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1373505985
	)
	int bitIndex;

	static {
		field3729 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1}; // L: 7
	}

	public PacketBuffer(int var1) {
		super(var1); // L: 11
	} // L: 12

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "687379780"
	)
	public void newIsaacCipher(int[] var1) {
		this.isaacCipher = new IsaacCipher(var1); // L: 15
	} // L: 16

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Llh;I)V",
		garbageValue = "-1243349913"
	)
	public void setIsaacCipher(IsaacCipher var1) {
		this.isaacCipher = var1; // L: 19
	} // L: 20

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "28692652"
	)
	public void writeByteIsaac(int var1) {
		super.array[++super.offset - 1] = (byte)(var1 + this.isaacCipher.nextInt()); // L: 23
	} // L: 24

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	public int readByteIsaac() {
		return super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255; // L: 27
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-345140221"
	)
	public boolean method5564() {
		int var1 = super.array[super.offset] - this.isaacCipher.method6394() & 255; // L: 31
		return var1 >= 128; // L: 32
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-121"
	)
	public int readSmartByteShortIsaac() {
		int var1 = super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255; // L: 37
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255); // L: 38 39
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1310609105"
	)
	public void method5566(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; ++var4) { // L: 43
			var1[var4 + var2] = (byte)(super.array[++super.offset - 1] - this.isaacCipher.nextInt());
		}

	} // L: 44

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1646456009"
	)
	public void importIndex() {
		this.bitIndex = super.offset * 8; // L: 47
	} // L: 48

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "606103556"
	)
	public int readBits(int var1) {
		int var2 = this.bitIndex >> 3; // L: 51
		int var3 = 8 - (this.bitIndex & 7); // L: 52
		int var4 = 0; // L: 53

		for (this.bitIndex += var1; var1 > var3; var3 = 8) { // L: 54 55 58
			var4 += (super.array[var2++] & field3729[var3]) << var1 - var3; // L: 56
			var1 -= var3; // L: 57
		}

		if (var3 == var1) { // L: 60
			var4 += super.array[var2] & field3729[var3];
		} else {
			var4 += super.array[var2] >> var3 - var1 & field3729[var1]; // L: 61
		}

		return var4; // L: 62
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2092208058"
	)
	public void exportIndex() {
		super.offset = (this.bitIndex + 7) / 8; // L: 66
	} // L: 67

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-20679"
	)
	public int bitsRemaining(int var1) {
		return var1 * 8 - this.bitIndex; // L: 70
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(Lbf;IIBI)V",
		garbageValue = "-872449297"
	)
	static final void method5598(Player var0, int var1, int var2, byte var3) {
		int var4 = var0.pathX[0]; // L: 6982
		int var5 = var0.pathY[0]; // L: 6983
		int var6 = var0.transformedSize(); // L: 6984
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) { // L: 6985
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) { // L: 6986
				int var9 = var0.transformedSize(); // L: 6989
				Client.field950.approxDestinationX = var1; // L: 6992
				Client.field950.approxDestinationY = var2; // L: 6993
				Client.field950.approxDestinationSizeX = 1; // L: 6994
				Client.field950.approxDestinationSizeY = 1; // L: 6995
				ApproximateRouteStrategy var10 = Client.field950; // L: 6996
				int var11 = ObjectSound.method1986(var4, var5, var9, var10, Client.collisionMaps[var0.plane], true, Client.field830, Client.field952); // L: 6998
				if (var11 >= 1) { // L: 6999
					for (int var12 = 0; var12 < var11 - 1; ++var12) { // L: 7000
						var0.method1288(Client.field830[var12], Client.field952[var12], var3);
					}

				}
			}
		}
	} // L: 7001
}
