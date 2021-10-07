import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
public class class28 {
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("hb")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-487974188"
	)
	public static int method414(String var0) {
		return var0.length() + 2;
	}
}
