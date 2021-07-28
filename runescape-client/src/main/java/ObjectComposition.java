import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("s")
	@Export("ObjectDefinition_isLowDetail")
	static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("ObjectDefinition_archive")
	static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("ObjectDefinition_modelsArchive")
	static AbstractArchive ObjectDefinition_modelsArchive;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("ObjectDefinition_cached")
	static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("ObjectDefinition_cachedEntities")
	static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("ObjectDefinition_cachedModels")
	static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lgz;"
	)
	static ModelData[] field1740;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1408525445
	)
	@Export("id")
	public int id;
	@ObfuscatedName("x")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("r")
	@Export("models")
	int[] models;
	@ObfuscatedName("p")
	@Export("name")
	public String name;
	@ObfuscatedName("h")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("k")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("a")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("q")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -417605631
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1763413093
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -961392775
	)
	@Export("interactType")
	public int interactType;
	@ObfuscatedName("i")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1499417859
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1651761825
	)
	@Export("clipType")
	int clipType;
	@ObfuscatedName("z")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("d")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1978264697
	)
	@Export("animationId")
	public int animationId;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -918805855
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 562720051
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1077171653
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("am")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1571694919
	)
	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -703489529
	)
	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("aa")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("ab")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1511755789
	)
	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 623120399
	)
	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1557884319
	)
	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 18459679
	)
	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1121861285
	)
	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1080229989
	)
	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("ak")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("aj")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 79121755
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("af")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1865080169
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -684863883
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1856717161
	)
	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 98405363
	)
	public int field1779;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1845665365
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1527190911
	)
	@Export("int6")
	public int int6;
	@ObfuscatedName("ad")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("ac")
	public boolean field1733;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		ObjectDefinition_isLowDetail = false;
		ObjectDefinition_cached = new EvictingDualNodeHashTable(4096);
		ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500);
		ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30);
		ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30);
		field1740 = new ModelData[4];
	}

	ObjectComposition() {
		this.name = "null";
		this.sizeX = 1;
		this.sizeY = 1;
		this.interactType = 2;
		this.boolean1 = true;
		this.int1 = -1;
		this.clipType = -1;
		this.nonFlatShading = false;
		this.modelClipped = false;
		this.animationId = -1;
		this.int2 = 16;
		this.ambient = 0;
		this.contrast = 0;
		this.actions = new String[5];
		this.mapIconId = -1;
		this.mapSceneId = -1;
		this.isRotated = false;
		this.clipped = true;
		this.modelSizeX = 128;
		this.modelHeight = 128;
		this.modelSizeY = 128;
		this.offsetX = 0;
		this.offsetHeight = 0;
		this.offsetY = 0;
		this.boolean2 = false;
		this.isSolid = false;
		this.int3 = -1;
		this.transformVarbit = -1;
		this.transformVarp = -1;
		this.ambientSoundId = -1;
		this.field1779 = 0;
		this.int5 = 0;
		this.int6 = 0;
		this.field1733 = true;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-19"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.int1 == -1) {
			this.int1 = 0;
			if (this.modelIds != null && (this.models == null || this.models[0] == 10)) {
				this.int1 = 1;
			}

			for (int var1 = 0; var1 < 5; ++var1) {
				if (this.actions[var1] != null) {
					this.int1 = 1;
				}
			}
		}

		if (this.int3 == -1) {
			this.int3 = this.interactType != 0 ? 1 : 0;
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)V",
		garbageValue = "-1024516162"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lnv;II)V",
		garbageValue = "-673374839"
	)
	@Export("decodeNext")
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
					var1.offset += 2 * var3;
				} else {
					this.models = null;
					this.modelIds = new int[var3];

					for (var4 = 0; var4 < var3; ++var4) {
						this.modelIds[var4] = var1.readUnsignedShort();
					}
				}
			}
		} else if (var2 == 14) {
			this.sizeX = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.sizeY = var1.readUnsignedByte();
		} else if (var2 == 17) {
			this.interactType = 0;
			this.boolean1 = false;
		} else if (var2 == 18) {
			this.boolean1 = false;
		} else if (var2 == 19) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 21) {
			this.clipType = 0;
		} else if (var2 == 22) {
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
		} else if (var2 == 28) {
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
		} else if (var2 == 40) {
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
				this.retextureFrom[var4] = (short)var1.readUnsignedShort();
				this.retextureTo[var4] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 61) {
			var1.readUnsignedShort();
		} else if (var2 == 62) {
			this.isRotated = true;
		} else if (var2 == 64) {
			this.clipped = false;
		} else if (var2 == 65) {
			this.modelSizeX = var1.readUnsignedShort();
		} else if (var2 == 66) {
			this.modelHeight = var1.readUnsignedShort();
		} else if (var2 == 67) {
			this.modelSizeY = var1.readUnsignedShort();
		} else if (var2 == 68) {
			this.mapSceneId = var1.readUnsignedShort();
		} else if (var2 == 69) {
			var1.readUnsignedByte();
		} else if (var2 == 70) {
			this.offsetX = var1.readShort();
		} else if (var2 == 71) {
			this.offsetHeight = var1.readShort();
		} else if (var2 == 72) {
			this.offsetY = var1.readShort();
		} else if (var2 == 73) {
			this.boolean2 = true;
		} else if (var2 == 74) {
			this.isSolid = true;
		} else if (var2 == 75) {
			this.int3 = var1.readUnsignedByte();
		} else if (var2 != 77 && var2 != 92) {
			if (var2 == 78) {
				this.ambientSoundId = var1.readUnsignedShort();
				this.field1779 = var1.readUnsignedByte();
			} else if (var2 == 79) {
				this.int5 = var1.readUnsignedShort();
				this.int6 = var1.readUnsignedShort();
				this.field1779 = var1.readUnsignedByte();
				var3 = var1.readUnsignedByte();
				this.soundEffectIds = new int[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.soundEffectIds[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 81) {
				this.clipType = var1.readUnsignedByte() * 256;
			} else if (var2 == 82) {
				this.mapIconId = var1.readUnsignedShort();
			} else if (var2 == 89) {
				this.field1733 = false;
			} else if (var2 == 249) {
				this.params = ObjectSound.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			var3 = -1;
			if (var2 == 92) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "2"
	)
	public final boolean method2993(int var1) {
		if (this.models != null) {
			for (int var4 = 0; var4 < this.models.length; ++var4) {
				if (this.models[var4] == var1) {
					return ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
				}
			}

			return true;
		} else if (this.modelIds == null) {
			return true;
		} else if (var1 != 10) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.modelIds.length; ++var3) {
				var2 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0);
			}

			return var2;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1503088298"
	)
	@Export("needsModelFiles")
	public final boolean needsModelFiles() {
		if (this.modelIds == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.modelIds.length; ++var2) {
				var1 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0);
			}

			return var1;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIIB)Lgy;",
		garbageValue = "-49"
	)
	@Export("getEntity")
	public final Renderable getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) {
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10));
		}

		Object var9 = (Renderable)ObjectDefinition_cachedEntities.get(var7);
		if (var9 == null) {
			ModelData var10 = this.getModelData(var1, var2);
			if (var10 == null) {
				return null;
			}

			if (!this.nonFlatShading) {
				var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			} else {
				var10.ambient = (short)(this.ambient + 64);
				var10.contrast = (short)(this.contrast + 768);
				var10.calculateVertexNormals();
				var9 = var10;
			}

			ObjectDefinition_cachedEntities.put((DualNode)var9, var7);
		}

		if (this.nonFlatShading) {
			var9 = ((ModelData)var9).method3797();
		}

		if (this.clipType >= 0) {
			if (var9 instanceof Model) {
				var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData)var9).method3798(var3, var4, var5, var6, true, this.clipType);
			}
		}

		return (Renderable)var9;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lgl;",
		garbageValue = "-1635720896"
	)
	@Export("getModel")
	public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) {
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10));
		}

		Model var9 = (Model)ObjectDefinition_cachedModels.get(var7);
		if (var9 == null) {
			ModelData var10 = this.getModelData(var1, var2);
			if (var10 == null) {
				return null;
			}

			var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			ObjectDefinition_cachedModels.put(var9, var7);
		}

		if (this.clipType >= 0) {
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType);
		}

		return var9;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILfz;II)Lgl;",
		garbageValue = "-994387691"
	)
	@Export("getModelDynamic")
	public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
		long var9;
		if (this.models == null) {
			var9 = (long)(var2 + (this.id << 10));
		} else {
			var9 = (long)(var2 + (var1 << 3) + (this.id << 10));
		}

		Model var11 = (Model)ObjectDefinition_cachedModels.get(var9);
		if (var11 == null) {
			ModelData var12 = this.getModelData(var1, var2);
			if (var12 == null) {
				return null;
			}

			var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			ObjectDefinition_cachedModels.put(var11, var9);
		}

		if (var7 == null && this.clipType == -1) {
			return var11;
		} else {
			if (var7 != null) {
				var11 = var7.transformObjectModel(var11, var8, var2);
			} else {
				var11 = var11.toSharedSequenceModel(true);
			}

			if (this.clipType >= 0) {
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType);
			}

			return var11;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lgz;",
		garbageValue = "-6"
	)
	@Export("getModelData")
	final ModelData getModelData(int var1, int var2) {
		ModelData var3 = null;
		boolean var4;
		int var5;
		int var7;
		if (this.models == null) {
			if (var1 != 10) {
				return null;
			}

			if (this.modelIds == null) {
				return null;
			}

			var4 = this.isRotated;
			if (var1 == 2 && var2 > 3) {
				var4 = !var4;
			}

			var5 = this.modelIds.length;

			for (int var6 = 0; var6 < var5; ++var6) {
				var7 = this.modelIds[var6];
				if (var4) {
					var7 += 65536;
				}

				var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var7);
				if (var3 == null) {
					var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var7 & 65535, 0);
					if (var3 == null) {
						return null;
					}

					if (var4) {
						var3.method3807();
					}

					ObjectDefinition_cachedModelData.put(var3, (long)var7);
				}

				if (var5 > 1) {
					field1740[var6] = var3;
				}
			}

			if (var5 > 1) {
				var3 = new ModelData(field1740, var5);
			}
		} else {
			int var9 = -1;

			for (var5 = 0; var5 < this.models.length; ++var5) {
				if (this.models[var5] == var1) {
					var9 = var5;
					break;
				}
			}

			if (var9 == -1) {
				return null;
			}

			var5 = this.modelIds[var9];
			boolean var10 = this.isRotated ^ var2 > 3;
			if (var10) {
				var5 += 65536;
			}

			var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var5);
			if (var3 == null) {
				var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var5 & 65535, 0);
				if (var3 == null) {
					return null;
				}

				if (var10) {
					var3.method3807();
				}

				ObjectDefinition_cachedModelData.put(var3, (long)var5);
			}
		}

		if (this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128) {
			var4 = false;
		} else {
			var4 = true;
		}

		boolean var11;
		if (this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) {
			var11 = false;
		} else {
			var11 = true;
		}

		ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, null == this.recolorFrom, null == this.retextureFrom, true);
		if (var1 == 4 && var2 > 3) {
			var8.method3856(256);
			var8.changeOffset(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1) {
			var8.method3792();
		} else if (var2 == 2) {
			var8.method3801();
		} else if (var2 == 3) {
			var8.method3802();
		}

		if (this.recolorFrom != null) {
			for (var7 = 0; var7 < this.recolorFrom.length; ++var7) {
				var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]);
			}
		}

		if (this.retextureFrom != null) {
			for (var7 = 0; var7 < this.retextureFrom.length; ++var7) {
				var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]);
			}
		}

		if (var4) {
			var8.resize(this.modelSizeX, this.modelHeight, this.modelSizeY);
		}

		if (var11) {
			var8.changeOffset(this.offsetX, this.offsetHeight, this.offsetY);
		}

		return var8;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Lem;",
		garbageValue = "-1973196197"
	)
	@Export("transform")
	public final ObjectComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = WorldMapSection0.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? ClanChannel.getObjectDefinition(var2) : null;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-16980"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params;
		int var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = var5.integer;
			}
		}

		return var3;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "74"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params;
		String var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = (String)var5.obj;
			}
		}

		return var3;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1596304691"
	)
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) {
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) {
				if (this.transforms[var1] != -1) {
					ObjectComposition var2 = ClanChannel.getObjectDefinition(this.transforms[var1]);
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)Les;",
		garbageValue = "935857174"
	)
	public static HitSplatDefinition method3044(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-1246980701"
	)
	static boolean method3015(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class16.field87.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var10.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var5) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Object var3 = class14.method155(class16.applet, var2, new Object[]{(new URL(class16.applet.getCodeBase(), var0)).toString()});
				return var3 != null;
			} catch (Throwable var6) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class16.applet.getAppletContext().showDocument(new URL(class16.applet.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var7) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				class14.method148(class16.applet, "loggedout");
			} catch (Throwable var9) {
			}

			try {
				class16.applet.getAppletContext().showDocument(new URL(class16.applet.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lc;B)V",
		garbageValue = "81"
	)
	@Export("doCycleTitle")
	static void doCycleTitle(GameEngine var0) {
		int var2;
		int var3;
		int var32;
		if (Login.worldSelectOpen) {
			while (true) {
				if (!IgnoreList.isKeyDown()) {
					if (MouseHandler.MouseHandler_lastButton != 1 && (class310.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
						break;
					}

					int var1 = Login.xPadding + 280;
					if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						Language.changeWorldSelectSorting(0, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						Language.changeWorldSelectSorting(0, 1);
						break;
					}

					var2 = Login.xPadding + 390;
					if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						Language.changeWorldSelectSorting(1, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						Language.changeWorldSelectSorting(1, 1);
						break;
					}

					var3 = Login.xPadding + 500;
					if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						Language.changeWorldSelectSorting(2, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						Language.changeWorldSelectSorting(2, 1);
						break;
					}

					var32 = Login.xPadding + 610;
					if (MouseHandler.MouseHandler_lastPressedX >= var32 && MouseHandler.MouseHandler_lastPressedX <= var32 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						Language.changeWorldSelectSorting(3, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var32 + 15 && MouseHandler.MouseHandler_lastPressedX <= var32 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						Language.changeWorldSelectSorting(3, 1);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
						ClanSettings.method2422();
						break;
					}

					if (Login.hoveredWorldIndex != -1) {
						World var5 = class15.World_worlds[Login.hoveredWorldIndex];
						ItemComposition.changeWorld(var5);
						ClanSettings.method2422();
					} else {
						if (Login.worldSelectPage > 0 && class137.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class137.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= Client.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= Client.canvasHeight / 2 + 50) {
							--Login.worldSelectPage;
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && BuddyRankComparator.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= MouseRecorder.canvasWidth - BuddyRankComparator.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= MouseRecorder.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= Client.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= Client.canvasHeight / 2 + 50) {
							++Login.worldSelectPage;
						}
					}
					break;
				}

				if (class120.field1417 == 13) {
					ClanSettings.method2422();
					break;
				}

				if (class120.field1417 == 96) {
					if (Login.worldSelectPage > 0 && class137.worldSelectLeftSprite != null) {
						--Login.worldSelectPage;
					}
				} else if (class120.field1417 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && BuddyRankComparator.worldSelectRightSprite != null) {
					++Login.worldSelectPage;
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class310.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				Decimator.clientPreferences.titleMusicDisabled = !Decimator.clientPreferences.titleMusicDisabled;
				MilliClock.savePreferences();
				if (!Decimator.clientPreferences.titleMusicDisabled) {
					Archive var20 = class108.archive6;
					var2 = var20.getGroupId("scape main");
					var3 = var20.getFileId(var2, "");
					Players.method2022(var20, var2, var3, 255, false);
				} else {
					DynamicObject.method1727();
				}
			}

			if (Client.gameState != 5) {
				if (Login.field828 == -1L) {
					Login.field828 = UrlRequester.method2125() + 1000L;
				}

				long var21 = UrlRequester.method2125();
				if (class16.method173() && -1L == Login.field812) {
					Login.field812 = var21;
					if (Login.field812 > Login.field828) {
						Login.field828 = Login.field812;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					if (GrandExchangeOfferWorldComparator.clientLanguage == Language.Language_EN) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !class310.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var3 = Login.xPadding + 5;
							short var4 = 463;
							byte var23 = 100;
							byte var6 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + var23 && MouseHandler.MouseHandler_lastPressedY >= var4 && MouseHandler.MouseHandler_lastPressedY <= var6 + var4) {
								if (Strings.loadWorlds()) {
									Login.worldSelectOpen = true;
									Login.worldSelectPage = 0;
									Login.worldSelectPagesCount = 0;
								}

								return;
							}
						}

						if (NPC.World_request != null && Strings.loadWorlds()) {
							Login.worldSelectOpen = true;
							Login.worldSelectPage = 0;
							Login.worldSelectPagesCount = 0;
						}
					}

					var3 = MouseHandler.MouseHandler_lastButton;
					var32 = MouseHandler.MouseHandler_lastPressedX;
					int var43 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 == 0) {
						var32 = MouseHandler.MouseHandler_x;
						var43 = MouseHandler.MouseHandler_y;
					}

					if (!class310.mouseCam && var3 == 4) {
						var3 = 1;
					}

					short var35;
					int var36;
					if (Login.loginIndex == 0) {
						boolean var40 = false;

						while (IgnoreList.isKeyDown()) {
							if (class120.field1417 == 84) {
								var40 = true;
							}
						}

						var36 = WorldMapSection2.loginBoxCenter - 80;
						var35 = 291;
						if (var3 == 1 && var32 >= var36 - 75 && var32 <= var36 + 75 && var43 >= var35 - 20 && var43 <= var35 + 20) {
							InvDefinition.openURL(UserComparator5.method2167("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var36 = WorldMapSection2.loginBoxCenter + 80;
						if (var3 == 1 && var32 >= var36 - 75 && var32 <= var36 + 75 && var43 >= var35 - 20 && var43 <= var35 + 20 || var40) {
							if ((Client.worldProperties & 33554432) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								Login.loginIndex = 1;
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else if ((Client.worldProperties & 4) != 0) {
								if ((Client.worldProperties & 1024) != 0) {
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other almost everywhere";
									Login.Login_response3 = "and the Protect Item prayer won't work.";
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other";
									Login.Login_response3 = "almost everywhere.";
								}

								Login.Login_response0 = "Warning!";
								Login.loginIndex = 1;
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else if ((Client.worldProperties & 1024) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								Login.loginIndex = 1;
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else {
								class107.Login_promptCredentials(false);
							}
						}
					} else {
						short var7;
						int var33;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!IgnoreList.isKeyDown()) {
									var33 = WorldMapSection2.loginBoxCenter - 80;
									var7 = 321;
									if (var3 == 1 && var32 >= var33 - 75 && var32 <= var33 + 75 && var43 >= var7 - 20 && var43 <= var7 + 20) {
										class107.Login_promptCredentials(false);
									}

									var33 = WorldMapSection2.loginBoxCenter + 80;
									if (var3 == 1 && var32 >= var33 - 75 && var32 <= var33 + 75 && var43 >= var7 - 20 && var43 <= var7 + 20) {
										Login.loginIndex = 0;
									}
									break;
								}

								if (class120.field1417 == 84) {
									class107.Login_promptCredentials(false);
								} else if (class120.field1417 == 13) {
									Login.loginIndex = 0;
								}
							}
						} else {
							short var34;
							boolean var37;
							if (Login.loginIndex == 2) {
								var34 = 201;
								var33 = var34 + 52;
								if (var3 == 1 && var43 >= var33 - 12 && var43 < var33 + 2) {
									Login.currentLoginField = 0;
								}

								var33 += 15;
								if (var3 == 1 && var43 >= var33 - 12 && var43 < var33 + 2) {
									Login.currentLoginField = 1;
								}

								var33 += 15;
								var34 = 361;
								if (GameEngine.field127 != null) {
									var36 = GameEngine.field127.highX / 2;
									if (var3 == 1 && var32 >= GameEngine.field127.lowX - var36 && var32 <= var36 + GameEngine.field127.lowX && var43 >= var34 - 15 && var43 < var34) {
										switch(Login.field809) {
										case 1:
											Client.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
											Login.loginIndex = 5;
											return;
										case 2:
											InvDefinition.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var36 = WorldMapSection2.loginBoxCenter - 80;
								var35 = 321;
								if (var3 == 1 && var32 >= var36 - 75 && var32 <= var36 + 75 && var43 >= var35 - 20 && var43 <= var35 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										Client.setLoginResponseString("", "Please enter your username/email address.", "");
										return;
									}

									if (Login.Login_password.length() == 0) {
										Client.setLoginResponseString("", "Please enter your password.", "");
										return;
									}

									Client.setLoginResponseString("", "Connecting to server...", "");
									Interpreter.method1579(false);
									class16.updateGameState(20);
									return;
								}

								var36 = Login.loginBoxX + 180 + 80;
								if (var3 == 1 && var32 >= var36 - 75 && var32 <= var36 + 75 && var43 >= var35 - 20 && var43 <= var35 + 20) {
									Login.loginIndex = 0;
									Login.Login_username = "";
									Login.Login_password = "";
									class282.field3639 = 0;
									HorizontalAlignment.otp = "";
									Login.field820 = true;
								}

								var36 = WorldMapSection2.loginBoxCenter + -117;
								var35 = 277;
								Login.field829 = var32 >= var36 && var32 < var36 + ClanSettings.field1386 && var43 >= var35 && var43 < var35 + World.field704;
								if (var3 == 1 && Login.field829) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && Decimator.clientPreferences.rememberedUsername != null) {
										Decimator.clientPreferences.rememberedUsername = null;
										MilliClock.savePreferences();
									}
								}

								var36 = WorldMapSection2.loginBoxCenter + 24;
								var35 = 277;
								Login.field819 = var32 >= var36 && var32 < var36 + ClanSettings.field1386 && var43 >= var35 && var43 < var35 + World.field704;
								if (var3 == 1 && Login.field819) {
									Decimator.clientPreferences.hideUsername = !Decimator.clientPreferences.hideUsername;
									if (!Decimator.clientPreferences.hideUsername) {
										Login.Login_username = "";
										Decimator.clientPreferences.rememberedUsername = null;
										if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
											Login.currentLoginField = 1;
										} else {
											Login.currentLoginField = 0;
										}
									}

									MilliClock.savePreferences();
								}

								label1268:
								while (true) {
									Transferable var25;
									int var39;
									do {
										while (true) {
											char var38;
											label1182:
											do {
												while (true) {
													while (IgnoreList.isKeyDown()) {
														if (class120.field1417 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1182;
															}

															WorldMapRectangle.method3643(class126.field1449);
															if (class120.field1417 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (class120.field1417 == 84 || class120.field1417 == 80) {
																Login.currentLoginField = 1;
															}

															var38 = class126.field1449;
															var37 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var38) != -1;
															if (var37 && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + class126.field1449;
															}
														} else {
															Login.loginIndex = 0;
															Login.Login_username = "";
															Login.Login_password = "";
															class282.field3639 = 0;
															HorizontalAlignment.otp = "";
															Login.field820 = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (class120.field1417 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (class120.field1417 == 84 || class120.field1417 == 80) {
												Login.currentLoginField = 0;
												if (class120.field1417 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														Client.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}

													if (Login.Login_password.length() == 0) {
														Client.setLoginResponseString("", "Please enter your password.", "");
														return;
													}

													Client.setLoginResponseString("", "Connecting to server...", "");
													Interpreter.method1579(false);
													class16.updateGameState(20);
													return;
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && class120.field1417 == 67) {
												Clipboard var24 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var25 = var24.getContents(Script.client);
												var39 = 20 - Login.Login_password.length();
												break;
											}

											var38 = class126.field1449;
											if (var38 >= ' ' && var38 < 127 || var38 > 127 && var38 < 160 || var38 > 160 && var38 <= 255) {
												var37 = true;
											} else {
												label1410: {
													if (var38 != 0) {
														char[] var27 = class303.cp1252AsciiExtension;

														for (int var28 = 0; var28 < var27.length; ++var28) {
															char var13 = var27[var28];
															if (var13 == var38) {
																var37 = true;
																break label1410;
															}
														}
													}

													var37 = false;
												}
											}

											if (var37) {
												char var44 = class126.field1449;
												boolean var11 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var44) != -1;
												if (var11 && Login.Login_password.length() < 20) {
													Login.Login_password = Login.Login_password + class126.field1449;
												}
											}
										}
									} while(var39 <= 0);

									try {
										String var12 = (String)var25.getTransferData(DataFlavor.stringFlavor);
										int var41 = Math.min(var39, var12.length());
										int var14 = 0;

										while (true) {
											if (var14 >= var41) {
												Login.Login_password = Login.Login_password + var12.substring(0, var41);
												continue label1268;
											}

											char var16 = var12.charAt(var14);
											boolean var15;
											if (var16 >= ' ' && var16 < 127 || var16 > 127 && var16 < 160 || var16 > 160 && var16 <= 255) {
												var15 = true;
											} else {
												label1411: {
													if (var16 != 0) {
														char[] var17 = class303.cp1252AsciiExtension;

														for (int var18 = 0; var18 < var17.length; ++var18) {
															char var19 = var17[var18];
															if (var16 == var19) {
																var15 = true;
																break label1411;
															}
														}
													}

													var15 = false;
												}
											}

											if (!var15) {
												break;
											}

											char var42 = var12.charAt(var14);
											boolean var26 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var42) != -1;
											if (!var26) {
												break;
											}

											++var14;
										}

										Login.loginIndex = 3;
										return;
									} catch (UnsupportedFlavorException var30) {
									} catch (IOException var31) {
									}
								}
							} else if (Login.loginIndex == 3) {
								var33 = Login.loginBoxX + 180;
								var7 = 276;
								if (var3 == 1 && var32 >= var33 - 75 && var32 <= var33 + 75 && var43 >= var7 - 20 && var43 <= var7 + 20) {
									class107.Login_promptCredentials(false);
								}

								var33 = Login.loginBoxX + 180;
								var7 = 326;
								if (var3 == 1 && var32 >= var33 - 75 && var32 <= var33 + 75 && var43 >= var7 - 20 && var43 <= var7 + 20) {
									Client.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
									Login.loginIndex = 5;
									return;
								}
							} else {
								int var9;
								if (Login.loginIndex == 4) {
									var33 = Login.loginBoxX + 180 - 80;
									var7 = 321;
									if (var3 == 1 && var32 >= var33 - 75 && var32 <= var33 + 75 && var43 >= var7 - 20 && var43 <= var7 + 20) {
										HorizontalAlignment.otp.trim();
										if (HorizontalAlignment.otp.length() != 6) {
											Client.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											return;
										}

										class282.field3639 = Integer.parseInt(HorizontalAlignment.otp);
										HorizontalAlignment.otp = "";
										Interpreter.method1579(true);
										Client.setLoginResponseString("", "Connecting to server...", "");
										class16.updateGameState(20);
										return;
									}

									if (var3 == 1 && var32 >= Login.loginBoxX + 180 - 9 && var32 <= Login.loginBoxX + 180 + 130 && var43 >= 263 && var43 <= 296) {
										Login.field820 = !Login.field820;
									}

									if (var3 == 1 && var32 >= Login.loginBoxX + 180 - 34 && var32 <= Login.loginBoxX + 34 + 180 && var43 >= 351 && var43 <= 363) {
										InvDefinition.openURL(UserComparator5.method2167("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
									}

									var33 = Login.loginBoxX + 180 + 80;
									if (var3 == 1 && var32 >= var33 - 75 && var32 <= var33 + 75 && var43 >= var7 - 20 && var43 <= var7 + 20) {
										Login.loginIndex = 0;
										Login.Login_username = "";
										Login.Login_password = "";
										class282.field3639 = 0;
										HorizontalAlignment.otp = "";
									}

									while (IgnoreList.isKeyDown()) {
										boolean var8 = false;

										for (var9 = 0; var9 < "1234567890".length(); ++var9) {
											if (class126.field1449 == "1234567890".charAt(var9)) {
												var8 = true;
												break;
											}
										}

										if (class120.field1417 == 13) {
											Login.loginIndex = 0;
											Login.Login_username = "";
											Login.Login_password = "";
											class282.field3639 = 0;
											HorizontalAlignment.otp = "";
										} else {
											if (class120.field1417 == 85 && HorizontalAlignment.otp.length() > 0) {
												HorizontalAlignment.otp = HorizontalAlignment.otp.substring(0, HorizontalAlignment.otp.length() - 1);
											}

											if (class120.field1417 == 84) {
												HorizontalAlignment.otp.trim();
												if (HorizontalAlignment.otp.length() != 6) {
													Client.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													return;
												}

												class282.field3639 = Integer.parseInt(HorizontalAlignment.otp);
												HorizontalAlignment.otp = "";
												Interpreter.method1579(true);
												Client.setLoginResponseString("", "Connecting to server...", "");
												class16.updateGameState(20);
												return;
											}

											if (var8 && HorizontalAlignment.otp.length() < 6) {
												HorizontalAlignment.otp = HorizontalAlignment.otp + class126.field1449;
											}
										}
									}
								} else if (Login.loginIndex == 5) {
									var33 = Login.loginBoxX + 180 - 80;
									var7 = 321;
									if (var3 == 1 && var32 >= var33 - 75 && var32 <= var33 + 75 && var43 >= var7 - 20 && var43 <= var7 + 20) {
										ModeWhere.method5238();
										return;
									}

									var33 = Login.loginBoxX + 180 + 80;
									if (var3 == 1 && var32 >= var33 - 75 && var32 <= var33 + 75 && var43 >= var7 - 20 && var43 <= var7 + 20) {
										class107.Login_promptCredentials(true);
									}

									var35 = 361;
									if (class307.field3766 != null) {
										var9 = class307.field3766.highX / 2;
										if (var3 == 1 && var32 >= class307.field3766.lowX - var9 && var32 <= var9 + class307.field3766.lowX && var43 >= var35 - 15 && var43 < var35) {
											InvDefinition.openURL(UserComparator5.method2167("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
										}
									}

									while (IgnoreList.isKeyDown()) {
										var37 = false;

										for (int var10 = 0; var10 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var10) {
											if (class126.field1449 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var10)) {
												var37 = true;
												break;
											}
										}

										if (class120.field1417 == 13) {
											class107.Login_promptCredentials(true);
										} else {
											if (class120.field1417 == 85 && Login.Login_username.length() > 0) {
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (class120.field1417 == 84) {
												ModeWhere.method5238();
												return;
											}

											if (var37 && Login.Login_username.length() < 320) {
												Login.Login_username = Login.Login_username + class126.field1449;
											}
										}
									}
								} else if (Login.loginIndex != 6) {
									if (Login.loginIndex == 7) {
										var33 = Login.loginBoxX + 180 - 80;
										var7 = 321;
										if (var3 == 1 && var32 >= var33 - 75 && var32 <= var33 + 75 && var43 >= var7 - 20 && var43 <= var7 + 20) {
											InvDefinition.openURL(UserComparator5.method2167("secure", true) + "m=dob/set_dob.ws", true, false);
											Client.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var33 = Login.loginBoxX + 180 + 80;
										if (var3 == 1 && var32 >= var33 - 75 && var32 <= var33 + 75 && var43 >= var7 - 20 && var43 <= var7 + 20) {
											class107.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 8) {
										var33 = Login.loginBoxX + 180 - 80;
										var7 = 321;
										if (var3 == 1 && var32 >= var33 - 75 && var32 <= var33 + 75 && var43 >= var7 - 20 && var43 <= var7 + 20) {
											InvDefinition.openURL("https://www.jagex.com/terms/privacy", true, false);
											Client.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var33 = Login.loginBoxX + 180 + 80;
										if (var3 == 1 && var32 >= var33 - 75 && var32 <= var33 + 75 && var43 >= var7 - 20 && var43 <= var7 + 20) {
											class107.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 12) {
										String var29 = "";
										switch(Login.field804) {
										case 0:
											var29 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
											break;
										case 1:
											var29 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
											break;
										default:
											class107.Login_promptCredentials(false);
										}

										var36 = Login.loginBoxX + 180;
										var35 = 276;
										if (var3 == 1 && var32 >= var36 - 75 && var32 <= var36 + 75 && var43 >= var35 - 20 && var43 <= var35 + 20) {
											InvDefinition.openURL(var29, true, false);
											Client.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var36 = Login.loginBoxX + 180;
										var35 = 326;
										if (var3 == 1 && var32 >= var36 - 75 && var32 <= var36 + 75 && var43 >= var35 - 20 && var43 <= var35 + 20) {
											class107.Login_promptCredentials(false);
										}
									} else if (Login.loginIndex == 24) {
										var33 = Login.loginBoxX + 180;
										var7 = 301;
										if (var3 == 1 && var32 >= var33 - 75 && var32 <= var33 + 75 && var43 >= var7 - 20 && var43 <= var7 + 20) {
											class107.Login_promptCredentials(false);
										}
									}
								} else {
									while (true) {
										do {
											if (!IgnoreList.isKeyDown()) {
												var34 = 321;
												if (var3 == 1 && var43 >= var34 - 20 && var43 <= var34 + 20) {
													class107.Login_promptCredentials(true);
												}

												return;
											}
										} while(class120.field1417 != 84 && class120.field1417 != 13);

										class107.Login_promptCredentials(true);
									}
								}
							}
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljy;IS)Lof;",
		garbageValue = "-10826"
	)
	public static IndexedSprite method3046(AbstractArchive var0, int var1) {
		byte[] var3 = var0.takeFileFlat(var1);
		boolean var2;
		if (var3 == null) {
			var2 = false;
		} else {
			Occluder.SpriteBuffer_decode(var3);
			var2 = true;
		}

		if (!var2) {
			return null;
		} else {
			IndexedSprite var4 = new IndexedSprite();
			var4.width = class398.SpriteBuffer_spriteWidth;
			var4.height = class398.SpriteBuffer_spriteHeight;
			var4.xOffset = class398.SpriteBuffer_xOffsets[0];
			var4.yOffset = class398.SpriteBuffer_yOffsets[0];
			var4.subWidth = ClanChannelMember.SpriteBuffer_spriteWidths[0];
			var4.subHeight = class374.SpriteBuffer_spriteHeights[0];
			var4.palette = class118.SpriteBuffer_spritePalette;
			var4.pixels = class398.SpriteBuffer_pixels[0];
			class398.SpriteBuffer_xOffsets = null;
			class398.SpriteBuffer_yOffsets = null;
			ClanChannelMember.SpriteBuffer_spriteWidths = null;
			class374.SpriteBuffer_spriteHeights = null;
			class118.SpriteBuffer_spritePalette = null;
			class398.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(Lbx;B)V",
		garbageValue = "4"
	)
	static final void method3013(Actor var0) {
		var0.movementSequence = var0.idleSequence;
		if (var0.pathLength == 0) {
			var0.field1078 = 0;
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) {
				SequenceDefinition var1 = World.SequenceDefinition_get(var0.sequence);
				if (var0.field1066 > 0 && var1.field1867 == 0) {
					++var0.field1078;
					return;
				}

				if (var0.field1066 <= 0 && var1.field1859 == 0) {
					++var0.field1078;
					return;
				}
			}

			int var10 = var0.x;
			int var2 = var0.y;
			int var3 = var0.field1023 * 64 + var0.pathX[var0.pathLength - 1] * 128;
			int var4 = var0.field1023 * 64 + var0.pathY[var0.pathLength - 1] * 128;
			if (var10 < var3) {
				if (var2 < var4) {
					var0.orientation = 1280;
				} else if (var2 > var4) {
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536;
				}
			} else if (var10 > var3) {
				if (var2 < var4) {
					var0.orientation = 768;
				} else if (var2 > var4) {
					var0.orientation = 256;
				} else {
					var0.orientation = 512;
				}
			} else if (var2 < var4) {
				var0.orientation = 1024;
			} else if (var2 > var4) {
				var0.orientation = 0;
			}

			byte var5 = var0.pathTraversed[var0.pathLength - 1];
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) {
				int var6 = var0.orientation - var0.rotation & 2047;
				if (var6 > 1024) {
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence;
				if (var6 >= -256 && var6 <= 256) {
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) {
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) {
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) {
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7;
				int var8 = 4;
				boolean var9 = true;
				if (var0 instanceof NPC) {
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) {
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1074 != 0) {
						var8 = 2;
					}

					if (var0.pathLength > 2) {
						var8 = 6;
					}

					if (var0.pathLength > 3) {
						var8 = 8;
					}

					if (var0.field1078 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1078;
					}
				} else {
					if (var0.pathLength > 1) {
						var8 = 6;
					}

					if (var0.pathLength > 2) {
						var8 = 8;
					}

					if (var0.field1078 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1078;
					}
				}

				if (var5 == 2) {
					var8 <<= 1;
				}

				if (var8 >= 8 && var0.movementSequence == var0.walkSequence && var0.runSequence != -1) {
					var0.movementSequence = var0.runSequence;
				}

				if (var3 != var10 || var4 != var2) {
					if (var10 < var3) {
						var0.x += var8;
						if (var0.x > var3) {
							var0.x = var3;
						}
					} else if (var10 > var3) {
						var0.x -= var8;
						if (var0.x < var3) {
							var0.x = var3;
						}
					}

					if (var2 < var4) {
						var0.y += var8;
						if (var0.y > var4) {
							var0.y = var4;
						}
					} else if (var2 > var4) {
						var0.y -= var8;
						if (var0.y < var4) {
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) {
					--var0.pathLength;
					if (var0.field1066 > 0) {
						--var0.field1066;
					}
				}

			} else {
				var0.x = var3;
				var0.y = var4;
				--var0.pathLength;
				if (var0.field1066 > 0) {
					--var0.field1066;
				}

			}
		}
	}
}
