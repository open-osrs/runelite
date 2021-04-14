import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ll")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("o")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	} // L: 8

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "-1553050282"
	)
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) { // L: 11
			this.nextComparator = var1; // L: 12
		} else if (this.nextComparator instanceof AbstractUserComparator) { // L: 14
			((AbstractUserComparator)this.nextComparator).addComparator(var1); // L: 15
		}

	} // L: 17

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Llt;Llt;I)I",
		garbageValue = "833589834"
	)
	@Export("compareUser")
	protected final int compareUser(User var1, User var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2); // L: 20 21
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 25
	}

	@ObfuscatedName("f")
	static double method5714(double var0) {
		return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 9
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "1686681071"
	)
	static int method5710(int var0, Script var1, boolean var2) {
		Widget var3 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 1375
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1376
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class223.Widget_unpackTargetMask(DirectByteArrayCopier.getWidgetFlags(var3)); // L: 1377
			return 1; // L: 1378
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1380
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1387
				if (var3.dataText == null) { // L: 1388
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1389
				}

				return 1; // L: 1390
			} else {
				return 2; // L: 1392
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 1381
			--var4; // L: 1382
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1383
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1384
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1385
		}
	}
}
