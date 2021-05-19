import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("q")
	public static short[][] field295;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lg;"
	)
	static class3 field292;
	@ObfuscatedName("br")
	static String field291;
	@ObfuscatedName("h")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	} // L: 20

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1733422772"
	)
	static boolean method469() {
		return (Client.drawPlayerNames & 4) != 0; // L: 4830
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1799291119"
	)
	static boolean method467(int var0) {
		for (int var1 = 0; var1 < Client.field842; ++var1) { // L: 10935
			if (Client.field844[var1] == var0) { // L: 10936
				return true;
			}
		}

		return false; // L: 10938
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "1"
	)
	static String method468(String var0) {
		PlayerType[] var1 = class249.PlayerType_values(); // L: 11757

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11758
			PlayerType var3 = var1[var2]; // L: 11759
			if (var3.modIcon != -1 && var0.startsWith(class169.method3495(var3.modIcon))) { // L: 11761 11762
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 11763
				break;
			}
		}

		return var0; // L: 11770
	}
}
