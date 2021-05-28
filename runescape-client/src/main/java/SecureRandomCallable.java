import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = 45831589
	)
	@Export("cameraY")
	static int cameraY;

	SecureRandomCallable() {
	} // L: 36

	public Object call() {
		SecureRandom var2 = new SecureRandom(); // L: 47
		var2.nextInt(); // L: 48
		return var2; // L: 51
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "61"
	)
	public static void method2055() {
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 218
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 219
	} // L: 220
}
