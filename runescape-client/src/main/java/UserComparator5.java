import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lmd;Lmd;I)I",
		garbageValue = "71966662"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) { // L: 14
			if (var2.world == 0) { // L: 15
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1; // L: 18
		}

		return this.compareUser(var1, var2); // L: 20
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 24
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method2475() {
		Tiles.Tiles_minPlane = 99; // L: 48
		Tiles.Tiles_underlays = new byte[4][104][104]; // L: 49
		Tiles.Tiles_overlays = new byte[4][104][104]; // L: 50
		Tiles.Tiles_shapes = new byte[4][104][104]; // L: 51
		Tiles.field998 = new byte[4][104][104]; // L: 52
		class78.field1033 = new int[4][105][105]; // L: 53
		class260.field3078 = new byte[4][105][105]; // L: 54
		class19.field106 = new int[105][105]; // L: 55
		class7.Tiles_hue = new int[104]; // L: 56
		RouteStrategy.Tiles_saturation = new int[104]; // L: 57
		AbstractByteArrayCopier.Tiles_lightness = new int[104]; // L: 58
		class1.Tiles_hueMultiplier = new int[104]; // L: 59
		VarcInt.field1789 = new int[104]; // L: 60
	} // L: 61

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "2012601559"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class13.loadInterface(var0)) { // L: 9741
			WorldMapElement.field1784 = null; // L: 9748
			Skills.drawInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 9749
			if (WorldMapElement.field1784 != null) { // L: 9750
				Skills.drawInterface(WorldMapElement.field1784, -1412584499, var1, var2, var3, var4, WorldMapData_1.field2676, ParamComposition.field1938, var7); // L: 9751
				WorldMapElement.field1784 = null; // L: 9752
			}

		} else {
			if (var7 != -1) { // L: 9742
				Client.field713[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 9744
					Client.field713[var8] = true;
				}
			}

		}
	} // L: 9746 9754
}
