import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -849531271
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -959364297
	)
	@Export("MouseHandler_idleCycles")
	static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 494054839
	)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -623033765
	)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1657666543
	)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = 1124876643945758811L
	)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1842444799
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = 3980368663638216117L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1256288259
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -571396901
	)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 563759133
	)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1503595933
	)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		longValue = -1715075205804232797L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1135852135
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1511039305
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1644545991
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = 326534539443949415L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("compass")
	static SpritePixels compass;

	static {
		MouseHandler_instance = new MouseHandler();
		MouseHandler_idleCycles = 0;
		MouseHandler_currentButtonVolatile = 0;
		MouseHandler_xVolatile = -1;
		MouseHandler_yVolatile = -1;
		MouseHandler_lastMovedVolatile = -1L;
		MouseHandler_currentButton = 0;
		MouseHandler_x = 0;
		MouseHandler_y = 0;
		MouseHandler_millis = 0L;
		MouseHandler_lastButtonVolatile = 0;
		MouseHandler_lastPressedXVolatile = 0;
		MouseHandler_lastPressedYVolatile = 0;
		MouseHandler_lastPressedTimeMillisVolatile = 0L;
		MouseHandler_lastButton = 0;
		MouseHandler_lastPressedX = 0;
		MouseHandler_lastPressedY = 0;
		MouseHandler_lastPressedTimeMillis = 0L;
	}

	MouseHandler() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;B)I",
		garbageValue = "44"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton();
		if (!var1.isAltDown() && var2 != 2) {
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = var1.getX();
			MouseHandler_yVolatile = var1.getY();
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = Occluder.method4335();
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = -1;
			MouseHandler_yVolatile = -1;
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_currentButtonVolatile = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1959208295"
	)
	static void method609() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.obj != null) {
				var0.set();
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[II)V",
		garbageValue = "1719094176"
	)
	public static void method580(String[] var0, int[] var1) {
		GrandExchangeOfferUnitPriceComparator.method5348(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "231950614"
	)
	static void method607() {
		Client.mouseLastLastPressedTimeMillis = -1L;
		class184.mouseRecorder.index = 0;
		Archive.hasFocus = true;
		Client.hadFocus = true;
		Client.field716 = -1L;
		HorizontalAlignment.method2949();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1288 = null;
		Client.packetWriter.field1289 = null;
		Client.packetWriter.field1290 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1279 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		MenuAction.method1875(0);
		ItemContainer.method2029();
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		Client.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		class16.field82 = null;
		Client.minimapState = 0;
		Client.field719 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.npcCount = 0;
		Players.Players_count = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Players.field1246[var0] = null;
			Players.field1245[var0] = 1;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 32768; ++var0) {
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1;
		Client.projectiles.clear();
		Client.graphicsObjects.clear();

		for (var0 = 0; var0 < 4; ++var0) {
			for (int var4 = 0; var4 < 104; ++var4) {
				for (int var2 = 0; var2 < 104; ++var2) {
					Client.groundItems[var0][var4][var2] = null;
				}
			}
		}

		Client.pendingSpawns = new NodeDeque();
		class20.friendSystem.clear();

		for (var0 = 0; var0 < VarpDefinition.VarpDefinition_fileCount; ++var0) {
			VarpDefinition var1 = UserComparator7.VarpDefinition_get(var0);
			if (var1 != null) {
				Varps.Varps_temp[var0] = 0;
				Varps.Varps_main[var0] = 0;
			}
		}

		GrandExchangeEvent.varcs.clearTransient();
		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			class120.method2516(Client.rootInterface);
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) {
			WorldMapID.closeInterface(var3, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.playerMenuActions[var0] = null;
			Client.playerOptionsPriorities[var0] = false;
		}

		CollisionMap.method3351();
		Client.isLoading = true;

		for (var0 = 0; var0 < 100; ++var0) {
			Client.field697[var0] = true;
		}

		class280.method5087();
		class78.friendsChat = null;
		AttackOption.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, (Object)null);
		WorldMapSectionType.guestClanChannel = null;
		Arrays.fill(Client.currentClanChannels, (Object)null);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		class117.grandExchangeEvents = null;
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;B)V",
		garbageValue = "-31"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = ParamComposition.getWidgetChild(var1, var2);
		if (var5 != null) {
			if (var5.onOp != null) {
				ScriptEvent var6 = new ScriptEvent();
				var6.widget = var5;
				var6.opIndex = var0;
				var6.targetName = var4;
				var6.args = var5.onOp;
				class139.runScriptEvent(var6);
			}

			boolean var8 = true;
			if (var5.contentType > 0) {
				var8 = class119.method2508(var5);
			}

			if (var8) {
				if (Decimator.method1050(Decimator.getWidgetFlags(var5), var0 - 1)) {
					PacketBufferNode var7;
					if (var0 == 1) {
						var7 = FriendSystem.getPacketBufferNode(ClientPacket.field2679, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 2) {
						var7 = FriendSystem.getPacketBufferNode(ClientPacket.field2735, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 3) {
						var7 = FriendSystem.getPacketBufferNode(ClientPacket.field2736, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 4) {
						var7 = FriendSystem.getPacketBufferNode(ClientPacket.field2650, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 5) {
						var7 = FriendSystem.getPacketBufferNode(ClientPacket.field2738, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 6) {
						var7 = FriendSystem.getPacketBufferNode(ClientPacket.field2668, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 7) {
						var7 = FriendSystem.getPacketBufferNode(ClientPacket.field2691, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 8) {
						var7 = FriendSystem.getPacketBufferNode(ClientPacket.field2733, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 9) {
						var7 = FriendSystem.getPacketBufferNode(ClientPacket.field2644, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 10) {
						var7 = FriendSystem.getPacketBufferNode(ClientPacket.field2671, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

				}
			}
		}
	}
}
