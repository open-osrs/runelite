import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
public class class285 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lcp;I)V",
		garbageValue = "1760908657"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		ScriptFrame.runScript(var0, 500000, 475000); // L: 110
	} // L: 111

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "581875220"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false); // L: 92
	}
}
