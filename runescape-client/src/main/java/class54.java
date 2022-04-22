import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
public class class54 {
	@ObfuscatedName("sn")
	@ObfuscatedGetter(
		intValue = -508954501
	)
	static int field447;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("reflectionChecks")
	static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "[Lqi;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1793988868"
	)
	public static int method1078(int var0) {
		return class271.field3155[var0]; // L: 24
	}
}
