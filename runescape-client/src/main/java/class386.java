import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
public enum class386 implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field4213(2, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field4210(0, 2),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field4211(5, 5),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field4215(3, 6),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field4212(4, 7),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field4214(1, 8);

	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2074320091
	)
	final int field4216;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2114016559
	)
	final int field4209;

	class386(int var3, int var4) {
		this.field4216 = var3; // L: 18
		this.field4209 = var4; // L: 19
	} // L: 20

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-708237537"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4209; // L: 23
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lbt;B)V",
		garbageValue = "104"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 270
		if (var0.sound != null) { // L: 271
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 272
		}

	} // L: 273
}
