import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("to")
	@ObfuscatedGetter(
		intValue = 688457543
	)
	static int field3588;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("j")
	@Export("name")
	public final String name;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 413873867
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
		this.name = var1; // L: 17
		this.buildId = var2; // L: 18
	} // L: 19
}
