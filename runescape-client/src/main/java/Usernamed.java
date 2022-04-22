import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(I)Lqb;",
		garbageValue = "529633925"
	)
	@Export("username")
	Username username();
}
