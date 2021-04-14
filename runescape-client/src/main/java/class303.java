import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
public class class303 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lir;I)V",
		garbageValue = "-1939913696"
	)
	public static void method5526(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lje;",
		garbageValue = "1697768546"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0); // L: 25
			var1 = new VarpDefinition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 28
			return var1; // L: 29
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "-109"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 105
		int var4 = 0; // L: 106

		for (int var5 = 0; var5 < var2; ++var5) { // L: 107
			int var6 = var0[var5 + var1] & 255; // L: 108
			if (var6 != 0) { // L: 109
				if (var6 >= 128 && var6 < 160) { // L: 110
					char var7 = class300.cp1252AsciiExtension[var6 - 128]; // L: 111
					if (var7 == 0) { // L: 112
						var7 = '?';
					}

					var6 = var7; // L: 113
				}

				var3[var4++] = (char)var6; // L: 115
			}
		}

		return new String(var3, 0, var4); // L: 117
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1225560249"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		NPCComposition.scrollBarSprites[0].drawAt(var0, var1); // L: 10063
		NPCComposition.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 10064
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field665); // L: 10065
		int var5 = var3 * (var3 - 32) / var4; // L: 10066
		if (var5 < 8) { // L: 10067
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 10068
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field666); // L: 10069
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field668); // L: 10070
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field668); // L: 10071
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field668); // L: 10072
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field668); // L: 10073
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field667); // L: 10074
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field667); // L: 10075
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var5 + var1 + 15, 16, Client.field667); // L: 10076
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field667); // L: 10077
	} // L: 10078
}
