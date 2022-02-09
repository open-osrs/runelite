import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hy")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	static ClanSettings field2713;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1656389005
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 753980223
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -708563667
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 345874997
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -181019815
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1362481739
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1066473217
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -306855367
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1493914521
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -502378895
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1039818759
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1186966869
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 586618761
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1668463027
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	} // L: 22

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lhm;I)V",
		garbageValue = "806489369"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) { // L: 26
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}

		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) { // L: 29
			var1.regionHighY = this.newY;
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1721879281"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) { // L: 34
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7; // L: 37
		} else {
			return false; // L: 35
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "898039462"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7; // L: 42
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "499785766"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 47
			return null; // L: 48
		} else {
			int[] var4 = new int[]{var2 + (this.newX * 64 - this.oldX * 64) + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)}; // L: 50 51 52
			return var4; // L: 53
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIB)Ljd;",
		garbageValue = "90"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 58
			return null; // L: 59
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1; // L: 61
			int var4 = var2 + (this.oldY * 64 - this.newY * 64) + (this.oldChunkYLow * 8 - this.newChunkYLow * 8); // L: 62
			return new Coord(this.oldZ, var3, var4); // L: 63
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-121"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte(); // L: 68
		this.newZ = var1.readUnsignedByte(); // L: 69
		this.oldX = var1.readUnsignedShort(); // L: 70
		this.oldChunkXLow = var1.readUnsignedByte(); // L: 71
		this.oldChunkXHigh = var1.readUnsignedByte(); // L: 72
		this.oldY = var1.readUnsignedShort(); // L: 73
		this.oldChunkYLow = var1.readUnsignedByte(); // L: 74
		this.oldChunkYHigh = var1.readUnsignedByte(); // L: 75
		this.newX = var1.readUnsignedShort(); // L: 76
		this.newChunkXLow = var1.readUnsignedByte(); // L: 77
		this.newChunkXHigh = var1.readUnsignedByte(); // L: 78
		this.newY = var1.readUnsignedShort(); // L: 79
		this.newChunkYLow = var1.readUnsignedByte(); // L: 80
		this.newChunkYHigh = var1.readUnsignedByte(); // L: 81
		this.postRead(); // L: 82
	} // L: 83

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1987835372"
	)
	@Export("postRead")
	void postRead() {
	} // L: 85

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-32"
	)
	public static int method4702() {
		return ViewportMouse.ViewportMouse_entityCount; // L: 44
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lni;",
		garbageValue = "-533029822"
	)
	public static class371 method4716() {
		synchronized(class371.field4238) { // L: 27
			if (class296.field3510 == 0) { // L: 28
				return new class371();
			} else {
				class371.field4238[--class296.field3510].method6677(); // L: 30
				return class371.field4238[class296.field3510]; // L: 31
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "271325473"
	)
	static int method4714(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 563
		Widget var4;
		if (var0 >= 2000) { // L: 565
			var0 -= 1000; // L: 566
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 567
			var4 = class130.getWidget(var3); // L: 568
		} else {
			var4 = var2 ? class16.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 570
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 571
			Interpreter.Interpreter_intStackSize -= 4; // L: 572
			var4.rawX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 573
			var4.rawY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 574
			var4.xAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 575
			var4.yAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 576
			class112.invalidateWidget(var4); // L: 577
			class414.client.alignWidget(var4); // L: 578
			if (var3 != -1 && var4.type == 0) { // L: 579
				PcmPlayer.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 580
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 582
			Interpreter.Interpreter_intStackSize -= 4; // L: 583
			var4.rawWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 584
			var4.rawHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 585
			var4.widthAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 586
			var4.heightAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 587
			class112.invalidateWidget(var4); // L: 588
			class414.client.alignWidget(var4); // L: 589
			if (var3 != -1 && var4.type == 0) { // L: 590
				PcmPlayer.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 591
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 593
			boolean var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 594
			if (var5 != var4.isHidden) { // L: 595
				var4.isHidden = var5; // L: 596
				class112.invalidateWidget(var4); // L: 597
			}

			return 1; // L: 599
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 601
			var4.noClickThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 602
			return 1; // L: 603
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 605
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 606
			return 1; // L: 607
		} else {
			return 2; // L: 609
		}
	}
}
