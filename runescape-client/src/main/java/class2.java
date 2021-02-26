import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
final class class2 implements class0 {
	@ObfuscatedName("q")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	@Export("pcmPlayerProvider")
	public static PlayerProvider pcmPlayerProvider;
	@ObfuscatedName("k")
	static int[][][] field12;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("gn")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lkx;B)V",
		garbageValue = "-41"
	)
	public void vmethod48(Object var1, Buffer var2) {
		this.method20((Long)var1, var2); // L: 33
	} // L: 34

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)Ljava/lang/Object;",
		garbageValue = "1678106953"
	)
	public Object vmethod45(Buffer var1) {
		return var1.readLong(); // L: 29
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lkx;I)V",
		garbageValue = "444192974"
	)
	void method20(Long var1, Buffer var2) {
		var2.writeLong(var1); // L: 25
	} // L: 26

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZS)I",
		garbageValue = "-27165"
	)
	static int method25(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) { // L: 2328
			if (var0 == 3702) { // L: 2333
				++Interpreter.Interpreter_intStackSize; // L: 2334
				return 1; // L: 2335
			} else {
				return 2; // L: 2337
			}
		} else {
			--Interpreter.Interpreter_intStackSize; // L: 2329
			--Interpreter.Interpreter_stringStackSize; // L: 2330
			return 1; // L: 2331
		}
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1857096968"
	)
	static void method27() {
		if (SoundSystem.worldMap != null) { // L: 3777
			SoundSystem.worldMap.method6530(class90.Client_plane, (UserComparator9.localPlayer.x >> 7) + GrandExchangeOfferNameComparator.baseX, (UserComparator9.localPlayer.y >> 7) + NetCache.baseY, false); // L: 3778
			SoundSystem.worldMap.loadCache(); // L: 3779
		}

	} // L: 3781
}
