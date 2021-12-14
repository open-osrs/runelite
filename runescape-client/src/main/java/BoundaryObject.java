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
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZB)Z",
		garbageValue = "15"
	)
	public static boolean method4321(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var4) {
			return false;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lbw;B)V",
		garbageValue = "2"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			UserComparator6.method2552(var0.isMembersOnly());
		}

		if (var0.properties != Client.worldProperties) {
			Archive var1 = UserComparator6.archive8;
			int var2 = var0.properties;
			if ((var2 & 536870912) != 0) {
				Login.logoSprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var2 & 1073741824) != 0) {
				Login.logoSprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else {
				Login.logoSprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}
		}

		class185.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		GameObject.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		class133.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		class129.currentPort = GameObject.worldPort;
	}
}
