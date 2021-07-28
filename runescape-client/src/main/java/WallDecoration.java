import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ha")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1890656185
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -770294787
	)
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1410244903
	)
	@Export("y")
	int y;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1632791677
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 147642421
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1330395367
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1002752681
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = -2915729349709580649L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -718006153
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-231746881"
	)
	public static void method4338(String var0, String var1, int var2, int var3) throws IOException {
		DevicePcmPlayerProvider.idxCount = var3;
		AttackOption.cacheGamebuild = var2;

		try {
			ClientPreferences.operatingSystemName = System.getProperty("os.name");
		} catch (Exception var15) {
			ClientPreferences.operatingSystemName = "Unknown";
		}

		WorldMapEvent.formattedOperatingSystemName = ClientPreferences.operatingSystemName.toLowerCase();

		try {
			class234.userHomeDirectory = System.getProperty("user.home");
			if (class234.userHomeDirectory != null) {
				class234.userHomeDirectory = class234.userHomeDirectory + "/";
			}
		} catch (Exception var14) {
		}

		try {
			if (WorldMapEvent.formattedOperatingSystemName.startsWith("win")) {
				if (class234.userHomeDirectory == null) {
					class234.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class234.userHomeDirectory == null) {
				class234.userHomeDirectory = System.getenv("HOME");
			}

			if (class234.userHomeDirectory != null) {
				class234.userHomeDirectory = class234.userHomeDirectory + "/";
			}
		} catch (Exception var13) {
		}

		if (class234.userHomeDirectory == null) {
			class234.userHomeDirectory = "~/";
		}

		BuddyRankComparator.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class234.userHomeDirectory, "/tmp/", ""};
		DirectByteArrayCopier.cacheSubPaths = new String[]{".jagex_cache_" + AttackOption.cacheGamebuild, ".file_store_" + AttackOption.cacheGamebuild};
		int var9 = 0;

		label127:
		while (var9 < 4) {
			JagexCache.cacheDir = Canvas.method125(var0, var1, var9);
			if (!JagexCache.cacheDir.exists()) {
				JagexCache.cacheDir.mkdirs();
			}

			File[] var5 = JagexCache.cacheDir.listFiles();
			if (var5 == null) {
				break;
			}

			File[] var6 = var5;
			int var7 = 0;

			while (true) {
				if (var7 >= var6.length) {
					break label127;
				}

				File var8 = var6[var7];
				if (!GraphicsObject.method1645(var8, false)) {
					++var9;
					break;
				}

				++var7;
			}
		}

		ServerPacket.method4427(JagexCache.cacheDir);

		try {
			File var4 = new File(class234.userHomeDirectory, "random.dat");
			int var11;
			if (var4.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var4, "rw", 25L), 24, 0);
			} else {
				label109:
				for (int var10 = 0; var10 < DirectByteArrayCopier.cacheSubPaths.length; ++var10) {
					for (var11 = 0; var11 < BuddyRankComparator.cacheParentPaths.length; ++var11) {
						File var12 = new File(BuddyRankComparator.cacheParentPaths[var11] + DirectByteArrayCopier.cacheSubPaths[var10] + File.separatorChar + "random.dat");
						if (var12.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var12, "rw", 25L), 24, 0);
							break label109;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var17 = new RandomAccessFile(var4, "rw");
				var11 = var17.read();
				var17.seek(0L);
				var17.write(var11);
				var17.seek(0L);
				var17.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var4, "rw", 25L), 24, 0);
			}
		} catch (IOException var16) {
		}

		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(SecureRandomCallable.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(SecureRandomCallable.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		FriendsChat.JagexCache_idxFiles = new BufferedFile[DevicePcmPlayerProvider.idxCount];

		for (var9 = 0; var9 < DevicePcmPlayerProvider.idxCount; ++var9) {
			FriendsChat.JagexCache_idxFiles[var9] = new BufferedFile(new AccessFile(SecureRandomCallable.getFile("main_file_cache.idx" + var9), "rw", 1048576L), 6000, 0);
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1427059121"
	)
	static int method4340(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1575511000"
	)
	public static boolean method4339(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var1 = class303.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "-1382122671"
	)
	static int method4337(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? GrandExchangeOffer.scriptDotWidget : Interpreter.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class103.Widget_unpackTargetMask(MusicPatchNode.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}
}
