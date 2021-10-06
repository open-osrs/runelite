import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public final class class4 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static IndexedSprite field8;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 586577523
	)
	public static int field13;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("compass")
	static SpritePixels compass;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "125"
	)
	public static void method19(int var0) {
		if (class247.musicPlayerStatus != 0) {
			class247.musicTrackVolume = var0;
		} else {
			class247.midiPcmStream.setPcmStreamVolume(var0);
		}

	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lct;",
		garbageValue = "-2020922955"
	)
	static final InterfaceParent method23(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		class17.Widget_resetModelFrames(var1);
		Widget var4 = HealthBarUpdate.getWidget(var0);
		class16.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			class16.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		class132.method2699();
		TaskHandler.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var0 >> 16], var4, false);
		WorldMapScaleHandler.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			ItemContainer.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
