import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
public enum class339 implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	field3916(0, 1),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	field3913(3, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	field3914(2, 3),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	field3915(1, 10);

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1941464297
	)
	final int field3912;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1941103959
	)
	final int field3917;

	class339(int var3, int var4) {
		this.field3912 = var3; // L: 16
		this.field3917 = var4; // L: 17
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3917; // L: 21
	}
}
