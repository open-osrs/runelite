import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -561970277
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2016613855
	)
	@Export("type")
	int type;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1300188483
	)
	@Export("y")
	int y;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1005104193
	)
	@Export("x")
	int x;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -179134245
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1421473345
	)
	int field929;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1135196695
	)
	int field935;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1885792769
	)
	@Export("id")
	int id;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 281500635
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1520740959
	)
	int field933;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1918474747
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -470194177
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0; // L: 16
		this.hitpoints = -1; // L: 17
	} // L: 19

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "([Lhe;Lhe;ZB)V",
		garbageValue = "0"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth * 23997287 * -1515274153 : var1.width * -1889150965 * -832572509; // L: 9467
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight * -1479373561 * -1602400073 : var1.height * 1772768209 * -1282937551; // L: 9468
		Interpreter.resizeInterface(var0, var1.id, var3, var4, var2); // L: 9469
		if (var1.children != null) { // L: 9470
			Interpreter.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 9471
		if (var5 != null) {
			WorldMapManager.method686(var5.group, var3, var4, var2); // L: 9472
		}

		if (var1.contentType == 1337) { // L: 9473
		}

	} // L: 9474
}
