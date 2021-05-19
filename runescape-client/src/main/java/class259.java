import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public final class class259 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lcp;I)V",
		garbageValue = "1979127276"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class243.runScript(var0, 500000, 475000); // L: 106
	} // L: 107
}
