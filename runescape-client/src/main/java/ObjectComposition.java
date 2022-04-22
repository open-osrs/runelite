import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("tp")
	@ObfuscatedGetter(
		intValue = -1270169191
	)
	static int field2065;
	@ObfuscatedName("v")
	@Export("ObjectDefinition_isLowDetail")
	public static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("ObjectDefinition_modelsArchive")
	public static AbstractArchive ObjectDefinition_modelsArchive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("ObjectDefinition_cached")
	static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("ObjectDefinition_cachedEntities")
	static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("ObjectDefinition_cachedModels")
	static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lhc;"
	)
	static ModelData[] field2020;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1590595383
	)
	@Export("id")
	public int id;
	@ObfuscatedName("o")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("r")
	@Export("models")
	int[] models;
	@ObfuscatedName("p")
	@Export("name")
	public String name;
	@ObfuscatedName("w")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("k")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("d")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("m")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2085287383
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -876347031
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1883412293
	)
	@Export("interactType")
	public int interactType;
	@ObfuscatedName("x")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -906830101
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -763814967
	)
	@Export("clipType")
	int clipType;
	@ObfuscatedName("j")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("e")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -163974259
	)
	@Export("animationId")
	public int animationId;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2136398039
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1916202791
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -726394467
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("aw")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2034901073
	)
	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -297146651
	)
	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("ao")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("aj")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1276797079
	)
	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -64921
	)
	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -473772847
	)
	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -852003755
	)
	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 232493773
	)
	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1389514563
	)
	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("ah")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("ac")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1878888665
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("au")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -729176201
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2043045051
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1644497933
	)
	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1328611557
	)
	@Export("int7")
	public int int7;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -171517787
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 398628539
	)
	@Export("int6")
	public int int6;
	@ObfuscatedName("az")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("as")
	@Export("boolean3")
	public boolean boolean3;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		ObjectDefinition_isLowDetail = false; // L: 17
		ObjectDefinition_cached = new EvictingDualNodeHashTable(4096);
		ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500);
		ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30);
		ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30);
		field2020 = new ModelData[4];
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
		this.isSolid = false;
		this.int3 = -1;
		this.transformVarbit = -1;
		this.transformVarp = -1; // L: 61
		this.ambientSoundId = -1;
		this.int7 = 0;
		this.int5 = 0; // L: 64
		this.int6 = 0; // L: 65
		this.boolean3 = true; // L: 67
	} // L: 70

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-1801029007"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-1971745226"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 106
			var3 = var1.readUnsignedByte(); // L: 107
			if (var3 > 0) { // L: 108
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) { // L: 109
					var1.offset += var3 * 3; // L: 117
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
		} else if (var2 == 61) { // L: 173
			var1.readUnsignedShort(); // L: 174
		} else if (var2 == 62) { // L: 176
			this.isRotated = true;
		} else if (var2 == 64) { // L: 177
			this.clipped = false;
		} else if (var2 == 65) { // L: 178
			this.modelSizeX = var1.readUnsignedShort();
		} else if (var2 == 66) { // L: 179
			this.modelHeight = var1.readUnsignedShort();
		} else if (var2 == 67) { // L: 180
			this.modelSizeY = var1.readUnsignedShort();
		} else if (var2 == 68) { // L: 181
			this.mapSceneId = var1.readUnsignedShort();
		} else if (var2 == 69) { // L: 182
			var1.readUnsignedByte(); // L: 183
		} else if (var2 == 70) { // L: 185
			this.offsetX = var1.readShort();
		} else if (var2 == 71) { // L: 186
			this.offsetHeight = var1.readShort();
		} else if (var2 == 72) { // L: 187
			this.offsetY = var1.readShort();
		} else if (var2 == 73) { // L: 188
			this.boolean2 = true;
		} else if (var2 == 74) { // L: 189
			this.isSolid = true;
		} else if (var2 == 75) { // L: 190
			this.int3 = var1.readUnsignedByte();
		} else if (var2 != 77 && var2 != 92) { // L: 191
			if (var2 == 78) { // L: 209
				this.ambientSoundId = var1.readUnsignedShort(); // L: 210
				this.int7 = var1.readUnsignedByte(); // L: 211
			} else if (var2 == 79) { // L: 213
				this.int5 = var1.readUnsignedShort(); // L: 214
				this.int6 = var1.readUnsignedShort(); // L: 215
				this.int7 = var1.readUnsignedByte(); // L: 216
				var3 = var1.readUnsignedByte(); // L: 217
				this.soundEffectIds = new int[var3]; // L: 218

				for (var4 = 0; var4 < var3; ++var4) { // L: 219
					this.soundEffectIds[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 81) { // L: 221
				this.clipType = var1.readUnsignedByte() * 256;
			} else if (var2 == 82) { // L: 222
				this.mapIconId = var1.readUnsignedShort();
			} else if (var2 == 89) { // L: 223
				this.boolean3 = false;
			} else if (var2 == 249) { // L: 224
				this.params = class214.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort(); // L: 192
			if (this.transformVarbit == 65535) { // L: 193
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 194
			if (this.transformVarp == 65535) { // L: 195
				this.transformVarp = -1;
			}

			var3 = -1; // L: 196
			if (var2 == 92) { // L: 197
				var3 = var1.readUnsignedShort(); // L: 198
				if (var3 == 65535) { // L: 199
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte(); // L: 201
			this.transforms = new int[var4 + 2]; // L: 202

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 203
				this.transforms[var5] = var1.readUnsignedShort(); // L: 204
				if (this.transforms[var5] == 65535) { // L: 205
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 207
		}

	} // L: 226

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "683516334"
	)
	public final boolean method3664(int var1) {
		if (this.models != null) { // L: 229
			for (int var4 = 0; var4 < this.models.length; ++var4) { // L: 239
				if (this.models[var4] == var1) { // L: 240
					return ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
				}
			}

			return true; // L: 242
		} else if (this.modelIds == null) { // L: 230
			return true;
		} else if (var1 != 10) { // L: 231
			return true;
		} else {
			boolean var2 = true; // L: 232

			for (int var3 = 0; var3 < this.modelIds.length; ++var3) { // L: 233
				var2 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0); // L: 234
			}

			return var2; // L: 236
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1481046668"
	)
	@Export("needsModelFiles")
	public final boolean needsModelFiles() {
		if (this.modelIds == null) { // L: 247
			return true;
		} else {
			boolean var1 = true; // L: 248

			for (int var2 = 0; var2 < this.modelIds.length; ++var2) { // L: 249
				var1 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0); // L: 250
			}

			return var1; // L: 252
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIIB)Lix;",
		garbageValue = "84"
	)
	@Export("getEntity")
	public final Renderable getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) { // L: 257
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 258
		}

		Object var9 = (Renderable)ObjectDefinition_cachedEntities.get(var7); // L: 259
		if (var9 == null) { // L: 260
			ModelData var10 = this.getModelData(var1, var2); // L: 261
			if (var10 == null) { // L: 262
				return null;
			}

			if (!this.nonFlatShading) { // L: 263
				var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			} else {
				var10.ambient = (short)(this.ambient + 64); // L: 265
				var10.contrast = (short)(this.contrast + 768); // L: 266
				var10.calculateVertexNormals(); // L: 267
				var9 = var10; // L: 268
			}

			ObjectDefinition_cachedEntities.put((DualNode)var9, var7); // L: 270
		}

		if (this.nonFlatShading) { // L: 272
			var9 = ((ModelData)var9).copyModelData(); // L: 273
		}

		if (this.clipType >= 0) { // L: 275
			if (var9 instanceof Model) { // L: 276
				var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData)var9).method4517(var3, var4, var5, var6, true, this.clipType); // L: 277
			}
		}

		return (Renderable)var9; // L: 279
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Liq;",
		garbageValue = "-261368298"
	)
	@Export("getModel")
	public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) { // L: 284
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 285
		}

		Model var9 = (Model)ObjectDefinition_cachedModels.get(var7); // L: 286
		if (var9 == null) { // L: 287
			ModelData var10 = this.getModelData(var1, var2); // L: 288
			if (var10 == null) { // L: 289
				return null;
			}

			var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 290
			ObjectDefinition_cachedModels.put(var9, var7); // L: 291
		}

		if (this.clipType >= 0) {
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType); // L: 293
		}

		return var9; // L: 294
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILgw;II)Liq;",
		garbageValue = "1099870493"
	)
	@Export("getModelDynamic")
	public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
		long var9;
		if (this.models == null) { // L: 299
			var9 = (long)(var2 + (this.id << 10));
		} else {
			var9 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 300
		}

		Model var11 = (Model)ObjectDefinition_cachedModels.get(var9); // L: 301
		if (var11 == null) { // L: 302
			ModelData var12 = this.getModelData(var1, var2); // L: 303
			if (var12 == null) { // L: 304
				return null;
			}

			var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 305
			ObjectDefinition_cachedModels.put(var11, var9); // L: 306
		}

		if (var7 == null && this.clipType == -1) { // L: 308
			return var11;
		} else {
			if (var7 != null) { // L: 309
				var11 = var7.transformObjectModel(var11, var8, var2); // L: 310
			} else {
				var11 = var11.toSharedSequenceModel(true); // L: 312
			}

			if (this.clipType >= 0) { // L: 313
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType);
			}

			return var11; // L: 314
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)Lhc;",
		garbageValue = "1620081906"
	)
	@Export("getModelData")
	final ModelData getModelData(int var1, int var2) {
		ModelData var3 = null; // L: 318
		boolean var4;
		int var5;
		int var7;
		if (this.models == null) { // L: 319
			if (var1 != 10) { // L: 320
				return null;
			}

			if (this.modelIds == null) { // L: 321
				return null;
			}

			var4 = this.isRotated; // L: 322
			if (var1 == 2 && var2 > 3) { // L: 323
				var4 = !var4;
			}

			var5 = this.modelIds.length; // L: 324

			for (int var6 = 0; var6 < var5; ++var6) { // L: 325
				var7 = this.modelIds[var6]; // L: 326
				if (var4) { // L: 327
					var7 += 65536;
				}

				var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var7); // L: 328
				if (var3 == null) { // L: 329
					var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var7 & 65535, 0); // L: 330
					if (var3 == null) { // L: 331
						return null;
					}

					if (var4) { // L: 332
						var3.method4526();
					}

					ObjectDefinition_cachedModelData.put(var3, (long)var7); // L: 333
				}

				if (var5 > 1) { // L: 335
					field2020[var6] = var3;
				}
			}

			if (var5 > 1) { // L: 337
				var3 = new ModelData(field2020, var5);
			}
		} else {
			int var9 = -1; // L: 340

			for (var5 = 0; var5 < this.models.length; ++var5) { // L: 341
				if (this.models[var5] == var1) { // L: 342
					var9 = var5; // L: 343
					break;
				}
			}

			if (var9 == -1) { // L: 347
				return null;
			}

			var5 = this.modelIds[var9]; // L: 348
			boolean var10 = this.isRotated ^ var2 > 3; // L: 349
			if (var10) { // L: 350
				var5 += 65536;
			}

			var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var5); // L: 351
			if (var3 == null) { // L: 352
				var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var5 & 65535, 0); // L: 353
				if (var3 == null) { // L: 354
					return null;
				}

				if (var10) { // L: 355
					var3.method4526();
				}

				ObjectDefinition_cachedModelData.put(var3, (long)var5); // L: 356
			}
		}

		if (this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128) { // L: 360
			var4 = false; // L: 361
		} else {
			var4 = true;
		}

		boolean var11;
		if (this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) { // L: 363
			var11 = false; // L: 364
		} else {
			var11 = true;
		}

		ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, null == this.recolorFrom, this.retextureFrom == null, true); // L: 365
		if (var1 == 4 && var2 > 3) { // L: 366
			var8.method4512(256); // L: 367
			var8.changeOffset(45, 0, -45); // L: 368
		}

		var2 &= 3; // L: 370
		if (var2 == 1) { // L: 371
			var8.method4553();
		} else if (var2 == 2) { // L: 372
			var8.method4520();
		} else if (var2 == 3) { // L: 373
			var8.method4521();
		}

		if (this.recolorFrom != null) { // L: 374
			for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 375
				var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 376
			}
		}

		if (this.retextureFrom != null) { // L: 379
			for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 380
				var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 381
			}
		}

		if (var4) { // L: 384
			var8.resize(this.modelSizeX, this.modelHeight, this.modelSizeY);
		}

		if (var11) { // L: 385
			var8.changeOffset(this.offsetX, this.offsetHeight, this.offsetY);
		}

		return var8; // L: 386
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Lgj;",
		garbageValue = "32"
	)
	@Export("transform")
	public final ObjectComposition transform() {
		int var1 = -1; // L: 390
		if (this.transformVarbit != -1) { // L: 391
			var1 = SecureRandomCallable.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 392
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 394
			var2 = this.transforms[var1]; // L: 395
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class146.getObjectDefinition(var2) : null; // L: 396 397
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "104"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 402
		int var3;
		if (var4 == null) { // L: 404
			var3 = var2; // L: 405
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 408
			if (var5 == null) { // L: 409
				var3 = var2; // L: 410
			} else {
				var3 = var5.integer; // L: 413
			}
		}

		return var3; // L: 415
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1640621220"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 420
		String var3;
		if (var4 == null) { // L: 422
			var3 = var2; // L: 423
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 426
			if (var5 == null) { // L: 427
				var3 = var2; // L: 428
			} else {
				var3 = (String)var5.obj; // L: 431
			}
		}

		return var3; // L: 433
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "45"
	)
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) { // L: 444
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) { // L: 445
				if (this.transforms[var1] != -1) { // L: 446
					ObjectComposition var2 = class146.getObjectDefinition(this.transforms[var1]); // L: 447
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) { // L: 448
						return true;
					}
				}
			}

			return false; // L: 451
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lgh;",
		garbageValue = "2086980764"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0); // L: 19
		if (var1 != null) { // L: 20
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0); // L: 21
			var1 = new StructComposition(); // L: 22
			if (var2 != null) { // L: 23
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 24
			StructComposition.StructDefinition_cached.put(var1, (long)var0); // L: 25
			return var1; // L: 26
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1937470798"
	)
	static void method3674() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 57

		while (var0.hasNext()) { // L: 62
			Message var1 = (Message)var0.next(); // L: 58
			var1.clearIsFromFriend(); // L: 60
		}

	} // L: 63
}
