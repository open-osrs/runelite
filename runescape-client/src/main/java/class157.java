import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class157 {
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -720969089
	)
	static int field1675;

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljd;",
		garbageValue = "1047371147"
	)
	public static StudioGame[] method3084() {
		return new StudioGame[]{StudioGame.game5, StudioGame.stellardawn, StudioGame.runescape, StudioGame.game3, StudioGame.game4, StudioGame.oldscape}; // L: 17
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-130227421"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 140
		int var2 = 0; // L: 141

		for (int var3 = 0; var3 < var1; ++var3) { // L: 142
			var2 = (var2 << 5) - var2 + AbstractSocket.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 143
	}
}
