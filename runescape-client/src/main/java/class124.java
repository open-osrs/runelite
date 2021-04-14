import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
public class class124 implements class123 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1858583893
	)
	@Export("SpriteBuffer_spriteCount")
	static int SpriteBuffer_spriteCount;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1284583399"
	)
	public static int method2490() {
		return ViewportMouse.ViewportMouse_entityCount; // L: 44
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2146818180"
	)
	public static int method2489(int var0, int var1) {
		return (-3 - var0 << 8) + var1; // L: 17
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(CLjh;B)I",
		garbageValue = "3"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 104
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 105
			var0 = Character.toLowerCase(var0); // L: 106
			var2 = (var0 << 4) + 1; // L: 107
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 109
			var2 = 1762;
		}

		return var2; // L: 110
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lir;Ljava/lang/String;Ljava/lang/String;I)[Loh;",
		garbageValue = "-64813696"
	)
	public static SpritePixels[] method2492(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 176
		int var4 = var0.getFileId(var3, var2); // L: 177
		return class337.method5985(var0, var3, var4); // L: 178
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1303478774"
	)
	static final void method2488() {
		Object var10000 = null; // L: 118
		String var0 = "Your friend list is full. Max of 200 for free users, and 400 for members";
		class69.addGameMessage(30, "", var0); // L: 120
	} // L: 122
}
