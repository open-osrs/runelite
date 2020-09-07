import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bq")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1616122647
	)
	@Export("group")
	int group;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1330314565
	)
	@Export("type")
	int type;
	@ObfuscatedName("s")
	boolean field580;

	InterfaceParent() {
		this.field580 = false; // L: 8
	} // L: 10
}
