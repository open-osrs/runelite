import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
public class class233 {
	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lcf;",
		garbageValue = "-852839339"
	)
	static final InterfaceParent method4772(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 11685
		var3.group = var1; // L: 11686
		var3.type = var2; // L: 11687
		Client.interfaceParents.put(var3, (long)var0); // L: 11688
		class336.Widget_resetModelFrames(var1); // L: 11689
		Widget var4 = class130.getWidget(var0); // L: 11690
		class112.invalidateWidget(var4); // L: 11691
		if (Client.meslayerContinueWidget != null) { // L: 11692
			class112.invalidateWidget(Client.meslayerContinueWidget); // L: 11693
			Client.meslayerContinueWidget = null; // L: 11694
		}

		FontName.decrementMenuEntries(); // L: 11696
		PcmPlayer.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 11697
		Occluder.runWidgetOnLoadListener(var1); // L: 11698
		if (Client.rootInterface != -1) { // L: 11699
			DevicePcmPlayerProvider.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 11700
	}
}
