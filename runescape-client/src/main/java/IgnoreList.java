import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1712737799
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedSignature(
		descriptor = "(Lmu;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400); // L: 12
		this.loginType = var1; // L: 13
	} // L: 14

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lju;",
		garbageValue = "-99"
	)
	@Export("newInstance")
	User newInstance() {
		return new Ignored(); // L: 17
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)[Lju;",
		garbageValue = "-1524839332"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Ignored[var1]; // L: 21
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkj;II)V",
		garbageValue = "1401176897"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) { // L: 25
				int var3 = var1.readUnsignedByte(); // L: 26
				boolean var4 = (var3 & 1) == 1; // L: 27
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 28
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 29
				var1.readStringCp1252NullTerminated(); // L: 30
				if (var5 != null && var5.hasCleanName()) { // L: 31
					Ignored var7 = (Ignored)this.getByCurrentUsername(var5); // L: 32
					if (var4) { // L: 33
						Ignored var8 = (Ignored)this.getByCurrentUsername(var6);
						if (var8 != null && var8 != var7) {
							if (var7 != null) {
								this.remove(var8);
							} else {
								var7 = var8;
							}
						}
					}

					if (var7 != null) {
						this.changeName(var7, var5, var6);
						continue;
					}

					if (this.getSize() < 400) {
						int var9 = this.getSize();
						var7 = (Ignored)this.addLast(var5, var6);
						var7.id = var9; // L: 50
					}
					continue;
				}

				throw new IllegalStateException();
			}

			return; // L: 54
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-18749"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 34
		if (var0 < 0 || var0 >= 65536) { // L: 35
			var0 >>>= 16; // L: 36
			var1 += 16; // L: 37
		}

		if (var0 >= 256) { // L: 39
			var0 >>>= 8; // L: 40
			var1 += 8; // L: 41
		}

		if (var0 >= 16) { // L: 43
			var0 >>>= 4; // L: 44
			var1 += 4; // L: 45
		}

		if (var0 >= 4) { // L: 47
			var0 >>>= 2; // L: 48
			var1 += 2; // L: 49
		}

		if (var0 >= 1) { // L: 51
			var0 >>>= 1; // L: 52
			++var1; // L: 53
		}

		return var0 + var1; // L: 55
	}
}
