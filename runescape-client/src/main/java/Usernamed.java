import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(B)Lpm;",
		garbageValue = "-28"
	)
	@Export("username")
	Username username();
}
