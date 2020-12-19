import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("gv")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("h")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("v")
	@Export("lock")
	Object lock;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1074522321
	)
	@Export("index")
	int index;
	@ObfuscatedName("w")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("t")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("j")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0; // L: 9
		this.xs = new int[500]; // L: 10
		this.ys = new int[500]; // L: 11
		this.millis = new long[500]; // L: 12
	} // L: 14

	public void run() {
		for (; this.isRunning; class236.sleepExact(50L)) { // L: 17 26
			synchronized(this.lock) { // L: 18
				if (this.index < 500) { // L: 19
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 20
					this.ys[this.index] = MouseHandler.MouseHandler_y; // L: 21
					this.millis[this.index] = MouseHandler.MouseHandler_millis; // L: 22
					++this.index; // L: 23
				}
			}
		}

	} // L: 28

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lcj;Lcj;IZI)I",
		garbageValue = "1286095524"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 221
			int var4 = var0.population; // L: 222
			int var5 = var1.population; // L: 223
			if (!var3) { // L: 224
				if (var4 == -1) { // L: 225
					var4 = 2001;
				}

				if (var5 == -1) { // L: 226
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 228
		} else if (var2 == 2) { // L: 230
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 231
			if (var0.activity.equals("-")) { // L: 232
				if (var1.activity.equals("-")) { // L: 233
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 234
				}
			} else if (var1.activity.equals("-")) { // L: 236
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 237
			}
		} else if (var2 == 4) { // L: 239
			return var0.method1831() ? (var1.method1831() ? 0 : 1) : (var1.method1831() ? -1 : 0);
		} else if (var2 == 5) { // L: 240
			return var0.method1829() ? (var1.method1829() ? 0 : 1) : (var1.method1829() ? -1 : 0);
		} else if (var2 == 6) { // L: 241
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 242
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 243
		}
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2045975634"
	)
	static void method1264() {
		PacketBufferNode var0 = ItemContainer.getPacketBufferNode(ClientPacket.field2273, Client.packetWriter.isaacCipher); // L: 4192
		var0.packetBuffer.writeByte(SoundSystem.getWindowedMode()); // L: 4193
		var0.packetBuffer.writeShort(IgnoreList.canvasWidth); // L: 4194
		var0.packetBuffer.writeShort(ModelData0.canvasHeight); // L: 4195
		Client.packetWriter.addNode(var0); // L: 4196
	} // L: 4197

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1589366551"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[GameObject.Client_plane][var0][var1]; // L: 7029
		if (var2 == null) { // L: 7030
			ArchiveLoader.scene.removeGroundItemPile(GameObject.Client_plane, var0, var1); // L: 7031
		} else {
			long var3 = -99999999L; // L: 7034
			TileItem var5 = null; // L: 7035

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7036 7037 7045
				ItemDefinition var7 = SecureRandomCallable.ItemDefinition_get(var6.id); // L: 7038
				long var11 = (long)var7.price; // L: 7039
				if (var7.isStackable == 1) { // L: 7040
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) { // L: 7041
					var3 = var11; // L: 7042
					var5 = var6; // L: 7043
				}
			}

			if (var5 == null) { // L: 7047
				ArchiveLoader.scene.removeGroundItemPile(GameObject.Client_plane, var0, var1); // L: 7048
			} else {
				var2.addLast(var5); // L: 7051
				TileItem var13 = null; // L: 7052
				TileItem var8 = null; // L: 7053

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7054 7055 7060
					if (var5.id != var6.id) { // L: 7056
						if (var13 == null) { // L: 7057
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) { // L: 7058
							var8 = var6;
						}
					}
				}

				long var9 = NPC.calculateTag(var0, var1, 3, false, 0); // L: 7062
				ArchiveLoader.scene.newGroundItemPile(GameObject.Client_plane, var0, var1, SecureRandomFuture.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, GameObject.Client_plane), var5, var9, var13, var8); // L: 7063
			}
		}
	} // L: 7032 7049 7064

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Lbt;ZI)V",
		garbageValue = "1519561634"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 10817
		int var3 = (int)var0.key; // L: 10818
		var0.remove(); // L: 10819
		if (var1 && var2 != -1 && class195.Widget_loadedInterfaces[var2]) { // L: 10820 10821 10822
			class58.Widget_archive.clearFilesGroup(var2); // L: 10823
			if (class9.Widget_interfaceComponents[var2] != null) { // L: 10824
				boolean var4 = true; // L: 10825

				for (int var5 = 0; var5 < class9.Widget_interfaceComponents[var2].length; ++var5) { // L: 10826
					if (class9.Widget_interfaceComponents[var2][var5] != null) { // L: 10827
						if (class9.Widget_interfaceComponents[var2][var5].type != 2) { // L: 10828
							class9.Widget_interfaceComponents[var2][var5] = null;
						} else {
							var4 = false; // L: 10829
						}
					}
				}

				if (var4) { // L: 10832
					class9.Widget_interfaceComponents[var2] = null;
				}

				class195.Widget_loadedInterfaces[var2] = false; // L: 10833
			}
		}

		WorldMapRegion.method589(var2); // L: 10835
		Widget var6 = CollisionMap.getWidget(var3); // L: 10836
		if (var6 != null) {
			CollisionMap.invalidateWidget(var6); // L: 10837
		}

		WorldMapData_1.method767(); // L: 10838
		if (Client.rootInterface != -1) { // L: 10839
			WorldMapRectangle.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 10840
}
