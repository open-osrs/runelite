import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
public abstract class class394 implements class249 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	class431 field4378;

	class394(int var1) {
	} // L: 13

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IS)V",
		garbageValue = "256"
	)
	abstract void vmethod7129(Buffer var1, int var2);

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "3"
	)
	public void method7128(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 60
			}

			class390[] var3 = new class390[]{class390.field4367, class390.field4368, class390.field4366, class390.field4369}; // L: 21
			class390 var4 = (class390)MusicPatchPcmStream.findEnumerated(var3, var2); // L: 23
			if (var4 != null) { // L: 24
				switch(var4.field4370) { // L: 25
				case 0:
					int var5 = var1.readUnsignedByte(); // L: 27
					int var7 = class429.field4588[var5];
					class431 var6;
					if (var7 == 1) {
						var6 = class431.field4595;
					} else if (var7 == 2) {
						var6 = class431.field4598;
					} else if (var7 == 3) { // L: 39
						var6 = class431.field4592; // L: 40
					} else {
						var6 = null; // L: 43
					}

					this.field4378 = var6; // L: 45
					if (this.field4378 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5); // L: 46
				case 1:
					var1.readStringCp1252NullCircumfixed(); // L: 49
					break; // L: 50
				case 2:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4); // L: 55
				case 3:
					MusicPatchPcmStream.findEnumerated(Client.method1633(), var1.readUnsignedByte()); // L: 52
				}
			} else {
				this.vmethod7129(var1, var2); // L: 58
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "95"
	)
	boolean method7127() {
		return this.field4378 != null; // L: 65
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "1513731633"
	)
	Object method7131() {
		if (this.field4378 == class431.field4595) { // L: 69
			return 0; // L: 70
		} else if (this.field4378 == class431.field4592) { // L: 72
			return -1L; // L: 73
		} else {
			return this.field4378 == class431.field4598 ? "" : null; // L: 75 76 78
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)I",
		garbageValue = "-20"
	)
	public static int method7141(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 30
			int var6 = var3; // L: 31
			var3 = var4; // L: 32
			var4 = var6; // L: 33
		}

		var2 &= 3; // L: 35
		if (var2 == 0) { // L: 36
			return var1;
		} else if (var2 == 1) { // L: 37
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0; // L: 38
		}
	}
}
