import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 2052938627
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000; // L: 6
	} // L: 8

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lgv;",
		garbageValue = "1835906978"
	)
	@Export("getModel")
	protected Model getModel() {
		return null; // L: 19
	}

	@ObfuscatedName("bu")
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
		descriptor = "(I)V",
		garbageValue = "1811451273"
	)
	static void method3629() {
		HealthBar.field1311 = new int[2000]; // L: 25
		int var0 = 0; // L: 26
		int var1 = 240; // L: 27

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) { // L: 28
			var3 = UserComparator8.method2427((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.075F + 0.425F * (float)var0 / 16.0F)); // L: 30
			HealthBar.field1311[var0] = var3; // L: 31
			++var0; // L: 29
		}

		var1 = 48; // L: 33

		for (int var5 = var1 / 6; var0 < HealthBar.field1311.length; var1 -= var5) { // L: 34 35 41
			var3 = var0 * 2; // L: 36

			for (int var4 = UserComparator8.method2427((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < HealthBar.field1311.length; ++var0) { // L: 37 38
				HealthBar.field1311[var0] = var4; // L: 39
			}
		}

	} // L: 43

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(III)Leb;",
		garbageValue = "85156791"
	)
	static RouteStrategy method3628(int var0, int var1) {
		Client.field878.approxDestinationX = var0; // L: 7760
		Client.field878.approxDestinationY = var1; // L: 7761
		Client.field878.approxDestinationSizeX = 1; // L: 7762
		Client.field878.approxDestinationSizeY = 1; // L: 7763
		return Client.field878; // L: 7764
	}
}
