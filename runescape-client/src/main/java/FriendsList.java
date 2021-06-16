import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("FriendsList")
public class FriendsList extends UserList {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1954413
	)
	int field3812;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("friendLoginUpdates")
	public LinkDeque friendLoginUpdates;

	@ObfuscatedSignature(
		descriptor = "(Lnb;)V"
	)
	public FriendsList(LoginType var1) {
		super(400); // L: 17
		this.field3812 = 1; // L: 13
		this.friendLoginUpdates = new LinkDeque(); // L: 14
		this.loginType = var1; // L: 18
	} // L: 19

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Llf;",
		garbageValue = "1590299985"
	)
	@Export("newInstance")
	User newInstance() {
		return new Friend(); // L: 22
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)[Llf;",
		garbageValue = "-1320557093"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Friend[var1]; // L: 26
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llc;ZB)Z",
		garbageValue = "0"
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "730412999"
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
						var11.int2 = ++this.field3812 - 1; // L: 89
						if (var11.world == -1 && var6 == 0) { // L: 90
							var11.int2 = -(var11.int2 * 1083271825) * -286288271;
						}

						var11.world = var6; // L: 91
					}

					var11.rank = var7; // L: 93
					var11.field3824 = var9; // L: 94
					var11.field3825 = var10; // L: 95
					continue; // L: 96
				}

				throw new IllegalStateException();
			}

			this.sort(); // L: 97
			return; // L: 98
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)V",
		garbageValue = "2200"
	)
	static void method5711(int var0, String var1) {
		int var2 = Players.Players_count; // L: 8737
		int[] var3 = Players.Players_indices; // L: 8738
		boolean var4 = false; // L: 8739
		Username var5 = new Username(var1, LoginScreenAnimation.loginType); // L: 8740

		for (int var6 = 0; var6 < var2; ++var6) { // L: 8741
			Player var7 = Client.players[var3[var6]]; // L: 8742
			if (var7 != null && var7 != class262.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 8743
				PacketBufferNode var8;
				if (var0 == 1) { // L: 8744
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2618, Client.packetWriter.isaacCipher); // L: 8746
					var8.packetBuffer.method6705(var3[var6]); // L: 8747
					var8.packetBuffer.method6640(0); // L: 8748
					Client.packetWriter.addNode(var8); // L: 8749
				} else if (var0 == 4) { // L: 8751
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2627, Client.packetWriter.isaacCipher); // L: 8753
					var8.packetBuffer.method6640(0); // L: 8754
					var8.packetBuffer.method6648(var3[var6]); // L: 8755
					Client.packetWriter.addNode(var8); // L: 8756
				} else if (var0 == 6) { // L: 8758
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2605, Client.packetWriter.isaacCipher); // L: 8760
					var8.packetBuffer.method6649(var3[var6]); // L: 8761
					var8.packetBuffer.method6639(0); // L: 8762
					Client.packetWriter.addNode(var8); // L: 8763
				} else if (var0 == 7) { // L: 8765
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2673, Client.packetWriter.isaacCipher); // L: 8767
					var8.packetBuffer.writeByte(0); // L: 8768
					var8.packetBuffer.method6705(var3[var6]); // L: 8769
					Client.packetWriter.addNode(var8); // L: 8770
				}

				var4 = true; // L: 8772
				break;
			}
		}

		if (!var4) { // L: 8776
			UserComparator10.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 8777
}
