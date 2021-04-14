import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = 1645607617
	)
	static int field592;

	ApproximateRouteStrategy() {
	} // L: 11800

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIILel;I)Z",
		garbageValue = "120127354"
	)
	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 11803
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "56"
	)
	public static void method1205() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 94
	} // L: 95

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lhu;I[B[BI)V",
		garbageValue = "-358433365"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field2699 == null) { // L: 963
			if (var2 == null) { // L: 964
				return; // L: 970
			}

			var0.field2699 = new byte[11][]; // L: 965
			var0.field2747 = new byte[11][]; // L: 966
			var0.field2701 = new int[11]; // L: 967
			var0.field2692 = new int[11]; // L: 968
		}

		var0.field2699[var1] = var2; // L: 972
		if (var2 != null) {
			var0.field2698 = true; // L: 973
		} else {
			var0.field2698 = false; // L: 975

			for (int var4 = 0; var4 < var0.field2699.length; ++var4) { // L: 976
				if (var0.field2699[var4] != null) { // L: 977
					var0.field2698 = true; // L: 978
					break;
				}
			}
		}

		var0.field2747[var1] = var3; // L: 983
	} // L: 984

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-61"
	)
	static boolean method1206() {
		return (Client.drawPlayerNames & 2) != 0; // L: 4058
	}
}
