import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1230726091
	)
	@Export("count")
	int count;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -153695861
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -836802201
	)
	@Export("type")
	int type;
	@ObfuscatedName("k")
	@Export("sender")
	String sender;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("a")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("u")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-970454688"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		int var5 = ++Messages.Messages_count - 1;
		this.count = var5;
		this.cycle = Client.cycle;
		this.type = var1;
		this.sender = var2;
		this.fillSenderUsername();
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1723878443"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-669786754"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}

		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1016404175"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = class20.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "317954036"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1887672058"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}

		return this.isFromIgnored0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1904054045"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = class20.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2035701087"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(WorldMapArea.method3513(this.sender), SoundCache.loginType);
		} else {
			this.senderUsername = null;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BB)Ljava/lang/String;",
		garbageValue = "117"
	)
	public static String method1104(byte[] var0) {
		int var2 = var0.length;
		StringBuilder var3 = new StringBuilder();

		for (int var4 = 0; var4 < var2 + 0; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class317.field3857[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class317.field3857[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class317.field3857[(var6 & 15) << 2 | var7 >>> 6]).append(class317.field3857[var7 & 63]);
				} else {
					var3.append(class317.field3857[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class317.field3857[(var5 & 3) << 4]).append("==");
			}
		}

		String var1 = var3.toString();
		return var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1743621885"
	)
	static void method1113(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1640344997"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) {
			PlatformInfo.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			PlatformInfo.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			PlatformInfo.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			method1113(3);
			Login.field883 = 1;
		} else if (var0 == 4) {
			method1113(14);
			Login.field874 = 0;
		} else if (var0 == 5) {
			Login.field883 = 2;
			PlatformInfo.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
		} else if (var0 == 68 || !Client.onMobile && var0 == 6) {
			PlatformInfo.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			PlatformInfo.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			PlatformInfo.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			PlatformInfo.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			PlatformInfo.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			PlatformInfo.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			PlatformInfo.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) {
			PlatformInfo.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			PlatformInfo.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) {
			PlatformInfo.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
		} else if (var0 == 17) {
			PlatformInfo.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
		} else if (var0 == 18) {
			method1113(14);
			Login.field874 = 1;
		} else if (var0 == 19) {
			PlatformInfo.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) {
			PlatformInfo.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			PlatformInfo.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			PlatformInfo.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			PlatformInfo.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			PlatformInfo.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			PlatformInfo.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			PlatformInfo.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			PlatformInfo.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			PlatformInfo.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
		} else if (var0 == 37) {
			PlatformInfo.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			PlatformInfo.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) {
			method1113(8);
		} else {
			if (var0 == 56) {
				PlatformInfo.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				HealthBarUpdate.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				PlatformInfo.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				HealthBarUpdate.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				method1113(7);
			} else {
				if (var0 == 62) {
					HealthBarUpdate.updateGameState(10);
					method1113(9);
					PlatformInfo.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					HealthBarUpdate.updateGameState(10);
					method1113(9);
					PlatformInfo.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					HealthBarUpdate.updateGameState(10);
					method1113(9);
					PlatformInfo.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				PlatformInfo.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
			}
		}

		HealthBarUpdate.updateGameState(10);
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Ljd;I)Ljd;",
		garbageValue = "-984488663"
	)
	static Widget method1099(Widget var0) {
		int var1 = class15.method192(Decimator.getWidgetFlags(var0));
		if (var1 == 0) {
			return null;
		} else {
			for (int var2 = 0; var2 < var1; ++var2) {
				var0 = class87.getWidget(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
