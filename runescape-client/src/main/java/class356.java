import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
public abstract class class356 implements class228 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	class392 field4044;

	class356(int var1) {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "-1820829801"
	)
	abstract void vmethod6328(Buffer var1, int var2);

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "1989919652"
	)
	public void method6323(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class352[] var3 = new class352[]{class352.field4036, class352.field4035, class352.field4039, class352.field4037};
			class352 var4 = (class352)class128.findEnumerated(var3, var2);
			if (var4 != null) {
				switch(var4.field4038) {
				case 0:
					int var5 = var1.readUnsignedByte();
					this.field4044 = class65.method1876(var5);
					if (this.field4044 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
				case 1:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
				case 2:
					class128.findEnumerated(PcmPlayer.method744(), var1.readUnsignedByte());
					break;
				case 3:
					var1.readStringCp1252NullCircumfixed();
				}
			} else {
				this.vmethod6328(var1, var2);
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-17949"
	)
	boolean method6320() {
		return this.field4044 != null;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "-766150747"
	)
	Object method6317() {
		if (this.field4044 == class392.field4266) {
			return 0;
		} else if (this.field4044 == class392.field4273) {
			return -1L;
		} else {
			return this.field4044 == class392.field4264 ? "" : null;
		}
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-560817970"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (class116.pcmPlayer1 != null) {
			class116.pcmPlayer1.run();
		}

		if (class126.pcmPlayer0 != null) {
			class126.pcmPlayer0.run();
		}

	}
}
