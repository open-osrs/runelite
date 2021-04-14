import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("PlayerProvider")
public interface PlayerProvider {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Lbh;",
		garbageValue = "87"
	)
	@Export("player")
	PcmPlayer player();
}
