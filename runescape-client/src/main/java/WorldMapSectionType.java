import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(1, (byte)0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(0, (byte)1),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(3, (byte)2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(2, (byte)3);

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "[Llo;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -297259605
	)
	@Export("type")
	final int type;
	@ObfuscatedName("j")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 21
		this.id = var4; // L: 22
	} // L: 23

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-275768542"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 26
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)[Lag;",
		garbageValue = "116"
	)
	static WorldMapSectionType[] method295() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE2}; // L: 17
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILib;Ljava/lang/String;Ljava/lang/String;IZI)V",
		garbageValue = "-519940907"
	)
	public static void method300(int var0, AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		int var6 = var1.getGroupId(var2); // L: 42
		int var7 = var1.getFileId(var6, var3); // L: 43
		SecureRandomCallable.method1221(var0, var1, var6, var7, var4, var5); // L: 44
	} // L: 45
}
