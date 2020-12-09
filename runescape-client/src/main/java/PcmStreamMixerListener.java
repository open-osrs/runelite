import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("h")
	int field1464;

	@ObfuscatedName("h")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lde;)I"
	)
	@Export("update")
	abstract int update();
}
