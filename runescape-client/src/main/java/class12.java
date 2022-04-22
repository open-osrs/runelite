import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("w")
class class12 extends SSLSocket {
	@ObfuscatedName("v")
	Certificate[] field62;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lm;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 81
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 85
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 89
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 93
	} // L: 94

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 227
	} // L: 273

	public String[] getEnabledCipherSuites() {
		return null; // L: 103
	}

	public String[] getEnabledProtocols() {
		return null; // L: 107
	}

	public boolean getNeedClientAuth() {
		return false; // L: 111
	}

	public String[] getSupportedProtocols() {
		return null; // L: 203
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 218

	public void setEnableSessionCreation(boolean var1) {
	} // L: 219

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 220

	public void setEnabledProtocols(String[] var1) {
	} // L: 221

	public void setNeedClientAuth(boolean var1) {
	} // L: 222

	public void setWantClientAuth(boolean var1) {
	} // L: 224

	public SSLSession getSession() {
		return new class17(this); // L: 115
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 96

	public void setUseClientMode(boolean var1) {
	} // L: 223

	public boolean getUseClientMode() {
		return false; // L: 211
	}

	public boolean getWantClientAuth() {
		return false; // L: 215
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 207
	}

	public boolean getEnableSessionCreation() {
		return false; // L: 99
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1760016998"
	)
	static void method157() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 300
			Login.currentLoginField = 1; // L: 301
		} else {
			Login.currentLoginField = 0; // L: 304
		}

	} // L: 306

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "380597881"
	)
	static final int method117(int var0, int var1) {
		int var2 = var0 + var1 * 57; // L: 927
		var2 ^= var2 << 13; // L: 928
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE; // L: 929
		return var3 >> 19 & 255; // L: 930
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1823604285"
	)
	static final void method158(int var0, int var1) {
		if (Client.hintArrowType == 2) { // L: 4843
			VarbitComposition.worldToScreen((Client.hintArrowX - GrandExchangeOfferOwnWorldComparator.baseX << 7) + Client.hintArrowSubX, (Client.hintArrowY - VarcInt.baseY << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2); // L: 4844
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4845
				InvDefinition.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}

		}
	} // L: 4846

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Lcy;IIII)V",
		garbageValue = "402229020"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 10015
		if (Client.menuOptionsCount < 400) { // L: 10016
			if (var4.transforms != null) { // L: 10017
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 10018
				if (var4.isInteractable) { // L: 10019
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 10020
						String var5 = var4.name; // L: 10021
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1182 != 0) { // L: 10022
							var6 = var0.field1182 != -1 ? var0.field1182 * -979480491 * -1781781251 : var4.combatLevel * -867920465 * 2112479567; // L: 10023
							var9 = GrandExchangeEvents.localPlayer.combatLevel; // L: 10026
							int var10 = var9 - var6; // L: 10028
							String var8;
							if (var10 < -9) { // L: 10029
								var8 = UserComparator9.colorStartTag(16711680); // L: 10030
							} else if (var10 < -6) { // L: 10033
								var8 = UserComparator9.colorStartTag(16723968); // L: 10034
							} else if (var10 < -3) { // L: 10037
								var8 = UserComparator9.colorStartTag(16740352); // L: 10038
							} else if (var10 < 0) { // L: 10041
								var8 = UserComparator9.colorStartTag(16756736); // L: 10042
							} else if (var10 > 9) { // L: 10045
								var8 = UserComparator9.colorStartTag(65280); // L: 10046
							} else if (var10 > 6) { // L: 10049
								var8 = UserComparator9.colorStartTag(4259584); // L: 10050
							} else if (var10 > 3) { // L: 10053
								var8 = UserComparator9.colorStartTag(8453888); // L: 10054
							} else if (var10 > 0) { // L: 10057
								var8 = UserComparator9.colorStartTag(12648192); // L: 10058
							} else {
								var8 = UserComparator9.colorStartTag(16776960); // L: 10061
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")"; // L: 10063
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 10065
							class21.insertMenuItemNoShift("Examine", UserComparator9.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10066
						}

						if (Client.isItemSelected == 1) { // L: 10069
							class21.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + UserComparator9.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 10070
						} else if (Client.isSpellSelected) { // L: 10073
							if ((class17.selectedSpellFlags & 2) == 2) { // L: 10074
								class21.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + UserComparator9.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 10075
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 10080
							String[] var7 = var4.actions; // L: 10081
							int var11;
							if (var7 != null) { // L: 10082
								for (var11 = 4; var11 >= 0; --var11) { // L: 10083
									if (var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) { // L: 10084
										var9 = 0; // L: 10085
										if (var11 == 0) { // L: 10086
											var9 = var6 + 9;
										}

										if (var11 == 1) { // L: 10087
											var9 = var6 + 10;
										}

										if (var11 == 2) { // L: 10088
											var9 = var6 + 11;
										}

										if (var11 == 3) { // L: 10089
											var9 = var6 + 12;
										}

										if (var11 == 4) { // L: 10090
											var9 = var6 + 13;
										}

										class21.insertMenuItemNoShift(var7[var11], UserComparator9.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10091
									}
								}
							}

							if (var7 != null) { // L: 10096
								for (var11 = 4; var11 >= 0; --var11) { // L: 10097
									if (var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) { // L: 10098
										short var12 = 0; // L: 10099
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) { // L: 10100
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > GrandExchangeEvents.localPlayer.combatLevel) { // L: 10101
												var12 = 2000; // L: 10102
											}

											var9 = 0; // L: 10104
											if (var11 == 0) { // L: 10105
												var9 = var12 + 9;
											}

											if (var11 == 1) { // L: 10106
												var9 = var12 + 10;
											}

											if (var11 == 2) { // L: 10107
												var9 = var12 + 11;
											}

											if (var11 == 3) { // L: 10108
												var9 = var12 + 12;
											}

											if (var11 == 4) { // L: 10109
												var9 = var12 + 13;
											}

											class21.insertMenuItemNoShift(var7[var11], UserComparator9.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10110
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 10115
								class21.insertMenuItemNoShift("Examine", UserComparator9.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10116
							}
						}

					}
				}
			}
		}
	} // L: 10120

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "121"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12535
		short[] var2 = new short[16]; // L: 12536
		int var3 = 0; // L: 12537

		for (int var4 = 0; var4 < class293.ItemDefinition_fileCount; ++var4) { // L: 12538
			ItemComposition var9 = class19.ItemDefinition_get(var4); // L: 12539
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12540 12541 12542
				if (var3 >= 250) { // L: 12543
					Script.foundItemIdCount = -1; // L: 12544
					PendingSpawn.foundItemIds = null; // L: 12545
					return; // L: 12546
				}

				if (var3 >= var2.length) { // L: 12548
					short[] var6 = new short[var2.length * 2]; // L: 12549

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12550
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12551
				}

				var2[var3++] = (short)var4; // L: 12553
			}
		}

		PendingSpawn.foundItemIds = var2; // L: 12555
		GameEngine.foundItemIndex = 0; // L: 12556
		Script.foundItemIdCount = var3; // L: 12557
		String[] var8 = new String[Script.foundItemIdCount]; // L: 12558

		for (int var5 = 0; var5 < Script.foundItemIdCount; ++var5) { // L: 12559
			var8[var5] = class19.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = PendingSpawn.foundItemIds; // L: 12560
		class117.sortItemsByName(var8, var10, 0, var8.length - 1); // L: 12562
	} // L: 12564
}
