import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(I)Lpo;",
		garbageValue = "-1191894118"
	)
	@Export("username")
	Username username();
}
