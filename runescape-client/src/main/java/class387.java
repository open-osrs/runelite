import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
public enum class387 implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field4211(4, 0),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field4213(5, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field4212(0, 5),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field4214(2, 6),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field4215(1, 7),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field4216(3, 8);

	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -281212927
	)
	final int field4217;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2118941453
	)
	final int field4218;

	class387(int var3, int var4) {
		this.field4217 = var3; // L: 18
		this.field4218 = var4; // L: 19
	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4218; // L: 23
	}
}
