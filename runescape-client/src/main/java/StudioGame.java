import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("s")
	@Export("name")
	public final String name;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 589131085
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	} // L: 23

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-741989728"
	)
	static void method5776() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 124
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 125
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 126
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 127
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 128
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 129
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 130
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 131
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 132
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 133
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 134
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 135
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 136
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 139
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 140
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 141
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 142
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 143
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 144
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 145
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 146
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 147
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 148
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 149
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 150
		}

	} // L: 152

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "-184961670"
	)
	public static String method5780(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 11
			return "";
		} else if (var2 == 1) { // L: 12
			CharSequence var10 = var0[var1]; // L: 13
			return var10 == null ? "null" : var10.toString(); // L: 14 15
		} else {
			int var3 = var2 + var1; // L: 17
			int var4 = 0; // L: 18

			for (int var5 = var1; var5 < var3; ++var5) { // L: 19
				CharSequence var9 = var0[var5]; // L: 20
				if (var9 == null) { // L: 21
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 22
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 24

			for (int var6 = var1; var6 < var3; ++var6) { // L: 25
				CharSequence var7 = var0[var6]; // L: 26
				if (var7 == null) { // L: 27
					var8.append("null");
				} else {
					var8.append(var7); // L: 28
				}
			}

			return var8.toString(); // L: 30
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(ZLpz;B)V",
		garbageValue = "1"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5453
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) { // L: 5454
			var2 = var1.method7714(); // L: 5455
			var3 = var1.method7714(); // L: 5456
			int var4 = var1.readUnsignedShort(); // L: 5457
			WorldMapSectionType.xteaKeys = new int[var4][4]; // L: 5458

			for (var5 = 0; var5 < var4; ++var5) { // L: 5459
				for (var6 = 0; var6 < 4; ++var6) { // L: 5460
					WorldMapSectionType.xteaKeys[var5][var6] = var1.readInt(); // L: 5461
				}
			}

			class21.regions = new int[var4]; // L: 5464
			VarpDefinition.regionMapArchiveIds = new int[var4]; // L: 5465
			class133.regionLandArchiveIds = new int[var4]; // L: 5466
			Varcs.regionLandArchives = new byte[var4][]; // L: 5467
			DynamicObject.regionMapArchives = new byte[var4][]; // L: 5468
			boolean var16 = false; // L: 5469
			if (Client.field553) { // L: 5470
				if ((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) { // L: 5471
					var16 = true;
				}

				if (var2 / 8 == 48 && var3 / 8 == 148) { // L: 5472
					var16 = true;
				}
			}

			var4 = 0; // L: 5474

			for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) { // L: 5475
				for (var7 = (var3 - 6) / 8; var7 <= (var3 + 6) / 8; ++var7) { // L: 5476
					var8 = var7 + (var6 << 8); // L: 5477
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) { // L: 5478
						class21.regions[var4] = var8; // L: 5479
						VarpDefinition.regionMapArchiveIds[var4] = Players.archive5.getGroupId("m" + var6 + "_" + var7); // L: 5480
						class133.regionLandArchiveIds[var4] = Players.archive5.getGroupId("l" + var6 + "_" + var7); // L: 5481
						++var4; // L: 5482
					}
				}
			}

			FloorDecoration.method4591(var2, var3, true); // L: 5485
		} else {
			var2 = var1.method7715(); // L: 5488
			var3 = var1.method7713(); // L: 5489
			boolean var15 = var1.readUnsignedByte() == 1; // L: 5490
			var5 = var1.readUnsignedShort(); // L: 5491
			var1.importIndex(); // L: 5492

			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5493
				for (var7 = 0; var7 < 13; ++var7) { // L: 5494
					for (var8 = 0; var8 < 13; ++var8) { // L: 5495
						var9 = var1.readBits(1); // L: 5496
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5497
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5498
						}
					}
				}
			}

			var1.exportIndex(); // L: 5502
			WorldMapSectionType.xteaKeys = new int[var5][4]; // L: 5503

			for (var6 = 0; var6 < var5; ++var6) { // L: 5504
				for (var7 = 0; var7 < 4; ++var7) { // L: 5505
					WorldMapSectionType.xteaKeys[var6][var7] = var1.readInt(); // L: 5506
				}
			}

			class21.regions = new int[var5]; // L: 5509
			VarpDefinition.regionMapArchiveIds = new int[var5]; // L: 5510
			class133.regionLandArchiveIds = new int[var5]; // L: 5511
			Varcs.regionLandArchives = new byte[var5][]; // L: 5512
			DynamicObject.regionMapArchives = new byte[var5][]; // L: 5513
			var5 = 0; // L: 5514

			for (var6 = 0; var6 < 4; ++var6) { // L: 5515
				for (var7 = 0; var7 < 13; ++var7) { // L: 5516
					for (var8 = 0; var8 < 13; ++var8) { // L: 5517
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5518
						if (var9 != -1) { // L: 5519
							int var10 = var9 >> 14 & 1023; // L: 5520
							int var11 = var9 >> 3 & 2047; // L: 5521
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5522

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5523
								if (class21.regions[var13] == var12) {
									var12 = -1; // L: 5524
									break; // L: 5525
								}
							}

							if (var12 != -1) { // L: 5527
								class21.regions[var5] = var12; // L: 5528
								var13 = var12 >> 8 & 255; // L: 5529
								int var14 = var12 & 255; // L: 5530
								VarpDefinition.regionMapArchiveIds[var5] = Players.archive5.getGroupId("m" + var13 + "_" + var14); // L: 5531
								class133.regionLandArchiveIds[var5] = Players.archive5.getGroupId("l" + var13 + "_" + var14); // L: 5532
								++var5; // L: 5533
							}
						}
					}
				}
			}

			FloorDecoration.method4591(var3, var2, !var15); // L: 5539
		}

	} // L: 5541
}
