import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class194 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Ldm;"
	)
	class113[] field2285;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -162502243
	)
	int field2287;

	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V"
	)
	class194(Buffer var1, int var2) {
		this.field2285 = new class113[var2]; // L: 13
		this.field2287 = var1.readUnsignedByte(); // L: 14

		for (int var3 = 0; var3 < this.field2285.length; ++var3) { // L: 15
			class113 var4 = new class113(this.field2287, var1, false); // L: 16
			this.field2285[var3] = var4; // L: 17
		}

		this.method3870(); // L: 19
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "4151"
	)
	void method3870() {
		class113[] var1 = this.field2285; // L: 24

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 25
			class113 var3 = var1[var2]; // L: 26
			if (var3.field1397 >= 0) { // L: 28
				var3.field1394 = this.field2285[var3.field1397]; // L: 29
			}
		}

	} // L: 34

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "9"
	)
	public int method3871() {
		return this.field2285.length; // L: 37
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Ldm;",
		garbageValue = "1668894546"
	)
	class113 method3872(int var1) {
		return this.field2285[var1]; // L: 41
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldm;",
		garbageValue = "0"
	)
	class113[] method3878() {
		return this.field2285; // L: 45
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ldw;IB)V",
		garbageValue = "0"
	)
	void method3874(class120 var1, int var2) {
		this.method3873(var1, var2, (boolean[])null, false); // L: 49
	} // L: 50

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ldw;I[ZZI)V",
		garbageValue = "719467466"
	)
	void method3873(class120 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method2666(); // L: 53
		int var6 = 0; // L: 54
		class113[] var7 = this.method3878(); // L: 56

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 57
			class113 var9 = var7[var8]; // L: 58
			if (var3 == null || var4 == var3[var6]) { // L: 60
				var1.method2679(var2, var9, var6, var5); // L: 61
			}

			++var6; // L: 63
		}

	} // L: 67
}
