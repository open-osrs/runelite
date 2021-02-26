import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("ItemDefinition_fontPlain11")
	public static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1001964101
	)
	@Export("id")
	public int id;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1799325523
	)
	@Export("model")
	int model;
	@ObfuscatedName("i")
	@Export("name")
	public String name;
	@ObfuscatedName("x")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("f")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("g")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("u")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 6879929
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1688105217
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1543947313
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1306292043
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1516282991
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1944648005
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1833299999
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 753728935
	)
	@Export("price")
	public int price;
	@ObfuscatedName("ag")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("ae")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("ac")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1719700473
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1669101649
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2060581313
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -924111705
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -933159689
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -706743113
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -224060053
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -156140513
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1489011567
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1126073689
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -579174705
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1575362213
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 580683253
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("ai")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("ab")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1429029547
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1169335275
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1218520383
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1237330743
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -52672675
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1894951113
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 350905955
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -358340883
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("br")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1240574229
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1151278327
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1976795321
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1745623911
	)
	@Export("placeholderTemplate")
	public int placeholderTemplate;

	static {
		ItemDefinition_cached = new EvictingDualNodeHashTable(64); // L: 28
		ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50); // L: 29
		ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200); // L: 30
	}

	ItemComposition() {
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "988700298"
	)
	@Export("post")
	void post() {
	} // L: 115

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V",
		garbageValue = "-2119006987"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 119
			if (var2 == 0) { // L: 120
				return; // L: 123
			}

			this.decodeNext(var1, var2); // L: 121
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkx;IB)V",
		garbageValue = "42"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 126
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 127
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 128
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 129
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 130
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 131
			this.offsetX2d = var1.readUnsignedShort(); // L: 132
			if (this.offsetX2d > 32767) { // L: 133
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) { // L: 135
			this.offsetY2d = var1.readUnsignedShort(); // L: 136
			if (this.offsetY2d > 32767) { // L: 137
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 11) { // L: 139
			this.isStackable = 1;
		} else if (var2 == 12) { // L: 140
			this.price = var1.readInt();
		} else if (var2 == 16) { // L: 141
			this.isMembersOnly = true;
		} else if (var2 == 23) { // L: 142
			this.maleModel = var1.readUnsignedShort(); // L: 143
			this.maleOffset = var1.readUnsignedByte(); // L: 144
		} else if (var2 == 24) { // L: 146
			this.maleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) { // L: 147
			this.femaleModel = var1.readUnsignedShort(); // L: 148
			this.femaleOffset = var1.readUnsignedByte(); // L: 149
		} else if (var2 == 26) { // L: 151
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 >= 30 && var2 < 35) { // L: 152
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 153
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 154
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) { // L: 156
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 157
				var3 = var1.readUnsignedByte(); // L: 158
				this.recolorFrom = new short[var3]; // L: 159
				this.recolorTo = new short[var3]; // L: 160

				for (var4 = 0; var4 < var3; ++var4) { // L: 161
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 162
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 163
				}
			} else if (var2 == 41) { // L: 166
				var3 = var1.readUnsignedByte(); // L: 167
				this.retextureFrom = new short[var3]; // L: 168
				this.retextureTo = new short[var3]; // L: 169

				for (var4 = 0; var4 < var3; ++var4) { // L: 170
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 171
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 172
				}
			} else if (var2 == 42) { // L: 175
				this.shiftClickIndex = var1.readByte(); // L: 176
			} else if (var2 == 65) { // L: 178
				this.isTradable = true;
			} else if (var2 == 78) { // L: 179
				this.maleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) { // L: 180
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 90) { // L: 181
				this.maleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 91) { // L: 182
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 92) { // L: 183
				this.maleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 93) { // L: 184
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 95) { // L: 185
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) { // L: 186
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) { // L: 187
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) { // L: 188
				if (this.countobj == null) { // L: 189
					this.countobj = new int[10]; // L: 190
					this.countco = new int[10]; // L: 191
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort(); // L: 193
				this.countco[var2 - 100] = var1.readUnsignedShort(); // L: 194
			} else if (var2 == 110) { // L: 196
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) { // L: 197
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) { // L: 198
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) { // L: 199
				this.ambient = var1.readByte();
			} else if (var2 == 114) { // L: 200
				this.contrast = var1.readByte() * 5;
			} else if (var2 == 115) { // L: 201
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) { // L: 202
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) { // L: 203
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) { // L: 204
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) { // L: 205
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) { // L: 206
				this.params = TextureProvider.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 208

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljj;Ljj;I)V",
		garbageValue = "1798328013"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 211
		this.zoom2d = var1.zoom2d; // L: 212
		this.xan2d = var1.xan2d; // L: 213
		this.yan2d = var1.yan2d; // L: 214
		this.zan2d = var1.zan2d; // L: 215
		this.offsetX2d = var1.offsetX2d; // L: 216
		this.offsetY2d = var1.offsetY2d; // L: 217
		this.recolorFrom = var1.recolorFrom; // L: 218
		this.recolorTo = var1.recolorTo; // L: 219
		this.retextureFrom = var1.retextureFrom; // L: 220
		this.retextureTo = var1.retextureTo; // L: 221
		this.name = var2.name; // L: 222
		this.isMembersOnly = var2.isMembersOnly; // L: 223
		this.price = var2.price; // L: 224
		this.isStackable = 1; // L: 225
	} // L: 226

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljj;Ljj;I)V",
		garbageValue = "962521022"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 229
		this.zoom2d = var1.zoom2d; // L: 230
		this.xan2d = var1.xan2d; // L: 231
		this.yan2d = var1.yan2d; // L: 232
		this.zan2d = var1.zan2d; // L: 233
		this.offsetX2d = var1.offsetX2d; // L: 234
		this.offsetY2d = var1.offsetY2d; // L: 235
		this.recolorFrom = var2.recolorFrom; // L: 236
		this.recolorTo = var2.recolorTo; // L: 237
		this.retextureFrom = var2.retextureFrom; // L: 238
		this.retextureTo = var2.retextureTo; // L: 239
		this.name = var2.name; // L: 240
		this.isMembersOnly = var2.isMembersOnly; // L: 241
		this.isStackable = var2.isStackable; // L: 242
		this.maleModel = var2.maleModel; // L: 243
		this.maleModel1 = var2.maleModel1; // L: 244
		this.maleModel2 = var2.maleModel2; // L: 245
		this.femaleModel = var2.femaleModel; // L: 246
		this.femaleModel1 = var2.femaleModel1; // L: 247
		this.femaleModel2 = var2.femaleModel2; // L: 248
		this.maleHeadModel = var2.maleHeadModel; // L: 249
		this.maleHeadModel2 = var2.maleHeadModel2; // L: 250
		this.femaleHeadModel = var2.femaleHeadModel; // L: 251
		this.femaleHeadModel2 = var2.femaleHeadModel2; // L: 252
		this.team = var2.team; // L: 253
		this.groundActions = var2.groundActions; // L: 254
		this.inventoryActions = new String[5]; // L: 255
		if (var2.inventoryActions != null) { // L: 256
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard"; // L: 257
		this.price = 0; // L: 258
	} // L: 259

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljj;Ljj;I)V",
		garbageValue = "-1559307147"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 262
		this.zoom2d = var1.zoom2d; // L: 263
		this.xan2d = var1.xan2d; // L: 264
		this.yan2d = var1.yan2d; // L: 265
		this.zan2d = var1.zan2d; // L: 266
		this.offsetX2d = var1.offsetX2d; // L: 267
		this.offsetY2d = var1.offsetY2d; // L: 268
		this.recolorFrom = var1.recolorFrom; // L: 269
		this.recolorTo = var1.recolorTo; // L: 270
		this.retextureFrom = var1.retextureFrom; // L: 271
		this.retextureTo = var1.retextureTo; // L: 272
		this.isStackable = var1.isStackable; // L: 273
		this.name = var2.name; // L: 274
		this.price = 0; // L: 275
		this.isMembersOnly = false; // L: 276
		this.isTradable = false; // L: 277
	} // L: 278

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Lek;",
		garbageValue = "-1144241920"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) { // L: 281
			int var2 = -1; // L: 282

			for (var3 = 0; var3 < 10; ++var3) { // L: 283
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 284
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 286
				return class281.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(class8.ItemDefinition_modelArchive, this.model, 0); // L: 288
		if (var4 == null) { // L: 289
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 290
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) { // L: 291
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 292
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 293
				}
			}

			if (this.retextureFrom != null) { // L: 296
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 297
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 298
				}
			}

			return var4; // L: 301
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lef;",
		garbageValue = "-2139436436"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 305
			int var2 = -1; // L: 306

			for (int var3 = 0; var3 < 10; ++var3) { // L: 307
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 308
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 310
				return class281.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id); // L: 312
		if (var5 != null) { // L: 313
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(class8.ItemDefinition_modelArchive, this.model, 0); // L: 314
			if (var6 == null) { // L: 315
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 316
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) { // L: 317
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 318
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 319
					}
				}

				if (this.retextureFrom != null) { // L: 322
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 323
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 324
					}
				}

				var5 = var6.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 327
				var5.isSingleTile = true; // L: 328
				ItemDefinition_cachedModels.put(var5, (long)this.id); // L: 329
				return var5; // L: 330
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Ljj;",
		garbageValue = "-309156519"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 334
			int var2 = -1; // L: 335

			for (int var3 = 0; var3 < 10; ++var3) { // L: 336
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3]; // L: 337
				}
			}

			if (var2 != -1) { // L: 339
				return class281.ItemDefinition_get(var2);
			}
		}

		return this; // L: 341
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-240048838"
	)
	@Export("hasNoValidModel")
	public final boolean hasNoValidModel(boolean var1) {
		int var2 = this.maleModel; // L: 419
		int var3 = this.maleModel1; // L: 420
		int var4 = this.maleModel2; // L: 421
		if (var1) { // L: 422
			var2 = this.femaleModel; // L: 423
			var3 = this.femaleModel1; // L: 424
			var4 = this.femaleModel2; // L: 425
		}

		if (var2 == -1) { // L: 427
			return true;
		} else {
			boolean var5 = true; // L: 428
			if (!class8.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 429
				var5 = false;
			}

			if (var3 != -1 && !class8.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 430
				var5 = false;
			}

			if (var4 != -1 && !class8.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) { // L: 431
				var5 = false;
			}

			return var5; // L: 432
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lek;",
		garbageValue = "-324147139"
	)
	public final ModelData method4866(boolean var1) {
		int var2 = this.maleModel; // L: 436
		int var3 = this.maleModel1; // L: 437
		int var4 = this.maleModel2; // L: 438
		if (var1) { // L: 439
			var2 = this.femaleModel; // L: 440
			var3 = this.femaleModel1; // L: 441
			var4 = this.femaleModel2; // L: 442
		}

		if (var2 == -1) { // L: 444
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(class8.ItemDefinition_modelArchive, var2, 0); // L: 445
			if (var3 != -1) { // L: 446
				ModelData var6 = ModelData.ModelData_get(class8.ItemDefinition_modelArchive, var3, 0); // L: 447
				if (var4 != -1) { // L: 448
					ModelData var7 = ModelData.ModelData_get(class8.ItemDefinition_modelArchive, var4, 0); // L: 449
					ModelData[] var8 = new ModelData[]{var5, var6, var7}; // L: 450
					var5 = new ModelData(var8, 3); // L: 451
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6}; // L: 454
					var5 = new ModelData(var10, 2); // L: 455
				}
			}

			if (!var1 && this.maleOffset != 0) { // L: 458
				var5.changeOffset(0, this.maleOffset, 0);
			}

			if (var1 && this.femaleOffset != 0) { // L: 459
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 460
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 461
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 462
				}
			}

			if (this.retextureFrom != null) { // L: 465
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 466
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 467
				}
			}

			return var5; // L: 470
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1270984011"
	)
	public final boolean method4879(boolean var1) {
		int var2 = this.maleHeadModel; // L: 474
		int var3 = this.maleHeadModel2; // L: 475
		if (var1) { // L: 476
			var2 = this.femaleHeadModel; // L: 477
			var3 = this.femaleHeadModel2; // L: 478
		}

		if (var2 == -1) { // L: 480
			return true;
		} else {
			boolean var4 = true; // L: 481
			if (!class8.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 482
				var4 = false;
			}

			if (var3 != -1 && !class8.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 483
				var4 = false;
			}

			return var4; // L: 484
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lek;",
		garbageValue = "51"
	)
	public final ModelData method4880(boolean var1) {
		int var2 = this.maleHeadModel; // L: 488
		int var3 = this.maleHeadModel2; // L: 489
		if (var1) { // L: 490
			var2 = this.femaleHeadModel; // L: 491
			var3 = this.femaleHeadModel2; // L: 492
		}

		if (var2 == -1) { // L: 494
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(class8.ItemDefinition_modelArchive, var2, 0); // L: 495
			if (var3 != -1) { // L: 496
				ModelData var5 = ModelData.ModelData_get(class8.ItemDefinition_modelArchive, var3, 0); // L: 497
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 498
				var4 = new ModelData(var6, 2); // L: 499
			}

			int var7;
			if (this.recolorFrom != null) { // L: 501
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 502
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 503
				}
			}

			if (this.retextureFrom != null) { // L: 506
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 507
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 508
				}
			}

			return var4; // L: 511
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-45"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 516
		int var3;
		if (var4 == null) { // L: 518
			var3 = var2; // L: 519
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 522
			if (var5 == null) { // L: 523
				var3 = var2; // L: 524
			} else {
				var3 = var5.integer; // L: 527
			}
		}

		return var3; // L: 529
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1156032782"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class69.method1258(this.params, var1, var2); // L: 533
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "47"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 537
			if (this.shiftClickIndex >= 0) { // L: 538
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex * -1210205769 * -1719700473 : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 539
			}
		} else {
			return -1;
		}
	}
}
