import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
@Implements("FillMode")
public enum FillMode implements Enumerated {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	field4233(1, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	field4232(2, 2);

	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -662302415
	)
	public final int field4230;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1060401875
	)
	final int field4234;

	FillMode(int var3, int var4) {
		this.field4230 = var3; // L: 19
		this.field4234 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907662946"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4234; // L: 24
	}
}
