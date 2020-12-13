import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("ItemDefinition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("p")
	@Export("ItemDefinition_inMembersWorld")
	static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("ItemDefinition_cached")
	static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("ItemDefinition_cachedModels")
	static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1664014825
	)
	@Export("id")
	public int id;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1542603925
	)
	@Export("model")
	int model;
	@ObfuscatedName("f")
	@Export("name")
	public String name;
	@ObfuscatedName("a")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("b")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("y")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("r")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1249863743
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 378039335
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1811336517
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1318527433
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 283491883
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -2031030215
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1485594721
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1502595169
	)
	@Export("price")
	public int price;
	@ObfuscatedName("ax")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("ag")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("au")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -38561917
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1077212297
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2036756411
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -68521997
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1318898035
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -77073097
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1101903295
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1577350627
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -888895899
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -461468775
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -327288721
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1741123647
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1501910565
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("ai")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("al")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1267846609
	)
	@Export("note")
	public int note;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -582464211
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -142471915
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1969283265
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -840638399
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -774071987
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1805763539
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -296565947
	)
	@Export("team")
	public int team;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bl")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1768279497
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1788707457
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1260522137
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 483984813
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-617836008"
	)
	@Export("post")
	void post() {
	} // L: 123

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "2011141659"
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lkj;II)V",
		garbageValue = "1800832423"
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
				this.params = NetSocket.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 216

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljq;Ljq;I)V",
		garbageValue = "1371211432"
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljq;Ljq;I)V",
		garbageValue = "-1959177502"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljq;Ljq;I)V",
		garbageValue = "312275833"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Les;",
		garbageValue = "928211522"
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
				return SecureRandomCallable.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(VertexNormal.ItemDefinition_modelArchive, this.model, 0); // L: 296
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Leh;",
		garbageValue = "893521551"
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
				return SecureRandomCallable.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id); // L: 320
		if (var5 != null) { // L: 321
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(VertexNormal.ItemDefinition_modelArchive, this.model, 0); // L: 322
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)Ljq;",
		garbageValue = "-1807857103"
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
				return SecureRandomCallable.ItemDefinition_get(var2);
			}
		}

		return this; // L: 349
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZS)Z",
		garbageValue = "30323"
	)
	@Export("hasNoValidModel")
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
			if (!VertexNormal.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 437
				var5 = false;
			}

			if (var3 != -1 && !VertexNormal.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 438
				var5 = false;
			}

			if (var4 != -1 && !VertexNormal.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) { // L: 439
				var5 = false;
			}

			return var5; // L: 440
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ZI)Les;",
		garbageValue = "-496299107"
	)
	public final ModelData method4669(boolean var1) {
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
			ModelData var5 = ModelData.ModelData_get(VertexNormal.ItemDefinition_modelArchive, var2, 0); // L: 453
			if (var3 != -1) { // L: 454
				ModelData var6 = ModelData.ModelData_get(VertexNormal.ItemDefinition_modelArchive, var3, 0); // L: 455
				if (var4 != -1) { // L: 456
					ModelData var7 = ModelData.ModelData_get(VertexNormal.ItemDefinition_modelArchive, var4, 0); // L: 457
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-128"
	)
	public final boolean method4660(boolean var1) {
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
			if (!VertexNormal.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 490
				var4 = false;
			}

			if (var3 != -1 && !VertexNormal.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 491
				var4 = false;
			}

			return var4; // L: 492
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ZI)Les;",
		garbageValue = "1268940833"
	)
	public final ModelData method4671(boolean var1) {
		int var2 = this.maleHeadModel; // L: 496
		int var3 = this.maleHeadModel2; // L: 497
		if (var1) { // L: 498
			var2 = this.femaleHeadModel; // L: 499
			var3 = this.femaleHeadModel2; // L: 500
		}

		if (var2 == -1) { // L: 502
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(VertexNormal.ItemDefinition_modelArchive, var2, 0); // L: 503
			if (var3 != -1) { // L: 504
				ModelData var5 = ModelData.ModelData_get(VertexNormal.ItemDefinition_modelArchive, var3, 0); // L: 505
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
		descriptor = "(IIB)I",
		garbageValue = "-79"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 524
		int var3;
		if (var4 == null) { // L: 526
			var3 = var2; // L: 527
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 530
			if (var5 == null) { // L: 531
				var3 = var2; // L: 532
			} else {
				var3 = var5.integer; // L: 535
			}
		}

		return var3; // L: 537
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "37"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 542
		String var3;
		if (var4 == null) { // L: 544
			var3 = var2; // L: 545
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 548
			if (var5 == null) { // L: 549
				var3 = var2; // L: 550
			} else {
				var3 = (String)var5.obj; // L: 553
			}
		}

		return var3; // L: 555
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "32767"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 559
			if (this.shiftClickIndex >= 0) { // L: 560
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex * 1648471851 * -38561917 : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 561
			}
		} else {
			return -1;
		}
	}
}
