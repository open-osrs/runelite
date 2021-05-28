import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	public static AbstractArchive field1734;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "[Lop;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -418995629
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -131436485
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1784798067
	)
	public int field1731;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 444689543
	)
	int field1735;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 311873853
	)
	int field1736;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 592944735
	)
	int field1737;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1479453361
	)
	int field1738;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -264775369
	)
	public int field1739;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1703061619
	)
	public int field1740;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 154309501
	)
	public int field1749;
	@ObfuscatedName("w")
	String field1742;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1751658075
	)
	public int field1743;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -942409287
	)
	public int field1744;
	@ObfuscatedName("q")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1819526357
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1097710595
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 19
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20); // L: 20
	}

	HitSplatDefinition() {
		this.fontId = -1; // L: 26
		this.textColor = 16777215; // L: 27
		this.field1731 = 70; // L: 28
		this.field1735 = -1; // L: 29
		this.field1736 = -1; // L: 30
		this.field1737 = -1; // L: 31
		this.field1738 = -1; // L: 32
		this.field1739 = 0; // L: 33
		this.field1740 = 0; // L: 34
		this.field1749 = -1; // L: 35
		this.field1742 = ""; // L: 36
		this.field1743 = -1; // L: 37
		this.field1744 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "1040710174"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 57
			if (var2 == 0) { // L: 58
				return; // L: 61
			}

			this.decodeNext(var1, var2); // L: 59
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;II)V",
		garbageValue = "1647125333"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 64
			this.fontId = var1.method6583();
		} else if (var2 == 2) { // L: 65
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 66
			this.field1735 = var1.method6583();
		} else if (var2 == 4) { // L: 67
			this.field1737 = var1.method6583();
		} else if (var2 == 5) { // L: 68
			this.field1736 = var1.method6583();
		} else if (var2 == 6) { // L: 69
			this.field1738 = var1.method6583();
		} else if (var2 == 7) { // L: 70
			this.field1739 = var1.readShort();
		} else if (var2 == 8) { // L: 71
			this.field1742 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 72
			this.field1731 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 73
			this.field1740 = var1.readShort();
		} else if (var2 == 11) { // L: 74
			this.field1749 = 0;
		} else if (var2 == 12) { // L: 75
			this.field1743 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 76
			this.field1744 = var1.readShort();
		} else if (var2 == 14) {
			this.field1749 = var1.readUnsignedShort(); // L: 77
		} else if (var2 == 17 || var2 == 18) { // L: 78
			this.transformVarbit = var1.readUnsignedShort(); // L: 79
			if (this.transformVarbit == 65535) { // L: 80
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 81
			if (this.transformVarp == 65535) { // L: 82
				this.transformVarp = -1;
			}

			int var3 = -1; // L: 83
			if (var2 == 18) { // L: 84
				var3 = var1.readUnsignedShort(); // L: 85
				if (var3 == 65535) { // L: 86
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte(); // L: 88
			this.transforms = new int[var4 + 2]; // L: 89

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 90
				this.transforms[var5] = var1.readUnsignedShort(); // L: 91
				if (this.transforms[var5] == 65535) { // L: 92
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 94
		}

	} // L: 97

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Lev;",
		garbageValue = "-1025207361"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 100
		if (this.transformVarbit != -1) { // L: 101
			var1 = Skeleton.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 102
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 104
			var2 = this.transforms[var1]; // L: 105
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? Projectile.method1966(var2) : null; // L: 106 107
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1622557292"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field1742; // L: 111

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 113
			if (var3 < 0) { // L: 114
				return var2; // L: 117
			}

			var2 = var2.substring(0, var3) + class80.intToString(var1, false) + var2.substring(var3 + 2); // L: 115
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;",
		garbageValue = "-1594808435"
	)
	public SpritePixels method2916() {
		if (this.field1735 < 0) { // L: 121
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1735); // L: 122
			if (var1 != null) { // L: 123
				return var1;
			} else {
				var1 = ClientPacket.SpriteBuffer_getSprite(field1734, this.field1735, 0); // L: 124
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1735); // L: 125
				}

				return var1; // L: 127
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;",
		garbageValue = "1804785923"
	)
	public SpritePixels method2931() {
		if (this.field1736 < 0) { // L: 131
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1736); // L: 132
			if (var1 != null) { // L: 133
				return var1;
			} else {
				var1 = ClientPacket.SpriteBuffer_getSprite(field1734, this.field1736, 0); // L: 134
				if (var1 != null) { // L: 135
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1736);
				}

				return var1; // L: 137
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;",
		garbageValue = "-2095016456"
	)
	public SpritePixels method2951() {
		if (this.field1737 < 0) { // L: 141
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1737); // L: 142
			if (var1 != null) { // L: 143
				return var1;
			} else {
				var1 = ClientPacket.SpriteBuffer_getSprite(field1734, this.field1737, 0); // L: 144
				if (var1 != null) { // L: 145
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1737);
				}

				return var1; // L: 147
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)Loh;",
		garbageValue = "-1"
	)
	public SpritePixels method2945() {
		if (this.field1738 < 0) { // L: 151
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1738); // L: 152
			if (var1 != null) {
				return var1; // L: 153
			} else {
				var1 = ClientPacket.SpriteBuffer_getSprite(field1734, this.field1738, 0); // L: 154
				if (var1 != null) { // L: 155
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1738);
				}

				return var1; // L: 157
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lkt;",
		garbageValue = "2065112934"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) { // L: 161
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId); // L: 162
			if (var1 != null) { // L: 163
				return var1;
			} else {
				AbstractArchive var3 = field1734; // L: 165
				AbstractArchive var4 = HitSplatDefinition_fontsArchive; // L: 166
				int var5 = this.fontId; // L: 167
				byte[] var7 = var3.takeFile(var5, 0); // L: 171
				boolean var6;
				if (var7 == null) { // L: 172
					var6 = false; // L: 173
				} else {
					ItemLayer.SpriteBuffer_decode(var7); // L: 176
					var6 = true; // L: 177
				}

				Font var2;
				if (!var6) { // L: 179
					var2 = null; // L: 180
				} else {
					byte[] var8 = var4.takeFile(var5, 0); // L: 184
					Font var10;
					if (var8 == null) { // L: 186
						var10 = null; // L: 187
					} else {
						Font var9 = new Font(var8, WorldMapDecoration.SpriteBuffer_xOffsets, Calendar.SpriteBuffer_yOffsets, class396.SpriteBuffer_spriteWidths, class302.SpriteBuffer_spriteHeights, MilliClock.SpriteBuffer_spritePalette, class396.SpriteBuffer_pixels); // L: 190
						MilliClock.method2587(); // L: 191
						var10 = var9; // L: 192
					}

					var2 = var10; // L: 194
				}

				if (var2 != null) { // L: 197
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2; // L: 199
			}
		}
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Lce;IIII)V",
		garbageValue = "65535"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class93.localPlayer != var0) { // L: 9102
			if (Client.menuOptionsCount < 400) { // L: 9103
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 9105
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 9106
					var7 = var0.combatLevel; // L: 9108
					int var8 = class93.localPlayer.combatLevel; // L: 9109
					int var9 = var8 - var7; // L: 9111
					String var6;
					if (var9 < -9) { // L: 9112
						var6 = class44.colorStartTag(16711680); // L: 9113
					} else if (var9 < -6) { // L: 9116
						var6 = class44.colorStartTag(16723968); // L: 9117
					} else if (var9 < -3) { // L: 9120
						var6 = class44.colorStartTag(16740352); // L: 9121
					} else if (var9 < 0) { // L: 9124
						var6 = class44.colorStartTag(16756736); // L: 9125
					} else if (var9 > 9) { // L: 9128
						var6 = class44.colorStartTag(65280); // L: 9129
					} else if (var9 > 6) { // L: 9132
						var6 = class44.colorStartTag(4259584); // L: 9133
					} else if (var9 > 3) { // L: 9136
						var6 = class44.colorStartTag(8453888); // L: 9137
					} else if (var9 > 0) { // L: 9140
						var6 = class44.colorStartTag(12648192); // L: 9141
					} else {
						var6 = class44.colorStartTag(16776960); // L: 9144
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 9146
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 9148
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 9149
					Occluder.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class44.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 9150
				} else if (Client.isSpellSelected) { // L: 9153
					if ((class4.selectedSpellFlags & 8) == 8) { // L: 9154
						Occluder.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class44.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 9155
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 9160
						if (Client.playerMenuActions[var10] != null) { // L: 9161
							short var11 = 0; // L: 9162
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 9163
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) { // L: 9164
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class93.localPlayer.combatLevel) { // L: 9165
									var11 = 2000; // L: 9166
								}

								if (class93.localPlayer.team != 0 && var0.team != 0) { // L: 9168
									if (var0.team == class93.localPlayer.team) { // L: 9169
										var11 = 2000;
									} else {
										var11 = 0; // L: 9170
									}
								} else if (var0.isClanMember()) { // L: 9172
									var11 = 2000; // L: 9173
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 9176
								var11 = 2000;
							}

							boolean var12 = false; // L: 9177
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 9178
							Occluder.insertMenuItemNoShift(Client.playerMenuActions[var10], class44.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 9179
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 9184
					if (Client.menuOpcodes[var10] == 23) { // L: 9185
						Client.menuTargets[var10] = class44.colorStartTag(16777215) + var4; // L: 9186
						break;
					}
				}

			}
		}
	} // L: 9190

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Lio;I)Z",
		garbageValue = "2130552221"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 11373
	}
}
