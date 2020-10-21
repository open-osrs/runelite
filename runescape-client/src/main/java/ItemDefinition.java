import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("ItemDefinition")
public class ItemDefinition extends DualNode {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("ItemDefinition_archive")
	public static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("ItemDefinition_cached")
	static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("ItemDefinition_cachedModels")
	static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 205656235
	)
	@Export("id")
	public int id;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1548040607
	)
	@Export("model")
	int model;
	@ObfuscatedName("r")
	@Export("name")
	public String name;
	@ObfuscatedName("y")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("s")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("j")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("w")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1017963797
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1308967773
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -938843677
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1690291033
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 452833685
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1321777207
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -743597029
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1842645075
	)
	@Export("price")
	public int price;
	@ObfuscatedName("ao")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("af")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("av")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2047863769
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2147145769
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 35198089
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -40962547
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 357069235
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1851359943
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -293226181
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1259301301
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -450828565
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1669818449
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -11483635
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 71110901
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1829168075
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("at")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("as")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 293896329
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -154349243
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1856530467
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1750294835
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1174964603
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1557535821
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1535796637
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 386256383
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bc")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1196685039
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1548503311
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1444215613
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1795160485
	)
	@Export("placeholderTemplate")
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-27945294"
	)
	@Export("post")
	void post() {
	} // L: 115

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkb;B)V",
		garbageValue = "8"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lkb;IB)V",
		garbageValue = "1"
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
				this.params = InvDefinition.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 208

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljk;Ljk;S)V",
		garbageValue = "-24107"
	)
	@Export("genCert")
	void genCert(ItemDefinition var1, ItemDefinition var2) {
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljk;Ljk;I)V",
		garbageValue = "-1330736230"
	)
	@Export("genBought")
	void genBought(ItemDefinition var1, ItemDefinition var2) {
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljk;Ljk;B)V",
		garbageValue = "67"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemDefinition var1, ItemDefinition var2) {
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Len;",
		garbageValue = "-1204595324"
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
				return AbstractWorldMapData.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(UserComparator9.ItemDefinition_modelArchive, this.model, 0); // L: 288
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)Leh;",
		garbageValue = "1180812329"
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
				return AbstractWorldMapData.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id); // L: 312
		if (var5 != null) { // L: 313
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(UserComparator9.ItemDefinition_modelArchive, this.model, 0); // L: 314
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljk;",
		garbageValue = "-89"
	)
	@Export("getCountObj")
	public ItemDefinition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 334
			int var2 = -1; // L: 335

			for (int var3 = 0; var3 < 10; ++var3) { // L: 336
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 337
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 339
				return AbstractWorldMapData.ItemDefinition_get(var2);
			}
		}

		return this; // L: 341
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1324759771"
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
			if (!UserComparator9.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 429
				var5 = false;
			}

			if (var3 != -1 && !UserComparator9.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 430
				var5 = false;
			}

			if (var4 != -1 && !UserComparator9.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) { // L: 431
				var5 = false;
			}

			return var5; // L: 432
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ZI)Len;",
		garbageValue = "-1992916020"
	)
	public final ModelData method4820(boolean var1) {
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
			ModelData var5 = ModelData.ModelData_get(UserComparator9.ItemDefinition_modelArchive, var2, 0); // L: 445
			if (var3 != -1) { // L: 446
				ModelData var6 = ModelData.ModelData_get(UserComparator9.ItemDefinition_modelArchive, var3, 0); // L: 447
				if (var4 != -1) { // L: 448
					ModelData var7 = ModelData.ModelData_get(UserComparator9.ItemDefinition_modelArchive, var4, 0); // L: 449
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "26"
	)
	public final boolean method4809(boolean var1) {
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
			if (!UserComparator9.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 482
				var4 = false;
			}

			if (var3 != -1 && !UserComparator9.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 483
				var4 = false;
			}

			return var4; // L: 484
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZB)Len;",
		garbageValue = "0"
	)
	public final ModelData method4822(boolean var1) {
		int var2 = this.maleHeadModel; // L: 488
		int var3 = this.maleHeadModel2; // L: 489
		if (var1) { // L: 490
			var2 = this.femaleHeadModel; // L: 491
			var3 = this.femaleHeadModel2; // L: 492
		}

		if (var2 == -1) { // L: 494
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(UserComparator9.ItemDefinition_modelArchive, var2, 0); // L: 495
			if (var3 != -1) { // L: 496
				ModelData var5 = ModelData.ModelData_get(UserComparator9.ItemDefinition_modelArchive, var3, 0); // L: 497
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2072202585"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1152059267"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return WorldMapSection0.method307(this.params, var1, var2); // L: 533
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "102"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 537
			if (this.shiftClickIndex >= 0) { // L: 538
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex * 2047863769 * -1595677591 : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 539
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1917575667"
	)
	static void method4874() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11035
			int var1 = var0.group; // L: 11036
			if (ScriptFrame.loadInterface(var1)) { // L: 11037
				boolean var2 = true; // L: 11038
				Widget[] var3 = Widget.Widget_interfaceComponents[var1]; // L: 11039

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 11040
					if (var3[var4] != null) { // L: 11041
						var2 = var3[var4].isIf3; // L: 11042
						break;
					}
				}

				if (!var2) { // L: 11046
					var4 = (int)var0.key; // L: 11047
					Widget var5 = UserComparator4.getWidget(var4); // L: 11048
					if (var5 != null) { // L: 11049
						GrandExchangeOfferOwnWorldComparator.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 11053
}
