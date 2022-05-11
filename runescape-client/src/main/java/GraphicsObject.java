import java.text.ParseException;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 772916355
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1248002899
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1478722299
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 118002909
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 800105373
	)
	@Export("x")
	int x;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -738623243
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1237979949
	)
	@Export("z")
	int z;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 657870691
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1465530257
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("v")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0; // L: 16
		this.frameCycle = 0; // L: 17
		this.isFinished = false; // L: 18
		this.id = var1; // L: 21
		this.plane = var2; // L: 22
		this.x = var3; // L: 23
		this.y = var4; // L: 24
		this.z = var5; // L: 25
		this.cycleStart = var7 + var6; // L: 26
		int var8 = class136.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) { // L: 28
			this.isFinished = false; // L: 29
			this.sequenceDefinition = class114.SequenceDefinition_get(var8); // L: 30
		} else {
			this.isFinished = true; // L: 32
		}

	} // L: 33

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "115"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) { // L: 36
			this.frameCycle += var1; // L: 37
			if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 38
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) { // L: 39
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 40
					++this.frame; // L: 41
					if (this.frame >= this.sequenceDefinition.frameIds.length) { // L: 42
						this.isFinished = true; // L: 43
						break;
					}
				}
			} else {
				this.frame += var1; // L: 49
				if (this.frame >= this.sequenceDefinition.method3729()) { // L: 50
					this.isFinished = true;
				}
			}

		}
	} // L: 52

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lhv;",
		garbageValue = "-238822980"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class136.SpotAnimationDefinition_get(this.id); // L: 55
		Model var2;
		if (!this.isFinished) { // L: 57
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 58
		}

		return var2 == null ? null : var2; // L: 59
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljx;B)V",
		garbageValue = "-3"
	)
	public static void method1870(Huffman var0) {
		class282.huffman = var0; // L: 14
	} // L: 15

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2116498850"
	)
	static boolean method1867() {
		Date var0;
		try {
			var0 = class115.method2679(); // L: 955
		} catch (ParseException var7) { // L: 957
			class126.method2799(7); // L: 959
			class345.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 960
			return false; // L: 962
		}

		if (var0 == null) { // L: 964
			return false; // L: 965
		} else {
			boolean var5 = class268.method5028(var0); // L: 967
			java.util.Calendar var4 = java.util.Calendar.getInstance(); // L: 972
			var4.set(2, 0); // L: 973
			var4.set(5, 1); // L: 974
			var4.set(1, 1900); // L: 975
			Date var3 = var4.getTime(); // L: 976
			boolean var2 = var0.after(var3); // L: 979
			if (!var2) { // L: 982
				class126.method2799(7); // L: 984
				class345.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 985
				return false; // L: 987
			} else {
				if (!var5) { // L: 989
					class7.field26 = 8388607; // L: 990
				} else {
					class7.field26 = (int)(var0.getTime() / 86400000L - 11745L); // L: 993
				}

				return true; // L: 995
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "19136992"
	)
	public static boolean method1868(int var0) {
		return var0 == WorldMapDecorationType.field3578.id; // L: 51
	}

	public GraphicsObject() {
	}
}
