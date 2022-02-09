import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 261158265
	)
	static int field2399;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "[Lpg;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 222141243
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -333305953
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1714135331
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1745150299
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 259570443
	)
	@Export("type")
	int type;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2092502509
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 358389717
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 275212217
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2070764377
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 217573279
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 909727583
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1217030825
	)
	int field2392;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2016997771
	)
	int field2393;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1246762073
	)
	int field2391;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1389189999
	)
	int field2398;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 495561345
	)
	int field2396;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1551835523
	)
	int field2397;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1555042003
	)
	int field2381;

	Occluder() {
	} // L: 23

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1806127120"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 4519
			if (class13.loadInterface(var0)) { // L: 4520
				Widget[] var1 = Widget.Widget_interfaceComponents[var0]; // L: 4521

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 4522
					Widget var3 = var1[var2]; // L: 4523
					if (var3.onLoad != null) { // L: 4524
						ScriptEvent var4 = new ScriptEvent(); // L: 4525
						var4.widget = var3; // L: 4526
						var4.args = var3.onLoad; // L: 4527
						class1.runScript(var4, 5000000, 0); // L: 4528
					}
				}

			}
		}
	} // L: 4531
}
