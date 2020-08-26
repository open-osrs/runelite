import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(I)Lku;",
		garbageValue = "1348007061"
	)
	@Export("username")
	Username username();
}
