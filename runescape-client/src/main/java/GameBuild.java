import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lij;"
	)
	@Export("LIVE")
	public static final GameBuild LIVE;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lij;"
	)
	@Export("BUILDLIVE")
	public static final GameBuild BUILDLIVE;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lij;"
	)
	@Export("RC")
	public static final GameBuild RC;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lij;"
	)
	@Export("WIP")
	public static final GameBuild WIP;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("p")
	@Export("name")
	public final String name;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1136221783
	)
	@Export("buildId")
	public final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)[Lgl;",
		garbageValue = "-290108173"
	)
	public static class194[] method4291() {
		return new class194[]{class194.field2357, class194.field2354, class194.field2355, class194.field2358, class194.field2353, class194.field2360, class194.field2359, class194.field2363, class194.field2361, class194.field2362};
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;B)Ljava/io/File;",
		garbageValue = "-93"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) {
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0);
				RandomAccessFile var3 = null;

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						FileSystem.FileSystem_cacheFiles.put(var0, var2);
						return var2;
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}
}
