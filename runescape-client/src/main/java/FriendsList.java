import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("FriendsList")
public class FriendsList extends UserList {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1451394125
	)
	int field3649;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	@Export("friendLoginUpdates")
	public LinkDeque friendLoginUpdates;

	@ObfuscatedSignature(
		descriptor = "(Lmc;)V"
	)
	public FriendsList(LoginType var1) {
		super(400); // L: 17
		this.field3649 = 1; // L: 13
		this.friendLoginUpdates = new LinkDeque(); // L: 14
		this.loginType = var1; // L: 18
	} // L: 19

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljh;",
		garbageValue = "-1664145399"
	)
	@Export("newInstance")
	User newInstance() {
		return new Friend(); // L: 22
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)[Ljh;",
		garbageValue = "-35"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Friend[var1]; // L: 26
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkm;ZB)Z",
		garbageValue = "36"
	)
	@Export("isFriended")
	public boolean isFriended(Username var1, boolean var2) {
		Friend var3 = (Friend)this.getByUsername(var1); // L: 30
		if (var3 == null) {
			return false; // L: 31
		} else {
			return !var2 || var3.world != 0; // L: 32
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lkb;II)V",
		garbageValue = "1702528493"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) { // L: 37
				boolean var3 = var1.readUnsignedByte() == 1; // L: 38
				Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 39
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 40
				int var6 = var1.readUnsignedShort(); // L: 41
				int var7 = var1.readUnsignedByte(); // L: 42
				int var8 = var1.readUnsignedByte(); // L: 43
				boolean var9 = (var8 & 2) != 0; // L: 44
				boolean var10 = (var8 & 1) != 0; // L: 45
				if (var6 > 0) { // L: 46
					var1.readStringCp1252NullTerminated(); // L: 47
					var1.readUnsignedByte(); // L: 48
					var1.readInt(); // L: 49
				}

				var1.readStringCp1252NullTerminated(); // L: 51
				if (var4 != null && var4.hasCleanName()) { // L: 52
					Friend var11 = (Friend)this.getByCurrentUsername(var4); // L: 53
					if (var3) { // L: 54
						Friend var12 = (Friend)this.getByCurrentUsername(var5); // L: 55
						if (var12 != null && var11 != var12) { // L: 56
							if (var11 != null) { // L: 57
								this.remove(var12); // L: 58
							} else {
								var11 = var12; // L: 61
							}
						}
					}

					if (var11 != null) { // L: 65
						this.changeName(var11, var4, var5); // L: 66
						if (var6 != var11.world) { // L: 67
							boolean var14 = true; // L: 68

							for (FriendLoginUpdate var13 = (FriendLoginUpdate)this.friendLoginUpdates.last(); var13 != null; var13 = (FriendLoginUpdate)this.friendLoginUpdates.previous()) { // L: 69
								if (var13.username.equals(var4)) { // L: 70
									if (var6 != 0 && var13.world == 0) { // L: 71
										var13.remove(); // L: 72
										var14 = false; // L: 73
									} else if (var6 == 0 && var13.world != 0) { // L: 75
										var13.remove(); // L: 76
										var14 = false; // L: 77
									}
								}
							}

							if (var14) { // L: 81
								this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4, var6));
							}
						}
					} else {
						if (this.getSize() >= 400) { // L: 84
							continue;
						}

						var11 = (Friend)this.addLast(var4, var5); // L: 85
					}

					if (var6 != var11.world) { // L: 88
						var11.int2 = ++this.field3649 - 1; // L: 89
						if (var11.world == -1 && var6 == 0) { // L: 90
							var11.int2 = -(var11.int2 * 325522823) * -152395721;
						}

						var11.world = var6; // L: 91
					}

					var11.rank = var7; // L: 93
					var11.field3659 = var9; // L: 94
					var11.field3660 = var10; // L: 95
					continue; // L: 96
				}

				throw new IllegalStateException();
			}

			this.sort(); // L: 97
			return; // L: 98
		}
	}
}
