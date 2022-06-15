import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
public enum class124 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	field1546(0, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	field1544(4, 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	field1543(1, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	field1550(2, 3),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	field1547(3, 4);

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1017548215
	)
	public final int field1548;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 972373499
	)
	@Export("id")
	final int id;

	class124(int var3, int var4) {
		this.field1548 = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpb;III)I",
		garbageValue = "-1005056854"
	)
	static int method2818(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1);
			return var3 == null ? var2 : var3.integer;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgp;",
		garbageValue = "15"
	)
	public static FloorOverlayDefinition method2814(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0); // L: 30
		if (var1 != null) { // L: 31
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0); // L: 32
			var1 = new FloorOverlayDefinition(); // L: 33
			if (var2 != null) { // L: 34
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 35
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0); // L: 36
			return var1; // L: 37
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[Lft;",
		garbageValue = "127"
	)
	static VerticalAlignment[] method2820() {
		return new VerticalAlignment[]{VerticalAlignment.field1963, VerticalAlignment.field1961, VerticalAlignment.VerticalAlignment_centered}; // L: 14
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)I",
		garbageValue = "1998673549"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32)); // L: 12289
		return var1 != null ? var1.integer : var0.flags; // L: 12290 12291
	}
}
