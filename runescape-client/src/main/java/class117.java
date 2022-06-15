import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public class class117 {
	@ObfuscatedName("c")
	boolean field1463;
	@ObfuscatedName("v")
	boolean field1459;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	class116 field1468;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	class116 field1461;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Ldx;"
	)
	class113[] field1462;
	@ObfuscatedName("e")
	boolean field1470;
	@ObfuscatedName("g")
	float field1464;
	@ObfuscatedName("w")
	float field1458;
	@ObfuscatedName("y")
	float[] field1465;
	@ObfuscatedName("i")
	float[] field1467;
	@ObfuscatedName("s")
	boolean field1472;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1656446909
	)
	int field1469;
	@ObfuscatedName("z")
	float[] field1460;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1725270903
	)
	int field1471;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1480629139
	)
	int field1466;
	@ObfuscatedName("k")
	float field1473;
	@ObfuscatedName("h")
	float field1474;

	class117() {
		this.field1465 = new float[4]; // L: 16
		this.field1467 = new float[4]; // L: 17
		this.field1472 = true; // L: 18
		this.field1469 = 0; // L: 19
	} // L: 26

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;II)I",
		garbageValue = "1937348414"
	)
	int method2702(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 29
		ScriptFrame.method1052(var1.readUnsignedByte()); // L: 30
		int var5 = var1.readUnsignedByte(); // L: 32
		class116[] var6 = new class116[]{class116.field1455, class116.field1451, class116.field1450, class116.field1453, class116.field1454}; // L: 36
		class116 var7 = (class116)Actor.findEnumerated(var6, var5); // L: 38
		if (var7 == null) { // L: 39
			var7 = class116.field1455;
		}

		this.field1468 = var7; // L: 42
		int var11 = var1.readUnsignedByte(); // L: 44
		class116[] var8 = new class116[]{class116.field1455, class116.field1451, class116.field1450, class116.field1453, class116.field1454};
		class116 var9 = (class116)Actor.findEnumerated(var8, var11);
		if (var9 == null) {
			var9 = class116.field1455;
		}

		this.field1461 = var9; // L: 54
		this.field1463 = var1.readUnsignedByte() != 0;
		this.field1462 = new class113[var3];
		class113 var13 = null; // L: 57

		int var12;
		for (var12 = 0; var12 < var3; ++var12) { // L: 58
			class113 var10 = new class113();
			var10.method2630(var1, var2); // L: 60
			this.field1462[var12] = var10;
			if (var13 != null) { // L: 62
				var13.field1426 = var10;
			}

			var13 = var10;
		}

		this.field1471 = this.field1462[0].field1420;
		this.field1466 = this.field1462[this.method2709() - 1].field1420;
		this.field1460 = new float[this.method2706() + 1];

		for (var12 = this.method2704(); var12 <= this.method2703(); ++var12) {
			this.field1460[var12 - this.method2704()] = WorldMapSection0.method4918(this, (float)var12); // L: 72
		}

		this.field1462 = null;
		this.field1473 = WorldMapSection0.method4918(this, (float)(this.method2704() - 1)); // L: 76
		this.field1474 = WorldMapSection0.method4918(this, (float)(this.method2703() + 1));
		return var3; // L: 78
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1796106515"
	)
	public float method2701(int var1) {
		if (var1 < this.method2704()) { // L: 83
			return this.field1473;
		} else {
			return var1 > this.method2703() ? this.field1474 : this.field1460[var1 - this.method2704()]; // L: 86
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "176047889"
	)
	int method2704() {
		return this.field1471;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1241672779"
	)
	int method2703() {
		return this.field1466; // L: 98
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "5"
	)
	int method2706() {
		return this.method2703() - this.method2704();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "-938650750"
	)
	int method2705(float var1) {
		if (this.field1469 < 0 || (float)this.field1462[this.field1469].field1420 > var1 || this.field1462[this.field1469].field1426 != null && (float)this.field1462[this.field1469].field1426.field1420 <= var1) {
			if (var1 >= (float)this.method2704() && var1 <= (float)this.method2703()) {
				int var2 = this.method2709();
				int var3 = this.field1469; // L: 113
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var4 + var5 >> 1;
						if (var1 < (float)this.field1462[var6].field1420) { // L: 119
							if (var1 > (float)this.field1462[var6 - 1].field1420) {
								var3 = var6 - 1; // L: 121
								break;
							}

							var5 = var6 - 1; // L: 125
						} else {
							if (var1 <= (float)this.field1462[var6].field1420) { // L: 128
								var3 = var6; // L: 138
								break; // L: 139
							}

							if (var1 < (float)this.field1462[var6 + 1].field1420) { // L: 129
								var3 = var6; // L: 130
								break; // L: 131
							}

							var4 = var6 + 1; // L: 134
						}
					} while(var4 <= var5); // L: 141
				}

				if (var3 != this.field1469) { // L: 143
					this.field1469 = var3; // L: 144
					this.field1472 = true; // L: 145
				}

				return this.field1469; // L: 147
			} else {
				return -1; // L: 110
			}
		} else {
			return this.field1469;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(FI)Ldx;",
		garbageValue = "-1377164530"
	)
	class113 method2717(float var1) {
		int var2 = this.method2705(var1); // L: 151
		return var2 >= 0 && var2 < this.field1462.length ? this.field1462[var2] : null; // L: 152 153 156
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "273043499"
	)
	int method2709() {
		return this.field1462 == null ? 0 : this.field1462.length; // L: 161 162
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-1404648911"
	)
	public static void method2727(String var0, String var1, int var2, int var3) throws IOException {
		class142.idxCount = var3; // L: 40
		class93.cacheGamebuild = var2; // L: 41

		try {
			class115.operatingSystemName = System.getProperty("os.name"); // L: 43
		} catch (Exception var15) { // L: 45
			class115.operatingSystemName = "Unknown"; // L: 46
		}

		NetFileRequest.formattedOperatingSystemName = class115.operatingSystemName.toLowerCase(); // L: 48

		try {
			class123.userHomeDirectory = System.getProperty("user.home"); // L: 50
			if (class123.userHomeDirectory != null) { // L: 51
				class123.userHomeDirectory = class123.userHomeDirectory + "/";
			}
		} catch (Exception var14) { // L: 53
		}

		try {
			if (NetFileRequest.formattedOperatingSystemName.startsWith("win")) { // L: 55
				if (class123.userHomeDirectory == null) { // L: 56
					class123.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class123.userHomeDirectory == null) { // L: 59
				class123.userHomeDirectory = System.getenv("HOME");
			}

			if (class123.userHomeDirectory != null) { // L: 61
				class123.userHomeDirectory = class123.userHomeDirectory + "/";
			}
		} catch (Exception var13) { // L: 63
		}

		if (class123.userHomeDirectory == null) { // L: 64
			class123.userHomeDirectory = "~/";
		}

		Fonts.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class123.userHomeDirectory, "/tmp/", ""}; // L: 65
		JagexCache.cacheSubPaths = new String[]{".jagex_cache_" + class93.cacheGamebuild, ".file_store_" + class93.cacheGamebuild}; // L: 66
		int var9 = 0;

		label129:
		while (var9 < 4) {
			JagexCache.cacheDir = Friend.method6630(var0, var1, var9); // L: 68
			if (!JagexCache.cacheDir.exists()) { // L: 69
				JagexCache.cacheDir.mkdirs();
			}

			File[] var5 = JagexCache.cacheDir.listFiles(); // L: 70
			if (var5 == null) { // L: 71
				break;
			}

			File[] var6 = var5; // L: 73
			int var7 = 0;

			while (true) {
				if (var7 >= var6.length) {
					break label129;
				}

				File var8 = var6[var7]; // L: 75
				if (!Varcs.method2474(var8, false)) { // L: 77
					++var9; // L: 67
					break;
				}

				++var7; // L: 74
			}
		}

		MilliClock.method3309(JagexCache.cacheDir); // L: 84

		try {
			File var4 = new File(class123.userHomeDirectory, "random.dat"); // L: 87
			int var11;
			if (var4.exists()) { // L: 88
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var4, "rw", 25L), 24, 0); // L: 89
			} else {
				label111:
				for (int var10 = 0; var10 < JagexCache.cacheSubPaths.length; ++var10) { // L: 92
					for (var11 = 0; var11 < Fonts.cacheParentPaths.length; ++var11) { // L: 93
						File var12 = new File(Fonts.cacheParentPaths[var11] + JagexCache.cacheSubPaths[var10] + File.separatorChar + "random.dat"); // L: 94
						if (var12.exists()) { // L: 95
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var12, "rw", 25L), 24, 0); // L: 96
							break label111; // L: 97
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 102
				RandomAccessFile var17 = new RandomAccessFile(var4, "rw"); // L: 103
				var11 = var17.read(); // L: 104
				var17.seek(0L); // L: 105
				var17.write(var11); // L: 106
				var17.seek(0L); // L: 107
				var17.close(); // L: 108
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var4, "rw", 25L), 24, 0); // L: 109
			}
		} catch (IOException var16) { // L: 112
		}

		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(GameEngine.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 114
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(GameEngine.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 115
		class359.JagexCache_idxFiles = new BufferedFile[class142.idxCount]; // L: 116

		for (var9 = 0; var9 < class142.idxCount; ++var9) { // L: 117
			class359.JagexCache_idxFiles[var9] = new BufferedFile(new AccessFile(GameEngine.getFile("main_file_cache.idx" + var9), "rw", 1048576L), 6000, 0); // L: 118
		}

	} // L: 120

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-625330098"
	)
	static int method2719() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1644
			int var0 = 0; // L: 1645

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1646
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1647
			}

			return var0 * 10000 / Client.field626; // L: 1649
		} else {
			return 10000;
		}
	}
}
