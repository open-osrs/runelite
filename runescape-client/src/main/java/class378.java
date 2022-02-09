import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
public abstract class class378 implements class241 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	class414 field4270;

	class378(int var1) {
	} // L: 13

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "1610720083"
	)
	abstract void vmethod6802(Buffer var1, int var2);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-8"
	)
	public void method6797(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 39
			}

			class374 var3 = (class374)class140.findEnumerated(Friend.method6284(), var2); // L: 19
			if (var3 != null) { // L: 20
				switch(var3.field4265) { // L: 21
				case 0:
					class140.findEnumerated(WorldMapData_1.method4638(), var1.readUnsignedByte()); // L: 33
					break; // L: 34
				case 1:
					int var4 = var1.readUnsignedByte(); // L: 23
					this.field4270 = class14.method178(var4); // L: 24
					if (this.field4270 != null) { // L: 25
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
				case 2:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3); // L: 31
				case 3:
					var1.readStringCp1252NullCircumfixed(); // L: 28
				}
			} else {
				this.vmethod6802(var1, var2); // L: 37
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-32142"
	)
	boolean method6799() {
		return this.field4270 != null; // L: 44
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "215034854"
	)
	Object method6800() {
		if (this.field4270 == class414.field4487) { // L: 48
			return 0; // L: 49
		} else if (this.field4270 == class414.field4489) { // L: 51
			return -1L; // L: 52
		} else {
			return this.field4270 == class414.field4495 ? "" : null; // L: 54 55 57
		}
	}
}
