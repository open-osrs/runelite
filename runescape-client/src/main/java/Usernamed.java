import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(I)Llc;",
		garbageValue = "-1312829614"
	)
	@Export("username")
	Username username();
}
