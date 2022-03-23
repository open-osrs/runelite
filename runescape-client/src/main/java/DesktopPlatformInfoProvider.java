import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
@Implements("DesktopPlatformInfoProvider")
public class DesktopPlatformInfoProvider implements PlatformInfoProvider {
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1948340117
	)
	int field4413;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1586202977
	)
	int field4416;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2071888753
	)
	int field4415;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Lov;",
		garbageValue = "0"
	)
	@Export("get")
	public PlatformInfo get() {
		byte var1;
		if (Buffer.formattedOperatingSystemName.startsWith("win")) { // L: 16
			var1 = 1;
		} else if (Buffer.formattedOperatingSystemName.startsWith("mac")) { // L: 17
			var1 = 2;
		} else if (Buffer.formattedOperatingSystemName.startsWith("linux")) { // L: 18
			var1 = 3;
		} else {
			var1 = 4; // L: 19
		}

		String var2;
		try {
			var2 = System.getProperty("os.arch").toLowerCase(); // L: 23
		} catch (Exception var30) { // L: 25
			var2 = ""; // L: 26
		}

		String var3;
		try {
			var3 = System.getProperty("os.version").toLowerCase(); // L: 29
		} catch (Exception var29) { // L: 31
			var3 = ""; // L: 32
		}

		String var4 = "Unknown"; // L: 34
		String var5 = "1.1"; // L: 35

		try {
			var4 = System.getProperty("java.vendor"); // L: 37
			var5 = System.getProperty("java.version"); // L: 38
		} catch (Exception var28) { // L: 40
		}

		boolean var27;
		if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) { // L: 42
			var27 = false; // L: 43
		} else {
			var27 = true;
		}

		byte var7 = 0; // L: 44
		if (var1 == 1) { // L: 45
			if (var3.indexOf("4.0") != -1) { // L: 46
				var7 = 1;
			} else if (var3.indexOf("4.1") != -1) { // L: 47
				var7 = 2;
			} else if (var3.indexOf("4.9") != -1) { // L: 48
				var7 = 3;
			} else if (var3.indexOf("5.0") != -1) { // L: 49
				var7 = 4;
			} else if (var3.indexOf("5.1") != -1) { // L: 50
				var7 = 5;
			} else if (var3.indexOf("5.2") != -1) { // L: 51
				var7 = 8;
			} else if (var3.indexOf("6.0") != -1) { // L: 52
				var7 = 6;
			} else if (var3.indexOf("6.1") != -1) { // L: 53
				var7 = 7;
			} else if (var3.indexOf("6.2") != -1) { // L: 54
				var7 = 9;
			} else if (var3.indexOf("6.3") != -1) { // L: 55
				var7 = 10;
			} else if (var3.indexOf("10.0") != -1) { // L: 56
				var7 = 11;
			}
		} else if (var1 == 2) { // L: 58
			if (var3.indexOf("10.4") != -1) { // L: 59
				var7 = 20;
			} else if (var3.indexOf("10.5") != -1) { // L: 60
				var7 = 21;
			} else if (var3.indexOf("10.6") != -1) { // L: 61
				var7 = 22;
			} else if (var3.indexOf("10.7") != -1) { // L: 62
				var7 = 23;
			} else if (var3.indexOf("10.8") != -1) { // L: 63
				var7 = 24;
			} else if (var3.indexOf("10.9") != -1) { // L: 64
				var7 = 25;
			} else if (var3.indexOf("10.10") != -1) { // L: 65
				var7 = 26;
			} else if (var3.indexOf("10.11") != -1) { // L: 66
				var7 = 27;
			} else if (var3.indexOf("10.12") != -1) { // L: 67
				var7 = 28;
			} else if (var3.indexOf("10.13") != -1) { // L: 68
				var7 = 29;
			}
		}

		byte var8;
		if (var4.toLowerCase().indexOf("sun") != -1) { // L: 71
			var8 = 1;
		} else if (var4.toLowerCase().indexOf("microsoft") != -1) { // L: 72
			var8 = 2;
		} else if (var4.toLowerCase().indexOf("apple") != -1) { // L: 73
			var8 = 3;
		} else if (var4.toLowerCase().indexOf("oracle") != -1) { // L: 74
			var8 = 5;
		} else {
			var8 = 4; // L: 75
		}

		this.method7264(var5); // L: 76
		boolean var9 = false; // L: 77
		int var10 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1; // L: 78
		int var11;
		if (this.field4413 > 3) { // L: 81
			var11 = Runtime.getRuntime().availableProcessors();
		} else {
			var11 = 0; // L: 82
		}

		byte var12 = 0; // L: 83
		String var13 = ""; // L: 84
		String var14 = ""; // L: 85
		String var15 = ""; // L: 86
		String var16 = ""; // L: 87
		String var17 = ""; // L: 88
		String var18 = ""; // L: 89
		boolean var19 = false; // L: 90
		boolean var20 = false; // L: 91
		boolean var21 = false; // L: 92
		boolean var22 = false; // L: 93
		int[] var23 = new int[3]; // L: 94
		boolean var24 = false; // L: 95
		String var25 = ""; // L: 96
		boolean var26 = false; // L: 97
		return new PlatformInfo(var1, var27, var7, var8, this.field4413, this.field4416, this.field4415, false, var10, var11, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, ""); // L: 98
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1017093968"
	)
	void method7264(String var1) {
		if (var1.startsWith("1.")) { // L: 102
			this.method7268(var1); // L: 103
		} else {
			this.method7265(var1); // L: 106
		}

	} // L: 108

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-494383958"
	)
	void method7268(String var1) {
		String[] var2 = var1.split("\\."); // L: 111

		try {
			this.field4413 = Integer.parseInt(var2[1]); // L: 113
			var2 = var2[2].split("_"); // L: 114
			this.field4416 = Integer.parseInt(var2[0]); // L: 115
			this.field4415 = Integer.parseInt(var2[1]); // L: 116
		} catch (Exception var4) { // L: 118
		}

	} // L: 119

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1896923040"
	)
	void method7265(String var1) {
		String[] var2 = var1.split("\\."); // L: 122

		try {
			this.field4413 = Integer.parseInt(var2[0]); // L: 124
			this.field4416 = Integer.parseInt(var2[1]); // L: 125
			this.field4415 = Integer.parseInt(var2[2]); // L: 126
		} catch (Exception var4) { // L: 128
		}

	} // L: 129
}
