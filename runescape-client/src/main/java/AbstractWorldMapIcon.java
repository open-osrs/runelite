import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		intValue = -2092651161
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "[Lle;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1323341995
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 276589985
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lhw;Lhw;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "24"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lai;",
		garbageValue = "-669051823"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1627026836"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "190840278"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "24"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) { // L: 18
			return true; // L: 19
		} else {
			return this.labelFitsScreen(var1, var2); // L: 21
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "50327739"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0; // L: 33
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "0"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) { // L: 37
			return false;
		} else {
			WorldMapElement var3 = class194.WorldMapElement_get(this.getElement()); // L: 38
			int var4 = this.getSubWidth(); // L: 39
			int var5 = this.getSubHeight(); // L: 40
			switch(var3.horizontalAlignment.value) { // L: 41
			case 0:
				if (var1 >= this.screenX && var1 < var4 + this.screenX) { // L: 49
					break;
				}

				return false;
			case 1:
				if (var1 <= this.screenX - var4 || var1 > this.screenX) { // L: 44
					return false;
				}
				break;
			case 2:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) { // L: 54
					return false;
				}
			}

			switch(var3.verticalAlignment.value) { // L: 58
			case 0:
				if (var2 <= this.screenY - var5 || var2 > this.screenY) { // L: 71
					return false;
				}
				break;
			case 1:
				if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) { // L: 66
					return false;
				}
				break;
			case 2:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) { // L: 61
					return false;
				}
			}

			return true; // L: 75
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "290939531"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(CLgb;I)I",
		garbageValue = "-816252921"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 104
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 105
			var0 = Character.toLowerCase(var0); // L: 106
			var2 = (var0 << 4) + 1; // L: 107
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 109
			var2 = 1762;
		}

		return var2; // L: 110
	}
}
