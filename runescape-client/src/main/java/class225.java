import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
public class class225 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public static final class225 field2686;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public static final class225 field2680;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public static final class225 field2682;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public static final class225 field2683;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public static final class225 field2681;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public static final class225 field2685;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public static final class225 field2687;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public static final class225 field2684;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public static final class225 field2688;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public static final class225 field2689;

	static {
		field2686 = new class225(15); // L: 5
		field2680 = new class225(7); // L: 6
		field2682 = new class225(2); // L: 7
		field2683 = new class225(5); // L: 8
		field2681 = new class225(14); // L: 9
		field2685 = new class225(3); // L: 10
		field2687 = new class225(5); // L: 11
		field2684 = new class225(4); // L: 12
		field2688 = new class225(4); // L: 13
		field2689 = new class225(6); // L: 14
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "15"
	)
	class225(int var1) {
	} // L: 20

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "-40"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (Clock.loadInterface(var0)) { // L: 9193
			class4.field49 = null; // L: 9200
			class303.drawInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 9201
			if (class4.field49 != null) { // L: 9202
				class303.drawInterface(class4.field49, -1412584499, var1, var2, var3, var4, ClanChannel.field38, class82.field1020, var7); // L: 9203
				class4.field49 = null; // L: 9204
			}

		} else {
			if (var7 != -1) { // L: 9194
				Client.field719[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 9196
					Client.field719[var8] = true;
				}
			}

		}
	} // L: 9198 9206
}
