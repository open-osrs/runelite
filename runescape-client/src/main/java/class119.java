import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class119 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1508;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1512;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1502;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1516;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1518;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1521;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1506;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1507;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1500;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1509;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1510;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1511;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1503;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1513;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1514;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1515;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class119 field1504;
	@ObfuscatedName("ac")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1636917821
	)
	final int field1517;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1474083167
	)
	final int field1505;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1038102121
	)
	final int field1519;

	static {
		field1508 = new class119(0, 0, (String)null, -1, -1); // L: 52
		field1512 = new class119(1, 1, (String)null, 0, 2); // L: 53
		field1502 = new class119(2, 2, (String)null, 1, 2); // L: 54
		field1516 = new class119(3, 3, (String)null, 2, 2); // L: 55
		field1518 = new class119(4, 4, (String)null, 3, 1); // L: 56
		field1521 = new class119(5, 5, (String)null, 4, 1); // L: 57
		field1506 = new class119(6, 6, (String)null, 5, 1); // L: 58
		field1507 = new class119(7, 7, (String)null, 6, 3);
		field1500 = new class119(8, 8, (String)null, 7, 3); // L: 60
		field1509 = new class119(9, 9, (String)null, 8, 3);
		field1510 = new class119(10, 10, (String)null, 0, 7);
		field1511 = new class119(11, 11, (String)null, 1, 7);
		field1503 = new class119(12, 12, (String)null, 2, 7);
		field1513 = new class119(13, 13, (String)null, 3, 7);
		field1514 = new class119(14, 14, (String)null, 4, 7);
		field1515 = new class119(15, 15, (String)null, 5, 7);
		field1504 = new class119(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class119(int var1, int var2, String var3, int var4, int var5) {
		this.field1517 = var1;
		this.field1505 = var2; // L: 79
		this.field1519 = var4; // L: 80
	} // L: 81

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1505; // L: 84
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int method2738() {
		return this.field1519; // L: 88
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BB)Ljava/lang/String;",
		garbageValue = "-27"
	)
	public static String method2745(byte[] var0) {
		int var2 = var0.length; // L: 59
		StringBuilder var3 = new StringBuilder(); // L: 61

		for (int var4 = 0; var4 < var2 + 0; var4 += 3) { // L: 62
			int var5 = var0[var4] & 255; // L: 63
			var3.append(class342.field4158[var5 >>> 2]); // L: 64
			if (var4 < var2 - 1) { // L: 65
				int var6 = var0[var4 + 1] & 255; // L: 66
				var3.append(class342.field4158[(var5 & 3) << 4 | var6 >>> 4]); // L: 67
				if (var4 < var2 - 2) { // L: 68
					int var7 = var0[var4 + 2] & 255; // L: 69
					var3.append(class342.field4158[(var6 & 15) << 2 | var7 >>> 6]).append(class342.field4158[var7 & 63]); // L: 70
				} else {
					var3.append(class342.field4158[(var6 & 15) << 2]).append("="); // L: 72
				}
			} else {
				var3.append(class342.field4158[(var5 & 3) << 4]).append("=="); // L: 74
			}
		}

		String var1 = var3.toString(); // L: 76
		return var1; // L: 78
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-197494883"
	)
	static void method2739(int var0, int var1) {
		int var2 = ChatChannel.fontBold12.stringWidth("Choose Option"); // L: 8871

		int var3;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) { // L: 8872
			Font var7 = ChatChannel.fontBold12; // L: 8873
			String var8;
			if (var3 < 0) { // L: 8876
				var8 = ""; // L: 8877
			} else if (Client.menuTargets[var3].length() > 0) { // L: 8880
				var8 = Client.menuActions[var3] + " " + Client.menuTargets[var3];
			} else {
				var8 = Client.menuActions[var3]; // L: 8881
			}

			int var6 = var7.stringWidth(var8); // L: 8883
			if (var6 > var2) { // L: 8884
				var2 = var6;
			}
		}

		var2 += 8; // L: 8886
		var3 = Client.menuOptionsCount * 15 + 22; // L: 8887
		int var4 = var0 - var2 / 2; // L: 8888
		if (var2 + var4 > GraphicsObject.canvasWidth) { // L: 8889
			var4 = GraphicsObject.canvasWidth - var2;
		}

		if (var4 < 0) { // L: 8890
			var4 = 0;
		}

		int var5 = var1; // L: 8891
		if (var1 + var3 > class433.canvasHeight) { // L: 8892
			var5 = class433.canvasHeight - var3;
		}

		if (var5 < 0) { // L: 8893
			var5 = 0;
		}

		BuddyRankComparator.menuX = var4; // L: 8894
		FontName.menuY = var5; // L: 8895
		KeyHandler.menuWidth = var2; // L: 8896
		class7.menuHeight = Client.menuOptionsCount * 15 + 22; // L: 8897
	} // L: 8898

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-58"
	)
	static void method2737() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11925
			int var1 = var0.group; // L: 11926
			if (WorldMapDecoration.loadInterface(var1)) { // L: 11927
				boolean var2 = true; // L: 11928
				Widget[] var3 = NetSocket.Widget_interfaceComponents[var1]; // L: 11929

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 11930
					if (var3[var4] != null) { // L: 11931
						var2 = var3[var4].isIf3; // L: 11932
						break;
					}
				}

				if (!var2) { // L: 11936
					var4 = (int)var0.key; // L: 11937
					Widget var5 = class92.getWidget(var4); // L: 11938
					if (var5 != null) { // L: 11939
						GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 11943
}
