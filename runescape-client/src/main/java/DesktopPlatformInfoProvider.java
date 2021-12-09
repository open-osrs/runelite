import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
@Implements("DesktopPlatformInfoProvider")
public class DesktopPlatformInfoProvider implements PlatformInfoProvider {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1848587341
	)
	@Export("javaVersionMajor")
	int javaVersionMajor;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -865259943
	)
	@Export("javaVersionMinor")
	int javaVersionMinor;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 494099171
	)
	@Export("javaVersionPatch")
	int javaVersionPatch;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Lnn;",
		garbageValue = "-12"
	)
	@Export("get")
	public PlatformInfo get() {
		byte osType;
		if (JagexCache.formattedOperatingSystemName.startsWith("win")) { // L: 16
			osType = 1;
		} else if (JagexCache.formattedOperatingSystemName.startsWith("mac")) { // L: 17
			osType = 2;
		} else if (JagexCache.formattedOperatingSystemName.startsWith("linux")) { // L: 18
			osType = 3;
		} else {
			osType = 4; // L: 19
		}

		String osArch;
		try {
			osArch = System.getProperty("os.arch").toLowerCase(); // L: 23
		} catch (Exception var30) { // L: 25
			osArch = ""; // L: 26
		}

		String osVersion;
		try {
			osVersion = System.getProperty("os.version").toLowerCase(); // L: 29
		} catch (Exception var29) { // L: 31
			osVersion = ""; // L: 32
		}

		String javaVendor = "Unknown"; // L: 34
		String javaVersion = "1.1"; // L: 35

		try {
			javaVendor = System.getProperty("java.vendor"); // L: 37
			javaVersion = System.getProperty("java.version"); // L: 38
		} catch (Exception var28) { // L: 40
		}

		boolean is64bit;
		if (!osArch.startsWith("amd64") && !osArch.startsWith("x86_64")) { // L: 42
			is64bit = false; // L: 43
		} else {
			is64bit = true;
		}

		byte osVersionType = 0; // L: 44
		if (osType == 1) { // L: 45
			if (osVersion.indexOf("4.0") != -1) { // L: 46
				osVersionType = 1;
			} else if (osVersion.indexOf("4.1") != -1) { // L: 47
				osVersionType = 2;
			} else if (osVersion.indexOf("4.9") != -1) { // L: 48
				osVersionType = 3;
			} else if (osVersion.indexOf("5.0") != -1) { // L: 49
				osVersionType = 4;
			} else if (osVersion.indexOf("5.1") != -1) { // L: 50
				osVersionType = 5;
			} else if (osVersion.indexOf("5.2") != -1) { // L: 51
				osVersionType = 8;
			} else if (osVersion.indexOf("6.0") != -1) { // L: 52
				osVersionType = 6;
			} else if (osVersion.indexOf("6.1") != -1) { // L: 53
				osVersionType = 7;
			} else if (osVersion.indexOf("6.2") != -1) { // L: 54
				osVersionType = 9;
			} else if (osVersion.indexOf("6.3") != -1) { // L: 55
				osVersionType = 10;
			} else if (osVersion.indexOf("10.0") != -1) { // L: 56
				osVersionType = 11;
			}
		} else if (osType == 2) { // L: 58
			if (osVersion.indexOf("10.4") != -1) { // L: 59
				osVersionType = 20;
			} else if (osVersion.indexOf("10.5") != -1) { // L: 60
				osVersionType = 21;
			} else if (osVersion.indexOf("10.6") != -1) { // L: 61
				osVersionType = 22;
			} else if (osVersion.indexOf("10.7") != -1) { // L: 62
				osVersionType = 23;
			} else if (osVersion.indexOf("10.8") != -1) { // L: 63
				osVersionType = 24;
			} else if (osVersion.indexOf("10.9") != -1) { // L: 64
				osVersionType = 25;
			} else if (osVersion.indexOf("10.10") != -1) { // L: 65
				osVersionType = 26;
			} else if (osVersion.indexOf("10.11") != -1) { // L: 66
				osVersionType = 27;
			} else if (osVersion.indexOf("10.12") != -1) { // L: 67
				osVersionType = 28;
			} else if (osVersion.indexOf("10.13") != -1) { // L: 68
				osVersionType = 29;
			}
		}

		byte javaVendorType;
		if (javaVendor.toLowerCase().indexOf("sun") != -1) { // L: 71
			javaVendorType = 1;
		} else if (javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 72
			javaVendorType = 2;
		} else if (javaVendor.toLowerCase().indexOf("apple") != -1) { // L: 73
			javaVendorType = 3;
		} else if (javaVendor.toLowerCase().indexOf("oracle") != -1) { // L: 74
			javaVendorType = 5;
		} else {
			javaVendorType = 4; // L: 75
		}

		this.parseJavaVersion(javaVersion); // L: 76
		boolean var9 = false; // L: 77
		int maxMemory = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1; // L: 78
		int availableProcessors;
		if (this.javaVersionMajor > 3) { // L: 81
			availableProcessors = Runtime.getRuntime().availableProcessors();
		} else {
			availableProcessors = 0; // L: 82
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
		return new PlatformInfo(osType, is64bit, osVersionType, javaVendorType, this.javaVersionMajor, this.javaVersionMinor, this.javaVersionPatch, false, maxMemory, availableProcessors, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, ""); // L: 98
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "742897399"
	)
	@Export("parseJavaVersion")
	void parseJavaVersion(String var1) {
		if (var1.startsWith("1.")) { // L: 102
			this.parseJava1Version(var1); // L: 103
		} else {
			this.parseJavaGeneralVersion(var1); // L: 106
		}

	} // L: 108

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-691110522"
	)
	@Export("parseJava1Version")
	void parseJava1Version(String var1) {
		String[] var2 = var1.split("\\."); // L: 111

		try {
			this.javaVersionMajor = Integer.parseInt(var2[1]); // L: 113
			var2 = var2[2].split("_"); // L: 114
			this.javaVersionMinor = Integer.parseInt(var2[0]); // L: 115
			this.javaVersionPatch = Integer.parseInt(var2[1]); // L: 116
		} catch (Exception var4) { // L: 118
		}

	} // L: 119

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "69"
	)
	@Export("parseJavaGeneralVersion")
	void parseJavaGeneralVersion(String var1) {
		String[] var2 = var1.split("\\."); // L: 122

		try {
			this.javaVersionMajor = Integer.parseInt(var2[0]); // L: 124
			this.javaVersionMinor = Integer.parseInt(var2[1]); // L: 125
			this.javaVersionPatch = Integer.parseInt(var2[2]); // L: 126
		} catch (Exception var4) { // L: 128
		}

	} // L: 129
}
