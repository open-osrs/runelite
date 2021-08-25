import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	static final WorldMapID field2175;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	static final WorldMapID field2174;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = 921885903
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -213737243
	)
	@Export("value")
	final int value;

	static {
		field2175 = new WorldMapID(0);
		field2174 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "16"
	)
	public static boolean method3811(int var0) {
		return (var0 >> 28 & 1) != 0;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljd;I[B[BI)V",
		garbageValue = "760172468"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3100 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3100 = new byte[11][];
			var0.field3121 = new byte[11][];
			var0.field3135 = new int[11];
			var0.field3123 = new int[11];
		}

		var0.field3100[var1] = var2;
		if (var2 != null) {
			var0.field3119 = true;
		} else {
			var0.field3119 = false;

			for (int var4 = 0; var4 < var0.field3100.length; ++var4) {
				if (var0.field3100[var4] != null) {
					var0.field3119 = true;
					break;
				}
			}
		}

		var0.field3121[var1] = var3;
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "962774189"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			VarbitComposition.clientPreferences.roofsHidden = !VarbitComposition.clientPreferences.roofsHidden;
			DevicePcmPlayerProvider.savePreferences();
			if (VarbitComposition.clientPreferences.roofsHidden) {
				SecureRandomCallable.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				SecureRandomCallable.addGameMessage(99, "", "Roofs will only be removed selectively");
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
				class65.worldMap.showCoord = !class65.worldMap.showCoord;
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
				class245.method4590();
			}
		}

		PacketBufferNode var1 = FriendSystem.getPacketBufferNode(ClientPacket.field2661, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(var0.length() + 1);
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Lci;ZI)V",
		garbageValue = "-359197999"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			class120.method2516(var2);
		}

		for (IntegerNode var4 = (IntegerNode)Client.widgetFlags.first(); var4 != null; var4 = (IntegerNode)Client.widgetFlags.next()) {
			if ((var4.key >> 48 & 65535L) == (long)var2) {
				var4.remove();
			}
		}

		Widget var5 = class87.getWidget(var3);
		if (var5 != null) {
			Actor.invalidateWidget(var5);
		}

		PendingSpawn.method2119();
		if (Client.rootInterface != -1) {
			class13.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
