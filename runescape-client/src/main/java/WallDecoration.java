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
		signature = "Lel;"
	)
	@Export("entity1")
	public Entity entity1;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lel;"
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
		signature = "(Ljava/lang/String;I)V",
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
		signature = "(Lhd;Ljo;IIZI)V",
		garbageValue = "-771039466"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemDefinition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions;
		byte var6 = -1;
		String var7 = null;
		if (var5 != null && var5[var3] != null) {
			if (var3 == 0) {
				var6 = 33;
			} else if (var3 == 1) {
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35;
			} else if (var3 == 3) {
				var6 = 36;
			} else {
				var6 = 37;
			}

			var7 = var5[var3];
		} else if (var3 == 4) {
			var6 = 37;
			var7 = "Drop";
		}

		if (var6 != -1 && var7 != null) {
			ApproximateRouteStrategy.insertMenuItem(var7, ItemContainer.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4);
		}

	}
}
