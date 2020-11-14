import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("PlayerProvider")
public interface PlayerProvider {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ldh;",
		garbageValue = "1306134642"
	)
	@Export("player")
	PcmPlayer player();
}
