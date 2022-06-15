import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(I)Lqa;",
		garbageValue = "1509373240"
	)
	@Export("username")
	Username username();
}
