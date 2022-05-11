import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 1243608959
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000; // L: 6
	} // L: 8

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lhv;",
		garbageValue = "-238822980"
	)
	@Export("getModel")
	protected Model getModel() {
		return null; // L: 19
	}

	@ObfuscatedName("cd")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel(); // L: 11
		if (var11 != null) { // L: 12
			this.height = var11.height; // L: 13
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9); // L: 14
		}

	} // L: 16

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "110"
	)
	static final void method4211(int var0) {
		if (var0 >= 0) { // L: 8911
			int var1 = Client.menuArguments1[var0]; // L: 8912
			int var2 = Client.menuArguments2[var0]; // L: 8913
			int var3 = Client.menuOpcodes[var0]; // L: 8914
			int var4 = Client.menuIdentifiers[var0]; // L: 8915
			String var5 = Client.menuActions[var0]; // L: 8916
			String var6 = Client.menuTargets[var0]; // L: 8917
			ModeWhere.menuAction(var1, var2, var3, var4, var5, var6, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8918
		}
	} // L: 8919

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2137628055"
	)
	static final void method4210() {
		Client.field689 = Client.cycleCntr; // L: 12425
	} // L: 12426
}
