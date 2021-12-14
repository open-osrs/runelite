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
	}

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
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class369 var3 = (class369)class130.findEnumerated(Strings.method5508(), var2);
			if (var3 != null) {
				switch(var3.field4218) {
				case 1:
					int var4 = var1.readUnsignedByte();
					int var7 = class407.field4439[var4];
					class409 var5;
					if (var7 == 1) {
						var5 = class409.field4445;
					} else if (var7 == 2) {
						var5 = class409.field4449;
					} else if (var7 == 3) {
						var5 = class409.field4442;
					} else {
						var5 = null;
					}

					this.field4226 = var5;
					if (this.field4226 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
				case 2:
					class295[] var6 = new class295[]{class295.field3791, class295.field3790, class295.field3789, class295.field3793};
					class130.findEnumerated(var6, var1.readUnsignedByte());
					break;
				case 3:
					var1.readStringCp1252NullCircumfixed();
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
				}
			} else {
				this.vmethod6785(var1, var2);
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "255"
	)
	boolean method6780() {
		return this.field4226 != null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/Object;",
		garbageValue = "-56"
	)
	Object method6781() {
		if (this.field4226 == class409.field4445) {
			return 0;
		} else if (this.field4226 == class409.field4442) {
			return -1L;
		} else {
			return this.field4226 == class409.field4449 ? "" : null;
		}
	}
}
