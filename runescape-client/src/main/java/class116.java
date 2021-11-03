import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
public abstract class class116 extends Node {
	@ObfuscatedName("ns")
	@ObfuscatedGetter(
		intValue = 670075911
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;

	class116() {
	} // L: 68

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	abstract void vmethod2847(Buffer var1);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	abstract void vmethod2848(ClanSettings var1);
}
