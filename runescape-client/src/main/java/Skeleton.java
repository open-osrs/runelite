import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1780002005
	)
	@Export("id")
	int id;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -64074659
	)
	@Export("count")
	int count;
	@ObfuscatedName("w")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("y")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	class201 field2376;

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
				this.field2376 = new class201(var3, var4); // L: 32
			}
		}

	} // L: 35

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-58631089"
	)
	public int method4148() {
		return this.count; // L: 38
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lgq;",
		garbageValue = "1269137329"
	)
	public class201 method4150() {
		return this.field2376; // L: 42
	}
}
