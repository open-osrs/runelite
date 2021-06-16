import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("u")
	@Export("cacheSubPaths")
	public static String[] cacheSubPaths;
	@ObfuscatedName("n")
	@Export("userHomeDirectory")
	public static String userHomeDirectory;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive10")
	static Archive archive10;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1038546340"
	)
	static final void method2637(int var0, int var1, int var2, boolean var3) {
		if (class20.loadInterface(var0)) { // L: 9946
			DynamicObject.resizeInterface(GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0], -1, var1, var2, var3); // L: 9947
		}
	} // L: 9948

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "([Liv;II)V",
		garbageValue = "1856599832"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 10869
			Widget var3 = var0[var2]; // L: 10870
			if (var3 != null) { // L: 10871
				if (var3.type == 0) { // L: 10872
					if (var3.children != null) { // L: 10873
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 10874
					if (var4 != null) { // L: 10875
						class8.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 10877
					var5 = new ScriptEvent(); // L: 10878
					var5.widget = var3; // L: 10879
					var5.args = var3.onDialogAbort; // L: 10880
					WorldMapSection1.runScriptEvent(var5); // L: 10881
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 10883
					if (var3.childIndex >= 0) { // L: 10884
						Widget var6 = WorldMapData_1.getWidget(var3.id); // L: 10885
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 10886
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 10890
					var5.widget = var3; // L: 10891
					var5.args = var3.onSubChange; // L: 10892
					WorldMapSection1.runScriptEvent(var5); // L: 10893
				}
			}
		}

	} // L: 10896
}
