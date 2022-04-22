import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
@Implements("DesktopPlatformInfoProvider")
public class DesktopPlatformInfoProvider implements PlatformInfoProvider {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 175576615
	)
	int field4413;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 551847099
	)
	int field4412;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -212427447
	)
	int field4416;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Loj;",
		garbageValue = "2004856383"
	)
	@Export("get")
	public PlatformInfo get() {
		byte var1;
		if (class128.formattedOperatingSystemName.startsWith("win")) { // L: 15
			var1 = 1;
		} else if (class128.formattedOperatingSystemName.startsWith("mac")) { // L: 16
			var1 = 2;
		} else if (class128.formattedOperatingSystemName.startsWith("linux")) { // L: 17
			var1 = 3;
		} else {
			var1 = 4; // L: 18
		}

		String var2;
		try {
			var2 = System.getProperty("os.arch").toLowerCase(); // L: 22
		} catch (Exception var27) { // L: 24
			var2 = ""; // L: 25
		}

		String var3;
		try {
			var3 = System.getProperty("os.version").toLowerCase(); // L: 28
		} catch (Exception var26) { // L: 30
			var3 = ""; // L: 31
		}

		String var4 = "Unknown"; // L: 33
		String var5 = "1.1"; // L: 34

		try {
			var4 = System.getProperty("java.vendor"); // L: 36
			var5 = System.getProperty("java.version"); // L: 37
		} catch (Exception var25) { // L: 39
		}

		boolean var24;
		if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) { // L: 41
			var24 = false; // L: 42
		} else {
			var24 = true;
		}

		byte var7 = 0; // L: 43
		if (var1 == 1) { // L: 44
			if (var3.indexOf("4.0") != -1) { // L: 45
				var7 = 1;
			} else if (var3.indexOf("4.1") != -1) { // L: 46
				var7 = 2;
			} else if (var3.indexOf("4.9") != -1) { // L: 47
				var7 = 3;
			} else if (var3.indexOf("5.0") != -1) { // L: 48
				var7 = 4;
			} else if (var3.indexOf("5.1") != -1) { // L: 49
				var7 = 5;
			} else if (var3.indexOf("5.2") != -1) { // L: 50
				var7 = 8;
			} else if (var3.indexOf("6.0") != -1) { // L: 51
				var7 = 6;
			} else if (var3.indexOf("6.1") != -1) { // L: 52
				var7 = 7;
			} else if (var3.indexOf("6.2") != -1) { // L: 53
				var7 = 9;
			} else if (var3.indexOf("6.3") != -1) { // L: 54
				var7 = 10;
			} else if (var3.indexOf("10.0") != -1) { // L: 55
				var7 = 11;
			}
		} else if (var1 == 2) { // L: 57
			if (var3.indexOf("10.4") != -1) { // L: 58
				var7 = 20;
			} else if (var3.indexOf("10.5") != -1) { // L: 59
				var7 = 21;
			} else if (var3.indexOf("10.6") != -1) { // L: 60
				var7 = 22;
			} else if (var3.indexOf("10.7") != -1) { // L: 61
				var7 = 23;
			} else if (var3.indexOf("10.8") != -1) { // L: 62
				var7 = 24;
			} else if (var3.indexOf("10.9") != -1) { // L: 63
				var7 = 25;
			} else if (var3.indexOf("10.10") != -1) {
				var7 = 26; // L: 64
			} else if (var3.indexOf("10.11") != -1) { // L: 65
				var7 = 27;
			} else if (var3.indexOf("10.12") != -1) { // L: 66
				var7 = 28;
			} else if (var3.indexOf("10.13") != -1) { // L: 67
				var7 = 29;
			}
		}

		byte var8;
		if (var4.toLowerCase().indexOf("sun") != -1) { // L: 70
			var8 = 1;
		} else if (var4.toLowerCase().indexOf("microsoft") != -1) { // L: 71
			var8 = 2;
		} else if (var4.toLowerCase().indexOf("apple") != -1) { // L: 72
			var8 = 3;
		} else if (var4.toLowerCase().indexOf("oracle") != -1) { // L: 73
			var8 = 5;
		} else {
			var8 = 4; // L: 74
		}

		this.method7178(var5); // L: 75
		int var10 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1; // L: 77
		int var11;
		if (this.field4413 > 3) { // L: 80
			var11 = Runtime.getRuntime().availableProcessors();
		} else {
			var11 = 0; // L: 81
		}

		byte var12 = 0; // L: 82
		String var13 = ""; // L: 83
		String var14 = ""; // L: 84
		String var15 = ""; // L: 85
		String var16 = ""; // L: 86
		String var17 = ""; // L: 87
		String var18 = ""; // L: 88
		int[] var23 = new int[3]; // L: 93
		return new PlatformInfo(var1, var24, var7, var8, this.field4413, this.field4412, this.field4416, false, var10, var11, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, ""); // L: 97
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "559180637"
	)
	void method7178(String var1) {
		if (var1.startsWith("1.")) { // L: 101
			this.method7179(var1); // L: 102
		} else {
			this.method7177(var1); // L: 105
		}

	} // L: 107

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "435492533"
	)
	void method7179(String var1) {
		String[] var2 = var1.split("\\."); // L: 110

		try {
			this.field4413 = Integer.parseInt(var2[1]); // L: 112
			var2 = var2[2].split("_"); // L: 113
			this.field4412 = Integer.parseInt(var2[0]); // L: 114
			this.field4416 = Integer.parseInt(var2[1]); // L: 115
		} catch (Exception var4) { // L: 117
		}

	} // L: 118

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "120"
	)
	void method7177(String var1) {
		String[] var2 = var1.split("\\."); // L: 121

		try {
			this.field4413 = Integer.parseInt(var2[0]); // L: 123
			this.field4412 = Integer.parseInt(var2[1]); // L: 124
			this.field4416 = Integer.parseInt(var2[2]); // L: 125
		} catch (Exception var4) { // L: 127
		}

	} // L: 128
}
