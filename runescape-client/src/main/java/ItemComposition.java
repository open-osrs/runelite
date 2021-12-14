import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		intValue = -575992025
	)
	static int field2012;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("ItemDefinition_archive")
	public static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("ItemDefinition_modelArchive")
	public static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("w")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("ItemDefinition_fontPlain11")
	public static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1056452933
	)
	@Export("id")
	public int id;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1122356155
	)
	@Export("model")
	int model;
	@ObfuscatedName("e")
	@Export("name")
	public String name;
	@ObfuscatedName("a")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("u")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("k")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("f")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1612089485
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -445824849
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1767659533
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 547197917
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -542264735
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1748492179
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1047812369
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 326872881
	)
	@Export("price")
	public int price;
	@ObfuscatedName("ab")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("an")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("ax")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 585263195
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1754702929
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1229327453
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1821904571
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -566580505
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 712412985
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1647130303
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1243746565
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -406589007
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -877542961
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1959608945
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 374790397
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -536039645
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("ai")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("aq")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1722248339
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1407959301
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1476022955
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1443694429
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1861562583
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -802891381
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -295235459
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 321478069
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bg")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -903292985
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 872396697
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -727274909
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1009467285
	)
	@Export("placeholderTemplate")
	public int placeholderTemplate;

	static {
		ItemDefinition_cached = new EvictingDualNodeHashTable(64);
		ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50);
		ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200);
	}

	ItemComposition() {
		this.name = "null";
		this.zoom2d = 2000;
		this.xan2d = 0;
		this.yan2d = 0;
		this.zan2d = 0;
		this.offsetX2d = 0;
		this.offsetY2d = 0;
		this.isStackable = 0;
		this.price = 1;
		this.isMembersOnly = false;
		this.groundActions = new String[]{null, null, "Take", null, null};
		this.inventoryActions = new String[]{null, null, null, null, "Drop"};
		this.shiftClickIndex = -2;
		this.maleModel = -1;
		this.maleModel1 = -1;
		this.maleOffset = 0;
		this.femaleModel = -1;
		this.femaleModel1 = -1;
		this.femaleOffset = 0;
		this.maleModel2 = -1;
		this.femaleModel2 = -1;
		this.maleHeadModel = -1;
		this.maleHeadModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.note = -1;
		this.noteTemplate = -1;
		this.resizeX = 128;
		this.resizeY = 128;
		this.resizeZ = 128;
		this.ambient = 0;
		this.contrast = 0;
		this.team = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1;
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "220335721"
	)
	@Export("post")
	void post() {
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-1454281188"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "614260145"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.offsetX2d = var1.readUnsignedShort();
			if (this.offsetX2d > 32767) {
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) {
			this.offsetY2d = var1.readUnsignedShort();
			if (this.offsetY2d > 32767) {
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) {
			var1.readStringCp1252NullTerminated();
		} else if (var2 == 11) {
			this.isStackable = 1;
		} else if (var2 == 12) {
			this.price = var1.readInt();
		} else if (var2 == 16) {
			this.isMembersOnly = true;
		} else if (var2 == 23) {
			this.maleModel = var1.readUnsignedShort();
			this.maleOffset = var1.readUnsignedByte();
		} else if (var2 == 24) {
			this.maleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) {
			this.femaleModel = var1.readUnsignedShort();
			this.femaleOffset = var1.readUnsignedByte();
		} else if (var2 == 26) {
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 >= 30 && var2 < 35) {
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) {
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
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
			} else if (var2 == 42) {
				this.shiftClickIndex = var1.readByte();
			} else if (var2 == 65) {
				this.isTradable = true;
			} else if (var2 == 78) {
				this.maleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.maleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.maleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 94) {
				var1.readUnsignedShort();
			} else if (var2 == 95) {
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) {
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) {
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) {
				if (this.countobj == null) {
					this.countobj = new int[10];
					this.countco = new int[10];
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort();
				this.countco[var2 - 100] = var1.readUnsignedShort();
			} else if (var2 == 110) {
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) {
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) {
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) {
				this.ambient = var1.readByte();
			} else if (var2 == 114) {
				this.contrast = var1.readByte() * 5;
			} else if (var2 == 115) {
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) {
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) {
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) {
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) {
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) {
				this.params = Canvas.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lfx;Lfx;I)V",
		garbageValue = "1504318000"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var1.recolorFrom;
		this.recolorTo = var1.recolorTo;
		this.retextureFrom = var1.retextureFrom;
		this.retextureTo = var1.retextureTo;
		this.name = var2.name;
		this.isMembersOnly = var2.isMembersOnly;
		this.price = var2.price;
		this.isStackable = 1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lfx;Lfx;I)V",
		garbageValue = "941791332"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var2.recolorFrom;
		this.recolorTo = var2.recolorTo;
		this.retextureFrom = var2.retextureFrom;
		this.retextureTo = var2.retextureTo;
		this.name = var2.name;
		this.isMembersOnly = var2.isMembersOnly;
		this.isStackable = var2.isStackable;
		this.maleModel = var2.maleModel;
		this.maleModel1 = var2.maleModel1;
		this.maleModel2 = var2.maleModel2;
		this.femaleModel = var2.femaleModel;
		this.femaleModel1 = var2.femaleModel1;
		this.femaleModel2 = var2.femaleModel2;
		this.maleHeadModel = var2.maleHeadModel;
		this.maleHeadModel2 = var2.maleHeadModel2;
		this.femaleHeadModel = var2.femaleHeadModel;
		this.femaleHeadModel2 = var2.femaleHeadModel2;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.inventoryActions = new String[5];
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard";
		this.price = 0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lfx;Lfx;B)V",
		garbageValue = "-22"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var1.recolorFrom;
		this.recolorTo = var1.recolorTo;
		this.retextureFrom = var1.retextureFrom;
		this.retextureTo = var1.retextureTo;
		this.isStackable = var1.isStackable;
		this.name = var2.name;
		this.price = 0;
		this.isMembersOnly = false;
		this.isTradable = false;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Lge;",
		garbageValue = "-89"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return UserComparator6.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0);
		if (var4 == null) {
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Lgo;",
		garbageValue = "679337016"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return UserComparator6.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var5 != null) {
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0);
			if (var6 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
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

				var5 = var6.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
				var5.isSingleTile = true;
				ItemDefinition_cachedModels.put(var5, (long)this.id);
				return var5;
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)Lfx;",
		garbageValue = "-1267487838"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return UserComparator6.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZS)Z",
		garbageValue = "-26274"
	)
	@Export("hasNoValidModel")
	public final boolean hasNoValidModel(boolean var1) {
		int var2 = this.maleModel;
		int var3 = this.maleModel1;
		int var4 = this.maleModel2;
		if (var1) {
			var2 = this.femaleModel;
			var3 = this.femaleModel1;
			var4 = this.femaleModel2;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var5 = false;
			}

			if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lge;",
		garbageValue = "2096791202"
	)
	public final ModelData method3554(boolean var1) {
		int var2 = this.maleModel;
		int var3 = this.maleModel1;
		int var4 = this.maleModel2;
		if (var1) {
			var2 = this.femaleModel;
			var3 = this.femaleModel1;
			var4 = this.femaleModel2;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0);
				if (var4 != -1) {
					ModelData var7 = ModelData.ModelData_get(ItemDefinition_modelArchive, var4, 0);
					ModelData[] var8 = new ModelData[]{var5, var6, var7};
					var5 = new ModelData(var8, 3);
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6};
					var5 = new ModelData(var10, 2);
				}
			}

			if (!var1 && this.maleOffset != 0) {
				var5.changeOffset(0, this.maleOffset, 0);
			}

			if (var1 && this.femaleOffset != 0) {
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			int var9;
			if (this.recolorFrom != null) {
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) {
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]);
				}
			}

			if (this.retextureFrom != null) {
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) {
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]);
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-2121620855"
	)
	public final boolean method3555(boolean var1) {
		int var2 = this.maleHeadModel;
		int var3 = this.maleHeadModel2;
		if (var1) {
			var2 = this.femaleHeadModel;
			var3 = this.femaleHeadModel2;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var4 = true;
			if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var4 = false;
			}

			if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var4 = false;
			}

			return var4;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lge;",
		garbageValue = "1383399718"
	)
	public final ModelData method3601(boolean var1) {
		int var2 = this.maleHeadModel;
		int var3 = this.maleHeadModel2;
		if (var1) {
			var2 = this.femaleHeadModel;
			var3 = this.femaleHeadModel2;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0);
				ModelData[] var6 = new ModelData[]{var4, var5};
				var4 = new ModelData(var6, 2);
			}

			int var7;
			if (this.recolorFrom != null) {
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) {
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]);
				}
			}

			if (this.retextureFrom != null) {
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) {
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "124"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class12.method158(this.params, var1, var2);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1805428112"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return Skeleton.method3948(this.params, var1, var2);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-18"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) {
			if (this.shiftClickIndex >= 0) {
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex * 585263195 * 2111080403 : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1174152873"
	)
	boolean method3560() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-16"
	)
	boolean method3572() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)Lbr;",
		garbageValue = "483786104"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)Lgg;",
		garbageValue = "2138757636"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive;
			AbstractArchive var4 = class118.SequenceDefinition_skeletonsArchive;
			boolean var5 = true;
			int[] var6 = var3.getGroupFileIds(var0);

			for (int var7 = 0; var7 < var6.length; ++var7) {
				byte[] var8 = var3.getFile(var0, var6[var7]);
				if (var8 == null) {
					var5 = false;
				} else {
					int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
					byte[] var10 = var4.getFile(var9, 0);
					if (var10 == null) {
						var5 = false;
					}
				}
			}

			Frames var2;
			if (!var5) {
				var2 = null;
			} else {
				try {
					var2 = new Frames(var3, var4, var0, false);
				} catch (Exception var12) {
					var2 = null;
				}
			}

			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2;
		}
	}
}
