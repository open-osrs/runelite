import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "Lgm;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("t")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "679149457"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1];
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljo;",
		garbageValue = "170681777"
	)
	public static class270[] method3649() {
		return new class270[]{class270.field3536, class270.field3533, class270.field3530, class270.field3531};
	}
}
