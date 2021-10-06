import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public enum class6 implements MouseWheel {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lt;"
	)
	field17(0, 0);

	@ObfuscatedName("tm")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -610033617
	)
	final int field18;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 978789347
	)
	final int field19;

	class6(int var3, int var4) {
		this.field18 = var3;
		this.field19 = var4;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "661199397"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field19;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2029085795"
	)
	public static void method45() {
		class54.reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-728834449"
	)
	public static boolean method43(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.KeyHandler_pressedKeys[var0] : false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1585134440"
	)
	static void method44() {
		if (class174.loadWorlds()) {
			Login.worldSelectOpen = true;
			Login.worldSelectPage = 0;
			Login.worldSelectPagesCount = 0;
		}

	}
}
