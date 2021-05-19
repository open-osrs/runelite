import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public class class17 extends class14 {
	@ObfuscatedName("h")
	boolean field144;
	@ObfuscatedName("c")
	byte field143;
	@ObfuscatedName("o")
	byte field147;
	@ObfuscatedName("g")
	byte field145;
	@ObfuscatedName("l")
	byte field149;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class17(class2 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	void vmethod339(Buffer var1) {
		this.field144 = var1.readUnsignedByte() == 1; // L: 251
		this.field143 = var1.readByte(); // L: 252
		this.field147 = var1.readByte(); // L: 253
		this.field145 = var1.readByte(); // L: 254
		this.field149 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	void vmethod338(class11 var1) {
		var1.field93 = this.field144; // L: 259
		var1.field111 = this.field143; // L: 260
		var1.field95 = this.field147; // L: 261
		var1.field96 = this.field145; // L: 262
		var1.field113 = this.field149; // L: 263
	} // L: 264

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "-1388613709"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 120
		int var4 = 0; // L: 121

		for (int var5 = 0; var5 < var2; ++var5) { // L: 122
			int var6 = var0[var5 + var1] & 255; // L: 123
			if (var6 != 0) { // L: 124
				if (var6 >= 128 && var6 < 160) { // L: 125
					char var7 = class301.cp1252AsciiExtension[var6 - 128]; // L: 126
					if (var7 == 0) { // L: 127
						var7 = '?';
					}

					var6 = var7; // L: 128
				}

				var3[var4++] = (char)var6; // L: 130
			}
		}

		return new String(var3, 0, var4); // L: 132
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 191
			if (KeyHandler.field277 == KeyHandler.field279) { // L: 192
				return false;
			} else {
				MenuAction.field982 = KeyHandler.field274[KeyHandler.field277]; // L: 193
				class25.field207 = KeyHandler.field255[KeyHandler.field277]; // L: 194
				KeyHandler.field277 = KeyHandler.field277 + 1 & 127; // L: 195
				return true; // L: 196
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIZII)J",
		garbageValue = "423637050"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 82
		if (var3) { // L: 83
			var5 |= 65536L;
		}

		return var5; // L: 84
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Liv;IIZB)V",
		garbageValue = "1"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 10071
		int var5 = var0.height; // L: 10072
		if (var0.widthAlignment == 0) { // L: 10073
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 10074
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 10075
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 10076
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 10077
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) { // L: 10078
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) { // L: 10079
			var0.width = var0.height * var0.field2981 / var0.field3104;
		}

		if (var0.heightAlignment == 4) { // L: 10080
			var0.height = var0.width * var0.field3104 / var0.field2981;
		}

		if (var0.contentType == 1337) { // L: 10081
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 10082
			ScriptEvent var6 = new ScriptEvent(); // L: 10083
			var6.widget = var0; // L: 10084
			var6.args = var0.onResize; // L: 10085
			Client.scriptEvents.addFirst(var6); // L: 10086
		}

	} // L: 10088
}
