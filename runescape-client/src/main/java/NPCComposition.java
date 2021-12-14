import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("NpcDefinition_archive")
	static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("NpcDefinition_modelArchive")
	static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -331797089
	)
	@Export("id")
	public int id;
	@ObfuscatedName("s")
	@Export("name")
	public String name;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1105192553
	)
	@Export("size")
	public int size;
	@ObfuscatedName("w")
	@Export("models")
	int[] models;
	@ObfuscatedName("n")
	int[] field1868;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1321910719
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2126414353
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 193178951
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1496902927
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 657119045
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -948360433
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1137840563
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("a")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("u")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("k")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("f")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("l")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("q")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -73157727
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1225342625
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1604465415
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("y")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 501191071
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1972567083
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1882963849
	)
	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2048479909
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("ax")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 463952331
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1210187925
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("au")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("av")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("ap")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		NpcDefinition_cached = new EvictingDualNodeHashTable(64);
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50);
	}

	NPCComposition() {
		this.name = "null";
		this.size = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.actions = new String[5];
		this.drawMapDot = true;
		this.combatLevel = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.isVisible = false;
		this.ambient = 0;
		this.contrast = 0;
		this.headIconPrayer = -1;
		this.rotation = 32;
		this.transformVarbit = -1;
		this.transformVarp = -1;
		this.isInteractable = true;
		this.isClickable = true;
		this.isFollower = false;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpi;S)V",
		garbageValue = "-18007"
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-470679088"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedByte();
			this.models = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.models[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 12) {
			this.size = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.idleSequence = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.walkSequence = var1.readUnsignedShort();
		} else if (var2 == 15) {
			this.turnLeftSequence = var1.readUnsignedShort();
		} else if (var2 == 16) {
			this.turnRightSequence = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.walkSequence = var1.readUnsignedShort();
			this.walkBackSequence = var1.readUnsignedShort();
			this.walkLeftSequence = var1.readUnsignedShort();
			this.walkRightSequence = var1.readUnsignedShort();
		} else if (var2 == 18) {
			var1.readUnsignedShort();
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
		} else if (var2 == 60) {
			var3 = var1.readUnsignedByte();
			this.field1868 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field1868[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) {
			this.drawMapDot = false;
		} else if (var2 == 95) {
			this.combatLevel = var1.readUnsignedShort();
		} else if (var2 == 97) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) {
			this.isVisible = true;
		} else if (var2 == 100) {
			this.ambient = var1.readByte();
		} else if (var2 == 101) {
			this.contrast = var1.readByte() * 5;
		} else if (var2 == 102) {
			this.headIconPrayer = var1.readUnsignedShort();
		} else if (var2 == 103) {
			this.rotation = var1.readUnsignedShort();
		} else if (var2 != 106 && var2 != 118) {
			if (var2 == 107) {
				this.isInteractable = false;
			} else if (var2 == 109) {
				this.isClickable = false;
			} else if (var2 == 111) {
				this.isFollower = true;
			} else if (var2 == 249) {
				this.params = Canvas.readStringIntParameters(var1, this.params);
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
			if (var2 == 118) {
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lgn;ILgn;II)Lgo;",
		garbageValue = "-1893596657"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.transforms != null) {
			NPCComposition var12 = this.transform();
			return var12 == null ? null : var12.getModel(var1, var2, var3, var4);
		} else {
			Model var5 = (Model)NpcDefinition_cachedModels.get((long)this.id);
			if (var5 == null) {
				boolean var6 = false;

				for (int var7 = 0; var7 < this.models.length; ++var7) {
					if (!NpcDefinition_modelArchive.tryLoadFile(this.models[var7], 0)) {
						var6 = true;
					}
				}

				if (var6) {
					return null;
				}

				ModelData[] var8 = new ModelData[this.models.length];

				int var9;
				for (var9 = 0; var9 < this.models.length; ++var9) {
					var8[var9] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.models[var9], 0);
				}

				ModelData var10;
				if (var8.length == 1) {
					var10 = var8[0];
				} else {
					var10 = new ModelData(var8, var8.length);
				}

				if (this.recolorFrom != null) {
					for (var9 = 0; var9 < this.recolorFrom.length; ++var9) {
						var10.recolor(this.recolorFrom[var9], this.recolorTo[var9]);
					}
				}

				if (this.retextureFrom != null) {
					for (var9 = 0; var9 < this.retextureFrom.length; ++var9) {
						var10.retexture(this.retextureFrom[var9], this.retextureTo[var9]);
					}
				}

				var5 = var10.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
				NpcDefinition_cachedModels.put(var5, (long)this.id);
			}

			Model var11;
			if (var1 != null && var3 != null) {
				var11 = var1.applyTransformations(var5, var2, var3, var4);
			} else if (var1 != null) {
				var11 = var1.transformActorModel(var5, var2);
			} else if (var3 != null) {
				var11 = var3.transformActorModel(var5, var4);
			} else {
				var11 = var5.toSharedSequenceModel(true);
			}

			if (this.widthScale != 128 || this.heightScale != 128) {
				var11.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var11;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Lge;",
		garbageValue = "-1923550269"
	)
	@Export("getModelData")
	public final ModelData getModelData() {
		if (this.transforms != null) {
			NPCComposition var7 = this.transform();
			return var7 == null ? null : var7.getModelData();
		} else if (this.field1868 == null) {
			return null;
		} else {
			boolean var1 = false;

			for (int var2 = 0; var2 < this.field1868.length; ++var2) {
				if (!NpcDefinition_modelArchive.tryLoadFile(this.field1868[var2], 0)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			} else {
				ModelData[] var5 = new ModelData[this.field1868.length];

				for (int var3 = 0; var3 < this.field1868.length; ++var3) {
					var5[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field1868[var3], 0);
				}

				ModelData var6;
				if (var5.length == 1) {
					var6 = var5[0];
				} else {
					var6 = new ModelData(var5, var5.length);
				}

				int var4;
				if (this.recolorFrom != null) {
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
					}
				}

				if (this.retextureFrom != null) {
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
					}
				}

				return var6;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lfi;",
		garbageValue = "-1327400638"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class273.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? WorldMapLabelSize.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "817839626"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = class273.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) {
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) {
				return this.transforms[var1] != -1;
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2014377522"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class12.method158(this.params, var1, var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1575325257"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return Skeleton.method3948(this.params, var1, var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I[BLmy;I)V",
		garbageValue = "1930490534"
	)
	static void method3321(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 0;
		var3.key = (long)var0;
		var3.data = var1;
		var3.archiveDisk = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		class174.method3383();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1572770567"
	)
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) {
			if (KeyHandler.field143 == KeyHandler.field145) {
				return false;
			} else {
				Players.field1247 = KeyHandler.field131[KeyHandler.field143];
				ModeWhere.field3954 = KeyHandler.field137[KeyHandler.field143];
				KeyHandler.field143 = KeyHandler.field143 + 1 & 127;
				return true;
			}
		}
	}
}
