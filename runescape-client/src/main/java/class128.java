import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public abstract class class128 extends Node {
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;

	class128() {
	} // L: 68

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "-73"
	)
	abstract void vmethod3107(Buffer var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Leh;I)V",
		garbageValue = "-1228032820"
	)
	abstract void vmethod3104(ClanSettings var1);

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZS)V",
		garbageValue = "4005"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = World.World_worlds[var6]; // L: 180
			World.World_worlds[var6] = World.World_worlds[var1]; // L: 181
			World.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				if (class445.method8053(World.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) { // L: 184
					World var10 = World.World_worlds[var9]; // L: 185
					World.World_worlds[var9] = World.World_worlds[var7]; // L: 186
					World.World_worlds[var7++] = var10; // L: 187
				}
			}

			World.World_worlds[var1] = World.World_worlds[var7]; // L: 191
			World.World_worlds[var7] = var8; // L: 192
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 193
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 194
		}

	} // L: 196

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1787354339"
	)
	static void method2841(int var0) {
		class150.method3089(14); // L: 2073
		Login.field892 = var0; // L: 2074
	} // L: 2075
}
