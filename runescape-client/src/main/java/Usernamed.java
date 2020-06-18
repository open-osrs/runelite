import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		signature = "(B)Lkq;",
		garbageValue = "-76"
	)
	@Export("username")
	Username username();
}
