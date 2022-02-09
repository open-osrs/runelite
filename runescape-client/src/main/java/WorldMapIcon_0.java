import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1986325945
	)
	@Export("element")
	final int element;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -804430029
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1605592337
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Ljd;Ljd;ILhp;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2); // L: 14
		this.element = var3; // L: 15
		this.label = var4; // L: 16
		WorldMapElement var5 = class126.WorldMapElement_get(this.getElement()); // L: 17
		SpritePixels var6 = var5.getSpriteBool(false); // L: 18
		if (var6 != null) { // L: 19
			this.subWidth = var6.subWidth; // L: 20
			this.subHeight = var6.subHeight; // L: 21
		} else {
			this.subWidth = 0; // L: 24
			this.subHeight = 0; // L: 25
		}

	} // L: 27

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-206805537"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 31
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lhp;",
		garbageValue = "260379500"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 36
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1605473270"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 41
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-985060397"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 46
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "6"
	)
	public static int method4690(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 81
			boolean var3 = false; // L: 82
			boolean var4 = false; // L: 83
			int var5 = 0; // L: 84
			int var6 = var0.length(); // L: 85

			for (int var7 = 0; var7 < var6; ++var7) { // L: 86
				char var8 = var0.charAt(var7); // L: 87
				if (var7 == 0) { // L: 88
					if (var8 == '-') { // L: 89
						var3 = true; // L: 90
						continue;
					}

					if (var8 == '+') { // L: 93
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 95
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 96
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 97
						throw new NumberFormatException(); // L: 98
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 99
					throw new NumberFormatException();
				}

				if (var3) { // L: 100
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 101
				if (var9 / var1 != var5) { // L: 102
					throw new NumberFormatException();
				}

				var5 = var9; // L: 103
				var4 = true; // L: 104
			}

			if (!var4) { // L: 106
				throw new NumberFormatException();
			} else {
				return var5; // L: 107
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
