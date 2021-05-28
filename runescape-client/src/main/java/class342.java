import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
public abstract class class342 implements class213 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	class374 field3927;

	class342(int var1) {
	} // L: 13

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;II)V",
		garbageValue = "-1773936298"
	)
	abstract void vmethod6036(Buffer var1, int var2);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1490587397"
	)
	public void method6035(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 56
			}

			class338 var3 = (class338)Messages.findEnumerated(FloorDecoration.method3834(), var2); // L: 19
			if (var3 != null) { // L: 20
				switch(var3.field3918) { // L: 21
				case 0:
					Messages.findEnumerated(class258.method4835(), var1.readUnsignedByte()); // L: 23
					break;
				case 1:
					int var4 = var1.readUnsignedByte(); // L: 29
					int var6 = class372.field4124[var4]; // L: 32
					class374 var5;
					if (var6 == 1) { // L: 33
						var5 = class374.field4131; // L: 34
					} else if (var6 == 2) { // L: 37
						var5 = class374.field4129; // L: 38
					} else if (var6 == 3) { // L: 41
						var5 = class374.field4128; // L: 42
					} else {
						var5 = null; // L: 45
					}

					this.field3927 = var5; // L: 47
					if (this.field3927 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4); // L: 48
				case 2:
					var1.readStringCp1252NullCircumfixed(); // L: 26
					break; // L: 27
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3); // L: 51
				}
			} else {
				this.vmethod6036(var1, var2); // L: 54
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1118376221"
	)
	boolean method6040() {
		return this.field3927 != null; // L: 61
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "-334523720"
	)
	Object method6038() {
		if (this.field3927 == class374.field4131) { // L: 65
			return 0; // L: 66
		} else if (this.field3927 == class374.field4128) { // L: 68
			return -1L; // L: 69
		} else {
			return this.field3927 == class374.field4129 ? "" : null; // L: 71 72 74
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "15704077"
	)
	public static int method6043(int var0, int var1, int var2) {
		int var3 = CollisionMap.method3185(var2 - var1 + 1); // L: 57
		var3 <<= var1; // L: 58
		var0 |= var3; // L: 59
		return var0; // L: 60
	}
}
