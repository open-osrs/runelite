import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("Players")
public class Players {
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = -579575011
	)
	static int field1363;
	@ObfuscatedName("u")
	static byte[] field1350;
	@ObfuscatedName("p")
	static byte[] field1351;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lnu;"
	)
	static Buffer[] field1352;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1868594255
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("k")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1778639293
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("h")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("n")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("l")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("m")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1410622735
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("c")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	static Buffer field1362;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = 1389932207
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;

	static {
		field1350 = new byte[2048]; // L: 18
		field1351 = new byte[2048]; // L: 19
		field1352 = new Buffer[2048]; // L: 20
		Players_count = 0; // L: 21
		Players_indices = new int[2048]; // L: 22
		Players_emptyIdxCount = 0; // L: 23
		Players_emptyIndices = new int[2048]; // L: 24
		Players_regions = new int[2048]; // L: 25
		Players_orientations = new int[2048]; // L: 26
		Players_targetIndices = new int[2048]; // L: 27
		Players_pendingUpdateCount = 0; // L: 28
		Players_pendingUpdateIndices = new int[2048]; // L: 29
		field1362 = new Buffer(new byte[5000]); // L: 30
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1145960243"
	)
	static int method2285(int var0, int var1) {
		if (var0 == -2) { // L: 37
			return 12345678;
		} else if (var0 == -1) { // L: 38
			if (var1 < 0) { // L: 39
				var1 = 0; // L: 40
			} else if (var1 > 127) { // L: 42
				var1 = 127; // L: 43
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 51
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1829024921"
	)
	public static boolean method2287(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) { // L: 45
			return true;
		} else {
			if (var0 != 0) { // L: 46
				char[] var1 = class300.cp1252AsciiExtension; // L: 48

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 49
					char var3 = var1[var2]; // L: 50
					if (var0 == var3) { // L: 52
						return true; // L: 53
					}
				}
			}

			return false; // L: 59
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-499281641"
	)
	static String method2283() {
		String var0;
		if (Login.clientPreferences.hideUsername) { // L: 188
			String var2 = Login.Login_username; // L: 190
			int var4 = var2.length(); // L: 193
			char[] var5 = new char[var4]; // L: 195

			for (int var6 = 0; var6 < var4; ++var6) { // L: 196
				var5[var6] = '*';
			}

			String var3 = new String(var5); // L: 197
			var0 = var3; // L: 201
		} else {
			var0 = Login.Login_username; // L: 203
		}

		return var0; // L: 204
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lir;Ljava/lang/String;Ljava/lang/String;I)[Low;",
		garbageValue = "-210921559"
	)
	public static IndexedSprite[] method2284(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 146
		int var4 = var0.getFileId(var3, var2); // L: 147
		return class309.method5603(var0, var3, var4); // L: 148
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(ZLnk;B)V",
		garbageValue = "-121"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 4695
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) { // L: 4696
			int var2 = var1.method6766(); // L: 4697
			var3 = var1.method6617(); // L: 4698
			var4 = var1.readUnsignedShort(); // L: 4699
			NPC.xteaKeys = new int[var4][4]; // L: 4700

			for (var5 = 0; var5 < var4; ++var5) { // L: 4701
				for (var6 = 0; var6 < 4; ++var6) { // L: 4702
					NPC.xteaKeys[var5][var6] = var1.readInt(); // L: 4703
				}
			}

			class11.regions = new int[var4]; // L: 4706
			WorldMapData_0.regionMapArchiveIds = new int[var4]; // L: 4707
			class18.regionLandArchiveIds = new int[var4]; // L: 4708
			class15.regionLandArchives = new byte[var4][]; // L: 4709
			MouseHandler.regionMapArchives = new byte[var4][]; // L: 4710
			boolean var16 = false; // L: 4711
			if ((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) { // L: 4712
				var16 = true;
			}

			if (var2 / 8 == 48 && var3 / 8 == 148) { // L: 4713
				var16 = true;
			}

			var4 = 0; // L: 4714

			for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) { // L: 4715
				for (var7 = (var3 - 6) / 8; var7 <= (var3 + 6) / 8; ++var7) { // L: 4716
					var8 = var7 + (var6 << 8); // L: 4717
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) { // L: 4718
						class11.regions[var4] = var8; // L: 4719
						WorldMapData_0.regionMapArchiveIds[var4] = class157.archive5.getGroupId("m" + var6 + "_" + var7); // L: 4720
						class18.regionLandArchiveIds[var4] = class157.archive5.getGroupId("l" + var6 + "_" + var7); // L: 4721
						++var4; // L: 4722
					}
				}
			}

			LoginScreenAnimation.method2185(var2, var3, true); // L: 4725
		} else {
			boolean var15 = var1.method6623() == 1; // L: 4728
			var3 = var1.method6766(); // L: 4729
			var4 = var1.method6766(); // L: 4730
			var5 = var1.readUnsignedShort(); // L: 4731
			var1.importIndex(); // L: 4732

			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 4733
				for (var7 = 0; var7 < 13; ++var7) { // L: 4734
					for (var8 = 0; var8 < 13; ++var8) { // L: 4735
						var9 = var1.readBits(1); // L: 4736
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 4737
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 4738
						}
					}
				}
			}

			var1.exportIndex(); // L: 4742
			NPC.xteaKeys = new int[var5][4]; // L: 4743

			for (var6 = 0; var6 < var5; ++var6) { // L: 4744
				for (var7 = 0; var7 < 4; ++var7) { // L: 4745
					NPC.xteaKeys[var6][var7] = var1.readInt(); // L: 4746
				}
			}

			class11.regions = new int[var5]; // L: 4749
			WorldMapData_0.regionMapArchiveIds = new int[var5]; // L: 4750
			class18.regionLandArchiveIds = new int[var5]; // L: 4751
			class15.regionLandArchives = new byte[var5][]; // L: 4752
			MouseHandler.regionMapArchives = new byte[var5][]; // L: 4753
			var5 = 0; // L: 4754

			for (var6 = 0; var6 < 4; ++var6) { // L: 4755
				for (var7 = 0; var7 < 13; ++var7) { // L: 4756
					for (var8 = 0; var8 < 13; ++var8) { // L: 4757
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 4758
						if (var9 != -1) { // L: 4759
							int var10 = var9 >> 14 & 1023; // L: 4760
							int var11 = var9 >> 3 & 2047; // L: 4761
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 4762

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 4763
								if (class11.regions[var13] == var12) {
									var12 = -1; // L: 4764
									break; // L: 4765
								}
							}

							if (var12 != -1) { // L: 4767
								class11.regions[var5] = var12; // L: 4768
								var13 = var12 >> 8 & 255; // L: 4769
								int var14 = var12 & 255; // L: 4770
								WorldMapData_0.regionMapArchiveIds[var5] = class157.archive5.getGroupId("m" + var13 + "_" + var14); // L: 4771
								class18.regionLandArchiveIds[var5] = class157.archive5.getGroupId("l" + var13 + "_" + var14); // L: 4772
								++var5; // L: 4773
							}
						}
					}
				}
			}

			LoginScreenAnimation.method2185(var3, var4, !var15); // L: 4779
		}

	} // L: 4781
}
