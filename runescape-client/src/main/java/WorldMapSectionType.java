import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(2, (byte)0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(3, (byte)1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(1, (byte)2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(0, (byte)3);

	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 829502387
	)
	@Export("type")
	final int type;
	@ObfuscatedName("z")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 21
		this.id = var4; // L: 22
	} // L: 23

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-708237537"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 26
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([BI)Lfu;",
		garbageValue = "-1740492560"
	)
	static WorldMapSprite method3540(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(WorldMapAreaData.convertJpgToSprite(var0).pixels); // L: 19 20
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfp;",
		garbageValue = "-998055644"
	)
	static WorldMapSectionType[] method3537() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE2}; // L: 17
	}
}
