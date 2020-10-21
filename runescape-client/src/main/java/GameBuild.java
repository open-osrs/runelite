import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("LIVE")
	public static final GameBuild LIVE;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("BUILDLIVE")
	public static final GameBuild BUILDLIVE;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("RC")
	public static final GameBuild RC;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("WIP")
	public static final GameBuild WIP;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("Widget_modelsArchive")
	static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;
	@ObfuscatedName("z")
	@Export("name")
	public final String name;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1749368073
	)
	@Export("buildId")
	public final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0); // L: 5
		BUILDLIVE = new GameBuild("BUILDLIVE", 3); // L: 6
		RC = new GameBuild("RC", 1); // L: 7
		WIP = new GameBuild("WIP", 2); // L: 8
	}

	GameBuild(String var1, int var2) {
		this.name = var1; // L: 13
		this.buildId = var2; // L: 14
	} // L: 15
}
