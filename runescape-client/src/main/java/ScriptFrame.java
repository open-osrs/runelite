import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("tq")
	@ObfuscatedGetter(
		intValue = -1251502185
	)
	static int field457;
	@ObfuscatedName("m")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1911995335
	)
	static int field449;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1536799167
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("l")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("k")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "125"
	)
	static void method1066(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75
}
