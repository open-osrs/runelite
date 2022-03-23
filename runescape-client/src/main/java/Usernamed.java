import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(B)Lqy;",
		garbageValue = "4"
	)
	@Export("username")
	Username username();
}
