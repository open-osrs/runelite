import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("mb")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	@Export("pcmPlayerProvider")
	static PlayerProvider pcmPlayerProvider;
	@ObfuscatedName("m")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 20
	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[Lmb;",
		garbageValue = "-107"
	)
	public static FontName[] method6334() {
		return new FontName[]{FontName_verdana15, FontName_verdana11, FontName_verdana13, FontName_bold12, FontName_plain11, FontName_plain12}; // L: 16
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-562774219"
	)
	public static int method6335(CharSequence var0) {
		return class8.method105(var0, 10, true); // L: 76
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;",
		garbageValue = "2"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 222
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 223
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 224
			return Short.TYPE;
		} else if (var0.equals("J")) { // L: 225
			return Long.TYPE;
		} else if (var0.equals("Z")) { // L: 226
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 227
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 228
			return Double.TYPE;
		} else if (var0.equals("C")) { // L: 229
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 230 231
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "57"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 144
		int var2 = 0; // L: 145

		for (int var3 = 0; var3 < var1; ++var3) { // L: 146
			var2 = (var2 << 5) - var2 + class125.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 147
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "840735253"
	)
	static final boolean method6331(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6; // L: 94
		if (var7 < var0 && var7 < var1 && var7 < var2) { // L: 95
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6; // L: 96
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false; // L: 97
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6; // L: 98
				if (var7 < var3 && var7 < var4 && var7 < var5) { // L: 99
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6; // L: 100
					return var7 <= var3 || var7 <= var4 || var7 <= var5; // L: 101
				}
			}
		}
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1913570357"
	)
	static int method6329() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1714
			int var0 = 0; // L: 1715

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1716
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1717
			}

			return var0 * 10000 / Client.field898; // L: 1719
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIII)V",
		garbageValue = "-281003514"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPCComposition var0, int var1, int var2, int var3) {
		if (Client.menuOptionsCount < 400) { // L: 9175
			if (var0.transforms != null) { // L: 9176
				var0 = var0.transform();
			}

			if (var0 != null) { // L: 9177
				if (var0.isInteractable) { // L: 9178
					if (!var0.isFollower || Client.followerIndex == var1) { // L: 9179
						String var4 = var0.name; // L: 9180
						int var7;
						int var8;
						if (var0.combatLevel != 0) { // L: 9181
							var7 = var0.combatLevel; // L: 9184
							var8 = class262.localPlayer.combatLevel; // L: 9185
							int var9 = var8 - var7; // L: 9187
							String var6;
							if (var9 < -9) { // L: 9188
								var6 = SecureRandomFuture.colorStartTag(16711680); // L: 9189
							} else if (var9 < -6) { // L: 9192
								var6 = SecureRandomFuture.colorStartTag(16723968); // L: 9193
							} else if (var9 < -3) { // L: 9196
								var6 = SecureRandomFuture.colorStartTag(16740352); // L: 9197
							} else if (var9 < 0) { // L: 9200
								var6 = SecureRandomFuture.colorStartTag(16756736); // L: 9201
							} else if (var9 > 9) { // L: 9204
								var6 = SecureRandomFuture.colorStartTag(65280); // L: 9205
							} else if (var9 > 6) { // L: 9208
								var6 = SecureRandomFuture.colorStartTag(4259584); // L: 9209
							} else if (var9 > 3) { // L: 9212
								var6 = SecureRandomFuture.colorStartTag(8453888); // L: 9213
							} else if (var9 > 0) { // L: 9216
								var6 = SecureRandomFuture.colorStartTag(12648192); // L: 9217
							} else {
								var6 = SecureRandomFuture.colorStartTag(16776960); // L: 9220
							}

							var4 = var4 + var6 + " " + " (" + "level-" + var0.combatLevel + ")"; // L: 9222
						}

						if (var0.isFollower && Client.followerOpsLowPriority) { // L: 9224
							class22.insertMenuItemNoShift("Examine", SecureRandomFuture.colorStartTag(16776960) + var4, 1003, var1, var2, var3); // L: 9225
						}

						if (Client.isItemSelected == 1) { // L: 9228
							class22.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + SecureRandomFuture.colorStartTag(16776960) + var4, 7, var1, var2, var3); // L: 9229
						} else if (Client.isSpellSelected) { // L: 9232
							if ((LoginPacket.selectedSpellFlags & 2) == 2) { // L: 9233
								class22.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + SecureRandomFuture.colorStartTag(16776960) + var4, 8, var1, var2, var3); // L: 9234
							}
						} else {
							int var10 = var0.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 9239
							String[] var11 = var0.actions; // L: 9240
							if (var11 != null) { // L: 9241
								for (var7 = 4; var7 >= 0; --var7) { // L: 9242
									if (var11[var7] != null && !var11[var7].equalsIgnoreCase("Attack")) { // L: 9243
										var8 = 0; // L: 9244
										if (var7 == 0) { // L: 9245
											var8 = var10 + 9;
										}

										if (var7 == 1) { // L: 9246
											var8 = var10 + 10;
										}

										if (var7 == 2) { // L: 9247
											var8 = var10 + 11;
										}

										if (var7 == 3) { // L: 9248
											var8 = var10 + 12;
										}

										if (var7 == 4) { // L: 9249
											var8 = var10 + 13;
										}

										class22.insertMenuItemNoShift(var11[var7], SecureRandomFuture.colorStartTag(16776960) + var4, var8, var1, var2, var3); // L: 9250
									}
								}
							}

							if (var11 != null) { // L: 9255
								for (var7 = 4; var7 >= 0; --var7) { // L: 9256
									if (var11[var7] != null && var11[var7].equalsIgnoreCase("Attack")) { // L: 9257
										short var12 = 0; // L: 9258
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) { // L: 9259
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class262.localPlayer.combatLevel) { // L: 9260
												var12 = 2000; // L: 9261
											}

											var8 = 0; // L: 9263
											if (var7 == 0) { // L: 9264
												var8 = var12 + 9;
											}

											if (var7 == 1) { // L: 9265
												var8 = var12 + 10;
											}

											if (var7 == 2) { // L: 9266
												var8 = var12 + 11;
											}

											if (var7 == 3) { // L: 9267
												var8 = var12 + 12;
											}

											if (var7 == 4) { // L: 9268
												var8 = var12 + 13;
											}

											class22.insertMenuItemNoShift(var11[var7], SecureRandomFuture.colorStartTag(16776960) + var4, var8, var1, var2, var3); // L: 9269
										}
									}
								}
							}

							if (!var0.isFollower || !Client.followerOpsLowPriority) { // L: 9274
								class22.insertMenuItemNoShift("Examine", SecureRandomFuture.colorStartTag(16776960) + var4, 1003, var1, var2, var3); // L: 9275
							}
						}

					}
				}
			}
		}
	} // L: 9279

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Liv;IIZS)V",
		garbageValue = "-1497"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 9966
		int var5 = var0.height; // L: 9967
		if (var0.widthAlignment == 0) { // L: 9968
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 9969
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 9970
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 9971
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 9972
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14; // L: 9973
		}

		if (var0.widthAlignment == 4) { // L: 9974
			var0.width = var0.height * var0.field2977 / var0.field2957;
		}

		if (var0.heightAlignment == 4) { // L: 9975
			var0.height = var0.field2957 * var0.width / var0.field2977;
		}

		if (var0.contentType == 1337) { // L: 9976
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 9977
			ScriptEvent var6 = new ScriptEvent(); // L: 9978
			var6.widget = var0; // L: 9979
			var6.args = var0.onResize; // L: 9980
			Client.scriptEvents.addFirst(var6); // L: 9981
		}

	} // L: 9983
}
