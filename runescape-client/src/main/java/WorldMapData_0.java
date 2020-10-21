import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 1706879037
	)
	@Export("baseY")
	static int baseY;

	WorldMapData_0() {
	} // L: 6

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lkb;B)V",
		garbageValue = "-1"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 9
		if (var2 != WorldMapID.field295.value) { // L: 10
			throw new IllegalStateException(""); // L: 11
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 13
			super.planes = var1.readUnsignedByte(); // L: 14
			super.regionXLow = var1.readUnsignedShort(); // L: 15
			super.regionYLow = var1.readUnsignedShort(); // L: 16
			super.regionX = var1.readUnsignedShort(); // L: 17
			super.regionY = var1.readUnsignedShort();
			super.groupId = var1.method5851();
			super.fileId = var1.method5851();
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "-1024222647"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 24
		super.floorUnderlayIds = new short[1][64][64]; // L: 25
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 26
		super.field196 = new byte[super.planes][64][64]; // L: 27
		super.field187 = new byte[super.planes][64][64]; // L: 28
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 29
		int var2 = var1.readUnsignedByte(); // L: 30
		if (var2 != class39.field287.value) { // L: 31
			throw new IllegalStateException(""); // L: 32
		} else {
			int var3 = var1.readUnsignedByte(); // L: 34
			int var4 = var1.readUnsignedByte(); // L: 35
			if (var3 == super.regionX && var4 == super.regionY) { // L: 36
				for (int var5 = 0; var5 < 64; ++var5) { // L: 39
					for (int var6 = 0; var6 < 64; ++var6) { // L: 40
						this.readTile(var5, var6, var1); // L: 41
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 37
			}
		}
	} // L: 44

	public int hashCode() {
		return super.regionX | super.regionY << 8;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) { // L: 47
			return false; // L: 48
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1;
			return var2.regionX == super.regionX && var2.regionY == super.regionY;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkb;Ljava/lang/String;B)I",
		garbageValue = "-23"
	)
	public static int method269(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 18
		byte[] var3 = class8.method113(var1); // L: 19
		var0.writeSmartByteShort(var3.length); // L: 20
		var0.offset += class219.huffman.compress(var3, 0, var3.length, var0.array, var0.offset); // L: 21
		return var0.offset - var2; // L: 22
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1892884103"
	)
	public static int method266(int var0) {
		--var0; // L: 49
		var0 |= var0 >>> 1; // L: 50
		var0 |= var0 >>> 2; // L: 51
		var0 |= var0 >>> 4; // L: 52
		var0 |= var0 >>> 8; // L: 53
		var0 |= var0 >>> 16; // L: 54
		return var0 + 1; // L: 55
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-76"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) { // L: 2870
			GrandExchangeOfferNameComparator.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2871
			GrandExchangeOfferNameComparator.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2872
			GrandExchangeOfferNameComparator.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2873
			Login.loginIndex = 3; // L: 2874
			Login.field1217 = 1; // L: 2875
		} else if (var0 == 4) { // L: 2877
			WorldMapDecoration.method428(0); // L: 2878
		} else if (var0 == 5) { // L: 2880
			Login.field1217 = 2; // L: 2881
			GrandExchangeOfferNameComparator.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes."); // L: 2882
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) { // L: 2884
			if (var0 == 7) { // L: 2887
				GrandExchangeOfferNameComparator.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) { // L: 2888
				GrandExchangeOfferNameComparator.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) { // L: 2889
				GrandExchangeOfferNameComparator.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) { // L: 2890
				GrandExchangeOfferNameComparator.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) { // L: 2891
				GrandExchangeOfferNameComparator.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) { // L: 2892
				GrandExchangeOfferNameComparator.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) { // L: 2893
				GrandExchangeOfferNameComparator.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) { // L: 2894
				GrandExchangeOfferNameComparator.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) { // L: 2895
				GrandExchangeOfferNameComparator.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) { // L: 2896
				GrandExchangeOfferNameComparator.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
			} else if (var0 == 18) { // L: 2897
				WorldMapDecoration.method428(1); // L: 2898
			} else if (var0 == 19) { // L: 2900
				GrandExchangeOfferNameComparator.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) { // L: 2901
				GrandExchangeOfferNameComparator.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) { // L: 2902
				GrandExchangeOfferNameComparator.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) { // L: 2903
				GrandExchangeOfferNameComparator.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) { // L: 2904
				GrandExchangeOfferNameComparator.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) { // L: 2905
				GrandExchangeOfferNameComparator.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) { // L: 2906
				GrandExchangeOfferNameComparator.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) { // L: 2907
				GrandExchangeOfferNameComparator.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) { // L: 2908
				GrandExchangeOfferNameComparator.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) { // L: 2909
				GrandExchangeOfferNameComparator.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
			} else if (var0 == 37) { // L: 2910
				GrandExchangeOfferNameComparator.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) { // L: 2911
				GrandExchangeOfferNameComparator.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) { // L: 2912
				Login.loginIndex = 8; // L: 2913
			} else {
				if (var0 == 56) { // L: 2915
					GrandExchangeOfferNameComparator.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2916
					BuddyRankComparator.updateGameState(11); // L: 2917
					return; // L: 2918
				}

				if (var0 == 57) { // L: 2920
					GrandExchangeOfferNameComparator.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2921
					BuddyRankComparator.updateGameState(11); // L: 2922
					return; // L: 2923
				}

				if (var0 == 61) { // L: 2925
					Login.loginIndex = 7; // L: 2926
				} else {
					GrandExchangeOfferNameComparator.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2928
				}
			}
		} else {
			GrandExchangeOfferNameComparator.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2885
		}

		BuddyRankComparator.updateGameState(10); // L: 2929
	} // L: 2930

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "94"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		WorldMapSection0.scrollBarSprites[0].drawAt(var0, var1); // L: 9972
		WorldMapSection0.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 9973
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field925); // L: 9974
		int var5 = var3 * (var3 - 32) / var4; // L: 9975
		if (var5 < 8) { // L: 9976
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 9977
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field765); // L: 9978
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field747); // L: 9979
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field747); // L: 9980
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field747); // L: 9981
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field747); // L: 9982
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field746); // L: 9983
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field746); // L: 9984
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field746); // L: 9985
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field746); // L: 9986
	} // L: 9987

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)I",
		garbageValue = "1533112407"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32)); // L: 11526
		return var1 != null ? var1.integer : var0.flags; // L: 11527 11528
	}
}
