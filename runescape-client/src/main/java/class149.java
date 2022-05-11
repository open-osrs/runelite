import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class149 {
	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1924718791"
	)
	static void method3024() {
		Tiles.Tiles_minPlane = 99; // L: 48
		Tiles.Tiles_underlays = new byte[4][104][104]; // L: 49
		Tiles.Tiles_overlays = new byte[4][104][104]; // L: 50
		Tiles.Tiles_shapes = new byte[4][104][104]; // L: 51
		RunException.field4812 = new byte[4][104][104]; // L: 52
		VerticalAlignment.field1993 = new int[4][105][105]; // L: 53
		NPC.field1259 = new byte[4][105][105]; // L: 54
		Interpreter.field839 = new int[105][105]; // L: 55
		class154.Tiles_hue = new int[104]; // L: 56
		MusicPatch.Tiles_saturation = new int[104]; // L: 57
		WallDecoration.Tiles_lightness = new int[104]; // L: 58
		Tiles.Tiles_hueMultiplier = new int[104]; // L: 59
		MenuAction.field866 = new int[104]; // L: 60
	} // L: 61
}
