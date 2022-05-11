import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(B)Lqv;",
		garbageValue = "-38"
	)
	@Export("username")
	Username username();
}
