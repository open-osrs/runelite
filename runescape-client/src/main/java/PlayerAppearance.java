import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("PlayerAppearance")
public class PlayerAppearance {
	@ObfuscatedName("n")
	public static short[] field2551;
	@ObfuscatedName("l")
	public static short[] field2557;
	@ObfuscatedName("u")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "[Lmz;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	static Widget field2561;
	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("h")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("v")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("x")
	@Export("isFemale")
	public boolean isFemale;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1354767305
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = 4237745926834105329L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -9032621896431904669L
	)
	long field2555;

	static {
		equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10}; // L: 23
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260); // L: 24
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([I[IZII)V",
		garbageValue = "1899379562"
	)
	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) { // L: 27
			var1 = new int[12]; // L: 28

			for (int var5 = 0; var5 < 7; ++var5) { // L: 29
				for (int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) { // L: 30
					KitDefinition var7 = WorldMapData_1.KitDefinition_get(var6); // L: 31
					if (var7 != null && !var7.nonSelectable && var7.bodypartID == var5 + (var3 ? 7 : 0)) { // L: 32
						var1[equipmentIndices[var5]] = var6 + 256;
						break;
					}
				}
			}
		}

		this.equipment = var1;
		this.bodyColors = var2;
		this.isFemale = var3;
		this.npcTransformId = var4;
		this.setHash(); // L: 43
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1452083272"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		if (var1 != 1 || !this.isFemale) {
			int var3 = this.equipment[equipmentIndices[var1]];
			if (var3 != 0) {
				var3 -= 256;

				KitDefinition var4;
				do {
					if (!var2) { // L: 52
						--var3;
						if (var3 < 0) {
							var3 = KitDefinition.KitDefinition_fileCount - 1;
						}
					} else {
						++var3;
						if (var3 >= KitDefinition.KitDefinition_fileCount) {
							var3 = 0;
						}
					}

					var4 = WorldMapData_1.KitDefinition_get(var3);
				} while(var4 == null || var4.nonSelectable || var4.bodypartID != (this.isFemale ? 7 : 0) + var1);

				this.equipment[equipmentIndices[var1]] = var3 + 256;
				this.setHash(); // L: 64
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1113913855"
	)
	public void method4043(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		if (!var2) {
			do {
				--var3; // L: 71
				if (var3 < 0) {
					var3 = WorldMapScaleHandler.field366[var1].length - 1; // L: 73
				}
			} while(!class171.method3535(var1, var3));
		} else {
			do {
				++var3; // L: 80
				if (var3 >= WorldMapScaleHandler.field366[var1].length) {
					var3 = 0;
				}
			} while(!class171.method3535(var1, var3));
		}

		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "77"
	)
	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) {
			this.update((int[])null, this.bodyColors, var1, -1); // L: 91
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "1256612207"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.isFemale ? 1 : 0); // L: 95

		int var2;
		for (var2 = 0; var2 < 7; ++var2) { // L: 96
			int var3 = this.equipment[equipmentIndices[var2]]; // L: 97
			if (var3 == 0) { // L: 98
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256); // L: 99
			}
		}

		for (var2 = 0; var2 < 5; ++var2) { // L: 101
			var1.writeByte(this.bodyColors[var2]);
		}

	} // L: 102

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1623503155"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash; // L: 105
		int var3 = this.equipment[5]; // L: 106
		int var4 = this.equipment[9]; // L: 107
		this.equipment[5] = var4; // L: 108
		this.equipment[9] = var3; // L: 109
		this.hash = 0L; // L: 110

		int var5;
		for (var5 = 0; var5 < 12; ++var5) { // L: 111
			this.hash <<= 4; // L: 112
			if (this.equipment[var5] >= 256) { // L: 113
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) { // L: 115
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) { // L: 116
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) { // L: 117
			this.hash <<= 3; // L: 118
			this.hash += (long)this.bodyColors[var5]; // L: 119
		}

		this.hash <<= 1; // L: 121
		this.hash += (long)(this.isFemale ? 1 : 0); // L: 122
		this.equipment[5] = var3; // L: 123
		this.equipment[9] = var4; // L: 124
		if (0L != var1 && this.hash != var1) { // L: 125
			PlayerAppearance_cachedModels.remove(var1);
		}

	} // L: 126

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljy;ILjy;II)Leh;",
		garbageValue = "-344109414"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 129
			return WorldMapIcon_0.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4); // L: 130
		} else {
			long var5 = this.hash; // L: 132
			int[] var7 = this.equipment; // L: 133
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) { // L: 134
				var7 = new int[12]; // L: 135

				for (int var8 = 0; var8 < 12; ++var8) { // L: 136
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) { // L: 137
					var5 += (long)(var1.shield - this.equipment[5] << 40); // L: 138
					var7[5] = var1.shield; // L: 139
				}

				if (var1.weapon >= 0) { // L: 141
					var5 += (long)(var1.weapon - this.equipment[3] << 48); // L: 142
					var7[3] = var1.weapon; // L: 143
				}
			}

			Model var15 = (Model)PlayerAppearance_cachedModels.get(var5); // L: 146
			if (var15 == null) { // L: 147
				boolean var9 = false; // L: 148

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) { // L: 149
					var11 = var7[var10]; // L: 150
					if (var11 >= 256 && var11 < 512 && !WorldMapData_1.KitDefinition_get(var11 - 256).ready()) { // L: 151 152
						var9 = true;
					}

					if (var11 >= 512 && !SecureRandomCallable.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale)) { // L: 154 155
						var9 = true;
					}
				}

				if (var9) { // L: 158
					if (-1L != this.field2555) { // L: 159
						var15 = (Model)PlayerAppearance_cachedModels.get(this.field2555);
					}

					if (var15 == null) { // L: 160
						return null;
					}
				}

				if (var15 == null) { // L: 162
					ModelData[] var16 = new ModelData[12]; // L: 163
					var11 = 0; // L: 164

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) { // L: 165
						var13 = var7[var12]; // L: 166
						ModelData var14;
						if (var13 >= 256 && var13 < 512) { // L: 167
							var14 = WorldMapData_1.KitDefinition_get(var13 - 256).getModelData(); // L: 168
							if (var14 != null) { // L: 169
								var16[var11++] = var14;
							}
						}

						if (var13 >= 512) { // L: 171
							var14 = SecureRandomCallable.ItemDefinition_get(var13 - 512).method4669(this.isFemale); // L: 172
							if (var14 != null) { // L: 173
								var16[var11++] = var14;
							}
						}
					}

					ModelData var17 = new ModelData(var16, var11); // L: 176

					for (var13 = 0; var13 < 5; ++var13) { // L: 177
						if (this.bodyColors[var13] < WorldMapScaleHandler.field366[var13].length) { // L: 178
							var17.recolor(field2551[var13], WorldMapScaleHandler.field366[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < WorldMapCacheName.field331[var13].length) { // L: 179
							var17.recolor(field2557[var13], WorldMapCacheName.field331[var13][this.bodyColors[var13]]);
						}
					}

					var15 = var17.toModel(64, 850, -30, -50, -30); // L: 181
					PlayerAppearance_cachedModels.put(var15, var5); // L: 182
					this.field2555 = var5; // L: 183
				}
			}

			if (var1 == null && var3 == null) { // L: 187
				return var15;
			} else {
				Model var18;
				if (var1 != null && var3 != null) { // L: 188
					var18 = var1.applyTransformations(var15, var2, var3, var4);
				} else if (var1 != null) { // L: 189
					var18 = var1.transformActorModel(var15, var2);
				} else {
					var18 = var3.transformActorModel(var15, var4); // L: 190
				}

				return var18; // L: 191
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Les;",
		garbageValue = "1602412572"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 195
			return WorldMapIcon_0.getNpcDefinition(this.npcTransformId).getModelData(); // L: 196
		} else {
			boolean var1 = false; // L: 198

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 199
				var3 = this.equipment[var2]; // L: 200
				if (var3 >= 256 && var3 < 512 && !WorldMapData_1.KitDefinition_get(var3 - 256).method4488()) { // L: 201 202
					var1 = true;
				}

				if (var3 >= 512 && !SecureRandomCallable.ItemDefinition_get(var3 - 512).method4660(this.isFemale)) { // L: 204 205
					var1 = true;
				}
			}

			if (var1) { // L: 208
				return null;
			} else {
				ModelData[] var7 = new ModelData[12]; // L: 209
				var3 = 0; // L: 210

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) { // L: 211
					var5 = this.equipment[var4]; // L: 212
					ModelData var6;
					if (var5 >= 256 && var5 < 512) { // L: 213
						var6 = WorldMapData_1.KitDefinition_get(var5 - 256).getKitDefinitionModels(); // L: 214
						if (var6 != null) { // L: 215
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) { // L: 217
						var6 = SecureRandomCallable.ItemDefinition_get(var5 - 512).method4671(this.isFemale); // L: 218
						if (var6 != null) { // L: 219
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3); // L: 222

				for (var5 = 0; var5 < 5; ++var5) { // L: 223
					if (this.bodyColors[var5] < WorldMapScaleHandler.field366[var5].length) { // L: 224
						var8.recolor(field2551[var5], WorldMapScaleHandler.field366[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < WorldMapCacheName.field331[var5].length) { // L: 225
						var8.recolor(field2557[var5], WorldMapCacheName.field331[var5][this.bodyColors[var5]]);
					}
				}

				return var8; // L: 227
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2065578262"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + WorldMapIcon_0.getNpcDefinition(this.npcTransformId).id; // L: 231 232
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "2079924758"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 33
				if (var1 != null) { // L: 34
					Throwable var4 = var1; // L: 36
					String var5;
					if (var1 instanceof RunException) { // L: 39
						RunException var6 = (RunException)var1; // L: 40
						var5 = var6.message + " | "; // L: 41
						var4 = var6.throwable; // L: 42
					} else {
						var5 = ""; // L: 44
					}

					StringWriter var18 = new StringWriter(); // L: 45
					PrintWriter var7 = new PrintWriter(var18); // L: 46
					var4.printStackTrace(var7); // L: 47
					var7.close(); // L: 48
					String var8 = var18.toString(); // L: 49
					BufferedReader var9 = new BufferedReader(new StringReader(var8)); // L: 50
					String var10 = var9.readLine(); // L: 51

					label62:
					while (true) {
						while (true) {
							String var11 = var9.readLine(); // L: 53
							if (var11 == null) { // L: 54
								var5 = var5 + "| " + var10; // L: 72
								var2 = var5; // L: 75
								break label62;
							}

							int var12 = var11.indexOf(40); // L: 55
							int var13 = var11.indexOf(41, var12 + 1); // L: 56
							if (var12 >= 0 && var13 >= 0) { // L: 57
								String var14 = var11.substring(var12 + 1, var13); // L: 58
								int var15 = var14.indexOf(".java:"); // L: 59
								if (var15 >= 0) { // L: 60
									var14 = var14.substring(0, var15) + var14.substring(var15 + 5); // L: 61
									var5 = var5 + var14 + ' '; // L: 62
									continue; // L: 63
								}

								var11 = var11.substring(0, var12); // L: 65
							}

							var11 = var11.trim(); // L: 67
							var11 = var11.substring(var11.lastIndexOf(32) + 1); // L: 68
							var11 = var11.substring(var11.lastIndexOf(9) + 1); // L: 69
							var5 = var5 + var11 + ' '; // L: 70
						}
					}
				}

				if (var0 != null) { // L: 77
					if (var1 != null) { // L: 78
						var2 = var2 + " | ";
					}

					var2 = var2 + var0; // L: 79
				}

				System.out.println("Error: " + var2); // L: 81
				var2 = var2.replace(':', '.'); // L: 82
				var2 = var2.replace('@', '_'); // L: 83
				var2 = var2.replace('&', '_'); // L: 84
				var2 = var2.replace('#', '_'); // L: 85
				if (RunException.RunException_applet == null) { // L: 86
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?c=" + RunException.RunException_revision + "&u=" + RunException.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + class39.clientType + "&e=" + var2); // L: 87
				DataInputStream var17 = new DataInputStream(var3.openStream()); // L: 88
				var17.read(); // L: 89
				var17.close(); // L: 90
			} catch (Exception var16) { // L: 92
			}

		}
	} // L: 93
}
