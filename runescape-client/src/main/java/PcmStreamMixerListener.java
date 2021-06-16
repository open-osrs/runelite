import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("f")
	int field519;

	@ObfuscatedName("f")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lav;)I"
	)
	@Export("update")
	abstract int update();
}
