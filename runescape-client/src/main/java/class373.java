import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
public abstract class class373 implements class241 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	class409 field4226;

	class373(int var1) {
	} // L: 13

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "1616764501"
	)
	abstract void vmethod6785(Buffer var1, int var2);

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-107064225"
	)
	public void method6778(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 60
			}

			class369 var3 = (class369)class130.findEnumerated(Strings.method5508(), var2); // L: 19
			if (var3 != null) { // L: 20
				switch(var3.field4218) { // L: 21
				case 1:
					int var4 = var1.readUnsignedByte(); // L: 23
					int var7 = class407.field4439[var4]; // L: 26
					class409 var5;
					if (var7 == 1) { // L: 27
						var5 = class409.field4445; // L: 28
					} else if (var7 == 2) { // L: 31
						var5 = class409.field4449; // L: 32
					} else if (var7 == 3) { // L: 35
						var5 = class409.field4442; // L: 36
					} else {
						var5 = null; // L: 39
					}

					this.field4226 = var5; // L: 41
					if (this.field4226 != null) { // L: 42
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
				case 2:
					class295[] var6 = new class295[]{class295.field3791, class295.field3790, class295.field3789, class295.field3793}; // L: 49
					class130.findEnumerated(var6, var1.readUnsignedByte()); // L: 51
					break; // L: 52
				case 3:
					var1.readStringCp1252NullCircumfixed(); // L: 54
					break; // L: 55
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3); // L: 45
				}
			} else {
				this.vmethod6785(var1, var2); // L: 58
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "255"
	)
	boolean method6780() {
		return this.field4226 != null; // L: 65
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/Object;",
		garbageValue = "-56"
	)
	Object method6781() {
		if (this.field4226 == class409.field4445) { // L: 69
			return 0; // L: 70
		} else if (this.field4226 == class409.field4442) { // L: 72
			return -1L; // L: 73
		} else {
			return this.field4226 == class409.field4449 ? "" : null; // L: 75 76 78
		}
	}
}
