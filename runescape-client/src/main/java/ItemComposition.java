import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("ItemDefinition_cached")
	static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("ItemDefinition_cachedModels")
	static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("ItemDefinition_cachedSprites")
	static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1267309443
	)
	@Export("id")
	public int id;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 424670907
	)
	@Export("model")
	int model;
	@ObfuscatedName("r")
	@Export("name")
	public String name;
	@ObfuscatedName("q")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("t")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("v")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("x")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2040689491
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2104208593
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 742539393
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -489639743
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1453222401
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1519618963
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2026182297
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -145355023
	)
	@Export("price")
	public int price;
	@ObfuscatedName("am")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("ag")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("aq")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 807586131
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -562988651
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 588950801
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1836778797
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 905532905
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 259604909
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1638435767
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1786764469
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1184429917
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1757489403
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -882532737
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1508147737
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1263054825
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("aa")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("al")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -606925415
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1122661851
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 128957167
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 236584503
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1596577521
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -784954209
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1528979205
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 314111875
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bb")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1614992297
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1996159711
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -281222303
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -103299683
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1343555162"
	)
	@Export("post")
	void post() {
	} // L: 123

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "175424411"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 127
			if (var2 == 0) { // L: 128
				return; // L: 131
			}

			this.decodeNext(var1, var2); // L: 129
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lnu;II)V",
		garbageValue = "2077895253"
	)
	@Export("decodeNext")
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
			} else if (var2 == 98) {
				this.noteTemplate = var1.readUnsignedShort(); // L: 195
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
				this.params = class105.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 216

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;I)V",
		garbageValue = "-653906195"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;B)V",
		garbageValue = "77"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;B)V",
		garbageValue = "26"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lfs;",
		garbageValue = "427827068"
	)
	@Export("getModelData")
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
				return class23.ItemDefinition_get(var2).getModelData(1);
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgv;",
		garbageValue = "100"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 313
			int var2 = -1; // L: 314

			for (int var3 = 0; var3 < 10; ++var3) { // L: 315
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 316
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 318
				return class23.ItemDefinition_get(var2).getModel(1);
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Lko;",
		garbageValue = "-922143531"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 342
			int var2 = -1; // L: 343

			for (int var3 = 0; var3 < 10; ++var3) { // L: 344
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3]; // L: 345
				}
			}

			if (var2 != -1) { // L: 347
				return class23.ItemDefinition_get(var2);
			}
		}

		return this; // L: 349
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1651986730"
	)
	@Export("hasNoValidModel")
	public final boolean hasNoValidModel(boolean var1) {
		int var2 = this.maleModel; // L: 434
		int var3 = this.maleModel1; // L: 435
		int var4 = this.maleModel2; // L: 436
		if (var1) { // L: 437
			var2 = this.femaleModel; // L: 438
			var3 = this.femaleModel1; // L: 439
			var4 = this.femaleModel2; // L: 440
		}

		if (var2 == -1) { // L: 442
			return true;
		} else {
			boolean var5 = true; // L: 443
			if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 444
				var5 = false;
			}

			if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 445
				var5 = false;
			}

			if (var4 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var4, 0)) { // L: 446
				var5 = false;
			}

			return var5; // L: 447
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lfs;",
		garbageValue = "-1860444775"
	)
	public final ModelData method5280(boolean var1) {
		int var2 = this.maleModel; // L: 451
		int var3 = this.maleModel1; // L: 452
		int var4 = this.maleModel2; // L: 453
		if (var1) { // L: 454
			var2 = this.femaleModel; // L: 455
			var3 = this.femaleModel1; // L: 456
			var4 = this.femaleModel2; // L: 457
		}

		if (var2 == -1) { // L: 459
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0); // L: 460
			if (var3 != -1) { // L: 461
				ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0); // L: 462
				if (var4 != -1) { // L: 463
					ModelData var7 = ModelData.ModelData_get(ItemDefinition_modelArchive, var4, 0); // L: 464
					ModelData[] var8 = new ModelData[]{var5, var6, var7}; // L: 465
					var5 = new ModelData(var8, 3); // L: 466
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6}; // L: 469
					var5 = new ModelData(var10, 2); // L: 470
				}
			}

			if (!var1 && this.maleOffset != 0) { // L: 473
				var5.changeOffset(0, this.maleOffset, 0);
			}

			if (var1 && this.femaleOffset != 0) { // L: 474
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 475
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 476
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 477
				}
			}

			if (this.retextureFrom != null) { // L: 480
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 481
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 482
				}
			}

			return var5; // L: 485
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "7"
	)
	public final boolean method5237(boolean var1) {
		int var2 = this.maleHeadModel; // L: 489
		int var3 = this.maleHeadModel2; // L: 490
		if (var1) { // L: 491
			var2 = this.femaleHeadModel; // L: 492
			var3 = this.femaleHeadModel2; // L: 493
		}

		if (var2 == -1) { // L: 495
			return true;
		} else {
			boolean var4 = true; // L: 496
			if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 497
				var4 = false;
			}

			if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 498
				var4 = false;
			}

			return var4; // L: 499
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lfs;",
		garbageValue = "1524344527"
	)
	public final ModelData method5238(boolean var1) {
		int var2 = this.maleHeadModel; // L: 503
		int var3 = this.maleHeadModel2; // L: 504
		if (var1) { // L: 505
			var2 = this.femaleHeadModel; // L: 506
			var3 = this.femaleHeadModel2; // L: 507
		}

		if (var2 == -1) { // L: 509
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0); // L: 510
			if (var3 != -1) { // L: 511
				ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0); // L: 512
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 513
				var4 = new ModelData(var6, 2); // L: 514
			}

			int var7;
			if (this.recolorFrom != null) { // L: 516
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 517
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 518
				}
			}

			if (this.retextureFrom != null) { // L: 521
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 522
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 523
				}
			}

			return var4; // L: 526
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "1"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 531
		int var3;
		if (var4 == null) { // L: 533
			var3 = var2; // L: 534
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 537
			if (var5 == null) { // L: 538
				var3 = var2; // L: 539
			} else {
				var3 = var5.integer; // L: 542
			}
		}

		return var3; // L: 544
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)Ljava/lang/String;",
		garbageValue = "-299"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 549
		String var3;
		if (var4 == null) { // L: 551
			var3 = var2; // L: 552
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 555
			if (var5 == null) { // L: 556
				var3 = var2; // L: 557
			} else {
				var3 = (String)var5.obj; // L: 560
			}
		}

		return var3; // L: 562
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "415969206"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 566
			if (this.shiftClickIndex >= 0) { // L: 567
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex * 807586131 * 1487168219 : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 568
			}
		} else {
			return -1;
		}
	}
}
