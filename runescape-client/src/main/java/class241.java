import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
public class class241 {
	@ObfuscatedName("at")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1201083065
	)
	public static int field2833;

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1771880111"
	)
	static final void method5001(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your friend list").toString(); // L: 114
		Login.addGameMessage(30, "", var1); // L: 116
	} // L: 118

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(Lgg;IIIB)V",
		garbageValue = "-2"
	)
	static void method5002(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && Interpreter.clientPreferences.method2286() != 0) { // L: 3309
			if (var0.field2170 != null && var0.field2170.containsKey(var1)) { // L: 3310
				HealthBarUpdate.method2210((Integer)var0.field2170.get(var1), var2, var3); // L: 3311
			}
		}
	} // L: 3312
}
