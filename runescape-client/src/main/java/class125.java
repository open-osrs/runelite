import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public enum class125 implements Enumerated {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	field1470(2, 0),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	field1469(1, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	field1468(0, 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	field1471(3, 3);

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("NetCache_reference")
	public static Buffer NetCache_reference;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 850248893
	)
	public final int field1472;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1949743275
	)
	@Export("id")
	final int id;

	class125(int var3, int var4) {
		this.field1472 = var3; // L: 16
		this.id = var4; // L: 17
	} // L: 18

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907662946"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 21
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-60"
	)
	static int method2502(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1); // L: 114
		return BuddyRankComparator.NetCache_currentResponse != null && var2 == BuddyRankComparator.NetCache_currentResponse.key ? SoundSystem.NetCache_responseArchiveBuffer.offset * 99 / (SoundSystem.NetCache_responseArchiveBuffer.array.length - BuddyRankComparator.NetCache_currentResponse.padding) + 1 : 0; // L: 115 116
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2118107095"
	)
	static final int method2504() {
		return ViewportMouse.ViewportMouse_x; // L: 112
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lio;Leq;IIZI)V",
		garbageValue = "1630446885"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions; // L: 9970
		byte var6 = -1; // L: 9971
		String var7 = null; // L: 9972
		if (var5 != null && var5[var3] != null) { // L: 9973
			if (var3 == 0) { // L: 9974
				var6 = 33;
			} else if (var3 == 1) { // L: 9975
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35; // L: 9976
			} else if (var3 == 3) { // L: 9977
				var6 = 36;
			} else {
				var6 = 37; // L: 9978
			}

			var7 = var5[var3]; // L: 9979
		} else if (var3 == 4) { // L: 9982
			var6 = 37; // L: 9983
			var7 = "Drop"; // L: 9984
		}

		if (var6 != -1 && var7 != null) { // L: 9987
			BoundaryObject.insertMenuItem(var7, class44.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4); // L: 9988
		}

	} // L: 9990
}
