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
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; class236.sleepExact(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lcj;Lcj;IZI)I",
		garbageValue = "1286095524"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1831() ? (var1.method1831() ? 0 : 1) : (var1.method1831() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1829() ? (var1.method1829() ? 0 : 1) : (var1.method1829() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id;
		}
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2045975634"
	)
	static void method1264() {
		PacketBufferNode var0 = ItemContainer.getPacketBufferNode(ClientPacket.field2273, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(SoundSystem.getWindowedMode());
		var0.packetBuffer.writeShort(IgnoreList.canvasWidth);
		var0.packetBuffer.writeShort(ModelData0.canvasHeight);
		Client.packetWriter.addNode(var0);
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1589366551"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[GameObject.Client_plane][var0][var1];
		if (var2 == null) {
			ArchiveLoader.scene.removeGroundItemPile(GameObject.Client_plane, var0, var1);
		} else {
			long var3 = -99999999L;
			TileItem var5 = null;

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
				ItemDefinition var7 = SecureRandomCallable.ItemDefinition_get(var6.id);
				long var11 = (long)var7.price;
				if (var7.isStackable == 1) {
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) {
					var3 = var11;
					var5 = var6;
				}
			}

			if (var5 == null) {
				ArchiveLoader.scene.removeGroundItemPile(GameObject.Client_plane, var0, var1);
			} else {
				var2.addLast(var5);
				TileItem var13 = null;
				TileItem var8 = null;

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
					if (var5.id != var6.id) {
						if (var13 == null) {
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) {
							var8 = var6;
						}
					}
				}

				long var9 = NPC.calculateTag(var0, var1, 3, false, 0);
				ArchiveLoader.scene.newGroundItemPile(GameObject.Client_plane, var0, var1, SecureRandomFuture.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, GameObject.Client_plane), var5, var9, var13, var8);
			}
		}
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Lbt;ZI)V",
		garbageValue = "1519561634"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1 && var2 != -1 && class195.Widget_loadedInterfaces[var2]) {
			class58.Widget_archive.clearFilesGroup(var2);
			if (class9.Widget_interfaceComponents[var2] != null) {
				boolean var4 = true;

				for (int var5 = 0; var5 < class9.Widget_interfaceComponents[var2].length; ++var5) {
					if (class9.Widget_interfaceComponents[var2][var5] != null) {
						if (class9.Widget_interfaceComponents[var2][var5].type != 2) {
							class9.Widget_interfaceComponents[var2][var5] = null;
						} else {
							var4 = false;
						}
					}
				}

				if (var4) {
					class9.Widget_interfaceComponents[var2] = null;
				}

				class195.Widget_loadedInterfaces[var2] = false;
			}
		}

		WorldMapRegion.method589(var2);
		Widget var6 = CollisionMap.getWidget(var3);
		if (var6 != null) {
			CollisionMap.invalidateWidget(var6);
		}

		WorldMapData_1.method767();
		if (Client.rootInterface != -1) {
			WorldMapRectangle.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
