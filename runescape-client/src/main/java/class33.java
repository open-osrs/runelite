import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class33 {
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = -1543138447
	)
	static int field231;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -224672805
	)
	static int field237;
	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1943473173"
	)
	static final void method632() {
		Object var10000 = null; // L: 121
		String var0 = "You can't add yourself to your own friend list";
		Login.addGameMessage(30, "", var0); // L: 123
	} // L: 125
}
