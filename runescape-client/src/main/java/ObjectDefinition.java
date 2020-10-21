import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("ObjectDefinition")
public class ObjectDefinition extends DualNode {
	@ObfuscatedName("f")
	@Export("ObjectDefinition_isLowDetail")
	public static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("ObjectDefinition_archive")
	public static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("ObjectDefinition_cached")
	public static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("ObjectDefinition_cachedEntities")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("ObjectDefinition_cachedModels")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Len;"
	)
	static ModelData[] field3379;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1144020119
	)
	@Export("id")
	public int id;
	@ObfuscatedName("t")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("e")
	@Export("models")
	int[] models;
	@ObfuscatedName("o")
	@Export("name")
	public String name;
	@ObfuscatedName("n")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("x")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("p")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("r")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 665688687
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1504043589
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1832733497
	)
	@Export("interactType")
	public int interactType;
	@ObfuscatedName("w")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -435501345
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -281320601
	)
	@Export("clipType")
	int clipType;
	@ObfuscatedName("a")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("g")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1258044391
	)
	@Export("animationId")
	public int animationId;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1153154317
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1023450155
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1349857007
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ao")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 331561987
	)
	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -752210695
	)
	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("ar")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("ay")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -955663473
	)
	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1573303881
	)
	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1744645415
	)
	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -496099153
	)
	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1451477221
	)
	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 478900139
	)
	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("ag")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("aq")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 442915601
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("an")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1763689999
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -945520639
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 180816565
	)
	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 234374357
	)
	@Export("int4")
	public int int4;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1129170229
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -434593727
	)
	@Export("int6")
	public int int6;
	@ObfuscatedName("al")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		ObjectDefinition_isLowDetail = false; // L: 17
		ObjectDefinition_cached = new EvictingDualNodeHashTable(4096); // L: 20
		ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500); // L: 21
		ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30); // L: 22
		ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30); // L: 23
		field3379 = new ModelData[4]; // L: 24
	}

	ObjectDefinition() {
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
	} // L: 69

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "3611"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.int1 == -1) { // L: 88
			this.int1 = 0; // L: 89
			if (this.modelIds != null && (this.models == null || this.models[0] == 10)) { // L: 90
				this.int1 = 1;
			}

			for (int var1 = 0; var1 < 5; ++var1) { // L: 91
				if (this.actions[var1] != null) {
					this.int1 = 1;
				}
			}
		}

		if (this.int3 == -1) { // L: 93
			this.int3 = this.interactType != 0 ? 1 : 0;
		}

	} // L: 94

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "330449784"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 98
			if (var2 == 0) { // L: 99
				return; // L: 102
			}

			this.decodeNext(var1, var2); // L: 100
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lkb;II)V",
		garbageValue = "-1557493109"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 105
			var3 = var1.readUnsignedByte(); // L: 106
			if (var3 > 0) { // L: 107
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) { // L: 108
					var1.offset += 3 * var3; // L: 116
				} else {
					this.models = new int[var3]; // L: 109
					this.modelIds = new int[var3]; // L: 110

					for (var4 = 0; var4 < var3; ++var4) { // L: 111
						this.modelIds[var4] = var1.readUnsignedShort(); // L: 112
						this.models[var4] = var1.readUnsignedByte(); // L: 113
					}
				}
			}
		} else if (var2 == 2) { // L: 119
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 5) { // L: 120
			var3 = var1.readUnsignedByte(); // L: 121
			if (var3 > 0) { // L: 122
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) { // L: 123
					var1.offset += var3 * 2; // L: 128
				} else {
					this.models = null; // L: 124
					this.modelIds = new int[var3]; // L: 125

					for (var4 = 0; var4 < var3; ++var4) { // L: 126
						this.modelIds[var4] = var1.readUnsignedShort();
					}
				}
			}
		} else if (var2 == 14) { // L: 131
			this.sizeX = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 132
			this.sizeY = var1.readUnsignedByte();
		} else if (var2 == 17) { // L: 133
			this.interactType = 0; // L: 134
			this.boolean1 = false; // L: 135
		} else if (var2 == 18) { // L: 137
			this.boolean1 = false;
		} else if (var2 == 19) { // L: 138
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 21) { // L: 139
			this.clipType = 0;
		} else if (var2 == 22) { // L: 140
			this.nonFlatShading = true;
		} else if (var2 == 23) { // L: 141
			this.modelClipped = true;
		} else if (var2 == 24) { // L: 142
			this.animationId = var1.readUnsignedShort(); // L: 143
			if (this.animationId == 65535) { // L: 144
				this.animationId = -1;
			}
		} else if (var2 == 27) { // L: 146
			this.interactType = 1;
		} else if (var2 == 28) { // L: 147
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 29) { // L: 148
			this.ambient = var1.readByte();
		} else if (var2 == 39) { // L: 149
			this.contrast = var1.readByte() * 25;
		} else if (var2 >= 30 && var2 < 35) { // L: 150
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 151
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 152
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 154
			var3 = var1.readUnsignedByte(); // L: 155
			this.recolorFrom = new short[var3]; // L: 156
			this.recolorTo = new short[var3]; // L: 157

			for (var4 = 0; var4 < var3; ++var4) { // L: 158
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 159
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 160
			}
		} else if (var2 == 41) { // L: 163
			var3 = var1.readUnsignedByte(); // L: 164
			this.retextureFrom = new short[var3]; // L: 165
			this.retextureTo = new short[var3]; // L: 166

			for (var4 = 0; var4 < var3; ++var4) { // L: 167
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 168
				this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 169
			}
		} else if (var2 == 62) { // L: 172
			this.isRotated = true;
		} else if (var2 == 64) { // L: 173
			this.clipped = false;
		} else if (var2 == 65) { // L: 174
			this.modelSizeX = var1.readUnsignedShort();
		} else if (var2 == 66) { // L: 175
			this.modelHeight = var1.readUnsignedShort();
		} else if (var2 == 67) { // L: 176
			this.modelSizeY = var1.readUnsignedShort();
		} else if (var2 == 68) { // L: 177
			this.mapSceneId = var1.readUnsignedShort();
		} else if (var2 == 69) { // L: 178
			var1.readUnsignedByte(); // L: 179
		} else if (var2 == 70) { // L: 181
			this.offsetX = var1.readShort();
		} else if (var2 == 71) { // L: 182
			this.offsetHeight = var1.readShort();
		} else if (var2 == 72) { // L: 183
			this.offsetY = var1.readShort();
		} else if (var2 == 73) { // L: 184
			this.boolean2 = true;
		} else if (var2 == 74) { // L: 185
			this.isSolid = true;
		} else if (var2 == 75) { // L: 186
			this.int3 = var1.readUnsignedByte();
		} else if (var2 != 77 && var2 != 92) { // L: 187
			if (var2 == 78) { // L: 205
				this.ambientSoundId = var1.readUnsignedShort(); // L: 206
				this.int4 = var1.readUnsignedByte(); // L: 207
			} else if (var2 == 79) { // L: 209
				this.int5 = var1.readUnsignedShort(); // L: 210
				this.int6 = var1.readUnsignedShort(); // L: 211
				this.int4 = var1.readUnsignedByte(); // L: 212
				var3 = var1.readUnsignedByte(); // L: 213
				this.soundEffectIds = new int[var3]; // L: 214

				for (var4 = 0; var4 < var3; ++var4) { // L: 215
					this.soundEffectIds[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 81) { // L: 217
				this.clipType = var1.readUnsignedByte() * 256;
			} else if (var2 == 82) { // L: 218
				this.mapIconId = var1.readUnsignedShort();
			} else if (var2 == 249) { // L: 219
				this.params = InvDefinition.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort(); // L: 188
			if (this.transformVarbit == 65535) { // L: 189
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 190
			if (this.transformVarp == 65535) { // L: 191
				this.transformVarp = -1;
			}

			var3 = -1; // L: 192
			if (var2 == 92) { // L: 193
				var3 = var1.readUnsignedShort(); // L: 194
				if (var3 == 65535) { // L: 195
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte(); // L: 197
			this.transforms = new int[var4 + 2]; // L: 198

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 199
				this.transforms[var5] = var1.readUnsignedShort(); // L: 200
				if (this.transforms[var5] == 65535) { // L: 201
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 203
		}

	} // L: 221

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2129482612"
	)
	public final boolean method4764(int var1) {
		if (this.models != null) { // L: 224
			for (int var4 = 0; var4 < this.models.length; ++var4) { // L: 234
				if (this.models[var4] == var1) { // L: 235
					return GrandExchangeOfferAgeComparator.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
				}
			}

			return true; // L: 237
		} else if (this.modelIds == null) { // L: 225
			return true;
		} else if (var1 != 10) { // L: 226
			return true;
		} else {
			boolean var2 = true; // L: 227

			for (int var3 = 0; var3 < this.modelIds.length; ++var3) { // L: 228
				var2 &= GrandExchangeOfferAgeComparator.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0); // L: 229
			}

			return var2; // L: 231
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1494902856"
	)
	@Export("needsModelFiles")
	public final boolean needsModelFiles() {
		if (this.modelIds == null) { // L: 242
			return true;
		} else {
			boolean var1 = true; // L: 243

			for (int var2 = 0; var2 < this.modelIds.length; ++var2) { // L: 244
				var1 &= GrandExchangeOfferAgeComparator.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0); // L: 245
			}

			return var1; // L: 247
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lej;",
		garbageValue = "184382969"
	)
	@Export("getEntity")
	public final Entity getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) { // L: 252
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 253
		}

		Object var9 = (Entity)ObjectDefinition_cachedEntities.get(var7); // L: 254
		if (var9 == null) { // L: 255
			ModelData var10 = this.getModelData(var1, var2); // L: 256
			if (var10 == null) { // L: 257
				return null;
			}

			if (!this.nonFlatShading) { // L: 258
				var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			} else {
				var10.ambient = (short)(this.ambient + 64); // L: 260
				var10.contrast = (short)(this.contrast + 768); // L: 261
				var10.calculateVertexNormals(); // L: 262
				var9 = var10; // L: 263
			}

			ObjectDefinition_cachedEntities.put((DualNode)var9, var7); // L: 265
		}

		if (this.nonFlatShading) { // L: 267
			var9 = ((ModelData)var9).method2932(); // L: 268
		}

		if (this.clipType >= 0) { // L: 270
			if (var9 instanceof Model) { // L: 271
				var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData)var9).method2915(var3, var4, var5, var6, true, this.clipType); // L: 272
			}
		}

		return (Entity)var9; // L: 274
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Leh;",
		garbageValue = "1500455873"
	)
	@Export("getModel")
	public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) { // L: 279
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 280
		}

		Model var9 = (Model)ObjectDefinition_cachedModels.get(var7); // L: 281
		if (var9 == null) { // L: 282
			ModelData var10 = this.getModelData(var1, var2); // L: 283
			if (var10 == null) { // L: 284
				return null;
			}

			var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 285
			ObjectDefinition_cachedModels.put(var9, var7); // L: 286
		}

		if (this.clipType >= 0) {
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType); // L: 288
		}

		return var9; // L: 289
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILjg;II)Leh;",
		garbageValue = "-1950985762"
	)
	@Export("getModelDynamic")
	public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
		long var9;
		if (this.models == null) { // L: 294
			var9 = (long)(var2 + (this.id << 10));
		} else {
			var9 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 295
		}

		Model var11 = (Model)ObjectDefinition_cachedModels.get(var9); // L: 296
		if (var11 == null) { // L: 297
			ModelData var12 = this.getModelData(var1, var2); // L: 298
			if (var12 == null) { // L: 299
				return null;
			}

			var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 300
			ObjectDefinition_cachedModels.put(var11, var9); // L: 301
		}

		if (var7 == null && this.clipType == -1) { // L: 303
			return var11;
		} else {
			if (var7 != null) { // L: 304
				var11 = var7.transformObjectModel(var11, var8, var2);
			} else {
				var11 = var11.toSharedSequenceModel(true); // L: 305
			}

			if (this.clipType >= 0) { // L: 306
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType);
			}

			return var11; // L: 307
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)Len;",
		garbageValue = "20375829"
	)
	@Export("getModelData")
	final ModelData getModelData(int var1, int var2) {
		ModelData var3 = null; // L: 311
		boolean var4;
		int var5;
		int var7;
		if (this.models == null) { // L: 312
			if (var1 != 10) { // L: 313
				return null;
			}

			if (this.modelIds == null) { // L: 314
				return null;
			}

			var4 = this.isRotated; // L: 315
			if (var1 == 2 && var2 > 3) { // L: 316
				var4 = !var4;
			}

			var5 = this.modelIds.length; // L: 317

			for (int var6 = 0; var6 < var5; ++var6) { // L: 318
				var7 = this.modelIds[var6]; // L: 319
				if (var4) { // L: 320
					var7 += 65536;
				}

				var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var7); // L: 321
				if (var3 == null) { // L: 322
					var3 = ModelData.ModelData_get(GrandExchangeOfferAgeComparator.ObjectDefinition_modelsArchive, var7 & 65535, 0); // L: 323
					if (var3 == null) { // L: 324
						return null;
					}

					if (var4) { // L: 325
						var3.method2927();
					}

					ObjectDefinition_cachedModelData.put(var3, (long)var7); // L: 326
				}

				if (var5 > 1) { // L: 328
					field3379[var6] = var3;
				}
			}

			if (var5 > 1) { // L: 330
				var3 = new ModelData(field3379, var5);
			}
		} else {
			int var9 = -1; // L: 333

			for (var5 = 0; var5 < this.models.length; ++var5) { // L: 334
				if (this.models[var5] == var1) { // L: 335
					var9 = var5; // L: 336
					break;
				}
			}

			if (var9 == -1) { // L: 340
				return null;
			}

			var5 = this.modelIds[var9]; // L: 341
			boolean var10 = this.isRotated ^ var2 > 3; // L: 342
			if (var10) { // L: 343
				var5 += 65536;
			}

			var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var5); // L: 344
			if (var3 == null) { // L: 345
				var3 = ModelData.ModelData_get(GrandExchangeOfferAgeComparator.ObjectDefinition_modelsArchive, var5 & 65535, 0); // L: 346
				if (var3 == null) { // L: 347
					return null;
				}

				if (var10) { // L: 348
					var3.method2927();
				}

				ObjectDefinition_cachedModelData.put(var3, (long)var5); // L: 349
			}
		}

		if (this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128) { // L: 353
			var4 = false; // L: 354
		} else {
			var4 = true;
		}

		boolean var11;
		if (this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) { // L: 356
			var11 = false; // L: 357
		} else {
			var11 = true;
		}

		ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, null == this.recolorFrom, null == this.retextureFrom, true); // L: 358
		if (var1 == 4 && var2 > 3) { // L: 359
			var8.method2937(256); // L: 360
			var8.changeOffset(45, 0, -45); // L: 361
		}

		var2 &= 3; // L: 363
		if (var2 == 1) { // L: 364
			var8.method2940();
		} else if (var2 == 2) { // L: 365
			var8.method2921();
		} else if (var2 == 3) {
			var8.method2922(); // L: 366
		}

		if (this.recolorFrom != null) { // L: 367
			for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 368
				var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 369
			}
		}

		if (this.retextureFrom != null) { // L: 372
			for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 373
				var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 374
			}
		}

		if (var4) { // L: 377
			var8.resize(this.modelSizeX, this.modelHeight, this.modelSizeY);
		}

		if (var11) { // L: 378
			var8.changeOffset(this.offsetX, this.offsetHeight, this.offsetY);
		}

		return var8; // L: 379
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Lje;",
		garbageValue = "88"
	)
	@Export("transform")
	public final ObjectDefinition transform() {
		int var1 = -1; // L: 383
		if (this.transformVarbit != -1) { // L: 384
			var1 = ApproximateRouteStrategy.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 385
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 387
			var2 = this.transforms[var1]; // L: 388
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? ScriptEvent.getObjectDefinition(var2) : null; // L: 389 390
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "454435450"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 395
		int var3;
		if (var4 == null) { // L: 397
			var3 = var2; // L: 398
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 401
			if (var5 == null) { // L: 402
				var3 = var2; // L: 403
			} else {
				var3 = var5.integer; // L: 406
			}
		}

		return var3; // L: 408
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1210418513"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return WorldMapSection0.method307(this.params, var1, var2); // L: 412
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "926091252"
	)
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) { // L: 416
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) { // L: 417
				if (this.transforms[var1] != -1) { // L: 418
					ObjectDefinition var2 = ScriptEvent.getObjectDefinition(this.transforms[var1]); // L: 419
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) { // L: 420
						return true;
					}
				}
			}

			return false; // L: 423
		}
	}
}
