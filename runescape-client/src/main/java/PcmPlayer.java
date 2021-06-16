import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("tz")
	@ObfuscatedGetter(
		intValue = -1656768019
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("o")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("r")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -900105725
	)
	static int field416;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("k")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1427209561
	)
	int field400;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = -1728161507642357129L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -140802569
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -857903809
	)
	int field403;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1599565829
	)
	int field396;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = -6258201281571484971L
	)
	long field405;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1984678795
	)
	int field412;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -658055953
	)
	int field407;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1674190229
	)
	int field413;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 939543839577998155L
	)
	long field409;
	@ObfuscatedName("a")
	boolean field415;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1615466093
	)
	int field411;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lbc;"
	)
	PcmStream[] field408;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lbc;"
	)
	PcmStream[] field406;

	protected PcmPlayer() {
		this.field400 = 32; // L: 22
		this.timeMs = ClientPacket.currentTimeMillis(); // L: 23
		this.field405 = 0L; // L: 27
		this.field412 = 0; // L: 28
		this.field407 = 0; // L: 29
		this.field413 = 0; // L: 30
		this.field409 = 0L; // L: 31
		this.field415 = true; // L: 32
		this.field411 = 0; // L: 38
		this.field408 = new PcmStream[8]; // L: 39
		this.field406 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "86"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 277

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-412057865"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 278

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "19"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 281
	}

	@ObfuscatedName("y")
	@Export("write")
	protected void write() throws Exception {
	} // L: 284

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2004376502"
	)
	@Export("close")
	protected void close() {
	} // L: 285

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1448704014"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 286

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lbc;B)V",
		garbageValue = "82"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 76
	} // L: 77

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2069251377"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 80
			long var1 = ClientPacket.currentTimeMillis(); // L: 81

			try {
				if (0L != this.field405) { // L: 83
					if (var1 < this.field405) { // L: 84
						return;
					}

					this.open(this.capacity); // L: 85
					this.field405 = 0L; // L: 86
					this.field415 = true; // L: 87
				}

				int var3 = this.position(); // L: 89
				if (this.field413 - var3 > this.field412) { // L: 90
					this.field412 = this.field413 - var3;
				}

				int var4 = this.field403 + this.field396; // L: 91
				if (var4 + 256 > 16384) { // L: 92
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) { // L: 93
					this.capacity += 1024; // L: 94
					if (this.capacity > 16384) { // L: 95
						this.capacity = 16384;
					}

					this.close(); // L: 96
					this.open(this.capacity); // L: 97
					var3 = 0; // L: 98
					this.field415 = true; // L: 99
					if (var4 + 256 > this.capacity) { // L: 100
						var4 = this.capacity - 256; // L: 101
						this.field396 = var4 - this.field403; // L: 102
					}
				}

				while (var3 < var4) { // L: 105
					this.fill(this.samples, 256); // L: 106
					this.write(); // L: 107
					var3 += 256; // L: 108
				}

				if (var1 > this.field409) { // L: 110
					if (!this.field415) { // L: 111
						if (this.field412 == 0 && this.field407 == 0) { // L: 112
							this.close(); // L: 113
							this.field405 = var1 + 2000L; // L: 114
							return; // L: 115
						}

						this.field396 = Math.min(this.field407, this.field412); // L: 117
						this.field407 = this.field412; // L: 118
					} else {
						this.field415 = false; // L: 120
					}

					this.field412 = 0; // L: 121
					this.field409 = 2000L + var1; // L: 122
				}

				this.field413 = var3; // L: 124
			} catch (Exception var7) { // L: 126
				this.close(); // L: 127
				this.field405 = 2000L + var1; // L: 128
			}

			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) { // L: 132
					this.skip(256); // L: 133
					this.timeMs += (long)(256000 / class341.field3921); // L: 134
				}
			} catch (Exception var6) { // L: 137
				this.timeMs = var1; // L: 138
			}

		}
	} // L: 140

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1732163057"
	)
	public final void method844() {
		this.field415 = true; // L: 143
	} // L: 144

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1915909212"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field415 = true; // L: 147

		try {
			this.discard(); // L: 149
		} catch (Exception var2) { // L: 151
			this.close(); // L: 152
			this.field405 = ClientPacket.currentTimeMillis() + 2000L; // L: 153
		}

	} // L: 155

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2141825819"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (Login.soundSystem != null) { // L: 158
			boolean var1 = true; // L: 159

			for (int var2 = 0; var2 < 2; ++var2) { // L: 160
				if (this == Login.soundSystem.players[var2]) { // L: 161
					Login.soundSystem.players[var2] = null;
				}

				if (Login.soundSystem.players[var2] != null) { // L: 162
					var1 = false;
				}
			}

			if (var1) { // L: 164
				soundSystemExecutor.shutdownNow(); // L: 165
				soundSystemExecutor = null; // L: 166
				Login.soundSystem = null; // L: 167
			}
		}

		this.close(); // L: 170
		this.samples = null; // L: 171
	} // L: 172

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "120"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field411 -= var1; // L: 175
		if (this.field411 < 0) {
			this.field411 = 0; // L: 176
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 177
		}

	} // L: 178

	@ObfuscatedName("at")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 182
		if (PcmPlayer_stereo) { // L: 183
			var3 = var2 << 1;
		}

		class307.clearIntArray(var1, 0, var3); // L: 184
		this.field411 -= var2; // L: 185
		if (this.stream != null && this.field411 <= 0) { // L: 186
			this.field411 += class341.field3921 >> 4; // L: 187
			NetFileRequest.PcmStream_disable(this.stream); // L: 188
			this.method843(this.stream, this.stream.vmethod1099()); // L: 189
			int var4 = 0; // L: 190
			int var5 = 255; // L: 191

			int var6;
			PcmStream var10;
			label109:
			for (var6 = 7; var5 != 0; --var6) { // L: 192
				int var7;
				int var8;
				if (var6 < 0) { // L: 195
					var7 = var6 & 3; // L: 196
					var8 = -(var6 >> 2); // L: 197
				} else {
					var7 = var6; // L: 200
					var8 = 0; // L: 201
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) { // L: 203 205
					if ((var9 & 1) != 0) { // L: 208
						var5 &= ~(1 << var7); // L: 211
						var10 = null; // L: 212
						PcmStream var11 = this.field408[var7]; // L: 213

						label103:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 214
									break label103;
								}

								AbstractSound var12 = var11.sound; // L: 215
								if (var12 != null && var12.position > var8) { // L: 216
									var5 |= 1 << var7; // L: 217
									var10 = var11; // L: 218
									var11 = var11.after; // L: 219
								} else {
									var11.active = true; // L: 222
									int var13 = var11.vmethod4740(); // L: 223
									var4 += var13; // L: 224
									if (var12 != null) { // L: 225
										var12.position += var13;
									}

									if (var4 >= this.field400) { // L: 226
										break label109;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 227
									if (var14 != null) { // L: 228
										for (int var15 = var11.field473; var14 != null; var14 = var11.nextSubStream()) { // L: 229 230 232
											this.method843(var14, var15 * var14.vmethod1099() >> 8); // L: 231
										}
									}

									PcmStream var18 = var11.after; // L: 235
									var11.after = null; // L: 236
									if (var10 == null) { // L: 237
										this.field408[var7] = var18;
									} else {
										var10.after = var18; // L: 238
									}

									if (var18 == null) { // L: 239
										this.field406[var7] = var10;
									}

									var11 = var18; // L: 240
								}
							}
						}
					}

					var7 += 4; // L: 204
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) { // L: 244
				PcmStream var16 = this.field408[var6]; // L: 245
				PcmStream[] var17 = this.field408; // L: 246
				this.field406[var6] = null; // L: 248

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 249 250 253
					var10 = var16.after; // L: 251
					var16.after = null; // L: 252
				}
			}
		}

		if (this.field411 < 0) { // L: 257
			this.field411 = 0;
		}

		if (this.stream != null) { // L: 258
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = ClientPacket.currentTimeMillis(); // L: 259
	} // L: 260

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lbc;II)V",
		garbageValue = "176073519"
	)
	final void method843(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 269
		PcmStream var4 = this.field406[var3]; // L: 270
		if (var4 == null) { // L: 271
			this.field408[var3] = var1;
		} else {
			var4.after = var1; // L: 272
		}

		this.field406[var3] = var1; // L: 273
		var1.field473 = var2; // L: 274
	} // L: 275

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	public static void method856(int var0) {
		class233.musicPlayerStatus = 1; // L: 60
		InvDefinition.musicTrackArchive = null; // L: 61
		class233.musicTrackGroupId = -1; // L: 62
		class233.musicTrackFileId = -1; // L: 63
		class233.musicTrackVolume = 0; // L: 64
		GrandExchangeOfferUnitPriceComparator.musicTrackBoolean = false; // L: 65
		FaceNormal.pcmSampleLength = var0; // L: 66
	} // L: 67

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1170967176"
	)
	public static void method893() {
		KitDefinition.KitDefinition_cached.clear(); // L: 130
	} // L: 131

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;III)Llk;",
		garbageValue = "1530151189"
	)
	public static AbstractSocket method897(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2); // L: 10
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1965845813"
	)
	static int method898(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) { // L: 4365
			ChatChannel.Interpreter_intStackSize -= 5; // L: 4366
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 4367
			return 1; // L: 4368
		} else if (var0 == 7204) { // L: 4370
			ChatChannel.Interpreter_intStackSize -= 6; // L: 4371
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 4372
			return 1; // L: 4373
		} else if (var0 >= 7205 && var0 < 7209) { // L: 4375
			Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 4376
			return 1; // L: 4377
		} else if (var0 == 7209) { // L: 4379
			ChatChannel.Interpreter_intStackSize -= 2; // L: 4380
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 4381
			return 1; // L: 4382
		} else if (var0 >= 7210 && var0 < 7214) { // L: 4384
			--ChatChannel.Interpreter_intStackSize; // L: 4385
			return 1; // L: 4386
		} else if (var0 == 7214) { // L: 4388
			ChatChannel.Interpreter_intStackSize -= 2; // L: 4389
			return 1; // L: 4390
		} else {
			return 2; // L: 4392
		}
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-998429895"
	)
	static void method895() {
		Client.mouseLastLastPressedTimeMillis = -1L; // L: 2921
		UrlRequester.mouseRecorder.index = 0; // L: 2922
		class397.hasFocus = true; // L: 2923
		Client.hadFocus = true; // L: 2924
		Client.field850 = -1L; // L: 2925
		Decimator.method1160(); // L: 2926
		Client.packetWriter.clearBuffer(); // L: 2927
		Client.packetWriter.packetBuffer.offset = 0; // L: 2928
		Client.packetWriter.serverPacket = null; // L: 2929
		Client.packetWriter.field1410 = null; // L: 2930
		Client.packetWriter.field1411 = null; // L: 2931
		Client.packetWriter.field1399 = null; // L: 2932
		Client.packetWriter.serverPacketLength = 0; // L: 2933
		Client.packetWriter.field1408 = 0; // L: 2934
		Client.rebootTimer = 0; // L: 2935
		Client.logoutTimer = 0; // L: 2936
		Client.hintArrowType = 0; // L: 2937
		class34.method407(); // L: 2938
		MouseHandler.MouseHandler_idleCycles = 0; // L: 2940
		class69.method1208(); // L: 2942
		Client.isItemSelected = 0; // L: 2943
		Client.isSpellSelected = false; // L: 2944
		Client.soundEffectCount = 0; // L: 2945
		Client.camAngleY = 0; // L: 2946
		Client.oculusOrbState = 0; // L: 2947
		LoginPacket.field2800 = null; // L: 2948
		Client.minimapState = 0; // L: 2949
		Client.field853 = -1; // L: 2950
		Client.destinationX = 0; // L: 2951
		Client.destinationY = 0; // L: 2952
		Client.playerAttackOption = AttackOption.AttackOption_hidden; // L: 2953
		Client.npcAttackOption = AttackOption.AttackOption_hidden; // L: 2954
		Client.npcCount = 0; // L: 2955
		SoundCache.method928(); // L: 2956

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2957
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 32768; ++var0) { // L: 2958
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1; // L: 2959
		Client.projectiles.clear(); // L: 2960
		Client.graphicsObjects.clear(); // L: 2961

		for (var0 = 0; var0 < 4; ++var0) { // L: 2962
			for (int var4 = 0; var4 < 104; ++var4) { // L: 2963
				for (int var2 = 0; var2 < 104; ++var2) { // L: 2964
					Client.groundItems[var0][var4][var2] = null; // L: 2965
				}
			}
		}

		Client.pendingSpawns = new NodeDeque(); // L: 2969
		DevicePcmPlayerProvider.friendSystem.clear(); // L: 2970

		for (var0 = 0; var0 < SoundSystem.VarpDefinition_fileCount; ++var0) { // L: 2971
			VarpDefinition var1 = class1.VarpDefinition_get(var0); // L: 2972
			if (var1 != null) { // L: 2973
				Varps.Varps_temp[var0] = 0; // L: 2974
				Varps.Varps_main[var0] = 0; // L: 2975
			}
		}

		class20.varcs.clearTransient(); // L: 2978
		Client.followerIndex = -1; // L: 2979
		if (Client.rootInterface != -1) { // L: 2980
			class44.method540(Client.rootInterface);
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) { // L: 2981
			InvDefinition.closeInterface(var3, true); // L: 2982
		}

		Client.rootInterface = -1; // L: 2984
		Client.interfaceParents = new NodeHashTable(8); // L: 2985
		Client.meslayerContinueWidget = null; // L: 2986
		class34.method407(); // L: 2987
		Client.playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1); // L: 2988

		for (var0 = 0; var0 < 8; ++var0) { // L: 2989
			Client.playerMenuActions[var0] = null; // L: 2990
			Client.playerOptionsPriorities[var0] = false; // L: 2991
		}

		ItemContainer.itemContainers = new NodeHashTable(32); // L: 2994
		Client.isLoading = true; // L: 2996

		for (var0 = 0; var0 < 100; ++var0) { // L: 2997
			Client.field831[var0] = true;
		}

		BufferedSink.method5992(); // L: 2998
		class289.friendsChat = null; // L: 2999
		WorldMapManager.guestClanSettings = null; // L: 3000
		Arrays.fill(Client.currentClanSettings, (Object)null); // L: 3001
		AttackOption.guestClanChannel = null; // L: 3002
		Arrays.fill(Client.currentClanChannels, (Object)null); // L: 3003

		for (var0 = 0; var0 < 8; ++var0) { // L: 3004
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		class267.grandExchangeEvents = null; // L: 3005
	} // L: 3006

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1475129816"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 3078
		MouseRecorder.method2202(); // L: 3080
		UserComparator7.method2539(); // L: 3081
		method893(); // L: 3082
		CollisionMap.method3245(); // L: 3083
		class143.method2811(); // L: 3084
		Projectile.method2075(); // L: 3085
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 3087
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 3088
		MenuAction.method2028(); // L: 3090
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 3092
		class69.method1224(); // L: 3094
		class27.field215.method6474(); // L: 3095
		class26.HitSplatDefinition_cachedSprites.method6474(); // L: 3096
		class171.method3613(); // L: 3097
		Decimator.method1168(); // L: 3098
		SoundSystem.method916(); // L: 3099
		Players.method2402(); // L: 3100
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 3102
		PlayerComposition.PlayerAppearance_cachedModels.clear(); // L: 3105
		Widget.Widget_cachedSprites.clear(); // L: 3108
		Widget.Widget_cachedModels.clear(); // L: 3109
		Widget.Widget_cachedFonts.clear(); // L: 3110
		Widget.Widget_cachedSpriteMasks.clear(); // L: 3111
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 3113
		Script.Script_cached.clear(); // L: 3114
		ClanChannel.archive0.clearFiles(); // L: 3115
		KitDefinition.archive1.clearFiles(); // L: 3116
		class18.archive3.clearFiles(); // L: 3117
		class26.archive4.clearFiles(); // L: 3118
		class4.archive5.clearFiles(); // L: 3119
		DynamicObject.archive6.clearFiles(); // L: 3120
		archive7.clearFiles(); // L: 3121
		ModeWhere.archive8.clearFiles(); // L: 3122
		class16.archive9.clearFiles(); // L: 3123
		JagexCache.archive10.clearFiles(); // L: 3124
		class160.archive11.clearFiles(); // L: 3125
		Varcs.archive12.clearFiles(); // L: 3126
		DevicePcmPlayerProvider.scene.clear(); // L: 3128

		for (int var0 = 0; var0 < 4; ++var0) { // L: 3129
			Client.collisionMaps[var0].clear();
		}

		System.gc(); // L: 3130
		method856(2); // L: 3131
		Client.currentTrackGroupId = -1; // L: 3132
		Client.field862 = false; // L: 3133

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 3135
			if (var1.stream1 != null) { // L: 3136
				UserComparator7.pcmStreamMixer.removeSubStream(var1.stream1); // L: 3137
				var1.stream1 = null; // L: 3138
			}

			if (var1.stream2 != null) { // L: 3140
				UserComparator7.pcmStreamMixer.removeSubStream(var1.stream2); // L: 3141
				var1.stream2 = null; // L: 3142
			}
		}

		ObjectSound.objectSounds.clear(); // L: 3145
		Projectile.updateGameState(10); // L: 3147
	} // L: 3148

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "([Liv;IIIIIIIII)V",
		garbageValue = "-1362986911"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9390
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9391

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 9392
			Widget var10 = var0[var9]; // L: 9393
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 9394 9395
				int var11;
				if (var8 == -1) { // L: 9397
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 9398
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 9399
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 9400
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 9401
					var11 = ++Client.rootWidgetCount - 1; // L: 9402
				} else {
					var11 = var8; // L: 9404
				}

				var10.rootIndex = var11; // L: 9405
				var10.cycle = Client.cycle; // L: 9406
				if (!var10.isIf3 || !class35.isComponentHidden(var10)) { // L: 9407
					if (var10.contentType > 0) { // L: 9408
						class309.method5671(var10);
					}

					int var12 = var10.x + var6; // L: 9409
					int var13 = var7 + var10.y; // L: 9410
					int var14 = var10.transparencyTop; // L: 9411
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 9412
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 9413
							WorldMapCacheName.field2135 = var0; // L: 9414
							Clock.field1538 = var6; // L: 9415
							Canvas.field296 = var7; // L: 9416
							continue; // L: 9417
						}

						if (Client.isDraggingWidget && Client.field821) { // L: 9419
							var15 = MouseHandler.MouseHandler_x; // L: 9420
							var16 = MouseHandler.MouseHandler_y; // L: 9421
							var15 -= Client.widgetClickX; // L: 9422
							var16 -= Client.widgetClickY; // L: 9423
							if (var15 < Client.field801) { // L: 9424
								var15 = Client.field801;
							}

							if (var15 + var10.width > Client.field801 + Client.clickedWidgetParent.width) { // L: 9425
								var15 = Client.field801 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field802) { // L: 9426
								var16 = Client.field802;
							}

							if (var16 + var10.height > Client.field802 + Client.clickedWidgetParent.height) { // L: 9427
								var16 = Client.field802 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 9428
							var13 = var16; // L: 9429
						}

						if (!var10.isScrollBar) { // L: 9431
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 9437
						var15 = var2; // L: 9438
						var16 = var3; // L: 9439
						var17 = var4; // L: 9440
						var18 = var5; // L: 9441
					} else if (var10.type == 9) { // L: 9443
						var19 = var12; // L: 9444
						var20 = var13; // L: 9445
						var21 = var12 + var10.width; // L: 9446
						var22 = var13 + var10.height; // L: 9447
						if (var21 < var12) { // L: 9448
							var19 = var21; // L: 9450
							var21 = var12; // L: 9451
						}

						if (var22 < var13) { // L: 9453
							var20 = var22; // L: 9455
							var22 = var13; // L: 9456
						}

						++var21; // L: 9458
						++var22; // L: 9459
						var15 = var19 > var2 ? var19 : var2; // L: 9460
						var16 = var20 > var3 ? var20 : var3; // L: 9461
						var17 = var21 < var4 ? var21 : var4; // L: 9462
						var18 = var22 < var5 ? var22 : var5; // L: 9463
					} else {
						var19 = var12 + var10.width; // L: 9466
						var20 = var13 + var10.height; // L: 9467
						var15 = var12 > var2 ? var12 : var2; // L: 9468
						var16 = var13 > var3 ? var13 : var3; // L: 9469
						var17 = var19 < var4 ? var19 : var4; // L: 9470
						var18 = var20 < var5 ? var20 : var5; // L: 9471
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 9473
						if (var10.contentType != 0) { // L: 9474
							if (var10.contentType == 1336) { // L: 9475
								if (Client.displayFps) { // L: 9476
									var13 += 15; // L: 9477
									AbstractSocket.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 9478
									var13 += 15; // L: 9479
									Runtime var42 = Runtime.getRuntime(); // L: 9480
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L); // L: 9481
									var21 = 16776960; // L: 9482
									if (var20 > 327680 && !Client.isLowDetail) { // L: 9483
										var21 = 16711680;
									}

									AbstractSocket.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 9484
									var13 += 15; // L: 9485
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 9489
								Client.viewportX = var12; // L: 9490
								Client.viewportY = var13; // L: 9491
								UserComparator9.drawEntities(var12, var13, var10.width, var10.height); // L: 9492
								Client.field831[var10.rootIndex] = true; // L: 9493
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9494
								continue; // L: 9495
							}

							if (var10.contentType == 1338) { // L: 9497
								FloorOverlayDefinition.drawMinimap(var10, var12, var13, var11); // L: 9498
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9499
								continue; // L: 9500
							}

							if (var10.contentType == 1339) { // L: 9502
								IsaacCipher.drawCompass(var10, var12, var13, var11); // L: 9503
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9504
								continue; // L: 9505
							}

							if (var10.contentType == 1400) { // L: 9507
								class80.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 9508
							}

							if (var10.contentType == 1401) { // L: 9510
								class80.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 9511
							}

							if (var10.contentType == 1402) { // L: 9513
								PendingSpawn.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 9514
							}
						}

						if (var10.type == 0) { // L: 9517
							if (!var10.isIf3 && class35.isComponentHidden(var10) && var10 != MusicPatchNode.mousedOverWidgetIf1) { // L: 9518
								continue;
							}

							if (!var10.isIf3) { // L: 9519
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 9520
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 9521
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 9523
							if (var10.children != null) { // L: 9524
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 9525
							if (var30 != null) { // L: 9526
								SoundSystem.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 9527
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9529
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9530
						}

						if (Client.isResizable || Client.field833[var11] || Client.gameDrawingMode > 1) { // L: 9532
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 9533 9534
								BufferedSource.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 9536
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 9539
									var19 = 0; // L: 9540

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 9541
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 9542
											var22 = var12 + var21 * (var10.paddingX + 32); // L: 9543
											var23 = var20 * (var10.paddingY + 32) + var13; // L: 9544
											if (var19 < 20) { // L: 9545
												var22 += var10.inventoryXOffsets[var19]; // L: 9546
												var23 += var10.inventoryYOffsets[var19]; // L: 9547
											}

											if (var10.itemIds[var19] <= 0) { // L: 9549
												if (var10.inventorySprites != null && var19 < 20) { // L: 9594
													SpritePixels var46 = var10.getInventorySprite(var19); // L: 9595
													if (var46 != null) { // L: 9596
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field2958) { // L: 9597
														Script.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false; // L: 9550
												boolean var38 = false; // L: 9551
												var26 = var10.itemIds[var19] - 1; // L: 9552
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == VerticalAlignment.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9553
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var19 == Timer.selectedItemSlot && var10.id == class246.selectedItemWidget) { // L: 9555
														var35 = SpotAnimationDefinition.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = SpotAnimationDefinition.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 9556
													}

													if (var35 != null) { // L: 9557
														if (var10 == VerticalAlignment.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9558
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 9559
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 9560
															if (var24 < 5 && var24 > -5) { // L: 9561
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 9562
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 9563
																var24 = 0; // L: 9564
																var25 = 0; // L: 9565
															}

															var35.drawTransAt(var22 + var24, var23 + var25, 128); // L: 9567
															if (var1 != -1) { // L: 9568
																Widget var28 = var0[var1 & 65535]; // L: 9569
																int var29;
																if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 9570
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field683 / 3; // L: 9571
																	if (var29 > Client.field683 * 10) { // L: 9572
																		var29 = Client.field683 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 9573
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 9574
																	Client.draggedWidgetY += var29; // L: 9575
																	Script.invalidateWidget(var28); // L: 9576
																}

																if (var25 + var23 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 9578
																	var29 = (var25 + var23 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field683 / 3; // L: 9579
																	if (var29 > Client.field683 * 10) { // L: 9580
																		var29 = Client.field683 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 9581
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 9582
																	Client.draggedWidgetY -= var29; // L: 9583
																	Script.invalidateWidget(var28); // L: 9584
																}
															}
														} else if (var10 == Login.field1034 && var19 == Client.field729) { // L: 9588
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23); // L: 9589
														}
													} else {
														Script.invalidateWidget(var10); // L: 9591
													}
												}
											}

											++var19; // L: 9599
										}
									}
								} else if (var10.type == 3) { // L: 9604
									if (Friend.runCs1(var10)) { // L: 9606
										var19 = var10.color2; // L: 9607
										if (var10 == MusicPatchNode.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 9608
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 9611
										if (var10 == MusicPatchNode.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 9612
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 9614
										switch(var10.fillMode.field4242) { // L: 9615
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 9624
											break; // L: 9625
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 9621
											break; // L: 9622
										default:
											if (var14 == 0) { // L: 9617
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 9618
											}
										}
									} else if (var14 == 0) { // L: 9629
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 9630
									}
								} else {
									Font var39;
									if (var10.type == 4) { // L: 9634
										var39 = var10.getFont(); // L: 9635
										if (var39 == null) { // L: 9636
											if (Widget.field2958) { // L: 9637
												Script.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text; // L: 9641
											if (Friend.runCs1(var10)) { // L: 9642
												var20 = var10.color2; // L: 9643
												if (var10 == MusicPatchNode.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 9644
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 9645
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 9648
												if (var10 == MusicPatchNode.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 9649
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 9651
												ItemComposition var45 = class250.ItemDefinition_get(var10.itemId); // L: 9652
												var44 = var45.name; // L: 9653
												if (var44 == null) { // L: 9654
													var44 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 9655
													var44 = SecureRandomFuture.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + MusicPatchNode.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 9657
												var44 = "Please wait..."; // L: 9658
												var20 = var10.color; // L: 9659
											}

											if (!var10.isIf3) { // L: 9661
												var44 = ItemContainer.method2184(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 9662
										}
									} else if (var10.type == 5) { // L: 9665
										SpritePixels var40;
										if (!var10.isIf3) { // L: 9666
											var40 = var10.getSprite(Friend.runCs1(var10)); // L: 9667
											if (var40 != null) { // L: 9668
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field2958) { // L: 9669
												Script.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 9673
												var40 = SpotAnimationDefinition.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false); // L: 9674
											}

											if (var40 == null) { // L: 9675
												if (Widget.field2958) { // L: 9699
													Script.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width; // L: 9676
												var21 = var40.height; // L: 9677
												if (!var10.spriteTiling) { // L: 9678
													var22 = var10.width * 4096 / var20; // L: 9692
													if (var10.spriteAngle != 0) { // L: 9693
														var40.method7097(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 9694
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 9695
														var40.drawTransBgAt(var12, var13); // L: 9696
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 9679
													var22 = (var20 - 1 + var10.width) / var20; // L: 9680
													var23 = (var21 - 1 + var10.height) / var21; // L: 9681

													for (var24 = 0; var24 < var22; ++var24) { // L: 9682
														for (var25 = 0; var25 < var23; ++var25) { // L: 9683
															if (var10.spriteAngle != 0) { // L: 9684
																var40.method7097(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 9685
																var40.drawTransAt(var12 + var24 * var20, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var24 * var20, var13 + var25 * var21); // L: 9686
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9689
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) { // L: 9703
											boolean var36 = Friend.runCs1(var10); // L: 9704
											if (var36) { // L: 9706
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 9707
											}

											Model var41 = null; // L: 9708
											var22 = 0; // L: 9709
											if (var10.itemId != -1) { // L: 9710
												var33 = class250.ItemDefinition_get(var10.itemId); // L: 9711
												if (var33 != null) { // L: 9712
													var33 = var33.getCountObj(var10.itemQuantity); // L: 9713
													var41 = var33.getModel(1); // L: 9714
													if (var41 != null) { // L: 9715
														var41.calculateBoundsCylinder(); // L: 9716
														var22 = var41.height / 2; // L: 9717
													} else {
														Script.invalidateWidget(var10); // L: 9719
													}
												}
											} else if (var10.modelType == 5) { // L: 9722
												if (var10.modelId == 0) { // L: 9723
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = class262.localPlayer.getModel(); // L: 9724
												}
											} else if (var20 == -1) { // L: 9726
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, class262.localPlayer.appearance); // L: 9727
												if (var41 == null && Widget.field2958) { // L: 9728
													Script.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = WorldMapScaleHandler.SequenceDefinition_get(var20); // L: 9731
												var41 = var10.getModel(var47, var10.modelFrame, var36, class262.localPlayer.appearance); // L: 9732
												if (var41 == null && Widget.field2958) { // L: 9733
													Script.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method3950(var10.width / 2 + var12, var10.height / 2 + var13); // L: 9735
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 9736
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 9737
											if (var41 != null) { // L: 9738
												if (!var10.isIf3) { // L: 9739
													var41.method4347(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder(); // L: 9741
													if (var10.modelOrthog) { // L: 9742
														var41.method4309(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method4347(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 9743
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 9746
										} else {
											if (var10.type == 7) { // L: 9749
												var39 = var10.getFont(); // L: 9750
												if (var39 == null) { // L: 9751
													if (Widget.field2958) { // L: 9752
														Script.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 9755

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 9756
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 9757
														if (var10.itemIds[var20] > 0) { // L: 9758
															var33 = class250.ItemDefinition_get(var10.itemIds[var20] - 1); // L: 9759
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 9761
																var34 = SecureRandomFuture.colorStartTag(16748608) + var33.name + "</col>";
															} else {
																var34 = SecureRandomFuture.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + MusicPatchNode.formatItemStacks(var10.itemQuantities[var20]); // L: 9762
															}

															var25 = var12 + var22 * (var10.paddingX + 115); // L: 9763
															var26 = (var10.paddingY + 12) * var21 + var13; // L: 9764
															if (var10.textXAlignment == 0) { // L: 9765
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 9766
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 9767
															}
														}

														++var20; // L: 9769
													}
												}
											}

											if (var10.type == 8 && var10 == class5.field42 && Client.field773 == Client.field693) { // L: 9773 9774
												var19 = 0; // L: 9775
												var20 = 0; // L: 9776
												Font var31 = AbstractSocket.fontPlain12; // L: 9777
												String var32 = var10.text; // L: 9778

												String var43;
												for (var32 = ItemContainer.method2184(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 9780 9781 9793
													var24 = var32.indexOf("<br>"); // L: 9782
													if (var24 != -1) { // L: 9783
														var43 = var32.substring(0, var24); // L: 9784
														var32 = var32.substring(var24 + 4); // L: 9785
													} else {
														var43 = var32; // L: 9788
														var32 = ""; // L: 9789
													}

													var25 = var31.stringWidth(var43); // L: 9791
													if (var25 > var19) { // L: 9792
														var19 = var25;
													}
												}

												var19 += 6; // L: 9795
												var20 += 7; // L: 9796
												var24 = var12 + var10.width - 5 - var19; // L: 9797
												var25 = var13 + var10.height + 5; // L: 9798
												if (var24 < var12 + 5) { // L: 9799
													var24 = var12 + 5;
												}

												if (var19 + var24 > var4) { // L: 9800
													var24 = var4 - var19;
												}

												if (var25 + var20 > var5) { // L: 9801
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 9802
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 9803
												var32 = var10.text; // L: 9804
												var26 = var25 + var31.ascent + 2; // L: 9805

												for (var32 = ItemContainer.method2184(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 9806 9807 9818
													int var27 = var32.indexOf("<br>"); // L: 9808
													if (var27 != -1) { // L: 9809
														var43 = var32.substring(0, var27); // L: 9810
														var32 = var32.substring(var27 + 4); // L: 9811
													} else {
														var43 = var32; // L: 9814
														var32 = ""; // L: 9815
													}

													var31.draw(var43, var24 + 3, var26, 0, -1); // L: 9817
												}
											}

											if (var10.type == 9) { // L: 9822
												if (var10.field2994) { // L: 9827
													var19 = var12; // L: 9828
													var20 = var13 + var10.height; // L: 9829
													var21 = var12 + var10.width; // L: 9830
													var22 = var13; // L: 9831
												} else {
													var19 = var12; // L: 9834
													var20 = var13; // L: 9835
													var21 = var12 + var10.width; // L: 9836
													var22 = var13 + var10.height; // L: 9837
												}

												if (var10.lineWid == 1) { // L: 9839
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 9840
												} else {
													PlayerComposition.method4850(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 9843
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 9848
}
