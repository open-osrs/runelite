import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class241 {
	@ObfuscatedName("hj")
	@Export("regions")
	static int[] regions;

	@ObfuscatedName("o")
	public static final void method4815(long var0) {
		if (var0 > 0L) { // L: 9
			if (var0 % 10L == 0L) { // L: 10
				long var2 = var0 - 1L; // L: 11

				try {
					Thread.sleep(var2); // L: 14
				} catch (InterruptedException var8) { // L: 16
				}

				try {
					Thread.sleep(1L); // L: 20
				} catch (InterruptedException var7) { // L: 22
				}
			} else {
				try {
					Thread.sleep(var0); // L: 27
				} catch (InterruptedException var6) { // L: 29
				}
			}

		}
	} // L: 31

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-973583928"
	)
	static final void method4813(int var0, int var1) {
		if (var0 < 128) { // L: 3949
			var0 = 128;
		}

		if (var0 > 383) { // L: 3950
			var0 = 383;
		}

		if (GameEngine.cameraPitch < var0) { // L: 3951
			GameEngine.cameraPitch = (var0 - GameEngine.cameraPitch) * PacketBufferNode.field3083 / 1000 + GameEngine.cameraPitch + class17.field88; // L: 3952
			if (GameEngine.cameraPitch > var0) { // L: 3953
				GameEngine.cameraPitch = var0;
			}
		}

		if (GameEngine.cameraPitch > var0) { // L: 3955
			GameEngine.cameraPitch -= (GameEngine.cameraPitch - var0) * PacketBufferNode.field3083 / 1000 + class17.field88; // L: 3956
			if (GameEngine.cameraPitch < var0) { // L: 3957
				GameEngine.cameraPitch = var0;
			}
		}

		int var2 = var1 - StudioGame.cameraYaw; // L: 3959
		if (var2 > 1024) { // L: 3960
			var2 -= 2048;
		}

		if (var2 < -1024) { // L: 3961
			var2 += 2048;
		}

		if (var2 > 0) { // L: 3962
			StudioGame.cameraYaw = StudioGame.cameraYaw + class17.field88 + var2 * PacketBufferNode.field3083 / 1000; // L: 3963
			StudioGame.cameraYaw &= 2047; // L: 3964
		}

		if (var2 < 0) { // L: 3966
			StudioGame.cameraYaw -= class17.field88 + -var2 * PacketBufferNode.field3083 / 1000; // L: 3967
			StudioGame.cameraYaw &= 2047; // L: 3968
		}

		int var3 = var1 - StudioGame.cameraYaw; // L: 3970
		if (var3 > 1024) { // L: 3971
			var3 -= 2048;
		}

		if (var3 < -1024) {
			var3 += 2048; // L: 3972
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 3973
			StudioGame.cameraYaw = var1;
		}

	} // L: 3974

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lck;",
		garbageValue = "52"
	)
	static final InterfaceParent method4812(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 12211
		var3.group = var1; // L: 12212
		var3.type = var2; // L: 12213
		Client.interfaceParents.put(var3, (long)var0); // L: 12214
		GraphicsDefaults.Widget_resetModelFrames(var1); // L: 12215
		Widget var4 = class92.getWidget(var0); // L: 12216
		GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var4); // L: 12217
		if (Client.meslayerContinueWidget != null) { // L: 12218
			GrandExchangeOfferTotalQuantityComparator.invalidateWidget(Client.meslayerContinueWidget); // L: 12219
			Client.meslayerContinueWidget = null; // L: 12220
		}

		UserComparator8.revalidateWidgetScroll(NetSocket.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 12222
		AbstractWorldMapData.runWidgetOnLoadListener(var1); // L: 12223
		if (Client.rootInterface != -1) { // L: 12224
			WorldMapLabelSize.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 12225
	}
}
