import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("NetSocket")
public final class NetSocket extends AbstractSocket implements Runnable {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("i")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("w")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("s")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("a")
	@Export("isClosed")
	boolean isClosed;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	@Export("taskHandler")
	TaskHandler taskHandler;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("e")
	@Export("outBuffer")
	byte[] outBuffer;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 23689551
	)
	@Export("outLength")
	int outLength;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1817332035
	)
	@Export("outOffset")
	int outOffset;
	@ObfuscatedName("b")
	@Export("exceptionWriting")
	boolean exceptionWriting;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 401992191
	)
	@Export("bufferLength")
	final int bufferLength;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -955072145
	)
	@Export("maxPacketLength")
	final int maxPacketLength;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;Lew;I)V"
	)
	public NetSocket(Socket var1, TaskHandler var2, int var3) throws IOException {
		this.isClosed = false; // L: 16
		this.outLength = 0; // L: 20
		this.outOffset = 0; // L: 21
		this.exceptionWriting = false; // L: 22
		this.taskHandler = var2; // L: 28
		this.socket = var1; // L: 29
		this.bufferLength = var3; // L: 30
		this.maxPacketLength = var3 - 100; // L: 31
		this.socket.setSoTimeout(30000); // L: 32
		this.socket.setTcpNoDelay(true); // L: 33
		this.socket.setReceiveBufferSize(65536); // L: 34
		this.socket.setSendBufferSize(65536); // L: 35
		this.inputStream = this.socket.getInputStream(); // L: 36
		this.outputStream = this.socket.getOutputStream(); // L: 37
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("close")
	public void close() {
		if (!this.isClosed) { // L: 41
			synchronized(this) { // L: 42
				this.isClosed = true; // L: 43
				this.notifyAll(); // L: 44
			} // L: 45

			if (this.task != null) { // L: 46
				while (this.task.status == 0) { // L: 47
					FloorUnderlayDefinition.method3190(1L); // L: 48
				}

				if (this.task.status == 1) { // L: 50
					try {
						((Thread)this.task.result).join(); // L: 52
					} catch (InterruptedException var3) { // L: 54
					}
				}
			}

			this.task = null; // L: 57
		}
	} // L: 58

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1953698452"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.isClosed ? 0 : this.inputStream.read(); // L: 65 66
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1632705310"
	)
	@Export("available")
	public int available() throws IOException {
		return this.isClosed ? 0 : this.inputStream.available(); // L: 70 71
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1771919747"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		if (this.isClosed) { // L: 75
			return false;
		} else {
			return this.inputStream.available() >= var1; // L: 76
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-1246528305"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		if (this.isClosed) { // L: 80
			return 0;
		} else {
			int var4;
			int var5;
			for (var4 = var3; var3 > 0; var3 -= var5) { // L: 81 82 86
				var5 = this.inputStream.read(var1, var2, var3); // L: 83
				if (var5 <= 0) { // L: 84
					throw new EOFException();
				}

				var2 += var5; // L: 85
			}

			return var4; // L: 88
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "0"
	)
	@Export("write0")
	void write0(byte[] var1, int var2, int var3) throws IOException {
		if (!this.isClosed) { // L: 92
			if (this.exceptionWriting) { // L: 93
				this.exceptionWriting = false; // L: 94
				throw new IOException(); // L: 95
			} else {
				if (this.outBuffer == null) { // L: 97
					this.outBuffer = new byte[this.bufferLength];
				}

				synchronized(this) { // L: 98
					for (int var5 = 0; var5 < var3; ++var5) { // L: 99
						this.outBuffer[this.outOffset] = var1[var5 + var2]; // L: 100
						this.outOffset = (this.outOffset + 1) % this.bufferLength; // L: 101
						if ((this.outLength + this.maxPacketLength) % this.bufferLength == this.outOffset) { // L: 102
							throw new IOException(); // L: 103
						}
					}

					if (this.task == null) { // L: 106
						this.task = this.taskHandler.newThreadTask(this, 3); // L: 107
					}

					this.notifyAll(); // L: 109
				}
			}
		}
	} // L: 111

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-748791607"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.write0(var1, var2, var3); // L: 160
	} // L: 161

	protected void finalize() {
		this.close(); // L: 61
	} // L: 62

	public void run() {
		try {
			while (true) {
				label84: {
					int var1;
					int var2;
					synchronized(this) { // L: 118
						if (this.outOffset == this.outLength) { // L: 119
							if (this.isClosed) { // L: 120
								break label84;
							}

							try {
								this.wait(); // L: 122
							} catch (InterruptedException var10) { // L: 124
							}
						}

						var2 = this.outLength; // L: 126
						if (this.outOffset >= this.outLength) { // L: 127
							var1 = this.outOffset - this.outLength;
						} else {
							var1 = this.bufferLength - this.outLength; // L: 128
						}
					}

					if (var1 <= 0) { // L: 130
						continue;
					}

					try {
						this.outputStream.write(this.outBuffer, var2, var1); // L: 132
					} catch (IOException var9) { // L: 134
						this.exceptionWriting = true; // L: 135
					}

					this.outLength = (var1 + this.outLength) % this.bufferLength; // L: 137

					try {
						if (this.outLength == this.outOffset) { // L: 139
							this.outputStream.flush();
						}
					} catch (IOException var8) { // L: 141
						this.exceptionWriting = true; // L: 142
					}
					continue;
				}

				try {
					if (this.inputStream != null) { // L: 147
						this.inputStream.close();
					}

					if (this.outputStream != null) { // L: 148
						this.outputStream.close();
					}

					if (this.socket != null) { // L: 149
						this.socket.close();
					}
				} catch (IOException var7) { // L: 151
				}

				this.outBuffer = null; // L: 152
				break;
			}
		} catch (Exception var12) { // L: 154
			MilliClock.RunException_sendStackTrace((String)null, var12); // L: 155
		}

	} // L: 157

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIII)J",
		garbageValue = "965371090"
	)
	static long method2923(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1); // L: 38
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1408375765"
	)
	@Export("load")
	static void load() {
		int var25;
		if (Client.titleLoadingStage == 0) { // L: 2002
			GameBuild.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 2003

			for (var25 = 0; var25 < 4; ++var25) { // L: 2004
				Client.collisionMaps[var25] = new CollisionMap(104, 104);
			}

			class10.sceneMinimapSprite = new SpritePixels(512, 512); // L: 2005
			Login.Login_loadingText = "Starting game engine..."; // L: 2006
			Login.Login_loadingPercent = 5; // L: 2007
			Client.titleLoadingStage = 20; // L: 2008
		} else if (Client.titleLoadingStage == 20) { // L: 2011
			Login.Login_loadingText = "Prepared visibility map"; // L: 2012
			Login.Login_loadingPercent = 10; // L: 2013
			Client.titleLoadingStage = 30; // L: 2014
		} else if (Client.titleLoadingStage == 30) { // L: 2017
			InvDefinition.archive0 = UrlRequest.newArchive(0, false, true, true); // L: 2018
			ApproximateRouteStrategy.archive1 = UrlRequest.newArchive(1, false, true, true); // L: 2019
			class1.archive2 = UrlRequest.newArchive(2, true, false, true); // L: 2020
			ParamComposition.archive3 = UrlRequest.newArchive(3, false, true, true); // L: 2021
			class12.archive4 = UrlRequest.newArchive(4, false, true, true); // L: 2022
			class11.archive5 = UrlRequest.newArchive(5, true, true, true); // L: 2023
			Messages.archive6 = UrlRequest.newArchive(6, true, true, true); // L: 2024
			HorizontalAlignment.archive7 = UrlRequest.newArchive(7, false, true, true); // L: 2025
			GrandExchangeOfferOwnWorldComparator.archive8 = UrlRequest.newArchive(8, false, true, true); // L: 2026
			SecureRandomFuture.archive9 = UrlRequest.newArchive(9, false, true, true); // L: 2027
			ChatChannel.archive10 = UrlRequest.newArchive(10, false, true, true); // L: 2028
			AbstractWorldMapIcon.archive11 = UrlRequest.newArchive(11, false, true, true); // L: 2029
			class14.archive12 = UrlRequest.newArchive(12, false, true, true); // L: 2030
			LoginScreenAnimation.archive13 = UrlRequest.newArchive(13, true, false, true); // L: 2031
			SecureRandomCallable.archive14 = UrlRequest.newArchive(14, false, true, true); // L: 2032
			Archive.archive15 = UrlRequest.newArchive(15, false, true, true); // L: 2033
			Message.archive17 = UrlRequest.newArchive(17, true, true, true); // L: 2034
			Messages.archive18 = UrlRequest.newArchive(18, false, true, true); // L: 2035
			class111.archive19 = UrlRequest.newArchive(19, false, true, true); // L: 2036
			GrandExchangeOfferOwnWorldComparator.archive20 = UrlRequest.newArchive(20, false, true, true); // L: 2037
			Login.Login_loadingText = "Connecting to update server"; // L: 2038
			Login.Login_loadingPercent = 20; // L: 2039
			Client.titleLoadingStage = 40; // L: 2040
		} else if (Client.titleLoadingStage == 40) { // L: 2043
			byte var39 = 0; // L: 2044
			var25 = var39 + InvDefinition.archive0.percentage() * 4 / 100; // L: 2045
			var25 += ApproximateRouteStrategy.archive1.percentage() * 4 / 100; // L: 2046
			var25 += class1.archive2.percentage() * 2 / 100; // L: 2047
			var25 += ParamComposition.archive3.percentage() * 2 / 100; // L: 2048
			var25 += class12.archive4.percentage() * 6 / 100; // L: 2049
			var25 += class11.archive5.percentage() * 4 / 100; // L: 2050
			var25 += Messages.archive6.percentage() * 2 / 100; // L: 2051
			var25 += HorizontalAlignment.archive7.percentage() * 56 / 100; // L: 2052
			var25 += GrandExchangeOfferOwnWorldComparator.archive8.percentage() * 2 / 100; // L: 2053
			var25 += SecureRandomFuture.archive9.percentage() * 2 / 100; // L: 2054
			var25 += ChatChannel.archive10.percentage() * 2 / 100; // L: 2055
			var25 += AbstractWorldMapIcon.archive11.percentage() * 2 / 100; // L: 2056
			var25 += class14.archive12.percentage() * 2 / 100; // L: 2057
			var25 += LoginScreenAnimation.archive13.percentage() * 2 / 100; // L: 2058
			var25 += SecureRandomCallable.archive14.percentage() * 2 / 100; // L: 2059
			var25 += Archive.archive15.percentage() * 2 / 100; // L: 2060
			var25 += class111.archive19.percentage() / 100; // L: 2061
			var25 += Messages.archive18.percentage() / 100; // L: 2062
			var25 += GrandExchangeOfferOwnWorldComparator.archive20.percentage() / 100; // L: 2063
			var25 += Message.archive17.method5260() && Message.archive17.isFullyLoaded() ? 1 : 0; // L: 2064
			if (var25 != 100) { // L: 2065
				if (var25 != 0) { // L: 2066
					Login.Login_loadingText = "Checking for updates - " + var25 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 2067
			} else {
				UserComparator8.method2460(InvDefinition.archive0, "Animations"); // L: 2070
				UserComparator8.method2460(ApproximateRouteStrategy.archive1, "Skeletons"); // L: 2071
				UserComparator8.method2460(class12.archive4, "Sound FX"); // L: 2072
				UserComparator8.method2460(class11.archive5, "Maps"); // L: 2073
				UserComparator8.method2460(Messages.archive6, "Music Tracks"); // L: 2074
				UserComparator8.method2460(HorizontalAlignment.archive7, "Models"); // L: 2075
				UserComparator8.method2460(GrandExchangeOfferOwnWorldComparator.archive8, "Sprites"); // L: 2076
				UserComparator8.method2460(AbstractWorldMapIcon.archive11, "Music Jingles"); // L: 2077
				UserComparator8.method2460(SecureRandomCallable.archive14, "Music Samples"); // L: 2078
				UserComparator8.method2460(Archive.archive15, "Music Patches"); // L: 2079
				UserComparator8.method2460(class111.archive19, "World Map"); // L: 2080
				UserComparator8.method2460(Messages.archive18, "World Map Geography"); // L: 2081
				UserComparator8.method2460(GrandExchangeOfferOwnWorldComparator.archive20, "World Map Ground"); // L: 2082
				class111.spriteIds = new GraphicsDefaults(); // L: 2083
				class111.spriteIds.decode(Message.archive17); // L: 2084
				Login.Login_loadingText = "Loaded update list"; // L: 2085
				Login.Login_loadingPercent = 30; // L: 2086
				Client.titleLoadingStage = 45; // L: 2087
			}
		} else {
			Archive var27;
			Archive var28;
			Archive var29;
			if (Client.titleLoadingStage == 45) { // L: 2090
				boolean var38 = !Client.isLowDetail; // L: 2091
				UserComparator2.field4359 = 22050; // L: 2094
				PcmPlayer.PcmPlayer_stereo = var38; // L: 2095
				PcmPlayer.field272 = 2; // L: 2096
				MidiPcmStream var34 = new MidiPcmStream(); // L: 2098
				var34.method4761(9, 128); // L: 2099
				HealthBar.pcmPlayer0 = class112.method2522(GameEngine.taskHandler, 0, 22050); // L: 2100
				HealthBar.pcmPlayer0.setStream(var34); // L: 2101
				var27 = Archive.archive15; // L: 2102
				var28 = SecureRandomCallable.archive14; // L: 2103
				var29 = class12.archive4; // L: 2104
				class247.musicPatchesArchive = var27; // L: 2106
				class247.musicSamplesArchive = var28; // L: 2107
				class408.soundEffectsArchive = var29; // L: 2108
				class247.midiPcmStream = var34; // L: 2109
				ScriptEvent.pcmPlayer1 = class112.method2522(GameEngine.taskHandler, 1, 2048); // L: 2111
				BuddyRankComparator.pcmStreamMixer = new PcmStreamMixer(); // L: 2112
				ScriptEvent.pcmPlayer1.setStream(BuddyRankComparator.pcmStreamMixer); // L: 2113
				FontName.decimator = new Decimator(22050, UserComparator2.field4359); // L: 2114
				Login.Login_loadingText = "Prepared sound engine"; // L: 2115
				Login.Login_loadingPercent = 35; // L: 2116
				Client.titleLoadingStage = 50; // L: 2117
				MenuAction.WorldMapElement_fonts = new Fonts(GrandExchangeOfferOwnWorldComparator.archive8, LoginScreenAnimation.archive13); // L: 2118
			} else {
				int var1;
				if (Client.titleLoadingStage == 50) { // L: 2121
					FontName[] var33 = new FontName[]{FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_plain12, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_verdana13}; // L: 2124
					var1 = var33.length; // L: 2126
					Fonts var35 = MenuAction.WorldMapElement_fonts; // L: 2127
					FontName[] var36 = new FontName[]{FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_plain12, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_verdana13}; // L: 2130
					Client.fontsMap = var35.createMap(var36); // L: 2132
					if (Client.fontsMap.size() < var1) { // L: 2133
						Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var1 + "%"; // L: 2134
						Login.Login_loadingPercent = 40; // L: 2135
					} else {
						FriendLoginUpdate.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 2138
						class6.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 2139
						Login.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 2140
						class54.platformInfo = Client.platformInfoProvider.get(); // L: 2141
						Login.Login_loadingText = "Loaded fonts"; // L: 2142
						Login.Login_loadingPercent = 40; // L: 2143
						Client.titleLoadingStage = 60; // L: 2144
					}
				} else {
					int var3;
					int var4;
					Archive var26;
					if (Client.titleLoadingStage == 60) { // L: 2147
						var26 = ChatChannel.archive10; // L: 2149
						var27 = GrandExchangeOfferOwnWorldComparator.archive8; // L: 2150
						var3 = 0; // L: 2152
						String[] var37 = Login.field885; // L: 2154

						int var30;
						String var31;
						for (var30 = 0; var30 < var37.length; ++var30) { // L: 2155
							var31 = var37[var30]; // L: 2156
							if (var26.tryLoadFileByNames(var31, "")) { // L: 2158
								++var3;
							}
						}

						var37 = Login.field871; // L: 2163

						for (var30 = 0; var30 < var37.length; ++var30) { // L: 2164
							var31 = var37[var30]; // L: 2165
							if (var27.tryLoadFileByNames(var31, "")) { // L: 2167
								++var3;
							}
						}

						var4 = ReflectionCheck.method1115(); // L: 2174
						if (var3 < var4) { // L: 2175
							Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var4 + "%"; // L: 2176
							Login.Login_loadingPercent = 50; // L: 2177
						} else {
							Login.Login_loadingText = "Loaded title screen"; // L: 2180
							Login.Login_loadingPercent = 50; // L: 2181
							WorldMapData_1.updateGameState(5); // L: 2182
							Client.titleLoadingStage = 70; // L: 2183
						}
					} else if (Client.titleLoadingStage == 70) { // L: 2186
						if (!class1.archive2.isFullyLoaded()) { // L: 2187
							Login.Login_loadingText = "Loading config - " + class1.archive2.loadPercent() + "%"; // L: 2188
							Login.Login_loadingPercent = 60; // L: 2189
						} else {
							Archive var32 = class1.archive2; // L: 2192
							FloorOverlayDefinition.FloorOverlayDefinition_archive = var32; // L: 2194
							var26 = class1.archive2; // L: 2196
							FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var26; // L: 2198
							var27 = class1.archive2; // L: 2200
							var28 = HorizontalAlignment.archive7; // L: 2201
							KitDefinition.KitDefinition_archive = var27; // L: 2203
							KitDefinition.KitDefinition_modelsArchive = var28; // L: 2204
							class67.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 2205
							var29 = class1.archive2; // L: 2207
							Archive var5 = HorizontalAlignment.archive7; // L: 2208
							boolean var6 = Client.isLowDetail; // L: 2209
							ObjectComposition.ObjectDefinition_archive = var29; // L: 2211
							ObjectComposition.ObjectDefinition_modelsArchive = var5; // L: 2212
							ObjectComposition.ObjectDefinition_isLowDetail = var6; // L: 2213
							Archive var7 = class1.archive2; // L: 2215
							Archive var8 = HorizontalAlignment.archive7; // L: 2216
							NPCComposition.NpcDefinition_archive = var7; // L: 2218
							NPCComposition.NpcDefinition_modelArchive = var8; // L: 2219
							class28.method405(class1.archive2); // L: 2221
							Archive var9 = class1.archive2; // L: 2222
							Archive var10 = HorizontalAlignment.archive7; // L: 2223
							boolean var11 = Client.isMembersWorld; // L: 2224
							Font var12 = FriendLoginUpdate.fontPlain11; // L: 2225
							DirectByteArrayCopier.ItemDefinition_archive = var9; // L: 2227
							HealthBarDefinition.ItemDefinition_modelArchive = var10; // L: 2228
							BuddyRankComparator.ItemDefinition_inMembersWorld = var11; // L: 2229
							class129.ItemDefinition_fileCount = DirectByteArrayCopier.ItemDefinition_archive.getGroupFileCount(10); // L: 2230
							SoundSystem.ItemDefinition_fontPlain11 = var12; // L: 2231
							Archive var13 = class1.archive2; // L: 2233
							Archive var14 = InvDefinition.archive0; // L: 2234
							Archive var15 = ApproximateRouteStrategy.archive1; // L: 2235
							SequenceDefinition.SequenceDefinition_archive = var13; // L: 2237
							SequenceDefinition.SequenceDefinition_animationsArchive = var14; // L: 2238
							SequenceDefinition.SequenceDefinition_skeletonsArchive = var15; // L: 2239
							Archive var16 = class1.archive2; // L: 2241
							Archive var17 = HorizontalAlignment.archive7; // L: 2242
							SpotAnimationDefinition.SpotAnimationDefinition_archive = var16; // L: 2244
							class389.SpotAnimationDefinition_modelArchive = var17; // L: 2245
							HealthBarUpdate.method2183(class1.archive2); // L: 2247
							Players.method2327(class1.archive2); // L: 2248
							class128.method2720(ParamComposition.archive3, HorizontalAlignment.archive7, GrandExchangeOfferOwnWorldComparator.archive8, LoginScreenAnimation.archive13); // L: 2249
							Archive var18 = class1.archive2; // L: 2250
							InvDefinition.InvDefinition_archive = var18; // L: 2252
							UserComparator7.method2463(class1.archive2); // L: 2254
							MouseRecorder.method2093(class1.archive2); // L: 2255
							class28.method400(class1.archive2); // L: 2256
							FileSystem.field1564 = new class387(RouteStrategy.field1986, 54, MouseHandler.clientLanguage, class1.archive2); // L: 2257
							class240.HitSplatDefinition_cachedSprites = new class387(RouteStrategy.field1986, 47, MouseHandler.clientLanguage, class1.archive2); // L: 2258
							Message.varcs = new Varcs(); // L: 2259
							class20.method295(class1.archive2, GrandExchangeOfferOwnWorldComparator.archive8, LoginScreenAnimation.archive13); // L: 2260
							Archive var19 = class1.archive2; // L: 2261
							Archive var20 = GrandExchangeOfferOwnWorldComparator.archive8; // L: 2262
							HealthBarDefinition.HealthBarDefinition_archive = var19; // L: 2264
							HealthBarDefinition.field1658 = var20; // L: 2265
							Archive var21 = class1.archive2; // L: 2267
							Archive var22 = GrandExchangeOfferOwnWorldComparator.archive8; // L: 2268
							WorldMapElement.WorldMapElement_archive = var22; // L: 2270
							if (var21.isFullyLoaded()) { // L: 2271
								WorldMapElement.WorldMapElement_count = var21.getGroupFileCount(35); // L: 2274
								WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count]; // L: 2275

								for (int var23 = 0; var23 < WorldMapElement.WorldMapElement_count; ++var23) { // L: 2276
									byte[] var24 = var21.takeFile(35, var23); // L: 2277
									WorldMapElement.WorldMapElement_cached[var23] = new WorldMapElement(var23); // L: 2278
									if (var24 != null) { // L: 2279
										WorldMapElement.WorldMapElement_cached[var23].decode(new Buffer(var24)); // L: 2280
										WorldMapElement.WorldMapElement_cached[var23].method3008(); // L: 2281
									}
								}
							}

							Login.Login_loadingText = "Loaded config"; // L: 2285
							Login.Login_loadingPercent = 60; // L: 2286
							Client.titleLoadingStage = 80; // L: 2287
						}
					} else if (Client.titleLoadingStage == 80) { // L: 2290
						var25 = 0; // L: 2291
						if (class114.compass == null) { // L: 2292
							class114.compass = WorldMapSection0.SpriteBuffer_getSprite(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.compass, 0);
						} else {
							++var25; // L: 2293
						}

						if (BoundaryObject.redHintArrowSprite == null) { // L: 2294
							BoundaryObject.redHintArrowSprite = WorldMapSection0.SpriteBuffer_getSprite(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.field4008, 0);
						} else {
							++var25; // L: 2295
						}

						if (TriBool.mapSceneSprites == null) { // L: 2296
							TriBool.mapSceneSprites = UserComparator5.method2478(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.mapScenes, 0);
						} else {
							++var25; // L: 2297
						}

						if (Client.headIconPkSprites == null) { // L: 2298
							Client.headIconPkSprites = class21.method312(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.headIconsPk, 0);
						} else {
							++var25; // L: 2299
						}

						if (ServerPacket.headIconPrayerSprites == null) { // L: 2300
							ServerPacket.headIconPrayerSprites = class21.method312(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.field4011, 0);
						} else {
							++var25; // L: 2301
						}

						if (DevicePcmPlayerProvider.headIconHintSprites == null) { // L: 2302
							DevicePcmPlayerProvider.headIconHintSprites = class21.method312(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.field4012, 0);
						} else {
							++var25; // L: 2303
						}

						if (WorldMapIcon_0.mapMarkerSprites == null) { // L: 2304
							WorldMapIcon_0.mapMarkerSprites = class21.method312(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.field4013, 0);
						} else {
							++var25; // L: 2305
						}

						if (UserComparator10.crossSprites == null) { // L: 2306
							UserComparator10.crossSprites = class21.method312(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.field4014, 0);
						} else {
							++var25; // L: 2307
						}

						if (class115.mapDotSprites == null) { // L: 2308
							class115.mapDotSprites = class21.method312(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.field4010, 0);
						} else {
							++var25; // L: 2309
						}

						if (GameEngine.scrollBarSprites == null) { // L: 2310
							GameEngine.scrollBarSprites = UserComparator5.method2478(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.field4018, 0);
						} else {
							++var25; // L: 2311
						}

						if (class7.modIconSprites == null) { // L: 2312
							class7.modIconSprites = UserComparator5.method2478(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.field4016, 0);
						} else {
							++var25; // L: 2313
						}

						if (var25 < 11) { // L: 2314
							Login.Login_loadingText = "Loading sprites - " + var25 * 100 / 12 + "%"; // L: 2315
							Login.Login_loadingPercent = 70; // L: 2316
						} else {
							AbstractFont.AbstractFont_modIconSprites = class7.modIconSprites; // L: 2319
							BoundaryObject.redHintArrowSprite.normalize(); // L: 2320
							var1 = (int)(Math.random() * 21.0D) - 10; // L: 2321
							int var2 = (int)(Math.random() * 21.0D) - 10; // L: 2322
							var3 = (int)(Math.random() * 21.0D) - 10; // L: 2323
							var4 = (int)(Math.random() * 41.0D) - 20; // L: 2324
							TriBool.mapSceneSprites[0].shiftColors(var1 + var4, var2 + var4, var4 + var3); // L: 2325
							Login.Login_loadingText = "Loaded sprites"; // L: 2326
							Login.Login_loadingPercent = 70; // L: 2327
							Client.titleLoadingStage = 90; // L: 2328
						}
					} else if (Client.titleLoadingStage == 90) { // L: 2331
						if (!SecureRandomFuture.archive9.isFullyLoaded()) { // L: 2332
							Login.Login_loadingText = "Loading textures - " + "0%"; // L: 2333
							Login.Login_loadingPercent = 90; // L: 2334
						} else {
							Varcs.textureProvider = new TextureProvider(SecureRandomFuture.archive9, GrandExchangeOfferOwnWorldComparator.archive8, 20, class408.clientPreferences.brightness, Client.isLowDetail ? 64 : 128); // L: 2337
							Rasterizer3D.Rasterizer3D_setTextureLoader(Varcs.textureProvider); // L: 2338
							Rasterizer3D.Rasterizer3D_setBrightness(class408.clientPreferences.brightness); // L: 2339
							Client.titleLoadingStage = 100; // L: 2340
						}
					} else if (Client.titleLoadingStage == 100) { // L: 2343
						var25 = Varcs.textureProvider.getLoadedPercentage(); // L: 2344
						if (var25 < 100) { // L: 2345
							Login.Login_loadingText = "Loading textures - " + var25 + "%"; // L: 2346
							Login.Login_loadingPercent = 90; // L: 2347
						} else {
							Login.Login_loadingText = "Loaded textures"; // L: 2350
							Login.Login_loadingPercent = 90; // L: 2351
							Client.titleLoadingStage = 110; // L: 2352
						}
					} else if (Client.titleLoadingStage == 110) { // L: 2355
						Interpreter.mouseRecorder = new MouseRecorder(); // L: 2356
						GameEngine.taskHandler.newThreadTask(Interpreter.mouseRecorder, 10); // L: 2357
						Login.Login_loadingText = "Loaded input handler"; // L: 2358
						Login.Login_loadingPercent = 92; // L: 2359
						Client.titleLoadingStage = 120; // L: 2360
					} else if (Client.titleLoadingStage == 120) { // L: 2363
						if (!ChatChannel.archive10.tryLoadFileByNames("huffman", "")) { // L: 2364
							Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 2365
							Login.Login_loadingPercent = 94; // L: 2366
						} else {
							Huffman var0 = new Huffman(ChatChannel.archive10.takeFileByNames("huffman", "")); // L: 2369
							ItemLayer.method4108(var0); // L: 2370
							Login.Login_loadingText = "Loaded wordpack"; // L: 2371
							Login.Login_loadingPercent = 94; // L: 2372
							Client.titleLoadingStage = 130; // L: 2373
						}
					} else if (Client.titleLoadingStage == 130) { // L: 2376
						if (!ParamComposition.archive3.isFullyLoaded()) { // L: 2377
							Login.Login_loadingText = "Loading interfaces - " + ParamComposition.archive3.loadPercent() * 4 / 5 + "%"; // L: 2378
							Login.Login_loadingPercent = 96; // L: 2379
						} else if (!class14.archive12.isFullyLoaded()) { // L: 2382
							Login.Login_loadingText = "Loading interfaces - " + (80 + class14.archive12.loadPercent() / 6) + "%"; // L: 2383
							Login.Login_loadingPercent = 96; // L: 2384
						} else if (!LoginScreenAnimation.archive13.isFullyLoaded()) { // L: 2387
							Login.Login_loadingText = "Loading interfaces - " + (96 + LoginScreenAnimation.archive13.loadPercent() / 50) + "%"; // L: 2388
							Login.Login_loadingPercent = 96; // L: 2389
						} else {
							Login.Login_loadingText = "Loaded interfaces"; // L: 2392
							Login.Login_loadingPercent = 98; // L: 2393
							Client.titleLoadingStage = 140; // L: 2394
						}
					} else if (Client.titleLoadingStage == 140) { // L: 2397
						Login.Login_loadingPercent = 100; // L: 2398
						if (!class111.archive19.tryLoadGroupByName(WorldMapCacheName.field2210.name)) { // L: 2399
							Login.Login_loadingText = "Loading world map - " + class111.archive19.groupLoadPercentByName(WorldMapCacheName.field2210.name) / 10 + "%"; // L: 2400
						} else {
							if (class133.worldMap == null) { // L: 2403
								class133.worldMap = new WorldMap(); // L: 2404
								class133.worldMap.init(class111.archive19, Messages.archive18, GrandExchangeOfferOwnWorldComparator.archive20, Login.fontBold12, Client.fontsMap, TriBool.mapSceneSprites); // L: 2405
							}

							Login.Login_loadingText = "Loaded world map"; // L: 2407
							Client.titleLoadingStage = 150; // L: 2408
						}
					} else if (Client.titleLoadingStage == 150) { // L: 2411
						WorldMapData_1.updateGameState(10); // L: 2412
					}
				}
			}
		}
	} // L: 2009 2015 2041 2068 2088 2119 2136 2145 2178 2184 2190 2288 2317 2329 2335 2341 2348 2353 2361 2367 2374 2380 2385 2390 2395 2401 2409 2413 2415
}
