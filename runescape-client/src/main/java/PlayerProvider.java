import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("PlayerProvider")
public interface PlayerProvider {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Ldr;",
		garbageValue = "-1032997343"
	)
	@Export("player")
	PcmPlayer player();
}
