import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 251127981
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("ItemDefinition_cached")
	static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("ItemDefinition_cachedModels")
	static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("ItemDefinition_cachedSprites")
	static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 644081785
	)
	public static int field1859;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -882422617
	)
	@Export("id")
	public int id;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1212146295
	)
	@Export("model")
	int model;
	@ObfuscatedName("g")
	@Export("name")
	public String name;
	@ObfuscatedName("a")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("k")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("m")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("x")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1180916267
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 143465415
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 10451221
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1707042663
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -538415603
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1515805085
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1049731853
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -407851249
	)
	@Export("price")
	public int price;
	@ObfuscatedName("ab")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("al")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("ad")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1244064173
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 461761185
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2090621981
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 2017655331
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1881995837
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 264233001
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 237060879
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1265781663
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -459952191
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2115221939
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1899720535
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1556168093
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 586976285
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("aw")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("af")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1027633359
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 168192755
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1366362761
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1651193245
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -867000627
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -333382647
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -512843981
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1898498591
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bl")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1249308017
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1893254845
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1563500305
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1689317723
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
		this.offsetY2d = 0;
		this.isStackable = 0; // L: 45
		this.price = 1; // L: 46
		this.isMembersOnly = false;
		this.groundActions = new String[]{null, null, "Take", null, null};
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
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1352174221"
	)
	@Export("post")
	void post() {
	} // L: 115

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "2116753290"
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnd;II)V",
		garbageValue = "-610453643"
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
			if (this.offsetY2d > 32767) {
				this.offsetY2d -= 65536; // L: 137
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
			} else if (var2 == 98) {
				this.noteTemplate = var1.readUnsignedShort(); // L: 187
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
				this.params = ModeWhere.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 208

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Leq;Leq;B)V",
		garbageValue = "107"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Leq;Leq;I)V",
		garbageValue = "2093027907"
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Leq;Leq;I)V",
		garbageValue = "555956610"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Lgm;",
		garbageValue = "594500425"
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
				return class260.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(class311.ItemDefinition_modelArchive, this.model, 0); // L: 288
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)Lgr;",
		garbageValue = "-1748661120"
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
				return class260.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id); // L: 312
		if (var5 != null) { // L: 313
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(class311.ItemDefinition_modelArchive, this.model, 0); // L: 314
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IS)Leq;",
		garbageValue = "312"
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
				return class260.ItemDefinition_get(var2);
			}
		}

		return this; // L: 341
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-46"
	)
	@Export("hasNoValidModel")
	public final boolean hasNoValidModel(boolean var1) {
		int var2 = this.maleModel;
		int var3 = this.maleModel1;
		int var4 = this.maleModel2; // L: 428
		if (var1) {
			var2 = this.femaleModel;
			var3 = this.femaleModel1;
			var4 = this.femaleModel2;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!class311.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var5 = false;
			}

			if (var3 != -1 && !class311.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 437
				var5 = false;
			}

			if (var4 != -1 && !class311.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lgm;",
		garbageValue = "-1178156518"
	)
	public final ModelData method3018(boolean var1) {
		int var2 = this.maleModel; // L: 443
		int var3 = this.maleModel1;
		int var4 = this.maleModel2;
		if (var1) { // L: 446
			var2 = this.femaleModel;
			var3 = this.femaleModel1; // L: 448
			var4 = this.femaleModel2;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(class311.ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var6 = ModelData.ModelData_get(class311.ItemDefinition_modelArchive, var3, 0);
				if (var4 != -1) {
					ModelData var7 = ModelData.ModelData_get(class311.ItemDefinition_modelArchive, var4, 0); // L: 456
					ModelData[] var8 = new ModelData[]{var5, var6, var7};
					var5 = new ModelData(var8, 3);
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6};
					var5 = new ModelData(var10, 2);
				}
			}

			if (!var1 && this.maleOffset != 0) { // L: 465
				var5.changeOffset(0, this.maleOffset, 0);
			}

			if (var1 && this.femaleOffset != 0) {
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			int var9;
			if (this.recolorFrom != null) {
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) {
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 469
				}
			}

			if (this.retextureFrom != null) {
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 473
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]);
				}
			}

			return var5; // L: 477
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "673638768"
	)
	public final boolean method3019(boolean var1) {
		int var2 = this.maleHeadModel;
		int var3 = this.maleHeadModel2;
		if (var1) { // L: 483
			var2 = this.femaleHeadModel;
			var3 = this.femaleHeadModel2;
		}

		if (var2 == -1) { // L: 487
			return true;
		} else {
			boolean var4 = true;
			if (!class311.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var4 = false;
			}

			if (var3 != -1 && !class311.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var4 = false;
			}

			return var4; // L: 491
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lgm;",
		garbageValue = "10"
	)
	public final ModelData method3020(boolean var1) {
		int var2 = this.maleHeadModel; // L: 495
		int var3 = this.maleHeadModel2;
		if (var1) {
			var2 = this.femaleHeadModel;
			var3 = this.femaleHeadModel2;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(class311.ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var5 = ModelData.ModelData_get(class311.ItemDefinition_modelArchive, var3, 0); // L: 504
				ModelData[] var6 = new ModelData[]{var4, var5};
				var4 = new ModelData(var6, 2);
			}

			int var7;
			if (this.recolorFrom != null) { // L: 508
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) {
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]);
				}
			}

			if (this.retextureFrom != null) { // L: 513
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 514
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "117"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return SecureRandomFuture.method1977(this.params, var1, var2);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)Ljava/lang/String;",
		garbageValue = "239"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return FriendsList.method5650(this.params, var1, var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1596135449"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) {
			if (this.shiftClickIndex >= 0) {
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex * -1244064173 * 1541643739 : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-14386"
	)
	boolean method3024() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "604113686"
	)
	boolean method3025() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-378975040"
	)
	public static int method3084() {
		return ViewportMouse.ViewportMouse_entityCount; // L: 44
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljv;III)[Loh;",
		garbageValue = "-1264314377"
	)
	public static SpritePixels[] method3087(AbstractArchive var0, int var1, int var2) {
		return !class339.method6015(var0, var1, var2) ? null : class142.method2739(); // L: 47 48
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-919320059"
	)
	static final void method3085(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 79
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 80
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 81
					class372.field4123[0][var5][var4] = 127; // L: 82
					if (var0 == var5 && var5 > 0) { // L: 83
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4]; // L: 84
					}

					if (var4 == var1 && var4 > 0) { // L: 85
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var4 == var3 + var1 && var4 < 103) { // L: 86
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 90

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnb;IB)V",
		garbageValue = "100"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 392
		if (var2) { // L: 393
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 394
		Player var4 = Client.players[var1]; // L: 395
		if (var3 == 0) { // L: 396
			if (var2) { // L: 397
				var4.field1218 = false; // L: 398
			} else if (Client.localPlayerIndex == var1) { // L: 401
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (VertexNormal.baseX + var4.pathX[0] >> 13 << 14) + (SoundSystem.baseY + var4.pathY[0] >> 13); // L: 402
				if (var4.field1264 != -1) { // L: 403
					Players.Players_orientations[var1] = var4.field1264;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 404
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 405
				Client.players[var1] = null; // L: 406
				if (var0.readBits(1) != 0) { // L: 407
					ParamComposition.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 410
				var5 = var0.readBits(3); // L: 411
				var6 = var4.pathX[0]; // L: 412
				var7 = var4.pathY[0]; // L: 413
				if (var5 == 0) { // L: 414
					--var6; // L: 415
					--var7; // L: 416
				} else if (var5 == 1) { // L: 418
					--var7;
				} else if (var5 == 2) { // L: 419
					++var6; // L: 420
					--var7; // L: 421
				} else if (var5 == 3) { // L: 423
					--var6;
				} else if (var5 == 4) { // L: 424
					++var6;
				} else if (var5 == 5) { // L: 425
					--var6; // L: 426
					++var7; // L: 427
				} else if (var5 == 6) { // L: 429
					++var7;
				} else if (var5 == 7) { // L: 430
					++var6; // L: 431
					++var7; // L: 432
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 434
					var4.resetPath(var6, var7); // L: 435
					var4.field1218 = false; // L: 436
				} else if (var2) { // L: 438
					var4.field1218 = true; // L: 439
					var4.tileX = var6; // L: 440
					var4.tileY = var7; // L: 441
				} else {
					var4.field1218 = false; // L: 444
					var4.method2129(var6, var7, Players.field1373[var1]); // L: 445
				}

			} else if (var3 == 2) { // L: 449
				var5 = var0.readBits(4); // L: 450
				var6 = var4.pathX[0]; // L: 451
				var7 = var4.pathY[0]; // L: 452
				if (var5 == 0) { // L: 453
					var6 -= 2; // L: 454
					var7 -= 2; // L: 455
				} else if (var5 == 1) { // L: 457
					--var6; // L: 458
					var7 -= 2; // L: 459
				} else if (var5 == 2) { // L: 461
					var7 -= 2;
				} else if (var5 == 3) { // L: 462
					++var6; // L: 463
					var7 -= 2; // L: 464
				} else if (var5 == 4) { // L: 466
					var6 += 2; // L: 467
					var7 -= 2; // L: 468
				} else if (var5 == 5) { // L: 470
					var6 -= 2; // L: 471
					--var7; // L: 472
				} else if (var5 == 6) { // L: 474
					var6 += 2; // L: 475
					--var7; // L: 476
				} else if (var5 == 7) { // L: 478
					var6 -= 2;
				} else if (var5 == 8) { // L: 479
					var6 += 2;
				} else if (var5 == 9) { // L: 480
					var6 -= 2; // L: 481
					++var7; // L: 482
				} else if (var5 == 10) { // L: 484
					var6 += 2; // L: 485
					++var7; // L: 486
				} else if (var5 == 11) { // L: 488
					var6 -= 2; // L: 489
					var7 += 2; // L: 490
				} else if (var5 == 12) { // L: 492
					--var6; // L: 493
					var7 += 2; // L: 494
				} else if (var5 == 13) { // L: 496
					var7 += 2;
				} else if (var5 == 14) { // L: 497
					++var6; // L: 498
					var7 += 2; // L: 499
				} else if (var5 == 15) { // L: 501
					var6 += 2; // L: 502
					var7 += 2; // L: 503
				}

				if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 505
					if (var2) { // L: 509
						var4.field1218 = true; // L: 510
						var4.tileX = var6; // L: 511
						var4.tileY = var7; // L: 512
					} else {
						var4.field1218 = false; // L: 515
						var4.method2129(var6, var7, Players.field1373[var1]); // L: 516
					}
				} else {
					var4.resetPath(var6, var7); // L: 506
					var4.field1218 = false; // L: 507
				}

			} else {
				var5 = var0.readBits(1); // L: 520
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 521
					var6 = var0.readBits(12); // L: 522
					var7 = var6 >> 10; // L: 523
					var8 = var6 >> 5 & 31; // L: 524
					if (var8 > 15) { // L: 525
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 526
					if (var9 > 15) { // L: 527
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 528
					var11 = var9 + var4.pathY[0]; // L: 529
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 530
						var4.resetPath(var10, var11); // L: 531
						var4.field1218 = false; // L: 532
					} else if (var2) { // L: 534
						var4.field1218 = true; // L: 535
						var4.tileX = var10; // L: 536
						var4.tileY = var11; // L: 537
					} else {
						var4.field1218 = false; // L: 540
						var4.method2129(var10, var11, Players.field1373[var1]); // L: 541
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 543
					if (Client.localPlayerIndex == var1) { // L: 544
						class22.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 547
					var7 = var6 >> 28; // L: 548
					var8 = var6 >> 14 & 16383; // L: 549
					var9 = var6 & 16383; // L: 550
					var10 = (var8 + VertexNormal.baseX + var4.pathX[0] & 16383) - VertexNormal.baseX; // L: 551
					var11 = (var9 + SoundSystem.baseY + var4.pathY[0] & 16383) - SoundSystem.baseY; // L: 552
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 553
						var4.resetPath(var10, var11); // L: 554
						var4.field1218 = false; // L: 555
					} else if (var2) { // L: 557
						var4.field1218 = true; // L: 558
						var4.tileX = var10; // L: 559
						var4.tileY = var11; // L: 560
					} else {
						var4.field1218 = false; // L: 563
						var4.method2129(var10, var11, Players.field1373[var1]); // L: 564
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 566
					if (Client.localPlayerIndex == var1) { // L: 567
						class22.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 399 408 447 518 545 568
}
