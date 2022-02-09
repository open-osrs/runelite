import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public class class117 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class117 field1457;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class117 field1445;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class117 field1444;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class117 field1446;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class117 field1448;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class117 field1449;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class117 field1450;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class117 field1452;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class117 field1447;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class117 field1453;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class117 field1454;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class117 field1455;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class117 field1456;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class117 field1462;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class117 field1458;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class117 field1451;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class117 field1460;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 866393745
	)
	final int field1461;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -2113404017
	)
	final int field1459;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -650243081
	)
	final int field1463;

	static {
		field1457 = new class117(0, 0, (String)null, -1, -1);
		field1445 = new class117(1, 1, (String)null, 0, 2);
		field1444 = new class117(2, 2, (String)null, 1, 2); // L: 54
		field1446 = new class117(3, 3, (String)null, 2, 2);
		field1448 = new class117(4, 4, (String)null, 3, 1); // L: 56
		field1449 = new class117(5, 5, (String)null, 4, 1); // L: 57
		field1450 = new class117(6, 6, (String)null, 5, 1);
		field1452 = new class117(7, 7, (String)null, 6, 3);
		field1447 = new class117(8, 8, (String)null, 7, 3);
		field1453 = new class117(9, 9, (String)null, 8, 3); // L: 61
		field1454 = new class117(10, 10, (String)null, 0, 7);
		field1455 = new class117(11, 11, (String)null, 1, 7);
		field1456 = new class117(12, 12, (String)null, 2, 7);
		field1462 = new class117(13, 13, (String)null, 3, 7);
		field1458 = new class117(14, 14, (String)null, 4, 7);
		field1451 = new class117(15, 15, (String)null, 5, 7); // L: 67
		field1460 = new class117(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class117(int var1, int var2, String var3, int var4, int var5) {
		this.field1461 = var1; // L: 78
		this.field1459 = var2; // L: 79
		this.field1463 = var4; // L: 80
	} // L: 81

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-303340189"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1459; // L: 84
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-37"
	)
	int method2647() {
		return this.field1463; // L: 88
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Z",
		garbageValue = "57"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false; // L: 38
		boolean var3 = false; // L: 39
		int var4 = 0; // L: 40
		int var5 = var0.length(); // L: 41
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3; // L: 71
				break;
			}

			label82: {
				char var7 = var0.charAt(var6); // L: 43
				if (var6 == 0) { // L: 44
					if (var7 == '-') { // L: 45
						var2 = true; // L: 46
						break label82;
					}

					if (var7 == '+') { // L: 49
						break label82;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') { // L: 51
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') { // L: 52
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') { // L: 53
						var1 = false; // L: 55
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) { // L: 58
					var1 = false; // L: 59
					break; // L: 60
				}

				if (var2) { // L: 62
					var9 = -var9;
				}

				int var8 = var4 * 10 + var9; // L: 63
				if (var4 != var8 / 10) { // L: 64
					var1 = false; // L: 65
					break; // L: 66
				}

				var4 = var8; // L: 68
				var3 = true; // L: 69
			}

			++var6; // L: 42
		}

		return var1; // L: 73
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1425978843"
	)
	static final int method2653(int var0, int var1) {
		int var2 = class343.method6251(var0 - 1, var1 - 1) + class343.method6251(var0 + 1, var1 - 1) + class343.method6251(var0 - 1, 1 + var1) + class343.method6251(var0 + 1, var1 + 1); // L: 984
		int var3 = class343.method6251(var0 - 1, var1) + class343.method6251(var0 + 1, var1) + class343.method6251(var0, var1 - 1) + class343.method6251(var0, var1 + 1); // L: 985
		int var4 = class343.method6251(var0, var1); // L: 986
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 987
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZB)I",
		garbageValue = "-76"
	)
	static int method2655(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) { // L: 4436
			Interpreter.Interpreter_intStackSize -= 5; // L: 4437
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4438
			return 1; // L: 4439
		} else if (var0 == 7204) { // L: 4441
			Interpreter.Interpreter_intStackSize -= 6; // L: 4442
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4443
			return 1; // L: 4444
		} else if (var0 >= 7205 && var0 < 7209) { // L: 4446
			Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4447
			return 1; // L: 4448
		} else if (var0 == 7209) { // L: 4450
			Interpreter.Interpreter_intStackSize -= 2; // L: 4451
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4452
			return 1; // L: 4453
		} else if (var0 >= 7210 && var0 < 7214) { // L: 4455
			--Interpreter.Interpreter_intStackSize; // L: 4456
			return 1; // L: 4457
		} else if (var0 == 7214) { // L: 4459
			Interpreter.Interpreter_intStackSize -= 2; // L: 4460
			return 1; // L: 4461
		} else {
			return 2; // L: 4463
		}
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1683604829"
	)
	static final void method2654(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 11957
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method2982()) { // L: 11958
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 11959
				if (var2.rank == -1) {
					PacketBufferNode var3 = class135.getPacketBufferNode(ClientPacket.field2850, Client.packetWriter.isaacCipher); // L: 11961
					var3.packetBuffer.writeByte(3 + GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 11962
					var3.packetBuffer.writeByte(var0); // L: 11963
					var3.packetBuffer.writeShort(var1); // L: 11964
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 11965
					Client.packetWriter.addNode(var3); // L: 11966
				}
			}
		}
	} // L: 11960 11967
}
