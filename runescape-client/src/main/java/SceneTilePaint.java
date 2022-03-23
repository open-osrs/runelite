import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -187868113
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1925508175
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 221101905
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 794090973
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1756727001
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("n")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 587137313
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true; // L: 9
		this.swColor = var1; // L: 13
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6; // L: 18
		this.isFlat = var7; // L: 19
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-691234429"
	)
	static int method4500(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "79"
	)
	static void method4499() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11250
			int var1 = var0.group; // L: 11251
			if (MusicPatchNode2.loadInterface(var1)) { // L: 11252
				boolean var2 = true; // L: 11253
				Widget[] var3 = EnumComposition.Widget_interfaceComponents[var1]; // L: 11254

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 11255
					if (var3[var4] != null) { // L: 11256
						var2 = var3[var4].isIf3; // L: 11257
						break;
					}
				}

				if (!var2) { // L: 11261
					var4 = (int)var0.key; // L: 11262
					Widget var5 = HorizontalAlignment.getWidget(var4); // L: 11263
					if (var5 != null) { // L: 11264
						class290.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 11268
}
