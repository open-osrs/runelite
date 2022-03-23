import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dq")
public class class115 {
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = -476763721
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 184863089
	)
	public final int field1410;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	public class115 field1404;
	@ObfuscatedName("h")
	float[][] field1406;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "[Lnu;"
	)
	final class387[] field1403;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lnu;"
	)
	class387[] field1411;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lnu;"
	)
	class387[] field1408;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	class387 field1409;
	@ObfuscatedName("f")
	boolean field1405;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	class387 field1407;
	@ObfuscatedName("r")
	boolean field1412;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	class387 field1413;
	@ObfuscatedName("x")
	float[][] field1414;
	@ObfuscatedName("c")
	float[][] field1415;
	@ObfuscatedName("j")
	float[][] field1416;

	@ObfuscatedSignature(
		descriptor = "(ILpd;Z)V"
	)
	public class115(int var1, Buffer var2, boolean var3) {
		this.field1409 = new class387(); // L: 13
		this.field1405 = true; // L: 14
		this.field1407 = new class387(); // L: 15
		this.field1412 = true;
		this.field1413 = new class387(); // L: 17
		this.field1410 = var2.readShort(); // L: 23
		this.field1403 = new class387[var1]; // L: 24
		this.field1411 = new class387[this.field1403.length]; // L: 25
		this.field1408 = new class387[this.field1403.length]; // L: 26
		this.field1406 = new float[this.field1403.length][3]; // L: 27

		for (int var4 = 0; var4 < this.field1403.length; ++var4) { // L: 28
			this.field1403[var4] = new class387(var2, var3); // L: 29
			this.field1406[var4][0] = var2.method7965(); // L: 30
			this.field1406[var4][1] = var2.method7965(); // L: 31
			this.field1406[var4][2] = var2.method7965(); // L: 32
		}

		this.method2686(); // L: 34
	} // L: 35

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "70"
	)
	void method2686() {
		this.field1414 = new float[this.field1403.length][3]; // L: 38
		this.field1415 = new float[this.field1403.length][3]; // L: 39
		this.field1416 = new float[this.field1403.length][3]; // L: 40
		class387 var1 = HealthBarDefinition.method3428(); // L: 41

		for (int var2 = 0; var2 < this.field1403.length; ++var2) { // L: 42
			class387 var3 = this.method2651(var2); // L: 43
			var1.method7064(var3); // L: 44
			var1.method7111(); // L: 45
			this.field1414[var2] = var1.method7072(); // L: 46
			this.field1415[var2][0] = var3.field4347[12]; // L: 47
			this.field1415[var2][1] = var3.field4347[13]; // L: 48
			this.field1415[var2][2] = var3.field4347[14]; // L: 49
			this.field1416[var2] = var3.method7074(); // L: 50
		}

		var1.method7095(); // L: 52
	} // L: 53

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lnu;",
		garbageValue = "735680223"
	)
	class387 method2651(int var1) {
		return this.field1403[var1]; // L: 56
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lnu;",
		garbageValue = "1840626302"
	)
	class387 method2662(int var1) {
		if (this.field1411[var1] == null) { // L: 60
			this.field1411[var1] = new class387(this.method2651(var1)); // L: 61
			if (this.field1404 != null) { // L: 62
				this.field1411[var1].method7109(this.field1404.method2662(var1)); // L: 63
			} else {
				this.field1411[var1].method7109(class387.field4348); // L: 66
			}
		}

		return this.field1411[var1]; // L: 69
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)Lnu;",
		garbageValue = "-123"
	)
	class387 method2653(int var1) {
		if (this.field1408[var1] == null) { // L: 73
			this.field1408[var1] = new class387(this.method2662(var1)); // L: 74
			this.field1408[var1].method7111(); // L: 75
		}

		return this.field1408[var1]; // L: 77
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "1752544536"
	)
	void method2654(class387 var1) {
		this.field1409.method7064(var1); // L: 81
		this.field1405 = true; // L: 82
		this.field1412 = true; // L: 83
	} // L: 84

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lnu;",
		garbageValue = "-1868742286"
	)
	class387 method2650() {
		return this.field1409; // L: 87
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Lnu;",
		garbageValue = "-1180854029"
	)
	class387 method2649() {
		if (this.field1405) { // L: 91
			this.field1407.method7064(this.method2650()); // L: 92
			if (this.field1404 != null) { // L: 93
				this.field1407.method7109(this.field1404.method2649()); // L: 94
			}

			this.field1405 = false; // L: 96
		}

		return this.field1407; // L: 98
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lnu;",
		garbageValue = "57001904"
	)
	public class387 method2657(int var1) {
		if (this.field1412) { // L: 102
			this.field1413.method7064(this.method2653(var1)); // L: 103
			this.field1413.method7109(this.method2649()); // L: 104
			this.field1412 = false; // L: 105
		}

		return this.field1413; // L: 107
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "493348686"
	)
	float[] method2658(int var1) {
		return this.field1414[var1]; // L: 111
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-559472917"
	)
	float[] method2652(int var1) {
		return this.field1415[var1]; // L: 115
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IS)[F",
		garbageValue = "128"
	)
	float[] method2687(int var1) {
		return this.field1416[var1]; // L: 119
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llq;B)V",
		garbageValue = "72"
	)
	public static void method2685(AbstractArchive var0) {
	} // L: 16

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "-1823955138"
	)
	static int method2681(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1410
			var3 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 1411
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.itemId; // L: 1412
			return 1; // L: 1413
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1415
			var3 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 1416
			if (var3.itemId != -1) { // L: 1417
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 1418
			}

			return 1; // L: 1419
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1421
			int var5 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 1422
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1423
			if (var4 != null) { // L: 1424
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 1425
			}

			return 1; // L: 1426
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1428
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1429
			return 1; // L: 1430
		} else if (var0 == 1707) { // L: 1432
			var3 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 1433
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.method5642() ? 1 : 0; // L: 1434
			return 1; // L: 1435
		} else if (var0 == 1708) { // L: 1437
			var3 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 1438
			return class302.method5773(var3); // L: 1439
		} else if (var0 == 1708) { // L: 1441
			var3 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 1442
			return WorldMapSectionType.method4952(var3); // L: 1443
		} else {
			return 2; // L: 1445
		}
	}
}
