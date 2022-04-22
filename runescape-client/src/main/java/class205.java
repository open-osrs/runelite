import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
public class class205 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	public static void method4256() {
		if (KeyHandler.KeyHandler_instance != null) { // L: 161
			synchronized(KeyHandler.KeyHandler_instance) { // L: 162
				KeyHandler.KeyHandler_instance = null; // L: 163
			} // L: 164
		}

	} // L: 166
}
