import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1405606737
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1885270625
	)
	@Export("element")
	int element;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 756903143
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 136321341
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Ljd;Ljd;ILhw;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3; // L: 18
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2109918349"
	)
	@Export("init")
	void init() {
		this.element = ParamComposition.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(class126.WorldMapElement_get(this.element));
		WorldMapElement var1 = class126.WorldMapElement_get(this.getElement()); // L: 26
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-206805537"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lhp;",
		garbageValue = "260379500"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 45
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1605473270"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-985060397"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FB)I",
		garbageValue = "113"
	)
	public static int method4329(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F; // L: 15

		for (int var8 = 0; var8 < var1 + 1; ++var8) { // L: 16
			var7 += Math.abs(var0[var8]); // L: 17
		}

		float var24 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class112.field1386; // L: 19
		if (var7 <= var24) { // L: 20
			return -1; // L: 21
		} else {
			float[] var9 = new float[var1 + 1]; // L: 23

			int var10;
			for (var10 = 0; var10 < var1 + 1; ++var10) { // L: 24
				var9[var10] = 1.0F / var7 * var0[var10]; // L: 25
			}

			while (Math.abs(var9[var1]) < var24) { // L: 27
				--var1; // L: 28
			}

			var10 = 0; // L: 30
			if (var1 == 0) { // L: 31
				return var10; // L: 32
			} else if (var1 == 1) { // L: 34
				var6[0] = -var9[0] / var9[1]; // L: 35
				boolean var22 = var3 ? var2 < var6[0] + var24 : var2 < var6[0] - var24; // L: 36
				boolean var23 = var5 ? var4 > var6[0] - var24 : var4 > var24 + var6[0]; // L: 37
				var10 = var22 && var23 ? 1 : 0; // L: 38
				if (var10 > 0) { // L: 39
					if (var3 && var6[0] < var2) { // L: 40
						var6[0] = var2; // L: 41
					} else if (var5 && var6[0] > var4) { // L: 43
						var6[0] = var4; // L: 44
					}
				}

				return var10; // L: 47
			} else {
				class373 var11 = new class373(var9, var1); // L: 50
				float[] var12 = new float[var1 + 1]; // L: 51

				for (int var13 = 1; var13 <= var1; ++var13) { // L: 52
					var12[var13 - 1] = (float)var13 * var9[var13]; // L: 53
				}

				float[] var21 = new float[var1 + 1]; // L: 55
				int var14 = method4329(var12, var1 - 1, var2, false, var4, false, var21); // L: 56
				if (var14 == -1) { // L: 57
					return 0; // L: 58
				} else {
					boolean var15 = false; // L: 60
					float var17 = 0.0F; // L: 62
					float var18 = 0.0F; // L: 63
					float var19 = 0.0F; // L: 64

					for (int var20 = 0; var20 <= var14; ++var20) { // L: 65
						if (var10 > var1) { // L: 66
							return var10;
						}

						float var16;
						if (var20 == 0) { // L: 67
							var16 = var2; // L: 68
							var18 = class113.method2602(var9, var1, var2); // L: 69
							if (Math.abs(var18) <= var24 && var3) { // L: 70
								var6[var10++] = var2;
							}
						} else {
							var16 = var19; // L: 73
							var18 = var17; // L: 74
						}

						if (var14 == var20) { // L: 76
							var19 = var4; // L: 77
							var15 = false; // L: 78
						} else {
							var19 = var21[var20]; // L: 81
						}

						var17 = class113.method2602(var9, var1, var19); // L: 83
						if (var15) { // L: 84
							var15 = false; // L: 85
						} else if (Math.abs(var17) < var24) { // L: 88
							if (var14 != var20 || var5) { // L: 89
								var6[var10++] = var19; // L: 90
								var15 = true; // L: 91
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) { // L: 94
							var6[var10++] = FriendLoginUpdate.method6333(var11, var16, var19, 0.0F); // L: 95
							if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var24) { // L: 96
								var6[var10 - 2] = (var6[var10 - 1] + var6[var10 - 2]) * 0.5F; // L: 97
								--var10; // L: 98
							}
						}
					}

					return var10; // L: 104
				}
			}
		}
	}
}
