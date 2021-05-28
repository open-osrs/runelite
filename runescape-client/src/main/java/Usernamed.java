import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(I)Lly;",
		garbageValue = "-1180229355"
	)
	@Export("username")
	Username username();
}
