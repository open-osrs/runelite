import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public class class19 {
	@ObfuscatedName("v")
	Future field102;
	@ObfuscatedName("c")
	String field100;

	class19(Future var1) {
		this.field102 = var1; // L: 10
	} // L: 11

	class19(String var1) {
		this.method270(var1); // L: 14
	} // L: 15

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1907371435"
	)
	void method270(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field100 = var1; // L: 19
		if (this.field102 != null) { // L: 20
			this.field102.cancel(true); // L: 21
			this.field102 = null; // L: 22
		}

	} // L: 24

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "11"
	)
	public final String method271() {
		return this.field100; // L: 27
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2045655469"
	)
	public boolean method283() {
		return this.field100 != null || this.field102 == null; // L: 31
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "126"
	)
	public final boolean method268() {
		return this.method283() ? true : this.field102.isDone(); // L: 35 36
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Ly;",
		garbageValue = "1665321496"
	)
	public final class21 method274() {
		if (this.method283()) { // L: 40
			return new class21(this.field100);
		} else if (!this.method268()) {
			return null; // L: 41
		} else {
			try {
				return (class21)this.field102.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method270(var2); // L: 48
				return new class21(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lgf;",
		garbageValue = "-1420060608"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0); // L: 92
		if (var1 != null) { // L: 93
			return var1;
		} else {
			byte[] var2 = SoundCache.ItemDefinition_archive.takeFile(10, var0); // L: 94
			var1 = new ItemComposition(); // L: 95
			var1.id = var0; // L: 96
			if (var2 != null) { // L: 97
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 98
			if (var1.noteTemplate != -1) { // L: 99
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 100
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 101
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!DevicePcmPlayerProvider.ItemDefinition_inMembersWorld && var1.isMembersOnly) { // L: 102
				var1.name = "Members object"; // L: 103
				var1.isTradable = false; // L: 104

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) { // L: 105
					var1.groundActions[var3] = null; // L: 106
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) { // L: 108
					if (var3 != 4) { // L: 109
						var1.inventoryActions[var3] = null; // L: 110
					}
				}

				var1.shiftClickIndex = -2; // L: 113
				var1.team = 0; // L: 114
				if (var1.params != null) { // L: 115
					boolean var6 = false; // L: 116

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 117
						ParamComposition var5 = class151.getParamDefinition((int)var4.key); // L: 118
						if (var5.autoDisable) { // L: 119
							var4.remove();
						} else {
							var6 = true; // L: 120
						}
					}

					if (!var6) {
						var1.params = null; // L: 122
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0); // L: 125
			return var1; // L: 126
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "1009415810"
	)
	public static int method288(CharSequence var0) {
		return class263.method5178(var0, 10, true); // L: 67
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "-169885826"
	)
	static int method286(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) { // L: 4639
			Interpreter.Interpreter_intStackSize -= 5; // L: 4640
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4641
			return 1; // L: 4642
		} else if (var0 == 7204) { // L: 4644
			Interpreter.Interpreter_intStackSize -= 6; // L: 4645
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4646
			return 1; // L: 4647
		} else if (var0 >= 7205 && var0 < 7209) { // L: 4649
			Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4650
			return 1; // L: 4651
		} else if (var0 == 7209) { // L: 4653
			Interpreter.Interpreter_intStackSize -= 2; // L: 4654
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4655
			return 1; // L: 4656
		} else if (var0 >= 7210 && var0 < 7214) { // L: 4658
			--Interpreter.Interpreter_intStackSize; // L: 4659
			return 1; // L: 4660
		} else if (var0 == 7214) { // L: 4662
			Interpreter.Interpreter_intStackSize -= 2; // L: 4663
			return 1; // L: 4664
		} else {
			return 2; // L: 4666
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-53"
	)
	static final void method287() {
		if (SoundSystem.field309) { // L: 3629
			for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 3631
				Player var1 = Client.players[Players.Players_indices[var0]]; // L: 3632
				var1.method2121(); // L: 3633
			}

			SoundSystem.field309 = false; // L: 3636
		}

	} // L: 3638
}
