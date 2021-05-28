import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("PlayerProvider")
public interface PlayerProvider {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lbd;",
		garbageValue = "-597712139"
	)
	@Export("player")
	PcmPlayer player();
}
