import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
public class class231 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lda;"
	)
	class115[] field2578;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 230124275
	)
	int field2577;

	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V"
	)
	class231(Buffer var1, int var2) {
		this.field2578 = new class115[var2]; // L: 13
		this.field2577 = var1.readUnsignedByte(); // L: 14

		for (int var3 = 0; var3 < this.field2578.length; ++var3) { // L: 15
			class115 var4 = new class115(this.field2577, var1, false); // L: 16
			this.field2578[var3] = var4; // L: 17
		}

		this.method4697(); // L: 19
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-459048653"
	)
	void method4697() {
		class115[] var1 = this.field2578; // L: 24

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 25
			class115 var3 = var1[var2]; // L: 26
			if (var3.field1395 >= 0) { // L: 28
				var3.field1388 = this.field2578[var3.field1395]; // L: 29
			}
		}

	} // L: 34

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "139338744"
	)
	public int method4698() {
		return this.field2578.length; // L: 37
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Lda;",
		garbageValue = "-1090806170"
	)
	class115 method4718(int var1) {
		return this.field2578[var1]; // L: 41
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lda;",
		garbageValue = "856290899"
	)
	class115[] method4700() {
		return this.field2578; // L: 45
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ldo;II)V",
		garbageValue = "-821248386"
	)
	void method4717(class122 var1, int var2) {
		this.method4701(var1, var2, (boolean[])null, false); // L: 49
	} // L: 50

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ldo;I[ZZI)V",
		garbageValue = "-1783408058"
	)
	void method4701(class122 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method2766(); // L: 53
		int var6 = 0; // L: 54
		class115[] var7 = this.method4700(); // L: 56

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 57
			class115 var9 = var7[var8]; // L: 58
			if (var3 == null || var4 == var3[var6]) { // L: 60
				var1.method2796(var2, var9, var6, var5); // L: 61
			}

			++var6; // L: 63
		}

	} // L: 67

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)V",
		garbageValue = "640671653"
	)
	static final void method4712(Widget var0) {
		int var1 = var0.contentType; // L: 12098
		if (var1 == 324) { // L: 12099
			if (Client.field561 == -1) { // L: 12100
				Client.field561 = var0.spriteId2; // L: 12101
				Client.field775 = var0.spriteId; // L: 12102
			}

			if (Client.playerAppearance.isFemale) { // L: 12104
				var0.spriteId2 = Client.field561;
			} else {
				var0.spriteId2 = Client.field775; // L: 12105
			}

		} else if (var1 == 325) { // L: 12108
			if (Client.field561 == -1) { // L: 12109
				Client.field561 = var0.spriteId2; // L: 12110
				Client.field775 = var0.spriteId; // L: 12111
			}

			if (Client.playerAppearance.isFemale) { // L: 12113
				var0.spriteId2 = Client.field775;
			} else {
				var0.spriteId2 = Client.field561; // L: 12114
			}

		} else if (var1 == 327) { // L: 12117
			var0.modelAngleX = 150; // L: 12118
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12119
			var0.modelType = 5; // L: 12120
			var0.modelId = 0; // L: 12121
		} else if (var1 == 328) { // L: 12124
			var0.modelAngleX = 150; // L: 12125
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12126
			var0.modelType = 5; // L: 12127
			var0.modelId = 1; // L: 12128
		}
	} // L: 12106 12115 12122 12129 12131
}
