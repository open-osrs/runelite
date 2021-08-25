import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements MouseWheel {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	field1746(2, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	field1741(1, 2);

	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 680576733
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -504909775
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1665712539"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "([Ljd;Ljd;ZB)V",
		garbageValue = "121"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth * 1186027877 * 1882337389 : var1.width * 2073696861 * -159544843;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight * -129679387 * -351476243 : var1.height * -1187557111 * -555381447;
		Coord.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			Coord.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
		if (var5 != null) {
			int var6 = var5.group;
			if (class317.loadInterface(var6)) {
				Coord.resizeInterface(class139.Widget_interfaceComponents[var6], -1, var3, var4, var2);
			}
		}

		if (var1.contentType == 1337) {
		}

	}
}
