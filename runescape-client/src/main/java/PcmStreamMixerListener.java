import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("i")
	int field368;

	@ObfuscatedName("i")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Las;)I"
	)
	@Export("update")
	abstract int update();
}
