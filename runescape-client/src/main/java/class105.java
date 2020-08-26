import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public class class105 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 1183836299
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}
}
