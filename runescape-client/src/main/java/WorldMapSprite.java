import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("q")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096]; // L: 11
	} // L: 12

	WorldMapSprite(int[] var1) {
		this.tileColors = var1; // L: 15
	} // L: 16

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "28"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var1 + var2 * 64]; // L: 19
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IZII)V",
		garbageValue = "-952596159"
	)
	public static final void method4809(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) { // L: 45
			PcmPlayer.field300 = var0; // L: 46
			ArchiveDiskAction.PcmPlayer_stereo = var1; // L: 47
			class29.field172 = var2; // L: 48
		} else {
			throw new IllegalArgumentException();
		}
	} // L: 49
}
