import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lcs;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1954310333
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("q")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("j")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-32"
	)
	static void method1201() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) {
				class9.addPlayerToScene(Client.players[var1[var2]], true);
			}
		}

	}
}
