import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1304511159
	)
	static int field2076;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("ci")
	public static char field2121;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = 879723765
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1358562449
	)
	@Export("id")
	public int id;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1795914843
	)
	@Export("model")
	int model;
	@ObfuscatedName("m")
	@Export("name")
	public String name;
	@ObfuscatedName("u")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("t")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("g")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("x")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 196878577
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -665001803
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2086760217
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 273423951
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 371108815
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1462314207
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1832984021
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -152346525
	)
	@Export("price")
	public int price;
	@ObfuscatedName("aw")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("am")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("ak")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -822939591
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 378265163
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1588045303
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 570767097
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -950675371
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1339664031
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1567941563
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 707810015
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1223715049
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1614579943
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -880790519
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1611595155
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -112485395
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("ai")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("ax")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1339927085
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1457384295
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 533172981
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -696696217
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2002126289
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -999686443
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -606259097
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1632999251
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bl")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 815357649
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 715906289
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1861125713
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1550899901
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1176456710"
	)
	@Export("post")
	void post() {
	} // L: 129

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "1"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 133
			if (var2 == 0) { // L: 134
				return; // L: 137
			}

			this.decodeNext(var1, var2); // L: 135
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-46032280"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 140
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 141
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 142
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 143
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 144
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 145
			this.offsetX2d = var1.readUnsignedShort(); // L: 146
			if (this.offsetX2d > 32767) { // L: 147
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) { // L: 149
			this.offsetY2d = var1.readUnsignedShort(); // L: 150
			if (this.offsetY2d > 32767) { // L: 151
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) { // L: 153
			var1.readStringCp1252NullTerminated(); // L: 154
		} else if (var2 == 11) { // L: 156
			this.isStackable = 1;
		} else if (var2 == 12) { // L: 157
			this.price = var1.readInt();
		} else if (var2 == 16) { // L: 158
			this.isMembersOnly = true;
		} else if (var2 == 23) { // L: 159
			this.maleModel = var1.readUnsignedShort(); // L: 160
			this.maleOffset = var1.readUnsignedByte(); // L: 161
		} else if (var2 == 24) { // L: 163
			this.maleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) { // L: 164
			this.femaleModel = var1.readUnsignedShort(); // L: 165
			this.femaleOffset = var1.readUnsignedByte(); // L: 166
		} else if (var2 == 26) { // L: 168
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 >= 30 && var2 < 35) { // L: 169
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 170
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 171
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) { // L: 173
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 174
				var3 = var1.readUnsignedByte(); // L: 175
				this.recolorFrom = new short[var3]; // L: 176
				this.recolorTo = new short[var3]; // L: 177

				for (var4 = 0; var4 < var3; ++var4) { // L: 178
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 179
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 180
				}
			} else if (var2 == 41) { // L: 183
				var3 = var1.readUnsignedByte(); // L: 184
				this.retextureFrom = new short[var3]; // L: 185
				this.retextureTo = new short[var3]; // L: 186

				for (var4 = 0; var4 < var3; ++var4) { // L: 187
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 188
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 189
				}
			} else if (var2 == 42) { // L: 192
				this.shiftClickIndex = var1.readByte(); // L: 193
			} else if (var2 == 65) { // L: 195
				this.isTradable = true;
			} else if (var2 == 78) { // L: 196
				this.maleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) { // L: 197
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 90) { // L: 198
				this.maleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 91) { // L: 199
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 92) { // L: 200
				this.maleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 93) { // L: 201
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 94) { // L: 202
				var1.readUnsignedShort(); // L: 203
			} else if (var2 == 95) {
				this.zan2d = var1.readUnsignedShort(); // L: 205
			} else if (var2 == 97) { // L: 206
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) { // L: 207
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) { // L: 208
				if (this.countobj == null) { // L: 209
					this.countobj = new int[10]; // L: 210
					this.countco = new int[10]; // L: 211
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort(); // L: 213
				this.countco[var2 - 100] = var1.readUnsignedShort(); // L: 214
			} else if (var2 == 110) { // L: 216
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) { // L: 217
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) { // L: 218
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) { // L: 219
				this.ambient = var1.readByte();
			} else if (var2 == 114) { // L: 220
				this.contrast = var1.readByte() * 5;
			} else if (var2 == 115) { // L: 221
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) { // L: 222
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) { // L: 223
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) { // L: 224
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) { // L: 225
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) {
				this.params = class214.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lgf;Lgf;B)V",
		garbageValue = "8"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d; // L: 235
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var1.recolorFrom;
		this.recolorTo = var1.recolorTo;
		this.retextureFrom = var1.retextureFrom;
		this.retextureTo = var1.retextureTo;
		this.name = var2.name;
		this.isMembersOnly = var2.isMembersOnly;
		this.price = var2.price;
		this.isStackable = 1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lgf;Lgf;I)V",
		garbageValue = "-1718664847"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var2.recolorFrom; // L: 256
		this.recolorTo = var2.recolorTo;
		this.retextureFrom = var2.retextureFrom; // L: 258
		this.retextureTo = var2.retextureTo; // L: 259
		this.name = var2.name; // L: 260
		this.isMembersOnly = var2.isMembersOnly; // L: 261
		this.isStackable = var2.isStackable;
		this.maleModel = var2.maleModel; // L: 263
		this.maleModel1 = var2.maleModel1; // L: 264
		this.maleModel2 = var2.maleModel2; // L: 265
		this.femaleModel = var2.femaleModel; // L: 266
		this.femaleModel1 = var2.femaleModel1; // L: 267
		this.femaleModel2 = var2.femaleModel2; // L: 268
		this.maleHeadModel = var2.maleHeadModel; // L: 269
		this.maleHeadModel2 = var2.maleHeadModel2; // L: 270
		this.femaleHeadModel = var2.femaleHeadModel; // L: 271
		this.femaleHeadModel2 = var2.femaleHeadModel2; // L: 272
		this.team = var2.team; // L: 273
		this.groundActions = var2.groundActions; // L: 274
		this.inventoryActions = new String[5]; // L: 275
		if (var2.inventoryActions != null) { // L: 276
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard"; // L: 277
		this.price = 0; // L: 278
	} // L: 279

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lgf;Lgf;B)V",
		garbageValue = "72"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 282
		this.zoom2d = var1.zoom2d; // L: 283
		this.xan2d = var1.xan2d; // L: 284
		this.yan2d = var1.yan2d; // L: 285
		this.zan2d = var1.zan2d; // L: 286
		this.offsetX2d = var1.offsetX2d; // L: 287
		this.offsetY2d = var1.offsetY2d; // L: 288
		this.recolorFrom = var1.recolorFrom; // L: 289
		this.recolorTo = var1.recolorTo; // L: 290
		this.retextureFrom = var1.retextureFrom; // L: 291
		this.retextureTo = var1.retextureTo; // L: 292
		this.isStackable = var1.isStackable; // L: 293
		this.name = var2.name; // L: 294
		this.price = 0; // L: 295
		this.isMembersOnly = false; // L: 296
		this.isTradable = false; // L: 297
	} // L: 298

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhc;",
		garbageValue = "-88"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) { // L: 301
			int var2 = -1; // L: 302

			for (var3 = 0; var3 < 10; ++var3) { // L: 303
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 304
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 306
				return class19.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(AttackOption.ItemDefinition_modelArchive, this.model, 0); // L: 308
		if (var4 == null) { // L: 309
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 310
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) { // L: 311
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 312
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 313
				}
			}

			if (this.retextureFrom != null) { // L: 316
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 317
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 318
				}
			}

			return var4; // L: 321
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Liq;",
		garbageValue = "973895006"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 325
			int var2 = -1; // L: 326

			for (int var3 = 0; var3 < 10; ++var3) { // L: 327
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 328
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 330
				return class19.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id); // L: 332
		if (var5 != null) { // L: 333
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(AttackOption.ItemDefinition_modelArchive, this.model, 0); // L: 334
			if (var6 == null) { // L: 335
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 336
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) { // L: 337
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 338
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 339
					}
				}

				if (this.retextureFrom != null) { // L: 342
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 343
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 344
					}
				}

				var5 = var6.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 347
				var5.isSingleTile = true; // L: 348
				ItemDefinition_cachedModels.put(var5, (long)this.id); // L: 349
				return var5; // L: 350
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)Lgf;",
		garbageValue = "215636085"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 354
			int var2 = -1; // L: 355

			for (int var3 = 0; var3 < 10; ++var3) { // L: 356
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 357
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 359
				return class19.ItemDefinition_get(var2);
			}
		}

		return this; // L: 361
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-480177998"
	)
	@Export("hasNoValidModel")
	public final boolean hasNoValidModel(boolean var1) {
		int var2 = this.maleModel; // L: 446
		int var3 = this.maleModel1; // L: 447
		int var4 = this.maleModel2; // L: 448
		if (var1) { // L: 449
			var2 = this.femaleModel; // L: 450
			var3 = this.femaleModel1; // L: 451
			var4 = this.femaleModel2; // L: 452
		}

		if (var2 == -1) { // L: 454
			return true;
		} else {
			boolean var5 = true; // L: 455
			if (!AttackOption.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 456
				var5 = false;
			}

			if (var3 != -1 && !AttackOption.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 457
				var5 = false;
			}

			if (var4 != -1 && !AttackOption.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) { // L: 458
				var5 = false;
			}

			return var5; // L: 459
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lhc;",
		garbageValue = "1919870676"
	)
	public final ModelData method3719(boolean var1) {
		int var2 = this.maleModel; // L: 463
		int var3 = this.maleModel1; // L: 464
		int var4 = this.maleModel2; // L: 465
		if (var1) { // L: 466
			var2 = this.femaleModel; // L: 467
			var3 = this.femaleModel1; // L: 468
			var4 = this.femaleModel2; // L: 469
		}

		if (var2 == -1) { // L: 471
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(AttackOption.ItemDefinition_modelArchive, var2, 0); // L: 472
			if (var3 != -1) { // L: 473
				ModelData var6 = ModelData.ModelData_get(AttackOption.ItemDefinition_modelArchive, var3, 0); // L: 474
				if (var4 != -1) { // L: 475
					ModelData var7 = ModelData.ModelData_get(AttackOption.ItemDefinition_modelArchive, var4, 0); // L: 476
					ModelData[] var8 = new ModelData[]{var5, var6, var7}; // L: 477
					var5 = new ModelData(var8, 3); // L: 478
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6}; // L: 481
					var5 = new ModelData(var10, 2); // L: 482
				}
			}

			if (!var1 && this.maleOffset != 0) { // L: 485
				var5.changeOffset(0, this.maleOffset, 0);
			}

			if (var1 && this.femaleOffset != 0) { // L: 486
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 487
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 488
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 489
				}
			}

			if (this.retextureFrom != null) { // L: 492
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 493
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 494
				}
			}

			return var5; // L: 497
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1863743835"
	)
	public final boolean method3723(boolean var1) {
		int var2 = this.maleHeadModel; // L: 501
		int var3 = this.maleHeadModel2; // L: 502
		if (var1) { // L: 503
			var2 = this.femaleHeadModel; // L: 504
			var3 = this.femaleHeadModel2; // L: 505
		}

		if (var2 == -1) { // L: 507
			return true;
		} else {
			boolean var4 = true; // L: 508
			if (!AttackOption.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 509
				var4 = false;
			}

			if (var3 != -1 && !AttackOption.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 510
				var4 = false;
			}

			return var4; // L: 511
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lhc;",
		garbageValue = "-1677053945"
	)
	public final ModelData method3718(boolean var1) {
		int var2 = this.maleHeadModel; // L: 515
		int var3 = this.maleHeadModel2; // L: 516
		if (var1) { // L: 517
			var2 = this.femaleHeadModel; // L: 518
			var3 = this.femaleHeadModel2; // L: 519
		}

		if (var2 == -1) { // L: 521
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(AttackOption.ItemDefinition_modelArchive, var2, 0); // L: 522
			if (var3 != -1) { // L: 523
				ModelData var5 = ModelData.ModelData_get(AttackOption.ItemDefinition_modelArchive, var3, 0); // L: 524
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 525
				var4 = new ModelData(var6, 2); // L: 526
			}

			int var7;
			if (this.recolorFrom != null) { // L: 528
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 529
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 530
				}
			}

			if (this.retextureFrom != null) { // L: 533
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 534
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 535
				}
			}

			return var4; // L: 538
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1076899733"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 543
		int var3;
		if (var4 == null) { // L: 545
			var3 = var2; // L: 546
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 549
			if (var5 == null) { // L: 550
				var3 = var2; // L: 551
			} else {
				var3 = var5.integer; // L: 554
			}
		}

		return var3; // L: 556
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "20"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 561
		String var3;
		if (var4 == null) { // L: 563
			var3 = var2; // L: 564
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 567
			if (var5 == null) { // L: 568
				var3 = var2; // L: 569
			} else {
				var3 = (String)var5.obj; // L: 572
			}
		}

		return var3; // L: 574
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1009297979"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 578
			if (this.shiftClickIndex >= 0) { // L: 579
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex * -301597175 * -822939591 : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 580
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-340446903"
	)
	boolean method3722() {
		return this.recolorTo != null; // L: 595
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1275094150"
	)
	boolean method3708() {
		return this.retextureTo != null; // L: 599
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)Lky;",
		garbageValue = "1784601570"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = class127.getWidget(var0);
		if (var1 == -1) { // L: 240
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null; // L: 241
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "796340469"
	)
	static final boolean method3771(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 226
		Buffer var4 = new Buffer(var0); // L: 227
		int var5 = -1; // L: 228

		label70:
		while (true) {
			int var6 = var4.method7743(); // L: 230
			if (var6 == 0) { // L: 231
				return var3; // L: 262
			}

			var5 += var6; // L: 232
			int var7 = 0; // L: 233
			boolean var8 = false; // L: 234

			while (true) {
				int var9;
				while (!var8) { // L: 236
					var9 = var4.readUShortSmart(); // L: 242
					if (var9 == 0) { // L: 243
						continue label70;
					}

					var7 += var9 - 1; // L: 244
					int var10 = var7 & 63; // L: 245
					int var11 = var7 >> 6 & 63; // L: 246
					int var12 = var4.readUnsignedByte() >> 2; // L: 247
					int var13 = var11 + var1; // L: 248
					int var14 = var10 + var2; // L: 249
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 250
						ObjectComposition var15 = class146.getObjectDefinition(var5); // L: 251
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 252
							if (!var15.needsModelFiles()) { // L: 253
								++Client.field558; // L: 254
								var3 = false; // L: 255
							}

							var8 = true; // L: 257
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 237
				if (var9 == 0) { // L: 238
					break;
				}

				var4.readUnsignedByte(); // L: 239
			}
		}
	}
}
