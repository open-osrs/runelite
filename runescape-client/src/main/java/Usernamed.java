import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(I)Lpp;",
		garbageValue = "-2077546643"
	)
	@Export("username")
	Username username();
}
