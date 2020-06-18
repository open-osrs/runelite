import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("m")
	int field1476;

	@ObfuscatedName("m")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Ldd;)I"
	)
	@Export("update")
	abstract int update();
}
