import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = 2065438809
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive")
	public Archive archive;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -257937565
	)
	@Export("crc")
	public int crc;
	@ObfuscatedName("x")
	@Export("padding")
	public byte padding;

	NetFileRequest() {
	} // L: 10

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lbt;",
		garbageValue = "102160869"
	)
	static final InterfaceParent method4189(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 10798
		var3.group = var1; // L: 10799
		var3.type = var2; // L: 10800
		Client.interfaceParents.put(var3, (long)var0); // L: 10801
		class304.Widget_resetModelFrames(var1); // L: 10802
		Widget var4 = CollisionMap.getWidget(var0); // L: 10803
		CollisionMap.invalidateWidget(var4); // L: 10804
		if (Client.meslayerContinueWidget != null) { // L: 10805
			CollisionMap.invalidateWidget(Client.meslayerContinueWidget); // L: 10806
			Client.meslayerContinueWidget = null; // L: 10807
		}

		WorldMapData_1.method767(); // L: 10809
		PendingSpawn.revalidateWidgetScroll(class9.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 10810
		VarpDefinition.runWidgetOnLoadListener(var1); // L: 10811
		if (Client.rootInterface != -1) { // L: 10812
			WorldMapRectangle.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 10813
	}
}
