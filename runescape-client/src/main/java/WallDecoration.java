import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1099689565
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1128423733
	)
	@Export("x")
	int x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -242275183
	)
	@Export("y")
	int y;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 255410517
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1472318581
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 96520519
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -752151105
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("entity1")
	public Entity entity1;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("entity2")
	public Entity entity2;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = 7567781693564802897L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1087358253
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "764201281"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			NetSocket.clientPreferences.roofsHidden = !NetSocket.clientPreferences.roofsHidden;
			SpriteMask.savePreferences();
			if (NetSocket.clientPreferences.roofsHidden) {
				ObjectSound.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				ObjectSound.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			Client.displayFps = !Client.displayFps;
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				class228.worldMap.showCoord = !class228.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				Client.displayFps = true;
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				Client.displayFps = false;
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				CollisionMap.method3707();
			}
		}

		PacketBufferNode var1 = UserComparator4.getPacketBufferNode(ClientPacket.field2268, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(var0.length() + 1);
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Lhd;Ljo;IIZI)V",
		garbageValue = "-771039466"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget widget, ItemDefinition itemDef, int slotIdx, int actionIdx, boolean forceLeftClick) {
		String[] itemActions = itemDef.inventoryActions;
		byte opcode = -1;
		String action = null;
		if (itemActions != null && itemActions[actionIdx] != null) {
			if (actionIdx == 0) {
				opcode = 33;
			} else if (actionIdx == 1) {
				opcode = 34;
			} else if (actionIdx == 2) {
				opcode = 35;
			} else if (actionIdx == 3) {
				opcode = 36;
			} else {
				opcode = 37;
			}

			action = itemActions[actionIdx];
		} else if (actionIdx == 4) {
			opcode = 37;
			action = "Drop";
		}

		if (opcode != -1 && action != null) {
			ApproximateRouteStrategy.insertMenuItem(action, ItemContainer.colorStartTag(16748608) + itemDef.name, opcode, itemDef.id, slotIdx, widget.id, forceLeftClick);
		}

	}
}
