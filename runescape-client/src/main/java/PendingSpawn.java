import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("uz")
	@ObfuscatedGetter(
		intValue = -19855095
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("b")
	@Export("cacheParentPaths")
	public static String[] cacheParentPaths;
	@ObfuscatedName("ak")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -28260951
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -395030049
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1083883841
	)
	@Export("type")
	int type;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 664401913
	)
	@Export("x")
	int x;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2084106709
	)
	@Export("y")
	int y;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 469927407
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 456466373
	)
	int field1117;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -875007293
	)
	int field1119;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 503773945
	)
	@Export("id")
	int id;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1610620631
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -917284009
	)
	int field1122;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 270987311
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1980741835
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0; // L: 16
		this.hitpoints = -1; // L: 17
	} // L: 19
}
