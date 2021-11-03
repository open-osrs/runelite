import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = -740824161
	)
	static int field942;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1547181131
	)
	@Export("id")
	int id;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1678803105
	)
	@Export("type")
	int type;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 625040997
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 168532931
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -636498467
	)
	@Export("x")
	int x;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1279572157
	)
	@Export("y")
	int y;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1999016109
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1531671951
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLhj;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1;
		this.type = var2;
		this.orientation = var3;
		this.plane = var4; // L: 23
		this.x = var5;
		this.y = var6;
		if (var7 != -1) {
			this.sequenceDefinition = MouseHandler.SequenceDefinition_get(var7);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field1965 == 0 && var9 != null && var9 instanceof DynamicObject) {
				DynamicObject var10 = (DynamicObject)var9; // L: 31
				if (var10.sequenceDefinition == this.sequenceDefinition) { // L: 32
					this.frame = var10.frame; // L: 33
					this.cycleStart = var10.cycleStart; // L: 34
					return; // L: 35
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) { // L: 38
				this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
				this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
			}
		}

	} // L: 43

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lhl;",
		garbageValue = "461766541"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.sequenceDefinition != null) {
			int var1 = Client.cycle - this.cycleStart;
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) {
				var1 = 100;
			}

			label54: {
				do {
					do {
						if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
							break label54;
						}

						var1 -= this.sequenceDefinition.frameLengths[this.frame]; // L: 50
						++this.frame;
					} while(this.frame < this.sequenceDefinition.frameIds.length);

					this.frame -= this.sequenceDefinition.frameCount;
				} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 54

				this.sequenceDefinition = null;
			}

			this.cycleStart = Client.cycle - var1;
		}

		ObjectComposition var12 = KitDefinition.getObjectDefinition(this.id); // L: 62
		if (var12.transforms != null) { // L: 63
			var12 = var12.transform();
		}

		if (var12 == null) { // L: 64
			return null;
		} else {
			int var2;
			int var3;
			if (this.orientation != 1 && this.orientation != 3) { // L: 67
				var2 = var12.sizeX; // L: 72
				var3 = var12.sizeY; // L: 73
			} else {
				var2 = var12.sizeY; // L: 68
				var3 = var12.sizeX; // L: 69
			}

			int var4 = (var2 >> 1) + this.x; // L: 75
			int var5 = (var2 + 1 >> 1) + this.x; // L: 76
			int var6 = (var3 >> 1) + this.y; // L: 77
			int var7 = (var3 + 1 >> 1) + this.y; // L: 78
			int[][] var8 = Tiles.Tiles_heights[this.plane]; // L: 79
			int var9 = var8[var4][var6] + var8[var5][var6] + var8[var4][var7] + var8[var5][var7] >> 2; // L: 80
			int var10 = (this.x << 7) + (var2 << 6); // L: 81
			int var11 = (this.y << 7) + (var3 << 6); // L: 82
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame); // L: 83
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "-1313175336"
	)
	public static String method2003(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 11
			return "";
		} else if (var2 == 1) { // L: 12
			CharSequence var10 = var0[var1]; // L: 13
			return var10 == null ? "null" : var10.toString(); // L: 14 15
		} else {
			int var3 = var2 + var1; // L: 17
			int var4 = 0; // L: 18

			for (int var5 = var1; var5 < var3; ++var5) { // L: 19
				CharSequence var9 = var0[var5]; // L: 20
				if (var9 == null) { // L: 21
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 22
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 24

			for (int var6 = var1; var6 < var3; ++var6) { // L: 25
				CharSequence var7 = var0[var6]; // L: 26
				if (var7 == null) { // L: 27
					var8.append("null");
				} else {
					var8.append(var7); // L: 28
				}
			}

			return var8.toString(); // L: 30
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Loj;I)I",
		garbageValue = "-1853618931"
	)
	static int method1998(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 350
		int var2;
		if (var1 == 0) { // L: 352
			var2 = 0;
		} else if (var1 == 1) { // L: 353
			var2 = var0.readBits(5);
		} else if (var1 == 2) { // L: 354
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 355
		}

		return var2; // L: 356
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1555132909"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-339727725"
	)
	static boolean method2001(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1; // L: 857
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Lho;",
		garbageValue = "-1655778063"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 181
		if (var1 != null) { // L: 182
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive; // L: 184
			AbstractArchive var4 = SequenceDefinition.SequenceDefinition_skeletonsArchive; // L: 185
			boolean var5 = true; // L: 187
			int[] var6 = var3.getGroupFileIds(var0); // L: 188

			for (int var7 = 0; var7 < var6.length; ++var7) { // L: 189
				byte[] var8 = var3.getFile(var0, var6[var7]); // L: 190
				if (var8 == null) { // L: 191
					var5 = false; // L: 192
				} else {
					int var9 = (var8[0] & 255) << 8 | var8[1] & 255; // L: 195
					byte[] var10 = var4.getFile(var9, 0); // L: 198
					if (var10 == null) { // L: 199
						var5 = false;
					}
				}
			}

			Frames var2;
			if (!var5) { // L: 201
				var2 = null; // L: 202
			} else {
				try {
					var2 = new Frames(var3, var4, var0, false); // L: 206
				} catch (Exception var12) { // L: 208
					var2 = null; // L: 209
				}
			}

			if (var2 != null) { // L: 213
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2; // L: 214
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "1"
	)
	static final int method2002(int var0, int var1) {
		int var2 = class117.method2573(var0 - 1, var1 - 1) + class117.method2573(1 + var0, var1 - 1) + class117.method2573(var0 - 1, 1 + var1) + class117.method2573(var0 + 1, 1 + var1); // L: 557
		int var3 = class117.method2573(var0 - 1, var1) + class117.method2573(1 + var0, var1) + class117.method2573(var0, var1 - 1) + class117.method2573(var0, 1 + var1); // L: 558
		int var4 = class117.method2573(var0, var1); // L: 559
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 560
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lcq;",
		garbageValue = "-1244172652"
	)
	static final InterfaceParent method1997(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 11517
		var3.group = var1; // L: 11518
		var3.type = var2; // L: 11519
		Client.interfaceParents.put(var3, (long)var0); // L: 11520
		Player.Widget_resetModelFrames(var1); // L: 11521
		Widget var4 = UserComparator9.getWidget(var0); // L: 11522
		class184.invalidateWidget(var4); // L: 11523
		if (Client.meslayerContinueWidget != null) { // L: 11524
			class184.invalidateWidget(Client.meslayerContinueWidget); // L: 11525
			Client.meslayerContinueWidget = null; // L: 11526
		}

		for (int var5 = 0; var5 < Client.menuOptionsCount; ++var5) { // L: 11529
			if (class122.method2607(Client.menuOpcodes[var5])) { // L: 11530
				if (var5 < Client.menuOptionsCount - 1) { // L: 11531
					for (int var6 = var5; var6 < Client.menuOptionsCount - 1; ++var6) { // L: 11532
						Client.menuActions[var6] = Client.menuActions[var6 + 1]; // L: 11533
						Client.menuTargets[var6] = Client.menuTargets[var6 + 1]; // L: 11534
						Client.menuOpcodes[var6] = Client.menuOpcodes[var6 + 1]; // L: 11535
						Client.menuIdentifiers[var6] = Client.menuIdentifiers[var6 + 1]; // L: 11536
						Client.menuArguments1[var6] = Client.menuArguments1[var6 + 1]; // L: 11537
						Client.menuArguments2[var6] = Client.menuArguments2[var6 + 1]; // L: 11538
						Client.menuShiftClick[var6] = Client.menuShiftClick[var6 + 1]; // L: 11539
					}
				}

				--var5; // L: 11542
				--Client.menuOptionsCount; // L: 11543
			}
		}

		class262.method5136(); // L: 11546
		MouseRecorder.revalidateWidgetScroll(WorldMapSection1.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 11548
		class54.runWidgetOnLoadListener(var1); // L: 11549
		if (Client.rootInterface != -1) { // L: 11550
			ItemComposition.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 11551
	}
}
