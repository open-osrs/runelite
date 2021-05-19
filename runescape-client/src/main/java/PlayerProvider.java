import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
@Implements("PlayerProvider")
public interface PlayerProvider {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Lbd;",
		garbageValue = "65542938"
	)
	@Export("player")
	PcmPlayer player();
}
