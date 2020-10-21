import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("Entity")
public abstract class Entity extends DualNode {
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "[Llc;"
	)
	@Export("mapDotSprites")
	static Sprite[] mapDotSprites;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 685420897
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1647777713
	)
	@Export("height")
	public int height;

	protected Entity() {
		this.height = 1000; // L: 6
	} // L: 8

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Leh;",
		garbageValue = "-2070677844"
	)
	@Export("getModel")
	protected Model getModel() {
		return null; // L: 19
	}

	@ObfuscatedName("cg")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel(); // L: 11
		if (var11 != null) { // L: 12
			this.height = var11.height; // L: 13
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9); // L: 14
		}

	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lbd;I)V",
		garbageValue = "-1146861517"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class58.runScript(var0, 500000); // L: 97
	} // L: 98
}
