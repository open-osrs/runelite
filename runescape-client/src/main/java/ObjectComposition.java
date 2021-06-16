import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("f")
	@Export("ObjectDefinition_isLowDetail")
	static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("ObjectDefinition_archive")
	static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("ObjectDefinition_modelsArchive")
	static AbstractArchive ObjectDefinition_modelsArchive;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("ObjectDefinition_cached")
	static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("ObjectDefinition_cachedEntities")
	static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("ObjectDefinition_cachedModels")
	static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "[Lga;"
	)
	static ModelData[] field1781;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -299287981
	)
	@Export("id")
	public int id;
	@ObfuscatedName("d")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("z")
	@Export("models")
	int[] models;
	@ObfuscatedName("b")
	@Export("name")
	public String name;
	@ObfuscatedName("i")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("k")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("g")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("t")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2087453689
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1592905647
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 468402991
	)
	@Export("interactType")
	public int interactType;
	@ObfuscatedName("s")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1311902237
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 771514781
	)
	@Export("clipType")
	int clipType;
	@ObfuscatedName("n")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("l")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1229817209
	)
	@Export("animationId")
	public int animationId;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1445120767
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 513103785
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -752104097
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ad")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1655247623
	)
	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1328062479
	)
	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("az")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("ap")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1365837635
	)
	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1650256591
	)
	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2089911171
	)
	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1183715057
	)
	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1452192063
	)
	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2035086537
	)
	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("al")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("aj")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2118223987
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("as")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1811920289
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -385662773
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -298713219
	)
	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -773175377
	)
	public int field1801;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -324754679
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1014383153
	)
	@Export("int6")
	public int int6;
	@ObfuscatedName("ax")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("ar")
	public boolean field1784;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		ObjectDefinition_isLowDetail = false; // L: 17
		ObjectDefinition_cached = new EvictingDualNodeHashTable(4096); // L: 20
		ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500); // L: 21
		ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30); // L: 22
		ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30); // L: 23
		field1781 = new ModelData[4]; // L: 24
	}

	ObjectComposition() {
		this.name = "null"; // L: 28
		this.sizeX = 1;
		this.sizeY = 1;
		this.interactType = 2; // L: 35
		this.boolean1 = true; // L: 36
		this.int1 = -1; // L: 37
		this.clipType = -1; // L: 38
		this.nonFlatShading = false; // L: 39
		this.modelClipped = false; // L: 40
		this.animationId = -1; // L: 41
		this.int2 = 16; // L: 42
		this.ambient = 0; // L: 43
		this.contrast = 0; // L: 44
		this.actions = new String[5]; // L: 45
		this.mapIconId = -1; // L: 46
		this.mapSceneId = -1; // L: 47
		this.isRotated = false; // L: 48
		this.clipped = true; // L: 49
		this.modelSizeX = 128; // L: 50
		this.modelHeight = 128; // L: 51
		this.modelSizeY = 128; // L: 52
		this.offsetX = 0; // L: 53
		this.offsetHeight = 0; // L: 54
		this.offsetY = 0; // L: 55
		this.boolean2 = false; // L: 56
		this.isSolid = false; // L: 57
		this.int3 = -1; // L: 58
		this.transformVarbit = -1; // L: 60
		this.transformVarp = -1; // L: 61
		this.ambientSoundId = -1; // L: 62
		this.field1801 = 0; // L: 63
		this.int5 = 0; // L: 64
		this.int6 = 0; // L: 65
		this.field1784 = true; // L: 67
	} // L: 70

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-2"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.int1 == -1) { // L: 95
			this.int1 = 0; // L: 96
			if (this.modelIds != null && (this.models == null || this.models[0] == 10)) { // L: 97
				this.int1 = 1;
			}

			for (int var1 = 0; var1 < 5; ++var1) { // L: 98
				if (this.actions[var1] != null) {
					this.int1 = 1;
				}
			}
		}

		if (this.int3 == -1) { // L: 100
			this.int3 = this.interactType != 0 ? 1 : 0;
		}

	} // L: 101

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-104234518"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 105
			if (var2 == 0) { // L: 106
				return; // L: 109
			}

			this.decodeNext(var1, var2); // L: 107
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IB)V",
		garbageValue = "54"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 112
			var3 = var1.readUnsignedByte(); // L: 113
			if (var3 > 0) { // L: 114
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) { // L: 115
					var1.offset += var3 * 3; // L: 123
				} else {
					this.models = new int[var3]; // L: 116
					this.modelIds = new int[var3]; // L: 117

					for (var4 = 0; var4 < var3; ++var4) { // L: 118
						this.modelIds[var4] = var1.readUnsignedShort(); // L: 119
						this.models[var4] = var1.readUnsignedByte(); // L: 120
					}
				}
			}
		} else if (var2 == 2) { // L: 126
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 5) { // L: 127
			var3 = var1.readUnsignedByte(); // L: 128
			if (var3 > 0) { // L: 129
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) { // L: 130
					var1.offset += var3 * 2; // L: 135
				} else {
					this.models = null; // L: 131
					this.modelIds = new int[var3]; // L: 132

					for (var4 = 0; var4 < var3; ++var4) { // L: 133
						this.modelIds[var4] = var1.readUnsignedShort();
					}
				}
			}
		} else if (var2 == 14) { // L: 138
			this.sizeX = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 139
			this.sizeY = var1.readUnsignedByte();
		} else if (var2 == 17) { // L: 140
			this.interactType = 0; // L: 141
			this.boolean1 = false; // L: 142
		} else if (var2 == 18) { // L: 144
			this.boolean1 = false;
		} else if (var2 == 19) { // L: 145
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 21) { // L: 146
			this.clipType = 0;
		} else if (var2 == 22) { // L: 147
			this.nonFlatShading = true;
		} else if (var2 == 23) { // L: 148
			this.modelClipped = true;
		} else if (var2 == 24) { // L: 149
			this.animationId = var1.readUnsignedShort(); // L: 150
			if (this.animationId == 65535) { // L: 151
				this.animationId = -1;
			}
		} else if (var2 == 27) { // L: 153
			this.interactType = 1;
		} else if (var2 == 28) { // L: 154
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 29) { // L: 155
			this.ambient = var1.readByte();
		} else if (var2 == 39) { // L: 156
			this.contrast = var1.readByte() * 25;
		} else if (var2 >= 30 && var2 < 35) { // L: 157
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 158
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 159
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 161
			var3 = var1.readUnsignedByte(); // L: 162
			this.recolorFrom = new short[var3]; // L: 163
			this.recolorTo = new short[var3]; // L: 164

			for (var4 = 0; var4 < var3; ++var4) { // L: 165
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 166
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 167
			}
		} else if (var2 == 41) { // L: 170
			var3 = var1.readUnsignedByte(); // L: 171
			this.retextureFrom = new short[var3]; // L: 172
			this.retextureTo = new short[var3]; // L: 173

			for (var4 = 0; var4 < var3; ++var4) { // L: 174
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 175
				this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 176
			}
		} else if (var2 == 61) { // L: 179
			var1.readUnsignedShort(); // L: 180
		} else if (var2 == 62) { // L: 182
			this.isRotated = true;
		} else if (var2 == 64) { // L: 183
			this.clipped = false;
		} else if (var2 == 65) { // L: 184
			this.modelSizeX = var1.readUnsignedShort();
		} else if (var2 == 66) { // L: 185
			this.modelHeight = var1.readUnsignedShort();
		} else if (var2 == 67) { // L: 186
			this.modelSizeY = var1.readUnsignedShort();
		} else if (var2 == 68) { // L: 187
			this.mapSceneId = var1.readUnsignedShort();
		} else if (var2 == 69) { // L: 188
			var1.readUnsignedByte(); // L: 189
		} else if (var2 == 70) { // L: 191
			this.offsetX = var1.readShort();
		} else if (var2 == 71) { // L: 192
			this.offsetHeight = var1.readShort();
		} else if (var2 == 72) {
			this.offsetY = var1.readShort(); // L: 193
		} else if (var2 == 73) { // L: 194
			this.boolean2 = true;
		} else if (var2 == 74) { // L: 195
			this.isSolid = true;
		} else if (var2 == 75) { // L: 196
			this.int3 = var1.readUnsignedByte();
		} else if (var2 != 77 && var2 != 92) { // L: 197
			if (var2 == 78) { // L: 215
				this.ambientSoundId = var1.readUnsignedShort(); // L: 216
				this.field1801 = var1.readUnsignedByte(); // L: 217
			} else if (var2 == 79) { // L: 219
				this.int5 = var1.readUnsignedShort(); // L: 220
				this.int6 = var1.readUnsignedShort(); // L: 221
				this.field1801 = var1.readUnsignedByte(); // L: 222
				var3 = var1.readUnsignedByte(); // L: 223
				this.soundEffectIds = new int[var3]; // L: 224

				for (var4 = 0; var4 < var3; ++var4) { // L: 225
					this.soundEffectIds[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 81) { // L: 227
				this.clipType = var1.readUnsignedByte() * 256;
			} else if (var2 == 82) { // L: 228
				this.mapIconId = var1.readUnsignedShort();
			} else if (var2 == 89) { // L: 229
				this.field1784 = false;
			} else if (var2 == 249) { // L: 230
				this.params = class19.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort(); // L: 198
			if (this.transformVarbit == 65535) { // L: 199
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 200
			if (this.transformVarp == 65535) { // L: 201
				this.transformVarp = -1;
			}

			var3 = -1; // L: 202
			if (var2 == 92) { // L: 203
				var3 = var1.readUnsignedShort(); // L: 204
				if (var3 == 65535) { // L: 205
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte(); // L: 207
			this.transforms = new int[var4 + 2]; // L: 208

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 209
				this.transforms[var5] = var1.readUnsignedShort(); // L: 210
				if (this.transforms[var5] == 65535) { // L: 211
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 213
		}

	} // L: 232

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1935277260"
	)
	public final boolean method3019(int var1) {
		if (this.models != null) { // L: 235
			for (int var4 = 0; var4 < this.models.length; ++var4) { // L: 245
				if (this.models[var4] == var1) { // L: 246
					return ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
				}
			}

			return true; // L: 248
		} else if (this.modelIds == null) { // L: 236
			return true;
		} else if (var1 != 10) { // L: 237
			return true;
		} else {
			boolean var2 = true; // L: 238

			for (int var3 = 0; var3 < this.modelIds.length; ++var3) { // L: 239
				var2 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0); // L: 240
			}

			return var2; // L: 242
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "121"
	)
	@Export("needsModelFiles")
	public final boolean needsModelFiles() {
		if (this.modelIds == null) { // L: 253
			return true;
		} else {
			boolean var1 = true; // L: 254

			for (int var2 = 0; var2 < this.modelIds.length; ++var2) { // L: 255
				var1 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0); // L: 256
			}

			return var1; // L: 258
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lgr;",
		garbageValue = "-212944221"
	)
	@Export("getEntity")
	public final Renderable getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) { // L: 263
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 264
		}

		Object var9 = (Renderable)ObjectDefinition_cachedEntities.get(var7); // L: 265
		if (var9 == null) { // L: 266
			ModelData var10 = this.getModelData(var1, var2); // L: 267
			if (var10 == null) { // L: 268
				return null;
			}

			if (!this.nonFlatShading) { // L: 269
				var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			} else {
				var10.ambient = (short)(this.ambient + 64); // L: 271
				var10.contrast = (short)(this.contrast + 768); // L: 272
				var10.calculateVertexNormals(); // L: 273
				var9 = var10; // L: 274
			}

			ObjectDefinition_cachedEntities.put((DualNode)var9, var7); // L: 276
		}

		if (this.nonFlatShading) { // L: 278
			var9 = ((ModelData)var9).method3870(); // L: 279
		}

		if (this.clipType >= 0) { // L: 281
			if (var9 instanceof Model) { // L: 282
				var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData)var9).method3933(var3, var4, var5, var6, true, this.clipType); // L: 283
			}
		}

		return (Renderable)var9; // L: 285
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lgd;",
		garbageValue = "1736457663"
	)
	@Export("getModel")
	public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) { // L: 290
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 291
		}

		Model var9 = (Model)ObjectDefinition_cachedModels.get(var7); // L: 292
		if (var9 == null) { // L: 293
			ModelData var10 = this.getModelData(var1, var2); // L: 294
			if (var10 == null) { // L: 295
				return null;
			}

			var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 296
			ObjectDefinition_cachedModels.put(var9, var7); // L: 297
		}

		if (this.clipType >= 0) {
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType); // L: 299
		}

		return var9; // L: 300
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILfm;IB)Lgd;",
		garbageValue = "-15"
	)
	@Export("getModelDynamic")
	public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
		long var9;
		if (this.models == null) { // L: 305
			var9 = (long)(var2 + (this.id << 10));
		} else {
			var9 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 306
		}

		Model var11 = (Model)ObjectDefinition_cachedModels.get(var9); // L: 307
		if (var11 == null) { // L: 308
			ModelData var12 = this.getModelData(var1, var2); // L: 309
			if (var12 == null) { // L: 310
				return null;
			}

			var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 311
			ObjectDefinition_cachedModels.put(var11, var9); // L: 312
		}

		if (var7 == null && this.clipType == -1) {
			return var11; // L: 314
		} else {
			if (var7 != null) { // L: 315
				var11 = var7.transformObjectModel(var11, var8, var2);
			} else {
				var11 = var11.toSharedSequenceModel(true); // L: 316
			}

			if (this.clipType >= 0) { // L: 317
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType);
			}

			return var11; // L: 318
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)Lga;",
		garbageValue = "1848806272"
	)
	@Export("getModelData")
	final ModelData getModelData(int var1, int var2) {
		ModelData var3 = null; // L: 322
		boolean var4;
		int var5;
		int var7;
		if (this.models == null) { // L: 323
			if (var1 != 10) { // L: 324
				return null;
			}

			if (this.modelIds == null) { // L: 325
				return null;
			}

			var4 = this.isRotated; // L: 326
			if (var1 == 2 && var2 > 3) { // L: 327
				var4 = !var4;
			}

			var5 = this.modelIds.length; // L: 328

			for (int var6 = 0; var6 < var5; ++var6) { // L: 329
				var7 = this.modelIds[var6]; // L: 330
				if (var4) { // L: 331
					var7 += 65536;
				}

				var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var7); // L: 332
				if (var3 == null) { // L: 333
					var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var7 & 65535, 0); // L: 334
					if (var3 == null) { // L: 335
						return null;
					}

					if (var4) { // L: 336
						var3.method3877();
					}

					ObjectDefinition_cachedModelData.put(var3, (long)var7); // L: 337
				}

				if (var5 > 1) { // L: 339
					field1781[var6] = var3;
				}
			}

			if (var5 > 1) { // L: 341
				var3 = new ModelData(field1781, var5);
			}
		} else {
			int var9 = -1; // L: 344

			for (var5 = 0; var5 < this.models.length; ++var5) { // L: 345
				if (this.models[var5] == var1) { // L: 346
					var9 = var5; // L: 347
					break;
				}
			}

			if (var9 == -1) { // L: 351
				return null;
			}

			var5 = this.modelIds[var9]; // L: 352
			boolean var10 = this.isRotated ^ var2 > 3; // L: 353
			if (var10) { // L: 354
				var5 += 65536;
			}

			var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var5); // L: 355
			if (var3 == null) { // L: 356
				var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var5 & 65535, 0); // L: 357
				if (var3 == null) { // L: 358
					return null;
				}

				if (var10) { // L: 359
					var3.method3877();
				}

				ObjectDefinition_cachedModelData.put(var3, (long)var5); // L: 360
			}
		}

		if (this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128) { // L: 364
			var4 = false; // L: 365
		} else {
			var4 = true;
		}

		boolean var11;
		if (this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) { // L: 367
			var11 = false; // L: 368
		} else {
			var11 = true;
		}

		ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, this.recolorFrom == null, this.retextureFrom == null, true); // L: 369
		if (var1 == 4 && var2 > 3) { // L: 370
			var8.method3864(256); // L: 371
			var8.changeOffset(45, 0, -45); // L: 372
		}

		var2 &= 3; // L: 374
		if (var2 == 1) { // L: 375
			var8.method3873();
		} else if (var2 == 2) { // L: 376
			var8.method3874();
		} else if (var2 == 3) { // L: 377
			var8.method3875();
		}

		if (this.recolorFrom != null) { // L: 378
			for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 379
				var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 380
			}
		}

		if (this.retextureFrom != null) { // L: 383
			for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 384
				var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 385
			}
		}

		if (var4) { // L: 388
			var8.resize(this.modelSizeX, this.modelHeight, this.modelSizeY);
		}

		if (var11) { // L: 389
			var8.changeOffset(this.offsetX, this.offsetHeight, this.offsetY);
		}

		return var8; // L: 390
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Lez;",
		garbageValue = "-68"
	)
	@Export("transform")
	public final ObjectComposition transform() {
		int var1 = -1; // L: 394
		if (this.transformVarbit != -1) { // L: 395
			var1 = ScriptFrame.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 396
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 398
			var2 = this.transforms[var1]; // L: 399
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? Tiles.getObjectDefinition(var2) : null; // L: 400 401
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-822504671"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 406
		int var3;
		if (var4 == null) { // L: 408
			var3 = var2; // L: 409
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 412
			if (var5 == null) { // L: 413
				var3 = var2; // L: 414
			} else {
				var3 = var5.integer; // L: 417
			}
		}

		return var3; // L: 419
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "0"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return WorldMapElement.method2742(this.params, var1, var2); // L: 423
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "114"
	)
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) { // L: 434
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) { // L: 435
				if (this.transforms[var1] != -1) { // L: 436
					ObjectComposition var2 = Tiles.getObjectDefinition(this.transforms[var1]); // L: 437
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) { // L: 438
						return true;
					}
				}
			}

			return false; // L: 441
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;B)V",
		garbageValue = "-24"
	)
	public static void method3069(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0; // L: 32
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1; // L: 33
	} // L: 34
}
