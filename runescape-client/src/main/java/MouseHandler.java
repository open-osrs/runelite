import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = -7947308061041944289L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1851121549
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -574089045
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1657948993
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 299061503
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = 7392479486141447999L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 97210001
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -678881683
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1903378733
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1156070407
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -221251943
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -2106187795
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = 3127797728599755635L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -265253353
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1003938789
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 339791065
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = -6895120112634760665L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("hr")
	@ObfuscatedGetter(
		intValue = 1681670171
	)
	@Export("cameraX")
	static int cameraX;

	static {
		MouseHandler_instance = new MouseHandler(); // L: 15
		MouseHandler_idleCycles = 0; // L: 16
		MouseHandler_currentButtonVolatile = 0; // L: 17
		MouseHandler_xVolatile = -1; // L: 18
		MouseHandler_yVolatile = -1; // L: 19
		MouseHandler_lastMovedVolatile = -1L; // L: 20
		MouseHandler_currentButton = 0; // L: 21
		MouseHandler_x = 0; // L: 22
		MouseHandler_y = 0; // L: 23
		MouseHandler_millis = 0L; // L: 24
		MouseHandler_lastButtonVolatile = 0; // L: 25
		MouseHandler_lastPressedXVolatile = 0; // L: 26
		MouseHandler_lastPressedYVolatile = 0; // L: 27
		MouseHandler_lastPressedTimeMillisVolatile = 0L; // L: 28
		MouseHandler_lastButton = 0; // L: 29
		MouseHandler_lastPressedX = 0; // L: 30
		MouseHandler_lastPressedY = 0; // L: 31
		MouseHandler_lastPressedTimeMillis = 0L; // L: 32
	}

	MouseHandler() {
	} // L: 34

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "1689031104"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 55
		if (!var1.isAltDown() && var2 != 2) { // L: 56
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 57 58
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 103
			MouseHandler_idleCycles = 0; // L: 104
			MouseHandler_xVolatile = var1.getX(); // L: 105
			MouseHandler_yVolatile = var1.getY(); // L: 106
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 107
		}

	} // L: 109

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 62
			MouseHandler_idleCycles = 0; // L: 63
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 64
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 65
			MouseHandler_lastPressedTimeMillisVolatile = ObjectComposition.currentTimeMillis(); // L: 66
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 67
			if (MouseHandler_lastButtonVolatile != 0) { // L: 68
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 70
			var1.consume();
		}

	} // L: 71

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 74
			MouseHandler_idleCycles = 0; // L: 75
			MouseHandler_currentButtonVolatile = 0; // L: 76
		}

		if (var1.isPopupTrigger()) { // L: 78
			var1.consume();
		}

	} // L: 79

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 90
			MouseHandler_idleCycles = 0; // L: 91
			MouseHandler_xVolatile = -1; // L: 92
			MouseHandler_yVolatile = -1; // L: 93
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 94
		}

	} // L: 96

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 99
	} // L: 100

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 86
	} // L: 87

	public final void focusGained(FocusEvent var1) {
	} // L: 111

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 114
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 115

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 82
			var1.consume();
		}

	} // L: 83

	@ObfuscatedName("v")
	static double method620(double var0) {
		return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 9
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljv;IS)Lop;",
		garbageValue = "234"
	)
	public static IndexedSprite method647(AbstractArchive var0, int var1) {
		if (!Decimator.method1075(var0, var1)) { // L: 127
			return null;
		} else {
			IndexedSprite var3 = new IndexedSprite(); // L: 130
			var3.width = class396.SpriteBuffer_spriteWidth; // L: 131
			var3.height = UserComparator2.SpriteBuffer_spriteHeight; // L: 132
			var3.xOffset = WorldMapDecoration.SpriteBuffer_xOffsets[0]; // L: 133
			var3.yOffset = Calendar.SpriteBuffer_yOffsets[0]; // L: 134
			var3.subWidth = class396.SpriteBuffer_spriteWidths[0]; // L: 135
			var3.subHeight = class302.SpriteBuffer_spriteHeights[0]; // L: 136
			var3.palette = MilliClock.SpriteBuffer_spritePalette; // L: 137
			var3.pixels = class396.SpriteBuffer_pixels[0]; // L: 138
			MilliClock.method2587(); // L: 139
			return var3; // L: 142
		}
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1345954057"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == -3) { // L: 2542
			class260.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2543
			class260.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2544
			class260.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2545
			Login.loginIndex = 3; // L: 2546
			Login.field1039 = 1; // L: 2547
		} else if (var0 == 4) { // L: 2549
			GameEngine.method572(0); // L: 2550
		} else if (var0 == 5) { // L: 2552
			Login.field1039 = 2; // L: 2553
			class260.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes."); // L: 2554
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) { // L: 2556
			if (var0 == 7) { // L: 2559
				class260.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) { // L: 2560
				class260.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) { // L: 2561
				class260.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) { // L: 2562
				class260.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) { // L: 2563
				class260.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) { // L: 2564
				class260.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) { // L: 2565
				class260.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) { // L: 2566
				class260.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) { // L: 2567
				class260.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) { // L: 2568
				class260.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
			} else if (var0 == 18) { // L: 2569
				GameEngine.method572(1); // L: 2570
			} else if (var0 == 19) { // L: 2572
				class260.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) { // L: 2573
				class260.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) { // L: 2574
				class260.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) { // L: 2575
				class260.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) { // L: 2576
				class260.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) { // L: 2577
				class260.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) {
				class260.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", ""); // L: 2578
			} else if (var0 == 27) { // L: 2579
				class260.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) { // L: 2580
				class260.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) { // L: 2581
				class260.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
			} else if (var0 == 37) { // L: 2582
				class260.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) { // L: 2583
				class260.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) { // L: 2584
				Login.loginIndex = 8; // L: 2585
			} else {
				if (var0 == 56) { // L: 2587
					class260.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2588
					class12.updateGameState(11); // L: 2589
					return; // L: 2590
				}

				if (var0 == 57) { // L: 2592
					class260.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2593
					class12.updateGameState(11); // L: 2594
					return; // L: 2595
				}

				if (var0 == 61) { // L: 2597
					Login.loginIndex = 7; // L: 2598
				} else {
					class260.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2600
				}
			}
		} else {
			class260.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2557
		}

		class12.updateGameState(10); // L: 2601
	} // L: 2602

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "86"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class21.getPacketBufferNode(ClientPacket.field2574, Client.packetWriter.isaacCipher); // L: 11308
		var0.packetBuffer.writeByte(0); // L: 11309
		Client.packetWriter.addNode(var0); // L: 11310
	} // L: 11311

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-508707417"
	)
	static void method634() {
		Client.packetWriter.addNode(class21.getPacketBufferNode(ClientPacket.field2608, Client.packetWriter.isaacCipher)); // L: 11499
		Client.oculusOrbState = 0; // L: 11500
	} // L: 11501
}
