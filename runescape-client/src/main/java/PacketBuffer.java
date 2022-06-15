import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pq")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
	@ObfuscatedName("v")
	static final int[] field4692;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("isaacCipher")
	IsaacCipher isaacCipher;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -799844397
	)
	@Export("bitIndex")
	int bitIndex;

	static {
		field4692 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1}; // L: 7
	}

	public PacketBuffer(int var1) {
		super(var1); // L: 11
	} // L: 12

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "1774744385"
	)
	@Export("newIsaacCipher")
	public void newIsaacCipher(int[] var1) {
		this.isaacCipher = new IsaacCipher(var1); // L: 15
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqv;B)V",
		garbageValue = "-54"
	)
	@Export("setIsaacCipher")
	public void setIsaacCipher(IsaacCipher var1) {
		this.isaacCipher = var1; // L: 19
	} // L: 20

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "12"
	)
	@Export("writeByteIsaac")
	public void writeByteIsaac(int var1) {
		super.array[++super.offset - 1] = (byte)(var1 + this.isaacCipher.nextInt()); // L: 23
	} // L: 24

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-817493897"
	)
	@Export("readByteIsaac")
	public int readByteIsaac() {
		return super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255; // L: 27
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1961058583"
	)
	public boolean method7674() {
		int var1 = super.array[super.offset] - this.isaacCipher.method8300() & 255; // L: 31
		return var1 >= 128; // L: 32
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1989168325"
	)
	@Export("readSmartByteShortIsaac")
	public int readSmartByteShortIsaac() {
		int var1 = super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255; // L: 37
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255); // L: 38 39
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1345438581"
	)
	public void method7711(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; ++var4) { // L: 43
			var1[var4 + var2] = (byte)(super.array[++super.offset - 1] - this.isaacCipher.nextInt());
		}

	} // L: 44

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "11"
	)
	@Export("importIndex")
	public void importIndex() {
		this.bitIndex = super.offset * 8; // L: 47
	} // L: 48

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1646577810"
	)
	@Export("readBits")
	public int readBits(int var1) {
		int var2 = this.bitIndex >> 3; // L: 51
		int var3 = 8 - (this.bitIndex & 7); // L: 52
		int var4 = 0; // L: 53

		for (this.bitIndex += var1; var1 > var3; var3 = 8) { // L: 54 55 58
			var4 += (super.array[var2++] & field4692[var3]) << var1 - var3; // L: 56
			var1 -= var3; // L: 57
		}

		if (var3 == var1) { // L: 60
			var4 += super.array[var2] & field4692[var3];
		} else {
			var4 += super.array[var2] >> var3 - var1 & field4692[var1]; // L: 61
		}

		return var4; // L: 62
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1306236975"
	)
	@Export("exportIndex")
	public void exportIndex() {
		super.offset = (this.bitIndex + 7) / 8; // L: 66
	} // L: 67

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "24"
	)
	@Export("bitsRemaining")
	public int bitsRemaining(int var1) {
		return var1 * 8 - this.bitIndex; // L: 70
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "160587880"
	)
	static final void method7714() {
		int var0 = Players.Players_count; // L: 3998
		int[] var1 = Players.Players_indices; // L: 3999

		for (int var2 = 0; var2 < var0; ++var2) { // L: 4000
			Player var3 = Client.players[var1[var2]]; // L: 4001
			if (var3 != null) { // L: 4002
				class285.updateActorSequence(var3, 1); // L: 4003
			}
		}

	} // L: 4006
}
