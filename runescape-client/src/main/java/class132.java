import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class132 extends class128 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1443435093
	)
	int field1599;
	@ObfuscatedName("q")
	byte field1597;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class132(class131 var1) {
		this.this$0 = var1;
		this.field1599 = -1; // L: 128
	} // L: 131

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-611912046"
	)
	void vmethod3040(Buffer var1) {
		this.field1599 = var1.readUnsignedShort(); // L: 134
		this.field1597 = var1.readByte(); // L: 135
	} // L: 136

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lek;B)V",
		garbageValue = "-73"
	)
	void vmethod3041(ClanSettings var1) {
		var1.method2930(this.field1599, this.field1597); // L: 139
	} // L: 140

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IS)J",
		garbageValue = "-14369"
	)
	public static long method2833(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0]; // L: 56
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Z",
		garbageValue = "-32"
	)
	static final boolean method2834(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 211
		Buffer var4 = new Buffer(var0); // L: 212
		int var5 = -1; // L: 213

		label71:
		while (true) {
			int var6 = var4.method7531(); // L: 215
			if (var6 == 0) { // L: 216
				return var3; // L: 247
			}

			var5 += var6; // L: 217
			int var7 = 0; // L: 218
			boolean var8 = false; // L: 219

			while (true) {
				int var9;
				while (!var8) { // L: 221
					var9 = var4.readUShortSmart(); // L: 227
					if (var9 == 0) { // L: 228
						continue label71;
					}

					var7 += var9 - 1; // L: 229
					int var10 = var7 & 63; // L: 230
					int var11 = var7 >> 6 & 63; // L: 231
					int var12 = var4.readUnsignedByte() >> 2; // L: 232
					int var13 = var11 + var1; // L: 233
					int var14 = var10 + var2; // L: 234
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 235
						ObjectComposition var15 = class82.getObjectDefinition(var5); // L: 236
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 237
							if (!var15.needsModelFiles()) { // L: 238
								++Client.field570; // L: 239
								var3 = false; // L: 240
							}

							var8 = true; // L: 242
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 222
				if (var9 == 0) { // L: 223
					break;
				}

				var4.readUnsignedByte(); // L: 224
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Laj;I)V",
		garbageValue = "-1921096355"
	)
	static void method2829(GameEngine var0) {
		while (TaskHandler.isKeyDown()) { // L: 1837
			if (class12.field61 == 13) { // L: 1838
				WorldMapScaleHandler.method4927(); // L: 1839
				return; // L: 1840
			}

			if (class12.field61 == 96) { // L: 1842
				if (Login.worldSelectPage > 0 && class126.worldSelectLeftSprite != null) { // L: 1843
					--Login.worldSelectPage; // L: 1844
				}
			} else if (class12.field61 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class424.worldSelectRightSprite != null) { // L: 1847 1848
				++Login.worldSelectPage; // L: 1849
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !Login.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 1853
			int var1 = Login.xPadding + 280; // L: 1854
			if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1855
				class306.changeWorldSelectSorting(0, 0); // L: 1856
				return; // L: 1857
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1859
				class306.changeWorldSelectSorting(0, 1); // L: 1860
				return; // L: 1861
			}

			int var2 = Login.xPadding + 390; // L: 1863
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1864
				class306.changeWorldSelectSorting(1, 0); // L: 1865
				return; // L: 1866
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1868
				class306.changeWorldSelectSorting(1, 1); // L: 1869
				return; // L: 1870
			}

			int var3 = Login.xPadding + 500; // L: 1872
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1873
				class306.changeWorldSelectSorting(2, 0); // L: 1874
				return; // L: 1875
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1877
				class306.changeWorldSelectSorting(2, 1); // L: 1878
				return; // L: 1879
			}

			int var4 = Login.xPadding + 610; // L: 1881
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1882
				class306.changeWorldSelectSorting(3, 0); // L: 1883
				return; // L: 1884
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1886
				class306.changeWorldSelectSorting(3, 1); // L: 1887
				return; // L: 1888
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 1890
				WorldMapScaleHandler.method4927(); // L: 1891
				return; // L: 1892
			}

			if (Login.hoveredWorldIndex != -1) { // L: 1894
				World var5 = World.World_worlds[Login.hoveredWorldIndex]; // L: 1895
				InvDefinition.changeWorld(var5); // L: 1896
				WorldMapScaleHandler.method4927(); // L: 1897
				return; // L: 1898
			}

			if (Login.worldSelectPage > 0 && class126.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class126.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class433.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class433.canvasHeight / 2 + 50) { // L: 1900
				--Login.worldSelectPage; // L: 1901
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && class424.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GraphicsObject.canvasWidth - class424.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GraphicsObject.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class433.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class433.canvasHeight / 2 + 50) { // L: 1903
				++Login.worldSelectPage; // L: 1904
			}
		}

	} // L: 1907

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1705854659"
	)
	static final void method2836(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 8715
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 8716
				Client.field652[var4] = true;
			}
		}

	} // L: 8718
}
