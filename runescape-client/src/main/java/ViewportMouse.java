import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("v")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2033898479
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1837760981
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("g")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -601964039
	)
	static int field2577;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -914077727
	)
	static int field2581;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -175114873
	)
	static int field2579;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 755934233
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("p")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "2056272392"
	)
	static final boolean method4463(char var0) {
		if (Character.isISOControl(var0)) { // L: 16
			return false;
		} else if (NetFileRequest.isAlphaNumeric(var0)) { // L: 17
			return true;
		} else {
			char[] var1 = class422.field4564; // L: 19

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) { // L: 20
				var3 = var1[var2]; // L: 21
				if (var0 == var3) { // L: 22
					return true;
				}
			}

			var1 = class422.field4562; // L: 26

			for (var2 = 0; var2 < var1.length; ++var2) { // L: 27
				var3 = var1[var2]; // L: 28
				if (var0 == var3) {
					return true; // L: 29
				}
			}

			return false; // L: 32
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "-1245654487"
	)
	static void method4493(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(AccessFile.JagexCache_locationFile, "rw", 10000L); // L: 133
			Buffer var3 = new Buffer(500); // L: 134
			var3.writeByte(3); // L: 135
			var3.writeByte(var1 != null ? 1 : 0); // L: 136
			var3.writeCESU8(var0.getPath()); // L: 137
			if (var1 != null) {
				var3.writeCESU8(""); // L: 138
			}

			var2.write(var3.array, 0, var3.offset); // L: 139
			var2.close(); // L: 140
		} catch (IOException var4) { // L: 142
			var4.printStackTrace(); // L: 143
		}

	} // L: 145

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "115"
	)
	static final int method4492() {
		float var0 = 200.0F * ((float)Interpreter.clientPreferences.method2266() - 0.5F); // L: 11347
		return 100 - Math.round(var0); // L: 11348
	}
}
