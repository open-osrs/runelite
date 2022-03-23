import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("v")
	int field398;

	@ObfuscatedName("v")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Laa;)I"
	)
	@Export("update")
	abstract int update();
}
