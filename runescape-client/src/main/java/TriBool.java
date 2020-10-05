import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	public static final TriBool TriBool_true;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	public static final TriBool TriBool_false;
	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	static Widget mousedOverWidgetIf1;

	static {
		TriBool_unknown = new TriBool(); // L: 4
		TriBool_true = new TriBool(); // L: 5
		TriBool_false = new TriBool(); // L: 6
	}

	TriBool() {
	} // L: 8
}
