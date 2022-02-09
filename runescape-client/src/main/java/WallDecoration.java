import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("sx")
	@ObfuscatedGetter(
		intValue = 720856761
	)
	static int field2573;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -358335925
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1796933097
	)
	@Export("x")
	int x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -880294953
	)
	@Export("y")
	int y;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -391690211
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1324715917
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1407951853
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -341931283
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = -6056572782553024927L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -179542679
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Lkq;B)V",
		garbageValue = "45"
	)
	public static void method4296(AbstractArchive var0, AbstractArchive var1) {
		NPCComposition.NpcDefinition_archive = var0; // L: 57
		NPCComposition.NpcDefinition_modelArchive = var1; // L: 58
	} // L: 59
}
