import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(B)Lkk;",
		garbageValue = "75"
	)
	@Export("username")
	Username username();
}
