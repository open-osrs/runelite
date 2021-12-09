import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
public class class115 {
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive1")
	static Archive archive1;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("c")
	boolean field1397;
	@ObfuscatedName("b")
	boolean field1408;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	class114 field1410;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	class114 field1396;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Ldk;"
	)
	class111[] field1393;
	@ObfuscatedName("s")
	boolean field1398;
	@ObfuscatedName("j")
	float field1406;
	@ObfuscatedName("w")
	float field1394;
	@ObfuscatedName("n")
	float[] field1401;
	@ObfuscatedName("r")
	float[] field1402;
	@ObfuscatedName("o")
	boolean field1403;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1087624435
	)
	int field1404;
	@ObfuscatedName("d")
	float[] field1405;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -544565947
	)
	int field1395;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -577776791
	)
	int field1407;
	@ObfuscatedName("e")
	float field1399;
	@ObfuscatedName("a")
	float field1409;

	class115() {
		this.field1401 = new float[4]; // L: 16
		this.field1402 = new float[4]; // L: 17
		this.field1403 = true; // L: 18
		this.field1404 = 0; // L: 19
	} // L: 26

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)I",
		garbageValue = "13750737"
	)
	int method2638(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 29
		int var4 = var1.readUnsignedByte(); // L: 30
		class121 var5 = (class121)class130.findEnumerated(class87.method2281(), var4); // L: 32
		if (var5 == null) { // L: 33
			var5 = class121.field1467;
		}

		this.field1410 = ScriptEvent.method2154(var1.readUnsignedByte()); // L: 35
		this.field1396 = ScriptEvent.method2154(var1.readUnsignedByte()); // L: 36
		this.field1397 = var1.readUnsignedByte() != 0; // L: 37
		this.field1393 = new class111[var3]; // L: 38
		class111 var8 = null; // L: 39

		int var6;
		for (var6 = 0; var6 < var3; ++var6) { // L: 40
			class111 var7 = new class111(); // L: 41
			var7.method2558(var1, var2); // L: 42
			this.field1393[var6] = var7; // L: 43
			if (var8 != null) { // L: 44
				var8.field1354 = var7; // L: 45
			}

			var8 = var7; // L: 47
		}

		this.field1395 = this.field1393[0].field1359; // L: 49
		this.field1407 = this.field1393[this.method2637() - 1].field1359; // L: 50
		this.field1405 = new float[this.method2642() + 1]; // L: 52

		for (var6 = this.method2633(); var6 <= this.method2658(); ++var6) { // L: 53
			this.field1405[var6 - this.method2633()] = class14.method210(this, (float)var6); // L: 54
		}

		this.field1393 = null; // L: 56
		this.field1399 = class14.method210(this, (float)(this.method2633() - 1)); // L: 58
		this.field1409 = class14.method210(this, (float)(this.method2658() + 1)); // L: 59
		return var3; // L: 60
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1379613338"
	)
	public float method2632(int var1) {
		if (var1 < this.method2633()) { // L: 65
			return this.field1399; // L: 66
		} else {
			return var1 > this.method2658() ? this.field1409 : this.field1405[var1 - this.method2633()]; // L: 68 69 71
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "648165543"
	)
	int method2633() {
		return this.field1395; // L: 76
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "654538685"
	)
	int method2658() {
		return this.field1407; // L: 80
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	int method2642() {
		return this.method2658() - this.method2633(); // L: 84
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(FB)I",
		garbageValue = "111"
	)
	int method2630(float var1) {
		if (this.field1404 < 0 || (float)this.field1393[this.field1404].field1359 > var1 || this.field1393[this.field1404].field1354 != null && (float)this.field1393[this.field1404].field1354.field1359 <= var1) { // L: 88
			if (var1 >= (float)this.method2633() && var1 <= (float)this.method2658()) { // L: 91
				int var2 = this.method2637(); // L: 94
				int var3 = this.field1404; // L: 95
				if (var2 > 0) { // L: 96
					int var4 = 0; // L: 97
					int var5 = var2 - 1; // L: 98

					do {
						int var6 = var5 + var4 >> 1; // L: 100
						if (var1 < (float)this.field1393[var6].field1359) { // L: 101
							if (var1 > (float)this.field1393[var6 - 1].field1359) { // L: 102
								var3 = var6 - 1; // L: 103
								break;
							}

							var5 = var6 - 1; // L: 107
						} else {
							if (var1 <= (float)this.field1393[var6].field1359) { // L: 110
								var3 = var6; // L: 120
								break; // L: 121
							}

							if (var1 < (float)this.field1393[var6 + 1].field1359) { // L: 111
								var3 = var6; // L: 112
								break; // L: 113
							}

							var4 = var6 + 1; // L: 116
						}
					} while(var4 <= var5); // L: 123
				}

				if (var3 != this.field1404) { // L: 125
					this.field1404 = var3; // L: 126
					this.field1403 = true; // L: 127
				}

				return this.field1404; // L: 129
			} else {
				return -1; // L: 92
			}
		} else {
			return this.field1404; // L: 89
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(FB)Ldk;",
		garbageValue = "80"
	)
	class111 method2631(float var1) {
		int var2 = this.method2630(var1); // L: 133
		return var2 >= 0 && var2 < this.field1393.length ? this.field1393[var2] : null; // L: 134 135 138
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1810339438"
	)
	int method2637() {
		return this.field1393 == null ? 0 : this.field1393.length; // L: 143 144
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "([Ljm;Ljm;ZI)V",
		garbageValue = "-1877017569"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth * -362959503 * 351761297 : var1.width * -559707675 * 137530349; // L: 10925
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight * 991543577 * -390853847 : var1.height * 147077041 * -113659567; // L: 10926
		class92.resizeInterface(var0, var1.id, var3, var4, var2); // L: 10927
		if (var1.children != null) { // L: 10928
			class92.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 10929
		if (var5 != null) {
			class18.method297(var5.group, var3, var4, var2); // L: 10930
		}

		if (var1.contentType == 1337) { // L: 10931
		}

	} // L: 10932
}
