import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
public interface PlayerProvider {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Ldr;",
		garbageValue = "-1032997343"
	)
	PcmPlayer player();
}
