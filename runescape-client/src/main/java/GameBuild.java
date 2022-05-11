import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("a")
	@Export("name")
	public final String name;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1924800269
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

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "206667436"
	)
	static final int method5586() {
		float var0 = 200.0F * ((float)class12.clientPreferences.method2225() - 0.5F); // L: 12049
		return 100 - Math.round(var0); // L: 12050
	}
}
