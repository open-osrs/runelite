import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 713506819
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 2022522807
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -259492799
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 67302117
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2); // L: 14
		this.setHigh(var3, var4); // L: 15
	} // L: 16

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2); // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "74763714"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "25"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llw;Llw;B)V",
		garbageValue = "-43"
	)
	public void method6009(Bounds var1, Bounds var2) {
		this.method6010(var1, var2);
		this.method6031(var1, var2); // L: 34
	} // L: 35

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Llw;Llw;B)V",
		garbageValue = "0"
	)
	void method6010(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX; // L: 39
		if (this.lowX < var1.lowX) {
			var2.highX = (var2.highX * -2021811263 - (var1.lowX * -2021811263 - this.lowX * -2021811263)) * -259492799; // L: 41
			var2.lowX = var1.lowX; // L: 42
		}

		if (var2.method6012() > var1.method6012()) { // L: 44
			var2.highX -= var2.method6012() - var1.method6012(); // L: 45
		}

		if (var2.highX < 0) { // L: 47
			var2.highX = 0;
		}

	} // L: 48

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Llw;Llw;I)V",
		garbageValue = "-94971019"
	)
	void method6031(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 51
		var2.highY = this.highY; // L: 52
		if (this.lowY < var1.lowY) { // L: 53
			var2.highY = (var2.highY * -1355515155 - (var1.lowY * -1355515155 - this.lowY * -1355515155)) * 67302117; // L: 54
			var2.lowY = var1.lowY; // L: 55
		}

		if (var2.method6032() > var1.method6032()) { // L: 57
			var2.highY -= var2.method6032() - var1.method6032(); // L: 58
		}

		if (var2.highY < 0) { // L: 60
			var2.highY = 0;
		}

	} // L: 61

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "5"
	)
	int method6012() {
		return this.lowX + this.highX; // L: 64
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1071411264"
	)
	int method6032() {
		return this.lowY + this.highY; // L: 68
	}

	public String toString() {
		return null; // L: 29
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;III)Lkj;",
		garbageValue = "845237448"
	)
	public static Font method6034(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		if (!Message.method1263(var0, var2, var3)) { // L: 28
			return null;
		} else {
			byte[] var5 = var1.takeFile(var2, var3); // L: 30
			Font var4;
			if (var5 == null) { // L: 32
				var4 = null; // L: 33
			} else {
				Font var6 = new Font(var5, class397.SpriteBuffer_xOffsets, class26.SpriteBuffer_yOffsets, Canvas.SpriteBuffer_spriteWidths, Clock.SpriteBuffer_spriteHeights, class397.SpriteBuffer_spritePalette, class126.SpriteBuffer_pixels); // L: 36
				ArchiveDisk.method5993(); // L: 37
				var4 = var6; // L: 38
			}

			return var4; // L: 40
		}
	}
}
