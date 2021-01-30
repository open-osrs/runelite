import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
public class class280 {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lib;Ljava/lang/String;Ljava/lang/String;B)[Llm;",
		garbageValue = "0"
	)
	public static Sprite[] method5008(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 139
		int var4 = var0.getFileId(var3, var2); // L: 140
		return ClientPreferences.method1918(var0, var3, var4); // L: 141
	}
}
