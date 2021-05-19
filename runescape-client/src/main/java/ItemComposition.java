import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 547633189
	)
	@Export("id")
	public int id;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1266178465
	)
	@Export("model")
	int model;
	@ObfuscatedName("a")
	@Export("name")
	public String name;
	@ObfuscatedName("e")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("d")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("u")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("m")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 483565977
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1616193781
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 50079583
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 309959763
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -341173427
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -565964941
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -619330899
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 279752497
	)
	@Export("price")
	public int price;
	@ObfuscatedName("ao")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("aj")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("aw")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1461867551
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2021927303
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 906728493
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -116866817
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 326211461
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2000061499
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 85695415
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -10248853
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1127357827
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1899931167
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -291882105
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 80586719
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -935374551
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("az")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("aq")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1859432357
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 328279449
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1093690633
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -52556217
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1405177909
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -173880273
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1352036525
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 2087677201
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bb")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -646463005
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -569756661
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 93657053
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1039838991
	)
	@Export("placeholderTemplate")
	public int placeholderTemplate;

	static {
		ItemDefinition_cached = new EvictingDualNodeHashTable(64);
		ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50);
		ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200);
	}

	ItemComposition() {
		this.name = "null";
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-478531714"
	)
	@Export("post")
	void post() {
	} // L: 123

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "1"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lnk;II)V",
		garbageValue = "-1644464908"
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
				this.params = HealthBar.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 216

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lez;Lez;I)V",
		garbageValue = "-132004885"
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lez;Lez;I)V",
		garbageValue = "1563324491"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lez;Lez;I)V",
		garbageValue = "86533098"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Lgk;",
		garbageValue = "-1124224184"
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
				return Strings.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(FloorDecoration.ItemDefinition_modelArchive, this.model, 0); // L: 296
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lgj;",
		garbageValue = "1922187853"
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
				return Strings.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id); // L: 320
		if (var5 != null) { // L: 321
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(FloorDecoration.ItemDefinition_modelArchive, this.model, 0); // L: 322
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Lez;",
		garbageValue = "-1165831963"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 342
			int var2 = -1; // L: 343

			for (int var3 = 0; var3 < 10; ++var3) { // L: 344
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 345
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 347
				return Strings.ItemDefinition_get(var2);
			}
		}

		return this; // L: 349
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1362289585"
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
			if (!FloorDecoration.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 437
				var5 = false;
			}

			if (var3 != -1 && !FloorDecoration.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 438
				var5 = false;
			}

			if (var4 != -1 && !FloorDecoration.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) { // L: 439
				var5 = false;
			}

			return var5; // L: 440
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lgk;",
		garbageValue = "-68"
	)
	public final ModelData method3026(boolean var1) {
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
			ModelData var5 = ModelData.ModelData_get(FloorDecoration.ItemDefinition_modelArchive, var2, 0); // L: 453
			if (var3 != -1) { // L: 454
				ModelData var6 = ModelData.ModelData_get(FloorDecoration.ItemDefinition_modelArchive, var3, 0); // L: 455
				if (var4 != -1) { // L: 456
					ModelData var7 = ModelData.ModelData_get(FloorDecoration.ItemDefinition_modelArchive, var4, 0); // L: 457
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-3"
	)
	public final boolean method2959(boolean var1) {
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
			if (!FloorDecoration.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 490
				var4 = false;
			}

			if (var3 != -1 && !FloorDecoration.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 491
				var4 = false;
			}

			return var4; // L: 492
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lgk;",
		garbageValue = "-1602050368"
	)
	public final ModelData method2950(boolean var1) {
		int var2 = this.maleHeadModel; // L: 496
		int var3 = this.maleHeadModel2; // L: 497
		if (var1) { // L: 498
			var2 = this.femaleHeadModel; // L: 499
			var3 = this.femaleHeadModel2; // L: 500
		}

		if (var2 == -1) { // L: 502
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(FloorDecoration.ItemDefinition_modelArchive, var2, 0); // L: 503
			if (var3 != -1) { // L: 504
				ModelData var5 = ModelData.ModelData_get(FloorDecoration.ItemDefinition_modelArchive, var3, 0); // L: 505
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1395652903"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return GraphicsObject.method1937(this.params, var1, var2); // L: 523
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-18910024"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return Varcs.method2326(this.params, var1, var2); // L: 527
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 531
			if (this.shiftClickIndex >= 0) { // L: 532
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex * -1732761633 * 1461867551 : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 533
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "71"
	)
	boolean method2964() {
		return this.recolorTo != null; // L: 552
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "102"
	)
	boolean method2965() {
		return this.retextureTo != null; // L: 556
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lci;",
		garbageValue = "2018073249"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = class22.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = class25.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-509097744"
	)
	static final void method3006() {
		int var0 = Players.Players_count; // L: 4019
		int[] var1 = Players.Players_indices; // L: 4020

		for (int var2 = 0; var2 < var0; ++var2) { // L: 4021
			Player var3 = Client.players[var1[var2]]; // L: 4022
			if (var3 != null) { // L: 4023
				class35.updateActorSequence(var3, 1); // L: 4024
			}
		}

	} // L: 4027

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-2102409671"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class5.scene.getBoundaryObjectTag(var0, var1, var2); // L: 5706
		int var7;
		int var8;
		int var9;
		int var10;
		int var13;
		int var14;
		if (var5 != 0L) { // L: 5707
			var7 = class5.scene.getObjectFlags(var0, var1, var2, var5); // L: 5708
			var8 = var7 >> 6 & 3; // L: 5709
			var9 = var7 & 31; // L: 5710
			var10 = var3; // L: 5711
			boolean var11 = 0L != var5 && !WorldMapEvent.method3714(var5); // L: 5714
			if (var11) { // L: 5716
				var10 = var4;
			}

			int[] var12 = UserComparator8.sceneMinimapSprite.pixels; // L: 5717
			var13 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5718
			var14 = class6.Entity_unpackID(var5); // L: 5719
			ObjectComposition var15 = AttackOption.getObjectDefinition(var14); // L: 5720
			if (var15.mapSceneId != -1) { // L: 5721
				IndexedSprite var16 = class23.mapSceneSprites[var15.mapSceneId]; // L: 5722
				if (var16 != null) { // L: 5723
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2; // L: 5724
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2; // L: 5725
					var16.drawAt(var17 + var1 * 4 + 48, (104 - var2 - var15.sizeY) * 4 + var18 + 48); // L: 5726
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 5730
					if (var8 == 0) { // L: 5731
						var12[var13] = var10; // L: 5732
						var12[var13 + 512] = var10; // L: 5733
						var12[var13 + 1024] = var10; // L: 5734
						var12[var13 + 1536] = var10; // L: 5735
					} else if (var8 == 1) { // L: 5737
						var12[var13] = var10; // L: 5738
						var12[var13 + 1] = var10; // L: 5739
						var12[var13 + 2] = var10; // L: 5740
						var12[var13 + 3] = var10; // L: 5741
					} else if (var8 == 2) { // L: 5743
						var12[var13 + 3] = var10; // L: 5744
						var12[var13 + 512 + 3] = var10; // L: 5745
						var12[var13 + 1024 + 3] = var10; // L: 5746
						var12[var13 + 1536 + 3] = var10; // L: 5747
					} else if (var8 == 3) { // L: 5749
						var12[var13 + 1536] = var10; // L: 5750
						var12[var13 + 1536 + 1] = var10; // L: 5751
						var12[var13 + 1536 + 2] = var10; // L: 5752
						var12[var13 + 1536 + 3] = var10; // L: 5753
					}
				}

				if (var9 == 3) { // L: 5756
					if (var8 == 0) { // L: 5757
						var12[var13] = var10;
					} else if (var8 == 1) { // L: 5758
						var12[var13 + 3] = var10;
					} else if (var8 == 2) { // L: 5759
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 5760
						var12[var13 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 5762
					if (var8 == 3) { // L: 5763
						var12[var13] = var10; // L: 5764
						var12[var13 + 512] = var10; // L: 5765
						var12[var13 + 1024] = var10; // L: 5766
						var12[var13 + 1536] = var10; // L: 5767
					} else if (var8 == 0) { // L: 5769
						var12[var13] = var10; // L: 5770
						var12[var13 + 1] = var10; // L: 5771
						var12[var13 + 2] = var10; // L: 5772
						var12[var13 + 3] = var10; // L: 5773
					} else if (var8 == 1) { // L: 5775
						var12[var13 + 3] = var10; // L: 5776
						var12[var13 + 512 + 3] = var10; // L: 5777
						var12[var13 + 1024 + 3] = var10; // L: 5778
						var12[var13 + 1536 + 3] = var10; // L: 5779
					} else if (var8 == 2) { // L: 5781
						var12[var13 + 1536] = var10; // L: 5782
						var12[var13 + 1536 + 1] = var10; // L: 5783
						var12[var13 + 1536 + 2] = var10; // L: 5784
						var12[var13 + 1536 + 3] = var10; // L: 5785
					}
				}
			}
		}

		var5 = class5.scene.getGameObjectTag(var0, var1, var2); // L: 5790
		if (0L != var5) { // L: 5791
			var7 = class5.scene.getObjectFlags(var0, var1, var2, var5); // L: 5792
			var8 = var7 >> 6 & 3; // L: 5793
			var9 = var7 & 31; // L: 5794
			var10 = class6.Entity_unpackID(var5); // L: 5795
			ObjectComposition var19 = AttackOption.getObjectDefinition(var10); // L: 5796
			if (var19.mapSceneId != -1) { // L: 5797
				IndexedSprite var26 = class23.mapSceneSprites[var19.mapSceneId]; // L: 5798
				if (var26 != null) { // L: 5799
					var13 = (var19.sizeX * 4 - var26.subWidth) / 2; // L: 5800
					var14 = (var19.sizeY * 4 - var26.subHeight) / 2; // L: 5801
					var26.drawAt(var1 * 4 + var13 + 48, var14 + (104 - var2 - var19.sizeY) * 4 + 48); // L: 5802
				}
			} else if (var9 == 9) { // L: 5805
				int var20 = 15658734; // L: 5806
				boolean var27 = 0L != var5 && !WorldMapEvent.method3714(var5); // L: 5809
				if (var27) { // L: 5811
					var20 = 15597568;
				}

				int[] var21 = UserComparator8.sceneMinimapSprite.pixels; // L: 5812
				int var22 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5813
				if (var8 != 0 && var8 != 2) { // L: 5814
					var21[var22] = var20; // L: 5821
					var21[var22 + 1 + 512] = var20; // L: 5822
					var21[var22 + 1024 + 2] = var20; // L: 5823
					var21[var22 + 1536 + 3] = var20; // L: 5824
				} else {
					var21[var22 + 1536] = var20; // L: 5815
					var21[var22 + 1 + 1024] = var20; // L: 5816
					var21[var22 + 512 + 2] = var20; // L: 5817
					var21[var22 + 3] = var20; // L: 5818
				}
			}
		}

		var5 = class5.scene.getFloorDecorationTag(var0, var1, var2); // L: 5828
		if (var5 != 0L) { // L: 5829
			var7 = class6.Entity_unpackID(var5); // L: 5830
			ObjectComposition var23 = AttackOption.getObjectDefinition(var7); // L: 5831
			if (var23.mapSceneId != -1) { // L: 5832
				IndexedSprite var24 = class23.mapSceneSprites[var23.mapSceneId]; // L: 5833
				if (var24 != null) { // L: 5834
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2; // L: 5835
					int var25 = (var23.sizeY * 4 - var24.subHeight) / 2; // L: 5836
					var24.drawAt(var1 * 4 + var10 + 48, var25 + (104 - var2 - var23.sizeY) * 4 + 48); // L: 5837
				}
			}
		}

	} // L: 5841
}
