import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("c")
	int field407;

	@ObfuscatedName("c")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lay;)I"
	)
	@Export("update")
	abstract int update();
}
