import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("u")
	int field1440;

	@ObfuscatedName("u")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lca;)I"
	)
	@Export("update")
	abstract int update();
}
