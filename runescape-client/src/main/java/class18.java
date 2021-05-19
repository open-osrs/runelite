import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class18 extends class14 {
	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static class285 field154;
	@ObfuscatedName("rg")
	@ObfuscatedGetter(
		intValue = -1740704291
	)
	static int field157;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	static Bounds field155;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 91445281
	)
	int field152;
	@ObfuscatedName("c")
	boolean field151;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class18(class2 var1) {
		this.this$0 = var1;
		this.field152 = -1; // L: 178
	} // L: 181

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	void vmethod339(Buffer var1) {
		this.field152 = var1.readUnsignedShort(); // L: 184
		this.field151 = var1.readUnsignedByte() == 1; // L: 185
	} // L: 186

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	void vmethod338(class11 var1) {
		var1.method133(this.field152, this.field151); // L: 189
	} // L: 190

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "114"
	)
	static int method255(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 84
			boolean var3 = false; // L: 85
			boolean var4 = false; // L: 86
			int var5 = 0; // L: 87
			int var6 = var0.length(); // L: 88

			for (int var7 = 0; var7 < var6; ++var7) { // L: 89
				char var8 = var0.charAt(var7); // L: 90
				if (var7 == 0) { // L: 91
					if (var8 == '-') { // L: 92
						var3 = true; // L: 93
						continue;
					}

					if (var8 == '+') { // L: 96
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 98
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 99
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 100
						throw new NumberFormatException(); // L: 101
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 102
					throw new NumberFormatException();
				}

				if (var3) { // L: 103
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 104
				if (var9 / var1 != var5) { // L: 105
					throw new NumberFormatException();
				}

				var5 = var9; // L: 106
				var4 = true; // L: 107
			}

			if (!var4) { // L: 109
				throw new NumberFormatException();
			} else {
				return var5; // L: 110
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Lcl;ZI)V",
		garbageValue = "-1411385437"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 11340
		int var3 = (int)var0.key; // L: 11341
		var0.remove(); // L: 11342
		if (var1) { // L: 11343
			WallDecoration.method4234(var2);
		}

		TaskHandler.method2515(var2); // L: 11344
		Widget var4 = DevicePcmPlayerProvider.getWidget(var3); // L: 11345
		if (var4 != null) { // L: 11346
			VerticalAlignment.invalidateWidget(var4);
		}

		GrandExchangeOfferOwnWorldComparator.method1212(); // L: 11347
		if (Client.rootInterface != -1) { // L: 11348
			LoginType.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 11349
}
