import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1724087219
	)
	public static int field300;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("pcmPlayerProvider")
	public static class47 pcmPlayerProvider;
	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = 2000163897
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;
	@ObfuscatedName("b")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -340177369
	)
	int field284;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = 5049222240699791159L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 579110347
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1078400585
	)
	int field287;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1185294269
	)
	int field288;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 6299016637519592913L
	)
	long field289;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1779244015
	)
	int field294;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 757484531
	)
	int field282;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 15281057
	)
	int field292;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = -315826732775221247L
	)
	long field293;
	@ObfuscatedName("u")
	boolean field281;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1579013191
	)
	int field295;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lao;"
	)
	PcmStream[] field296;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lao;"
	)
	PcmStream[] field297;

	protected PcmPlayer() {
		this.field284 = 32; // L: 22
		this.timeMs = class113.method2624(); // L: 23
		this.field289 = 0L; // L: 27
		this.field294 = 0; // L: 28
		this.field282 = 0; // L: 29
		this.field292 = 0; // L: 30
		this.field293 = 0L; // L: 31
		this.field281 = true; // L: 32
		this.field295 = 0; // L: 38
		this.field296 = new PcmStream[8]; // L: 39
		this.field297 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-125708948"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 280

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-30840"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 281

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "181"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 284
	}

	@ObfuscatedName("k")
	@Export("write")
	protected void write() throws Exception {
	} // L: 287

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "25"
	)
	@Export("close")
	protected void close() {
	} // L: 288

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "207475579"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 289

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lao;I)V",
		garbageValue = "1991751814"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 79
	} // L: 80

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "631128625"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 83
			long var1 = class113.method2624(); // L: 84

			try {
				if (this.field289 != 0L) { // L: 86
					if (var1 < this.field289) { // L: 87
						return;
					}

					this.open(this.capacity); // L: 88
					this.field289 = 0L; // L: 89
					this.field281 = true; // L: 90
				}

				int var3 = this.position(); // L: 92
				if (this.field292 - var3 > this.field294) { // L: 93
					this.field294 = this.field292 - var3;
				}

				int var4 = this.field287 + this.field288; // L: 94
				if (var4 + 256 > 16384) { // L: 95
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) { // L: 96
					this.capacity += 1024; // L: 97
					if (this.capacity > 16384) { // L: 98
						this.capacity = 16384;
					}

					this.close(); // L: 99
					this.open(this.capacity); // L: 100
					var3 = 0; // L: 101
					this.field281 = true; // L: 102
					if (var4 + 256 > this.capacity) { // L: 103
						var4 = this.capacity - 256; // L: 104
						this.field288 = var4 - this.field287; // L: 105
					}
				}

				while (var3 < var4) { // L: 108
					this.fill(this.samples, 256); // L: 109
					this.write(); // L: 110
					var3 += 256; // L: 111
				}

				if (var1 > this.field293) {
					if (!this.field281) {
						if (this.field294 == 0 && this.field282 == 0) {
							this.close();
							this.field289 = 2000L + var1;
							return;
						}

						this.field288 = Math.min(this.field282, this.field294);
						this.field282 = this.field294;
					} else {
						this.field281 = false;
					}

					this.field294 = 0;
					this.field293 = var1 + 2000L;
				}

				this.field292 = var3;
			} catch (Exception var7) {
				this.close();
				this.field289 = 2000L + var1;
			}

			try {
				if (var1 > this.timeMs + 500000L) { // L: 134
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 135
					this.skip(256);
					this.timeMs += (long)(256000 / field300);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2012802257"
	)
	public final void method739() {
		this.field281 = true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1905716699"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field281 = true;

		try {
			this.discard(); // L: 152
		} catch (Exception var2) { // L: 154
			this.close(); // L: 155
			this.field289 = class113.method2624() + 2000L; // L: 156
		}

	} // L: 158

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "26"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (MusicPatchPcmStream.soundSystem != null) { // L: 161
			boolean var1 = true; // L: 162

			for (int var2 = 0; var2 < 2; ++var2) { // L: 163
				if (this == MusicPatchPcmStream.soundSystem.players[var2]) {
					MusicPatchPcmStream.soundSystem.players[var2] = null; // L: 164
				}

				if (MusicPatchPcmStream.soundSystem.players[var2] != null) { // L: 165
					var1 = false;
				}
			}

			if (var1) { // L: 167
				InterfaceParent.soundSystemExecutor.shutdownNow(); // L: 168
				InterfaceParent.soundSystemExecutor = null; // L: 169
				MusicPatchPcmStream.soundSystem = null; // L: 170
			}
		}

		this.close(); // L: 173
		this.samples = null; // L: 174
	} // L: 175

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1357307630"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field295 -= var1; // L: 178
		if (this.field295 < 0) {
			this.field295 = 0; // L: 179
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 180
		}

	} // L: 181

	@ObfuscatedName("ac")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 185
		if (ArchiveDiskAction.PcmPlayer_stereo) { // L: 186
			var3 = var2 << 1;
		}

		class351.clearIntArray(var1, 0, var3); // L: 187
		this.field295 -= var2; // L: 188
		if (this.stream != null && this.field295 <= 0) { // L: 189
			this.field295 += field300 >> 4; // L: 190
			World.PcmStream_disable(this.stream); // L: 191
			this.method700(this.stream, this.stream.vmethod951()); // L: 192
			int var4 = 0; // L: 193
			int var5 = 255; // L: 194

			int var6;
			PcmStream var10;
			label108:
			for (var6 = 7; var5 != 0; --var6) { // L: 195
				int var7;
				int var8;
				if (var6 < 0) { // L: 198
					var7 = var6 & 3; // L: 199
					var8 = -(var6 >> 2); // L: 200
				} else {
					var7 = var6; // L: 203
					var8 = 0; // L: 204
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) { // L: 206 208
					if ((var9 & 1) != 0) { // L: 211
						var5 &= ~(1 << var7); // L: 214
						var10 = null; // L: 215
						PcmStream var11 = this.field296[var7]; // L: 216

						label102:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 217
									break label102;
								}

								AbstractSound var12 = var11.sound; // L: 218
								if (var12 != null && var12.position > var8) { // L: 219
									var5 |= 1 << var7; // L: 220
									var10 = var11; // L: 221
									var11 = var11.after; // L: 222
								} else {
									var11.active = true; // L: 225
									int var13 = var11.vmethod5295(); // L: 226
									var4 += var13; // L: 227
									if (var12 != null) {
										var12.position += var13; // L: 228
									}

									if (var4 >= this.field284) { // L: 229
										break label108;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 230
									if (var14 != null) { // L: 231
										for (int var15 = var11.field348; var14 != null; var14 = var11.nextSubStream()) { // L: 232 233 235
											this.method700(var14, var15 * var14.vmethod951() >> 8); // L: 234
										}
									}

									PcmStream var18 = var11.after; // L: 238
									var11.after = null; // L: 239
									if (var10 == null) { // L: 240
										this.field296[var7] = var18;
									} else {
										var10.after = var18; // L: 241
									}

									if (var18 == null) { // L: 242
										this.field297[var7] = var10;
									}

									var11 = var18; // L: 243
								}
							}
						}
					}

					var7 += 4; // L: 207
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) { // L: 247
				PcmStream var16 = this.field296[var6]; // L: 248
				PcmStream[] var17 = this.field296; // L: 249
				this.field297[var6] = null; // L: 251

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 252 253 256
					var10 = var16.after; // L: 254
					var16.after = null; // L: 255
				}
			}
		}

		if (this.field295 < 0) { // L: 260
			this.field295 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2); // L: 261
		}

		this.timeMs = class113.method2624(); // L: 262
	} // L: 263

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lao;IB)V",
		garbageValue = "52"
	)
	final void method700(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 272
		PcmStream var4 = this.field297[var3]; // L: 273
		if (var4 == null) { // L: 274
			this.field296[var3] = var1;
		} else {
			var4.after = var1; // L: 275
		}

		this.field297[var3] = var1; // L: 276
		var1.field348 = var2; // L: 277
	} // L: 278

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-706080799"
	)
	public static int method744(int var0, int var1) {
		return (var0 << 8) + var1; // L: 13
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1739109574"
	)
	static void method753() {
		Tiles.Tiles_underlays = null; // L: 64
		Tiles.Tiles_overlays = null; // L: 65
		Tiles.Tiles_shapes = null; // L: 66
		RunException.field4812 = null; // L: 67
		VerticalAlignment.field1993 = null; // L: 68
		NPC.field1259 = null; // L: 69
		Interpreter.field839 = null; // L: 70
		class154.Tiles_hue = null; // L: 71
		MusicPatch.Tiles_saturation = null; // L: 72
		WallDecoration.Tiles_lightness = null; // L: 73
		Tiles.Tiles_hueMultiplier = null; // L: 74
		MenuAction.field866 = null; // L: 75
	} // L: 76

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BI)Lbb;",
		garbageValue = "1083812736"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 112
		Buffer var2 = new Buffer(var0); // L: 113
		var2.offset = var2.array.length - 2; // L: 114
		int var3 = var2.readUnsignedShort(); // L: 115
		int var4 = var2.array.length - 2 - var3 - 12; // L: 116
		var2.offset = var4; // L: 117
		int var5 = var2.readInt(); // L: 118
		var1.localIntCount = var2.readUnsignedShort(); // L: 119
		var1.localStringCount = var2.readUnsignedShort(); // L: 120
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 121
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 122
		int var6 = var2.readUnsignedByte(); // L: 123
		int var7;
		int var8;
		if (var6 > 0) { // L: 124
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 125

			for (var7 = 0; var7 < var6; ++var7) { // L: 126
				var8 = var2.readUnsignedShort(); // L: 127
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? FontName.method7228(var8) : 1); // L: 128
				var1.switches[var7] = var9; // L: 129

				while (var8-- > 0) { // L: 130
					int var10 = var2.readInt(); // L: 131
					int var11 = var2.readInt(); // L: 132
					var9.put(new IntegerNode(var11), (long)var10); // L: 133
				}
			}
		}

		var2.offset = 0;
		var1.field949 = var2.readStringCp1252NullTerminatedOrNull(); // L: 138
		var1.opcodes = new int[var5]; // L: 139
		var1.intOperands = new int[var5]; // L: 140
		var1.stringOperands = new String[var5]; // L: 141

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 142 143 148
			var8 = var2.readUnsignedShort(); // L: 144
			if (var8 == 3) { // L: 145
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 146
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 147
			}
		}

		return var1; // L: 150
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "12333"
	)
	static int method693(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) { // L: 1035
			if (var1 <= var0 + 30) { // L: 1036
				return var2; // L: 1037
			}

			var0 += 30; // L: 1039
			var0 += var2 != 1 && var2 != 3 ? 5 : 20; // L: 1040
		}

		return 0; // L: 1042
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1845671157"
	)
	public static void method757() {
		KitDefinition.KitDefinition_cached.clear(); // L: 136
	} // L: 137

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1912643787"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!class82.client.method1128() && !class82.client.method1520()) { // L: 1046
			Login.Login_response1 = ""; // L: 1050
			Login.Login_response2 = "Enter your username/email & password."; // L: 1051
			Login.Login_response3 = ""; // L: 1052
			class126.method2799(2); // L: 1053
			if (var0) { // L: 1054
				Login.Login_password = "";
			}

			if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 1056
				if (class12.clientPreferences.method2241() != null) { // L: 1057
					Login.Login_username = class12.clientPreferences.method2241(); // L: 1058
					Client.Login_isUsernameRemembered = true; // L: 1059
				} else {
					Client.Login_isUsernameRemembered = false; // L: 1061
				}
			}

			if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 1064
				Login.currentLoginField = 1; // L: 1065
			} else {
				Login.currentLoginField = 0; // L: 1068
			}

		} else {
			class126.method2799(10); // L: 1047
		}
	} // L: 1048 1071

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "24"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex; // L: 2842
		if (var0 == -3) { // L: 2845
			class345.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2846
			class345.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2847
			class345.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2848
			class126.method2799(3); // L: 2849
			Login.field907 = 1; // L: 2850
		} else if (var0 == 4) { // L: 2852
			class400.method6957(0); // L: 2853
		} else if (var0 == 5) { // L: 2855
			Login.field907 = 2; // L: 2856
			class345.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes."); // L: 2857
		} else if (var0 == 68 || !Client.onMobile && var0 == 6) { // L: 2859
			class345.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2860
		} else if (var0 == 7) { // L: 2862
			class345.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) { // L: 2863
			class345.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) { // L: 2864
			class345.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) { // L: 2865
			class345.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) { // L: 2866
			class345.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) { // L: 2867
			class345.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) { // L: 2868
			class345.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) { // L: 2869
			class345.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) { // L: 2870
			class345.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
		} else if (var0 == 17) { // L: 2871
			class345.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
		} else if (var0 == 18) { // L: 2872
			class400.method6957(1); // L: 2873
		} else if (var0 == 19) { // L: 2875
			class345.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) { // L: 2876
			class345.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) { // L: 2877
			class345.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) { // L: 2878
			class345.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) { // L: 2879
			class345.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) { // L: 2880
			class345.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) { // L: 2881
			class345.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) { // L: 2882
			class345.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) { // L: 2883
			class345.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) { // L: 2884
			class345.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
		} else if (var0 == 37) { // L: 2885
			class345.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) { // L: 2886
			class345.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) { // L: 2887
			class126.method2799(8); // L: 2888
		} else {
			if (var0 == 56) { // L: 2890
				class345.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2891
				PendingSpawn.updateGameState(11); // L: 2892
				return; // L: 2893
			}

			if (var0 == 57) { // L: 2895
				class345.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2896
				PendingSpawn.updateGameState(11); // L: 2897
				return; // L: 2898
			}

			if (var0 == 61) { // L: 2900
				class345.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2901
				class126.method2799(7); // L: 2902
			} else {
				if (var0 == 62) { // L: 2904
					PendingSpawn.updateGameState(10); // L: 2905
					class126.method2799(9); // L: 2906
					class345.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2907
					return; // L: 2908
				}

				if (var0 == 63) { // L: 2910
					PendingSpawn.updateGameState(10); // L: 2911
					class126.method2799(9); // L: 2912
					class345.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2913
					return; // L: 2914
				}

				if (var0 == 65 || var0 == 67) { // L: 2916
					PendingSpawn.updateGameState(10); // L: 2917
					class126.method2799(9); // L: 2918
					class345.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2919
					return; // L: 2920
				}

				if (var0 == 71) { // L: 2922
					PendingSpawn.updateGameState(10); // L: 2923
					class126.method2799(7); // L: 2924
					class345.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2925
				} else if (var0 == 73) { // L: 2927
					PendingSpawn.updateGameState(10); // L: 2928
					class126.method2799(6); // L: 2929
					class345.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 2930
				} else if (var0 == 72) { // L: 2932
					PendingSpawn.updateGameState(10); // L: 2933
					class126.method2799(26); // L: 2934
				} else {
					class345.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2936
				}
			}
		}

		PendingSpawn.updateGameState(10); // L: 2937
		int var4 = Login.loginIndex; // L: 2941
		boolean var5 = var4 != var1; // L: 2943
		if (!var5 && Client.field517.method7790()) { // L: 2944
			class126.method2799(9); // L: 2945
		}

	} // L: 2947

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(IIIILqr;Lka;I)V",
		garbageValue = "-1306286729"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 12398
			int var6 = Client.camAngleY & 2047; // L: 12399
			int var7 = var3 * var3 + var2 * var2; // L: 12400
			if (var7 <= 6400) { // L: 12401
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 12402
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 12403
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12404
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12405
				if (var7 > 2500) {
					var4.method7947(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 12406
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 12407
				}

			}
		}
	} // L: 12408
}
