import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
public class class314 {
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1476009263"
	)
	static final void method5693(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your ignore list").toString(); // L: 183
		UserComparator10.addGameMessage(30, "", var1); // L: 185
	} // L: 187
}
