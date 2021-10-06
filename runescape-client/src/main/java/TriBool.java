import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("NetCache_reference")
	public static Buffer NetCache_reference;
	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	static class387 field3979;

	static {
		TriBool_unknown = new TriBool();
		TriBool_true = new TriBool();
		TriBool_false = new TriBool();
	}

	TriBool() {
	}
}
