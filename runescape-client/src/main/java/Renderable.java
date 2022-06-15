import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 1004163911
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000; // L: 6
	} // L: 8

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lhy;",
		garbageValue = "1081110576"
	)
	@Export("getModel")
	protected Model getModel() {
		return null; // L: 19
	}

	@ObfuscatedName("cv")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel(); // L: 11
		if (var11 != null) { // L: 12
			this.height = var11.height; // L: 13
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9); // L: 14
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llh;I)V",
		garbageValue = "730571688"
	)
	public static void method4342(AbstractArchive var0) {
	} // L: 16

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZI)I",
		garbageValue = "1526978313"
	)
	static int method4339(int var0, Script var1, boolean var2) {
		if (var0 == 7400) { // L: 4680
			--class446.Interpreter_intStackSize; // L: 4681
			--Interpreter.Interpreter_stringStackSize; // L: 4682
			return 1; // L: 4683
		} else if (var0 == 7401) { // L: 4685
			--class446.Interpreter_intStackSize; // L: 4686
			--Interpreter.Interpreter_stringStackSize; // L: 4687
			return 1; // L: 4688
		} else if (var0 == 7402) { // L: 4690
			class446.Interpreter_intStackSize -= 2; // L: 4691
			--Interpreter.Interpreter_stringStackSize; // L: 4692
			return 1; // L: 4693
		} else if (var0 == 7403) { // L: 4695
			class446.Interpreter_intStackSize -= 2; // L: 4696
			--Interpreter.Interpreter_stringStackSize; // L: 4697
			return 1; // L: 4698
		} else if (var0 == 7404) { // L: 4700
			--class446.Interpreter_intStackSize; // L: 4701
			--Interpreter.Interpreter_stringStackSize; // L: 4702
			return 1; // L: 4703
		} else if (var0 == 7405) { // L: 4705
			class446.Interpreter_intStackSize -= 2; // L: 4706
			return 1; // L: 4707
		} else if (var0 == 7406) { // L: 4709
			--class446.Interpreter_intStackSize; // L: 4710
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4711
			return 1; // L: 4712
		} else if (var0 == 7407) { // L: 4714
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4715
			return 1; // L: 4716
		} else if (var0 == 7408) { // L: 4718
			class446.Interpreter_intStackSize -= 2; // L: 4719
			--Interpreter.Interpreter_stringStackSize; // L: 4720
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4721
			return 1; // L: 4722
		} else if (var0 == 7409) { // L: 4724
			--class446.Interpreter_intStackSize; // L: 4725
			return 1; // L: 4726
		} else {
			return 2; // L: 4728
		}
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "51"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (class238.pcmPlayer1 != null) { // L: 3628
			class238.pcmPlayer1.run();
		}

		if (AttackOption.pcmPlayer0 != null) { // L: 3629
			AttackOption.pcmPlayer0.run();
		}

	} // L: 3630
}
