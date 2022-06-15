import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
@Implements("FillMode")
public enum FillMode implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	field4778(1, 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	field4783(2, 2);

	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 112722803
	)
	public final int field4781;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 773830597
	)
	final int field4782;

	FillMode(int var3, int var4) {
		this.field4781 = var3; // L: 19
		this.field4782 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4782; // L: 25
	}
}
