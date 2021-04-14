import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
public class class208 {
	@ObfuscatedName("f")
	static int[] field2466;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = -1061330445
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;

	static {
		new Object();
		field2466 = new int[33]; // L: 8
		field2466[0] = 0; // L: 11
		int var0 = 2; // L: 12

		for (int var1 = 1; var1 < 33; ++var1) { // L: 13
			field2466[var1] = var0 - 1; // L: 14
			var0 += var0; // L: 15
		}

	} // L: 17

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "([Lbu;II[I[II)V",
		garbageValue = "1470133569"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) { // L: 81
			int var5 = var1 - 1; // L: 82
			int var6 = var2 + 1; // L: 83
			int var7 = (var2 + var1) / 2; // L: 84
			World var8 = var0[var7]; // L: 85
			var0[var7] = var0[var1]; // L: 86
			var0[var1] = var8; // L: 87

			while (var5 < var6) { // L: 88
				boolean var9 = true; // L: 89

				int var10;
				int var11;
				int var12;
				do {
					--var6; // L: 91

					for (var10 = 0; var10 < 4; ++var10) { // L: 92
						if (var3[var10] == 2) { // L: 95
							var11 = var0[var6].index; // L: 96
							var12 = var8.index; // L: 97
						} else if (var3[var10] == 1) { // L: 99
							var11 = var0[var6].population; // L: 100
							var12 = var8.population; // L: 101
							if (var11 == -1 && var4[var10] == 1) { // L: 102
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 103
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 105
							var11 = var0[var6].isMembersOnly() ? 1 : 0; // L: 106
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 107
						} else {
							var11 = var0[var6].id; // L: 110
							var12 = var8.id; // L: 111
						}

						if (var12 != var11) { // L: 113
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) { // L: 116 117
								var9 = false; // L: 119
							}
							break;
						}

						if (var10 == 3) { // L: 114
							var9 = false;
						}
					}
				} while(var9);

				var9 = true; // L: 124

				do {
					++var5; // L: 126

					for (var10 = 0; var10 < 4; ++var10) { // L: 127
						if (var3[var10] == 2) { // L: 130
							var11 = var0[var5].index; // L: 131
							var12 = var8.index; // L: 132
						} else if (var3[var10] == 1) { // L: 134
							var11 = var0[var5].population; // L: 135
							var12 = var8.population; // L: 136
							if (var11 == -1 && var4[var10] == 1) { // L: 137
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001; // L: 138
							}
						} else if (var3[var10] == 3) { // L: 140
							var11 = var0[var5].isMembersOnly() ? 1 : 0; // L: 141
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 142
						} else {
							var11 = var0[var5].id; // L: 145
							var12 = var8.id; // L: 146
						}

						if (var11 != var12) { // L: 148
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) { // L: 151 152
								var9 = false; // L: 154
							}
							break;
						}

						if (var10 == 3) { // L: 149
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) { // L: 159
					World var13 = var0[var5]; // L: 160
					var0[var5] = var0[var6]; // L: 161
					var0[var6] = var13; // L: 162
				}
			}

			sortWorlds(var0, var1, var6, var3, var4); // L: 165
			sortWorlds(var0, var6 + 1, var2, var3, var4); // L: 166
		}

	} // L: 168

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "([Lhu;II)V",
		garbageValue = "1720951571"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11101
			Widget var3 = var0[var2]; // L: 11102
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !WorldMapArea.isComponentHidden(var3))) { // L: 11103 11104 11105
				if (var3.type == 0) { // L: 11106
					if (!var3.isIf3 && WorldMapArea.isComponentHidden(var3) && var3 != Varps.mousedOverWidgetIf1) { // L: 11107
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 11108
					if (var3.children != null) { // L: 11109
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11110
					if (var4 != null) { // L: 11111
						Archive.method4471(var4.group);
					}
				}

				if (var3.type == 6) { // L: 11113
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 11114
						boolean var7 = class159.runCs1(var3); // L: 11115
						if (var7) { // L: 11117
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 11118
						}

						if (var5 != -1) { // L: 11119
							SequenceDefinition var6 = class225.SequenceDefinition_get(var5); // L: 11120

							for (var3.modelFrameCycle += Client.field799; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class29.invalidateWidget(var3)) { // L: 11121 11122 11129
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 11123
								++var3.modelFrame; // L: 11124
								if (var3.modelFrame >= var6.frameIds.length) { // L: 11125
									var3.modelFrame -= var6.frameCount; // L: 11126
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 11127
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field2680 != 0 && !var3.isIf3) { // L: 11133
						int var8 = var3.field2680 >> 16; // L: 11134
						var5 = var3.field2680 << 16 >> 16; // L: 11135
						var8 *= Client.field799; // L: 11136
						var5 *= Client.field799; // L: 11137
						var3.modelAngleX = var8 + var3.modelAngleX & 2047; // L: 11138
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 11139
						class29.invalidateWidget(var3); // L: 11140
					}
				}
			}
		}

	} // L: 11144
}
