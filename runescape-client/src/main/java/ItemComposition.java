import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("ItemDefinition_archive")
	public static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("ItemDefinition_modelArchive")
	public static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("ItemDefinition_cached")
	static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("ItemDefinition_cachedModels")
	static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("ItemDefinition_cachedSprites")
	static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1188742133
	)
	@Export("id")
	public int id;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1954098135
	)
	@Export("model")
	int model;
	@ObfuscatedName("g")
	@Export("name")
	public String name;
	@ObfuscatedName("x")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("n")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("e")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("h")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 368611487
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1716239229
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 491486855
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 487766987
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1027973527
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1363843995
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1771117007
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 472358963
	)
	@Export("price")
	public int price;
	@ObfuscatedName("am")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("ac")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("ab")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -240268281
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1720153193
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 314982159
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1129787177
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1717071033
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -5500123
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -942281181
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1391389777
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 915648219
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1950888251
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1053389309
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 528440307
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 737797573
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("ao")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("av")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -266010117
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1832426705
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1030665223
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1511070871
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1052019651
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 85687709
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -708607869
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -68016555
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bc")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 242888211
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1348681369
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -438305337
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 502078061
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "264401627"
	)
	@Export("post")
	void post() {
	} // L: 121

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-1278602927"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 125
			if (var2 == 0) { // L: 126
				return; // L: 129
			}

			this.decodeNext(var1, var2); // L: 127
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "-849258207"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 132
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 133
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 134
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 135
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 136
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 137
			this.offsetX2d = var1.readUnsignedShort(); // L: 138
			if (this.offsetX2d > 32767) { // L: 139
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) { // L: 141
			this.offsetY2d = var1.readUnsignedShort(); // L: 142
			if (this.offsetY2d > 32767) { // L: 143
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) { // L: 145
			var1.readStringCp1252NullTerminated(); // L: 146
		} else if (var2 == 11) { // L: 148
			this.isStackable = 1;
		} else if (var2 == 12) { // L: 149
			this.price = var1.readInt();
		} else if (var2 == 16) { // L: 150
			this.isMembersOnly = true;
		} else if (var2 == 23) { // L: 151
			this.maleModel = var1.readUnsignedShort(); // L: 152
			this.maleOffset = var1.readUnsignedByte(); // L: 153
		} else if (var2 == 24) { // L: 155
			this.maleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) { // L: 156
			this.femaleModel = var1.readUnsignedShort(); // L: 157
			this.femaleOffset = var1.readUnsignedByte(); // L: 158
		} else if (var2 == 26) { // L: 160
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 >= 30 && var2 < 35) { // L: 161
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 162
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 163
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) { // L: 165
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 166
				var3 = var1.readUnsignedByte(); // L: 167
				this.recolorFrom = new short[var3]; // L: 168
				this.recolorTo = new short[var3]; // L: 169

				for (var4 = 0; var4 < var3; ++var4) { // L: 170
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 171
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 172
				}
			} else if (var2 == 41) { // L: 175
				var3 = var1.readUnsignedByte(); // L: 176
				this.retextureFrom = new short[var3]; // L: 177
				this.retextureTo = new short[var3]; // L: 178

				for (var4 = 0; var4 < var3; ++var4) { // L: 179
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 180
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 181
				}
			} else if (var2 == 42) { // L: 184
				this.shiftClickIndex = var1.readByte(); // L: 185
			} else if (var2 == 65) { // L: 187
				this.isTradable = true;
			} else if (var2 == 78) { // L: 188
				this.maleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) { // L: 189
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 90) { // L: 190
				this.maleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 91) { // L: 191
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 92) { // L: 192
				this.maleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 93) { // L: 193
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 94) { // L: 194
				var1.readUnsignedShort(); // L: 195
			} else if (var2 == 95) { // L: 197
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) { // L: 198
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) { // L: 199
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) { // L: 200
				if (this.countobj == null) { // L: 201
					this.countobj = new int[10]; // L: 202
					this.countco = new int[10]; // L: 203
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort(); // L: 205
				this.countco[var2 - 100] = var1.readUnsignedShort(); // L: 206
			} else if (var2 == 110) { // L: 208
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) { // L: 209
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) { // L: 210
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) { // L: 211
				this.ambient = var1.readByte();
			} else if (var2 == 114) { // L: 212
				this.contrast = var1.readByte() * 5;
			} else if (var2 == 115) { // L: 213
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) { // L: 214
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) { // L: 215
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) { // L: 216
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) { // L: 217
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) { // L: 218
				this.params = JagexCache.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 220

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lgl;Lgl;I)V",
		garbageValue = "-279950936"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 223
		this.zoom2d = var1.zoom2d; // L: 224
		this.xan2d = var1.xan2d; // L: 225
		this.yan2d = var1.yan2d; // L: 226
		this.zan2d = var1.zan2d; // L: 227
		this.offsetX2d = var1.offsetX2d; // L: 228
		this.offsetY2d = var1.offsetY2d; // L: 229
		this.recolorFrom = var1.recolorFrom; // L: 230
		this.recolorTo = var1.recolorTo; // L: 231
		this.retextureFrom = var1.retextureFrom; // L: 232
		this.retextureTo = var1.retextureTo; // L: 233
		this.name = var2.name; // L: 234
		this.isMembersOnly = var2.isMembersOnly; // L: 235
		this.price = var2.price; // L: 236
		this.isStackable = 1; // L: 237
	} // L: 238

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lgl;Lgl;I)V",
		garbageValue = "1099731661"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 241
		this.zoom2d = var1.zoom2d; // L: 242
		this.xan2d = var1.xan2d; // L: 243
		this.yan2d = var1.yan2d; // L: 244
		this.zan2d = var1.zan2d; // L: 245
		this.offsetX2d = var1.offsetX2d; // L: 246
		this.offsetY2d = var1.offsetY2d; // L: 247
		this.recolorFrom = var2.recolorFrom; // L: 248
		this.recolorTo = var2.recolorTo; // L: 249
		this.retextureFrom = var2.retextureFrom; // L: 250
		this.retextureTo = var2.retextureTo; // L: 251
		this.name = var2.name; // L: 252
		this.isMembersOnly = var2.isMembersOnly; // L: 253
		this.isStackable = var2.isStackable; // L: 254
		this.maleModel = var2.maleModel; // L: 255
		this.maleModel1 = var2.maleModel1; // L: 256
		this.maleModel2 = var2.maleModel2; // L: 257
		this.femaleModel = var2.femaleModel; // L: 258
		this.femaleModel1 = var2.femaleModel1; // L: 259
		this.femaleModel2 = var2.femaleModel2; // L: 260
		this.maleHeadModel = var2.maleHeadModel; // L: 261
		this.maleHeadModel2 = var2.maleHeadModel2; // L: 262
		this.femaleHeadModel = var2.femaleHeadModel; // L: 263
		this.femaleHeadModel2 = var2.femaleHeadModel2; // L: 264
		this.team = var2.team; // L: 265
		this.groundActions = var2.groundActions; // L: 266
		this.inventoryActions = new String[5]; // L: 267
		if (var2.inventoryActions != null) { // L: 268
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard"; // L: 269
		this.price = 0; // L: 270
	} // L: 271

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lgl;Lgl;I)V",
		garbageValue = "-1484534743"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 274
		this.zoom2d = var1.zoom2d; // L: 275
		this.xan2d = var1.xan2d; // L: 276
		this.yan2d = var1.yan2d; // L: 277
		this.zan2d = var1.zan2d; // L: 278
		this.offsetX2d = var1.offsetX2d; // L: 279
		this.offsetY2d = var1.offsetY2d; // L: 280
		this.recolorFrom = var1.recolorFrom; // L: 281
		this.recolorTo = var1.recolorTo; // L: 282
		this.retextureFrom = var1.retextureFrom; // L: 283
		this.retextureTo = var1.retextureTo; // L: 284
		this.isStackable = var1.isStackable; // L: 285
		this.name = var2.name; // L: 286
		this.price = 0; // L: 287
		this.isMembersOnly = false; // L: 288
		this.isTradable = false; // L: 289
	} // L: 290

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lgs;",
		garbageValue = "101445561"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) { // L: 293
			int var2 = -1; // L: 294

			for (var3 = 0; var3 < 10; ++var3) { // L: 295
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 296
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 298
				return FileSystem.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0); // L: 300
		if (var4 == null) { // L: 301
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 302
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) { // L: 303
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 304
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 305
				}
			}

			if (this.retextureFrom != null) { // L: 308
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 309
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 310
				}
			}

			return var4; // L: 313
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)Lhv;",
		garbageValue = "-1179762647"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 317
			int var2 = -1; // L: 318

			for (int var3 = 0; var3 < 10; ++var3) { // L: 319
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 320
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 322
				return FileSystem.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id); // L: 324
		if (var5 != null) { // L: 325
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0); // L: 326
			if (var6 == null) { // L: 327
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 328
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) { // L: 329
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 330
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 331
					}
				}

				if (this.retextureFrom != null) { // L: 334
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 335
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 336
					}
				}

				var5 = var6.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 339
				var5.isSingleTile = true; // L: 340
				ItemDefinition_cachedModels.put(var5, (long)this.id); // L: 341
				return var5; // L: 342
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lgl;",
		garbageValue = "-1139182160"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 346
			int var2 = -1; // L: 347

			for (int var3 = 0; var3 < 10; ++var3) { // L: 348
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3]; // L: 349
				}
			}

			if (var2 != -1) { // L: 351
				return FileSystem.ItemDefinition_get(var2);
			}
		}

		return this; // L: 353
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1443965547"
	)
	@Export("hasNoValidModel")
	public final boolean hasNoValidModel(boolean var1) {
		int var2 = this.maleModel; // L: 431
		int var3 = this.maleModel1; // L: 432
		int var4 = this.maleModel2; // L: 433
		if (var1) { // L: 434
			var2 = this.femaleModel; // L: 435
			var3 = this.femaleModel1; // L: 436
			var4 = this.femaleModel2; // L: 437
		}

		if (var2 == -1) { // L: 439
			return true;
		} else {
			boolean var5 = true; // L: 440
			if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 441
				var5 = false;
			}

			if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 442
				var5 = false;
			}

			if (var4 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var4, 0)) { // L: 443
				var5 = false;
			}

			return var5; // L: 444
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lgs;",
		garbageValue = "-1175782227"
	)
	public final ModelData method3630(boolean var1) {
		int var2 = this.maleModel; // L: 448
		int var3 = this.maleModel1; // L: 449
		int var4 = this.maleModel2; // L: 450
		if (var1) { // L: 451
			var2 = this.femaleModel; // L: 452
			var3 = this.femaleModel1; // L: 453
			var4 = this.femaleModel2; // L: 454
		}

		if (var2 == -1) { // L: 456
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0); // L: 457
			if (var3 != -1) { // L: 458
				ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0); // L: 459
				if (var4 != -1) { // L: 460
					ModelData var7 = ModelData.ModelData_get(ItemDefinition_modelArchive, var4, 0); // L: 461
					ModelData[] var8 = new ModelData[]{var5, var6, var7}; // L: 462
					var5 = new ModelData(var8, 3); // L: 463
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6}; // L: 466
					var5 = new ModelData(var10, 2); // L: 467
				}
			}

			if (!var1 && this.maleOffset != 0) { // L: 470
				var5.changeOffset(0, this.maleOffset, 0);
			}

			if (var1 && this.femaleOffset != 0) { // L: 471
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 472
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 473
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 474
				}
			}

			if (this.retextureFrom != null) { // L: 477
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 478
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 479
				}
			}

			return var5; // L: 482
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1892090883"
	)
	public final boolean method3631(boolean var1) {
		int var2 = this.maleHeadModel; // L: 486
		int var3 = this.maleHeadModel2; // L: 487
		if (var1) { // L: 488
			var2 = this.femaleHeadModel; // L: 489
			var3 = this.femaleHeadModel2; // L: 490
		}

		if (var2 == -1) { // L: 492
			return true;
		} else {
			boolean var4 = true; // L: 493
			if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 494
				var4 = false;
			}

			if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 495
				var4 = false;
			}

			return var4; // L: 496
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lgs;",
		garbageValue = "104327416"
	)
	public final ModelData method3632(boolean var1) {
		int var2 = this.maleHeadModel; // L: 500
		int var3 = this.maleHeadModel2; // L: 501
		if (var1) { // L: 502
			var2 = this.femaleHeadModel; // L: 503
			var3 = this.femaleHeadModel2; // L: 504
		}

		if (var2 == -1) { // L: 506
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0); // L: 507
			if (var3 != -1) { // L: 508
				ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0); // L: 509
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 510
				var4 = new ModelData(var6, 2); // L: 511
			}

			int var7;
			if (this.recolorFrom != null) { // L: 513
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 514
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 515
				}
			}

			if (this.retextureFrom != null) { // L: 518
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 519
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 520
				}
			}

			return var4; // L: 523
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "919318771"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class154.method3061(this.params, var1, var2); // L: 527
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1359471103"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return AttackOption.method2393(this.params, var1, var2); // L: 531
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1911161314"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 535
			if (this.shiftClickIndex >= 0) { // L: 536
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex * -240268281 * 1170727351 : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 537
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-195951590"
	)
	boolean method3636() {
		return this.recolorTo != null; // L: 551
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "27"
	)
	boolean method3637() {
		return this.retextureTo != null; // L: 555
	}
}
