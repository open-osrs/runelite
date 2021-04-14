import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class207 {
	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2039947103"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 10392
	} // L: 10393
}
