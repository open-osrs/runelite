import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gt")
public class class184 implements WorldMapSection {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("Widget_spritesArchive")
	public static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1787653751
	)
	int field2093;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -488133759
	)
	int field2085;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1976143363
	)
	int field2095;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2143369535
	)
	int field2087;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -353178983
	)
	int field2094;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 768564603
	)
	int field2089;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1740450095
	)
	int field2084;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2133705891
	)
	int field2091;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1064129903
	)
	int field2092;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1523705091
	)
	int field2088;

	class184() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lfr;I)V",
		garbageValue = "1411488256"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2094) {
			var1.regionLowX = this.field2094;
		}

		if (var1.regionHighX < this.field2094) {
			var1.regionHighX = this.field2094;
		}

		if (var1.regionLowY > this.field2089) {
			var1.regionLowY = this.field2089;
		}

		if (var1.regionHighY < this.field2089) {
			var1.regionHighY = this.field2089;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "899981978"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2093 && var1 < this.field2085 + this.field2093) {
			return var2 >= (this.field2095 << 6) + (this.field2084 << 3) && var2 <= (this.field2095 << 6) + (this.field2084 << 3) + 7 && var3 >= (this.field2087 << 6) + (this.field2091 << 3) && var3 <= (this.field2087 << 6) + (this.field2091 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1579388425"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2094 << 6) + (this.field2092 << 3) && var1 <= (this.field2094 << 6) + (this.field2092 << 3) + 7 && var2 >= (this.field2089 << 6) + (this.field2088 << 3) && var2 <= (this.field2089 << 6) + (this.field2088 << 3) + 7;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1605422008"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{var2 + (this.field2094 * 64 - this.field2095 * 64) + (this.field2092 * 8 - this.field2084 * 8), var3 + (this.field2089 * 64 - this.field2087 * 64) + (this.field2088 * 8 - this.field2091 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)Liy;",
		garbageValue = "1389329989"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field2095 * 64 - this.field2094 * 64 + (this.field2084 * 8 - this.field2092 * 8) + var1;
			int var4 = var2 + (this.field2087 * 64 - this.field2089 * 64) + (this.field2091 * 8 - this.field2088 * 8);
			return new Coord(this.field2093, var3, var4);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-2069607106"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2093 = var1.readUnsignedByte();
		this.field2085 = var1.readUnsignedByte();
		this.field2095 = var1.readUnsignedShort();
		this.field2084 = var1.readUnsignedByte();
		this.field2087 = var1.readUnsignedShort();
		this.field2091 = var1.readUnsignedByte();
		this.field2094 = var1.readUnsignedShort();
		this.field2092 = var1.readUnsignedByte();
		this.field2089 = var1.readUnsignedShort();
		this.field2088 = var1.readUnsignedByte();
		this.method3711();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1438305611"
	)
	void method3711() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkk;Lkk;ZII)V",
		garbageValue = "-1532489295"
	)
	static void method3725(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				Message.method1113(4);
			}

		} else {
			if (var3 == 0) {
				MenuAction.method1876(var2);
			} else {
				Message.method1113(var3);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			class318.leftTitleSprite = class17.convertJpgToSprite(var4);
			Login.rightTitleSprite = class318.leftTitleSprite.mirrorHorizontally();
			int var5 = Client.worldProperties;
			if ((var5 & 536870912) != 0) {
				class394.logoSprite = class196.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var5 & 1073741824) != 0) {
				class394.logoSprite = class196.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else {
				class394.logoSprite = class196.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			Login.titleboxSprite = class196.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Login.titlebuttonSprite = class196.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			UserComparator8.field1312 = class196.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			class14.field69 = class196.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			class196.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			Login.runesSprite = PacketBuffer.method6764(var1, "runes", "");
			class92.title_muteSprite = PacketBuffer.method6764(var1, "title_mute", "");
			ModelData0.options_buttons_0Sprite = class196.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			class21.field107 = class196.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			Client.options_buttons_2Sprite = class196.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			PlayerComposition.field3019 = class196.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			class1.field3 = ModelData0.options_buttons_0Sprite.subWidth;
			class280.field3323 = ModelData0.options_buttons_0Sprite.subHeight;
			Login.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
			}

			class274.field3274 = 0;
			AbstractWorldMapIcon.otp = "";
			Login.field893 = true;
			Login.worldSelectOpen = false;
			if (!VarbitComposition.clientPreferences.titleMusicDisabled) {
				Archive var6 = class276.archive6;
				int var7 = var6.getGroupId("scape main");
				int var8 = var6.getFileId(var7, "");
				class247.musicPlayerStatus = 1;
				class247.musicTrackArchive = var6;
				class247.musicTrackGroupId = var7;
				GrandExchangeOfferOwnWorldComparator.musicTrackFileId = var8;
				class196.musicTrackVolume = 255;
				class20.musicTrackBoolean = false;
				class130.pcmSampleLength = 2;
			} else {
				class16.method218(2);
			}

			if (NetCache.NetCache_socket != null) {
				try {
					Buffer var12 = new Buffer(4);
					var12.writeByte(3);
					var12.writeMedium(0);
					NetCache.NetCache_socket.write(var12.array, 0, 4);
				} catch (IOException var11) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var10) {
					}

					++NetCache.NetCache_ioExceptions;
					NetCache.NetCache_socket = null;
				}
			}

			Login.clearLoginScreen = true;
			Login.xPadding = (InvDefinition.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			class11.loginBoxCenter = Login.loginBoxX + 180;
			class318.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class394.logoSprite.drawAt(Login.xPadding + 382 - class394.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZI)I",
		garbageValue = "761456408"
	)
	static int method3721(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			SecureRandomCallable.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			class240.Interpreter_intStackSize -= 2;
			PacketWriter.performPlayerAnimation(class129.localPlayer, Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field827) {
				Interpreter.field829 = true;
			}

			return 1;
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				var16 = 0;
				if (Timer.isNumber(var7)) {
					var16 = GrandExchangeOfferAgeComparator.method5303(var7);
				}

				PacketBufferNode var14 = FriendSystem.getPacketBufferNode(ClientPacket.field2665, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeInt(var16);
				Client.packetWriter.addNode(var14);
				return 1;
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var12 = FriendSystem.getPacketBufferNode(ClientPacket.field2725, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeByte(var7.length() + 1);
					var12.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var12);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var12 = FriendSystem.getPacketBufferNode(ClientPacket.field2673, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeByte(var7.length() + 1);
					var12.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var12);
					return 1;
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
						class328.method5845(var10, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class240.Interpreter_intStackSize -= 3;
						var10 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2];
						Widget var15 = class87.getWidget(var9);
						Canvas.clickWidget(var15, var10, var16);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class240.Interpreter_intStackSize -= 2;
						var10 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
						Widget var13 = var2 ? PacketWriter.scriptDotWidget : class9.scriptActiveWidget;
						Canvas.clickWidget(var13, var10, var16);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						Script.mouseCam = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = VarbitComposition.clientPreferences.roofsHidden ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						VarbitComposition.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
						DevicePcmPlayerProvider.savePreferences();
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
						Interpreter.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
						var12 = FriendSystem.getPacketBufferNode(ClientPacket.field2703, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeShort(var10);
						Client.packetWriter.addNode(var12);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = FriendSystem.getPacketBufferNode(ClientPacket.field2711, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + BufferedSink.stringCp1252NullTerminatedByteSize(var4) + BufferedSink.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.writeByte(var10);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class17.setTapToDrop(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class138.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						class240.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						class240.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--class240.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = InvDefinition.canvasWidth;
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = GameEngine.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class240.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class240.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field650 = 3;
						Client.field543 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field650 = 2;
						Client.field543 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field650 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field650 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field650 = 3;
						Client.field543 = var2 ? PacketWriter.scriptDotWidget.id * 296163183 * 1986537359 : class9.scriptActiveWidget.id * 296163183 * 1986537359;
						return 1;
					} else {
						boolean var11;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							VarbitComposition.clientPreferences.hideUsername = var11;
							DevicePcmPlayerProvider.savePreferences();
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = VarbitComposition.clientPreferences.hideUsername ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var11;
							if (!var11) {
								VarbitComposition.clientPreferences.rememberedUsername = "";
								DevicePcmPlayerProvider.savePreferences();
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var11 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							if (var11 == VarbitComposition.clientPreferences.titleMusicDisabled) {
								VarbitComposition.clientPreferences.titleMusicDisabled = !var11;
								DevicePcmPlayerProvider.savePreferences();
							}

							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = VarbitComposition.clientPreferences.titleMusicDisabled ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = UserComparator7.method2409();
							return 1;
						} else if (var0 == 3155) {
							--Interpreter.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							class240.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--class240.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--class240.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--Interpreter.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--class240.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--class240.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							class240.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							class240.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							class240.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--class240.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--class240.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--class240.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--Interpreter.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--Interpreter.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							var10 = 100 - Math.min(Math.max(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize], 0), 100);
							Varps.method4858((double)(0.5F + (float)var10 / 200.0F));
							return 1;
						} else if (var0 == 3182) {
							float var3 = ((float)VarbitComposition.clientPreferences.field1193 - 0.5F) * 200.0F;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 100 - Math.round(var3);
							return 1;
						} else if (var0 != 3183 && var0 != 3184) {
							return 2;
						} else {
							--class240.Interpreter_intStackSize;
							return 1;
						}
					}
				}
			}
		}
	}
}
