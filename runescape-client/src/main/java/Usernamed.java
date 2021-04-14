import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(I)Llw;",
		garbageValue = "-447538147"
	)
	@Export("username")
	Username username();
}
