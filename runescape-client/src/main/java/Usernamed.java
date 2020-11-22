import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(B)Lkm;",
		garbageValue = "104"
	)
	@Export("username")
	Username username();
}
