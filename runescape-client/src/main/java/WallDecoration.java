import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2023059781
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2111603765
	)
	@Export("x")
	int x;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1656810997
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1965519891
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 278377977
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1314236601
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1594233985
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = 6911018160892972427L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1066794937
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/security/SecureRandom;",
		garbageValue = "-121"
	)
	static SecureRandom method4340() {
		SecureRandom var0 = new SecureRandom(); // L: 39
		var0.nextInt(); // L: 40
		return var0; // L: 41
	}
}
