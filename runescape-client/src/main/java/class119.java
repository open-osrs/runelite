import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public class class119 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1497;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1504;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1505;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1501;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1492;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1493;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1494;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1495;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1496;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1489;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1498;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1499;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1500;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1502;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1488;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1503;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1491;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1597541925
	)
	final int field1490;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -954105411
	)
	final int field1506;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1728542525
	)
	final int field1507;

	static {
		field1497 = new class119(0, 0, (String)null, -1, -1); // L: 52
		field1504 = new class119(1, 1, (String)null, 0, 2); // L: 53
		field1505 = new class119(2, 2, (String)null, 1, 2); // L: 54
		field1501 = new class119(3, 3, (String)null, 2, 2); // L: 55
		field1492 = new class119(4, 4, (String)null, 3, 1); // L: 56
		field1493 = new class119(5, 5, (String)null, 4, 1); // L: 57
		field1494 = new class119(6, 6, (String)null, 5, 1); // L: 58
		field1495 = new class119(7, 7, (String)null, 6, 3); // L: 59
		field1496 = new class119(8, 8, (String)null, 7, 3); // L: 60
		field1489 = new class119(9, 9, (String)null, 8, 3); // L: 61
		field1498 = new class119(10, 10, (String)null, 0, 7); // L: 62
		field1499 = new class119(11, 11, (String)null, 1, 7); // L: 63
		field1500 = new class119(12, 12, (String)null, 2, 7); // L: 64
		field1502 = new class119(13, 13, (String)null, 3, 7); // L: 65
		field1488 = new class119(14, 14, (String)null, 4, 7); // L: 66
		field1503 = new class119(15, 15, (String)null, 5, 7); // L: 67
		field1491 = new class119(16, 16, (String)null, 0, 5); // L: 68
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class119(int var1, int var2, String var3, int var4, int var5) {
		this.field1490 = var1; // L: 78
		this.field1506 = var2; // L: 79
		this.field1507 = var4; // L: 80
	} // L: 81

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1506; // L: 84
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	int method2747() {
		return this.field1507; // L: 88
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1713795762"
	)
	static int method2757(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) { // L: 1153
			if (var1 <= var0 + 30) { // L: 1154
				return var2; // L: 1155
			}

			var0 += 30; // L: 1157
			var0 += var2 != 1 && var2 != 3 ? 5 : 20; // L: 1158
		}

		return 0; // L: 1160
	}
}
