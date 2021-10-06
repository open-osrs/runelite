import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("at")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Lkl;Lkl;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256);
		this.rawSounds = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.musicSampleIndex = var2;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II[II)Laa;",
		garbageValue = "-708728075"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = (long)var4;
		RawSound var7 = (RawSound)this.rawSounds.get(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var8 == null) {
				return null;
			} else {
				var7 = var8.toRawSound();
				this.rawSounds.put(var7, var5);
				if (var3 != null) {
					var3[0] -= var7.samples.length;
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II[II)Laa;",
		garbageValue = "-195355299"
	)
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = (long)var4 ^ 4294967296L;
		RawSound var7 = (RawSound)this.rawSounds.get(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5);
			if (var8 == null) {
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2);
				if (var8 == null) {
					return null;
				}

				this.musicSamples.put(var8, var5);
			}

			var7 = var8.toRawSound(var3);
			if (var7 == null) {
				return null;
			} else {
				var8.remove();
				this.rawSounds.put(var7, var5);
				return var7;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Laa;",
		garbageValue = "-74"
	)
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Laa;",
		garbageValue = "79"
	)
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) {
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Loy;B)V",
		garbageValue = "-6"
	)
	static final void method781(PacketBuffer var0) {
		for (int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) {
			int var2 = Players.Players_pendingUpdateIndices[var1];
			Player var3 = Client.players[var2];
			int var4 = var0.readUnsignedByte();
			if ((var4 & 64) != 0) {
				var4 += var0.readUnsignedByte() << 8;
			}

			Player.method2133(var0, var2, var3, var4);
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)Lon;",
		garbageValue = "70"
	)
	static SpritePixels method784() {
		SpritePixels var0 = new SpritePixels();
		var0.width = class414.SpriteBuffer_spriteWidth;
		var0.height = class408.SpriteBuffer_spriteHeight;
		var0.xOffset = class135.SpriteBuffer_xOffsets[0];
		var0.yOffset = class131.SpriteBuffer_yOffsets[0];
		var0.subWidth = class414.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class16.SpriteBuffer_spriteHeights[0];
		int var1 = var0.subWidth * var0.subHeight;
		byte[] var2 = class414.SpriteBuffer_pixels[0];
		var0.pixels = new int[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var0.pixels[var3] = class351.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		StudioGame.method5130();
		return var0;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "9"
	)
	public static int method771(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZI)I",
		garbageValue = "704557990"
	)
	static int method780(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
			GraphicsDefaults.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
			SpotAnimationDefinition.performPlayerAnimation(class67.localPlayer, Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize], Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field832) {
				Interpreter.field828 = true;
			}

			return 1;
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
				var16 = 0;
				if (LoginType.isNumber(var7)) {
					var16 = class279.method5134(var7);
				}

				PacketBufferNode var14 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2742, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeInt(var16);
				Client.packetWriter.addNode(var14);
				return 1;
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
					var12 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2666, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeByte(var7.length() + 1);
					var12.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var12);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
					var12 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2741, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeByte(var7.length() + 1);
					var12.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var12);
					return 1;
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
						class10.method104(var10, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						AbstractByteArrayCopier.Interpreter_intStackSize -= 3;
						var10 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
						Widget var15 = HealthBarUpdate.getWidget(var9);
						GrandExchangeEvents.clickWidget(var15, var10, var16);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
						var10 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
						Widget var13 = var2 ? WorldMapDecoration.scriptDotWidget : class245.scriptActiveWidget;
						GrandExchangeEvents.clickWidget(var13, var10, var16);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						VarbitComposition.mouseCam = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = WorldMapDecorationType.clientPreferences.roofsHidden ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						WorldMapDecorationType.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
						ScriptFrame.savePreferences();
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
						LoginScreenAnimation.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						var12 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2673, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeShort(var10);
						Client.packetWriter.addNode(var12);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						class54.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[class54.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[class54.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2679, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + class113.stringCp1252NullTerminatedByteSize(var4) + class113.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							var6.packetBuffer.method7066(var10);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						Skeleton.setTapToDrop(Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = WorldMapSection0.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--AbstractByteArrayCopier.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Huffman.canvasWidth;
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = MouseRecorder.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--AbstractByteArrayCopier.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field509 = 3;
						Client.field673 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field509 = 2;
						Client.field673 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field509 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field509 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field509 = 3;
						Client.field673 = var2 ? WorldMapDecoration.scriptDotWidget.id * -1239763633 * 1169899951 : class245.scriptActiveWidget.id * -1239763633 * 1169899951;
						return 1;
					} else {
						boolean var11;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
							WorldMapDecorationType.clientPreferences.hideUsername = var11;
							ScriptFrame.savePreferences();
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = WorldMapDecorationType.clientPreferences.hideUsername ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var11;
							if (!var11) {
								WorldMapDecorationType.clientPreferences.rememberedUsername = "";
								ScriptFrame.savePreferences();
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var11 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
							if (var11 == WorldMapDecorationType.clientPreferences.titleMusicDisabled) {
								WorldMapDecorationType.clientPreferences.titleMusicDisabled = !var11;
								ScriptFrame.savePreferences();
							}

							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = WorldMapDecorationType.clientPreferences.titleMusicDisabled ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class7.method56();
							return 1;
						} else if (var0 == 3155) {
							--class54.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--AbstractByteArrayCopier.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--AbstractByteArrayCopier.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class54.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--AbstractByteArrayCopier.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--AbstractByteArrayCopier.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--AbstractByteArrayCopier.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--AbstractByteArrayCopier.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--AbstractByteArrayCopier.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class54.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class54.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							var10 = 100 - Math.min(Math.max(Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize], 0), 100);
							class268.method5105((double)((float)var10 / 200.0F + 0.5F));
							return 1;
						} else if (var0 == 3182) {
							float var3 = 200.0F * ((float)WorldMapDecorationType.clientPreferences.brightness - 0.5F);
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 100 - Math.round(var3);
							return 1;
						} else if (var0 != 3183 && var0 != 3184) {
							return 2;
						} else {
							--AbstractByteArrayCopier.Interpreter_intStackSize;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1813767537"
	)
	static final void method768() {
		if (KitDefinition.field1665) {
			class245.method4681();
			KitDefinition.field1665 = false;
		}

	}
}
