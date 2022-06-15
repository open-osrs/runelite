import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("th")
	@ObfuscatedGetter(
		intValue = 882469973
	)
	static int field3346;
	@ObfuscatedName("y")
	public static short[] field3343;
	@ObfuscatedName("i")
	public static short[][] field3342;
	@ObfuscatedName("t")
	public static short[][] field3334;
	@ObfuscatedName("z")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("c")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("v")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("q")
	@Export("isFemale")
	public boolean isFemale;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 855497951
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -4116623341203596551L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = 5787532750931398799L
	)
	long field3345;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "[Lfy;"
	)
	class167[] field3339;
	@ObfuscatedName("w")
	boolean field3341;

	static {
		equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10}; // L: 26
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(260);
	}

	public PlayerComposition() {
		this.field3341 = false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([I[Lfy;Z[IZII)V",
		garbageValue = "927894268"
	)
	public void method5566(int[] var1, class167[] var2, boolean var3, int[] var4, boolean var5, int var6) {
		this.field3339 = var2; // L: 30
		this.field3341 = var3;
		this.update(var1, var4, var5, var6);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([I[IZII)V",
		garbageValue = "-532197746"
	)
	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var5 = 0; var5 < 7; ++var5) { // L: 38
				for (int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) {
					KitDefinition var7 = SecureRandomFuture.KitDefinition_get(var6);
					if (var7 != null && !var7.nonSelectable && var5 + (var3 ? 7 : 0) == var7.bodypartID) {
						var1[equipmentIndices[var5]] = var6 + 256; // L: 42
						break;
					}
				}
			}
		}

		this.equipment = var1;
		this.bodyColors = var2;
		this.isFemale = var3; // L: 50
		this.npcTransformId = var4;
		this.setHash();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-624055687"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		if (var1 != 1 || !this.isFemale) {
			int var3 = this.equipment[equipmentIndices[var1]];
			if (var3 != 0) { // L: 58
				var3 -= 256;

				KitDefinition var4;
				do {
					if (!var2) {
						--var3; // L: 62
						if (var3 < 0) {
							var3 = KitDefinition.KitDefinition_fileCount - 1;
						}
					} else {
						++var3; // L: 66
						if (var3 >= KitDefinition.KitDefinition_fileCount) {
							var3 = 0;
						}
					}

					var4 = SecureRandomFuture.KitDefinition_get(var3);
				} while(var4 == null || var4.nonSelectable || (this.isFemale ? 7 : 0) + var1 != var4.bodypartID); // L: 70

				this.equipment[equipmentIndices[var1]] = var3 + 256;
				this.setHash();
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-875424667"
	)
	public void method5573(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = field3342[var1].length - 1;
				}

				if (var1 == 4 && var3 >= 8) {
					var4 = false; // L: 87
				} else {
					var4 = true;
				}
			} while(!var4);
		} else {
			do {
				++var3;
				if (var3 >= field3342[var1].length) {
					var3 = 0;
				}

				if (var1 == 4 && var3 >= 8) {
					var4 = false;
				} else {
					var4 = true;
				}
			} while(!var4); // L: 107
		}

		this.bodyColors[var1] = var3;
		this.setHash(); // L: 111
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-610212168"
	)
	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) { // L: 115
			this.update((int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "-159809821"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.isFemale ? 1 : 0); // L: 120

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int var3 = this.equipment[equipmentIndices[var2]];
			if (var3 == 0) {
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256);
			}
		}

		for (var2 = 0; var2 < 5; ++var2) { // L: 126
			var1.writeByte(this.bodyColors[var2]);
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-288616983"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash; // L: 130
		int var3 = this.equipment[5];
		int var4 = this.equipment[9];
		this.equipment[5] = var4;
		this.equipment[9] = var3; // L: 134
		this.hash = 0L;

		int var5;
		for (var5 = 0; var5 < 12; ++var5) {
			this.hash <<= 4;
			if (this.equipment[var5] >= 256) { // L: 138
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) {
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) {
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) { // L: 142
			this.hash <<= 3;
			this.hash += (long)this.bodyColors[var5];
		}

		this.hash <<= 1;
		this.hash += (long)(this.isFemale ? 1 : 0); // L: 147
		this.equipment[5] = var3;
		this.equipment[9] = var4;
		if (0L != var1 && this.hash != var1 || this.field3341) {
			Widget_cachedSpriteMasks.remove(var1);
		}

	} // L: 151

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lgc;ILgc;II)Lhy;",
		garbageValue = "-2130042803"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return BuddyRankComparator.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4); // L: 155
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) { // L: 159
				var7 = new int[12];

				for (int var8 = 0; var8 < 12; ++var8) {
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) {
					var5 += (long)(var1.shield - this.equipment[5] << 40); // L: 163
					var7[5] = var1.shield; // L: 164
				}

				if (var1.weapon >= 0) {
					var5 += (long)(var1.weapon - this.equipment[3] << 48);
					var7[3] = var1.weapon;
				}
			}

			Model var18 = (Model)Widget_cachedSpriteMasks.get(var5);
			if (var18 == null) {
				boolean var9 = false; // L: 173

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) { // L: 174
					var11 = var7[var10]; // L: 175
					if (var11 >= 256 && var11 < 512 && !SecureRandomFuture.KitDefinition_get(var11 - 256).ready()) { // L: 176 177
						var9 = true;
					}

					if (var11 >= 512 && !EnumComposition.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale)) { // L: 179 180
						var9 = true;
					}
				}

				if (var9) { // L: 183
					if (-1L != this.field3345) { // L: 184
						var18 = (Model)Widget_cachedSpriteMasks.get(this.field3345);
					}

					if (var18 == null) { // L: 185
						return null;
					}
				}

				if (var18 == null) { // L: 187
					ModelData[] var19 = new ModelData[12]; // L: 188
					var11 = 0; // L: 189

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) { // L: 190
						var13 = var7[var12]; // L: 191
						if (var13 >= 256 && var13 < 512) { // L: 192
							ModelData var14 = SecureRandomFuture.KitDefinition_get(var13 - 256).getModelData(); // L: 193
							if (var14 != null) { // L: 194
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) { // L: 196
							ItemComposition var22 = EnumComposition.ItemDefinition_get(var13 - 512); // L: 197
							ModelData var15 = var22.method3721(this.isFemale); // L: 198
							if (var15 != null) { // L: 199
								if (this.field3339 != null) { // L: 200
									class167 var16 = this.field3339[var12]; // L: 201
									if (var16 != null) { // L: 202
										int var17;
										if (var16.field1814 != null && var22.recolorFrom != null && var22.recolorTo.length == var16.field1814.length) { // L: 203
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) { // L: 204
												var15.recolor(var22.recolorTo[var17], var16.field1814[var17]); // L: 205
											}
										}

										if (var16.field1815 != null && var22.retextureFrom != null && var16.field1815.length == var22.retextureTo.length) { // L: 208
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) { // L: 209
												var15.retexture(var22.retextureTo[var17], var16.field1815[var17]); // L: 210
											}
										}
									}
								}

								var19[var11++] = var15; // L: 215
							}
						}
					}

					ModelData var20 = new ModelData(var19, var11); // L: 219

					for (var13 = 0; var13 < 5; ++var13) { // L: 220
						if (this.bodyColors[var13] < field3342[var13].length) { // L: 221
							var20.recolor(field3343[var13], field3342[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < field3334[var13].length) { // L: 222
							var20.recolor(WorldMapSectionType.field2793[var13], field3334[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30); // L: 224
					Widget_cachedSpriteMasks.put(var18, var5); // L: 225
					this.field3345 = var5; // L: 226
				}
			}

			if (var1 == null && var3 == null) { // L: 230
				return var18;
			} else {
				Model var21;
				if (var1 != null && var3 != null) { // L: 231
					var21 = var1.applyTransformations(var18, var2, var3, var4);
				} else if (var1 != null) { // L: 232
					var21 = var1.transformActorModel(var18, var2);
				} else {
					var21 = var3.transformActorModel(var18, var4); // L: 233
				}

				return var21; // L: 234
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)Lgw;",
		garbageValue = "67"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 238
			return BuddyRankComparator.getNpcDefinition(this.npcTransformId).getModelData(); // L: 239
		} else {
			boolean var1 = false; // L: 241

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 242
				var3 = this.equipment[var2]; // L: 243
				if (var3 >= 256 && var3 < 512 && !SecureRandomFuture.KitDefinition_get(var3 - 256).method3417()) { // L: 244 245
					var1 = true;
				}

				if (var3 >= 512 && !EnumComposition.ItemDefinition_get(var3 - 512).method3746(this.isFemale)) { // L: 247 248
					var1 = true;
				}
			}

			if (var1) { // L: 251
				return null;
			} else {
				ModelData[] var7 = new ModelData[12]; // L: 252
				var3 = 0; // L: 253

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) { // L: 254
					var5 = this.equipment[var4]; // L: 255
					ModelData var6;
					if (var5 >= 256 && var5 < 512) { // L: 256
						var6 = SecureRandomFuture.KitDefinition_get(var5 - 256).getKitDefinitionModels(); // L: 257
						if (var6 != null) { // L: 258
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) { // L: 260
						var6 = EnumComposition.ItemDefinition_get(var5 - 512).method3723(this.isFemale); // L: 261
						if (var6 != null) { // L: 262
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3); // L: 265

				for (var5 = 0; var5 < 5; ++var5) { // L: 266
					if (this.bodyColors[var5] < field3342[var5].length) { // L: 267
						var8.recolor(field3343[var5], field3342[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < field3334[var5].length) { // L: 268
						var8.recolor(WorldMapSectionType.field2793[var5], field3334[var5][this.bodyColors[var5]]);
					}
				}

				return var8; // L: 270
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "813764515"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + BuddyRankComparator.getNpcDefinition(this.npcTransformId).id; // L: 274 275
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Llb;II)Ljt;",
		garbageValue = "-1658860348"
	)
	public static PacketBufferNode method5600(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = EnumComposition.getPacketBufferNode(ClientPacket.field2973, Client.packetWriter.isaacCipher); // L: 17
		var4.packetBuffer.writeByte(0); // L: 18
		int var5 = var4.packetBuffer.offset; // L: 19
		var4.packetBuffer.writeByte(var0); // L: 20
		String var6 = var1.toLowerCase(); // L: 21
		byte var7 = 0; // L: 22
		if (var6.startsWith("yellow:")) { // L: 23
			var7 = 0; // L: 24
			var1 = var1.substring("yellow:".length()); // L: 25
		} else if (var6.startsWith("red:")) { // L: 27
			var7 = 1; // L: 28
			var1 = var1.substring("red:".length()); // L: 29
		} else if (var6.startsWith("green:")) { // L: 31
			var7 = 2; // L: 32
			var1 = var1.substring("green:".length()); // L: 33
		} else if (var6.startsWith("cyan:")) { // L: 35
			var7 = 3; // L: 36
			var1 = var1.substring("cyan:".length()); // L: 37
		} else if (var6.startsWith("purple:")) { // L: 39
			var7 = 4; // L: 40
			var1 = var1.substring("purple:".length()); // L: 41
		} else if (var6.startsWith("white:")) { // L: 43
			var7 = 5; // L: 44
			var1 = var1.substring("white:".length()); // L: 45
		} else if (var6.startsWith("flash1:")) { // L: 47
			var7 = 6; // L: 48
			var1 = var1.substring("flash1:".length()); // L: 49
		} else if (var6.startsWith("flash2:")) { // L: 51
			var7 = 7; // L: 52
			var1 = var1.substring("flash2:".length()); // L: 53
		} else if (var6.startsWith("flash3:")) { // L: 55
			var7 = 8; // L: 56
			var1 = var1.substring("flash3:".length()); // L: 57
		} else if (var6.startsWith("glow1:")) { // L: 59
			var7 = 9; // L: 60
			var1 = var1.substring("glow1:".length()); // L: 61
		} else if (var6.startsWith("glow2:")) { // L: 63
			var7 = 10; // L: 64
			var1 = var1.substring("glow2:".length()); // L: 65
		} else if (var6.startsWith("glow3:")) { // L: 67
			var7 = 11; // L: 68
			var1 = var1.substring("glow3:".length()); // L: 69
		} else if (var2 != Language.Language_EN) { // L: 71
			if (var6.startsWith("yellow:")) { // L: 72
				var7 = 0; // L: 73
				var1 = var1.substring("yellow:".length()); // L: 74
			} else if (var6.startsWith("red:")) { // L: 76
				var7 = 1; // L: 77
				var1 = var1.substring("red:".length()); // L: 78
			} else if (var6.startsWith("green:")) { // L: 80
				var7 = 2; // L: 81
				var1 = var1.substring("green:".length()); // L: 82
			} else if (var6.startsWith("cyan:")) { // L: 84
				var7 = 3; // L: 85
				var1 = var1.substring("cyan:".length()); // L: 86
			} else if (var6.startsWith("purple:")) { // L: 88
				var7 = 4; // L: 89
				var1 = var1.substring("purple:".length()); // L: 90
			} else if (var6.startsWith("white:")) { // L: 92
				var7 = 5; // L: 93
				var1 = var1.substring("white:".length()); // L: 94
			} else if (var6.startsWith("flash1:")) { // L: 96
				var7 = 6; // L: 97
				var1 = var1.substring("flash1:".length()); // L: 98
			} else if (var6.startsWith("flash2:")) { // L: 100
				var7 = 7; // L: 101
				var1 = var1.substring("flash2:".length()); // L: 102
			} else if (var6.startsWith("flash3:")) { // L: 104
				var7 = 8; // L: 105
				var1 = var1.substring("flash3:".length()); // L: 106
			} else if (var6.startsWith("glow1:")) { // L: 108
				var7 = 9; // L: 109
				var1 = var1.substring("glow1:".length()); // L: 110
			} else if (var6.startsWith("glow2:")) { // L: 112
				var7 = 10; // L: 113
				var1 = var1.substring("glow2:".length()); // L: 114
			} else if (var6.startsWith("glow3:")) { // L: 116
				var7 = 11; // L: 117
				var1 = var1.substring("glow3:".length()); // L: 118
			}
		}

		var6 = var1.toLowerCase(); // L: 121
		byte var8 = 0; // L: 122
		if (var6.startsWith("wave:")) { // L: 123
			var8 = 1; // L: 124
			var1 = var1.substring("wave:".length()); // L: 125
		} else if (var6.startsWith("wave2:")) { // L: 127
			var8 = 2; // L: 128
			var1 = var1.substring("wave2:".length()); // L: 129
		} else if (var6.startsWith("shake:")) { // L: 131
			var8 = 3; // L: 132
			var1 = var1.substring("shake:".length()); // L: 133
		} else if (var6.startsWith("scroll:")) { // L: 135
			var8 = 4; // L: 136
			var1 = var1.substring("scroll:".length()); // L: 137
		} else if (var6.startsWith("slide:")) { // L: 139
			var8 = 5; // L: 140
			var1 = var1.substring("slide:".length()); // L: 141
		} else if (var2 != Language.Language_EN) { // L: 143
			if (var6.startsWith("wave:")) { // L: 144
				var8 = 1; // L: 145
				var1 = var1.substring("wave:".length()); // L: 146
			} else if (var6.startsWith("wave2:")) { // L: 148
				var8 = 2; // L: 149
				var1 = var1.substring("wave2:".length()); // L: 150
			} else if (var6.startsWith("shake:")) { // L: 152
				var8 = 3; // L: 153
				var1 = var1.substring("shake:".length()); // L: 154
			} else if (var6.startsWith("scroll:")) { // L: 156
				var8 = 4; // L: 157
				var1 = var1.substring("scroll:".length()); // L: 158
			} else if (var6.startsWith("slide:")) { // L: 160
				var8 = 5; // L: 161
				var1 = var1.substring("slide:".length()); // L: 162
			}
		}

		var4.packetBuffer.writeByte(var7); // L: 165
		var4.packetBuffer.writeByte(var8); // L: 166
		PcmPlayer.method720(var4.packetBuffer, var1); // L: 167
		if (var0 == class295.field3528.rsOrdinal()) { // L: 168
			var4.packetBuffer.writeByte(var3); // L: 169
		}

		var4.packetBuffer.method7935(var4.packetBuffer.offset - var5); // L: 171
		return var4; // L: 172
	}
}
