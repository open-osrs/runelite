import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("w")
	public static short[][] field253;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("k")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096]; // L: 11
	} // L: 12

	WorldMapSprite(int[] var1) {
		this.tileColors = var1; // L: 15
	} // L: 16

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1945716520"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1]; // L: 24
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1682041122"
	)
	public static final boolean method496(char var0) {
		if (Character.isISOControl(var0)) { // L: 28
			return false;
		} else if (class204.isAlphaNumeric(var0)) { // L: 29
			return true;
		} else {
			char[] var1 = class348.field4067; // L: 31

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) { // L: 32
				var3 = var1[var2]; // L: 33
				if (var0 == var3) { // L: 34
					return true;
				}
			}

			var1 = class348.field4065; // L: 38

			for (var2 = 0; var2 < var1.length; ++var2) { // L: 39
				var3 = var1[var2]; // L: 40
				if (var0 == var3) {
					return true; // L: 41
				}
			}

			return false; // L: 44
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "20454"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (Bounds.Widget_loadedInterfaces[var0]) { // L: 203
			return true;
		} else if (!Widget.Widget_archive.tryLoadGroup(var0)) { // L: 204
			return false;
		} else {
			int var1 = Widget.Widget_archive.getGroupFileCount(var0); // L: 205
			if (var1 == 0) { // L: 206
				Bounds.Widget_loadedInterfaces[var0] = true; // L: 207
				return true; // L: 208
			} else {
				if (Widget.Widget_interfaceComponents[var0] == null) { // L: 210
					Widget.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 211
					if (Widget.Widget_interfaceComponents[var0][var2] == null) { // L: 212
						byte[] var3 = Widget.Widget_archive.takeFile(var0, var2); // L: 213
						if (var3 != null) { // L: 214
							Widget.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 215
							Widget.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 216
							if (var3[0] == -1) { // L: 217
								Widget.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								Widget.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 218
							}
						}
					}
				}

				Bounds.Widget_loadedInterfaces[var0] = true; // L: 222
				return true; // L: 223
			}
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2072659501"
	)
	static void method493(int var0, int var1) {
		int var2 = class4.fontBold12.stringWidth("Choose Option"); // L: 7209

		int var3;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) { // L: 7210
			Font var7 = class4.fontBold12; // L: 7211
			String var8;
			if (var3 < 0) { // L: 7214
				var8 = ""; // L: 7215
			} else if (Client.menuTargets[var3].length() > 0) { // L: 7218
				var8 = Client.menuActions[var3] + " " + Client.menuTargets[var3];
			} else {
				var8 = Client.menuActions[var3]; // L: 7219
			}

			int var6 = var7.stringWidth(var8); // L: 7221
			if (var6 > var2) { // L: 7222
				var2 = var6;
			}
		}

		var2 += 8; // L: 7224
		var3 = Client.menuOptionsCount * 15 + 22; // L: 7225
		int var4 = var0 - var2 / 2; // L: 7226
		if (var2 + var4 > FloorDecoration.canvasWidth) { // L: 7227
			var4 = FloorDecoration.canvasWidth - var2;
		}

		if (var4 < 0) { // L: 7228
			var4 = 0;
		}

		int var5 = var1; // L: 7229
		if (var3 + var1 > GameShell.canvasHeight) { // L: 7230
			var5 = GameShell.canvasHeight - var3;
		}

		if (var5 < 0) { // L: 7231
			var5 = 0;
		}

		ChatChannel.menuX = var4; // L: 7232
		Client.menuY = var5; // L: 7233
		DevicePcmPlayerProvider.menuWidth = var2; // L: 7234
		WorldMapManager.menuHeight = Client.menuOptionsCount * 15 + 22; // L: 7235
	} // L: 7236

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lbq;",
		garbageValue = "-81"
	)
	static final InterfaceParent method494(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 10486
		var3.group = var1; // L: 10487
		var3.type = var2; // L: 10488
		Client.interfaceParents.put(var3, (long)var0); // L: 10489
		PacketWriter.Widget_resetModelFrames(var1); // L: 10490
		Widget var4 = TileItem.getWidget(var0); // L: 10491
		class52.invalidateWidget(var4); // L: 10492
		if (Client.meslayerContinueWidget != null) { // L: 10493
			class52.invalidateWidget(Client.meslayerContinueWidget); // L: 10494
			Client.meslayerContinueWidget = null; // L: 10495
		}

		class2.method24(); // L: 10497
		class4.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 10498
		class235.runWidgetOnLoadListener(var1); // L: 10499
		if (Client.rootInterface != -1) { // L: 10500
			ClientPacket.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 10501
	}
}
