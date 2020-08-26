import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
public class class39 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	static final class39 field279;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	static final class39 field280;
	@ObfuscatedName("g")
	static int[][] field282;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	@Export("soundCache")
	static SoundCache soundCache;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -812273923
	)
	@Export("value")
	final int value;

	static {
		field279 = new class39(0); // L: 4
		field280 = new class39(1); // L: 5
	}

	class39(int var1) {
		this.value = var1;
	} // L: 10

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([BB)Lat;",
		garbageValue = "87"
	)
	static WorldMapSprite method613(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(MouseHandler.convertJpgToSprite(var0).pixels); // L: 19 20
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "91"
	)
	@Export("Widget_hasContinueOption")
	public static boolean Widget_hasContinueOption(int var0) {
		return (var0 & 1) != 0; // L: 9
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "488436516"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1; // L: 3862
	}
}
