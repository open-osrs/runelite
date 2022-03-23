import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 26016061
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1132630309
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2078584239"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Liw;",
		garbageValue = "-2105037058"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "388705804"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-54"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1964398833"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) { // L: 18
			return true; // L: 19
		} else {
			return this.labelFitsScreen(var1, var2); // L: 21
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1239297952"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0; // L: 33
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "787430314"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) { // L: 37
			return false;
		} else {
			WorldMapElement var3 = class19.WorldMapElement_get(this.getElement()); // L: 38
			int var4 = this.getSubWidth(); // L: 39
			int var5 = this.getSubHeight(); // L: 40
			switch(var3.horizontalAlignment.value) { // L: 41
			case 0:
				if (var1 > this.screenX - var4 && var1 <= this.screenX) { // L: 49
					break;
				}

				return false;
			case 1:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) { // L: 44
					return false;
				}
				break;
			case 2:
				if (var1 < this.screenX || var1 >= var4 + this.screenX) { // L: 54
					return false;
				}
			}

			switch(var3.verticalAlignment.value) { // L: 58
			case 0:
				if (var2 >= this.screenY - var5 / 2 && var2 <= var5 / 2 + this.screenY) { // L: 66
					break;
				}

				return false;
			case 1:
				if (var2 >= this.screenY && var2 < var5 + this.screenY) { // L: 61
					break;
				}

				return false;
			case 2:
				if (var2 <= this.screenY - var5 || var2 > this.screenY) { // L: 71
					return false;
				}
			}

			return true; // L: 75
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1182827308"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel(); // L: 79
		if (var3 == null) { // L: 80
			return false; // L: 81
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) { // L: 83
			return var2 >= this.screenY && var2 <= var3.height + this.screenY; // L: 84
		} else {
			return false; // L: 85
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldo;",
		garbageValue = "336008502"
	)
	static class119[] method5059() {
		return new class119[]{class119.field1457, class119.field1454, class119.field1455, class119.field1456, class119.field1471, class119.field1458, class119.field1459, class119.field1453, class119.field1465, class119.field1468, class119.field1463, class119.field1464, class119.field1462, class119.field1466, class119.field1467, class119.field1460, class119.field1469}; // L: 64
	}
}
