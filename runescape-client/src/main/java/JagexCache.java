import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 8604224012951228081L
	)
	public static long field2081;
	@ObfuscatedName("z")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	@Export("JagexCache_randomDat")
	static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lmz;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2128303847"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63; // L: 13
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-50"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 59
		if (var0 < 0 || var0 >= 65536) { // L: 60
			var0 >>>= 16; // L: 61
			var1 += 16; // L: 62
		}

		if (var0 >= 256) { // L: 64
			var0 >>>= 8; // L: 65
			var1 += 8; // L: 66
		}

		if (var0 >= 16) { // L: 68
			var0 >>>= 4; // L: 69
			var1 += 4; // L: 70
		}

		if (var0 >= 4) { // L: 72
			var0 >>>= 2; // L: 73
			var1 += 2; // L: 74
		}

		if (var0 >= 1) { // L: 76
			var0 >>>= 1; // L: 77
			++var1; // L: 78
		}

		return var0 + var1; // L: 80
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(Lbz;B)V",
		garbageValue = "101"
	)
	static final void method3619(PendingSpawn var0) {
		long var1 = 0L; // L: 7170
		int var3 = -1; // L: 7171
		int var4 = 0; // L: 7172
		int var5 = 0; // L: 7173
		if (var0.type == 0) { // L: 7174
			var1 = ModeWhere.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 7175
			var1 = ModeWhere.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 7176
			var1 = ModeWhere.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = ModeWhere.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y); // L: 7177
		}

		if (var1 != 0L) { // L: 7178
			int var6 = ModeWhere.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 7179
			var3 = ObjectSound.Entity_unpackID(var1); // L: 7180
			var4 = var6 & 31; // L: 7181
			var5 = var6 >> 6 & 3; // L: 7182
		}

		var0.objectId = var3; // L: 7184
		var0.field959 = var4; // L: 7185
		var0.field963 = var5; // L: 7186
	} // L: 7187
}
