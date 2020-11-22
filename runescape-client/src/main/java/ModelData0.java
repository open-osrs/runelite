import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	public static class248 field1895;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("archive18")
	static Archive archive18;

	ModelData0() {
	} // L: 4

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lcf;",
		garbageValue = "1326128676"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 237
		return FileSystem.getNextWorldListWorld(); // L: 238
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V",
		garbageValue = "-117"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		KeyHandler.insertMenuItem(var0, var1, var2, var3, var4, var5, false); // L: 8934
	} // L: 8935

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lbs;",
		garbageValue = "1523932767"
	)
	static final InterfaceParent method3381(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 11261
		var3.group = var1; // L: 11262
		var3.type = var2; // L: 11263
		Client.interfaceParents.put(var3, (long)var0); // L: 11264
		FontName.Widget_resetModelFrames(var1); // L: 11265
		Widget var4 = UserComparator4.getWidget(var0); // L: 11266
		GrandExchangeOfferOwnWorldComparator.invalidateWidget(var4); // L: 11267
		if (Client.meslayerContinueWidget != null) { // L: 11268
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(Client.meslayerContinueWidget); // L: 11269
			Client.meslayerContinueWidget = null; // L: 11270
		}

		for (int var5 = 0; var5 < Client.menuOptionsCount; ++var5) { // L: 11273
			if (DynamicObject.method2362(Client.menuOpcodes[var5])) { // L: 11274
				if (var5 < Client.menuOptionsCount - 1) { // L: 11275
					for (int var6 = var5; var6 < Client.menuOptionsCount - 1; ++var6) { // L: 11276
						Client.menuActions[var6] = Client.menuActions[var6 + 1]; // L: 11277
						Client.menuTargets[var6] = Client.menuTargets[var6 + 1]; // L: 11278
						Client.menuOpcodes[var6] = Client.menuOpcodes[var6 + 1]; // L: 11279
						Client.menuIdentifiers[var6] = Client.menuIdentifiers[var6 + 1]; // L: 11280
						Client.menuArguments1[var6] = Client.menuArguments1[var6 + 1]; // L: 11281
						Client.menuArguments2[var6] = Client.menuArguments2[var6 + 1]; // L: 11282
						Client.menuShiftClick[var6] = Client.menuShiftClick[var6 + 1]; // L: 11283
					}
				}

				--var5; // L: 11286
				--Client.menuOptionsCount; // L: 11287
			}
		}

		TileItemPile.method2908(); // L: 11290
		UserComparator9.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 11292
		ScriptFrame.runWidgetOnLoadListener(var1); // L: 11293
		if (Client.rootInterface != -1) { // L: 11294
			WorldMapAreaData.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 11295
	}
}
