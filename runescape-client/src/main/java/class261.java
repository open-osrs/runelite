import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
public class class261 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	static final class261 field3203;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	static final class261 field3206;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 857756693
	)
	final int field3205;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -712840455
	)
	final int field3204;

	static {
		field3203 = new class261(51, 27, 800, 0, 16, 16); // L: 33
		field3206 = new class261(25, 28, 800, 656, 40, 40); // L: 34
	}

	class261(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3205 = var5; // L: 39
		this.field3204 = var6; // L: 40
	} // L: 41

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1466191460"
	)
	static final String method4790(int var0) {
		if (var0 < 100000) { // L: 421
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>"; // L: 422 423
		}
	}
}
