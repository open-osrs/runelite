import java.applet.Applet;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class class29 {
	@ObfuscatedName("v")
	public static Applet field168;
	@ObfuscatedName("o")
	public static String field169;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "[Lqx;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		longValue = -3391706969016340745L
	)
	static long field165;

	static {
		field168 = null; // L: 10
		field169 = ""; // L: 11
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BS)Lql;",
		garbageValue = "-13194"
	)
	public static final SpritePixels method433(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 22
			int var2 = var1.getWidth(); // L: 23
			int var3 = var1.getHeight(); // L: 24
			int[] var4 = new int[var3 * var2]; // L: 25
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2); // L: 26
			var5.grabPixels(); // L: 27
			return new SpritePixels(var4, var2, var3); // L: 28
		} catch (IOException var7) { // L: 30
		} catch (InterruptedException var8) { // L: 31
		}

		return new SpritePixels(0, 0); // L: 32
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
		garbageValue = "717512947"
	)
	public static File method431(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2;
		AccessFile.JagexCache_locationFile = new File(class230.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null;
		String var5 = null; // L: 43
		boolean var6 = false;
		File var22;
		if (AccessFile.JagexCache_locationFile.exists()) {
			try {
				AccessFile var7 = new AccessFile(AccessFile.JagexCache_locationFile, "rw", 10000L);

				Buffer var8;
				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) { // L: 50
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset);
					if (var9 == -1) {
						throw new IOException();
					}
				}

				var8.offset = 0;
				var9 = var8.readUnsignedByte();
				if (var9 < 1 || var9 > 3) {
					throw new IOException("" + var9); // L: 57
				}

				int var10 = 0;
				if (var9 > 1) {
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) {
					var4 = var8.readStringCp1252NullCircumfixed();
					if (var10 == 1) {
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8();
					if (var10 == 1) {
						var5 = var8.readCESU8();
					}
				}

				var7.close();
			} catch (IOException var20) {
				var20.printStackTrace(); // L: 71
			}

			if (var4 != null) { // L: 73
				var22 = new File(var4);
				if (!var22.exists()) { // L: 75
					var4 = null;
				}
			}

			if (var4 != null) { // L: 79
				var22 = new File(var4, "test.dat"); // L: 80
				if (!SecureRandomCallable.method2069(var22, true)) { // L: 81
					var4 = null; // L: 82
				}
			}
		}

		if (var4 == null && var2 == 0) { // L: 86
			label125:
			for (int var15 = 0; var15 < WorldMapSection1.cacheSubPaths.length; ++var15) { // L: 87
				for (int var16 = 0; var16 < PendingSpawn.cacheParentPaths.length; ++var16) { // L: 88
					File var17 = new File(PendingSpawn.cacheParentPaths[var16] + WorldMapSection1.cacheSubPaths[var15] + File.separatorChar + var0 + File.separatorChar); // L: 89
					if (var17.exists() && SecureRandomCallable.method2069(new File(var17, "test.dat"), true)) { // L: 90 91
						var4 = var17.toString(); // L: 92
						var6 = true; // L: 93
						break label125; // L: 94
					}
				}
			}
		}

		if (var4 == null) { // L: 100
			var4 = class230.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 101
			var6 = true; // L: 102
		}

		if (var5 != null) { // L: 104
			File var21 = new File(var5); // L: 105
			var22 = new File(var4); // L: 106

			try {
				File[] var23 = var21.listFiles(); // L: 108
				File[] var18 = var23; // L: 110

				for (int var11 = 0; var11 < var18.length; ++var11) { // L: 111
					File var12 = var18[var11]; // L: 112
					File var13 = new File(var22, var12.getName()); // L: 114
					boolean var14 = var12.renameTo(var13); // L: 115
					if (!var14) { // L: 116
						throw new IOException();
					}
				}
			} catch (Exception var19) { // L: 121
				var19.printStackTrace(); // L: 122
			}

			var6 = true; // L: 124
		}

		if (var6) { // L: 126
			ViewportMouse.method4493(new File(var4), (File)null);
		}

		return new File(var4); // L: 127
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljava/lang/String;",
		garbageValue = "2046831505"
	)
	public static String method425(byte[] var0) {
		int var2 = var0.length;
		StringBuilder var3 = new StringBuilder(); // L: 61

		for (int var4 = 0; var4 < var2 + 0; var4 += 3) { // L: 62
			int var5 = var0[var4] & 255; // L: 63
			var3.append(class346.field4147[var5 >>> 2]); // L: 64
			if (var4 < var2 - 1) { // L: 65
				int var6 = var0[var4 + 1] & 255; // L: 66
				var3.append(class346.field4147[(var5 & 3) << 4 | var6 >>> 4]); // L: 67
				if (var4 < var2 - 2) { // L: 68
					int var7 = var0[var4 + 2] & 255; // L: 69
					var3.append(class346.field4147[(var6 & 15) << 2 | var7 >>> 6]).append(class346.field4147[var7 & 63]); // L: 70
				} else {
					var3.append(class346.field4147[(var6 & 15) << 2]).append("="); // L: 72
				}
			} else {
				var3.append(class346.field4147[(var5 & 3) << 4]).append("=="); // L: 74
			}
		}

		String var1 = var3.toString(); // L: 76
		return var1; // L: 78
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1353852155"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60
}
