import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("PlayerProvider")
public interface PlayerProvider {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ldp;",
		garbageValue = "-2011148953"
	)
	@Export("player")
	PcmPlayer player();
}
