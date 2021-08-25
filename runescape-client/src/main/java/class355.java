import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
public abstract class class355 implements class228 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	class391 field4025;

	class355(int var1) {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "-1018722476"
	)
	abstract void vmethod6259(Buffer var1, int var2);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1944706150"
	)
	public void method6257(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class351[] var3 = new class351[]{class351.field4019, class351.field4021, class351.field4017, class351.field4018};
			class351 var4 = (class351)class260.findEnumerated(var3, var2);
			if (var4 != null) {
				switch(var4.field4020) {
				case 1:
					class283[] var7 = new class283[]{class283.field3653, class283.field3651, class283.field3652, class283.field3650};
					class260.findEnumerated(var7, var1.readUnsignedByte());
					break;
				case 2:
					int var5 = var1.readUnsignedByte();
					int var8 = class389.field4234[var5];
					class391 var6;
					if (var8 == 1) {
						var6 = class391.field4240;
					} else if (var8 == 2) {
						var6 = class391.field4238;
					} else if (var8 == 3) {
						var6 = class391.field4241;
					} else {
						var6 = null;
					}

					this.field4025 = var6;
					if (this.field4025 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
				case 3:
					var1.readStringCp1252NullCircumfixed();
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
				}
			} else {
				this.vmethod6259(var1, var2);
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "21515"
	)
	boolean method6260() {
		return this.field4025 != null;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/Object;",
		garbageValue = "26"
	)
	Object method6258() {
		if (this.field4025 == class391.field4240) {
			return 0;
		} else if (this.field4025 == class391.field4241) {
			return -1L;
		} else {
			return this.field4025 == class391.field4238 ? "" : null;
		}
	}
}
