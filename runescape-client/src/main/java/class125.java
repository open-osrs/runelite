import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
public enum class125 implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1451(0, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1450(2, 1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1449(3, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1452(1, 3);

	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -561913005
	)
	static int field1456;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 547368117
	)
	public final int field1453;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 270011887
	)
	@Export("id")
	final int id;

	class125(int var3, int var4) {
		this.field1453 = var3; // L: 16
		this.id = var4; // L: 17
	} // L: 18

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-708237537"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 21
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1218095333"
	)
	public static boolean method2507(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0; // L: 13
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1978830024"
	)
	static final void method2506() {
		Client.field727 = 0; // L: 5401
		int var0 = (class35.localPlayer.x >> 7) + JagexCache.baseX; // L: 5402
		int var1 = (class35.localPlayer.y >> 7) + Messages.baseY; // L: 5403
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) { // L: 5404
			Client.field727 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) { // L: 5405
			Client.field727 = 1;
		}

		if (Client.field727 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) { // L: 5406
			Client.field727 = 0;
		}

	} // L: 5407
}
