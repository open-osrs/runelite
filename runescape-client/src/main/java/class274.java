import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
public final class class274 {
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 2076517525
	)
	static int field3274;

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1507695704"
	)
	static final void method5065(String var0) {
		SecureRandomCallable.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(ZLoq;I)V",
		garbageValue = "388487038"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) {
			var2 = var1.readUnsignedShort();
			int var3 = var1.readUnsignedShort();
			var4 = var1.readUnsignedShort();
			class244.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					class244.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class87.regions = new int[var4];
			class262.regionMapArchiveIds = new int[var4];
			UserComparator6.regionLandArchiveIds = new int[var4];
			WorldMapData_0.regionLandArchives = new byte[var4][];
			class16.regionMapArchives = new byte[var4][];
			boolean var16 = false;
			if (Client.field538) {
				if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
					var16 = true;
				}

				if (var3 / 8 == 48 && var2 / 8 == 148) {
					var16 = true;
				}
			}

			var4 = 0;

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
				for (var7 = (var2 - 6) / 8; var7 <= (var2 + 6) / 8; ++var7) {
					var8 = var7 + (var6 << 8);
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
						class87.regions[var4] = var8;
						class262.regionMapArchiveIds[var4] = ObjectComposition.archive5.getGroupId("m" + var6 + "_" + var7);
						UserComparator6.regionLandArchiveIds[var4] = ObjectComposition.archive5.getGroupId("l" + var6 + "_" + var7);
						++var4;
					}
				}
			}

			TaskHandler.method2739(var3, var2, true);
		} else {
			var2 = var1.method6855();
			boolean var15 = var1.readUnsignedByte() == 1;
			var4 = var1.readUnsignedShort();
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			class244.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					class244.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class87.regions = new int[var5];
			class262.regionMapArchiveIds = new int[var5];
			UserComparator6.regionLandArchiveIds = new int[var5];
			WorldMapData_0.regionLandArchives = new byte[var5][];
			class16.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = var9 >> 14 & 1023;
							int var11 = var9 >> 3 & 2047;
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (class87.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								class87.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								class262.regionMapArchiveIds[var5] = ObjectComposition.archive5.getGroupId("m" + var13 + "_" + var14);
								UserComparator6.regionLandArchiveIds[var5] = ObjectComposition.archive5.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			TaskHandler.method2739(var4, var2, !var15);
		}

	}
}
