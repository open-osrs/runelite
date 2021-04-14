import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("f")
	int field501;

	@ObfuscatedName("f")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lak;)I"
	)
	@Export("update")
	abstract int update();
}
