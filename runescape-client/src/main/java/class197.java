import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class class197 {
	@ObfuscatedName("f")
	static int[] field2373;

	static {
		new Object();
		field2373 = new int[33]; // L: 8
		field2373[0] = 0; // L: 11
		int var0 = 2; // L: 12

		for (int var1 = 1; var1 < 33; ++var1) { // L: 13
			field2373[var1] = var0 - 1; // L: 14
			var0 += var0; // L: 15
		}

	} // L: 17

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "657840099"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? class258.method4655(var0, 10, var1) : Integer.toString(var0); // L: 110 111
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1748256399"
	)
	static void method3783() {
		if (ModelData0.field1895 != null) { // L: 11693
			Client.field950 = Client.cycle; // L: 11694
			ModelData0.field1895.method4466(); // L: 11695

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 11696
				if (Client.players[var0] != null) { // L: 11697
					ModelData0.field1895.method4465((Client.players[var0].x >> 7) + FloorDecoration.baseX, (Client.players[var0].y >> 7) + WorldMapData_0.baseY); // L: 11698
				}
			}
		}

	} // L: 11702
}
