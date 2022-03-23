import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1424786403
	)
	@Export("id")
	public int id;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1291049625
	)
	@Export("model")
	int model;
	@ObfuscatedName("s")
	@Export("name")
	public String name;
	@ObfuscatedName("b")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("w")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("a")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("m")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1089547483
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 2132200919
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 414158331
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1333380267
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -23856347
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1059420037
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -255409775
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1263710905
	)
	@Export("price")
	public int price;
	@ObfuscatedName("ay")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("au")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("at")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1456259873
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1418259267
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -743899863
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1028842285
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2010302793
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2125070369
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -347919981
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1552154783
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1453565087
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -825371741
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1673807591
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -237546465
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1334231601
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("al")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("ak")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1260944307
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1173128683
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -960009279
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 660120769
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1619595717
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1280760379
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -653241173
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1399712671
	)
	@Export("team")
	public int team;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bt")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 2142919937
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -97110731
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 511512867
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -399396833
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
		this.shiftClickIndex = -2;
		this.maleModel = -1;
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-40965747"
	)
	@Export("post")
	void post() {
	} // L: 129

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lpd;I)V",
		garbageValue = "-2138867228"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpd;II)V",
		garbageValue = "-1448342708"
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
			} else if (var2 == 249) { // L: 226
				this.params = NetFileRequest.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 228

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lgz;Lgz;I)V",
		garbageValue = "2121998029"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 231
		this.zoom2d = var1.zoom2d; // L: 232
		this.xan2d = var1.xan2d; // L: 233
		this.yan2d = var1.yan2d; // L: 234
		this.zan2d = var1.zan2d; // L: 235
		this.offsetX2d = var1.offsetX2d; // L: 236
		this.offsetY2d = var1.offsetY2d; // L: 237
		this.recolorFrom = var1.recolorFrom; // L: 238
		this.recolorTo = var1.recolorTo; // L: 239
		this.retextureFrom = var1.retextureFrom; // L: 240
		this.retextureTo = var1.retextureTo; // L: 241
		this.name = var2.name; // L: 242
		this.isMembersOnly = var2.isMembersOnly; // L: 243
		this.price = var2.price; // L: 244
		this.isStackable = 1; // L: 245
	} // L: 246

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lgz;Lgz;I)V",
		garbageValue = "1223500684"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 249
		this.zoom2d = var1.zoom2d; // L: 250
		this.xan2d = var1.xan2d; // L: 251
		this.yan2d = var1.yan2d; // L: 252
		this.zan2d = var1.zan2d; // L: 253
		this.offsetX2d = var1.offsetX2d; // L: 254
		this.offsetY2d = var1.offsetY2d; // L: 255
		this.recolorFrom = var2.recolorFrom; // L: 256
		this.recolorTo = var2.recolorTo; // L: 257
		this.retextureFrom = var2.retextureFrom; // L: 258
		this.retextureTo = var2.retextureTo; // L: 259
		this.name = var2.name; // L: 260
		this.isMembersOnly = var2.isMembersOnly; // L: 261
		this.isStackable = var2.isStackable; // L: 262
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lgz;Lgz;I)V",
		garbageValue = "312351702"
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgt;",
		garbageValue = "0"
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
				return class67.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(GameEngine.ItemDefinition_modelArchive, this.model, 0); // L: 308
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhx;",
		garbageValue = "-63"
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
				return class67.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id); // L: 332
		if (var5 != null) { // L: 333
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(GameEngine.ItemDefinition_modelArchive, this.model, 0); // L: 334
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Lgz;",
		garbageValue = "-275581318"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 354
			int var2 = -1; // L: 355

			for (int var3 = 0; var3 < 10; ++var3) { // L: 356
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3]; // L: 357
				}
			}

			if (var2 != -1) { // L: 359
				return class67.ItemDefinition_get(var2);
			}
		}

		return this; // L: 361
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1169753555"
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
			if (!GameEngine.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 456
				var5 = false;
			}

			if (var3 != -1 && !GameEngine.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 457
				var5 = false;
			}

			if (var4 != -1 && !GameEngine.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) { // L: 458
				var5 = false;
			}

			return var5; // L: 459
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lgt;",
		garbageValue = "-116"
	)
	public final ModelData method3693(boolean var1) {
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
			ModelData var5 = ModelData.ModelData_get(GameEngine.ItemDefinition_modelArchive, var2, 0); // L: 472
			if (var3 != -1) { // L: 473
				ModelData var6 = ModelData.ModelData_get(GameEngine.ItemDefinition_modelArchive, var3, 0); // L: 474
				if (var4 != -1) { // L: 475
					ModelData var7 = ModelData.ModelData_get(GameEngine.ItemDefinition_modelArchive, var4, 0); // L: 476
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-2071485201"
	)
	public final boolean method3748(boolean var1) {
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
			if (!GameEngine.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 509
				var4 = false;
			}

			if (var3 != -1 && !GameEngine.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 510
				var4 = false;
			}

			return var4; // L: 511
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lgt;",
		garbageValue = "2006094113"
	)
	public final ModelData method3730(boolean var1) {
		int var2 = this.maleHeadModel; // L: 515
		int var3 = this.maleHeadModel2; // L: 516
		if (var1) { // L: 517
			var2 = this.femaleHeadModel; // L: 518
			var3 = this.femaleHeadModel2; // L: 519
		}

		if (var2 == -1) { // L: 521
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(GameEngine.ItemDefinition_modelArchive, var2, 0); // L: 522
			if (var3 != -1) { // L: 523
				ModelData var5 = ModelData.ModelData_get(GameEngine.ItemDefinition_modelArchive, var3, 0); // L: 524
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1671267558"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return ClanSettings.method2976(this.params, var1, var2); // L: 542
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-464900314"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class19.method315(this.params, var1, var2); // L: 546
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2083279530"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 550
			if (this.shiftClickIndex >= 0) { // L: 551
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex * 1031307489 * 1456259873 : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 552
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-872015802"
	)
	boolean method3763() {
		return this.recolorTo != null; // L: 571
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-21"
	)
	boolean method3711() {
		return this.retextureTo != null; // L: 575
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "183"
	)
	public static void method3764(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0; // L: 51
	} // L: 52

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1435197973"
	)
	static void method3751() {
		int var0 = Players.Players_count; // L: 4294
		int[] var1 = Players.Players_indices; // L: 4295

		for (int var2 = 0; var2 < var0; ++var2) { // L: 4296
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) { // L: 4297
				class166.addPlayerToScene(Client.players[var1[var2]], true); // L: 4298
			}
		}

	} // L: 4300

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(Lcw;I)Z",
		garbageValue = "1004876196"
	)
	static boolean method3706(Player var0) {
		if (Client.drawPlayerNames == 0) { // L: 4438
			return false;
		} else {
			boolean var1;
			if (class19.localPlayer != var0) { // L: 4439
				var1 = (Client.drawPlayerNames & 4) != 0; // L: 4442
				boolean var2 = var1 || FloorDecoration.method3981() && var0.isFriend(); // L: 4444
				if (!var2) { // L: 4445
					boolean var3 = (Client.drawPlayerNames & 2) != 0; // L: 4448
					var2 = var3 && var0.isFriendsChatMember(); // L: 4450
				}

				return var2; // L: 4452
			} else {
				var1 = (Client.drawPlayerNames & 8) != 0; // L: 4457
				return var1; // L: 4459
			}
		}
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "-13"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (MusicPatchNode2.loadInterface(var0)) { // L: 10579
			Varcs.updateInterface(EnumComposition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 10580
		}
	} // L: 10581

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "([Lkn;II)V",
		garbageValue = "-2087809225"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11288
			Widget var3 = var0[var2]; // L: 11289
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class263.isComponentHidden(var3))) { // L: 11290 11291 11292
				int var5;
				if (var3.type == 0) { // L: 11293
					if (!var3.isIf3 && class263.isComponentHidden(var3) && var3 != Player.mousedOverWidgetIf1) { // L: 11294
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 11295
					if (var3.children != null) { // L: 11296
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11297
					if (var4 != null) { // L: 11298
						var5 = var4.group; // L: 11299
						if (MusicPatchNode2.loadInterface(var5)) { // L: 11301
							drawModelComponents(EnumComposition.Widget_interfaceComponents[var5], -1); // L: 11302
						}
					}
				}

				if (var3.type == 6) { // L: 11306
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 11307
						boolean var7 = PacketWriter.runCs1(var3); // L: 11308
						if (var7) { // L: 11310
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 11311
						}

						if (var5 != -1) { // L: 11312
							SequenceDefinition var6 = ItemContainer.SequenceDefinition_get(var5); // L: 11313

							for (var3.modelFrameCycle += Client.field550; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class290.invalidateWidget(var3)) { // L: 11314 11315 11322
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 11316
								++var3.modelFrame; // L: 11317
								if (var3.modelFrame >= var6.frameIds.length) { // L: 11318
									var3.modelFrame -= var6.frameCount; // L: 11319
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 11320
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field3399 != 0 && !var3.isIf3) { // L: 11326
						int var8 = var3.field3399 >> 16; // L: 11327
						var5 = var3.field3399 << 16 >> 16; // L: 11328
						var8 *= Client.field550; // L: 11329
						var5 *= Client.field550; // L: 11330
						var3.modelAngleX = var8 + var3.modelAngleX & 2047; // L: 11331
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 11332
						class290.invalidateWidget(var3); // L: 11333
					}
				}
			}
		}

	} // L: 11337
}
