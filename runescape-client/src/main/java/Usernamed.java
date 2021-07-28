import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(B)Loh;",
		garbageValue = "-6"
	)
	@Export("username")
	Username username();
}
