import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("f")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1148627417
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1166914345
	)
	public static int field1377;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(CS)B",
		garbageValue = "252"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) { // L: 12
			var1 = (byte)var0;
		} else if (var0 == 8364) { // L: 13
			var1 = -128;
		} else if (var0 == 8218) { // L: 14
			var1 = -126;
		} else if (var0 == 402) { // L: 15
			var1 = -125;
		} else if (var0 == 8222) { // L: 16
			var1 = -124;
		} else if (var0 == 8230) { // L: 17
			var1 = -123;
		} else if (var0 == 8224) { // L: 18
			var1 = -122;
		} else if (var0 == 8225) { // L: 19
			var1 = -121;
		} else if (var0 == 710) { // L: 20
			var1 = -120;
		} else if (var0 == 8240) { // L: 21
			var1 = -119;
		} else if (var0 == 352) { // L: 22
			var1 = -118;
		} else if (var0 == 8249) { // L: 23
			var1 = -117;
		} else if (var0 == 338) { // L: 24
			var1 = -116;
		} else if (var0 == 381) { // L: 25
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111; // L: 26
		} else if (var0 == 8217) { // L: 27
			var1 = -110;
		} else if (var0 == 8220) { // L: 28
			var1 = -109;
		} else if (var0 == 8221) { // L: 29
			var1 = -108;
		} else if (var0 == 8226) { // L: 30
			var1 = -107;
		} else if (var0 == 8211) { // L: 31
			var1 = -106;
		} else if (var0 == 8212) { // L: 32
			var1 = -105;
		} else if (var0 == 732) { // L: 33
			var1 = -104;
		} else if (var0 == 8482) { // L: 34
			var1 = -103;
		} else if (var0 == 353) { // L: 35
			var1 = -102;
		} else if (var0 == 8250) { // L: 36
			var1 = -101;
		} else if (var0 == 339) { // L: 37
			var1 = -100;
		} else if (var0 == 382) { // L: 38
			var1 = -98;
		} else if (var0 == 376) { // L: 39
			var1 = -97;
		} else {
			var1 = 63; // L: 40
		}

		return var1; // L: 41
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) { // L: 2277
			class9.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2278
			class9.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2279
			class9.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2280
			Login.loginIndex = 3; // L: 2281
			Login.field994 = 1; // L: 2282
		} else if (var0 == 4) { // L: 2284
			InterfaceParent.method2096(0); // L: 2285
		} else if (var0 == 5) { // L: 2287
			Login.field994 = 2; // L: 2288
			class9.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes."); // L: 2289
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) { // L: 2291
			if (var0 == 7) { // L: 2294
				class9.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) { // L: 2295
				class9.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) { // L: 2296
				class9.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) { // L: 2297
				class9.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) { // L: 2298
				class9.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) { // L: 2299
				class9.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) { // L: 2300
				class9.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) { // L: 2301
				class9.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) { // L: 2302
				class9.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) { // L: 2303
				class9.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
			} else if (var0 == 18) { // L: 2304
				InterfaceParent.method2096(1); // L: 2305
			} else if (var0 == 19) { // L: 2307
				class9.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) { // L: 2308
				class9.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) { // L: 2309
				class9.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) { // L: 2310
				class9.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) { // L: 2311
				class9.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) { // L: 2312
				class9.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) { // L: 2313
				class9.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) { // L: 2314
				class9.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) { // L: 2315
				class9.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) {
				class9.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system."); // L: 2316
			} else if (var0 == 37) { // L: 2317
				class9.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) { // L: 2318
				class9.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) { // L: 2319
				Login.loginIndex = 8; // L: 2320
			} else {
				if (var0 == 56) { // L: 2322
					class9.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2323
					class20.updateGameState(11); // L: 2324
					return; // L: 2325
				}

				if (var0 == 57) { // L: 2327
					class9.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2328
					class20.updateGameState(11); // L: 2329
					return; // L: 2330
				}

				if (var0 == 61) { // L: 2332
					Login.loginIndex = 7; // L: 2333
				} else {
					class9.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2335
				}
			}
		} else {
			class9.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2292
		}

		class20.updateGameState(10); // L: 2336
	} // L: 2337

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1889624441"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3150
			Login.clientPreferences.roofsHidden = !Login.clientPreferences.roofsHidden; // L: 3151
			Message.savePreferences(); // L: 3152
			if (Login.clientPreferences.roofsHidden) { // L: 3153
				class69.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				class69.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3154
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3156
			Client.displayFps = !Client.displayFps;
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3157
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText; // L: 3158
		}

		if (Client.staffModLevel >= 2) { // L: 3159
			if (var0.equalsIgnoreCase("errortest")) { // L: 3160
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3161
				UserComparator4.worldMap.showCoord = !UserComparator4.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3162
				Client.displayFps = true;
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3163
				Client.displayFps = false;
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc(); // L: 3164
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3165
				HealthBarUpdate.method2181();
			}

			if (var0.equalsIgnoreCase("setclantransmit")) { // L: 3166
				Client.field786 = Client.cycleCntr; // L: 3167
				Client.field800 = Client.cycleCntr; // L: 3168
			}
		}

		PacketBufferNode var1 = ObjectComposition.getPacketBufferNode(ClientPacket.field2256, Client.packetWriter.isaacCipher); // L: 3172
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 3173
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3174
		Client.packetWriter.addNode(var1); // L: 3175
	} // L: 3176

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1512801898"
	)
	static final void method2367(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 11155
		if (var0 != Login.clientPreferences.musicVolume) { // L: 11156
			if (Login.clientPreferences.musicVolume == 0 && Client.currentTrackGroupId != -1) { // L: 11157
				PacketBufferNode.method3898(class8.archive6, Client.currentTrackGroupId, 0, var0, false); // L: 11158
				Client.field842 = false; // L: 11159
			} else if (var0 == 0) { // L: 11161
				class232.method4360(); // L: 11162
				Client.field842 = false; // L: 11163
			} else if (class210.musicPlayerStatus != 0) { // L: 11166
				class375.musicTrackVolume = var0;
			} else {
				class210.midiPcmStream.setPcmStreamVolume(var0); // L: 11167
			}

			Login.clientPreferences.musicVolume = var0; // L: 11169
			Message.savePreferences(); // L: 11170
		}

	} // L: 11172
}
