import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("dk")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("b")
	@Export("name")
	public final String name;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -21967843
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
		this.name = var1; // L: 17
		this.buildId = var2; // L: 18
	} // L: 19

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-733827758"
	)
	static final int method5773() {
		return Client.menuOptionsCount - 1; // L: 9844
	}
}
