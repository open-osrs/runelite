import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
public class class446 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	public static final class446 field4751;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	public static final class446 field4750;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	static final class446 field4753;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	static final class446 field4752;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	static final class446 field4758;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	static final class446 field4754;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 273043499
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1684945137
	)
	final int field4749;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1783922233
	)
	final int field4756;

	static {
		field4751 = new class446(1, 0); // L: 8
		field4750 = new class446(3, 2); // L: 9
		field4753 = new class446(4, 5); // L: 10
		field4752 = new class446(0, 6); // L: 11
		field4758 = new class446(2, 7); // L: 12
		field4754 = new class446(5, 8); // L: 13
	}

	class446(int var1, int var2) {
		this.field4749 = var1; // L: 18
		this.field4756 = var2; // L: 19
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4756; // L: 24
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "612370997"
	)
	public boolean method8008() {
		return this == field4750; // L: 28
	}
}
