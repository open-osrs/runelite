import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Lkl;I)I",
		garbageValue = "-214138656"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) { // L: 14
			return this.reversed ? var1.world - var2.world : var2.world - var1.world; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2009862837"
	)
	public static void method3546() {
		class13.midiPcmStream.clear(); // L: 49
		class206.musicPlayerStatus = 1; // L: 50
		class23.musicTrackArchive = null; // L: 51
	} // L: 52

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-1190316664"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 381
		int var2 = var1.readUnsignedByte(); // L: 382
		int var3 = var1.readInt(); // L: 383
		if (var3 < 0 || AbstractArchive.field3173 != 0 && var3 > AbstractArchive.field3173) { // L: 384
			throw new RuntimeException(); // L: 385
		} else if (var2 == 0) { // L: 387
			byte[] var6 = new byte[var3]; // L: 388
			var1.readBytes(var6, 0, var3); // L: 389
			return var6; // L: 390
		} else {
			int var4 = var1.readInt(); // L: 393
			if (var4 >= 0 && (AbstractArchive.field3173 == 0 || var4 <= AbstractArchive.field3173)) { // L: 394
				byte[] var5 = new byte[var4]; // L: 397
				if (var2 == 1) { // L: 398
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 399
				}

				return var5; // L: 400
			} else {
				throw new RuntimeException(); // L: 395
			}
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Lbi;IIII)V",
		garbageValue = "-2001365984"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (PlayerType.localPlayer != var0) { // L: 9234
			if (Client.menuOptionsCount < 400) { // L: 9235
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 9237
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 9238
					var7 = var0.combatLevel; // L: 9240
					int var8 = PlayerType.localPlayer.combatLevel; // L: 9241
					int var9 = var8 - var7; // L: 9243
					String var6;
					if (var9 < -9) { // L: 9244
						var6 = Client.colorStartTag(16711680); // L: 9245
					} else if (var9 < -6) { // L: 9248
						var6 = Client.colorStartTag(16723968); // L: 9249
					} else if (var9 < -3) { // L: 9252
						var6 = Client.colorStartTag(16740352); // L: 9253
					} else if (var9 < 0) { // L: 9256
						var6 = Client.colorStartTag(16756736); // L: 9257
					} else if (var9 > 9) { // L: 9260
						var6 = Client.colorStartTag(65280); // L: 9261
					} else if (var9 > 6) { // L: 9264
						var6 = Client.colorStartTag(4259584); // L: 9265
					} else if (var9 > 3) { // L: 9268
						var6 = Client.colorStartTag(8453888); // L: 9269
					} else if (var9 > 0) { // L: 9272
						var6 = Client.colorStartTag(12648192); // L: 9273
					} else {
						var6 = Client.colorStartTag(16776960); // L: 9276
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 9278
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 9280
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 9281
					ModelData0.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + Client.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 9282
				} else if (Client.isSpellSelected) { // L: 9285
					if ((class105.selectedSpellFlags & 8) == 8) { // L: 9286
						ModelData0.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Client.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 9287
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 9292
						if (Client.playerMenuActions[var10] != null) { // L: 9293
							short var11 = 0; // L: 9294
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 9295
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 9296
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > PlayerType.localPlayer.combatLevel) { // L: 9297
									var11 = 2000; // L: 9298
								}

								if (PlayerType.localPlayer.team != 0 && var0.team != 0) { // L: 9300
									if (var0.team == PlayerType.localPlayer.team) { // L: 9301
										var11 = 2000;
									} else {
										var11 = 0; // L: 9302
									}
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 9305
								var11 = 2000;
							}

							boolean var12 = false; // L: 9306
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 9307
							ModelData0.insertMenuItemNoShift(Client.playerMenuActions[var10], Client.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 9308
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 9313
					if (Client.menuOpcodes[var10] == 23) { // L: 9314
						Client.menuTargets[var10] = Client.colorStartTag(16777215) + var4; // L: 9315
						break;
					}
				}

			}
		}
	} // L: 9319
}
