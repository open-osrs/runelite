import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 288833025
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1238552841
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lhk;Lhk;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-52"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Lfi;",
		garbageValue = "634413820"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1975622360"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1420825097"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-68"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) { // L: 18
			return true; // L: 19
		} else {
			return this.labelFitsScreen(var1, var2); // L: 21
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "716812015"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0; // L: 33
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "117"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) { // L: 37
			return false;
		} else {
			WorldMapElement var3 = ByteArrayPool.WorldMapElement_get(this.getElement()); // L: 38
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
				if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) { // L: 71
					return false;
				}
				break;
			case 1:
				if (var2 <= this.screenY - var5 || var2 > this.screenY) { // L: 66
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
		garbageValue = "-1156651084"
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

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "519921718"
	)
	static void method3186() {
		for (int var0 = 0; var0 < Client.menuOptionsCount; ++var0) { // L: 9022
			if (RouteStrategy.method2653(Client.menuOpcodes[var0])) { // L: 9023
				if (var0 < Client.menuOptionsCount - 1) { // L: 9024
					for (int var1 = var0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 9025
						Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 9026
						Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 9027
						Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 9028
						Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 9029
						Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 9030
						Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 9031
						Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 9032
					}
				}

				--var0; // L: 9035
				--Client.menuOptionsCount; // L: 9036
			}
		}

		SpriteMask.method4172(Player.menuWidth / 2 + class16.menuX, FontName.menuY); // L: 9040
	} // L: 9042
}
