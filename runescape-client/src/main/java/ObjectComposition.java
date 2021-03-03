import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("n")
	@Export("ObjectDefinition_isLowDetail")
	static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("ObjectDefinition_archive")
	static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("ObjectDefinition_modelsArchive")
	static AbstractArchive ObjectDefinition_modelsArchive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("ObjectDefinition_cached")
	public static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("ObjectDefinition_cachedEntities")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("ObjectDefinition_cachedModels")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Lek;"
	)
	static ModelData[] field3410;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -448703229
	)
	@Export("id")
	public int id;
	@ObfuscatedName("l")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("s")
	@Export("models")
	int[] models;
	@ObfuscatedName("b")
	@Export("name")
	public String name;
	@ObfuscatedName("a")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("w")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("k")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("i")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 298630257
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1328331405
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 270471379
	)
	@Export("interactType")
	public int interactType;
	@ObfuscatedName("u")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 49633811
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1668805195
	)
	@Export("clipType")
	int clipType;
	@ObfuscatedName("m")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("r")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 581638001
	)
	@Export("animationId")
	public int animationId;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -211640911
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 453955421
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1979235761
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ag")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2137777107
	)
	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 59768053
	)
	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("aq")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("at")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1499464739
	)
	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -561367673
	)
	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1882279433
	)
	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1934528115
	)
	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1408363841
	)
	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1403538025
	)
	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("aw")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("az")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1437084271
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("ap")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -351065157
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 759778209
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 411474029
	)
	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 968058385
	)
	@Export("int4")
	public int int4;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 693369209
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1791348031
	)
	@Export("int6")
	public int int6;
	@ObfuscatedName("af")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("av")
	public boolean field3429;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		ObjectDefinition_isLowDetail = false; // L: 17
		ObjectDefinition_cached = new EvictingDualNodeHashTable(4096); // L: 20
		ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500); // L: 21
		ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30); // L: 22
		ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30); // L: 23
		field3410 = new ModelData[4]; // L: 24
	}

	ObjectComposition() {
		this.name = "null"; // L: 28
		this.sizeX = 1; // L: 33
		this.sizeY = 1; // L: 34
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
		this.int4 = 0; // L: 63
		this.int5 = 0; // L: 64
		this.int6 = 0; // L: 65
		this.field3429 = true; // L: 67
	} // L: 70

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-80"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkx;B)V",
		garbageValue = "0"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lkx;II)V",
		garbageValue = "504124934"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedByte();
			if (var3 > 0) {
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
					var1.offset += 3 * var3;
				} else {
					this.models = new int[var3];
					this.modelIds = new int[var3];

					for (var4 = 0; var4 < var3; ++var4) {
						this.modelIds[var4] = var1.readUnsignedShort();
						this.models[var4] = var1.readUnsignedByte();
					}
				}
			}
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 5) {
			var3 = var1.readUnsignedByte();
			if (var3 > 0) {
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
					var1.offset += var3 * 2;
				} else {
					this.models = null;
					this.modelIds = new int[var3];

					for (var4 = 0; var4 < var3; ++var4) {
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
		} else if (var2 == 62) { // L: 179
			this.isRotated = true;
		} else if (var2 == 64) { // L: 180
			this.clipped = false;
		} else if (var2 == 65) { // L: 181
			this.modelSizeX = var1.readUnsignedShort();
		} else if (var2 == 66) { // L: 182
			this.modelHeight = var1.readUnsignedShort();
		} else if (var2 == 67) { // L: 183
			this.modelSizeY = var1.readUnsignedShort();
		} else if (var2 == 68) { // L: 184
			this.mapSceneId = var1.readUnsignedShort();
		} else if (var2 == 69) { // L: 185
			var1.readUnsignedByte(); // L: 186
		} else if (var2 == 70) { // L: 188
			this.offsetX = var1.readShort();
		} else if (var2 == 71) { // L: 189
			this.offsetHeight = var1.readShort();
		} else if (var2 == 72) { // L: 190
			this.offsetY = var1.readShort();
		} else if (var2 == 73) { // L: 191
			this.boolean2 = true;
		} else if (var2 == 74) { // L: 192
			this.isSolid = true;
		} else if (var2 == 75) { // L: 193
			this.int3 = var1.readUnsignedByte();
		} else if (var2 != 77 && var2 != 92) { // L: 194
			if (var2 == 78) { // L: 212
				this.ambientSoundId = var1.readUnsignedShort(); // L: 213
				this.int4 = var1.readUnsignedByte(); // L: 214
			} else if (var2 == 79) { // L: 216
				this.int5 = var1.readUnsignedShort(); // L: 217
				this.int6 = var1.readUnsignedShort(); // L: 218
				this.int4 = var1.readUnsignedByte(); // L: 219
				var3 = var1.readUnsignedByte(); // L: 220
				this.soundEffectIds = new int[var3]; // L: 221

				for (var4 = 0; var4 < var3; ++var4) { // L: 222
					this.soundEffectIds[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 81) { // L: 224
				this.clipType = var1.readUnsignedByte() * 256;
			} else if (var2 == 82) { // L: 225
				this.mapIconId = var1.readUnsignedShort();
			} else if (var2 == 89) { // L: 226
				this.field3429 = false;
			} else if (var2 == 249) { // L: 227
				this.params = TextureProvider.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort(); // L: 195
			if (this.transformVarbit == 65535) { // L: 196
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 197
			if (this.transformVarp == 65535) { // L: 198
				this.transformVarp = -1;
			}

			var3 = -1; // L: 199
			if (var2 == 92) { // L: 200
				var3 = var1.readUnsignedShort(); // L: 201
				if (var3 == 65535) { // L: 202
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte(); // L: 204
			this.transforms = new int[var4 + 2]; // L: 205

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 206
				this.transforms[var5] = var1.readUnsignedShort(); // L: 207
				if (this.transforms[var5] == 65535) { // L: 208
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 210
		}

	} // L: 229

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2131864128"
	)
	public final boolean method4806(int var1) {
		if (this.models != null) { // L: 232
			for (int var4 = 0; var4 < this.models.length; ++var4) { // L: 242
				if (this.models[var4] == var1) { // L: 243
					return ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
				}
			}

			return true; // L: 245
		} else if (this.modelIds == null) { // L: 233
			return true;
		} else if (var1 != 10) { // L: 234
			return true;
		} else {
			boolean var2 = true; // L: 235

			for (int var3 = 0; var3 < this.modelIds.length; ++var3) { // L: 236
				var2 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0); // L: 237
			}

			return var2; // L: 239
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	@Export("needsModelFiles")
	public final boolean needsModelFiles() {
		if (this.modelIds == null) { // L: 250
			return true;
		} else {
			boolean var1 = true; // L: 251

			for (int var2 = 0; var2 < this.modelIds.length; ++var2) { // L: 252
				var1 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0); // L: 253
			}

			return var1; // L: 255
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lem;",
		garbageValue = "2086147511"
	)
	@Export("getEntity")
	public final Renderable getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) { // L: 260
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 261
		}

		Object var9 = (Renderable)ObjectDefinition_cachedEntities.get(var7); // L: 262
		if (var9 == null) { // L: 263
			ModelData var10 = this.getModelData(var1, var2); // L: 264
			if (var10 == null) { // L: 265
				return null;
			}

			if (!this.nonFlatShading) { // L: 266
				var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			} else {
				var10.ambient = (short)(this.ambient + 64); // L: 268
				var10.contrast = (short)(this.contrast + 768); // L: 269
				var10.calculateVertexNormals(); // L: 270
				var9 = var10; // L: 271
			}

			ObjectDefinition_cachedEntities.put((DualNode)var9, var7); // L: 273
		}

		if (this.nonFlatShading) { // L: 275
			var9 = ((ModelData)var9).method2945(); // L: 276
		}

		if (this.clipType >= 0) { // L: 278
			if (var9 instanceof Model) { // L: 279
				var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData)var9).method2946(var3, var4, var5, var6, true, this.clipType); // L: 280
			}
		}

		return (Renderable)var9; // L: 282
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lef;",
		garbageValue = "-1813150019"
	)
	@Export("getModel")
	public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) { // L: 287
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 288
		}

		Model var9 = (Model)ObjectDefinition_cachedModels.get(var7); // L: 289
		if (var9 == null) { // L: 290
			ModelData var10 = this.getModelData(var1, var2); // L: 291
			if (var10 == null) { // L: 292
				return null;
			}

			var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 293
			ObjectDefinition_cachedModels.put(var9, var7); // L: 294
		}

		if (this.clipType >= 0) {
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType); // L: 296
		}

		return var9; // L: 297
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILjs;II)Lef;",
		garbageValue = "1938080829"
	)
	@Export("getModelDynamic")
	public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
		long var9;
		if (this.models == null) { // L: 302
			var9 = (long)(var2 + (this.id << 10));
		} else {
			var9 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 303
		}

		Model var11 = (Model)ObjectDefinition_cachedModels.get(var9); // L: 304
		if (var11 == null) { // L: 305
			ModelData var12 = this.getModelData(var1, var2); // L: 306
			if (var12 == null) { // L: 307
				return null;
			}

			var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 308
			ObjectDefinition_cachedModels.put(var11, var9); // L: 309
		}

		if (var7 == null && this.clipType == -1) {
			return var11; // L: 311
		} else {
			if (var7 != null) { // L: 312
				var11 = var7.transformObjectModel(var11, var8, var2);
			} else {
				var11 = var11.toSharedSequenceModel(true); // L: 313
			}

			if (this.clipType >= 0) { // L: 314
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType);
			}

			return var11; // L: 315
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Lek;",
		garbageValue = "-1880429080"
	)
	@Export("getModelData")
	final ModelData getModelData(int var1, int var2) {
		ModelData var3 = null; // L: 319
		boolean var4;
		int var5;
		int var7;
		if (this.models == null) { // L: 320
			if (var1 != 10) { // L: 321
				return null;
			}

			if (this.modelIds == null) { // L: 322
				return null;
			}

			var4 = this.isRotated; // L: 323
			if (var1 == 2 && var2 > 3) { // L: 324
				var4 = !var4;
			}

			var5 = this.modelIds.length; // L: 325

			for (int var6 = 0; var6 < var5; ++var6) { // L: 326
				var7 = this.modelIds[var6]; // L: 327
				if (var4) { // L: 328
					var7 += 65536;
				}

				var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var7); // L: 329
				if (var3 == null) { // L: 330
					var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var7 & 65535, 0); // L: 331
					if (var3 == null) { // L: 332
						return null;
					}

					if (var4) { // L: 333
						var3.method2989();
					}

					ObjectDefinition_cachedModelData.put(var3, (long)var7); // L: 334
				}

				if (var5 > 1) { // L: 336
					field3410[var6] = var3;
				}
			}

			if (var5 > 1) { // L: 338
				var3 = new ModelData(field3410, var5);
			}
		} else {
			int var9 = -1; // L: 341

			for (var5 = 0; var5 < this.models.length; ++var5) { // L: 342
				if (this.models[var5] == var1) { // L: 343
					var9 = var5; // L: 344
					break;
				}
			}

			if (var9 == -1) { // L: 348
				return null;
			}

			var5 = this.modelIds[var9]; // L: 349
			boolean var10 = this.isRotated ^ var2 > 3; // L: 350
			if (var10) { // L: 351
				var5 += 65536;
			}

			var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var5); // L: 352
			if (var3 == null) { // L: 353
				var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var5 & 65535, 0); // L: 354
				if (var3 == null) { // L: 355
					return null;
				}

				if (var10) { // L: 356
					var3.method2989();
				}

				ObjectDefinition_cachedModelData.put(var3, (long)var5); // L: 357
			}
		}

		if (this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128) { // L: 361
			var4 = false; // L: 362
		} else {
			var4 = true;
		}

		boolean var11;
		if (this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) { // L: 364
			var11 = false; // L: 365
		} else {
			var11 = true;
		}

		ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, this.recolorFrom == null, this.retextureFrom == null, true); // L: 366
		if (var1 == 4 && var2 > 3) { // L: 367
			var8.method2951(256); // L: 368
			var8.changeOffset(45, 0, -45); // L: 369
		}

		var2 &= 3; // L: 371
		if (var2 == 1) { // L: 372
			var8.method2948();
		} else if (var2 == 2) { // L: 373
			var8.method2949();
		} else if (var2 == 3) { // L: 374
			var8.method3006();
		}

		if (this.recolorFrom != null) { // L: 375
			for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 376
				var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 377
			}
		}

		if (this.retextureFrom != null) { // L: 380
			for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 381
				var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 382
			}
		}

		if (var4) { // L: 385
			var8.resize(this.modelSizeX, this.modelHeight, this.modelSizeY);
		}

		if (var11) { // L: 386
			var8.changeOffset(this.offsetX, this.offsetHeight, this.offsetY);
		}

		return var8; // L: 387
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Ljg;",
		garbageValue = "-1578474044"
	)
	@Export("transform")
	public final ObjectComposition transform() {
		int var1 = -1; // L: 391
		if (this.transformVarbit != -1) { // L: 392
			var1 = FontName.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 393
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 395
			var2 = this.transforms[var1]; // L: 396
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? WorldMapAreaData.getObjectDefinition(var2) : null; // L: 397 398
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "495952846"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 403
		int var3;
		if (var4 == null) { // L: 405
			var3 = var2; // L: 406
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 409
			if (var5 == null) { // L: 410
				var3 = var2; // L: 411
			} else {
				var3 = var5.integer; // L: 414
			}
		}

		return var3; // L: 416
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "244944647"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class69.method1258(this.params, var1, var2); // L: 420
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1187773047"
	)
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) { // L: 424
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) { // L: 425
				if (this.transforms[var1] != -1) { // L: 426
					ObjectComposition var2 = WorldMapAreaData.getObjectDefinition(this.transforms[var1]); // L: 427
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) { // L: 428
						return true;
					}
				}
			}

			return false; // L: 431
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "-314683087"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 104

		for (int var6 = 0; var6 < var5; ++var6) { // L: 105
			char var7 = var0.charAt(var6 + var1); // L: 106
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 107
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 108
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 109
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 110
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 111
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 112
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 113
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 114
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120; // L: 115
			} else if (var7 == 8240) { // L: 116
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 117
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 118
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 119
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 120
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 121
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 122
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 123
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 124
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 125
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) {
				var3[var6 + var4] = -106; // L: 126
			} else if (var7 == 8212) { // L: 127
				var3[var6 + var4] = -105;
			} else if (var7 == 732) { // L: 128
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 129
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 130
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 131
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 132
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 133
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 134
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 135
			}
		}

		return var5; // L: 137
	}
}
