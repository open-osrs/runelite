import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fn")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 10175285
	)
	@Export("id")
	public int id;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 219671675
	)
	@Export("model")
	int model;
	@ObfuscatedName("p")
	@Export("name")
	public String name;
	@ObfuscatedName("n")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("m")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("d")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("j")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1493883015
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1925466431
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -547177487
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -382410223
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -47110387
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 816442611
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1422910445
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -784364215
	)
	@Export("price")
	public int price;
	@ObfuscatedName("ak")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("av")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("ar")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1209180117
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1113370729
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1910819745
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1412919849
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 424745263
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -380747249
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1659014001
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 555475811
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2069455293
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1357305835
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 78767189
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2117294067
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 744408283
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("an")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("aw")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -419650277
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -693825153
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1296779621
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 40847009
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1854368879
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 924855673
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1830795679
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1781281599
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bx")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1463185163
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -507852577
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -433292947
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 2125854019
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("post")
	void post() {
	} // L: 121

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-1321920139"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "174307131"
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
				this.params = class297.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 220

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Lfn;I)V",
		garbageValue = "-1378586099"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Lfn;B)V",
		garbageValue = "2"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Lfn;I)V",
		garbageValue = "-65024533"
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgq;",
		garbageValue = "-19"
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
				return Client.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(class6.ItemDefinition_modelArchive, this.model, 0); // L: 300
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgf;",
		garbageValue = "1"
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
				return Client.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id); // L: 324
		if (var5 != null) { // L: 325
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(class6.ItemDefinition_modelArchive, this.model, 0); // L: 326
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfn;",
		garbageValue = "39"
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
				return Client.ItemDefinition_get(var2);
			}
		}

		return this; // L: 353
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "29"
	)
	@Export("hasNoValidModel")
	public final boolean hasNoValidModel(boolean var1) {
		int var2 = this.maleModel; // L: 438
		int var3 = this.maleModel1; // L: 439
		int var4 = this.maleModel2; // L: 440
		if (var1) { // L: 441
			var2 = this.femaleModel; // L: 442
			var3 = this.femaleModel1; // L: 443
			var4 = this.femaleModel2; // L: 444
		}

		if (var2 == -1) { // L: 446
			return true;
		} else {
			boolean var5 = true; // L: 447
			if (!class6.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 448
				var5 = false;
			}

			if (var3 != -1 && !class6.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 449
				var5 = false;
			}

			if (var4 != -1 && !class6.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) { // L: 450
				var5 = false;
			}

			return var5; // L: 451
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lgq;",
		garbageValue = "207147464"
	)
	public final ModelData method3519(boolean var1) {
		int var2 = this.maleModel; // L: 455
		int var3 = this.maleModel1; // L: 456
		int var4 = this.maleModel2; // L: 457
		if (var1) { // L: 458
			var2 = this.femaleModel; // L: 459
			var3 = this.femaleModel1; // L: 460
			var4 = this.femaleModel2; // L: 461
		}

		if (var2 == -1) { // L: 463
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(class6.ItemDefinition_modelArchive, var2, 0); // L: 464
			if (var3 != -1) { // L: 465
				ModelData var6 = ModelData.ModelData_get(class6.ItemDefinition_modelArchive, var3, 0); // L: 466
				if (var4 != -1) { // L: 467
					ModelData var7 = ModelData.ModelData_get(class6.ItemDefinition_modelArchive, var4, 0); // L: 468
					ModelData[] var8 = new ModelData[]{var5, var6, var7}; // L: 469
					var5 = new ModelData(var8, 3); // L: 470
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6}; // L: 473
					var5 = new ModelData(var10, 2); // L: 474
				}
			}

			if (!var1 && this.maleOffset != 0) { // L: 477
				var5.changeOffset(0, this.maleOffset, 0);
			}

			if (var1 && this.femaleOffset != 0) { // L: 478
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 479
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 480
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 481
				}
			}

			if (this.retextureFrom != null) { // L: 484
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 485
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 486
				}
			}

			return var5; // L: 489
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-2143174120"
	)
	public final boolean method3509(boolean var1) {
		int var2 = this.maleHeadModel; // L: 493
		int var3 = this.maleHeadModel2; // L: 494
		if (var1) { // L: 495
			var2 = this.femaleHeadModel; // L: 496
			var3 = this.femaleHeadModel2; // L: 497
		}

		if (var2 == -1) { // L: 499
			return true;
		} else {
			boolean var4 = true; // L: 500
			if (!class6.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 501
				var4 = false;
			}

			if (var3 != -1 && !class6.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 502
				var4 = false;
			}

			return var4; // L: 503
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lgq;",
		garbageValue = "-339556470"
	)
	public final ModelData method3521(boolean var1) {
		int var2 = this.maleHeadModel; // L: 507
		int var3 = this.maleHeadModel2; // L: 508
		if (var1) { // L: 509
			var2 = this.femaleHeadModel; // L: 510
			var3 = this.femaleHeadModel2; // L: 511
		}

		if (var2 == -1) { // L: 513
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(class6.ItemDefinition_modelArchive, var2, 0); // L: 514
			if (var3 != -1) { // L: 515
				ModelData var5 = ModelData.ModelData_get(class6.ItemDefinition_modelArchive, var3, 0); // L: 516
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 517
				var4 = new ModelData(var6, 2); // L: 518
			}

			int var7;
			if (this.recolorFrom != null) { // L: 520
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 521
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 522
				}
			}

			if (this.retextureFrom != null) { // L: 525
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 526
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 527
				}
			}

			return var4; // L: 530
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1259064286"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return UserComparator1.method7638(this.params, var1, var2); // L: 534
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1598035032"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class292.method5479(this.params, var1, var2); // L: 538
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "16759"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 542
			if (this.shiftClickIndex >= 0) { // L: 543
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex * 727163261 * 1209180117 : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 544
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-807230920"
	)
	boolean method3525() {
		return this.recolorTo != null; // L: 563
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1719436176"
	)
	boolean method3553() {
		return this.retextureTo != null; // L: 567
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-108"
	)
	static final int method3571(int var0, int var1) {
		if (var0 == -1) { // L: 998
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 999
			if (var1 < 2) {
				var1 = 2; // L: 1000
			} else if (var1 > 126) { // L: 1001
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1002
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "-400703400"
	)
	static int method3572(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3063
			var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 3064
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3065
			Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var3 + var9; // L: 3066
			return 1; // L: 3067
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3069
				BufferedNetSocket.Interpreter_stringStackSize -= 2; // L: 3070
				var3 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize]; // L: 3071
				var4 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize + 1]; // L: 3072
				Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3073
				return 1; // L: 3074
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3076
				var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 3077
				var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3078
				Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var3 + class121.intToString(var9, true); // L: 3079
				return 1; // L: 3080
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3082
				var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 3083
				Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3084
				return 1; // L: 3085
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3087
					var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3088
					long var13 = 86400000L * (11745L + (long)var10); // L: 3089
					Interpreter.Interpreter_calendar.setTime(new Date(var13)); // L: 3090
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3091
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3092
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3093
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3094
					return 1; // L: 3095
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3097
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3105
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3106
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = Integer.toString(var10); // L: 3107
						return 1; // L: 3108
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3110
						BufferedNetSocket.Interpreter_stringStackSize -= 2; // L: 3111
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HitSplatDefinition.method3455(ClanSettings.compareStrings(Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize + 1], class122.clientLanguage)); // L: 3112
						return 1; // L: 3113
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3115
							var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 3116
							Interpreter.Interpreter_intStackSize -= 2; // L: 3117
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3118
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3119
							var11 = KitDefinition.archive13.takeFile(var5, 0); // L: 3120
							var12 = new Font(var11); // L: 3121
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9); // L: 3122
							return 1; // L: 3123
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3125
							var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 3126
							Interpreter.Interpreter_intStackSize -= 2; // L: 3127
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3128
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3129
							var11 = KitDefinition.archive13.takeFile(var5, 0); // L: 3130
							var12 = new Font(var11); // L: 3131
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9); // L: 3132
							return 1; // L: 3133
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3135
							BufferedNetSocket.Interpreter_stringStackSize -= 2; // L: 3136
							var3 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize]; // L: 3137
							var4 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize + 1]; // L: 3138
							if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 3139
								Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var4; // L: 3140
							}

							return 1; // L: 3141
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3143
							var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 3144
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3145
							return 1; // L: 3146
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3148
							var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 3149
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3150
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var3 + (char)var9; // L: 3151
							return 1; // L: 3152
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3154
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3155
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = DynamicObject.isCharPrintable((char)var10) ? 1 : 0; // L: 3156
							return 1; // L: 3157
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3159
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3160
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class124.isAlphaNumeric((char)var10) ? 1 : 0; // L: 3161
							return 1; // L: 3162
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3164
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3165
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Ignored.isCharAlphabetic((char)var10) ? 1 : 0; // L: 3166
							return 1; // L: 3167
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3169
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3170
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class118.isDigit((char)var10) ? 1 : 0; // L: 3171
							return 1; // L: 3172
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3174
							var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 3175
							if (var3 != null) { // L: 3176
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3177
							}

							return 1; // L: 3178
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3180
							var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 3181
							Interpreter.Interpreter_intStackSize -= 2; // L: 3182
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3183
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3184
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var3.substring(var9, var5); // L: 3185
							return 1; // L: 3186
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3188
							var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 3189
							StringBuilder var15 = new StringBuilder(var3.length()); // L: 3190
							boolean var16 = false; // L: 3191

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3192
								char var7 = var3.charAt(var6); // L: 3193
								if (var7 == '<') { // L: 3194
									var16 = true;
								} else if (var7 == '>') { // L: 3195
									var16 = false;
								} else if (!var16) { // L: 3196
									var15.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var15.toString(); // L: 3198
							return 1; // L: 3199
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3201
							var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 3202
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3203
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var9); // L: 3204
							return 1; // L: 3205
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3207
							BufferedNetSocket.Interpreter_stringStackSize -= 2; // L: 3208
							var3 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize]; // L: 3209
							var4 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize + 1]; // L: 3210
							var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3211
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5); // L: 3212
							return 1; // L: 3213
						} else if (var0 == 4122) { // L: 3215
							var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 3216
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3217
							return 1; // L: 3218
						} else {
							return 2; // L: 3220
						}
					}
				} else {
					BufferedNetSocket.Interpreter_stringStackSize -= 2; // L: 3098
					var3 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize]; // L: 3099
					var4 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize + 1]; // L: 3100
					if (WorldMapSprite.localPlayer.appearance != null && WorldMapSprite.localPlayer.appearance.isFemale) { // L: 3101
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var3; // L: 3102
					}

					return 1; // L: 3103
				}
			}
		}
	}
}
