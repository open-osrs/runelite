import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("z")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1900092655
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("o")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("g")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1150658828"
	)
	static final int method1160(int var0, int var1) {
		int var2 = AbstractByteArrayCopier.method4754(var0 - 1, var1 - 1) + AbstractByteArrayCopier.method4754(var0 + 1, var1 - 1) + AbstractByteArrayCopier.method4754(var0 - 1, 1 + var1) + AbstractByteArrayCopier.method4754(1 + var0, 1 + var1); // L: 478
		int var3 = AbstractByteArrayCopier.method4754(var0 - 1, var1) + AbstractByteArrayCopier.method4754(var0 + 1, var1) + AbstractByteArrayCopier.method4754(var0, var1 - 1) + AbstractByteArrayCopier.method4754(var0, 1 + var1); // L: 479
		int var4 = AbstractByteArrayCopier.method4754(var0, var1); // L: 480
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 481
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1457317162"
	)
	public static void method1162() {
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 203
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 204
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 205
	} // L: 206

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2049667845"
	)
	static final void method1161() {
		int var0 = AbstractByteArrayCopier.menuX; // L: 7859
		int var1 = HitSplatDefinition.menuY; // L: 7860
		int var2 = SoundCache.menuWidth; // L: 7861
		int var3 = GrandExchangeOfferOwnWorldComparator.menuHeight; // L: 7862
		int var4 = 6116423; // L: 7863
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4); // L: 7864
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0); // L: 7865
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0); // L: 7866
		WorldMapArea.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1); // L: 7867
		int var5 = MouseHandler.MouseHandler_x; // L: 7868
		int var6 = MouseHandler.MouseHandler_y; // L: 7869

		int var7;
		int var8;
		int var9;
		for (var7 = 0; var7 < Client.menuOptionsCount; ++var7) { // L: 7870
			var8 = var1 + (Client.menuOptionsCount - 1 - var7) * 15 + 31; // L: 7871
			var9 = 16777215; // L: 7872
			if (var5 > var0 && var5 < var2 + var0 && var6 > var8 - 13 && var6 < var8 + 3) { // L: 7873
				var9 = 16776960;
			}

			Font var12 = WorldMapArea.fontBold12; // L: 7874
			String var13;
			if (var7 < 0) { // L: 7877
				var13 = ""; // L: 7878
			} else if (Client.menuTargets[var7].length() > 0) { // L: 7881
				var13 = Client.menuActions[var7] + " " + Client.menuTargets[var7];
			} else {
				var13 = Client.menuActions[var7]; // L: 7882
			}

			var12.draw(var13, var0 + 3, var8, var9, 0); // L: 7884
		}

		var7 = AbstractByteArrayCopier.menuX; // L: 7886
		var8 = HitSplatDefinition.menuY; // L: 7887
		var9 = SoundCache.menuWidth; // L: 7888
		int var10 = GrandExchangeOfferOwnWorldComparator.menuHeight; // L: 7889

		for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 7891
			if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) { // L: 7892
				Client.field826[var11] = true;
			}
		}

	} // L: 7895
}
