import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedSignature(
		descriptor = "(Lmc;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400); // L: 12
		this.loginType = var1; // L: 13
	} // L: 14

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljh;",
		garbageValue = "-1664145399"
	)
	@Export("newInstance")
	User newInstance() {
		return new Ignored(); // L: 17
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)[Ljh;",
		garbageValue = "-35"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Ignored[var1]; // L: 21
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkb;IB)V",
		garbageValue = "0"
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
						Ignored var8 = (Ignored)this.getByCurrentUsername(var6); // L: 34
						if (var8 != null && var8 != var7) { // L: 35
							if (var7 != null) { // L: 36
								this.remove(var8); // L: 37
							} else {
								var7 = var8; // L: 40
							}
						}
					}

					if (var7 != null) { // L: 44
						this.changeName(var7, var5, var6); // L: 45
						continue;
					}

					if (this.getSize() < 400) { // L: 47
						int var9 = this.getSize(); // L: 48
						var7 = (Ignored)this.addLast(var5, var6); // L: 49
						var7.id = var9; // L: 50
					}
					continue;
				}

				throw new IllegalStateException(); // L: 53
			}

			return; // L: 54
		}
	}
}
