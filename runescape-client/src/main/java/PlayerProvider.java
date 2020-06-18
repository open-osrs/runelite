import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("PlayerProvider")
public interface PlayerProvider {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)Ldt;",
		garbageValue = "-1371983171"
	)
	@Export("player")
	PcmPlayer player();
}
