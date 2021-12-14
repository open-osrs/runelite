import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bf")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("fr")
	static int[] field984;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 421357321
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -53898693
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lkz;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1404548417"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method5584(var1) || this.archive.method5570(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("b")
	static boolean method2123(long var0) {
		int var2 = (int)(var0 >>> 14 & 3L);
		return var2 == 2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-1437384176"
	)
	static int method2122(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
			class194.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			IsaacCipher.Interpreter_intStackSize -= 2;
			class125.performPlayerAnimation(class340.localPlayer, Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize], Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field816) {
				Interpreter.field818 = true;
			}

			return 1;
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
				var16 = 0;
				if (ClanSettings.isNumber(var7)) {
					var16 = ClanChannelMember.method2778(var7);
				}

				PacketBufferNode var14 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2862, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeInt(var16);
				Client.packetWriter.addNode(var14);
				return 1;
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					var12 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2845, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeByte(var7.length() + 1);
					var12.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var12);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					var12 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2893, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeByte(var7.length() + 1);
					var12.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var12);
					return 1;
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
						class136.method2840(var10, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						IsaacCipher.Interpreter_intStackSize -= 3;
						var10 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2];
						Widget var15 = ChatChannel.getWidget(var9);
						class29.clickWidget(var15, var10, var16);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						IsaacCipher.Interpreter_intStackSize -= 2;
						var10 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
						Widget var13 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget;
						class29.clickWidget(var13, var10, var16);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class150.mouseCam = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = SecureRandomFuture.clientPreferences.roofsHidden ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						SecureRandomFuture.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
						class127.savePreferences();
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
						WorldMapSprite.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
						var12 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2808, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeShort(var10);
						Client.packetWriter.addNode(var12);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
						class13.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2841, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + class116.stringCp1252NullTerminatedByteSize(var4) + class116.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							var6.packetBuffer.method7343(var10);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class12.setTapToDrop(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Tiles.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						IsaacCipher.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						IsaacCipher.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--IsaacCipher.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class186.canvasWidth;
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = BoundaryObject.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--IsaacCipher.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						IsaacCipher.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field638 = 3;
						Client.field639 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field638 = 2;
						Client.field639 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field638 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field638 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field638 = 3;
						Client.field639 = var2 ? WorldMapArea.scriptDotWidget.id * 1695982371 * 2075239563 : Messages.scriptActiveWidget.id * 1695982371 * 2075239563;
						return 1;
					} else {
						boolean var11;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							SecureRandomFuture.clientPreferences.hideUsername = var11;
							class127.savePreferences();
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = SecureRandomFuture.clientPreferences.hideUsername ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var11;
							if (!var11) {
								SecureRandomFuture.clientPreferences.rememberedUsername = "";
								class127.savePreferences();
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var11 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
							if (var11 == SecureRandomFuture.clientPreferences.titleMusicDisabled) {
								SecureRandomFuture.clientPreferences.titleMusicDisabled = !var11;
								class127.savePreferences();
							}

							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = SecureRandomFuture.clientPreferences.titleMusicDisabled ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = AbstractRasterProvider.method7714();
							return 1;
						} else if (var0 == 3155) {
							--class13.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							IsaacCipher.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--IsaacCipher.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--IsaacCipher.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class13.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--IsaacCipher.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--IsaacCipher.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							IsaacCipher.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							IsaacCipher.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							IsaacCipher.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--IsaacCipher.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--IsaacCipher.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--IsaacCipher.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class13.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class13.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							var10 = 100 - Math.min(Math.max(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize], 0), 100);
							InterfaceParent.method2142((double)(0.5F + (float)var10 / 200.0F));
							return 1;
						} else if (var0 == 3182) {
							float var3 = ((float)SecureRandomFuture.clientPreferences.brightness - 0.5F) * 200.0F;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 100 - Math.round(var3);
							return 1;
						} else if (var0 != 3183 && var0 != 3184) {
							return 2;
						} else {
							--IsaacCipher.Interpreter_intStackSize;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "1046590636"
	)
	static int method2120(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) {
			IsaacCipher.Interpreter_intStackSize -= 5;
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7204) {
			IsaacCipher.Interpreter_intStackSize -= 6;
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7205 && var0 < 7209) {
			Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7209) {
			IsaacCipher.Interpreter_intStackSize -= 2;
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7210 && var0 < 7214) {
			--IsaacCipher.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7214) {
			IsaacCipher.Interpreter_intStackSize -= 2;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-47"
	)
	static boolean method2125() {
		return Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81];
	}
}
