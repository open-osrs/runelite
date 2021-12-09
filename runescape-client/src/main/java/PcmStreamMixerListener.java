import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("c")
	int field393;

	@ObfuscatedName("c")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lap;)I"
	)
	@Export("update")
	abstract int update();
}
