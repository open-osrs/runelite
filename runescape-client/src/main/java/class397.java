import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
public final class class397 {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = -4044727011412295925L
	)
	static long field4289;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 99400153304744329L
	)
	static long field4288;
	@ObfuscatedName("x")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1663146092"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class269.addChatMessage(var0, var1, var2, (String)null); // L: 23
	} // L: 24
}
