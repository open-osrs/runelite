import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("v")
	int field390;

	@ObfuscatedName("v")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lal;)I"
	)
	@Export("update")
	abstract int update();
}
