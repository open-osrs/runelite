import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("fa")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1687504305
	)
	@Export("element")
	final int element;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -515906735
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 724406877
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lie;Lie;ILga;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2); // L: 14
		this.element = var3; // L: 15
		this.label = var4; // L: 16
		WorldMapElement var5 = ItemComposition.WorldMapElement_get(this.getElement()); // L: 17
		SpritePixels var6 = var5.getSpriteBool(false); // L: 18
		if (var6 != null) { // L: 19
			this.subWidth = var6.subWidth; // L: 20
			this.subHeight = var6.subHeight; // L: 21
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1660589105"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 30
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Lga;",
		garbageValue = "0"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 34
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "374350712"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 38
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1569056170"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 42
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Ljk;",
		garbageValue = "1771772075"
	)
	public static GameBuild method3890(int var0) {
		GameBuild[] var1 = class245.method4742(); // L: 23

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 24
			GameBuild var3 = var1[var2]; // L: 25
			if (var0 == var3.buildId) { // L: 27
				return var3;
			}
		}

		return null; // L: 31
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2005741653"
	)
	static final int method3885(int var0, int var1) {
		if (var0 == -2) { // L: 579
			return 12345678;
		} else if (var0 == -1) { // L: 580
			if (var1 < 2) {
				var1 = 2; // L: 581
			} else if (var1 > 126) { // L: 582
				var1 = 126;
			}

			return var1; // L: 583
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 585
			if (var1 < 2) { // L: 586
				var1 = 2;
			} else if (var1 > 126) { // L: 587
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 588
		}
	}
}
