import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class152 extends class128 {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("soundCache")
	public static SoundCache soundCache;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1265615631
	)
	int field1731;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 811865021811254987L
	)
	long field1732;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class152(class131 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-611912046"
	)
	void vmethod3040(Buffer var1) {
		this.field1731 = var1.readInt(); // L: 310
		this.field1732 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lek;B)V",
		garbageValue = "-73"
	)
	void vmethod3041(ClanSettings var1) {
		var1.method2889(this.field1731, this.field1732); // L: 315
	} // L: 316

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1235895203"
	)
	public static boolean method3039(int var0) {
		return (var0 >> 22 & 1) != 0; // L: 21
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1863816537"
	)
	static void method3044() {
		Messages.Messages_channels.clear(); // L: 50
		Messages.Messages_hashTable.clear(); // L: 51
		Messages.Messages_queue.clear(); // L: 52
		Messages.Messages_count = 0; // L: 53
	} // L: 54

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIZI)Ljava/lang/String;",
		garbageValue = "-2058943082"
	)
	static String method3046(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 111
			if (var2 && var0 >= 0) { // L: 112
				int var3 = 2; // L: 113

				for (int var4 = var0 / var1; var4 != 0; ++var3) { // L: 114 115 117
					var4 /= var1; // L: 116
				}

				char[] var5 = new char[var3]; // L: 119
				var5[0] = '+'; // L: 120

				for (int var6 = var3 - 1; var6 > 0; --var6) { // L: 121
					int var7 = var0; // L: 122
					var0 /= var1; // L: 123
					int var8 = var7 - var0 * var1; // L: 124
					if (var8 >= 10) { // L: 125
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48); // L: 126
					}
				}

				return new String(var5); // L: 128
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lki;IIII)V",
		garbageValue = "-48842919"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3476 == null) { // L: 1012
			throw new RuntimeException(); // L: 1013
		} else {
			var0.field3476[var1] = var2; // L: 1015
			var0.field3481[var1] = var3; // L: 1016
		}
	} // L: 1017
}
