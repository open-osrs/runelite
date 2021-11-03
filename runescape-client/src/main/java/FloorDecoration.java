import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1221894569
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1725833807
	)
	@Export("x")
	int x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 636569371
	)
	@Export("y")
	int y;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -3843450359883300141L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1362157209
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	} // L: 11

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Lpz;",
		garbageValue = "1947599529"
	)
	public static PrivateChatMode method4189(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field4425, PrivateChatMode.field4423, PrivateChatMode.field4422}; // L: 18
		PrivateChatMode[] var2 = var1; // L: 20

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 21
			PrivateChatMode var4 = var2[var3]; // L: 22
			if (var0 == var4.field4424) { // L: 24
				return var4;
			}
		}

		return null; // L: 28
	}
}
