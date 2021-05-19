import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	static AbstractSocket field3866;

	static {
		TriBool_unknown = new TriBool(); // L: 4
		TriBool_true = new TriBool(); // L: 5
		TriBool_false = new TriBool(); // L: 6
	}

	TriBool() {
	} // L: 8

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)[Lme;",
		garbageValue = "60"
	)
	static class338[] method5690() {
		return new class338[]{class338.field3927, class338.field3925, class338.field3926, class338.field3928}; // L: 16
	}
}
