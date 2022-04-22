import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("v")
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lln;I)V",
		garbageValue = "-1197200273"
	)
	public static void method357(AbstractArchive var0) {
		EnumComposition.EnumDefinition_archive = var0; // L: 25
	} // L: 26

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "209833748"
	)
	static final void method359(String var0) {
		class149.method3138("Please remove " + var0 + " from your ignore list first"); // L: 106
	} // L: 107
}
