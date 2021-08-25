import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
public class class258 {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkk;IIB)Loc;",
		garbageValue = "15"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		return !VertexNormal.method4477(var0, var1, var2) ? null : AbstractSocket.method6108();
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "73"
	)
	static final boolean method4892() {
		return Client.isMenuOpen;
	}
}
