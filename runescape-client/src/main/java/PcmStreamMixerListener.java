import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("o")
	int field396;

	@ObfuscatedName("o")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Las;)I"
	)
	@Export("update")
	abstract int update();
}
