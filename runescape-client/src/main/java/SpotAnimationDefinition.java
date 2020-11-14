import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ie")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("SpotAnimationDefinition_archive")
	static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("SpotAnimationDefinition_cached")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = 324624887
	)
	static int field3282;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -787495021
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -378851373
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1622885381
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1604295303
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("c")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("u")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("t")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("e")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1171838019
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1777738887
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 439933857
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2047701161
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1188839011
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30); // L: 15
	}

	SpotAnimationDefinition() {
		this.sequence = -1; // L: 18
		this.widthScale = 128; // L: 23
		this.heightScale = 128; // L: 24
		this.orientation = 0; // L: 25
		this.ambient = 0; // L: 26
		this.contrast = 0; // L: 27
	} // L: 29

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkb;B)V",
		garbageValue = "57"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 49
			if (var2 == 0) { // L: 50
				return; // L: 53
			}

			this.decodeNext(var1, var2); // L: 51
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lkb;II)V",
		garbageValue = "-1222478116"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 56
			this.archive = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 57
			this.sequence = var1.readUnsignedShort();
		} else if (var2 == 4) { // L: 58
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 59
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 60
			this.orientation = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 61
			this.ambient = var1.readUnsignedByte();
		} else if (var2 == 8) { // L: 62
			this.contrast = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 63
				var3 = var1.readUnsignedByte(); // L: 64
				this.recolorFrom = new short[var3]; // L: 65
				this.recolorTo = new short[var3]; // L: 66

				for (var4 = 0; var4 < var3; ++var4) { // L: 67
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 68
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 69
				}
			} else if (var2 == 41) { // L: 72
				var3 = var1.readUnsignedByte(); // L: 73
				this.retextureFrom = new short[var3]; // L: 74
				this.retextureTo = new short[var3]; // L: 75

				for (var4 = 0; var4 < var3; ++var4) { // L: 76
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 77
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 78
				}
			}
		}

	} // L: 82

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IB)Leh;",
		garbageValue = "-32"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id); // L: 85
		if (var2 == null) { // L: 86
			ModelData var3 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0); // L: 87
			if (var3 == null) { // L: 88
				return null;
			}

			int var4;
			if (this.recolorFrom != null) { // L: 89
				for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 90
					var3.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 91
				}
			}

			if (this.retextureFrom != null) { // L: 94
				for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 95
					var3.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 96
				}
			}

			var2 = var3.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 99
			SpotAnimationDefinition_cachedModels.put(var2, (long)this.id); // L: 100
		}

		Model var5;
		if (this.sequence != -1 && var1 != -1) { // L: 103
			var5 = class105.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
		} else {
			var5 = var2.toSharedSpotAnimationModel(true); // L: 104
		}

		if (this.widthScale != 128 || this.heightScale != 128) { // L: 105
			var5.scale(this.widthScale, this.heightScale, this.widthScale);
		}

		if (this.orientation != 0) { // L: 106
			if (this.orientation == 90) { // L: 107
				var5.rotateY90Ccw();
			}

			if (this.orientation == 180) { // L: 108
				var5.rotateY90Ccw(); // L: 109
				var5.rotateY90Ccw(); // L: 110
			}

			if (this.orientation == 270) { // L: 112
				var5.rotateY90Ccw(); // L: 113
				var5.rotateY90Ccw(); // L: 114
				var5.rotateY90Ccw(); // L: 115
			}
		}

		return var5; // L: 118
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "2006459682"
	)
	static int method4577(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 497
		Widget var4;
		if (var0 >= 2000) { // L: 499
			var0 -= 1000; // L: 500
			var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 501
			var4 = UserComparator4.getWidget(var3); // L: 502
		} else {
			var4 = var2 ? MouseRecorder.field621 : Interpreter.field1122; // L: 504
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 505
			MilliClock.Interpreter_intStackSize -= 4; // L: 506
			var4.rawX = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 507
			var4.rawY = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 508
			var4.xAlignment = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2]; // L: 509
			var4.yAlignment = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 3]; // L: 510
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var4); // L: 511
			ByteArrayPool.client.alignWidget(var4); // L: 512
			if (var3 != -1 && var4.type == 0) { // L: 513
				UserComparator9.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 514
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 516
			MilliClock.Interpreter_intStackSize -= 4; // L: 517
			var4.rawWidth = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 518
			var4.rawHeight = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 519
			var4.widthAlignment = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2]; // L: 520
			var4.heightAlignment = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 3]; // L: 521
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var4); // L: 522
			ByteArrayPool.client.alignWidget(var4); // L: 523
			if (var3 != -1 && var4.type == 0) { // L: 524
				UserComparator9.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 525
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 527
			boolean var5 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 528
			if (var5 != var4.isHidden) { // L: 529
				var4.isHidden = var5; // L: 530
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var4); // L: 531
			}

			return 1; // L: 533
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 535
			var4.noClickThrough = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 536
			return 1; // L: 537
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 539
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 540
			return 1; // L: 541
		} else {
			return 2; // L: 543
		}
	}
}
