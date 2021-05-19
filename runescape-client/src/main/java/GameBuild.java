import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("l")
	@Export("name")
	public final String name;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1611941383
	)
	@Export("buildId")
	final int buildId;

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
