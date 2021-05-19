import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("h")
	@Export("ObjectDefinition_isLowDetail")
	public static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("ObjectDefinition_archive")
	public static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("ObjectDefinition_modelsArchive")
	public static AbstractArchive ObjectDefinition_modelsArchive;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("ObjectDefinition_cached")
	static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("ObjectDefinition_cachedEntities")
	static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("ObjectDefinition_cachedModels")
	static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lgk;"
	)
	static ModelData[] field1765;
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1878331737
	)
	@Export("id")
	public int id;
	@ObfuscatedName("q")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("i")
	@Export("models")
	int[] models;
	@ObfuscatedName("x")
	@Export("name")
	public String name;
	@ObfuscatedName("k")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("r")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("p")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("a")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1437298293
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 609698911
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 87982863
	)
	@Export("interactType")
	public int interactType;
	@ObfuscatedName("m")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -606680229
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -533490969
	)
	@Export("clipType")
	int clipType;
	@ObfuscatedName("s")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("y")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -926574345
	)
	@Export("animationId")
	public int animationId;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1043420487
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -108030549
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1002632409
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ao")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 762696279
	)
	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 451592881
	)
	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("at")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("av")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -707186951
	)
	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -952395829
	)
	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1765816031
	)
	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -707787703
	)
	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1508092653
	)
	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 381553565
	)
	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("ai")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("aa")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -17710627
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("as")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2015859493
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1480972779
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1140263959
	)
	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 262834993
	)
	@Export("int4")
	public int int4;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1274090963
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1128849875
	)
	@Export("int6")
	public int int6;
	@ObfuscatedName("ah")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("af")
	public boolean field1761;
	@ObfuscatedName("an")
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
		field1765 = new ModelData[4]; // L: 24
	}

	ObjectComposition() {
		this.name = "null";
		this.sizeX = 1;
		this.sizeY = 1;
		this.interactType = 2;
		this.boolean1 = true; // L: 36
		this.int1 = -1; // L: 37
		this.clipType = -1;
		this.nonFlatShading = false;
		this.modelClipped = false;
		this.animationId = -1;
		this.int2 = 16;
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
		this.field1761 = true; // L: 67
	} // L: 70

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "785756929"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.int1 == -1) { // L: 89
			this.int1 = 0; // L: 90
			if (this.modelIds != null && (this.models == null || this.models[0] == 10)) { // L: 91
				this.int1 = 1;
			}

			for (int var1 = 0; var1 < 5; ++var1) { // L: 92
				if (this.actions[var1] != null) {
					this.int1 = 1;
				}
			}
		}

		if (this.int3 == -1) { // L: 94
			this.int3 = this.interactType != 0 ? 1 : 0;
		}

	} // L: 95

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "34"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 99
			if (var2 == 0) { // L: 100
				return; // L: 103
			}

			this.decodeNext(var1, var2); // L: 101
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnk;II)V",
		garbageValue = "444999898"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 106
			var3 = var1.readUnsignedByte(); // L: 107
			if (var3 > 0) { // L: 108
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) { // L: 109
					var1.offset += 3 * var3; // L: 117
				} else {
					this.models = new int[var3]; // L: 110
					this.modelIds = new int[var3]; // L: 111

					for (var4 = 0; var4 < var3; ++var4) { // L: 112
						this.modelIds[var4] = var1.readUnsignedShort(); // L: 113
						this.models[var4] = var1.readUnsignedByte(); // L: 114
					}
				}
			}
		} else if (var2 == 2) { // L: 120
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 5) { // L: 121
			var3 = var1.readUnsignedByte(); // L: 122
			if (var3 > 0) { // L: 123
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) { // L: 124
					var1.offset += 2 * var3; // L: 129
				} else {
					this.models = null; // L: 125
					this.modelIds = new int[var3]; // L: 126

					for (var4 = 0; var4 < var3; ++var4) { // L: 127
						this.modelIds[var4] = var1.readUnsignedShort();
					}
				}
			}
		} else if (var2 == 14) { // L: 132
			this.sizeX = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 133
			this.sizeY = var1.readUnsignedByte();
		} else if (var2 == 17) { // L: 134
			this.interactType = 0; // L: 135
			this.boolean1 = false; // L: 136
		} else if (var2 == 18) { // L: 138
			this.boolean1 = false;
		} else if (var2 == 19) { // L: 139
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 21) { // L: 140
			this.clipType = 0;
		} else if (var2 == 22) { // L: 141
			this.nonFlatShading = true;
		} else if (var2 == 23) { // L: 142
			this.modelClipped = true;
		} else if (var2 == 24) { // L: 143
			this.animationId = var1.readUnsignedShort(); // L: 144
			if (this.animationId == 65535) { // L: 145
				this.animationId = -1;
			}
		} else if (var2 == 27) { // L: 147
			this.interactType = 1;
		} else if (var2 == 28) { // L: 148
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 29) { // L: 149
			this.ambient = var1.readByte();
		} else if (var2 == 39) { // L: 150
			this.contrast = var1.readByte() * 25;
		} else if (var2 >= 30 && var2 < 35) { // L: 151
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 152
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 153
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 155
			var3 = var1.readUnsignedByte(); // L: 156
			this.recolorFrom = new short[var3]; // L: 157
			this.recolorTo = new short[var3]; // L: 158

			for (var4 = 0; var4 < var3; ++var4) { // L: 159
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 160
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 161
			}
		} else if (var2 == 41) { // L: 164
			var3 = var1.readUnsignedByte(); // L: 165
			this.retextureFrom = new short[var3]; // L: 166
			this.retextureTo = new short[var3]; // L: 167

			for (var4 = 0; var4 < var3; ++var4) { // L: 168
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 169
				this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 170
			}
		} else if (var2 == 62) { // L: 173
			this.isRotated = true;
		} else if (var2 == 64) { // L: 174
			this.clipped = false;
		} else if (var2 == 65) { // L: 175
			this.modelSizeX = var1.readUnsignedShort();
		} else if (var2 == 66) { // L: 176
			this.modelHeight = var1.readUnsignedShort();
		} else if (var2 == 67) { // L: 177
			this.modelSizeY = var1.readUnsignedShort();
		} else if (var2 == 68) { // L: 178
			this.mapSceneId = var1.readUnsignedShort();
		} else if (var2 == 69) { // L: 179
			var1.readUnsignedByte(); // L: 180
		} else if (var2 == 70) { // L: 182
			this.offsetX = var1.readShort();
		} else if (var2 == 71) { // L: 183
			this.offsetHeight = var1.readShort();
		} else if (var2 == 72) { // L: 184
			this.offsetY = var1.readShort();
		} else if (var2 == 73) { // L: 185
			this.boolean2 = true;
		} else if (var2 == 74) { // L: 186
			this.isSolid = true;
		} else if (var2 == 75) { // L: 187
			this.int3 = var1.readUnsignedByte();
		} else if (var2 != 77 && var2 != 92) { // L: 188
			if (var2 == 78) { // L: 206
				this.ambientSoundId = var1.readUnsignedShort(); // L: 207
				this.int4 = var1.readUnsignedByte(); // L: 208
			} else if (var2 == 79) { // L: 210
				this.int5 = var1.readUnsignedShort(); // L: 211
				this.int6 = var1.readUnsignedShort(); // L: 212
				this.int4 = var1.readUnsignedByte(); // L: 213
				var3 = var1.readUnsignedByte(); // L: 214
				this.soundEffectIds = new int[var3]; // L: 215

				for (var4 = 0; var4 < var3; ++var4) { // L: 216
					this.soundEffectIds[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 81) { // L: 218
				this.clipType = var1.readUnsignedByte() * 256;
			} else if (var2 == 82) { // L: 219
				this.mapIconId = var1.readUnsignedShort();
			} else if (var2 == 89) { // L: 220
				this.field1761 = false;
			} else if (var2 == 249) { // L: 221
				this.params = HealthBar.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort(); // L: 189
			if (this.transformVarbit == 65535) { // L: 190
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 191
			if (this.transformVarp == 65535) { // L: 192
				this.transformVarp = -1;
			}

			var3 = -1; // L: 193
			if (var2 == 92) { // L: 194
				var3 = var1.readUnsignedShort(); // L: 195
				if (var3 == 65535) { // L: 196
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte(); // L: 198
			this.transforms = new int[var4 + 2]; // L: 199

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 200
				this.transforms[var5] = var1.readUnsignedShort(); // L: 201
				if (this.transforms[var5] == 65535) { // L: 202
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 204
		}

	} // L: 223

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "7"
	)
	public final boolean method2916(int var1) {
		if (this.models != null) { // L: 226
			for (int var4 = 0; var4 < this.models.length; ++var4) { // L: 236
				if (this.models[var4] == var1) { // L: 237
					return ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
				}
			}

			return true; // L: 239
		} else if (this.modelIds == null) { // L: 227
			return true;
		} else if (var1 != 10) { // L: 228
			return true;
		} else {
			boolean var2 = true; // L: 229

			for (int var3 = 0; var3 < this.modelIds.length; ++var3) { // L: 230
				var2 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0); // L: 231
			}

			return var2; // L: 233
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "11544"
	)
	@Export("needsModelFiles")
	public final boolean needsModelFiles() {
		if (this.modelIds == null) { // L: 244
			return true;
		} else {
			boolean var1 = true; // L: 245

			for (int var2 = 0; var2 < this.modelIds.length; ++var2) { // L: 246
				var1 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0); // L: 247
			}

			return var1; // L: 249
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIIB)Lge;",
		garbageValue = "-7"
	)
	@Export("getEntity")
	public final Renderable getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) { // L: 254
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 255
		}

		Object var9 = (Renderable)ObjectDefinition_cachedEntities.get(var7); // L: 256
		if (var9 == null) { // L: 257
			ModelData var10 = this.getModelData(var1, var2); // L: 258
			if (var10 == null) { // L: 259
				return null;
			}

			if (!this.nonFlatShading) { // L: 260
				var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			} else {
				var10.ambient = (short)(this.ambient + 64); // L: 262
				var10.contrast = (short)(this.contrast + 768); // L: 263
				var10.calculateVertexNormals(); // L: 264
				var9 = var10; // L: 265
			}

			ObjectDefinition_cachedEntities.put((DualNode)var9, var7); // L: 267
		}

		if (this.nonFlatShading) { // L: 269
			var9 = ((ModelData)var9).method3796(); // L: 270
		}

		if (this.clipType >= 0) { // L: 272
			if (var9 instanceof Model) { // L: 273
				var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData)var9).method3723(var3, var4, var5, var6, true, this.clipType); // L: 274
			}
		}

		return (Renderable)var9; // L: 276
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lgj;",
		garbageValue = "-1052657042"
	)
	@Export("getModel")
	public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) { // L: 281
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 282
		}

		Model var9 = (Model)ObjectDefinition_cachedModels.get(var7); // L: 283
		if (var9 == null) { // L: 284
			ModelData var10 = this.getModelData(var1, var2); // L: 285
			if (var10 == null) { // L: 286
				return null;
			}

			var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 287
			ObjectDefinition_cachedModels.put(var9, var7); // L: 288
		}

		if (this.clipType >= 0) {
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType); // L: 290
		}

		return var9; // L: 291
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILfb;IB)Lgj;",
		garbageValue = "0"
	)
	@Export("getModelDynamic")
	public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
		long var9;
		if (this.models == null) { // L: 296
			var9 = (long)(var2 + (this.id << 10));
		} else {
			var9 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 297
		}

		Model var11 = (Model)ObjectDefinition_cachedModels.get(var9); // L: 298
		if (var11 == null) { // L: 299
			ModelData var12 = this.getModelData(var1, var2); // L: 300
			if (var12 == null) { // L: 301
				return null;
			}

			var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 302
			ObjectDefinition_cachedModels.put(var11, var9); // L: 303
		}

		if (var7 == null && this.clipType == -1) { // L: 305
			return var11;
		} else {
			if (var7 != null) { // L: 306
				var11 = var7.transformObjectModel(var11, var8, var2);
			} else {
				var11 = var11.toSharedSequenceModel(true); // L: 307
			}

			if (this.clipType >= 0) { // L: 308
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType);
			}

			return var11; // L: 309
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)Lgk;",
		garbageValue = "-1846121867"
	)
	@Export("getModelData")
	final ModelData getModelData(int var1, int var2) {
		ModelData var3 = null; // L: 313
		boolean var4;
		int var5;
		int var7;
		if (this.models == null) { // L: 314
			if (var1 != 10) { // L: 315
				return null;
			}

			if (this.modelIds == null) { // L: 316
				return null;
			}

			var4 = this.isRotated; // L: 317
			if (var1 == 2 && var2 > 3) { // L: 318
				var4 = !var4;
			}

			var5 = this.modelIds.length; // L: 319

			for (int var6 = 0; var6 < var5; ++var6) { // L: 320
				var7 = this.modelIds[var6]; // L: 321
				if (var4) { // L: 322
					var7 += 65536;
				}

				var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var7); // L: 323
				if (var3 == null) { // L: 324
					var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var7 & 65535, 0); // L: 325
					if (var3 == null) { // L: 326
						return null;
					}

					if (var4) { // L: 327
						var3.method3732();
					}

					ObjectDefinition_cachedModelData.put(var3, (long)var7); // L: 328
				}

				if (var5 > 1) { // L: 330
					field1765[var6] = var3;
				}
			}

			if (var5 > 1) { // L: 332
				var3 = new ModelData(field1765, var5);
			}
		} else {
			int var9 = -1; // L: 335

			for (var5 = 0; var5 < this.models.length; ++var5) { // L: 336
				if (this.models[var5] == var1) { // L: 337
					var9 = var5; // L: 338
					break;
				}
			}

			if (var9 == -1) { // L: 342
				return null;
			}

			var5 = this.modelIds[var9]; // L: 343
			boolean var10 = this.isRotated ^ var2 > 3; // L: 344
			if (var10) { // L: 345
				var5 += 65536;
			}

			var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var5); // L: 346
			if (var3 == null) { // L: 347
				var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var5 & 65535, 0); // L: 348
				if (var3 == null) { // L: 349
					return null;
				}

				if (var10) { // L: 350
					var3.method3732();
				}

				ObjectDefinition_cachedModelData.put(var3, (long)var5); // L: 351
			}
		}

		if (this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128) { // L: 355
			var4 = false; // L: 356
		} else {
			var4 = true;
		}

		boolean var11;
		if (this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) { // L: 358
			var11 = false; // L: 359
		} else {
			var11 = true;
		}

		ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, null == this.recolorFrom, this.retextureFrom == null, true); // L: 360
		if (var1 == 4 && var2 > 3) { // L: 361
			var8.method3728(256); // L: 362
			var8.changeOffset(45, 0, -45); // L: 363
		}

		var2 &= 3; // L: 365
		if (var2 == 1) { // L: 366
			var8.method3725();
		} else if (var2 == 2) { // L: 367
			var8.method3759();
		} else if (var2 == 3) { // L: 368
			var8.method3727();
		}

		if (this.recolorFrom != null) { // L: 369
			for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 370
				var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 371
			}
		}

		if (this.retextureFrom != null) { // L: 374
			for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 375
				var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 376
			}
		}

		if (var4) { // L: 379
			var8.resize(this.modelSizeX, this.modelHeight, this.modelSizeY);
		}

		if (var11) { // L: 380
			var8.changeOffset(this.offsetX, this.offsetHeight, this.offsetY);
		}

		return var8; // L: 381
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Lem;",
		garbageValue = "987622241"
	)
	@Export("transform")
	public final ObjectComposition transform() {
		int var1 = -1; // L: 385
		if (this.transformVarbit != -1) { // L: 386
			var1 = getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 387
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 389
			var2 = this.transforms[var1]; // L: 390
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? AttackOption.getObjectDefinition(var2) : null; // L: 391 392
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-37"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return GraphicsObject.method1937(this.params, var1, var2); // L: 396
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1774081221"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return Varcs.method2326(this.params, var1, var2); // L: 400
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-889649033"
	)
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) { // L: 411
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) { // L: 412
				if (this.transforms[var1] != -1) { // L: 413
					ObjectComposition var2 = AttackOption.getObjectDefinition(this.transforms[var1]); // L: 414
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) { // L: 415
						return true;
					}
				}
			}

			return false; // L: 418
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-5"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 26
		VarbitComposition var1;
		if (var2 != null) { // L: 27
			var1 = var2; // L: 28
		} else {
			byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 31
			var2 = new VarbitComposition(); // L: 32
			if (var3 != null) { // L: 33
				var2.decode(new Buffer(var3));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0); // L: 34
			var1 = var2; // L: 35
		}

		int var7 = var1.baseVar; // L: 38
		int var4 = var1.startBit; // L: 39
		int var5 = var1.endBit; // L: 40
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 41
		return Varps.Varps_main[var7] >> var4 & var6; // L: 42
	}
}
