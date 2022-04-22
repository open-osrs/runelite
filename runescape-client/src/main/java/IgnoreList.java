import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedSignature(
		descriptor = "(Lpe;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400); // L: 13
		this.loginType = var1; // L: 14
	} // L: 15

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lnn;",
		garbageValue = "-2105397576"
	)
	@Export("newInstance")
	User newInstance() {
		return new Ignored(); // L: 18
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)[Lnn;",
		garbageValue = "1888809026"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Ignored[var1]; // L: 22
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IS)V",
		garbageValue = "-22904"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) { // L: 26
				int var3 = var1.readUnsignedByte(); // L: 27
				boolean var4 = (var3 & 1) == 1; // L: 28
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 29
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 30
				var1.readStringCp1252NullTerminated(); // L: 31
				if (var5 != null && var5.hasCleanName()) { // L: 32
					Ignored var7 = (Ignored)this.getByCurrentUsername(var5); // L: 33
					if (var4) { // L: 34
						Ignored var8 = (Ignored)this.getByCurrentUsername(var6); // L: 35
						if (var8 != null && var8 != var7) { // L: 36
							if (var7 != null) { // L: 37
								this.remove(var8); // L: 38
							} else {
								var7 = var8; // L: 41
							}
						}
					}

					if (var7 != null) { // L: 45
						this.changeName(var7, var5, var6); // L: 46
						continue;
					}

					if (this.getSize() < 400) { // L: 48
						int var9 = this.getSize(); // L: 49
						var7 = (Ignored)this.addLast(var5, var6); // L: 50
						var7.id = var9; // L: 51
					}
					continue;
				}

				throw new IllegalStateException(); // L: 54
			}

			return; // L: 55
		}
	}
}
