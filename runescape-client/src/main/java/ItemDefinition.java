import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("ItemDefinition")
public class ItemDefinition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("a")
	@Export("SpriteBuffer_pixels")
	static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -387734495
	)
	@Export("id")
	public int id;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1846336697
	)
	@Export("model")
	int model;
	@ObfuscatedName("r")
	@Export("name")
	public String name;
	@ObfuscatedName("s")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("v")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("d")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("e")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -757926125
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1898813449
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1438796167
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1360428013
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 722443685
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1309918665
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1307428521
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1345886409
	)
	@Export("price")
	public int price;
	@ObfuscatedName("ao")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("ae")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("ax")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1852422487
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1683383921
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 203809743
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1331375069
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1572881273
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2104915687
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -860403817
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1286326291
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 68314197
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -896933211
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1972414089
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 614455691
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -92317883
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("aa")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("aw")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1033402307
	)
	@Export("note")
	public int note;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -833610513
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2144457461
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 132826193
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 477946841
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 37898747
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1234802265
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1542522067
	)
	@Export("team")
	public int team;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bf")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -265652873
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -721013975
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 101881603
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1978644905
	)
	@Export("placeholderTemplate")
	public int placeholderTemplate;

	static {
		ItemDefinition_cached = new EvictingDualNodeHashTable(64);
		ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50);
		ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200);
	}

	ItemDefinition() {
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-196322626"
	)
	@Export("post")
	void post() {
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)V",
		garbageValue = "1671660410"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lkn;II)V",
		garbageValue = "2109543922"
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
				this.params = WorldMapElement.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljo;Ljo;I)V",
		garbageValue = "1175603747"
	)
	@Export("genCert")
	void genCert(ItemDefinition var1, ItemDefinition var2) {
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljo;Ljo;B)V",
		garbageValue = "12"
	)
	@Export("genBought")
	void genBought(ItemDefinition var1, ItemDefinition var2) {
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljo;Ljo;I)V",
		garbageValue = "-1279749968"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemDefinition var1, ItemDefinition var2) {
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)Lek;",
		garbageValue = "3"
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
				return KitDefinition.ItemDefinition_get(var2).getModelData(1);
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Lef;",
		garbageValue = "1775717489"
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
				return KitDefinition.ItemDefinition_get(var2).getModel(1);
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Ljo;",
		garbageValue = "-539705094"
	)
	@Export("getCountObj")
	public ItemDefinition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return KitDefinition.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "118"
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lek;",
		garbageValue = "-952045746"
	)
	public final ModelData method4839(boolean var1) {
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-209072389"
	)
	public final boolean method4840(boolean var1) {
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lek;",
		garbageValue = "52"
	)
	public final ModelData method4841(boolean var1) {
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "2"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return Language.method3801(this.params, var1, var2);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "2076909967"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return FloorUnderlayDefinition.method4612(this.params, var1, var2);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "269605013"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) {
			if (this.shiftClickIndex >= 0) {
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex * 1852422487 * -1191034265 : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1;
			}
		} else {
			return -1;
		}
	}
}
