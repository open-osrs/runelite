import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedSignature(
		descriptor = "(Lok;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400); // L: 13
		this.loginType = var1; // L: 14
	} // L: 15

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lmy;",
		garbageValue = "2000225121"
	)
	@Export("newInstance")
	User newInstance() {
		return new Ignored(); // L: 19
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lmy;",
		garbageValue = "55"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Ignored[var1]; // L: 24
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "2036771987"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) { // L: 28
				int var3 = var1.readUnsignedByte(); // L: 29
				boolean var4 = (var3 & 1) == 1; // L: 30
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 31
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 32
				var1.readStringCp1252NullTerminated(); // L: 33
				if (var5 != null && var5.hasCleanName()) { // L: 34
					Ignored var7 = (Ignored)this.getByCurrentUsername(var5); // L: 35
					if (var4) { // L: 36
						Ignored var8 = (Ignored)this.getByCurrentUsername(var6); // L: 37
						if (var8 != null && var8 != var7) { // L: 38
							if (var7 != null) { // L: 39
								this.remove(var8); // L: 40
							} else {
								var7 = var8; // L: 43
							}
						}
					}

					if (var7 != null) { // L: 47
						this.changeName(var7, var5, var6); // L: 48
						continue;
					}

					if (this.getSize() < 400) { // L: 50
						int var9 = this.getSize(); // L: 51
						var7 = (Ignored)this.addLast(var5, var6); // L: 52
						var7.id = var9; // L: 53
					}
					continue;
				}

				throw new IllegalStateException(); // L: 56
			}

			return; // L: 57
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "33"
	)
	static final int method6264(int var0, int var1) {
		if (var0 == -2) { // L: 1006
			return 12345678;
		} else if (var0 == -1) { // L: 1007
			if (var1 < 2) { // L: 1008
				var1 = 2;
			} else if (var1 > 126) { // L: 1009
				var1 = 126;
			}

			return var1; // L: 1010
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1012
			if (var1 < 2) { // L: 1013
				var1 = 2;
			} else if (var1 > 126) { // L: 1014
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1015
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfg;I)Z",
		garbageValue = "65280"
	)
	static boolean method6265(ObjectComposition var0) {
		if (var0.transforms != null) { // L: 708
			int[] var1 = var0.transforms; // L: 710

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 711
				int var3 = var1[var2]; // L: 712
				ObjectComposition var4 = ParamComposition.getObjectDefinition(var3); // L: 714
				if (var4.mapIconId != -1) { // L: 715
					return true; // L: 716
				}
			}
		} else if (var0.mapIconId != -1) { // L: 722
			return true; // L: 723
		}

		return false; // L: 725
	}
}
