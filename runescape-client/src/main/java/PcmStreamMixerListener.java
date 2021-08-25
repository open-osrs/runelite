import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("n")
	int field381;

	@ObfuscatedName("n")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lae;)I"
	)
	@Export("update")
	abstract int update();
}
