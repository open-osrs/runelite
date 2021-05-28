import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("v")
	int field541;

	@ObfuscatedName("v")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lay;)I"
	)
	@Export("update")
	abstract int update();
}
