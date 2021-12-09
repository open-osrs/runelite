import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1063429417
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1211283293
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 392897309
	)
	@Export("x")
	int x;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1130231369
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1078743455
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1456059729
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 7825076594130185971L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1681276427
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	} // L: 14

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZB)Z",
		garbageValue = "15"
	)
	public static boolean method4321(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw"); // L: 58
			int var3 = var2.read(); // L: 59
			var2.seek(0L); // L: 60
			var2.write(var3); // L: 61
			var2.seek(0L); // L: 62
			var2.close(); // L: 63
			if (var1) { // L: 64
				var0.delete();
			}

			return true; // L: 65
		} catch (Exception var4) { // L: 67
			return false; // L: 68
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lbw;B)V",
		garbageValue = "2"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1958
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1959
			UserComparator6.method2552(var0.isMembersOnly()); // L: 1960
		}

		if (var0.properties != Client.worldProperties) { // L: 1962
			Archive var1 = UserComparator6.archive8; // L: 1963
			int var2 = var0.properties; // L: 1964
			if ((var2 & 536870912) != 0) { // L: 1966
				Login.logoSprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 1967
			} else if ((var2 & 1073741824) != 0) { // L: 1969
				Login.logoSprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 1970
			} else {
				Login.logoSprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 1973
			}
		}

		class185.worldHost = var0.host; // L: 1977
		Client.worldId = var0.id; // L: 1978
		Client.worldProperties = var0.properties; // L: 1979
		GameObject.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 1980
		class133.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 1981
		class129.currentPort = GameObject.worldPort; // L: 1982
	} // L: 1983
}
