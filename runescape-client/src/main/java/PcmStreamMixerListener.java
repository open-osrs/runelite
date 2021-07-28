import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("s")
	int field298;

	@ObfuscatedName("s")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lm;)I"
	)
	@Export("update")
	abstract int update();
}
