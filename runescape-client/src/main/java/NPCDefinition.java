import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jz")
@Implements("NPCDefinition")
public class NPCDefinition extends DualNode {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("NpcDefinition_modelArchive")
	public static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lec;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lec;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1039013971
	)
	@Export("id")
	public int id;
	@ObfuscatedName("g")
	@Export("name")
	public String name;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 784542157
	)
	@Export("size")
	public int size;
	@ObfuscatedName("u")
	@Export("models")
	int[] models;
	@ObfuscatedName("a")
	int[] field3497;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1307303139
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -677524767
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1895421903
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1701932667
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -456399597
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1996665451
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 49834029
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
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
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("t")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1641745369
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 610196697
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -689457805
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("f")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1624183581
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2126781909
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 155267533
	)
	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -125141041
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("ax")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 618925133
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1800109047
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("am")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("ak")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("ad")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		signature = "Llf;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		NpcDefinition_cached = new EvictingDualNodeHashTable(64);
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50);
	}

	NPCDefinition() {
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-515379309"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lkn;I)V",
		garbageValue = "-1111522508"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(Lkn;II)V",
		garbageValue = "-1876580246"
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
			this.field3497 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field3497[var4] = var1.readUnsignedShort();
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
				this.params = WorldMapElement.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Ljm;ILjm;II)Lef;",
		garbageValue = "645123474"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.transforms != null) {
			NPCDefinition var12 = this.transform();
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

				ModelData var11;
				if (var8.length == 1) {
					var11 = var8[0];
				} else {
					var11 = new ModelData(var8, var8.length);
				}

				if (this.recolorFrom != null) {
					for (var9 = 0; var9 < this.recolorFrom.length; ++var9) {
						var11.recolor(this.recolorFrom[var9], this.recolorTo[var9]);
					}
				}

				if (this.retextureFrom != null) {
					for (var9 = 0; var9 < this.retextureFrom.length; ++var9) {
						var11.retexture(this.retextureFrom[var9], this.retextureTo[var9]);
					}
				}

				var5 = var11.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
				NpcDefinition_cachedModels.put(var5, (long)this.id);
			}

			Model var10;
			if (var1 != null && var3 != null) {
				var10 = var1.applyTransformations(var5, var2, var3, var4);
			} else if (var1 != null) {
				var10 = var1.transformActorModel(var5, var2);
			} else if (var3 != null) {
				var10 = var3.transformActorModel(var5, var4);
			} else {
				var10 = var5.toSharedSequenceModel(true);
			}

			if (this.widthScale != 128 || this.heightScale != 128) {
				var10.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var10;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)Lek;",
		garbageValue = "1862538614"
	)
	@Export("getModelData")
	public final ModelData getModelData() {
		if (this.transforms != null) {
			NPCDefinition var1 = this.transform();
			return var1 == null ? null : var1.getModelData();
		} else if (this.field3497 == null) {
			return null;
		} else {
			boolean var5 = false;

			for (int var2 = 0; var2 < this.field3497.length; ++var2) {
				if (!NpcDefinition_modelArchive.tryLoadFile(this.field3497[var2], 0)) {
					var5 = true;
				}
			}

			if (var5) {
				return null;
			} else {
				ModelData[] var6 = new ModelData[this.field3497.length];

				for (int var3 = 0; var3 < this.field3497.length; ++var3) {
					var6[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field3497[var3], 0);
				}

				ModelData var7;
				if (var6.length == 1) {
					var7 = var6[0];
				} else {
					var7 = new ModelData(var6, var6.length);
				}

				int var4;
				if (this.recolorFrom != null) {
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
						var7.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
					}
				}

				if (this.retextureFrom != null) {
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
						var7.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
					}
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)Ljz;",
		garbageValue = "478343419"
	)
	@Export("transform")
	public final NPCDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = Widget.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? StudioGame.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "1"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = Widget.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(IIB)I",
		garbageValue = "-3"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return Language.method3801(this.params, var1, var2);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1927040360"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return FloorUnderlayDefinition.method4612(this.params, var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "1804514310"
	)
	static int method4922(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
			var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
			var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
			var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var12;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var12 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var12 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var12 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var12 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var13;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
					var13 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
					if (WorldMapIcon_0.grandExchangeEvents != null) {
						WorldMapIcon_0.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var13);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
					var13 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
					if (WorldMapIcon_0.grandExchangeEvents != null) {
						WorldMapIcon_0.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var13);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					UrlRequester.Interpreter_intStackSize -= 2;
					var13 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize] == 1;
					boolean var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1] == 1;
					if (WorldMapIcon_0.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var4;
						WorldMapIcon_0.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var13);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
					var13 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
					if (WorldMapIcon_0.grandExchangeEvents != null) {
						WorldMapIcon_0.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var13);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
					var13 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
					if (WorldMapIcon_0.grandExchangeEvents != null) {
						WorldMapIcon_0.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var13);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = WorldMapIcon_0.grandExchangeEvents == null ? 0 : WorldMapIcon_0.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var11;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapIcon_0.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var11.world;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapIcon_0.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var11.getOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapIcon_0.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var11.getPreviousOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapIcon_0.grandExchangeEvents.events.get(var3);
						long var5 = MilliClock.currentTimeMillis() - GraphicsObject.field1139 - var11.age;
						int var7 = (int)(var5 / 3600000L);
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L);
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var10;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapIcon_0.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var11.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapIcon_0.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var11.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapIcon_0.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var11.grandExchangeOffer.id;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
