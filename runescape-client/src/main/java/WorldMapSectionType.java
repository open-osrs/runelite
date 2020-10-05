import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public enum WorldMapSectionType implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	WORLDMAPSECTIONTYPE0(2, (byte)0),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	WORLDMAPSECTIONTYPE1(1, (byte)1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	WORLDMAPSECTIONTYPE2(3, (byte)2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	WORLDMAPSECTIONTYPE3(0, (byte)3);

	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 872496481
	)
	static int field178;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 750880259
	)
	final int type;
	@ObfuscatedName("o")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 21
		this.id = var4; // L: 22
	} // L: 23

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "385513888"
	)
	public int rsOrdinal() {
		return this.id; // L: 26
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)[Lae;",
		garbageValue = "278613741"
	)
	static WorldMapSectionType[] method327() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE3}; // L: 17
	}
}
