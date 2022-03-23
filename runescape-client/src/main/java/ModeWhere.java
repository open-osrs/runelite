import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	field4073("", 0, new class327[]{class327.field4050}),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	field4084("", 1, new class327[]{class327.field4052, class327.field4050}),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	field4074("", 2, new class327[]{class327.field4052, class327.field4051, class327.field4050}),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	field4075("", 3, new class327[]{class327.field4052}),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	field4076("", 4),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	field4077("", 5, new class327[]{class327.field4052, class327.field4050}),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	field4086("", 6, new class327[]{class327.field4050}),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	field4079("", 8, new class327[]{class327.field4052, class327.field4050}),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	field4091("", 9, new class327[]{class327.field4052, class327.field4051}),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	field4082("", 10, new class327[]{class327.field4052}),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	field4078("", 11, new class327[]{class327.field4052}),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	field4083("", 12, new class327[]{class327.field4052, class327.field4050}),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	field4072("", 13, new class327[]{class327.field4052});

	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = -1727456197
	)
	static int field4080;
	@ObfuscatedName("ao")
	protected static String field4087;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -977086665
	)
	@Export("id")
	final int id;
	@ObfuscatedName("p")
	final Set field4088;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Llb;)V"
	)
	ModeWhere(String var3, int var4, class327[] var5) {
		this.field4088 = new HashSet();
		this.id = var4; // L: 39
		class327[] var6 = var5; // L: 41

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 42
			class327 var8 = var6[var7]; // L: 43
			this.field4088.add(var8); // L: 44
		}

	} // L: 47

	ModeWhere(String var3, int var4) {
		this.field4088 = new HashSet(); // L: 32
		this.id = var4; // L: 35
	} // L: 36

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 51
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZB)I",
		garbageValue = "-17"
	)
	static int method6144(int var0, Script var1, boolean var2) {
		if (var0 == 7400) { // L: 4670
			--class295.Interpreter_intStackSize; // L: 4671
			--ChatChannel.Interpreter_stringStackSize; // L: 4672
			return 1; // L: 4673
		} else if (var0 == 7401) { // L: 4675
			--class295.Interpreter_intStackSize; // L: 4676
			--ChatChannel.Interpreter_stringStackSize; // L: 4677
			return 1; // L: 4678
		} else if (var0 == 7402) { // L: 4680
			class295.Interpreter_intStackSize -= 2; // L: 4681
			--ChatChannel.Interpreter_stringStackSize; // L: 4682
			return 1; // L: 4683
		} else if (var0 == 7403) { // L: 4685
			class295.Interpreter_intStackSize -= 2; // L: 4686
			--ChatChannel.Interpreter_stringStackSize; // L: 4687
			return 1; // L: 4688
		} else if (var0 == 7404) { // L: 4690
			--class295.Interpreter_intStackSize; // L: 4691
			--ChatChannel.Interpreter_stringStackSize; // L: 4692
			return 1; // L: 4693
		} else if (var0 == 7405) { // L: 4695
			class295.Interpreter_intStackSize -= 2; // L: 4696
			return 1; // L: 4697
		} else if (var0 == 7406) { // L: 4699
			--class295.Interpreter_intStackSize; // L: 4700
			Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 4701
			return 1; // L: 4702
		} else if (var0 == 7407) { // L: 4704
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 4705
			return 1; // L: 4706
		} else if (var0 == 7408) { // L: 4708
			class295.Interpreter_intStackSize -= 2; // L: 4709
			--ChatChannel.Interpreter_stringStackSize; // L: 4710
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 4711
			return 1; // L: 4712
		} else if (var0 == 7409) { // L: 4714
			--class295.Interpreter_intStackSize; // L: 4715
			return 1; // L: 4716
		} else {
			return 2; // L: 4718
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(Lco;I)V",
		garbageValue = "1465598297"
	)
	static final void method6145(Actor var0) {
		int var1 = Math.max(1, var0.field1179 - Client.cycle); // L: 3751
		int var2 = var0.field1145 * 64 + var0.field1175 * 128; // L: 3752
		int var3 = var0.field1145 * 64 + var0.field1177 * 128; // L: 3753
		var0.x += (var2 - var0.x) / var1; // L: 3754
		var0.y += (var3 - var0.y) / var1; // L: 3755
		var0.field1197 = 0; // L: 3756
		var0.orientation = var0.field1181; // L: 3757
	} // L: 3758
}
