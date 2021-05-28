import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
@Implements("DesktopPlatformInfoProvider")
public class DesktopPlatformInfoProvider implements PlatformInfoProvider {
	@ObfuscatedName("rm")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 1745891823
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1520925295
	)
	int field3946;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1280779565
	)
	int field3940;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1746870345
	)
	int field3945;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Lmy;",
		garbageValue = "-10"
	)
	@Export("get")
	public PlatformInfo get() {
		byte var1;
		if (UserComparator5.formattedOperatingSystemName.startsWith("win")) { // L: 15
			var1 = 1;
		} else if (UserComparator5.formattedOperatingSystemName.startsWith("mac")) { // L: 16
			var1 = 2;
		} else if (UserComparator5.formattedOperatingSystemName.startsWith("linux")) { // L: 17
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
		} else if (var1 == 2) {
			if (var3.indexOf("10.4") != -1) {
				var7 = 20;
			} else if (var3.indexOf("10.5") != -1) { // L: 59
				var7 = 21;
			} else if (var3.indexOf("10.6") != -1) {
				var7 = 22;
			} else if (var3.indexOf("10.7") != -1) { // L: 61
				var7 = 23;
			} else if (var3.indexOf("10.8") != -1) { // L: 62
				var7 = 24;
			} else if (var3.indexOf("10.9") != -1) {
				var7 = 25;
			} else if (var3.indexOf("10.10") != -1) { // L: 64
				var7 = 26;
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

		this.method6063(var5); // L: 75
		int var10 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1; // L: 77
		int var11;
		if (this.field3946 > 3) { // L: 80
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
		return new PlatformInfo(var1, var24, var7, var8, this.field3946, this.field3940, this.field3945, false, var10, var11, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, ""); // L: 97
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-33"
	)
	void method6063(String var1) {
		if (var1.startsWith("1.")) { // L: 101
			this.method6064(var1); // L: 102
		} else {
			this.method6078(var1); // L: 105
		}

	} // L: 107

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "94"
	)
	void method6064(String var1) {
		String[] var2 = var1.split("\\."); // L: 110

		try {
			this.field3946 = Integer.parseInt(var2[1]); // L: 112
			var2 = var2[2].split("_"); // L: 113
			this.field3940 = Integer.parseInt(var2[0]); // L: 114
			this.field3945 = Integer.parseInt(var2[1]); // L: 115
		} catch (Exception var4) { // L: 117
		}

	} // L: 118

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1652585717"
	)
	void method6078(String var1) {
		String[] var2 = var1.split("\\."); // L: 121

		try {
			this.field3946 = Integer.parseInt(var2[0]); // L: 123
			this.field3940 = Integer.parseInt(var2[1]); // L: 124
			this.field3945 = Integer.parseInt(var2[2]); // L: 125
		} catch (Exception var4) { // L: 127
		}

	} // L: 128

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "848721482"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = Tiles.World_worlds[var6]; // L: 180
			Tiles.World_worlds[var6] = Tiles.World_worlds[var1]; // L: 181
			Tiles.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				World var11 = Tiles.World_worlds[var9]; // L: 185
				int var12 = class12.compareWorlds(var11, var8, var2, var3); // L: 187
				int var10;
				if (var12 != 0) { // L: 188
					if (var3) { // L: 189
						var10 = -var12; // L: 190
					} else {
						var10 = var12; // L: 194
					}
				} else if (var4 == -1) { // L: 198
					var10 = 0; // L: 199
				} else {
					int var13 = class12.compareWorlds(var11, var8, var4, var5); // L: 202
					if (var5) { // L: 203
						var10 = -var13;
					} else {
						var10 = var13; // L: 204
					}
				}

				if (var10 <= 0) { // L: 206
					World var14 = Tiles.World_worlds[var9]; // L: 207
					Tiles.World_worlds[var9] = Tiles.World_worlds[var7]; // L: 208
					Tiles.World_worlds[var7++] = var14; // L: 209
				}
			}

			Tiles.World_worlds[var1] = Tiles.World_worlds[var7]; // L: 213
			Tiles.World_worlds[var7] = var8; // L: 214
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 215
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 216
		}

	} // L: 218

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method6068() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 57

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 58
			var1.clearIsFromIgnored(); // L: 60
		}

	} // L: 63
}
