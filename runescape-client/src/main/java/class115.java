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
	@Export("archive0")
	static Archive archive0;
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
		this.field1401 = new float[4];
		this.field1402 = new float[4];
		this.field1403 = true;
		this.field1404 = 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)I",
		garbageValue = "13750737"
	)
	int method2638(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		int var4 = var1.readUnsignedByte();
		class121 var5 = (class121)class130.findEnumerated(class87.method2281(), var4);
		if (var5 == null) {
			var5 = class121.field1467;
		}

		this.field1410 = ScriptEvent.method2154(var1.readUnsignedByte());
		this.field1396 = ScriptEvent.method2154(var1.readUnsignedByte());
		this.field1397 = var1.readUnsignedByte() != 0;
		this.field1393 = new class111[var3];
		class111 var8 = null;

		int var6;
		for (var6 = 0; var6 < var3; ++var6) {
			class111 var7 = new class111();
			var7.method2558(var1, var2);
			this.field1393[var6] = var7;
			if (var8 != null) {
				var8.field1354 = var7;
			}

			var8 = var7;
		}

		this.field1395 = this.field1393[0].field1359;
		this.field1407 = this.field1393[this.method2637() - 1].field1359;
		this.field1405 = new float[this.method2642() + 1];

		for (var6 = this.method2633(); var6 <= this.method2658(); ++var6) {
			this.field1405[var6 - this.method2633()] = class14.method210(this, (float)var6);
		}

		this.field1393 = null;
		this.field1399 = class14.method210(this, (float)(this.method2633() - 1));
		this.field1409 = class14.method210(this, (float)(this.method2658() + 1));
		return var3;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1379613338"
	)
	public float method2632(int var1) {
		if (var1 < this.method2633()) {
			return this.field1399;
		} else {
			return var1 > this.method2658() ? this.field1409 : this.field1405[var1 - this.method2633()];
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "648165543"
	)
	int method2633() {
		return this.field1395;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "654538685"
	)
	int method2658() {
		return this.field1407;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	int method2642() {
		return this.method2658() - this.method2633();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(FB)I",
		garbageValue = "111"
	)
	int method2630(float var1) {
		if (this.field1404 < 0 || (float)this.field1393[this.field1404].field1359 > var1 || this.field1393[this.field1404].field1354 != null && (float)this.field1393[this.field1404].field1354.field1359 <= var1) {
			if (var1 >= (float)this.method2633() && var1 <= (float)this.method2658()) {
				int var2 = this.method2637();
				int var3 = this.field1404;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var5 + var4 >> 1;
						if (var1 < (float)this.field1393[var6].field1359) {
							if (var1 > (float)this.field1393[var6 - 1].field1359) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= (float)this.field1393[var6].field1359) {
								var3 = var6;
								break;
							}

							if (var1 < (float)this.field1393[var6 + 1].field1359) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while(var4 <= var5);
				}

				if (var3 != this.field1404) {
					this.field1404 = var3;
					this.field1403 = true;
				}

				return this.field1404;
			} else {
				return -1;
			}
		} else {
			return this.field1404;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(FB)Ldk;",
		garbageValue = "80"
	)
	class111 method2631(float var1) {
		int var2 = this.method2630(var1);
		return var2 >= 0 && var2 < this.field1393.length ? this.field1393[var2] : null;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1810339438"
	)
	int method2637() {
		return this.field1393 == null ? 0 : this.field1393.length;
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "([Ljm;Ljm;ZI)V",
		garbageValue = "-1877017569"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth * -362959503 * 351761297 : var1.width * -559707675 * 137530349;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight * 991543577 * -390853847 : var1.height * 147077041 * -113659567;
		class92.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			class92.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
		if (var5 != null) {
			class18.method297(var5.group, var3, var4, var2);
		}

		if (var1.contentType == 1337) {
		}

	}
}
