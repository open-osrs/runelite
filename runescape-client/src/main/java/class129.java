import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
public class class129 extends class132 {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 901521841
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1147127109
	)
	int field1480;
	@ObfuscatedName("w")
	byte field1477;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1543465901
	)
	int field1475;
	@ObfuscatedName("a")
	String field1476;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class133 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class129(class133 var1) {
		this.this$0 = var1;
		this.field1480 = -1; // L: 125
	} // L: 130

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-1393452113"
	)
	void vmethod2839(Buffer var1) {
		var1.readUnsignedByte(); // L: 133
		this.field1480 = var1.readUnsignedShort(); // L: 134
		this.field1477 = var1.readByte(); // L: 135
		this.field1475 = var1.readUnsignedShort(); // L: 136
		var1.readLong(); // L: 137
		this.field1476 = var1.readStringCp1252NullTerminated(); // L: 138
		var1.readUnsignedByte(); // L: 139
	} // L: 140

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "-1714930149"
	)
	void vmethod2838(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1480); // L: 143
		var2.rank = this.field1477; // L: 144
		var2.world = this.field1475; // L: 145
		var2.username = new Username(this.field1476); // L: 146
	} // L: 147

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Z",
		garbageValue = "-28"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false; // L: 37
		boolean var3 = false; // L: 38
		int var4 = 0; // L: 39
		int var5 = var0.length(); // L: 40
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3; // L: 70
				break;
			}

			label85: {
				char var7 = var0.charAt(var6); // L: 42
				if (var6 == 0) { // L: 43
					if (var7 == '-') { // L: 44
						var2 = true; // L: 45
						break label85;
					}

					if (var7 == '+') { // L: 48
						break label85;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') { // L: 50
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') { // L: 51
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') { // L: 52
						var1 = false; // L: 54
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) { // L: 57
					var1 = false; // L: 58
					break; // L: 59
				}

				if (var2) { // L: 61
					var9 = -var9;
				}

				int var8 = var4 * 10 + var9; // L: 62
				if (var4 != var8 / 10) { // L: 63
					var1 = false; // L: 64
					break; // L: 65
				}

				var4 = var8; // L: 67
				var3 = true; // L: 68
			}

			++var6; // L: 41
		}

		return var1; // L: 72
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "1332153952"
	)
	static int method2738(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) { // L: 2489
			if (var0 == 3702) { // L: 2494
				++class14.Interpreter_intStackSize; // L: 2495
				return 1; // L: 2496
			} else {
				return 2; // L: 2498
			}
		} else {
			--class14.Interpreter_intStackSize; // L: 2490
			--class295.Interpreter_stringStackSize; // L: 2491
			return 1; // L: 2492
		}
	}
}
