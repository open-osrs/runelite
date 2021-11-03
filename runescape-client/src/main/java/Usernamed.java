import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(I)Lpb;",
		garbageValue = "-1245448697"
	)
	@Export("username")
	Username username();
}
