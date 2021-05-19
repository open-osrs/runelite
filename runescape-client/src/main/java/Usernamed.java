import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(B)Lla;",
		garbageValue = "98"
	)
	@Export("username")
	Username username();
}
