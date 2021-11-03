import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1380271839
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 380689567
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lie;Lie;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1660589105"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Lga;",
		garbageValue = "0"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "374350712"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1569056170"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1706303277"
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
		garbageValue = "-2053967223"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0; // L: 33
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1990490630"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) { // L: 37
			return false;
		} else {
			WorldMapElement var3 = ItemComposition.WorldMapElement_get(this.getElement()); // L: 38
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
				if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) { // L: 61
					return false;
				}
				break;
			case 1:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) { // L: 71
					return false;
				}
				break;
			case 2:
				if (var2 <= this.screenY - var5 || var2 > this.screenY) { // L: 66
					return false;
				}
			}

			return true; // L: 75
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "84"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-1528171345"
	)
	static int method4026(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 433
			return WorldMapLabelSize.method3540(var0, var1, var2);
		} else if (var0 < 1100) { // L: 434
			return BZip2State.method7179(var0, var1, var2);
		} else if (var0 < 1200) { // L: 435
			return class132.method2766(var0, var1, var2);
		} else if (var0 < 1300) { // L: 436
			return class19.method290(var0, var1, var2);
		} else if (var0 < 1400) { // L: 437
			return WorldMapEvent.method4105(var0, var1, var2);
		} else if (var0 < 1500) { // L: 438
			return MusicPatch.method4950(var0, var1, var2);
		} else if (var0 < 1600) { // L: 439
			return ViewportMouse.method4622(var0, var1, var2);
		} else if (var0 < 1700) { // L: 440
			return WorldMapSection1.method3999(var0, var1, var2);
		} else if (var0 < 1800) { // L: 441
			return class54.method1101(var0, var1, var2);
		} else if (var0 < 1900) { // L: 442
			return GraphicsObject.method1896(var0, var1, var2);
		} else if (var0 < 2000) { // L: 443
			return InterfaceParent.method2079(var0, var1, var2);
		} else if (var0 < 2100) { // L: 444
			return BZip2State.method7179(var0, var1, var2);
		} else if (var0 < 2200) { // L: 445
			return class132.method2766(var0, var1, var2);
		} else if (var0 < 2300) { // L: 446
			return class19.method290(var0, var1, var2);
		} else if (var0 < 2400) { // L: 447
			return WorldMapEvent.method4105(var0, var1, var2);
		} else if (var0 < 2500) {
			return MusicPatch.method4950(var0, var1, var2); // L: 448
		} else if (var0 < 2600) { // L: 449
			return GrandExchangeOfferWorldComparator.method5439(var0, var1, var2);
		} else if (var0 < 2700) { // L: 450
			return class196.method3972(var0, var1, var2);
		} else if (var0 < 2800) { // L: 451
			return MouseRecorder.method2089(var0, var1, var2);
		} else if (var0 < 2900) { // L: 452
			return class13.method173(var0, var1, var2);
		} else if (var0 < 3000) { // L: 453
			return InterfaceParent.method2079(var0, var1, var2);
		} else if (var0 < 3200) { // L: 454
			return ScriptFrame.method1118(var0, var1, var2);
		} else if (var0 < 3300) { // L: 455
			return class123.method2618(var0, var1, var2);
		} else if (var0 < 3400) { // L: 456
			return UrlRequester.method2427(var0, var1, var2);
		} else if (var0 < 3500) { // L: 457
			return World.method1668(var0, var1, var2);
		} else if (var0 < 3600) { // L: 458
			return GameEngine.method555(var0, var1, var2);
		} else if (var0 < 3700) { // L: 459
			return class139.method2837(var0, var1, var2);
		} else if (var0 < 3800) { // L: 460
			return class129.method2738(var0, var1, var2);
		} else if (var0 < 3900) { // L: 461
			return SoundCache.method799(var0, var1, var2);
		} else if (var0 < 4000) { // L: 462
			return Fonts.method6687(var0, var1, var2);
		} else if (var0 < 4100) { // L: 463
			return class14.method190(var0, var1, var2);
		} else if (var0 < 4200) {
			return class28.method401(var0, var1, var2); // L: 464
		} else if (var0 < 4300) { // L: 465
			return TileItem.method2309(var0, var1, var2);
		} else if (var0 < 5100) { // L: 466
			return class114.method2542(var0, var1, var2);
		} else if (var0 < 5400) { // L: 467
			return class91.method2271(var0, var1, var2);
		} else if (var0 < 5600) { // L: 468
			return InvDefinition.method2982(var0, var1, var2);
		} else if (var0 < 5700) { // L: 469
			return class184.method3871(var0, var1, var2);
		} else if (var0 < 6300) { // L: 470
			return GrandExchangeOfferOwnWorldComparator.method1158(var0, var1, var2);
		} else if (var0 < 6600) { // L: 471
			return class12.method171(var0, var1, var2);
		} else if (var0 < 6700) { // L: 472
			return ArchiveDiskActionHandler.method5257(var0, var1, var2);
		} else if (var0 < 6800) { // L: 473
			return class123.method2608(var0, var1, var2);
		} else if (var0 < 6900) { // L: 474
			return class244.method4727(var0, var1, var2);
		} else if (var0 < 7000) { // L: 475
			return ChatChannel.method2012(var0, var1, var2);
		} else if (var0 < 7100) { // L: 476
			return class139.method2845(var0, var1, var2);
		} else if (var0 < 7200) { // L: 477
			return class67.method1914(var0, var1, var2);
		} else {
			return var0 < 7300 ? class28.method402(var0, var1, var2) : 2; // L: 478 479
		}
	}
}
