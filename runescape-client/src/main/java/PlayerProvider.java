import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
@Implements("PlayerProvider")
public interface PlayerProvider {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Ly;",
		garbageValue = "1627596097"
	)
	@Export("player")
	PcmPlayer player();
}
