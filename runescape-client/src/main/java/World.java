import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("World")
public class World {
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = -1010823159
	)
	static int field774;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -48833233
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2050249947
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("a")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("e")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -86238293
	)
	@Export("id")
	int id;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1958786797
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -538729111
	)
	@Export("population")
	int population;
	@ObfuscatedName("v")
	@Export("host")
	String host;
	@ObfuscatedName("s")
	@Export("activity")
	String activity;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 669690355
	)
	@Export("location")
	int location;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 388841903
	)
	@Export("index")
	int index;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1340119949"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	boolean method1592() {
		return (2 & this.properties) != 0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-42"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1652055615"
	)
	boolean method1594() {
		return (8 & this.properties) != 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "102"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2054012301"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2055128830"
	)
	boolean method1639() {
		return (1073741824 & this.properties) != 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lnj;",
		garbageValue = "126"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (UserComparator10.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (UserComparator10.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(class272.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lbc;B)V",
		garbageValue = "1"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			boolean var1 = var0.isMembersOnly();
			if (var1 != ItemComposition.ItemDefinition_inMembersWorld) {
				WorldMapLabelSize.method3446();
				ItemComposition.ItemDefinition_inMembersWorld = var1;
			}
		}

		if (var0.properties != Client.worldProperties) {
			Archive var3 = class176.archive8;
			int var2 = var0.properties;
			if ((var2 & 536870912) != 0) {
				ClanChannelMember.logoSprite = class131.SpriteBuffer_getIndexedSpriteByName(var3, "logo_deadman_mode", "");
			} else if ((var2 & 1073741824) != 0) {
				ClanChannelMember.logoSprite = class131.SpriteBuffer_getIndexedSpriteByName(var3, "logo_seasonal_mode", "");
			} else {
				ClanChannelMember.logoSprite = class131.SpriteBuffer_getIndexedSpriteByName(var3, "logo", "");
			}
		}

		EnumComposition.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		WorldMapLabelSize.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		UserList.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		RouteStrategy.currentPort = WorldMapLabelSize.worldPort;
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2015327255"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) {
			class17.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			class17.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			class17.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			class112.method2474(3);
			Login.field869 = 1;
		} else if (var0 == 4) {
			class112.method2474(14);
			Login.field884 = 0;
		} else if (var0 == 5) {
			Login.field869 = 2;
			class17.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) {
			if (var0 == 7) {
				class17.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) {
				class17.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) {
				class17.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) {
				class17.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) {
				class17.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) {
				class17.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) {
				class17.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) {
				class17.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) {
				class17.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) {
				class17.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
			} else if (var0 == 18) {
				class112.method2474(14);
				Login.field884 = 1;
			} else if (var0 == 19) {
				class17.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) {
				class17.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) {
				class17.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) {
				class17.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) {
				class17.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) {
				class17.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) {
				class17.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) {
				class17.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) {
				class17.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) {
				class17.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
			} else if (var0 == 37) {
				class17.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) {
				class17.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) {
				class112.method2474(8);
			} else {
				if (var0 == 56) {
					class17.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
					UserList.updateGameState(11);
					return;
				}

				if (var0 == 57) {
					class17.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
					UserList.updateGameState(11);
					return;
				}

				if (var0 == 61) {
					class112.method2474(7);
				} else {
					if (var0 == 62) {
						UserList.updateGameState(10);
						class112.method2474(9);
						class17.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
						return;
					}

					if (var0 == 63) {
						UserList.updateGameState(10);
						class112.method2474(9);
						class17.setLoginResponseString("You were signed out.", "Please sign in again.", "");
						return;
					}

					if (var0 == 65 || var0 == 67) {
						UserList.updateGameState(10);
						class112.method2474(9);
						class17.setLoginResponseString("Failed to login.", "Please try again.", "");
						return;
					}

					class17.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		} else {
			class17.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		}

		UserList.updateGameState(10);
	}
}
