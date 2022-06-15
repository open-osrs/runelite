import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
public abstract class class394 implements class248 {
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1016903311
	)
	public static int field4429;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	class432 field4428;

	class394(int var1) {
	} // L: 13

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;II)V",
		garbageValue = "803287054"
	)
	abstract void vmethod7080(Buffer var1, int var2);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "-1106157654"
	)
	public void method7073(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 47
			}

			class390[] var3 = new class390[]{class390.field4418, class390.field4419, class390.field4420, class390.field4422}; // L: 21
			class390 var4 = (class390)Actor.findEnumerated(var3, var2); // L: 23
			if (var4 != null) { // L: 24
				switch(var4.field4417) { // L: 25
				case 0:
					int var6 = var1.readUnsignedByte(); // L: 39
					this.field4428 = MusicPatchNode.method5472(var6); // L: 40
					if (this.field4428 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6); // L: 41
				case 1:
					class308[] var5 = new class308[]{class308.field3939, class308.field3938, class308.field3941, class308.field3940}; // L: 32
					Actor.findEnumerated(var5, var1.readUnsignedByte()); // L: 34
					break; // L: 35
				case 2:
					var1.readStringCp1252NullCircumfixed(); // L: 27
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4); // L: 37
				}
			} else {
				this.vmethod7080(var1, var2); // L: 45
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1341290829"
	)
	boolean method7074() {
		return this.field4428 != null; // L: 52
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "-72788464"
	)
	Object method7082() {
		if (this.field4428 == class432.field4658) { // L: 56
			return 0; // L: 57
		} else if (this.field4428 == class432.field4656) { // L: 59
			return -1L; // L: 60
		} else {
			return this.field4428 == class432.field4657 ? "" : null; // L: 62 63 65
		}
	}
}
