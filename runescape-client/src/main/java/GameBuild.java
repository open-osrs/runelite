import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("fo")
	@ObfuscatedGetter(
		intValue = 576858763
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("hoveredItemContainer")
	static Widget hoveredItemContainer;
	@ObfuscatedName("o")
	@Export("name")
	public final String name;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1638239179
	)
	@Export("buildId")
	final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-88"
	)
	static final void method5068(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) {
			for (int var5 = var0; var5 <= var0 + var2; ++var5) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					FloorUnderlayDefinition.field1769[0][var5][var4] = 127;
					if (var0 == var5 && var5 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "685937780"
	)
	public static int method5072(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2;
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "381343872"
	)
	static final void method5073(int var0, int var1, int var2, int var3) {
		ClanSettings.method2624();
	}
}
