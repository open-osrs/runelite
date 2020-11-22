import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("PcmStreamMixerListener")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("f")
	int field1477;

	@ObfuscatedName("f")
	@Export("remove2")
	abstract void remove2();

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ldf;)I"
	)
	@Export("update")
	abstract int update();
}
