import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
public class class15 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lag;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("archive18")
	static Archive archive18;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-728287916"
	)
	static boolean method162(int var0, int var1) {
		return var0 != 4 || var1 < 8;
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-27783"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}
}
