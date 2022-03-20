import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1902581057
	)
	static int field2588;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1178433619
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 746777845
	)
	@Export("z")
	int z;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1435489625
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1681858831
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1594054171
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1228904531
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2069560973
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1306078651
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1508007581
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1775800277
	)
	int field2584;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1693805361
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -8019980132139941379L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1925968547
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L; // L: 16
		this.flags = 0; // L: 17
	} // L: 19

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1679068447"
	)
	public static int[] method4297() {
		int[] var0 = new int[KeyHandler.field141]; // L: 279

		for (int var1 = 0; var1 < KeyHandler.field141; ++var1) { // L: 280
			var0[var1] = KeyHandler.field125[var1]; // L: 281
		}

		return var0; // L: 283
	}
}
