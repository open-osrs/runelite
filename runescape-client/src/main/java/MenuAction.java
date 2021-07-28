import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bk")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("x")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -566541451
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("t")
	@Export("action")
	String action;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1361985837
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 693495175
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 110049687
	)
	@Export("identifier")
	int identifier;

	MenuAction() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2021329416"
	)
	public static void method1655() {
		KitDefinition.KitDefinition_cached.clear();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "834288948"
	)
	static int method1656(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else if (var0 != 5631 && var0 != 5633) {
			if (var0 == 5632) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 26;
				return 1;
			} else {
				return 2;
			}
		} else {
			class1.Interpreter_stringStackSize -= 2;
			return 1;
		}
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(Lio;III)V",
		garbageValue = "-1350136695"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class310.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.getSpriteMask(true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var7 * var5 + var4 * var8 >> 11;
					int var10 = var5 * var8 - var7 * var4 >> 11;
					int var11 = var9 + MouseHandler.localPlayer.x >> 7;
					int var12 = MouseHandler.localPlayer.y - var10 >> 7;
					PacketBufferNode var13 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2585, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.method6786(var11 + GrandExchangeOfferNameComparator.baseX);
					var13.packetBuffer.writeShort(var12 + NPC.baseY);
					var13.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(MouseHandler.localPlayer.x);
					var13.packetBuffer.writeShort(MouseHandler.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}
}
