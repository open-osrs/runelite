import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
@Implements("FriendsList")
public class FriendsList extends UserList {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1848201845
	)
	int field4286;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("friendLoginUpdates")
	public LinkDeque friendLoginUpdates;

	@ObfuscatedSignature(
		descriptor = "(Lpe;)V"
	)
	public FriendsList(LoginType var1) {
		super(400); // L: 18
		this.field4286 = 1; // L: 14
		this.friendLoginUpdates = new LinkDeque(); // L: 15
		this.loginType = var1; // L: 19
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(S)Lne;",
		garbageValue = "-7122"
	)
	@Export("newInstance")
	User newInstance() {
		return new Friend(); // L: 24
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)[Lne;",
		garbageValue = "77510907"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Friend[var1]; // L: 29
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqa;ZB)Z",
		garbageValue = "-49"
	)
	@Export("isFriended")
	public boolean isFriended(Username var1, boolean var2) {
		Friend var3 = (Friend)this.getByUsername(var1); // L: 33
		if (var3 == null) {
			return false; // L: 34
		} else {
			return !var2 || var3.world != 0; // L: 35
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqt;IB)V",
		garbageValue = "1"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) { // L: 40
				boolean var3 = var1.readUnsignedByte() == 1; // L: 41
				Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 42
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 43
				int var6 = var1.readUnsignedShort(); // L: 44
				int var7 = var1.readUnsignedByte(); // L: 45
				int var8 = var1.readUnsignedByte(); // L: 46
				boolean var9 = (var8 & 2) != 0; // L: 47
				boolean var10 = (var8 & 1) != 0; // L: 48
				if (var6 > 0) { // L: 49
					var1.readStringCp1252NullTerminated(); // L: 50
					var1.readUnsignedByte(); // L: 51
					var1.readInt(); // L: 52
				}

				var1.readStringCp1252NullTerminated(); // L: 54
				if (var4 != null && var4.hasCleanName()) { // L: 55
					Friend var11 = (Friend)this.getByCurrentUsername(var4); // L: 56
					if (var3) { // L: 57
						Friend var12 = (Friend)this.getByCurrentUsername(var5); // L: 58
						if (var12 != null && var12 != var11) { // L: 59
							if (var11 != null) { // L: 60
								this.remove(var12); // L: 61
							} else {
								var11 = var12; // L: 64
							}
						}
					}

					if (var11 != null) { // L: 68
						this.changeName(var11, var4, var5); // L: 69
						if (var6 != var11.world) { // L: 70
							boolean var14 = true; // L: 71

							for (FriendLoginUpdate var13 = (FriendLoginUpdate)this.friendLoginUpdates.last(); var13 != null; var13 = (FriendLoginUpdate)this.friendLoginUpdates.previous()) { // L: 72
								if (var13.username.equals(var4)) { // L: 73
									if (var6 != 0 && var13.world == 0) { // L: 74
										var13.remove(); // L: 75
										var14 = false; // L: 76
									} else if (var6 == 0 && var13.world != 0) { // L: 78
										var13.remove(); // L: 79
										var14 = false; // L: 80
									}
								}
							}

							if (var14) { // L: 84
								this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4, var6));
							}
						}
					} else {
						if (this.getSize() >= 400) { // L: 87
							continue;
						}

						var11 = (Friend)this.addLast(var4, var5); // L: 88
					}

					if (var6 != var11.world) { // L: 91
						var11.int2 = ++this.field4286 - 1; // L: 92
						if (var11.world == -1 && var6 == 0) { // L: 93
							var11.int2 = -(var11.int2 * -1691529257) * 1716524007;
						}

						var11.world = var6; // L: 94
					}

					var11.rank = var7; // L: 96
					var11.field4299 = var9; // L: 97
					var11.field4298 = var10; // L: 98
					continue; // L: 99
				}

				throw new IllegalStateException();
			}

			this.sort(); // L: 100
			return; // L: 101
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "1"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) { // L: 8710
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) { // L: 8711
			Client.mouseCrossX = var6; // L: 8837
			Client.mouseCrossY = var7; // L: 8838
			Client.mouseCrossColor = 2; // L: 8839
			Client.mouseCrossState = 0; // L: 8840
			Client.destinationX = var0; // L: 8841
			Client.destinationY = var1; // L: 8842
			var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2979, Client.packetWriter.isaacCipher); // L: 8844
			var8.packetBuffer.method7863(EnumComposition.selectedItemSlot); // L: 8845
			var8.packetBuffer.writeShort(WorldMapLabelSize.baseY + var1); // L: 8846
			var8.packetBuffer.method7763(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8847
			var8.packetBuffer.writeIntME(var3); // L: 8848
			var8.packetBuffer.writeShort(WorldMapIcon_0.selectedItemId); // L: 8849
			var8.packetBuffer.method7784(ModeWhere.selectedItemWidget); // L: 8850
			var8.packetBuffer.writeShort(var0 + class28.baseX); // L: 8851
			Client.packetWriter.addNode(var8); // L: 8852
		} else if (var2 == 2) {
			Client.mouseCrossX = var6; // L: 8930
			Client.mouseCrossY = var7; // L: 8931
			Client.mouseCrossColor = 2; // L: 8932
			Client.mouseCrossState = 0; // L: 8933
			Client.destinationX = var0; // L: 8934
			Client.destinationY = var1; // L: 8935
			var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2992, Client.packetWriter.isaacCipher); // L: 8936
			var8.packetBuffer.writeIntME(WorldMapLabelSize.baseY + var1); // L: 8937
			var8.packetBuffer.writeShort(var3); // L: 8938
			var8.packetBuffer.method7929(var0 + class28.baseX); // L: 8939
			var8.packetBuffer.writeIntME(Client.selectedSpellChildIndex); // L: 8940
			var8.packetBuffer.method7763(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8941
			var8.packetBuffer.method7784(NetCache.selectedSpellWidget); // L: 8942
			var8.packetBuffer.method7863(Client.selectedSpellItemId); // L: 8943
			Client.packetWriter.addNode(var8); // L: 8944
		} else if (var2 == 3) {
			Client.mouseCrossX = var6; // L: 8971
			Client.mouseCrossY = var7; // L: 8972
			Client.mouseCrossColor = 2; // L: 8973
			Client.mouseCrossState = 0; // L: 8974
			Client.destinationX = var0; // L: 8975
			Client.destinationY = var1; // L: 8976
			var8 = EnumComposition.getPacketBufferNode(ClientPacket.field3005, Client.packetWriter.isaacCipher); // L: 8978
			var8.packetBuffer.method7929(WorldMapLabelSize.baseY + var1); // L: 8979
			var8.packetBuffer.method7929(var0 + class28.baseX); // L: 8980
			var8.packetBuffer.method7763(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8981
			var8.packetBuffer.writeIntME(var3); // L: 8982
			Client.packetWriter.addNode(var8); // L: 8983
		} else if (var2 == 4) {
			Client.mouseCrossX = var6; // L: 9076
			Client.mouseCrossY = var7; // L: 9077
			Client.mouseCrossColor = 2; // L: 9078
			Client.mouseCrossState = 0; // L: 9079
			Client.destinationX = var0; // L: 9080
			Client.destinationY = var1; // L: 9081
			var8 = EnumComposition.getPacketBufferNode(ClientPacket.field3003, Client.packetWriter.isaacCipher); // L: 9083
			var8.packetBuffer.method7762(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9084
			var8.packetBuffer.writeShort(WorldMapLabelSize.baseY + var1); // L: 9085
			var8.packetBuffer.writeShort(var0 + class28.baseX); // L: 9086
			var8.packetBuffer.method7929(var3); // L: 9087
			Client.packetWriter.addNode(var8); // L: 9088
		} else if (var2 == 5) {
			Client.mouseCrossX = var6; // L: 8870
			Client.mouseCrossY = var7; // L: 8871
			Client.mouseCrossColor = 2; // L: 8872
			Client.mouseCrossState = 0; // L: 8873
			Client.destinationX = var0; // L: 8874
			Client.destinationY = var1; // L: 8875
			var8 = EnumComposition.getPacketBufferNode(ClientPacket.field3009, Client.packetWriter.isaacCipher); // L: 8877
			var8.packetBuffer.method7763(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8878
			var8.packetBuffer.method7863(var0 + class28.baseX); // L: 8879
			var8.packetBuffer.method7863(WorldMapLabelSize.baseY + var1); // L: 8880
			var8.packetBuffer.writeShort(var3); // L: 8881
			Client.packetWriter.addNode(var8); // L: 8882
		} else if (var2 == 6) {
			Client.mouseCrossX = var6; // L: 9323
			Client.mouseCrossY = var7; // L: 9324
			Client.mouseCrossColor = 2; // L: 9325
			Client.mouseCrossState = 0; // L: 9326
			Client.destinationX = var0; // L: 9327
			Client.destinationY = var1; // L: 9328
			var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2936, Client.packetWriter.isaacCipher); // L: 9330
			var8.packetBuffer.method7929(WorldMapLabelSize.baseY + var1); // L: 9331
			var8.packetBuffer.writeShort(var0 + class28.baseX); // L: 9332
			var8.packetBuffer.method7762(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9333
			var8.packetBuffer.method7863(var3); // L: 9334
			Client.packetWriter.addNode(var8); // L: 9335
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3]; // L: 9444
				if (var13 != null) { // L: 9445
					Client.mouseCrossX = var6; // L: 9446
					Client.mouseCrossY = var7; // L: 9447
					Client.mouseCrossColor = 2; // L: 9448
					Client.mouseCrossState = 0; // L: 9449
					Client.destinationX = var0; // L: 9450
					Client.destinationY = var1; // L: 9451
					var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2910, Client.packetWriter.isaacCipher); // L: 9453
					var9.packetBuffer.writeInt(ModeWhere.selectedItemWidget); // L: 9454
					var9.packetBuffer.writeIntME(EnumComposition.selectedItemSlot); // L: 9455
					var9.packetBuffer.method7929(var3); // L: 9456
					var9.packetBuffer.writeIntME(WorldMapIcon_0.selectedItemId); // L: 9457
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9458
					Client.packetWriter.addNode(var9); // L: 9459
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3]; // L: 9005
				if (var13 != null) { // L: 9006
					Client.mouseCrossX = var6; // L: 9007
					Client.mouseCrossY = var7; // L: 9008
					Client.mouseCrossColor = 2; // L: 9009
					Client.mouseCrossState = 0; // L: 9010
					Client.destinationX = var0; // L: 9011
					Client.destinationY = var1; // L: 9012
					var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2911, Client.packetWriter.isaacCipher); // L: 9013
					var9.packetBuffer.method7760(NetCache.selectedSpellWidget); // L: 9014
					var9.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 9015
					var9.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 9016
					var9.packetBuffer.method7929(var3); // L: 9017
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9018
					Client.packetWriter.addNode(var9); // L: 9019
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3]; // L: 9275
				if (var13 != null) { // L: 9276
					Client.mouseCrossX = var6; // L: 9277
					Client.mouseCrossY = var7; // L: 9278
					Client.mouseCrossColor = 2; // L: 9279
					Client.mouseCrossState = 0; // L: 9280
					Client.destinationX = var0; // L: 9281
					Client.destinationY = var1; // L: 9282
					var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2939, Client.packetWriter.isaacCipher); // L: 9284
					var9.packetBuffer.method7863(var3); // L: 9285
					var9.packetBuffer.method7764(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9286
					Client.packetWriter.addNode(var9); // L: 9287
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3]; // L: 8712
				if (var13 != null) { // L: 8713
					Client.mouseCrossX = var6; // L: 8714
					Client.mouseCrossY = var7; // L: 8715
					Client.mouseCrossColor = 2; // L: 8716
					Client.mouseCrossState = 0; // L: 8717
					Client.destinationX = var0; // L: 8718
					Client.destinationY = var1; // L: 8719
					var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2948, Client.packetWriter.isaacCipher); // L: 8721
					var9.packetBuffer.method7763(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8722
					var9.packetBuffer.writeIntME(var3); // L: 8723
					Client.packetWriter.addNode(var9); // L: 8724
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3]; // L: 9463
				if (var13 != null) { // L: 9464
					Client.mouseCrossX = var6; // L: 9465
					Client.mouseCrossY = var7; // L: 9466
					Client.mouseCrossColor = 2; // L: 9467
					Client.mouseCrossState = 0; // L: 9468
					Client.destinationX = var0; // L: 9469
					Client.destinationY = var1; // L: 9470
					var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2984, Client.packetWriter.isaacCipher); // L: 9472
					var9.packetBuffer.method7863(var3); // L: 9473
					var9.packetBuffer.method7762(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9474
					Client.packetWriter.addNode(var9); // L: 9475
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3]; // L: 9045
				if (var13 != null) { // L: 9046
					Client.mouseCrossX = var6; // L: 9047
					Client.mouseCrossY = var7; // L: 9048
					Client.mouseCrossColor = 2; // L: 9049
					Client.mouseCrossState = 0; // L: 9050
					Client.destinationX = var0; // L: 9051
					Client.destinationY = var1; // L: 9052
					var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2940, Client.packetWriter.isaacCipher); // L: 9054
					var9.packetBuffer.writeShort(var3); // L: 9055
					var9.packetBuffer.method7764(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9056
					Client.packetWriter.addNode(var9); // L: 9057
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3]; // L: 8752
				if (var13 != null) { // L: 8753
					Client.mouseCrossX = var6; // L: 8754
					Client.mouseCrossY = var7; // L: 8755
					Client.mouseCrossColor = 2; // L: 8756
					Client.mouseCrossState = 0; // L: 8757
					Client.destinationX = var0; // L: 8758
					Client.destinationY = var1; // L: 8759
					var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2907, Client.packetWriter.isaacCipher); // L: 8761
					var9.packetBuffer.method7929(var3); // L: 8762
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8763
					Client.packetWriter.addNode(var9); // L: 8764
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3]; // L: 8768
					if (var15 != null) { // L: 8769
						Client.mouseCrossX = var6; // L: 8770
						Client.mouseCrossY = var7; // L: 8771
						Client.mouseCrossColor = 2; // L: 8772
						Client.mouseCrossState = 0; // L: 8773
						Client.destinationX = var0; // L: 8774
						Client.destinationY = var1; // L: 8775
						var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2908, Client.packetWriter.isaacCipher); // L: 8777
						var9.packetBuffer.method7863(var3); // L: 8778
						var9.packetBuffer.method7863(WorldMapIcon_0.selectedItemId); // L: 8779
						var9.packetBuffer.method7764(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8780
						var9.packetBuffer.method7863(EnumComposition.selectedItemSlot); // L: 8781
						var9.packetBuffer.writeInt(ModeWhere.selectedItemWidget); // L: 8782
						Client.packetWriter.addNode(var9); // L: 8783
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3]; // L: 9184
					if (var15 != null) { // L: 9185
						Client.mouseCrossX = var6; // L: 9186
						Client.mouseCrossY = var7; // L: 9187
						Client.mouseCrossColor = 2; // L: 9188
						Client.mouseCrossState = 0; // L: 9189
						Client.destinationX = var0; // L: 9190
						Client.destinationY = var1; // L: 9191
						var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2924, Client.packetWriter.isaacCipher); // L: 9192
						var9.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 9193
						var9.packetBuffer.method7929(var3); // L: 9194
						var9.packetBuffer.method7763(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9195
						var9.packetBuffer.writeInt(NetCache.selectedSpellWidget); // L: 9196
						var9.packetBuffer.writeIntME(Client.selectedSpellItemId); // L: 9197
						Client.packetWriter.addNode(var9); // L: 9198
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6; // L: 8900
					Client.mouseCrossY = var7; // L: 8901
					Client.mouseCrossColor = 2; // L: 8902
					Client.mouseCrossState = 0; // L: 8903
					Client.destinationX = var0; // L: 8904
					Client.destinationY = var1; // L: 8905
					var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2997, Client.packetWriter.isaacCipher); // L: 8907
					var8.packetBuffer.writeShort(WorldMapLabelSize.baseY + var1); // L: 8908
					var8.packetBuffer.writeInt(ModeWhere.selectedItemWidget); // L: 8909
					var8.packetBuffer.method7929(EnumComposition.selectedItemSlot); // L: 8910
					var8.packetBuffer.method7863(WorldMapIcon_0.selectedItemId); // L: 8911
					var8.packetBuffer.method7763(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8912
					var8.packetBuffer.method7863(var3); // L: 8913
					var8.packetBuffer.writeShort(var0 + class28.baseX); // L: 8914
					Client.packetWriter.addNode(var8); // L: 8915
				} else if (var2 == 17) {
					Client.mouseCrossX = var6; // L: 9479
					Client.mouseCrossY = var7; // L: 9480
					Client.mouseCrossColor = 2; // L: 9481
					Client.mouseCrossState = 0; // L: 9482
					Client.destinationX = var0; // L: 9483
					Client.destinationY = var1; // L: 9484
					var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2980, Client.packetWriter.isaacCipher); // L: 9485
					var8.packetBuffer.writeIntME(var3); // L: 9486
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9487
					var8.packetBuffer.method7863(var0 + class28.baseX); // L: 9488
					var8.packetBuffer.method7929(Client.selectedSpellChildIndex); // L: 9489
					var8.packetBuffer.writeIntME(Client.selectedSpellItemId); // L: 9490
					var8.packetBuffer.method7863(WorldMapLabelSize.baseY + var1); // L: 9491
					var8.packetBuffer.method7760(NetCache.selectedSpellWidget); // L: 9492
					Client.packetWriter.addNode(var8); // L: 9493
				} else if (var2 == 18) {
					Client.mouseCrossX = var6; // L: 9061
					Client.mouseCrossY = var7; // L: 9062
					Client.mouseCrossColor = 2; // L: 9063
					Client.mouseCrossState = 0; // L: 9064
					Client.destinationX = var0; // L: 9065
					Client.destinationY = var1; // L: 9066
					var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2909, Client.packetWriter.isaacCipher); // L: 9068
					var8.packetBuffer.method7929(var0 + class28.baseX); // L: 9069
					var8.packetBuffer.method7863(var3); // L: 9070
					var8.packetBuffer.writeShort(WorldMapLabelSize.baseY + var1); // L: 9071
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9072
					Client.packetWriter.addNode(var8); // L: 9073
				} else if (var2 == 19) {
					Client.mouseCrossX = var6; // L: 8885
					Client.mouseCrossY = var7; // L: 8886
					Client.mouseCrossColor = 2; // L: 8887
					Client.mouseCrossState = 0; // L: 8888
					Client.destinationX = var0; // L: 8889
					Client.destinationY = var1; // L: 8890
					var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2919, Client.packetWriter.isaacCipher); // L: 8892
					var8.packetBuffer.method7929(WorldMapLabelSize.baseY + var1); // L: 8893
					var8.packetBuffer.method7929(var3); // L: 8894
					var8.packetBuffer.method7762(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8895
					var8.packetBuffer.method7929(var0 + class28.baseX); // L: 8896
					Client.packetWriter.addNode(var8); // L: 8897
				} else if (var2 == 20) {
					Client.mouseCrossX = var6; // L: 9247
					Client.mouseCrossY = var7; // L: 9248
					Client.mouseCrossColor = 2; // L: 9249
					Client.mouseCrossState = 0; // L: 9250
					Client.destinationX = var0; // L: 9251
					Client.destinationY = var1; // L: 9252
					var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2920, Client.packetWriter.isaacCipher); // L: 9254
					var8.packetBuffer.writeShort(WorldMapLabelSize.baseY + var1); // L: 9255
					var8.packetBuffer.method7764(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9256
					var8.packetBuffer.method7863(var3); // L: 9257
					var8.packetBuffer.writeIntME(var0 + class28.baseX); // L: 9258
					Client.packetWriter.addNode(var8); // L: 9259
				} else if (var2 == 21) {
					Client.mouseCrossX = var6; // L: 8855
					Client.mouseCrossY = var7; // L: 8856
					Client.mouseCrossColor = 2; // L: 8857
					Client.mouseCrossState = 0; // L: 8858
					Client.destinationX = var0; // L: 8859
					Client.destinationY = var1; // L: 8860
					var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2955, Client.packetWriter.isaacCipher); // L: 8862
					var8.packetBuffer.method7863(var0 + class28.baseX); // L: 8863
					var8.packetBuffer.method7929(var3); // L: 8864
					var8.packetBuffer.method7763(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8865
					var8.packetBuffer.writeShort(WorldMapLabelSize.baseY + var1); // L: 8866
					Client.packetWriter.addNode(var8); // L: 8867
				} else if (var2 == 22) {
					Client.mouseCrossX = var6; // L: 9169
					Client.mouseCrossY = var7; // L: 9170
					Client.mouseCrossColor = 2; // L: 9171
					Client.mouseCrossState = 0; // L: 9172
					Client.destinationX = var0; // L: 9173
					Client.destinationY = var1; // L: 9174
					var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2961, Client.packetWriter.isaacCipher); // L: 9176
					var8.packetBuffer.method7863(var0 + class28.baseX); // L: 9177
					var8.packetBuffer.method7764(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9178
					var8.packetBuffer.method7929(var3); // L: 9179
					var8.packetBuffer.writeShort(WorldMapLabelSize.baseY + var1); // L: 9180
					Client.packetWriter.addNode(var8); // L: 9181
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 8744
						class356.scene.setViewportWalking(); // L: 8745
					} else {
						class356.scene.menuOpen(PacketWriter.Client_plane, var0, var1, true); // L: 8748
					}
				} else {
					PacketBufferNode var12;
					Widget var16;
					if (var2 == 24) {
						var16 = class140.getWidget(var1); // L: 8947
						if (var16 != null) { // L: 8948
							boolean var11 = true; // L: 8949
							if (var16.contentType > 0) { // L: 8950
								var11 = Message.method1065(var16);
							}

							if (var11) { // L: 8951
								var12 = EnumComposition.getPacketBufferNode(ClientPacket.field2999, Client.packetWriter.isaacCipher); // L: 8953
								var12.packetBuffer.writeInt(var1); // L: 8954
								Client.packetWriter.addNode(var12); // L: 8955
							}
						}
					} else {
						if (var2 == 25) {
							var16 = ScriptFrame.getWidgetChild(var1, var0); // L: 9262
							if (var16 != null) { // L: 9263
								WorldMapDecoration.Widget_runOnTargetLeave(); // L: 9264
								GrandExchangeOfferAgeComparator.selectSpell(var1, var0, WorldMapID.Widget_unpackTargetMask(class124.getWidgetFlags(var16)), var16.itemId); // L: 9265
								Client.isItemSelected = 0; // L: 9266
								Client.selectedSpellActionName = WorldMapIcon_0.Widget_getSpellActionName(var16); // L: 9267
								if (Client.selectedSpellActionName == null) { // L: 9268
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) { // L: 9269
									Client.selectedSpellName = var16.dataText + class122.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = class122.colorStartTag(65280) + var16.spellName + class122.colorStartTag(16777215); // L: 9270
								}
							}

							return; // L: 9272
						}

						if (var2 == 26) {
							Occluder.method4354(); // L: 9002
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2999, Client.packetWriter.isaacCipher); // L: 8919
								var8.packetBuffer.writeInt(var1); // L: 8920
								Client.packetWriter.addNode(var8); // L: 8921
								var14 = class140.getWidget(var1); // L: 8922
								if (var14 != null && var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 8923
									var10 = var14.cs1Instructions[0][1]; // L: 8924
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10]; // L: 8925
									class306.changeGameOptions(var10); // L: 8926
								}
							} else if (var2 == 29) {
								var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2999, Client.packetWriter.isaacCipher); // L: 9417
								var8.packetBuffer.writeInt(var1); // L: 9418
								Client.packetWriter.addNode(var8); // L: 9419
								var14 = class140.getWidget(var1); // L: 9420
								if (var14 != null && var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 9421
									var10 = var14.cs1Instructions[0][1]; // L: 9422
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) { // L: 9423
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0]; // L: 9424
										class306.changeGameOptions(var10); // L: 9425
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 9213
									class362.resumePauseWidget(var1, var0); // L: 9214
									Client.meslayerContinueWidget = ScriptFrame.getWidgetChild(var1, var0); // L: 9215
									ChatChannel.invalidateWidget(Client.meslayerContinueWidget); // L: 9216
								}
							} else if (var2 == 31) {
								var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2993, Client.packetWriter.isaacCipher); // L: 9431
								var8.packetBuffer.method7929(EnumComposition.selectedItemSlot); // L: 9432
								var8.packetBuffer.method7784(var1); // L: 9433
								var8.packetBuffer.method7783(ModeWhere.selectedItemWidget); // L: 9434
								var8.packetBuffer.method7929(var0); // L: 9435
								var8.packetBuffer.method7863(WorldMapIcon_0.selectedItemId); // L: 9436
								var8.packetBuffer.writeIntME(var3); // L: 9437
								Client.packetWriter.addNode(var8); // L: 9438
								Client.field599 = 0; // L: 9439
								class1.field4 = class140.getWidget(var1); // L: 9440
								Client.field600 = var0; // L: 9441
							} else if (var2 == 32) {
								var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2933, Client.packetWriter.isaacCipher); // L: 9298
								var8.packetBuffer.writeInt(var1); // L: 9299
								var8.packetBuffer.writeShort(var3); // L: 9300
								var8.packetBuffer.writeIntME(Client.selectedSpellChildIndex); // L: 9301
								var8.packetBuffer.method7760(NetCache.selectedSpellWidget); // L: 9302
								var8.packetBuffer.method7929(var0); // L: 9303
								Client.packetWriter.addNode(var8); // L: 9304
								Client.field599 = 0; // L: 9305
								class1.field4 = class140.getWidget(var1); // L: 9306
								Client.field600 = var0; // L: 9307
							} else if (var2 == 33) {
								var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2988, Client.packetWriter.isaacCipher); // L: 9203
								var8.packetBuffer.method7760(var1); // L: 9204
								var8.packetBuffer.writeIntME(var0); // L: 9205
								var8.packetBuffer.method7929(var3); // L: 9206
								Client.packetWriter.addNode(var8); // L: 9207
								Client.field599 = 0; // L: 9208
								class1.field4 = class140.getWidget(var1); // L: 9209
								Client.field600 = var0; // L: 9210
							} else if (var2 == 34) {
								var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2943, Client.packetWriter.isaacCipher); // L: 9221
								var8.packetBuffer.method7929(var0); // L: 9222
								var8.packetBuffer.method7784(var1); // L: 9223
								var8.packetBuffer.method7863(var3); // L: 9224
								Client.packetWriter.addNode(var8); // L: 9225
								Client.field599 = 0; // L: 9226
								class1.field4 = class140.getWidget(var1); // L: 9227
								Client.field600 = var0; // L: 9228
							} else if (var2 == 35) {
								var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2998, Client.packetWriter.isaacCipher); // L: 9108
								var8.packetBuffer.method7863(var3); // L: 9109
								var8.packetBuffer.method7760(var1); // L: 9110
								var8.packetBuffer.writeIntME(var0); // L: 9111
								Client.packetWriter.addNode(var8); // L: 9112
								Client.field599 = 0; // L: 9113
								class1.field4 = class140.getWidget(var1); // L: 9114
								Client.field600 = var0; // L: 9115
							} else if (var2 == 36) {
								var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2975, Client.packetWriter.isaacCipher); // L: 8816
								var8.packetBuffer.writeShort(var3); // L: 8817
								var8.packetBuffer.method7929(var0); // L: 8818
								var8.packetBuffer.method7783(var1); // L: 8819
								Client.packetWriter.addNode(var8); // L: 8820
								Client.field599 = 0; // L: 8821
								class1.field4 = class140.getWidget(var1); // L: 8822
								Client.field600 = var0; // L: 8823
							} else if (var2 == 37) {
								var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2968, Client.packetWriter.isaacCipher); // L: 9024
								var8.packetBuffer.writeInt(var1); // L: 9025
								var8.packetBuffer.writeIntME(var0); // L: 9026
								var8.packetBuffer.method7863(var3); // L: 9027
								Client.packetWriter.addNode(var8); // L: 9028
								Client.field599 = 0; // L: 9029
								class1.field4 = class140.getWidget(var1); // L: 9030
								Client.field600 = var0; // L: 9031
							} else {
								if (var2 == 38) {
									WorldMapDecoration.Widget_runOnTargetLeave(); // L: 8787
									var16 = class140.getWidget(var1); // L: 8788
									Client.isItemSelected = 1; // L: 8789
									EnumComposition.selectedItemSlot = var0; // L: 8790
									ModeWhere.selectedItemWidget = var1; // L: 8791
									WorldMapIcon_0.selectedItemId = var3; // L: 8792
									ChatChannel.invalidateWidget(var16); // L: 8793
									Client.selectedItemName = class122.colorStartTag(16748608) + EnumComposition.ItemDefinition_get(var3).name + class122.colorStartTag(16777215); // L: 8794
									if (Client.selectedItemName == null) { // L: 8795
										Client.selectedItemName = "null";
									}

									return; // L: 8796
								}

								if (var2 == 39) {
									var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2938, Client.packetWriter.isaacCipher); // L: 9035
									var8.packetBuffer.method7760(var1); // L: 9036
									var8.packetBuffer.method7929(var0); // L: 9037
									var8.packetBuffer.writeShort(var3); // L: 9038
									Client.packetWriter.addNode(var8); // L: 9039
									Client.field599 = 0; // L: 9040
									class1.field4 = class140.getWidget(var1); // L: 9041
									Client.field600 = var0; // L: 9042
								} else if (var2 == 40) {
									var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2978, Client.packetWriter.isaacCipher); // L: 9129
									var8.packetBuffer.method7783(var1); // L: 9130
									var8.packetBuffer.method7863(var0); // L: 9131
									var8.packetBuffer.writeIntME(var3); // L: 9132
									Client.packetWriter.addNode(var8); // L: 9133
									Client.field599 = 0; // L: 9134
									class1.field4 = class140.getWidget(var1); // L: 9135
									Client.field600 = var0; // L: 9136
								} else if (var2 == 41) {
									var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2967, Client.packetWriter.isaacCipher); // L: 9355
									var8.packetBuffer.method7863(var3); // L: 9356
									var8.packetBuffer.method7784(var1); // L: 9357
									var8.packetBuffer.writeShort(var0); // L: 9358
									Client.packetWriter.addNode(var8); // L: 9359
									Client.field599 = 0; // L: 9360
									class1.field4 = class140.getWidget(var1); // L: 9361
									Client.field600 = var0; // L: 9362
								} else if (var2 == 42) {
									var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2977, Client.packetWriter.isaacCipher); // L: 8827
									var8.packetBuffer.method7863(var0); // L: 8828
									var8.packetBuffer.writeShort(var3); // L: 8829
									var8.packetBuffer.method7783(var1); // L: 8830
									Client.packetWriter.addNode(var8); // L: 8831
									Client.field599 = 0; // L: 8832
									class1.field4 = class140.getWidget(var1); // L: 8833
									Client.field600 = var0; // L: 8834
								} else if (var2 == 43) {
									var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2935, Client.packetWriter.isaacCipher); // L: 8961
									var8.packetBuffer.method7929(var0); // L: 8962
									var8.packetBuffer.method7783(var1); // L: 8963
									var8.packetBuffer.method7929(var3); // L: 8964
									Client.packetWriter.addNode(var8); // L: 8965
									Client.field599 = 0; // L: 8966
									class1.field4 = class140.getWidget(var1); // L: 8967
									Client.field600 = var0; // L: 8968
								} else if (var2 == 44) {
									var15 = Client.players[var3]; // L: 9091
									if (var15 != null) { // L: 9092
										Client.mouseCrossX = var6; // L: 9093
										Client.mouseCrossY = var7; // L: 9094
										Client.mouseCrossColor = 2; // L: 9095
										Client.mouseCrossState = 0; // L: 9096
										Client.destinationX = var0; // L: 9097
										Client.destinationY = var1; // L: 9098
										var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2970, Client.packetWriter.isaacCipher); // L: 9100
										var9.packetBuffer.writeShort(var3); // L: 9101
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9102
										Client.packetWriter.addNode(var9); // L: 9103
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3]; // L: 8986
									if (var15 != null) { // L: 8987
										Client.mouseCrossX = var6; // L: 8988
										Client.mouseCrossY = var7; // L: 8989
										Client.mouseCrossColor = 2; // L: 8990
										Client.mouseCrossState = 0; // L: 8991
										Client.destinationX = var0; // L: 8992
										Client.destinationY = var1; // L: 8993
										var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2994, Client.packetWriter.isaacCipher); // L: 8995
										var9.packetBuffer.method7863(var3); // L: 8996
										var9.packetBuffer.method7762(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8997
										Client.packetWriter.addNode(var9); // L: 8998
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3]; // L: 8728
									if (var15 != null) { // L: 8729
										Client.mouseCrossX = var6; // L: 8730
										Client.mouseCrossY = var7; // L: 8731
										Client.mouseCrossColor = 2; // L: 8732
										Client.mouseCrossState = 0; // L: 8733
										Client.destinationX = var0; // L: 8734
										Client.destinationY = var1; // L: 8735
										var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2986, Client.packetWriter.isaacCipher); // L: 8737
										var9.packetBuffer.method7929(var3); // L: 8738
										var9.packetBuffer.method7763(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8739
										Client.packetWriter.addNode(var9); // L: 8740
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3]; // L: 8799
									if (var15 != null) { // L: 8800
										Client.mouseCrossX = var6; // L: 8801
										Client.mouseCrossY = var7; // L: 8802
										Client.mouseCrossColor = 2; // L: 8803
										Client.mouseCrossState = 0; // L: 8804
										Client.destinationX = var0; // L: 8805
										Client.destinationY = var1; // L: 8806
										var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2991, Client.packetWriter.isaacCipher); // L: 8808
										var9.packetBuffer.method7762(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8809
										var9.packetBuffer.method7863(var3); // L: 8810
										Client.packetWriter.addNode(var9); // L: 8811
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3]; // L: 9139
									if (var15 != null) { // L: 9140
										Client.mouseCrossX = var6; // L: 9141
										Client.mouseCrossY = var7; // L: 9142
										Client.mouseCrossColor = 2; // L: 9143
										Client.mouseCrossState = 0; // L: 9144
										Client.destinationX = var0; // L: 9145
										Client.destinationY = var1; // L: 9146
										var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2953, Client.packetWriter.isaacCipher); // L: 9148
										var9.packetBuffer.writeIntME(var3); // L: 9149
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9150
										Client.packetWriter.addNode(var9); // L: 9151
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3]; // L: 9338
									if (var15 != null) { // L: 9339
										Client.mouseCrossX = var6; // L: 9340
										Client.mouseCrossY = var7; // L: 9341
										Client.mouseCrossColor = 2; // L: 9342
										Client.mouseCrossState = 0; // L: 9343
										Client.destinationX = var0; // L: 9344
										Client.destinationY = var1; // L: 9345
										var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2965, Client.packetWriter.isaacCipher); // L: 9347
										var9.packetBuffer.writeIntME(var3); // L: 9348
										var9.packetBuffer.method7762(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9349
										Client.packetWriter.addNode(var9); // L: 9350
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3]; // L: 9231
									if (var15 != null) { // L: 9232
										Client.mouseCrossX = var6; // L: 9233
										Client.mouseCrossY = var7; // L: 9234
										Client.mouseCrossColor = 2; // L: 9235
										Client.mouseCrossState = 0; // L: 9236
										Client.destinationX = var0; // L: 9237
										Client.destinationY = var1; // L: 9238
										var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2947, Client.packetWriter.isaacCipher); // L: 9240
										var9.packetBuffer.writeShort(var3); // L: 9241
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9242
										Client.packetWriter.addNode(var9); // L: 9243
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3]; // L: 9380
									if (var15 != null) { // L: 9381
										Client.mouseCrossX = var6; // L: 9382
										Client.mouseCrossY = var7; // L: 9383
										Client.mouseCrossColor = 2; // L: 9384
										Client.mouseCrossState = 0; // L: 9385
										Client.destinationX = var0; // L: 9386
										Client.destinationY = var1; // L: 9387
										var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2959, Client.packetWriter.isaacCipher); // L: 9389
										var9.packetBuffer.method7763(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9390
										var9.packetBuffer.writeShort(var3); // L: 9391
										Client.packetWriter.addNode(var9); // L: 9392
									}
								} else {
									label654: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = ScriptFrame.getWidgetChild(var1, var0); // L: 9155
												if (var16 != null) { // L: 9156
													var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2925, Client.packetWriter.isaacCipher); // L: 9158
													var9.packetBuffer.method7929(Client.selectedSpellItemId); // L: 9159
													var9.packetBuffer.method7863(Client.selectedSpellChildIndex); // L: 9160
													var9.packetBuffer.method7760(NetCache.selectedSpellWidget); // L: 9161
													var9.packetBuffer.method7929(var16.itemId); // L: 9162
													var9.packetBuffer.writeShort(var0); // L: 9163
													var9.packetBuffer.method7783(var1); // L: 9164
													Client.packetWriter.addNode(var9); // L: 9165
												}
												break label654;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6; // L: 9365
												Client.mouseCrossY = var7; // L: 9366
												Client.mouseCrossColor = 2; // L: 9367
												Client.mouseCrossState = 0; // L: 9368
												Client.destinationX = var0; // L: 9369
												Client.destinationY = var1; // L: 9370
												var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2937, Client.packetWriter.isaacCipher); // L: 9372
												var8.packetBuffer.method7929(var0 + class28.baseX); // L: 9373
												var8.packetBuffer.method7863(var3); // L: 9374
												var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9375
												var8.packetBuffer.method7929(WorldMapLabelSize.baseY + var1); // L: 9376
												Client.packetWriter.addNode(var8); // L: 9377
												break label654;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6; // L: 9118
												Client.mouseCrossY = var7; // L: 9119
												Client.mouseCrossColor = 2; // L: 9120
												Client.mouseCrossState = 0; // L: 9121
												var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2976, Client.packetWriter.isaacCipher); // L: 9123
												var8.packetBuffer.method7863(var3); // L: 9124
												Client.packetWriter.addNode(var8); // L: 9125
												break label654;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var6; // L: 9396
												Client.mouseCrossY = var7; // L: 9397
												Client.mouseCrossColor = 2; // L: 9398
												Client.mouseCrossState = 0; // L: 9399
												var13 = Client.npcs[var3]; // L: 9400
												if (var13 != null) { // L: 9401
													NPCComposition var17 = var13.definition; // L: 9402
													if (var17.transforms != null) { // L: 9403
														var17 = var17.transform();
													}

													if (var17 != null) { // L: 9404
														var12 = EnumComposition.getPacketBufferNode(ClientPacket.field2941, Client.packetWriter.isaacCipher); // L: 9406
														var12.packetBuffer.writeIntME(var17.id); // L: 9407
														Client.packetWriter.addNode(var12); // L: 9408
													}
												}
												break label654;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6; // L: 9496
												Client.mouseCrossY = var7; // L: 9497
												Client.mouseCrossColor = 2; // L: 9498
												Client.mouseCrossState = 0; // L: 9499
												var8 = EnumComposition.getPacketBufferNode(ClientPacket.field3004, Client.packetWriter.isaacCipher); // L: 9501
												var8.packetBuffer.method7929(var3); // L: 9502
												Client.packetWriter.addNode(var8); // L: 9503
												break label654;
											}

											if (var2 == 1005) {
												var16 = class140.getWidget(var1); // L: 9310
												if (var16 != null && var16.itemQuantities[var0] >= 100000) { // L: 9311
													class290.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + EnumComposition.ItemDefinition_get(var3).name);
												} else {
													var9 = EnumComposition.getPacketBufferNode(ClientPacket.field3004, Client.packetWriter.isaacCipher); // L: 9314
													var9.packetBuffer.method7929(var3); // L: 9315
													Client.packetWriter.addNode(var9); // L: 9316
												}

												Client.field599 = 0; // L: 9318
												class1.field4 = class140.getWidget(var1); // L: 9319
												Client.field600 = var0; // L: 9320
												break label654;
											}

											if (var2 != 1007) {
												if (var2 == 1009 || var2 == 1008 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
													class121.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 9413
												}
												break label654;
											}
										}

										var16 = ScriptFrame.getWidgetChild(var1, var0); // L: 9291
										if (var16 != null) { // L: 9292
											TextureProvider.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5); // L: 9293
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 9505
			Client.isItemSelected = 0; // L: 9506
			ChatChannel.invalidateWidget(class140.getWidget(ModeWhere.selectedItemWidget)); // L: 9507
		}

		if (Client.isSpellSelected) { // L: 9509
			WorldMapDecoration.Widget_runOnTargetLeave();
		}

		if (class1.field4 != null && Client.field599 == 0) { // L: 9510
			ChatChannel.invalidateWidget(class1.field4);
		}

	} // L: 9511
}
