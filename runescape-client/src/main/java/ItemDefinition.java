import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jq")
public class ItemDefinition extends DualNode {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("w")
	static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	static Font fontPlain12;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2127308741
	)
	public int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1602793113
	)
	int model;
	@ObfuscatedName("c")
	public String name;
	@ObfuscatedName("f")
	short[] recolorFrom;
	@ObfuscatedName("y")
	short[] recolorTo;
	@ObfuscatedName("v")
	short[] retextureFrom;
	@ObfuscatedName("j")
	short[] retextureTo;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1758314265
	)
	public int zoom2d;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1530794933
	)
	public int xan2d;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 86096515
	)
	public int yan2d;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1159522461
	)
	public int zan2d;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1451755111
	)
	public int offsetX2d;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 685841117
	)
	public int offsetY2d;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -85010485
	)
	public int isStackable;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1232545811
	)
	public int price;
	@ObfuscatedName("ao")
	public boolean isMembersOnly;
	@ObfuscatedName("ae")
	public String[] groundActions;
	@ObfuscatedName("an")
	public String[] inventoryActions;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1175273971
	)
	int shiftClickIndex;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1901023651
	)
	int maleModel;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 50964429
	)
	int maleModel1;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2010056683
	)
	int maleOffset;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 711077729
	)
	int femaleModel;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -806873799
	)
	int femaleModel1;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 404192005
	)
	int femaleOffset;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -312638611
	)
	int maleModel2;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -440294405
	)
	int femaleModel2;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2008584399
	)
	int maleHeadModel;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2121233033
	)
	int maleHeadModel2;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1514421507
	)
	int femaleHeadModel;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1568432281
	)
	int femaleHeadModel2;
	@ObfuscatedName("ai")
	int[] countobj;
	@ObfuscatedName("ay")
	int[] countco;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1332734959
	)
	public int note;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1348741783
	)
	public int noteTemplate;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 645309775
	)
	int resizeX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -96685405
	)
	int resizeY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -948017029
	)
	int resizeZ;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1509364621
	)
	public int ambient;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 178466347
	)
	public int contrast;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 165771595
	)
	public int team;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	IterableNodeHashTable params;
	@ObfuscatedName("bh")
	public boolean isTradable;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1906961775
	)
	int unnotedId;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 612376009
	)
	int notedId;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -956191485
	)
	public int placeholder;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -2061792563
	)
	public int placeholderTemplate;

	static {
		ItemDefinition_cached = new EvictingDualNodeHashTable(64); // L: 28
		ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50); // L: 29
		ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200); // L: 30
	}

	ItemDefinition() {
		this.name = "null"; // L: 34
		this.zoom2d = 2000; // L: 39
		this.xan2d = 0; // L: 40
		this.yan2d = 0; // L: 41
		this.zan2d = 0; // L: 42
		this.offsetX2d = 0; // L: 43
		this.offsetY2d = 0; // L: 44
		this.isStackable = 0; // L: 45
		this.price = 1; // L: 46
		this.isMembersOnly = false; // L: 47
		this.groundActions = new String[]{null, null, "Take", null, null}; // L: 48
		this.inventoryActions = new String[]{null, null, null, null, "Drop"}; // L: 49
		this.shiftClickIndex = -2; // L: 51
		this.maleModel = -1; // L: 52
		this.maleModel1 = -1; // L: 53
		this.maleOffset = 0; // L: 54
		this.femaleModel = -1; // L: 55
		this.femaleModel1 = -1; // L: 56
		this.femaleOffset = 0; // L: 57
		this.maleModel2 = -1; // L: 58
		this.femaleModel2 = -1; // L: 59
		this.maleHeadModel = -1; // L: 60
		this.maleHeadModel2 = -1; // L: 61
		this.femaleHeadModel = -1; // L: 62
		this.femaleHeadModel2 = -1; // L: 63
		this.note = -1; // L: 66
		this.noteTemplate = -1; // L: 67
		this.resizeX = 128; // L: 68
		this.resizeY = 128; // L: 69
		this.resizeZ = 128; // L: 70
		this.ambient = 0; // L: 71
		this.contrast = 0; // L: 72
		this.team = 0; // L: 73
		this.isTradable = false; // L: 75
		this.unnotedId = -1; // L: 76
		this.notedId = -1; // L: 77
		this.placeholder = -1; // L: 78
		this.placeholderTemplate = -1; // L: 79
	} // L: 81

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1532230322"
	)
	void post() {
	} // L: 123

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "-1512040719"
	)
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 127
			if (var2 == 0) { // L: 128
				return; // L: 131
			}

			this.decodeNext(var1, var2); // L: 129
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lkf;II)V",
		garbageValue = "-2035131194"
	)
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 134
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 135
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 136
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 137
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 138
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 139
			this.offsetX2d = var1.readUnsignedShort(); // L: 140
			if (this.offsetX2d > 32767) { // L: 141
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) { // L: 143
			this.offsetY2d = var1.readUnsignedShort(); // L: 144
			if (this.offsetY2d > 32767) {
				this.offsetY2d -= 65536; // L: 145
			}
		} else if (var2 == 11) { // L: 147
			this.isStackable = 1;
		} else if (var2 == 12) { // L: 148
			this.price = var1.readInt();
		} else if (var2 == 16) { // L: 149
			this.isMembersOnly = true;
		} else if (var2 == 23) { // L: 150
			this.maleModel = var1.readUnsignedShort(); // L: 151
			this.maleOffset = var1.readUnsignedByte(); // L: 152
		} else if (var2 == 24) { // L: 154
			this.maleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) { // L: 155
			this.femaleModel = var1.readUnsignedShort(); // L: 156
			this.femaleOffset = var1.readUnsignedByte(); // L: 157
		} else if (var2 == 26) { // L: 159
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 >= 30 && var2 < 35) { // L: 160
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 161
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 162
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) { // L: 164
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 165
				var3 = var1.readUnsignedByte(); // L: 166
				this.recolorFrom = new short[var3]; // L: 167
				this.recolorTo = new short[var3]; // L: 168

				for (var4 = 0; var4 < var3; ++var4) { // L: 169
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 170
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 171
				}
			} else if (var2 == 41) { // L: 174
				var3 = var1.readUnsignedByte(); // L: 175
				this.retextureFrom = new short[var3]; // L: 176
				this.retextureTo = new short[var3]; // L: 177

				for (var4 = 0; var4 < var3; ++var4) { // L: 178
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 179
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 180
				}
			} else if (var2 == 42) { // L: 183
				this.shiftClickIndex = var1.readByte(); // L: 184
			} else if (var2 == 65) { // L: 186
				this.isTradable = true;
			} else if (var2 == 78) { // L: 187
				this.maleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) { // L: 188
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 90) { // L: 189
				this.maleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 91) { // L: 190
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 92) { // L: 191
				this.maleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 93) { // L: 192
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 95) { // L: 193
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) { // L: 194
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) { // L: 195
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) { // L: 196
				if (this.countobj == null) { // L: 197
					this.countobj = new int[10]; // L: 198
					this.countco = new int[10]; // L: 199
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort(); // L: 201
				this.countco[var2 - 100] = var1.readUnsignedShort(); // L: 202
			} else if (var2 == 110) { // L: 204
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) { // L: 205
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) { // L: 206
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) { // L: 207
				this.ambient = var1.readByte();
			} else if (var2 == 114) { // L: 208
				this.contrast = var1.readByte() * 5;
			} else if (var2 == 115) { // L: 209
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) { // L: 210
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) { // L: 211
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) { // L: 212
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) { // L: 213
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) { // L: 214
				this.params = PacketWriter.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 216

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljq;Ljq;I)V",
		garbageValue = "2102368712"
	)
	void genCert(ItemDefinition var1, ItemDefinition var2) {
		this.model = var1.model; // L: 219
		this.zoom2d = var1.zoom2d; // L: 220
		this.xan2d = var1.xan2d; // L: 221
		this.yan2d = var1.yan2d; // L: 222
		this.zan2d = var1.zan2d; // L: 223
		this.offsetX2d = var1.offsetX2d; // L: 224
		this.offsetY2d = var1.offsetY2d; // L: 225
		this.recolorFrom = var1.recolorFrom; // L: 226
		this.recolorTo = var1.recolorTo; // L: 227
		this.retextureFrom = var1.retextureFrom; // L: 228
		this.retextureTo = var1.retextureTo; // L: 229
		this.name = var2.name; // L: 230
		this.isMembersOnly = var2.isMembersOnly; // L: 231
		this.price = var2.price; // L: 232
		this.isStackable = 1; // L: 233
	} // L: 234

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljq;Ljq;I)V",
		garbageValue = "1918043668"
	)
	void genBought(ItemDefinition var1, ItemDefinition var2) {
		this.model = var1.model; // L: 237
		this.zoom2d = var1.zoom2d; // L: 238
		this.xan2d = var1.xan2d; // L: 239
		this.yan2d = var1.yan2d; // L: 240
		this.zan2d = var1.zan2d; // L: 241
		this.offsetX2d = var1.offsetX2d; // L: 242
		this.offsetY2d = var1.offsetY2d; // L: 243
		this.recolorFrom = var2.recolorFrom; // L: 244
		this.recolorTo = var2.recolorTo; // L: 245
		this.retextureFrom = var2.retextureFrom; // L: 246
		this.retextureTo = var2.retextureTo; // L: 247
		this.name = var2.name; // L: 248
		this.isMembersOnly = var2.isMembersOnly; // L: 249
		this.isStackable = var2.isStackable; // L: 250
		this.maleModel = var2.maleModel; // L: 251
		this.maleModel1 = var2.maleModel1; // L: 252
		this.maleModel2 = var2.maleModel2; // L: 253
		this.femaleModel = var2.femaleModel; // L: 254
		this.femaleModel1 = var2.femaleModel1; // L: 255
		this.femaleModel2 = var2.femaleModel2; // L: 256
		this.maleHeadModel = var2.maleHeadModel; // L: 257
		this.maleHeadModel2 = var2.maleHeadModel2; // L: 258
		this.femaleHeadModel = var2.femaleHeadModel; // L: 259
		this.femaleHeadModel2 = var2.femaleHeadModel2; // L: 260
		this.team = var2.team; // L: 261
		this.groundActions = var2.groundActions; // L: 262
		this.inventoryActions = new String[5]; // L: 263
		if (var2.inventoryActions != null) { // L: 264
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard"; // L: 265
		this.price = 0; // L: 266
	} // L: 267

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljq;Ljq;B)V",
		garbageValue = "0"
	)
	void genPlaceholder(ItemDefinition var1, ItemDefinition var2) {
		this.model = var1.model; // L: 270
		this.zoom2d = var1.zoom2d; // L: 271
		this.xan2d = var1.xan2d; // L: 272
		this.yan2d = var1.yan2d; // L: 273
		this.zan2d = var1.zan2d; // L: 274
		this.offsetX2d = var1.offsetX2d; // L: 275
		this.offsetY2d = var1.offsetY2d; // L: 276
		this.recolorFrom = var1.recolorFrom; // L: 277
		this.recolorTo = var1.recolorTo; // L: 278
		this.retextureFrom = var1.retextureFrom; // L: 279
		this.retextureTo = var1.retextureTo; // L: 280
		this.isStackable = var1.isStackable; // L: 281
		this.name = var2.name; // L: 282
		this.price = 0; // L: 283
		this.isMembersOnly = false; // L: 284
		this.isTradable = false; // L: 285
	} // L: 286

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Lee;",
		garbageValue = "361581400"
	)
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) { // L: 289
			int var2 = -1; // L: 290

			for (var3 = 0; var3 < 10; ++var3) { // L: 291
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 292
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 294
				return GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0); // L: 296
		if (var4 == null) { // L: 297
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 298
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) { // L: 299
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 300
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 301
				}
			}

			if (this.retextureFrom != null) { // L: 304
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 305
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 306
				}
			}

			return var4; // L: 309
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Ler;",
		garbageValue = "1340452049"
	)
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 313
			int var2 = -1; // L: 314

			for (int var3 = 0; var3 < 10; ++var3) { // L: 315
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 316
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 318
				return GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id); // L: 320
		if (var5 != null) { // L: 321
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0); // L: 322
			if (var6 == null) { // L: 323
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 324
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) { // L: 325
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 326
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 327
					}
				}

				if (this.retextureFrom != null) { // L: 330
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 331
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 332
					}
				}

				var5 = var6.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 335
				var5.isSingleTile = true; // L: 336
				ItemDefinition_cachedModels.put(var5, (long)this.id); // L: 337
				return var5; // L: 338
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Ljq;",
		garbageValue = "-1034116663"
	)
	public ItemDefinition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 342
			int var2 = -1; // L: 343

			for (int var3 = 0; var3 < 10; ++var3) { // L: 344
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3]; // L: 345
				}
			}

			if (var2 != -1) { // L: 347
				return GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var2);
			}
		}

		return this; // L: 349
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-627527711"
	)
	public final boolean hasNoValidModel(boolean var1) {
		int var2 = this.maleModel; // L: 427
		int var3 = this.maleModel1; // L: 428
		int var4 = this.maleModel2; // L: 429
		if (var1) { // L: 430
			var2 = this.femaleModel; // L: 431
			var3 = this.femaleModel1; // L: 432
			var4 = this.femaleModel2; // L: 433
		}

		if (var2 == -1) { // L: 435
			return true;
		} else {
			boolean var5 = true; // L: 436
			if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 437
				var5 = false;
			}

			if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 438
				var5 = false;
			}

			if (var4 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var4, 0)) { // L: 439
				var5 = false;
			}

			return var5; // L: 440
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lee;",
		garbageValue = "887428237"
	)
	public final ModelData method4760(boolean var1) {
		int var2 = this.maleModel; // L: 444
		int var3 = this.maleModel1; // L: 445
		int var4 = this.maleModel2; // L: 446
		if (var1) { // L: 447
			var2 = this.femaleModel; // L: 448
			var3 = this.femaleModel1; // L: 449
			var4 = this.femaleModel2; // L: 450
		}

		if (var2 == -1) { // L: 452
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0); // L: 453
			if (var3 != -1) { // L: 454
				ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0); // L: 455
				if (var4 != -1) { // L: 456
					ModelData var7 = ModelData.ModelData_get(ItemDefinition_modelArchive, var4, 0); // L: 457
					ModelData[] var8 = new ModelData[]{var5, var6, var7}; // L: 458
					var5 = new ModelData(var8, 3); // L: 459
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6}; // L: 462
					var5 = new ModelData(var10, 2); // L: 463
				}
			}

			if (!var1 && this.maleOffset != 0) { // L: 466
				var5.changeOffset(0, this.maleOffset, 0);
			}

			if (var1 && this.femaleOffset != 0) { // L: 467
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 468
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 469
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 470
				}
			}

			if (this.retextureFrom != null) { // L: 473
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 474
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 475
				}
			}

			return var5; // L: 478
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "936958354"
	)
	public final boolean method4805(boolean var1) {
		int var2 = this.maleHeadModel; // L: 482
		int var3 = this.maleHeadModel2; // L: 483
		if (var1) { // L: 484
			var2 = this.femaleHeadModel; // L: 485
			var3 = this.femaleHeadModel2; // L: 486
		}

		if (var2 == -1) { // L: 488
			return true;
		} else {
			boolean var4 = true; // L: 489
			if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 490
				var4 = false;
			}

			if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 491
				var4 = false;
			}

			return var4; // L: 492
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lee;",
		garbageValue = "0"
	)
	public final ModelData method4762(boolean var1) {
		int var2 = this.maleHeadModel; // L: 496
		int var3 = this.maleHeadModel2; // L: 497
		if (var1) { // L: 498
			var2 = this.femaleHeadModel; // L: 499
			var3 = this.femaleHeadModel2; // L: 500
		}

		if (var2 == -1) { // L: 502
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0); // L: 503
			if (var3 != -1) { // L: 504
				ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0); // L: 505
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 506
				var4 = new ModelData(var6, 2); // L: 507
			}

			int var7;
			if (this.recolorFrom != null) { // L: 509
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 510
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 511
				}
			}

			if (this.retextureFrom != null) { // L: 514
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 515
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 516
				}
			}

			return var4; // L: 519
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "678325185"
	)
	public int getIntParam(int var1, int var2) {
		return Username.method5309(this.params, var1, var2); // L: 523
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "6"
	)
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 528
		String var3;
		if (var4 == null) { // L: 530
			var3 = var2; // L: 531
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 534
			if (var5 == null) { // L: 535
				var3 = var2; // L: 536
			} else {
				var3 = (String)var5.obj; // L: 539
			}
		}

		return var3; // L: 541
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-17"
	)
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 545
			if (this.shiftClickIndex >= 0) { // L: 546
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex * 1175273971 * 2965307 : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 547
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lkr;Lkr;I)V",
		garbageValue = "-2013337959"
	)
	static void method4823(Font var0, Font var1) {
		Archive var3;
		int var4;
		int var5;
		if (MidiPcmStream.worldSelectBackSprites == null) { // L: 1462
			var3 = Huffman.archive8; // L: 1464
			var4 = var3.getGroupId("sl_back"); // L: 1466
			var5 = var3.getFileId(var4, ""); // L: 1467
			Sprite[] var2 = GameBuild.method4214(var3, var4, var5); // L: 1468
			MidiPcmStream.worldSelectBackSprites = var2; // L: 1470
		}

		IndexedSprite[] var25;
		if (AbstractWorldMapIcon.worldSelectFlagSprites == null) { // L: 1472
			var3 = Huffman.archive8; // L: 1474
			var4 = var3.getGroupId("sl_flags"); // L: 1476
			var5 = var3.getFileId(var4, ""); // L: 1477
			var25 = UserComparator5.method3515(var3, var4, var5); // L: 1478
			AbstractWorldMapIcon.worldSelectFlagSprites = var25; // L: 1480
		}

		if (MusicPatchNode.worldSelectArrows == null) { // L: 1482
			var3 = Huffman.archive8; // L: 1484
			var4 = var3.getGroupId("sl_arrows"); // L: 1486
			var5 = var3.getFileId(var4, ""); // L: 1487
			var25 = UserComparator5.method3515(var3, var4, var5); // L: 1488
			MusicPatchNode.worldSelectArrows = var25; // L: 1490
		}

		if (Login.worldSelectStars == null) { // L: 1492
			var3 = Huffman.archive8; // L: 1494
			var4 = var3.getGroupId("sl_stars"); // L: 1496
			var5 = var3.getFileId(var4, ""); // L: 1497
			var25 = UserComparator5.method3515(var3, var4, var5); // L: 1498
			Login.worldSelectStars = var25; // L: 1500
		}

		if (WorldMapIcon_0.worldSelectLeftSprite == null) { // L: 1502
			WorldMapIcon_0.worldSelectLeftSprite = class234.SpriteBuffer_getIndexedSpriteByName(Huffman.archive8, "leftarrow", "");
		}

		if (ArchiveDiskActionHandler.worldSelectRightSprite == null) { // L: 1503
			ArchiveDiskActionHandler.worldSelectRightSprite = class234.SpriteBuffer_getIndexedSpriteByName(Huffman.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1504
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1505
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1506
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1507
		if (Login.worldSelectStars != null) { // L: 1508
			Login.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1509
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1510
			Login.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1511
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1512
		}

		if (MusicPatchNode.worldSelectArrows != null) { // L: 1514
			int var22 = Login.xPadding + 280; // L: 1515
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1516
				MusicPatchNode.worldSelectArrows[2].drawAt(var22, 4);
			} else {
				MusicPatchNode.worldSelectArrows[0].drawAt(var22, 4); // L: 1517
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1518
				MusicPatchNode.worldSelectArrows[3].drawAt(var22 + 15, 4);
			} else {
				MusicPatchNode.worldSelectArrows[1].drawAt(var22 + 15, 4); // L: 1519
			}

			var0.draw("World", var22 + 32, 17, 16777215, -1); // L: 1520
			int var23 = Login.xPadding + 390; // L: 1521
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1522
				MusicPatchNode.worldSelectArrows[2].drawAt(var23, 4);
			} else {
				MusicPatchNode.worldSelectArrows[0].drawAt(var23, 4); // L: 1523
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1524
				MusicPatchNode.worldSelectArrows[3].drawAt(var23 + 15, 4);
			} else {
				MusicPatchNode.worldSelectArrows[1].drawAt(var23 + 15, 4); // L: 1525
			}

			var0.draw("Players", var23 + 32, 17, 16777215, -1); // L: 1526
			var4 = Login.xPadding + 500; // L: 1527
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1528
				MusicPatchNode.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				MusicPatchNode.worldSelectArrows[0].drawAt(var4, 4); // L: 1529
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1530
				MusicPatchNode.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				MusicPatchNode.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1531
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1); // L: 1532
			var5 = Login.xPadding + 610; // L: 1533
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1534
				MusicPatchNode.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				MusicPatchNode.worldSelectArrows[0].drawAt(var5, 4); // L: 1535
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1536
				MusicPatchNode.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				MusicPatchNode.worldSelectArrows[1].drawAt(var5 + 15, 4); // L: 1537
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1); // L: 1538
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1540
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1541
		Login.hoveredWorldIndex = -1; // L: 1542
		if (MidiPcmStream.worldSelectBackSprites != null) { // L: 1543
			byte var27 = 88; // L: 1544
			byte var28 = 19; // L: 1545
			var4 = 765 / (var27 + 1) - 1; // L: 1546
			var5 = 480 / (var28 + 1); // L: 1547

			int var6;
			int var7;
			do {
				var6 = var5; // L: 1549
				var7 = var4; // L: 1550
				if (var5 * (var4 - 1) >= World.World_count) { // L: 1551
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1552
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1553
					--var5;
				}
			} while(var5 != var6 || var4 != var7); // L: 1554

			var6 = (765 - var27 * var4) / (var4 + 1); // L: 1556
			if (var6 > 5) { // L: 1557
				var6 = 5;
			}

			var7 = (480 - var28 * var5) / (var5 + 1); // L: 1558
			if (var7 > 5) { // L: 1559
				var7 = 5;
			}

			int var8 = (765 - var27 * var4 - var6 * (var4 - 1)) / 2; // L: 1560
			int var9 = (480 - var5 * var28 - var7 * (var5 - 1)) / 2; // L: 1561
			int var10 = (var5 + World.World_count - 1) / var5; // L: 1562
			Login.worldSelectPagesCount = var10 - var4; // L: 1563
			if (WorldMapIcon_0.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1564
				WorldMapIcon_0.worldSelectLeftSprite.drawAt(8, GameShell.canvasHeight / 2 - WorldMapIcon_0.worldSelectLeftSprite.subHeight / 2); // L: 1565
			}

			if (ArchiveDiskActionHandler.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1567
				ArchiveDiskActionHandler.worldSelectRightSprite.drawAt(FloorDecoration.canvasWidth - ArchiveDiskActionHandler.worldSelectRightSprite.subWidth - 8, GameShell.canvasHeight / 2 - ArchiveDiskActionHandler.worldSelectRightSprite.subHeight / 2); // L: 1568
			}

			int var11 = var9 + 23; // L: 1570
			int var12 = var8 + Login.xPadding; // L: 1571
			int var13 = 0; // L: 1572
			boolean var14 = false; // L: 1573
			int var15 = Login.worldSelectPage; // L: 1574

			int var16;
			for (var16 = var5 * var15; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) { // L: 1575 1576
				World var17 = AbstractByteArrayCopier.World_worlds[var16]; // L: 1579
				boolean var18 = true; // L: 1580
				String var19 = Integer.toString(var17.population); // L: 1581
				if (var17.population == -1) { // L: 1582
					var19 = "OFF"; // L: 1583
					var18 = false; // L: 1584
				} else if (var17.population > 1980) { // L: 1586
					var19 = "FULL"; // L: 1587
					var18 = false; // L: 1588
				}

				int var21 = 0; // L: 1591
				byte var20;
				if (var17.isBeta()) { // L: 1592
					if (var17.isMembersOnly()) { // L: 1593
						var20 = 7;
					} else {
						var20 = 6; // L: 1594
					}
				} else if (var17.isDeadman()) { // L: 1596
					var21 = 16711680; // L: 1597
					if (var17.isMembersOnly()) { // L: 1598
						var20 = 5;
					} else {
						var20 = 4; // L: 1599
					}
				} else if (var17.method1826()) { // L: 1601
					if (var17.isMembersOnly()) { // L: 1602
						var20 = 9;
					} else {
						var20 = 8; // L: 1603
					}
				} else if (var17.isPvp()) { // L: 1605
					if (var17.isMembersOnly()) { // L: 1606
						var20 = 3;
					} else {
						var20 = 2; // L: 1607
					}
				} else if (var17.isMembersOnly()) { // L: 1610
					var20 = 1;
				} else {
					var20 = 0; // L: 1611
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var12 + var27 && MouseHandler.MouseHandler_y < var11 + var28 && var18) { // L: 1613
					Login.hoveredWorldIndex = var16; // L: 1614
					MidiPcmStream.worldSelectBackSprites[var20].drawTransOverlayAt(var12, var11, 128, 16777215); // L: 1615
					var14 = true; // L: 1616
				} else {
					MidiPcmStream.worldSelectBackSprites[var20].drawAt(var12, var11); // L: 1618
				}

				if (AbstractWorldMapIcon.worldSelectFlagSprites != null) { // L: 1619
					AbstractWorldMapIcon.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var28 / 2 + var11 + 5, var21, -1); // L: 1620
				var1.drawCentered(var19, var12 + 60, var28 / 2 + var11 + 5, 268435455, -1); // L: 1621
				var11 = var11 + var7 + var28; // L: 1622
				++var13; // L: 1623
				if (var13 >= var5) {
					var11 = var9 + 23; // L: 1624
					var12 = var12 + var6 + var27; // L: 1625
					var13 = 0; // L: 1626
					++var15; // L: 1627
				}
			}

			if (var14) { // L: 1630
				var16 = var1.stringWidth(AbstractByteArrayCopier.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1631
				int var24 = var1.ascent + 8; // L: 1632
				int var26 = MouseHandler.MouseHandler_y + 25; // L: 1633
				if (var24 + var26 > 480) { // L: 1634
					var26 = MouseHandler.MouseHandler_y - 25 - var24; // L: 1635
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var26, var16, var24, 16777120); // L: 1637
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var26, var16, var24, 0); // L: 1638
				var1.drawCentered(AbstractByteArrayCopier.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var26 + var1.ascent + 4, 0, -1); // L: 1639
			}
		}

		WorldMapSprite.rasterProvider.drawFull(0, 0); // L: 1642
	} // L: 1643

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "137776557"
	)
	static int method4793(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 3273
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ScriptFrame.loadWorlds() ? 1 : 0; // L: 3274
			return 1; // L: 3275
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 3277
				var9 = Decimator.worldListStart(); // L: 3278
				if (var9 != null) { // L: 3279
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 3280
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 3281
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var9.activity; // L: 3282
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 3283
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 3284
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var9.host; // L: 3285
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3288
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3289
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 3290
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3291
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3292
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 3293
				}

				return 1; // L: 3295
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 3297
				var9 = WorldMapEvent.getNextWorldListWorld(); // L: 3298
				if (var9 != null) { // L: 3299
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 3300
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 3301
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var9.activity; // L: 3302
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 3303
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 3304
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var9.host; // L: 3305
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3308
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3309
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 3310
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3311
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3312
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 3313
				}

				return 1; // L: 3315
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 3317
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3318
					var7 = null; // L: 3319

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 3320
						if (var3 == AbstractByteArrayCopier.World_worlds[var8].id) { // L: 3321
							var7 = AbstractByteArrayCopier.World_worlds[var8]; // L: 3322
							break;
						}
					}

					if (var7 != null) { // L: 3326
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 3327
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 3328
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var7.activity; // L: 3329
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 3330
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 3331
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var7.host; // L: 3332
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3335
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3336
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 3337
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3338
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3339
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 3340
					}

					return 1; // L: 3342
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 3344
					Interpreter.Interpreter_intStackSize -= 4; // L: 3345
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3346
					boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3347
					var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3348
					boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1; // L: 3349
					TilePaint.sortWorldList(var3, var10, var8, var6); // L: 3350
					return 1; // L: 3351
				} else if (var0 != ScriptOpcodes.GETWORLDINFO) { // L: 3353
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 3374
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3375
						return 1; // L: 3376
					} else {
						int var4;
						ParamDefinition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 3378
							Interpreter.Interpreter_intStackSize -= 2; // L: 3379
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3380
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3381
							var5 = PlayerAppearance.getParamDefinition(var4); // L: 3382
							if (var5.isString()) { // L: 3383
								Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = Skeleton.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3384
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Skeleton.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3387
							}

							return 1; // L: 3389
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 3391
							Interpreter.Interpreter_intStackSize -= 2; // L: 3392
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3393
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3394
							var5 = PlayerAppearance.getParamDefinition(var4); // L: 3395
							if (var5.isString()) { // L: 3396
								Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = MidiPcmStream.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3397
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MidiPcmStream.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3400
							}

							return 1; // L: 3402
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 3404
							Interpreter.Interpreter_intStackSize -= 2; // L: 3405
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3406
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3407
							var5 = PlayerAppearance.getParamDefinition(var4); // L: 3408
							if (var5.isString()) { // L: 3409
								Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr); // L: 3410
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt); // L: 3413
							}

							return 1; // L: 3415
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 3417
							Interpreter.Interpreter_intStackSize -= 2; // L: 3418
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3419
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3420
							var5 = PlayerAppearance.getParamDefinition(var4); // L: 3421
							if (var5.isString()) { // L: 3422
								Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = NetSocket.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3423
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = NetSocket.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3426
							}

							return 1; // L: 3428
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 3430
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 3431
							return 1; // L: 3432
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 3434
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.clientType & 3; // L: 3435
							return 1; // L: 3436
						} else if (var0 == 6520) { // L: 3438
							return 1; // L: 3439
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 3441
							return 1; // L: 3442
						} else if (var0 == 6522) { // L: 3444
							--Varps.Interpreter_stringStackSize; // L: 3445
							--Interpreter.Interpreter_intStackSize; // L: 3446
							return 1; // L: 3447
						} else if (var0 == 6523) { // L: 3449
							--Varps.Interpreter_stringStackSize; // L: 3450
							--Interpreter.Interpreter_intStackSize; // L: 3451
							return 1; // L: 3452
						} else if (var0 == ScriptOpcodes.BATTERYLEVEL) { // L: 3454
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3455
							return 1; // L: 3456
						} else if (var0 == ScriptOpcodes.BATTERYCHARGING) { // L: 3458
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3459
							return 1; // L: 3460
						} else if (var0 == ScriptOpcodes.WIFIAVAILABLE) { // L: 3462
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3463
							return 1; // L: 3464
						} else {
							return 2; // L: 3466
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3354
					if (var3 >= 0 && var3 < World.World_count) { // L: 3355
						var7 = AbstractByteArrayCopier.World_worlds[var3]; // L: 3356
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 3357
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 3358
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var7.activity; // L: 3359
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 3360
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 3361
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var7.host; // L: 3362
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3365
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3366
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 3367
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3368
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3369
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 3370
					}

					return 1; // L: 3372
				}
			}
		}
	}
}
