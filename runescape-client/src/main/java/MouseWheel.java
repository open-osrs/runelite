import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
@Implements("MouseWheel")
public interface MouseWheel {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "128"
	)
	@Export("useRotation")
	int useRotation();
}
