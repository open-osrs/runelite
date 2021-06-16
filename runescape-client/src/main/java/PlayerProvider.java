import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("PlayerProvider")
public interface PlayerProvider {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lbq;",
		garbageValue = "2087332852"
	)
	@Export("player")
	PcmPlayer player();
}
