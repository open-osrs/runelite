import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("u")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 858309139
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -297032293
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("b")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 183406227
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -769091361
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1068550667
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 539781723
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1744203063
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1545602265
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 658215089
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	FloorOverlayDefinition() {
		this.primaryRgb = 0; // L: 12
		this.texture = -1; // L: 13
		this.hideUnderlay = true; // L: 14
		this.secondaryRgb = -1; // L: 15
	} // L: 23

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1367888420"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != -1) { // L: 37
			this.setHsl(this.secondaryRgb); // L: 38
			this.secondaryHue = this.hue; // L: 39
			this.secondarySaturation = this.saturation;
			this.secondaryLightness = this.lightness;
		}

		this.setHsl(this.primaryRgb);
	} // L: 44

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "1515870395"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) { // L: 49
				return; // L: 52
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lpi;III)V",
		garbageValue = "-343485551"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) { // L: 57
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium(); // L: 58
		} else if (var2 == 8) {
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1828314979"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D;
		double var4 = (double)(var1 >> 8 & 255) / 256.0D;
		double var6 = (double)(var1 & 255) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) { // L: 72
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var8 + var10) / 2.0D;
		if (var8 != var10) { // L: 76
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 78
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 79
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 80
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D; // L: 81
			}
		}

		var12 /= 6.0D; // L: 83
		this.hue = (int)(var12 * 256.0D);
		this.saturation = (int)(256.0D * var14); // L: 85
		this.lightness = (int)(256.0D * var16); // L: 86
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 90
			this.lightness = 255;
		}

	} // L: 91

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "55"
	)
	public static void method3788(String var0, String var1, int var2, int var3) throws IOException {
		JagexCache.idxCount = var3; // L: 40
		WorldMapSection1.cacheGamebuild = var2; // L: 41

		try {
			class10.operatingSystemName = System.getProperty("os.name"); // L: 43
		} catch (Exception var15) { // L: 45
			class10.operatingSystemName = "Unknown"; // L: 46
		}

		class128.formattedOperatingSystemName = class10.operatingSystemName.toLowerCase(); // L: 48

		try {
			NetSocket.userHomeDirectory = System.getProperty("user.home"); // L: 50
			if (NetSocket.userHomeDirectory != null) { // L: 51
				NetSocket.userHomeDirectory = NetSocket.userHomeDirectory + "/";
			}
		} catch (Exception var14) { // L: 53
		}

		try {
			if (class128.formattedOperatingSystemName.startsWith("win")) { // L: 55
				if (NetSocket.userHomeDirectory == null) { // L: 56
					NetSocket.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (NetSocket.userHomeDirectory == null) { // L: 59
				NetSocket.userHomeDirectory = System.getenv("HOME");
			}

			if (NetSocket.userHomeDirectory != null) { // L: 61
				NetSocket.userHomeDirectory = NetSocket.userHomeDirectory + "/";
			}
		} catch (Exception var13) { // L: 63
		}

		if (NetSocket.userHomeDirectory == null) { // L: 64
			NetSocket.userHomeDirectory = "~/";
		}

		ItemContainer.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", NetSocket.userHomeDirectory, "/tmp/", ""}; // L: 65
		class216.cacheSubPaths = new String[]{".jagex_cache_" + WorldMapSection1.cacheGamebuild, ".file_store_" + WorldMapSection1.cacheGamebuild}; // L: 66
		int var9 = 0;

		label128:
		while (var9 < 4) {
			JagexCache.cacheDir = WorldMapArea.method4036(var0, var1, var9); // L: 68
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
					break label128;
				}

				File var8 = var6[var7]; // L: 75
				if (!AbstractWorldMapIcon.method4405(var8, false)) { // L: 77
					++var9; // L: 67
					break;
				}

				++var7; // L: 74
			}
		}

		class128.method2856(JagexCache.cacheDir); // L: 84

		try {
			File var4 = new File(NetSocket.userHomeDirectory, "random.dat"); // L: 87
			int var11;
			if (var4.exists()) { // L: 88
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var4, "rw", 25L), 24, 0); // L: 89
			} else {
				label110:
				for (int var10 = 0; var10 < class216.cacheSubPaths.length; ++var10) { // L: 92
					for (var11 = 0; var11 < ItemContainer.cacheParentPaths.length; ++var11) { // L: 93
						File var12 = new File(ItemContainer.cacheParentPaths[var11] + class216.cacheSubPaths[var10] + File.separatorChar + "random.dat"); // L: 94
						if (var12.exists()) { // L: 95
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var12, "rw", 25L), 24, 0); // L: 96
							break label110; // L: 97
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

		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(Message.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 114
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(Message.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 115
		class115.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount]; // L: 116

		for (var9 = 0; var9 < JagexCache.idxCount; ++var9) { // L: 117
			class115.JagexCache_idxFiles[var9] = new BufferedFile(new AccessFile(Message.getFile("main_file_cache.idx" + var9), "rw", 1048576L), 6000, 0); // L: 118
		}

	} // L: 120
}
