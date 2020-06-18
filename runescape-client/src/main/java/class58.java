import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
public class class58 {
	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		signature = "Ldt;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("cv")
	public static char field442;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1787909255"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}
}
