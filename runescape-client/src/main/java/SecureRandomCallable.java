import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2147326651
	)
	static int field553;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 417708035
	)
	public static int field555;

	SecureRandomCallable() {
	} // L: 36

	public Object call() {
		return ServerPacket.method3740(); // L: 45
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "-2079268292"
	)
	static void method1237(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(class277.JagexCache_locationFile, "rw", 10000L); // L: 237
			Buffer var3 = new Buffer(500); // L: 238
			var3.writeByte(3); // L: 239
			var3.writeByte(var1 != null ? 1 : 0); // L: 240
			var3.writeCESU8(var0.getPath()); // L: 241
			if (var1 != null) {
				var3.writeCESU8(""); // L: 242
			}

			var2.write(var3.array, 0, var3.offset); // L: 243
			var2.close(); // L: 244
		} catch (IOException var4) { // L: 246
			var4.printStackTrace(); // L: 247
		}

	} // L: 249

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "-1129917502"
	)
	@Export("parseIntCustomRadix")
	public static int parseIntCustomRadix(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 80
			boolean var3 = false; // L: 81
			boolean var4 = false; // L: 82
			int var5 = 0; // L: 83
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7); // L: 86
				if (var7 == 0) { // L: 87
					if (var8 == '-') { // L: 88
						var3 = true; // L: 89
						continue;
					}

					if (var8 == '+') { // L: 92
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 94
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 95
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 96
						throw new NumberFormatException(); // L: 97
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 98
					throw new NumberFormatException();
				}

				if (var3) { // L: 99
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 100
				if (var9 / var1 != var5) { // L: 101
					throw new NumberFormatException();
				}

				var5 = var9; // L: 102
				var4 = true; // L: 103
			}

			if (!var4) { // L: 105
				throw new NumberFormatException();
			} else {
				return var5; // L: 106
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1149121"
	)
	public static int method1238(int var0, int var1) {
		int var2 = var0 >>> 31; // L: 84
		return (var0 + var2) / var1 - var2; // L: 85
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Lht;Ljk;IIZI)V",
		garbageValue = "-59300685"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemDefinition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions; // L: 10094
		byte var6 = -1; // L: 10095
		String var7 = null; // L: 10096
		if (var5 != null && var5[var3] != null) { // L: 10097
			if (var3 == 0) { // L: 10098
				var6 = 33;
			} else if (var3 == 1) { // L: 10099
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35; // L: 10100
			} else if (var3 == 3) { // L: 10101
				var6 = 36;
			} else {
				var6 = 37; // L: 10102
			}

			var7 = var5[var3]; // L: 10103
		} else if (var3 == 4) { // L: 10106
			var6 = 37; // L: 10107
			var7 = "Drop"; // L: 10108
		}

		if (var6 != -1 && var7 != null) { // L: 10111
			KeyHandler.insertMenuItem(var7, Client.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4); // L: 10112
		}

	} // L: 10114
}
