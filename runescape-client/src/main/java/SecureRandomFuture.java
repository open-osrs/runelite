import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("i")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("w")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown(); // L: 18
		this.executor = null; // L: 19
	} // L: 20

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1642436388"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone(); // L: 23
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/security/SecureRandom;",
		garbageValue = "-11"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get(); // L: 28
		} catch (Exception var4) { // L: 30
			SecureRandom var3 = new SecureRandom(); // L: 33
			var3.nextInt(); // L: 34
			return var3; // L: 37
		}
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1350647812"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) { // L: 3071
			class1.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 3072
			class1.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 3073
			class1.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 3074
			class275.method5201(3); // L: 3075
			Login.field865 = 1; // L: 3076
		} else if (var0 == 4) { // L: 3078
			class275.method5201(14); // L: 3080
			Login.field866 = 0; // L: 3081
		} else if (var0 == 5) { // L: 3084
			Login.field865 = 2; // L: 3085
			class1.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes."); // L: 3086
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) { // L: 3088
			if (var0 == 7) { // L: 3091
				class1.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) { // L: 3092
				class1.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) { // L: 3093
				class1.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) { // L: 3094
				class1.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) { // L: 3095
				class1.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) { // L: 3096
				class1.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) { // L: 3097
				class1.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) { // L: 3098
				class1.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) { // L: 3099
				class1.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) { // L: 3100
				class1.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
			} else if (var0 == 18) { // L: 3101
				class275.method5201(14); // L: 3103
				Login.field866 = 1; // L: 3104
			} else if (var0 == 19) { // L: 3107
				class1.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) { // L: 3108
				class1.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) { // L: 3109
				class1.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) { // L: 3110
				class1.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) { // L: 3111
				class1.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) { // L: 3112
				class1.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) { // L: 3113
				class1.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) { // L: 3114
				class1.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) {
				class1.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game."); // L: 3115
			} else if (var0 == 32) { // L: 3116
				class1.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
			} else if (var0 == 37) { // L: 3117
				class1.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) { // L: 3118
				class1.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) { // L: 3119
				class275.method5201(8); // L: 3120
			} else {
				if (var0 == 56) { // L: 3122
					class1.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 3123
					WorldMapData_1.updateGameState(11); // L: 3124
					return; // L: 3125
				}

				if (var0 == 57) { // L: 3127
					class1.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 3128
					WorldMapData_1.updateGameState(11); // L: 3129
					return; // L: 3130
				}

				if (var0 == 61) { // L: 3132
					class275.method5201(7); // L: 3133
				} else {
					if (var0 == 62) { // L: 3135
						WorldMapData_1.updateGameState(10); // L: 3136
						class275.method5201(9); // L: 3137
						class1.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 3138
						return; // L: 3139
					}

					if (var0 == 63) { // L: 3141
						WorldMapData_1.updateGameState(10); // L: 3142
						class275.method5201(9); // L: 3143
						class1.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 3144
						return; // L: 3145
					}

					if (var0 == 65 || var0 == 67) { // L: 3147
						WorldMapData_1.updateGameState(10); // L: 3148
						class275.method5201(9); // L: 3149
						class1.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 3150
						return; // L: 3151
					}

					class1.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 3153
				}
			}
		} else {
			class1.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 3089
		}

		WorldMapData_1.updateGameState(10); // L: 3154
		if (Client.field500.method7220()) { // L: 3155
			class275.method5201(9); // L: 3156
		}

	} // L: 3158

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "75"
	)
	static final void method1979(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) { // L: 8068
			if (Client.showMouseOverText) { // L: 8069
				int var2 = Client.menuOptionsCount - 1; // L: 8072
				String var4;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) { // L: 8076
					var4 = "Use" + " " + Client.selectedItemName + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) { // L: 8077
					var4 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					var4 = class392.method6873(var2); // L: 8078
				}

				if (Client.menuOptionsCount > 2) { // L: 8079
					var4 = var4 + MouseHandler.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				Login.fontBold12.drawRandomAlphaAndSpacing(var4, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000); // L: 8080
			}
		}
	} // L: 8081
}
