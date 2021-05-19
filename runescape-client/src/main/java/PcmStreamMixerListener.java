import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("h")
	int field515;

	@ObfuscatedName("h")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lar;)I"
	)
	@Export("update")
	abstract int update();
}
