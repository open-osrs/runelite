import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	static IndexedSprite field4284;
	@ObfuscatedName("q")
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(S)Lne;",
		garbageValue = "-7122"
	)
	@Export("newInstance")
	User newInstance() {
		return new Ignored(); // L: 19
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)[Lne;",
		garbageValue = "77510907"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Ignored[var1]; // L: 24
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqt;II)V",
		garbageValue = "1241534529"
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
						if (var8 != null && var7 != var8) { // L: 38
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
}
