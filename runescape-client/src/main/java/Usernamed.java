import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(B)Lpb;",
		garbageValue = "0"
	)
	@Export("username")
	Username username();
}
