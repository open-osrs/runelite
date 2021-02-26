import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
@Implements("FriendsList")
public class FriendsList extends UserList {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2002671207
	)
	int field3655;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	@Export("friendLoginUpdates")
	public LinkDeque friendLoginUpdates;

	@ObfuscatedSignature(
		descriptor = "(Lml;)V"
	)
	public FriendsList(LoginType var1) {
		super(400); // L: 17
		this.field3655 = 1; // L: 13
		this.friendLoginUpdates = new LinkDeque(); // L: 14
		this.loginType = var1; // L: 18
	} // L: 19

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Ljn;",
		garbageValue = "-315842787"
	)
	@Export("newInstance")
	User newInstance() {
		return new Friend(); // L: 22
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)[Ljn;",
		garbageValue = "1723641195"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Friend[var1]; // L: 26
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkk;ZI)Z",
		garbageValue = "-117027707"
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lkx;II)V",
		garbageValue = "277533413"
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
						if (var12 != null && var12 != var11) { // L: 56
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
						var11.int2 = ++this.field3655 - 1; // L: 89
						if (var11.world == -1 && var6 == 0) { // L: 90
							var11.int2 = -(var11.int2 * 1612943523) * 975938315;
						}

						var11.world = var6; // L: 91
					}

					var11.rank = var7; // L: 93
					var11.field3663 = var9; // L: 94
					var11.field3661 = var10; // L: 95
					continue; // L: 96
				}

				throw new IllegalStateException();
			}

			this.sort(); // L: 97
			return; // L: 98
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-22"
	)
	static void method5386() {
		if (HealthBarUpdate.field1016 != null) { // L: 11661
			Client.field674 = Client.cycle; // L: 11662
			HealthBarUpdate.field1016.method4510(); // L: 11663

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 11664
				if (Client.players[var0] != null) { // L: 11665
					HealthBarUpdate.field1016.method4509((Client.players[var0].x >> 7) + GrandExchangeOfferNameComparator.baseX, (Client.players[var0].y >> 7) + NetCache.baseY); // L: 11666
				}
			}
		}

	} // L: 11670
}
