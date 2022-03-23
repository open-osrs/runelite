import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 78791747
	)
	@Export("id")
	int id;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 2115979069
	)
	@Export("count")
	int count;
	@ObfuscatedName("f")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("u")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	class202 field2363;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 19
		Buffer var3 = new Buffer(var2); // L: 20
		this.count = var3.readUnsignedByte(); // L: 21
		this.transformTypes = new int[this.count]; // L: 22
		this.labels = new int[this.count][]; // L: 23

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) { // L: 24
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 25
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 26
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) { // L: 27
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) { // L: 29
			var4 = var3.readUnsignedShort(); // L: 30
			if (var4 > 0) { // L: 31
				this.field2363 = new class202(var3, var4); // L: 32
			}
		}

	} // L: 35

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-23"
	)
	public int method4119() {
		return this.count; // L: 38
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lgl;",
		garbageValue = "-954036382"
	)
	public class202 method4120() {
		return this.field2363; // L: 42
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;I)I",
		garbageValue = "459175254"
	)
	static int method4118(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0; // L: 158
		String[] var3 = Login.field881; // L: 160

		int var4;
		String var5;
		for (var4 = 0; var4 < var3.length; ++var4) { // L: 161
			var5 = var3[var4]; // L: 162
			if (var0.tryLoadFileByNames(var5, "")) { // L: 164
				++var2;
			}
		}

		var3 = Login.field914; // L: 169

		for (var4 = 0; var4 < var3.length; ++var4) { // L: 170
			var5 = var3[var4]; // L: 171
			if (var1.tryLoadFileByNames(var5, "")) { // L: 173
				++var2;
			}
		}

		return var2; // L: 177
	}
}
