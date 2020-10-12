import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
public class ObjectDefinition extends DualNode {
	@ObfuscatedName("z")
	public static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	public static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -316763003
	)
	public static int RunException_revision;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lee;"
	)
	static ModelData[] field3377;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1213282055
	)
	public int id;
	@ObfuscatedName("m")
	int[] modelIds;
	@ObfuscatedName("n")
	int[] models;
	@ObfuscatedName("d")
	public String name;
	@ObfuscatedName("h")
	short[] recolorFrom;
	@ObfuscatedName("a")
	short[] recolorTo;
	@ObfuscatedName("q")
	short[] retextureFrom;
	@ObfuscatedName("c")
	short[] retextureTo;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1077626397
	)
	public int sizeX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -2025374519
	)
	public int sizeY;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 890541759
	)
	public int interactType;
	@ObfuscatedName("j")
	public boolean boolean1;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -372778753
	)
	public int int1;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1406792895
	)
	int clipType;
	@ObfuscatedName("p")
	boolean nonFlatShading;
	@ObfuscatedName("b")
	public boolean modelClipped;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1020675379
	)
	public int animationId;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 926776109
	)
	public int int2;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1365611553
	)
	int ambient;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1927272841
	)
	int contrast;
	@ObfuscatedName("ao")
	public String[] actions;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 668674641
	)
	public int mapIconId;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -889777445
	)
	public int mapSceneId;
	@ObfuscatedName("am")
	boolean isRotated;
	@ObfuscatedName("ap")
	public boolean clipped;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -772733315
	)
	int modelSizeX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 616774407
	)
	int modelHeight;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 967285395
	)
	int modelSizeY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 574968885
	)
	int offsetX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1686483135
	)
	int offsetHeight;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1033480045
	)
	int offsetY;
	@ObfuscatedName("ah")
	public boolean boolean2;
	@ObfuscatedName("av")
	boolean isSolid;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1249127107
	)
	public int int3;
	@ObfuscatedName("as")
	public int[] transforms;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -654003283
	)
	int transformVarbit;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 528036607
	)
	int transformVarp;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -241145981
	)
	public int ambientSoundId;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 719354007
	)
	public int int4;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -402900319
	)
	public int int5;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1265456877
	)
	public int int6;
	@ObfuscatedName("af")
	public int[] soundEffectIds;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	IterableNodeHashTable params;

	static {
		ObjectDefinition_isLowDetail = false; // L: 17
		ObjectDefinition_cached = new EvictingDualNodeHashTable(4096); // L: 20
		ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500); // L: 21
		ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30); // L: 22
		ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30); // L: 23
		field3377 = new ModelData[4]; // L: 24
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1906131064"
	)
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkf;B)V",
		garbageValue = "81"
	)
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lkf;II)V",
		garbageValue = "1904388143"
	)
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedByte();
			if (var3 > 0) {
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
					var1.offset += var3 * 3;
				} else {
					this.models = new int[var3];
					this.modelIds = new int[var3];

					for (var4 = 0; var4 < var3; ++var4) { // L: 111
						this.modelIds[var4] = var1.readUnsignedShort(); // L: 112
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
					var1.offset += 2 * var3;
				} else {
					this.models = null;
					this.modelIds = new int[var3]; // L: 125

					for (var4 = 0; var4 < var3; ++var4) {
						this.modelIds[var4] = var1.readUnsignedShort();
					}
				}
			}
		} else if (var2 == 14) {
			this.sizeX = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.sizeY = var1.readUnsignedByte();
		} else if (var2 == 17) { // L: 133
			this.interactType = 0;
			this.boolean1 = false;
		} else if (var2 == 18) {
			this.boolean1 = false;
		} else if (var2 == 19) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 21) {
			this.clipType = 0;
		} else if (var2 == 22) { // L: 140
			this.nonFlatShading = true;
		} else if (var2 == 23) {
			this.modelClipped = true;
		} else if (var2 == 24) {
			this.animationId = var1.readUnsignedShort();
			if (this.animationId == 65535) {
				this.animationId = -1;
			}
		} else if (var2 == 27) {
			this.interactType = 1;
		} else if (var2 == 28) { // L: 147
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 29) {
			this.ambient = var1.readByte();
		} else if (var2 == 39) {
			this.contrast = var1.readByte() * 25;
		} else if (var2 >= 30 && var2 < 35) {
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 154
			var3 = var1.readUnsignedByte();
			this.recolorFrom = new short[var3];
			this.recolorTo = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.recolorFrom[var4] = (short)var1.readUnsignedShort();
				this.recolorTo[var4] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 41) {
			var3 = var1.readUnsignedByte();
			this.retextureFrom = new short[var3];
			this.retextureTo = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 168
				this.retextureTo[var4] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 62) {
			this.isRotated = true;
		} else if (var2 == 64) {
			this.clipped = false;
		} else if (var2 == 65) {
			this.modelSizeX = var1.readUnsignedShort();
		} else if (var2 == 66) { // L: 175
			this.modelHeight = var1.readUnsignedShort();
		} else if (var2 == 67) {
			this.modelSizeY = var1.readUnsignedShort();
		} else if (var2 == 68) {
			this.mapSceneId = var1.readUnsignedShort();
		} else if (var2 == 69) {
			var1.readUnsignedByte();
		} else if (var2 == 70) {
			this.offsetX = var1.readShort();
		} else if (var2 == 71) { // L: 182
			this.offsetHeight = var1.readShort();
		} else if (var2 == 72) { // L: 183
			this.offsetY = var1.readShort();
		} else if (var2 == 73) {
			this.boolean2 = true;
		} else if (var2 == 74) {
			this.isSolid = true;
		} else if (var2 == 75) {
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
				this.params = PacketWriter.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1733975131"
	)
	public final boolean method4703(int var1) {
		if (this.models != null) { // L: 224
			for (int var4 = 0; var4 < this.models.length; ++var4) { // L: 234
				if (this.models[var4] == var1) { // L: 235
					return DirectByteArrayCopier.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
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
				var2 &= DirectByteArrayCopier.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0); // L: 229
			}

			return var2; // L: 231
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1059534809"
	)
	public final boolean needsModelFiles() {
		if (this.modelIds == null) { // L: 242
			return true;
		} else {
			boolean var1 = true; // L: 243

			for (int var2 = 0; var2 < this.modelIds.length; ++var2) { // L: 244
				var1 &= DirectByteArrayCopier.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0); // L: 245
			}

			return var1; // L: 247
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIIB)Lez;",
		garbageValue = "14"
	)
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
			var9 = ((ModelData)var9).method2945(); // L: 268
		}

		if (this.clipType >= 0) { // L: 270
			if (var9 instanceof Model) { // L: 271
				var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData)var9).method2883(var3, var4, var5, var6, true, this.clipType); // L: 272
			}
		}

		return (Entity)var9; // L: 274
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIIB)Ler;",
		garbageValue = "-34"
	)
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILjm;II)Ler;",
		garbageValue = "929962963"
	)
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)Lee;",
		garbageValue = "1848667865"
	)
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
					var3 = ModelData.ModelData_get(DirectByteArrayCopier.ObjectDefinition_modelsArchive, var7 & 65535, 0); // L: 323
					if (var3 == null) { // L: 324
						return null;
					}

					if (var4) { // L: 325
						var3.method2892();
					}

					ObjectDefinition_cachedModelData.put(var3, (long)var7); // L: 326
				}

				if (var5 > 1) { // L: 328
					field3377[var6] = var3;
				}
			}

			if (var5 > 1) { // L: 330
				var3 = new ModelData(field3377, var5);
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
				var3 = ModelData.ModelData_get(DirectByteArrayCopier.ObjectDefinition_modelsArchive, var5 & 65535, 0); // L: 346
				if (var3 == null) { // L: 347
					return null;
				}

				if (var10) { // L: 348
					var3.method2892();
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
			var8.method2888(256); // L: 360
			var8.changeOffset(45, 0, -45); // L: 361
		}

		var2 &= 3; // L: 363
		if (var2 == 1) { // L: 364
			var8.method2885();
		} else if (var2 == 2) { // L: 365
			var8.method2886();
		} else if (var2 == 3) { // L: 366
			var8.method2881();
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Ljg;",
		garbageValue = "1360246605"
	)
	public final ObjectDefinition transform() {
		int var1 = -1; // L: 383
		if (this.transformVarbit != -1) { // L: 384
			var1 = WorldMapSection1.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 385
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 387
			var2 = this.transforms[var1]; // L: 388
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? MidiPcmStream.getObjectDefinition(var2) : null; // L: 389 390
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "1"
	)
	public int getIntParam(int var1, int var2) {
		return Username.method5309(this.params, var1, var2); // L: 394
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1714990387"
	)
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 399
		String var3;
		if (var4 == null) { // L: 401
			var3 = var2; // L: 402
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 405
			if (var5 == null) { // L: 406
				var3 = var2; // L: 407
			} else {
				var3 = (String)var5.obj; // L: 410
			}
		}

		return var3; // L: 412
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-95"
	)
	public boolean hasSound() {
		if (this.transforms == null) { // L: 423
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) { // L: 424
				if (this.transforms[var1] != -1) { // L: 425
					ObjectDefinition var2 = MidiPcmStream.getObjectDefinition(this.transforms[var1]); // L: 426
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) { // L: 427
						return true;
					}
				}
			}

			return false; // L: 430
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IILgk;Lft;I)Z",
		garbageValue = "-47009249"
	)
	static final boolean method4747(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0; // L: 98
		int var5 = var1; // L: 99
		byte var6 = 64; // L: 100
		byte var7 = 64; // L: 101
		int var8 = var0 - var6; // L: 102
		int var9 = var1 - var7; // L: 103
		class182.directions[var6][var7] = 99; // L: 104
		class182.distances[var6][var7] = 0; // L: 105
		byte var10 = 0; // L: 106
		int var11 = 0; // L: 107
		class182.bufferX[var10] = var0; // L: 108
		byte var10001 = var10;
		int var18 = var10 + 1;
		class182.bufferY[var10001] = var1; // L: 109
		int[][] var12 = var3.flags; // L: 110

		while (var18 != var11) { // L: 113
			var4 = class182.bufferX[var11]; // L: 114
			var5 = class182.bufferY[var11]; // L: 115
			var11 = var11 + 1 & 4095; // L: 116
			int var16 = var4 - var8; // L: 117
			int var17 = var5 - var9; // L: 118
			int var13 = var4 - var3.xInset; // L: 119
			int var14 = var5 - var3.yInset; // L: 120
			if (var2.hasArrived(1, var4, var5, var3)) { // L: 121
				class182.field2135 = var4; // L: 122
				class182.field2136 = var5; // L: 123
				return true; // L: 124
			}

			int var15 = class182.distances[var16][var17] + 1; // L: 126
			if (var16 > 0 && class182.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136776) == 0) { // L: 127
				class182.bufferX[var18] = var4 - 1; // L: 128
				class182.bufferY[var18] = var5; // L: 129
				var18 = var18 + 1 & 4095; // L: 130
				class182.directions[var16 - 1][var17] = 2; // L: 131
				class182.distances[var16 - 1][var17] = var15; // L: 132
			}

			if (var16 < 127 && class182.directions[var16 + 1][var17] == 0 && (var12[var13 + 1][var14] & 19136896) == 0) { // L: 134
				class182.bufferX[var18] = var4 + 1; // L: 135
				class182.bufferY[var18] = var5; // L: 136
				var18 = var18 + 1 & 4095; // L: 137
				class182.directions[var16 + 1][var17] = 8; // L: 138
				class182.distances[var16 + 1][var17] = var15; // L: 139
			}

			if (var17 > 0 && class182.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 141
				class182.bufferX[var18] = var4; // L: 142
				class182.bufferY[var18] = var5 - 1; // L: 143
				var18 = var18 + 1 & 4095; // L: 144
				class182.directions[var16][var17 - 1] = 1; // L: 145
				class182.distances[var16][var17 - 1] = var15; // L: 146
			}

			if (var17 < 127 && class182.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 148
				class182.bufferX[var18] = var4; // L: 149
				class182.bufferY[var18] = var5 + 1; // L: 150
				var18 = var18 + 1 & 4095; // L: 151
				class182.directions[var16][var17 + 1] = 4; // L: 152
				class182.distances[var16][var17 + 1] = var15; // L: 153
			}

			if (var16 > 0 && var17 > 0 && class182.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 155
				class182.bufferX[var18] = var4 - 1; // L: 156
				class182.bufferY[var18] = var5 - 1; // L: 157
				var18 = var18 + 1 & 4095; // L: 158
				class182.directions[var16 - 1][var17 - 1] = 3; // L: 159
				class182.distances[var16 - 1][var17 - 1] = var15; // L: 160
			}

			if (var16 < 127 && var17 > 0 && class182.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 162
				class182.bufferX[var18] = var4 + 1; // L: 163
				class182.bufferY[var18] = var5 - 1; // L: 164
				var18 = var18 + 1 & 4095; // L: 165
				class182.directions[var16 + 1][var17 - 1] = 9; // L: 166
				class182.distances[var16 + 1][var17 - 1] = var15; // L: 167
			}

			if (var16 > 0 && var17 < 127 && class182.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 169
				class182.bufferX[var18] = var4 - 1; // L: 170
				class182.bufferY[var18] = var5 + 1; // L: 171
				var18 = var18 + 1 & 4095; // L: 172
				class182.directions[var16 - 1][var17 + 1] = 6; // L: 173
				class182.distances[var16 - 1][var17 + 1] = var15; // L: 174
			}

			if (var16 < 127 && var17 < 127 && class182.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 1] & 19136992) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 176
				class182.bufferX[var18] = var4 + 1; // L: 177
				class182.bufferY[var18] = var5 + 1; // L: 178
				var18 = var18 + 1 & 4095; // L: 179
				class182.directions[var16 + 1][var17 + 1] = 12; // L: 180
				class182.distances[var16 + 1][var17 + 1] = var15; // L: 181
			}
		}

		class182.field2135 = var4; // L: 184
		class182.field2136 = var5; // L: 185
		return false; // L: 186
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILec;Lft;B)V",
		garbageValue = "-53"
	)
	static final void method4699(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Scene var7, CollisionMap var8) {
		ObjectDefinition var9 = MidiPcmStream.getObjectDefinition(var4); // L: 893
		int var10;
		int var11;
		if (var5 != 1 && var5 != 3) { // L: 896
			var10 = var9.sizeX; // L: 901
			var11 = var9.sizeY; // L: 902
		} else {
			var10 = var9.sizeY; // L: 897
			var11 = var9.sizeX; // L: 898
		}

		int var12;
		int var13;
		if (var10 + var2 <= 104) { // L: 908
			var12 = (var10 >> 1) + var2; // L: 909
			var13 = var2 + (var10 + 1 >> 1); // L: 910
		} else {
			var12 = var2; // L: 913
			var13 = var2 + 1; // L: 914
		}

		int var14;
		int var15;
		if (var3 + var11 <= 104) { // L: 916
			var14 = var3 + (var11 >> 1); // L: 917
			var15 = var3 + (var11 + 1 >> 1); // L: 918
		} else {
			var14 = var3; // L: 921
			var15 = var3 + 1; // L: 922
		}

		int[][] var16 = Tiles.Tiles_heights[var1]; // L: 924
		int var17 = var16[var13][var15] + var16[var12][var15] + var16[var12][var14] + var16[var13][var14] >> 2; // L: 925
		int var18 = (var2 << 7) + (var10 << 6); // L: 926
		int var19 = (var3 << 7) + (var11 << 6); // L: 927
		long var20 = class227.calculateTag(var2, var3, 2, var9.int1 == 0, var4); // L: 928
		int var22 = (var5 << 6) + var6; // L: 929
		if (var9.int3 == 1) { // L: 930
			var22 += 256;
		}

		Object var30;
		if (var6 == 22) { // L: 931
			if (var9.animationId == -1 && var9.transforms == null) {
				var30 = var9.getModel(22, var5, var16, var18, var17, var19); // L: 933
			} else {
				var30 = new DynamicObject(var4, 22, var5, var1, var2, var3, var9.animationId, true, (Entity)null); // L: 934
			}

			var7.newFloorDecoration(var0, var2, var3, var17, (Entity)var30, var20, var22); // L: 935
			if (var9.interactType == 1) { // L: 936
				var8.setBlockedByFloorDec(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) { // L: 939
			if (var6 >= 12) { // L: 947
				if (var9.animationId == -1 && var9.transforms == null) { // L: 949
					var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, true, (Entity)null); // L: 950
				}

				var7.method3263(var0, var2, var3, var17, 1, 1, (Entity)var30, 0, var20, var22); // L: 951
				if (var9.interactType != 0) { // L: 952
					var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
				}

			} else if (var6 == 0) { // L: 955
				if (var9.animationId == -1 && var9.transforms == null) { // L: 957
					var30 = var9.getModel(0, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 0, var5, var1, var2, var3, var9.animationId, true, (Entity)null); // L: 958
				}

				var7.newBoundaryObject(var0, var2, var3, var17, (Entity)var30, (Entity)null, Tiles.field524[var5], 0, var20, var22); // L: 959
				if (var9.interactType != 0) { // L: 960
					var8.method3630(var2, var3, var6, var5, var9.boolean1);
				}

			} else if (var6 == 1) { // L: 963
				if (var9.animationId == -1 && var9.transforms == null) { // L: 965
					var30 = var9.getModel(1, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 1, var5, var1, var2, var3, var9.animationId, true, (Entity)null); // L: 966
				}

				var7.newBoundaryObject(var0, var2, var3, var17, (Entity)var30, (Entity)null, Tiles.field525[var5], 0, var20, var22); // L: 967
				if (var9.interactType != 0) { // L: 968
					var8.method3630(var2, var3, var6, var5, var9.boolean1);
				}

			} else {
				int var23;
				if (var6 == 2) { // L: 971
					var23 = var5 + 1 & 3; // L: 972
					Object var25;
					Object var31;
					if (var9.animationId == -1 && var9.transforms == null) { // L: 975
						var31 = var9.getModel(2, var5 + 4, var16, var18, var17, var19); // L: 976
						var25 = var9.getModel(2, var23, var16, var18, var17, var19); // L: 977
					} else {
						var31 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var9.animationId, true, (Entity)null); // L: 980
						var25 = new DynamicObject(var4, 2, var23, var1, var2, var3, var9.animationId, true, (Entity)null); // L: 981
					}

					var7.newBoundaryObject(var0, var2, var3, var17, (Entity)var31, (Entity)var25, Tiles.field524[var5], Tiles.field524[var23], var20, var22); // L: 983
					if (var9.interactType != 0) { // L: 984
						var8.method3630(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 3) { // L: 987
					if (var9.animationId == -1 && var9.transforms == null) { // L: 989
						var30 = var9.getModel(3, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 3, var5, var1, var2, var3, var9.animationId, true, (Entity)null); // L: 990
					}

					var7.newBoundaryObject(var0, var2, var3, var17, (Entity)var30, (Entity)null, Tiles.field525[var5], 0, var20, var22); // L: 991
					if (var9.interactType != 0) { // L: 992
						var8.method3630(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 9) { // L: 995
					if (var9.animationId == -1 && var9.transforms == null) { // L: 997
						var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, true, (Entity)null); // L: 998
					}

					var7.method3263(var0, var2, var3, var17, 1, 1, (Entity)var30, 0, var20, var22); // L: 999
					if (var9.interactType != 0) { // L: 1000
						var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
					}

				} else if (var6 == 4) { // L: 1003
					if (var9.animationId == -1 && var9.transforms == null) {
						var30 = var9.getModel(4, var5, var16, var18, var17, var19); // L: 1005
					} else {
						var30 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, true, (Entity)null); // L: 1006
					}

					var7.newWallDecoration(var0, var2, var3, var17, (Entity)var30, (Entity)null, Tiles.field524[var5], 0, 0, 0, var20, var22); // L: 1007
				} else {
					long var24;
					Object var26;
					if (var6 == 5) { // L: 1010
						var23 = 16; // L: 1011
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 1012
						if (var24 != 0L) { // L: 1013
							var23 = MidiPcmStream.getObjectDefinition(UserComparator9.Entity_unpackID(var24)).int2;
						}

						if (var9.animationId == -1 && var9.transforms == null) { // L: 1015
							var26 = var9.getModel(4, var5, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, true, (Entity)null); // L: 1016
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Entity)var26, (Entity)null, Tiles.field524[var5], 0, var23 * Tiles.field517[var5], var23 * Tiles.field527[var5], var20, var22); // L: 1017
					} else if (var6 == 6) { // L: 1020
						var23 = 8; // L: 1021
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 1022
						if (var24 != 0L) { // L: 1023
							var23 = MidiPcmStream.getObjectDefinition(UserComparator9.Entity_unpackID(var24)).int2 / 2;
						}

						if (var9.animationId == -1 && var9.transforms == null) { // L: 1025
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, true, (Entity)null); // L: 1026
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Entity)var26, (Entity)null, 256, var5, var23 * Tiles.field534[var5], var23 * Tiles.field529[var5], var20, var22); // L: 1027
					} else if (var6 == 7) { // L: 1030
						int var29 = var5 + 2 & 3; // L: 1032
						if (var9.animationId == -1 && var9.transforms == null) { // L: 1033
							var30 = var9.getModel(4, var29 + 4, var16, var18, var17, var19);
						} else {
							var30 = new DynamicObject(var4, 4, var29 + 4, var1, var2, var3, var9.animationId, true, (Entity)null); // L: 1034
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Entity)var30, (Entity)null, 256, var29, 0, 0, var20, var22); // L: 1035
					} else if (var6 == 8) { // L: 1038
						var23 = 8; // L: 1039
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 1040
						if (var24 != 0L) { // L: 1041
							var23 = MidiPcmStream.getObjectDefinition(UserComparator9.Entity_unpackID(var24)).int2 / 2;
						}

						int var28 = var5 + 2 & 3; // L: 1044
						Object var27;
						if (var9.animationId == -1 && var9.transforms == null) { // L: 1045
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19); // L: 1046
							var27 = var9.getModel(4, var28 + 4, var16, var18, var17, var19); // L: 1047
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, true, (Entity)null); // L: 1050
							var27 = new DynamicObject(var4, 4, var28 + 4, var1, var2, var3, var9.animationId, true, (Entity)null); // L: 1051
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Entity)var26, (Entity)var27, 256, var5, var23 * Tiles.field534[var5], var23 * Tiles.field529[var5], var20, var22); // L: 1053
					}
				}
			}
		} else {
			if (var9.animationId == -1 && var9.transforms == null) { // L: 941
				var30 = var9.getModel(10, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 10, var5, var1, var2, var3, var9.animationId, true, (Entity)null); // L: 942
			}

			if (var30 != null) { // L: 943
				var7.method3263(var0, var2, var3, var17, var10, var11, (Entity)var30, var6 == 11 ? 256 : 0, var20, var22);
			}

			if (var9.interactType != 0) { // L: 944
				var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
			}

		}
	} // L: 937 945 953 961 969 985 993 1001 1008 1018 1028 1036 1054 1056
}
