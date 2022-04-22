import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
public class class145 {
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -8660248817658951919L
	)
	long field1633;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 945677273558696457L
	)
	long field1635;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	IterableNodeDeque field1632;

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	public class145(Buffer var1) {
		this.field1635 = -1L; // L: 10
		this.field1632 = new IterableNodeDeque(); // L: 11
		this.method3084(var1); // L: 19
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1488842408"
	)
	void method3084(Buffer var1) {
		this.field1633 = var1.readLong(); // L: 23
		this.field1635 = var1.readLong(); // L: 24

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 25 26 36
			Object var3;
			if (var2 == 1) { // L: 28
				var3 = new class140(this);
			} else if (var2 == 4) {
				var3 = new class151(this); // L: 29
			} else if (var2 == 3) { // L: 30
				var3 = new class136(this);
			} else if (var2 == 2) { // L: 31
				var3 = new class134(this);
			} else {
				if (var2 != 5) { // L: 32
					throw new RuntimeException(""); // L: 33
				}

				var3 = new class141(this);
			}

			((class144)var3).vmethod3152(var1); // L: 34
			this.field1632.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "1969966641"
	)
	public void method3086(ClanChannel var1) {
		if (var1.key == this.field1633 && var1.field1656 == this.field1635) { // L: 41
			for (class144 var2 = (class144)this.field1632.last(); var2 != null; var2 = (class144)this.field1632.previous()) { // L: 42
				var2.vmethod3153(var1); // L: 43
			}

			++var1.field1656; // L: 45
		} else {
			throw new RuntimeException("");
		}
	} // L: 46

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIZI)Ljava/lang/String;",
		garbageValue = "803323107"
	)
	static String method3085(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 110
			if (var2 && var0 >= 0) { // L: 111
				int var3 = 2; // L: 112

				for (int var4 = var0 / var1; var4 != 0; ++var3) { // L: 113 114 116
					var4 /= var1; // L: 115
				}

				char[] var5 = new char[var3]; // L: 118
				var5[0] = '+'; // L: 119

				for (int var6 = var3 - 1; var6 > 0; --var6) { // L: 120
					int var7 = var0; // L: 121
					var0 /= var1; // L: 122
					int var8 = var7 - var0 * var1; // L: 123
					if (var8 >= 10) { // L: 124
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48); // L: 125
					}
				}

				return new String(var5); // L: 127
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-62"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 4722
			if (class155.loadInterface(var0)) { // L: 4723
				Widget[] var1 = Widget.Widget_interfaceComponents[var0]; // L: 4724

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 4725
					Widget var3 = var1[var2]; // L: 4726
					if (var3.onLoad != null) { // L: 4727
						ScriptEvent var4 = new ScriptEvent(); // L: 4728
						var4.widget = var3; // L: 4729
						var4.args = var3.onLoad; // L: 4730
						Interpreter.runScript(var4, 5000000, 0); // L: 4731
					}
				}

			}
		}
	} // L: 4734
}
