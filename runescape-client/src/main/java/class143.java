import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public class class143 extends class128 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -5266391678876425789L
	)
	long field1627;
	@ObfuscatedName("c")
	String field1626;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 386086251
	)
	int field1625;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Les;)V"
	)
	class143(class131 var1) {
		this.this$0 = var1;
		this.field1627 = -1L; // L: 93
		this.field1626 = null; // L: 94
		this.field1625 = 0; // L: 95
	} // L: 97

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-413979452"
	)
	void vmethod3168(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 100
			--var1.offset; // L: 101
			this.field1627 = var1.readLong(); // L: 102
		}

		this.field1626 = var1.readStringCp1252NullTerminatedOrNull(); // L: 104
		this.field1625 = var1.readUnsignedShort(); // L: 105
	} // L: 106

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lex;S)V",
		garbageValue = "-10316"
	)
	void vmethod3162(ClanSettings var1) {
		var1.method2959(this.field1627, this.field1626, this.field1625); // L: 109
	} // L: 110

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "34"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 60
		if (var0 < 0 || var0 >= 65536) { // L: 61
			var0 >>>= 16; // L: 62
			var1 += 16; // L: 63
		}

		if (var0 >= 256) { // L: 65
			var0 >>>= 8; // L: 66
			var1 += 8; // L: 67
		}

		if (var0 >= 16) { // L: 69
			var0 >>>= 4; // L: 70
			var1 += 4; // L: 71
		}

		if (var0 >= 4) { // L: 73
			var0 >>>= 2; // L: 74
			var1 += 2; // L: 75
		}

		if (var0 >= 1) { // L: 77
			var0 >>>= 1; // L: 78
			++var1; // L: 79
		}

		return var0 + var1; // L: 81
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "345981332"
	)
	static void method3072() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11881
			int var1 = var0.group; // L: 11882
			if (class155.loadInterface(var1)) { // L: 11883
				boolean var2 = true; // L: 11884
				Widget[] var3 = Widget.Widget_interfaceComponents[var1]; // L: 11885

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 11886
					if (var3[var4] != null) { // L: 11887
						var2 = var3[var4].isIf3; // L: 11888
						break;
					}
				}

				if (!var2) { // L: 11892
					var4 = (int)var0.key; // L: 11893
					Widget var5 = class127.getWidget(var4); // L: 11894
					if (var5 != null) { // L: 11895
						class346.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 11899
}
