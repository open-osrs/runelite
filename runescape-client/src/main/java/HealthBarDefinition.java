import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("HitSplatDefinition_spritesArchive")
	static AbstractArchive HitSplatDefinition_spritesArchive;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("HealthBarDefinition_cached")
	static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 109126469
	)
	public int field3313;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1820061899
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1380273031
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 731318801
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1947446505
	)
	public int field3307;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1974124525
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1776540411
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1196473375
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -244272845
	)
	@Export("width")
	public int width;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1111051827
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 15
	}

	HealthBarDefinition() {
		this.int1 = 255; // L: 19
		this.int2 = 255; // L: 20
		this.int3 = -1; // L: 21
		this.field3307 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	} // L: 29

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)V",
		garbageValue = "72"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 48
			if (var2 == 0) { // L: 49
				return; // L: 52
			}

			this.decodeNext(var1, var2); // L: 50
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lkj;IB)V",
		garbageValue = "37"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 55
			var1.readUnsignedShort(); // L: 56
		} else if (var2 == 2) { // L: 58
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 59
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 60
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort(); // L: 61
		} else if (var2 == 6) { // L: 62
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.method5559();
		} else if (var2 == 8) {
			this.backSpriteID = var1.method5559();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Llm;",
		garbageValue = "-1946834755"
	)
	@Export("getFrontSprite")
	public Sprite getFrontSprite() {
		if (this.frontSpriteID < 0) { // L: 74
			return null;
		} else {
			Sprite var1 = (Sprite)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Skills.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1; // L: 80
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(S)Llm;",
		garbageValue = "-8563"
	)
	@Export("getBackSprite")
	public Sprite getBackSprite() {
		if (this.backSpriteID < 0) { // L: 84
			return null;
		} else {
			Sprite var1 = (Sprite)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 85
			if (var1 != null) {
				return var1; // L: 86
			} else {
				var1 = Skills.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.backSpriteID, 0); // L: 87
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID); // L: 88
				}

				return var1; // L: 90
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-231667488"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 63
		int[] var3 = new int[4]; // L: 64
		var2[0] = var0; // L: 65
		var3[0] = var1; // L: 66
		int var4 = 1; // L: 67

		for (int var5 = 0; var5 < 4; ++var5) { // L: 68
			if (World.World_sortOption1[var5] != var0) { // L: 69
				var2[var4] = World.World_sortOption1[var5]; // L: 70
				var3[var4] = World.World_sortOption2[var5]; // L: 71
				++var4; // L: 72
			}
		}

		World.World_sortOption1 = var2; // L: 75
		World.World_sortOption2 = var3; // L: 76
		ChatChannel.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 77
	} // L: 78

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IZB)Ljava/lang/String;",
		garbageValue = "20"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) { // L: 110
			int var3 = var0; // L: 112
			String var2;
			if (var1 && var0 >= 0) { // L: 115
				int var4 = 2; // L: 119

				for (int var5 = var0 / 10; var5 != 0; ++var4) { // L: 120 121 123
					var5 /= 10; // L: 122
				}

				char[] var6 = new char[var4]; // L: 125
				var6[0] = '+'; // L: 126

				for (int var7 = var4 - 1; var7 > 0; --var7) { // L: 127
					int var8 = var3; // L: 128
					var3 /= 10; // L: 129
					int var9 = var8 - var3 * 10; // L: 130
					if (var9 >= 10) { // L: 131
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48); // L: 132
					}
				}

				var2 = new String(var6); // L: 134
			} else {
				var2 = Integer.toString(var0, 10); // L: 116
			}

			return var2; // L: 136
		} else {
			return Integer.toString(var0);
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	public static void method4509() {
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 177
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 178
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 179
	} // L: 180

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(Lhe;IS)I",
		garbageValue = "128"
	)
	static final int method4512(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 9606
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 9608
				int var3 = 0; // L: 9609
				int var4 = 0; // L: 9610
				byte var5 = 0; // L: 9611

				while (true) {
					int var6 = var2[var4++]; // L: 9613
					int var7 = 0; // L: 9614
					byte var8 = 0; // L: 9615
					if (var6 == 0) { // L: 9616
						return var3;
					}

					if (var6 == 1) { // L: 9617
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 9618
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 9619
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 9620
						var9 = var2[var4++] << 16; // L: 9621
						var9 += var2[var4++]; // L: 9622
						var10 = CollisionMap.getWidget(var9); // L: 9623
						var11 = var2[var4++]; // L: 9624
						if (var11 != -1 && (!SecureRandomCallable.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 9625
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 9626
								if (var11 + 1 == var10.itemIds[var12]) { // L: 9627
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 9631
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 9632
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 9633
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 9634
						var7 = PlayerAppearance.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 9635
						for (var9 = 0; var9 < 25; ++var9) { // L: 9636
							if (Skills.Skills_enabled[var9]) { // L: 9637
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 9640
						var9 = var2[var4++] << 16; // L: 9641
						var9 += var2[var4++]; // L: 9642
						var10 = CollisionMap.getWidget(var9); // L: 9643
						var11 = var2[var4++]; // L: 9644
						if (var11 != -1 && (!SecureRandomCallable.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 9645
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 9646
								if (var11 + 1 == var10.itemIds[var12]) { // L: 9647
									var7 = 999999999; // L: 9648
									break; // L: 9649
								}
							}
						}
					}

					if (var6 == 11) { // L: 9654
						var7 = Client.runEnergy;
					}

					if (var6 == 12) { // L: 9655
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 9656
						var9 = Varps.Varps_main[var2[var4++]]; // L: 9657
						int var13 = var2[var4++]; // L: 9658
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 9659
					}

					if (var6 == 14) { // L: 9661
						var9 = var2[var4++]; // L: 9662
						var7 = Coord.getVarbit(var9); // L: 9663
					}

					if (var6 == 15) { // L: 9665
						var8 = 1;
					}

					if (var6 == 16) { // L: 9666
						var8 = 2;
					}

					if (var6 == 17) { // L: 9667
						var8 = 3;
					}

					if (var6 == 18) { // L: 9668
						var7 = (PlayerAppearance.localPlayer.x >> 7) + NetFileRequest.baseX;
					}

					if (var6 == 19) { // L: 9669
						var7 = (PlayerAppearance.localPlayer.y >> 7) + class41.baseY;
					}

					if (var6 == 20) { // L: 9670
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 9671
						if (var5 == 0) { // L: 9672
							var3 += var7;
						}

						if (var5 == 1) { // L: 9673
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 9674
							var3 /= var7;
						}

						if (var5 == 3) { // L: 9675
							var3 *= var7;
						}

						var5 = 0; // L: 9676
					} else {
						var5 = var8; // L: 9678
					}
				}
			} catch (Exception var14) { // L: 9681
				return -1; // L: 9682
			}
		} else {
			return -2;
		}
	}
}
