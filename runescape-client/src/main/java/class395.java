import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
public abstract class class395 implements class249 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	class433 field4430;

	class395(int var1) {
	} // L: 13

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "-1749736682"
	)
	abstract void vmethod6936(Buffer var1, int var2);

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "622445456"
	)
	public void method6927(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 64
			}

			class391[] var3 = new class391[]{class391.field4421, class391.field4419, class391.field4424, class391.field4422}; // L: 21
			class391 var4 = (class391)class291.findEnumerated(var3, var2); // L: 23
			if (var4 != null) { // L: 24
				switch(var4.field4423) { // L: 25
				case 1:
					int var6 = var1.readUnsignedByte(); // L: 37
					int var8 = class431.field4651[var6]; // L: 40
					class433 var7;
					if (var8 == 1) { // L: 41
						var7 = class433.field4664; // L: 42
					} else if (var8 == 2) { // L: 45
						var7 = class433.field4656; // L: 46
					} else if (var8 == 3) { // L: 49
						var7 = class433.field4655; // L: 50
					} else {
						var7 = null; // L: 53
					}

					this.field4430 = var7; // L: 55
					if (this.field4430 != null) { // L: 56
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6);
				case 2:
					class309[] var5 = new class309[]{class309.field3973, class309.field3976, class309.field3972, class309.field3974}; // L: 32
					class291.findEnumerated(var5, var1.readUnsignedByte()); // L: 34
					break; // L: 35
				case 3:
					var1.readStringCp1252NullCircumfixed(); // L: 27
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4); // L: 59
				}
			} else {
				this.vmethod6936(var1, var2); // L: 62
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	boolean method6929() {
		return this.field4430 != null; // L: 69
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/Object;",
		garbageValue = "-29"
	)
	Object method6930() {
		if (this.field4430 == class433.field4664) { // L: 73
			return 0; // L: 74
		} else if (this.field4430 == class433.field4655) { // L: 76
			return -1L; // L: 77
		} else {
			return this.field4430 == class433.field4656 ? "" : null; // L: 79 80 82
		}
	}
}
