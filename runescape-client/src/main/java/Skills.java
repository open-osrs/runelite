import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("o")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("q")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
		Skills_experienceTable = new int[99];
		int var0 = 0;

		for (int var1 = 0; var1 < 99; ++var1) {
			int var2 = var1 + 1;
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
			var0 += var3;
			Skills_experienceTable[var1] = var0 / 4;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)[Lib;",
		garbageValue = "0"
	)
	public static StudioGame[] method4272() {
		return new StudioGame[]{StudioGame.stellardawn, StudioGame.game5, StudioGame.game3, StudioGame.runescape, StudioGame.game4, StudioGame.oldscape};
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-891910442"
	)
	public static int method4271() {
		return ++MouseHandler.MouseHandler_idleCycles - 1;
	}
}
