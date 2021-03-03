import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("PlayerProvider")
public interface PlayerProvider {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(S)Ldh;",
		garbageValue = "-25384"
	)
	@Export("player")
	PcmPlayer player();
}
