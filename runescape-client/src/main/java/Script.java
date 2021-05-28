import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1575006245
	)
	static int field1094;
	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;
	@ObfuscatedName("n")
	String field1084;
	@ObfuscatedName("f")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("y")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("p")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1356584441
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -2056602721
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1265512819
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -162786155
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lmr;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	} // L: 23

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)[Lmr;",
		garbageValue = "920031088"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 158
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "2094340190"
	)
	static boolean method1996(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 54
			try {
				if (!class44.field318.startsWith("win")) { // L: 56
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 57
					throw new Exception();
				} else {
					String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 58

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 59
						if (var10.indexOf(var0.charAt(var4)) == -1) { // L: 60
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 62
					return true; // L: 63
				}
			} catch (Throwable var5) { // L: 65
				return false; // L: 66
			}
		} else if (var1 == 1) { // L: 69
			try {
				Object var3 = class42.method422(class44.applet, var2, new Object[]{(new URL(class44.applet.getCodeBase(), var0)).toString()}); // L: 71
				return var3 != null; // L: 72
			} catch (Throwable var6) { // L: 74
				return false; // L: 75
			}
		} else if (var1 == 2) { // L: 78
			try {
				class44.applet.getAppletContext().showDocument(new URL(class44.applet.getCodeBase(), var0), "_blank"); // L: 80
				return true; // L: 81
			} catch (Exception var7) { // L: 83
				return false; // L: 84
			}
		} else if (var1 == 3) { // L: 87
			try {
				class42.method421(class44.applet, "loggedout"); // L: 89
			} catch (Throwable var9) { // L: 91
			}

			try {
				class44.applet.getAppletContext().showDocument(new URL(class44.applet.getCodeBase(), var0), "_top"); // L: 93
				return true; // L: 94
			} catch (Exception var8) { // L: 96
				return false; // L: 97
			}
		} else {
			throw new IllegalArgumentException(); // L: 100
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Lop;",
		garbageValue = "-488222672"
	)
	static IndexedSprite method1995(boolean var0, boolean var1) {
		return var0 ? (var1 ? ClanChannel.field33 : GrandExchangeOffer.options_buttons_2Sprite) : (var1 ? Decimator.field553 : FriendSystem.options_buttons_0Sprite); // L: 184
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIZB)Ljava/lang/String;",
		garbageValue = "-128"
	)
	static String method1998(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 106
			if (var2 && var0 >= 0) { // L: 107
				int var3 = 2; // L: 108

				for (int var4 = var0 / var1; var4 != 0; ++var3) { // L: 109 110 112
					var4 /= var1; // L: 111
				}

				char[] var5 = new char[var3]; // L: 114
				var5[0] = '+'; // L: 115

				for (int var6 = var3 - 1; var6 > 0; --var6) { // L: 116
					int var7 = var0; // L: 117
					var0 /= var1; // L: 118
					int var8 = var7 - var0 * var1; // L: 119
					if (var8 >= 10) { // L: 120
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48); // L: 121
					}
				}

				return new String(var5); // L: 123
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "2054699794"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) { // L: 7786
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) { // L: 7787
			Client.mouseCrossX = var6; // L: 8140
			Client.mouseCrossY = var7; // L: 8141
			Client.mouseCrossColor = 2; // L: 8142
			Client.mouseCrossState = 0; // L: 8143
			Client.destinationX = var0; // L: 8144
			Client.destinationY = var1; // L: 8145
			var8 = class21.getPacketBufferNode(ClientPacket.field2677, Client.packetWriter.isaacCipher); // L: 8147
			var8.packetBuffer.method6619(UserComparator5.selectedItemId); // L: 8148
			var8.packetBuffer.method6602(var3); // L: 8149
			var8.packetBuffer.method6594(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8150
			var8.packetBuffer.method6602(SoundSystem.baseY + var1); // L: 8151
			var8.packetBuffer.writeInt(Player.selectedItemWidget); // L: 8152
			var8.packetBuffer.method6602(var0 + VertexNormal.baseX); // L: 8153
			var8.packetBuffer.writeShort(ClanChannelMember.selectedItemSlot); // L: 8154
			Client.packetWriter.addNode(var8); // L: 8155
		} else if (var2 == 2) {
			Client.mouseCrossX = var6; // L: 8365
			Client.mouseCrossY = var7; // L: 8366
			Client.mouseCrossColor = 2; // L: 8367
			Client.mouseCrossState = 0; // L: 8368
			Client.destinationX = var0; // L: 8369
			Client.destinationY = var1; // L: 8370
			var8 = class21.getPacketBufferNode(ClientPacket.field2643, Client.packetWriter.isaacCipher); // L: 8371
			var8.packetBuffer.method6600(var0 + VertexNormal.baseX); // L: 8372
			var8.packetBuffer.writeShort(var3); // L: 8373
			var8.packetBuffer.method6600(Client.field788); // L: 8374
			var8.packetBuffer.writeShort(SoundSystem.baseY + var1); // L: 8375
			var8.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 8376
			var8.packetBuffer.method6594(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8377
			var8.packetBuffer.method6612(Decimator.selectedSpellWidget); // L: 8378
			Client.packetWriter.addNode(var8); // L: 8379
		} else if (var2 == 3) {
			Client.mouseCrossX = var6; // L: 8037
			Client.mouseCrossY = var7; // L: 8038
			Client.mouseCrossColor = 2; // L: 8039
			Client.mouseCrossState = 0; // L: 8040
			Client.destinationX = var0; // L: 8041
			Client.destinationY = var1; // L: 8042
			var8 = class21.getPacketBufferNode(ClientPacket.field2641, Client.packetWriter.isaacCipher); // L: 8044
			var8.packetBuffer.method6594(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8045
			var8.packetBuffer.method6602(var3); // L: 8046
			var8.packetBuffer.writeShort(var0 + VertexNormal.baseX); // L: 8047
			var8.packetBuffer.method6600(SoundSystem.baseY + var1); // L: 8048
			Client.packetWriter.addNode(var8); // L: 8049
		} else if (var2 == 4) {
			Client.mouseCrossX = var6; // L: 8052
			Client.mouseCrossY = var7; // L: 8053
			Client.mouseCrossColor = 2; // L: 8054
			Client.mouseCrossState = 0; // L: 8055
			Client.destinationX = var0; // L: 8056
			Client.destinationY = var1; // L: 8057
			var8 = class21.getPacketBufferNode(ClientPacket.field2626, Client.packetWriter.isaacCipher); // L: 8059
			var8.packetBuffer.writeShort(var0 + VertexNormal.baseX); // L: 8060
			var8.packetBuffer.method6602(var3); // L: 8061
			var8.packetBuffer.method6581(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8062
			var8.packetBuffer.method6602(SoundSystem.baseY + var1); // L: 8063
			Client.packetWriter.addNode(var8); // L: 8064
		} else if (var2 == 5) {
			Client.mouseCrossX = var6; // L: 7950
			Client.mouseCrossY = var7; // L: 7951
			Client.mouseCrossColor = 2; // L: 7952
			Client.mouseCrossState = 0; // L: 7953
			Client.destinationX = var0; // L: 7954
			Client.destinationY = var1; // L: 7955
			var8 = class21.getPacketBufferNode(ClientPacket.field2672, Client.packetWriter.isaacCipher); // L: 7957
			var8.packetBuffer.method6600(var0 + VertexNormal.baseX); // L: 7958
			var8.packetBuffer.method6602(SoundSystem.baseY + var1); // L: 7959
			var8.packetBuffer.method6581(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7960
			var8.packetBuffer.method6619(var3); // L: 7961
			Client.packetWriter.addNode(var8); // L: 7962
		} else if (var2 == 6) {
			Client.mouseCrossX = var6; // L: 8334
			Client.mouseCrossY = var7; // L: 8335
			Client.mouseCrossColor = 2; // L: 8336
			Client.mouseCrossState = 0; // L: 8337
			Client.destinationX = var0; // L: 8338
			Client.destinationY = var1; // L: 8339
			var8 = class21.getPacketBufferNode(ClientPacket.field2572, Client.packetWriter.isaacCipher); // L: 8341
			var8.packetBuffer.method6619(var3); // L: 8342
			var8.packetBuffer.method6619(SoundSystem.baseY + var1); // L: 8343
			var8.packetBuffer.method6581(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8344
			var8.packetBuffer.method6602(var0 + VertexNormal.baseX); // L: 8345
			Client.packetWriter.addNode(var8); // L: 8346
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3]; // L: 8284
				if (var13 != null) { // L: 8285
					Client.mouseCrossX = var6; // L: 8286
					Client.mouseCrossY = var7; // L: 8287
					Client.mouseCrossColor = 2; // L: 8288
					Client.mouseCrossState = 0; // L: 8289
					Client.destinationX = var0; // L: 8290
					Client.destinationY = var1; // L: 8291
					var9 = class21.getPacketBufferNode(ClientPacket.field2675, Client.packetWriter.isaacCipher); // L: 8293
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8294
					var9.packetBuffer.method6602(UserComparator5.selectedItemId); // L: 8295
					var9.packetBuffer.method6612(Player.selectedItemWidget); // L: 8296
					var9.packetBuffer.method6619(var3); // L: 8297
					var9.packetBuffer.method6600(ClanChannelMember.selectedItemSlot); // L: 8298
					Client.packetWriter.addNode(var9); // L: 8299
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3]; // L: 7897
				if (var13 != null) { // L: 7898
					Client.mouseCrossX = var6; // L: 7899
					Client.mouseCrossY = var7; // L: 7900
					Client.mouseCrossColor = 2; // L: 7901
					Client.mouseCrossState = 0; // L: 7902
					Client.destinationX = var0; // L: 7903
					Client.destinationY = var1; // L: 7904
					var9 = class21.getPacketBufferNode(ClientPacket.field2599, Client.packetWriter.isaacCipher); // L: 7905
					var9.packetBuffer.method6612(Decimator.selectedSpellWidget); // L: 7906
					var9.packetBuffer.method6600(Client.field788); // L: 7907
					var9.packetBuffer.method6600(var3); // L: 7908
					var9.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 7909
					var9.packetBuffer.method6594(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7910
					Client.packetWriter.addNode(var9); // L: 7911
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3]; // L: 8268
				if (var13 != null) { // L: 8269
					Client.mouseCrossX = var6; // L: 8270
					Client.mouseCrossY = var7; // L: 8271
					Client.mouseCrossColor = 2; // L: 8272
					Client.mouseCrossState = 0; // L: 8273
					Client.destinationX = var0; // L: 8274
					Client.destinationY = var1; // L: 8275
					var9 = class21.getPacketBufferNode(ClientPacket.field2624, Client.packetWriter.isaacCipher); // L: 8277
					var9.packetBuffer.method6581(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8278
					var9.packetBuffer.method6600(var3); // L: 8279
					Client.packetWriter.addNode(var9); // L: 8280
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3]; // L: 8525
				if (var13 != null) { // L: 8526
					Client.mouseCrossX = var6; // L: 8527
					Client.mouseCrossY = var7; // L: 8528
					Client.mouseCrossColor = 2; // L: 8529
					Client.mouseCrossState = 0; // L: 8530
					Client.destinationX = var0; // L: 8531
					Client.destinationY = var1; // L: 8532
					var9 = class21.getPacketBufferNode(ClientPacket.field2670, Client.packetWriter.isaacCipher); // L: 8534
					var9.packetBuffer.method6619(var3); // L: 8535
					var9.packetBuffer.method6581(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8536
					Client.packetWriter.addNode(var9); // L: 8537
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3]; // L: 8388
				if (var13 != null) { // L: 8389
					Client.mouseCrossX = var6; // L: 8390
					Client.mouseCrossY = var7; // L: 8391
					Client.mouseCrossColor = 2; // L: 8392
					Client.mouseCrossState = 0; // L: 8393
					Client.destinationX = var0; // L: 8394
					Client.destinationY = var1; // L: 8395
					var9 = class21.getPacketBufferNode(ClientPacket.field2618, Client.packetWriter.isaacCipher); // L: 8397
					var9.packetBuffer.method6600(var3); // L: 8398
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8399
					Client.packetWriter.addNode(var9); // L: 8400
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3]; // L: 8349
				if (var13 != null) { // L: 8350
					Client.mouseCrossX = var6; // L: 8351
					Client.mouseCrossY = var7; // L: 8352
					Client.mouseCrossColor = 2; // L: 8353
					Client.mouseCrossState = 0; // L: 8354
					Client.destinationX = var0; // L: 8355
					Client.destinationY = var1; // L: 8356
					var9 = class21.getPacketBufferNode(ClientPacket.field2601, Client.packetWriter.isaacCipher); // L: 8358
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8359
					var9.packetBuffer.method6619(var3); // L: 8360
					Client.packetWriter.addNode(var9); // L: 8361
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3]; // L: 7847
				if (var13 != null) { // L: 7848
					Client.mouseCrossX = var6; // L: 7849
					Client.mouseCrossY = var7; // L: 7850
					Client.mouseCrossColor = 2; // L: 7851
					Client.mouseCrossState = 0; // L: 7852
					Client.destinationX = var0; // L: 7853
					Client.destinationY = var1; // L: 7854
					var9 = class21.getPacketBufferNode(ClientPacket.field2625, Client.packetWriter.isaacCipher); // L: 7856
					var9.packetBuffer.method6594(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7857
					var9.packetBuffer.method6602(var3); // L: 7858
					Client.packetWriter.addNode(var9); // L: 7859
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3]; // L: 8067
					if (var15 != null) { // L: 8068
						Client.mouseCrossX = var6; // L: 8069
						Client.mouseCrossY = var7; // L: 8070
						Client.mouseCrossColor = 2; // L: 8071
						Client.mouseCrossState = 0; // L: 8072
						Client.destinationX = var0; // L: 8073
						Client.destinationY = var1; // L: 8074
						var9 = class21.getPacketBufferNode(ClientPacket.field2623, Client.packetWriter.isaacCipher); // L: 8076
						var9.packetBuffer.writeIntME(Player.selectedItemWidget); // L: 8077
						var9.packetBuffer.method6619(UserComparator5.selectedItemId); // L: 8078
						var9.packetBuffer.method6581(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8079
						var9.packetBuffer.method6619(ClanChannelMember.selectedItemSlot); // L: 8080
						var9.packetBuffer.writeShort(var3); // L: 8081
						Client.packetWriter.addNode(var9); // L: 8082
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3]; // L: 8452
					if (var15 != null) { // L: 8453
						Client.mouseCrossX = var6; // L: 8454
						Client.mouseCrossY = var7; // L: 8455
						Client.mouseCrossColor = 2; // L: 8456
						Client.mouseCrossState = 0; // L: 8457
						Client.destinationX = var0; // L: 8458
						Client.destinationY = var1; // L: 8459
						var9 = class21.getPacketBufferNode(ClientPacket.field2615, Client.packetWriter.isaacCipher); // L: 8460
						var9.packetBuffer.method6619(Client.selectedSpellChildIndex); // L: 8461
						var9.packetBuffer.method6602(var3); // L: 8462
						var9.packetBuffer.method6611(Decimator.selectedSpellWidget); // L: 8463
						var9.packetBuffer.method6584(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8464
						var9.packetBuffer.method6602(Client.field788); // L: 8465
						Client.packetWriter.addNode(var9); // L: 8466
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6; // L: 7799
					Client.mouseCrossY = var7; // L: 7800
					Client.mouseCrossColor = 2; // L: 7801
					Client.mouseCrossState = 0; // L: 7802
					Client.destinationX = var0; // L: 7803
					Client.destinationY = var1; // L: 7804
					var8 = class21.getPacketBufferNode(ClientPacket.field2577, Client.packetWriter.isaacCipher); // L: 7806
					var8.packetBuffer.method6600(ClanChannelMember.selectedItemSlot); // L: 7807
					var8.packetBuffer.method6619(var3); // L: 7808
					var8.packetBuffer.method6600(UserComparator5.selectedItemId); // L: 7809
					var8.packetBuffer.method6602(SoundSystem.baseY + var1); // L: 7810
					var8.packetBuffer.method6600(var0 + VertexNormal.baseX); // L: 7811
					var8.packetBuffer.method6612(Player.selectedItemWidget); // L: 7812
					var8.packetBuffer.method6584(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7813
					Client.packetWriter.addNode(var8); // L: 7814
				} else if (var2 == 17) {
					Client.mouseCrossX = var6; // L: 8086
					Client.mouseCrossY = var7; // L: 8087
					Client.mouseCrossColor = 2; // L: 8088
					Client.mouseCrossState = 0; // L: 8089
					Client.destinationX = var0; // L: 8090
					Client.destinationY = var1; // L: 8091
					var8 = class21.getPacketBufferNode(ClientPacket.field2668, Client.packetWriter.isaacCipher); // L: 8092
					var8.packetBuffer.method6581(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8093
					var8.packetBuffer.method6611(Decimator.selectedSpellWidget); // L: 8094
					var8.packetBuffer.method6600(SoundSystem.baseY + var1); // L: 8095
					var8.packetBuffer.method6602(Client.field788); // L: 8096
					var8.packetBuffer.method6619(var3); // L: 8097
					var8.packetBuffer.writeShort(var0 + VertexNormal.baseX); // L: 8098
					var8.packetBuffer.method6600(Client.selectedSpellChildIndex); // L: 8099
					Client.packetWriter.addNode(var8); // L: 8100
				} else if (var2 == 18) {
					Client.mouseCrossX = var6; // L: 8011
					Client.mouseCrossY = var7; // L: 8012
					Client.mouseCrossColor = 2; // L: 8013
					Client.mouseCrossState = 0; // L: 8014
					Client.destinationX = var0; // L: 8015
					Client.destinationY = var1; // L: 8016
					var8 = class21.getPacketBufferNode(ClientPacket.field2666, Client.packetWriter.isaacCipher); // L: 8018
					var8.packetBuffer.writeShort(var3); // L: 8019
					var8.packetBuffer.method6584(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8020
					var8.packetBuffer.method6602(SoundSystem.baseY + var1); // L: 8021
					var8.packetBuffer.writeShort(var0 + VertexNormal.baseX); // L: 8022
					Client.packetWriter.addNode(var8); // L: 8023
				} else if (var2 == 19) {
					Client.mouseCrossX = var6; // L: 8565
					Client.mouseCrossY = var7; // L: 8566
					Client.mouseCrossColor = 2; // L: 8567
					Client.mouseCrossState = 0; // L: 8568
					Client.destinationX = var0; // L: 8569
					Client.destinationY = var1; // L: 8570
					var8 = class21.getPacketBufferNode(ClientPacket.field2659, Client.packetWriter.isaacCipher); // L: 8572
					var8.packetBuffer.method6600(var0 + VertexNormal.baseX); // L: 8573
					var8.packetBuffer.method6602(SoundSystem.baseY + var1); // L: 8574
					var8.packetBuffer.method6581(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8575
					var8.packetBuffer.method6600(var3); // L: 8576
					Client.packetWriter.addNode(var8); // L: 8577
				} else if (var2 == 20) {
					Client.mouseCrossX = var6; // L: 8470
					Client.mouseCrossY = var7; // L: 8471
					Client.mouseCrossColor = 2; // L: 8472
					Client.mouseCrossState = 0; // L: 8473
					Client.destinationX = var0; // L: 8474
					Client.destinationY = var1; // L: 8475
					var8 = class21.getPacketBufferNode(ClientPacket.field2676, Client.packetWriter.isaacCipher); // L: 8477
					var8.packetBuffer.method6619(var3); // L: 8478
					var8.packetBuffer.method6600(var0 + VertexNormal.baseX); // L: 8479
					var8.packetBuffer.method6584(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8480
					var8.packetBuffer.method6602(SoundSystem.baseY + var1); // L: 8481
					Client.packetWriter.addNode(var8); // L: 8482
				} else if (var2 == 21) {
					Client.mouseCrossX = var6; // L: 7989
					Client.mouseCrossY = var7; // L: 7990
					Client.mouseCrossColor = 2; // L: 7991
					Client.mouseCrossState = 0; // L: 7992
					Client.destinationX = var0; // L: 7993
					Client.destinationY = var1; // L: 7994
					var8 = class21.getPacketBufferNode(ClientPacket.field2575, Client.packetWriter.isaacCipher); // L: 7996
					var8.packetBuffer.method6602(var3); // L: 7997
					var8.packetBuffer.writeShort(SoundSystem.baseY + var1); // L: 7998
					var8.packetBuffer.method6581(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7999
					var8.packetBuffer.writeShort(var0 + VertexNormal.baseX); // L: 8000
					Client.packetWriter.addNode(var8); // L: 8001
				} else if (var2 == 22) {
					Client.mouseCrossX = var6; // L: 8415
					Client.mouseCrossY = var7; // L: 8416
					Client.mouseCrossColor = 2; // L: 8417
					Client.mouseCrossState = 0; // L: 8418
					Client.destinationX = var0; // L: 8419
					Client.destinationY = var1; // L: 8420
					var8 = class21.getPacketBufferNode(ClientPacket.field2649, Client.packetWriter.isaacCipher); // L: 8422
					var8.packetBuffer.method6602(var3); // L: 8423
					var8.packetBuffer.method6619(var0 + VertexNormal.baseX); // L: 8424
					var8.packetBuffer.method6594(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8425
					var8.packetBuffer.method6619(SoundSystem.baseY + var1); // L: 8426
					Client.packetWriter.addNode(var8); // L: 8427
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 8158
						AbstractSocket.scene.setViewportWalking(); // L: 8159
					} else {
						AbstractSocket.scene.menuOpen(class22.Client_plane, var0, var1, true); // L: 8162
					}
				} else {
					PacketBufferNode var11;
					Widget var16;
					if (var2 == 24) {
						var16 = Frames.getWidget(var1); // L: 8404
						boolean var12 = true; // L: 8405
						if (var16.contentType > 0) { // L: 8406
							var12 = SequenceDefinition.method3148(var16);
						}

						if (var12) { // L: 8407
							var11 = class21.getPacketBufferNode(ClientPacket.field2619, Client.packetWriter.isaacCipher); // L: 8409
							var11.packetBuffer.writeInt(var1); // L: 8410
							Client.packetWriter.addNode(var11); // L: 8411
						}
					} else {
						if (var2 == 25) {
							var16 = ModeWhere.getWidgetChild(var1, var0); // L: 8501
							if (var16 != null) { // L: 8502
								class5.Widget_runOnTargetLeave(); // L: 8503
								LoginScreenAnimation.selectSpell(var1, var0, AttackOption.Widget_unpackTargetMask(class21.getWidgetFlags(var16)), var16.itemId); // L: 8504
								Client.isItemSelected = 0; // L: 8505
								Client.selectedSpellActionName = BoundaryObject.Widget_getSpellActionName(var16); // L: 8506
								if (Client.selectedSpellActionName == null) { // L: 8507
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) { // L: 8508
									Client.selectedSpellName = var16.dataText + class44.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = class44.colorStartTag(65280) + var16.spellName + class44.colorStartTag(16777215); // L: 8509
								}
							}

							return; // L: 8511
						}

						if (var2 == 26) {
							class4.method47(); // L: 8382
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = class21.getPacketBufferNode(ClientPacket.field2619, Client.packetWriter.isaacCipher); // L: 7864
								var8.packetBuffer.writeInt(var1); // L: 7865
								Client.packetWriter.addNode(var8); // L: 7866
								var14 = Frames.getWidget(var1); // L: 7867
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 7868
									var10 = var14.cs1Instructions[0][1]; // L: 7869
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10]; // L: 7870
									ApproximateRouteStrategy.changeGameOptions(var10); // L: 7871
								}
							} else if (var2 == 29) {
								var8 = class21.getPacketBufferNode(ClientPacket.field2619, Client.packetWriter.isaacCipher); // L: 8304
								var8.packetBuffer.writeInt(var1); // L: 8305
								Client.packetWriter.addNode(var8); // L: 8306
								var14 = Frames.getWidget(var1); // L: 8307
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 8308
									var10 = var14.cs1Instructions[0][1]; // L: 8309
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) { // L: 8310
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0]; // L: 8311
										ApproximateRouteStrategy.changeGameOptions(var10); // L: 8312
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 8004
									class22.resumePauseWidget(var1, var0); // L: 8005
									Client.meslayerContinueWidget = ModeWhere.getWidgetChild(var1, var0); // L: 8006
									WorldMapCacheName.invalidateWidget(Client.meslayerContinueWidget); // L: 8007
								}
							} else if (var2 == 31) {
								var8 = class21.getPacketBufferNode(ClientPacket.field2631, Client.packetWriter.isaacCipher); // L: 7937
								var8.packetBuffer.writeInt(var1); // L: 7938
								var8.packetBuffer.writeIntME(Player.selectedItemWidget); // L: 7939
								var8.packetBuffer.method6619(var0); // L: 7940
								var8.packetBuffer.writeShort(var3); // L: 7941
								var8.packetBuffer.method6602(ClanChannelMember.selectedItemSlot); // L: 7942
								var8.packetBuffer.method6602(UserComparator5.selectedItemId); // L: 7943
								Client.packetWriter.addNode(var8); // L: 7944
								Client.field747 = 0; // L: 7945
								GrandExchangeEvents.field3626 = Frames.getWidget(var1); // L: 7946
								Client.field841 = var0; // L: 7947
							} else if (var2 == 32) {
								var8 = class21.getPacketBufferNode(ClientPacket.field2609, Client.packetWriter.isaacCipher); // L: 7977
								var8.packetBuffer.method6612(Decimator.selectedSpellWidget); // L: 7978
								var8.packetBuffer.method6619(Client.selectedSpellChildIndex); // L: 7979
								var8.packetBuffer.method6612(var1); // L: 7980
								var8.packetBuffer.method6600(var3); // L: 7981
								var8.packetBuffer.method6619(var0); // L: 7982
								Client.packetWriter.addNode(var8); // L: 7983
								Client.field747 = 0; // L: 7984
								GrandExchangeEvents.field3626 = Frames.getWidget(var1); // L: 7985
								Client.field841 = var0; // L: 7986
							} else if (var2 == 33) {
								var8 = class21.getPacketBufferNode(ClientPacket.field2585, Client.packetWriter.isaacCipher); // L: 8542
								var8.packetBuffer.method6612(var1); // L: 8543
								var8.packetBuffer.method6600(var0); // L: 8544
								var8.packetBuffer.writeShort(var3); // L: 8545
								Client.packetWriter.addNode(var8); // L: 8546
								Client.field747 = 0; // L: 8547
								GrandExchangeEvents.field3626 = Frames.getWidget(var1); // L: 8548
								Client.field841 = var0; // L: 8549
							} else if (var2 == 34) {
								var8 = class21.getPacketBufferNode(ClientPacket.field2576, Client.packetWriter.isaacCipher); // L: 7887
								var8.packetBuffer.writeIntME(var1); // L: 7888
								var8.packetBuffer.method6600(var0); // L: 7889
								var8.packetBuffer.method6600(var3); // L: 7890
								Client.packetWriter.addNode(var8); // L: 7891
								Client.field747 = 0; // L: 7892
								GrandExchangeEvents.field3626 = Frames.getWidget(var1); // L: 7893
								Client.field841 = var0; // L: 7894
							} else if (var2 == 35) {
								var8 = class21.getPacketBufferNode(ClientPacket.field2627, Client.packetWriter.isaacCipher); // L: 8442
								var8.packetBuffer.writeShort(var3); // L: 8443
								var8.packetBuffer.method6612(var1); // L: 8444
								var8.packetBuffer.method6602(var0); // L: 8445
								Client.packetWriter.addNode(var8); // L: 8446
								Client.field747 = 0; // L: 8447
								GrandExchangeEvents.field3626 = Frames.getWidget(var1); // L: 8448
								Client.field841 = var0; // L: 8449
							} else if (var2 == 36) {
								var8 = class21.getPacketBufferNode(ClientPacket.field2661, Client.packetWriter.isaacCipher); // L: 8027
								var8.packetBuffer.method6611(var1); // L: 8028
								var8.packetBuffer.method6600(var3); // L: 8029
								var8.packetBuffer.method6602(var0); // L: 8030
								Client.packetWriter.addNode(var8); // L: 8031
								Client.field747 = 0; // L: 8032
								GrandExchangeEvents.field3626 = Frames.getWidget(var1); // L: 8033
								Client.field841 = var0; // L: 8034
							} else if (var2 == 37) {
								var8 = class21.getPacketBufferNode(ClientPacket.field2673, Client.packetWriter.isaacCipher); // L: 7789
								var8.packetBuffer.writeIntME(var1); // L: 7790
								var8.packetBuffer.method6602(var0); // L: 7791
								var8.packetBuffer.writeShort(var3); // L: 7792
								Client.packetWriter.addNode(var8); // L: 7793
								Client.field747 = 0; // L: 7794
								GrandExchangeEvents.field3626 = Frames.getWidget(var1); // L: 7795
								Client.field841 = var0; // L: 7796
							} else {
								if (var2 == 38) {
									class5.Widget_runOnTargetLeave(); // L: 8198
									var16 = Frames.getWidget(var1); // L: 8199
									Client.isItemSelected = 1; // L: 8200
									ClanChannelMember.selectedItemSlot = var0; // L: 8201
									Player.selectedItemWidget = var1; // L: 8202
									UserComparator5.selectedItemId = var3; // L: 8203
									WorldMapCacheName.invalidateWidget(var16); // L: 8204
									Client.selectedItemName = class44.colorStartTag(16748608) + class260.ItemDefinition_get(var3).name + class44.colorStartTag(16777215); // L: 8205
									if (Client.selectedItemName == null) { // L: 8206
										Client.selectedItemName = "null";
									}

									return; // L: 8207
								}

								if (var2 == 39) {
									var8 = class21.getPacketBufferNode(ClientPacket.field2581, Client.packetWriter.isaacCipher); // L: 8431
									var8.packetBuffer.method6602(var0); // L: 8432
									var8.packetBuffer.method6600(var3); // L: 8433
									var8.packetBuffer.method6611(var1); // L: 8434
									Client.packetWriter.addNode(var8); // L: 8435
									Client.field747 = 0; // L: 8436
									GrandExchangeEvents.field3626 = Frames.getWidget(var1); // L: 8437
									Client.field841 = var0; // L: 8438
								} else if (var2 == 40) {
									var8 = class21.getPacketBufferNode(ClientPacket.field2579, Client.packetWriter.isaacCipher); // L: 8515
									var8.packetBuffer.method6600(var0); // L: 8516
									var8.packetBuffer.writeIntME(var1); // L: 8517
									var8.packetBuffer.method6619(var3); // L: 8518
									Client.packetWriter.addNode(var8); // L: 8519
									Client.field747 = 0; // L: 8520
									GrandExchangeEvents.field3626 = Frames.getWidget(var1); // L: 8521
									Client.field841 = var0; // L: 8522
								} else if (var2 == 41) {
									var8 = class21.getPacketBufferNode(ClientPacket.field2639, Client.packetWriter.isaacCipher); // L: 7966
									var8.packetBuffer.method6600(var3); // L: 7967
									var8.packetBuffer.method6619(var0); // L: 7968
									var8.packetBuffer.writeIntME(var1); // L: 7969
									Client.packetWriter.addNode(var8); // L: 7970
									Client.field747 = 0; // L: 7971
									GrandExchangeEvents.field3626 = Frames.getWidget(var1); // L: 7972
									Client.field841 = var0; // L: 7973
								} else if (var2 == 42) {
									var8 = class21.getPacketBufferNode(ClientPacket.field2635, Client.packetWriter.isaacCipher); // L: 7926
									var8.packetBuffer.method6612(var1); // L: 7927
									var8.packetBuffer.writeShort(var3); // L: 7928
									var8.packetBuffer.method6619(var0); // L: 7929
									Client.packetWriter.addNode(var8); // L: 7930
									Client.field747 = 0; // L: 7931
									GrandExchangeEvents.field3626 = Frames.getWidget(var1); // L: 7932
									Client.field841 = var0; // L: 7933
								} else if (var2 == 43) {
									var8 = class21.getPacketBufferNode(ClientPacket.field2633, Client.packetWriter.isaacCipher); // L: 7876
									var8.packetBuffer.method6619(var3); // L: 7877
									var8.packetBuffer.method6602(var0); // L: 7878
									var8.packetBuffer.method6611(var1); // L: 7879
									Client.packetWriter.addNode(var8); // L: 7880
									Client.field747 = 0; // L: 7881
									GrandExchangeEvents.field3626 = Frames.getWidget(var1); // L: 7882
									Client.field841 = var0; // L: 7883
								} else if (var2 == 44) {
									var15 = Client.players[var3]; // L: 8252
									if (var15 != null) { // L: 8253
										Client.mouseCrossX = var6; // L: 8254
										Client.mouseCrossY = var7; // L: 8255
										Client.mouseCrossColor = 2; // L: 8256
										Client.mouseCrossState = 0; // L: 8257
										Client.destinationX = var0; // L: 8258
										Client.destinationY = var1; // L: 8259
										var9 = class21.getPacketBufferNode(ClientPacket.field2597, Client.packetWriter.isaacCipher); // L: 8261
										var9.packetBuffer.method6619(var3); // L: 8262
										var9.packetBuffer.method6584(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8263
										Client.packetWriter.addNode(var9); // L: 8264
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3]; // L: 8210
									if (var15 != null) { // L: 8211
										Client.mouseCrossX = var6; // L: 8212
										Client.mouseCrossY = var7; // L: 8213
										Client.mouseCrossColor = 2; // L: 8214
										Client.mouseCrossState = 0; // L: 8215
										Client.destinationX = var0; // L: 8216
										Client.destinationY = var1; // L: 8217
										var9 = class21.getPacketBufferNode(ClientPacket.field2654, Client.packetWriter.isaacCipher); // L: 8219
										var9.packetBuffer.method6600(var3); // L: 8220
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8221
										Client.packetWriter.addNode(var9); // L: 8222
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3]; // L: 8166
									if (var15 != null) { // L: 8167
										Client.mouseCrossX = var6; // L: 8168
										Client.mouseCrossY = var7; // L: 8169
										Client.mouseCrossColor = 2; // L: 8170
										Client.mouseCrossState = 0; // L: 8171
										Client.destinationX = var0; // L: 8172
										Client.destinationY = var1; // L: 8173
										var9 = class21.getPacketBufferNode(ClientPacket.field2637, Client.packetWriter.isaacCipher); // L: 8175
										var9.packetBuffer.method6584(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8176
										var9.packetBuffer.writeShort(var3); // L: 8177
										Client.packetWriter.addNode(var9); // L: 8178
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3]; // L: 7817
									if (var15 != null) { // L: 7818
										Client.mouseCrossX = var6; // L: 7819
										Client.mouseCrossY = var7; // L: 7820
										Client.mouseCrossColor = 2; // L: 7821
										Client.mouseCrossState = 0; // L: 7822
										Client.destinationX = var0; // L: 7823
										Client.destinationY = var1; // L: 7824
										var9 = class21.getPacketBufferNode(ClientPacket.field2605, Client.packetWriter.isaacCipher); // L: 7826
										var9.packetBuffer.method6619(var3); // L: 7827
										var9.packetBuffer.method6584(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7828
										Client.packetWriter.addNode(var9); // L: 7829
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3]; // L: 8182
									if (var15 != null) { // L: 8183
										Client.mouseCrossX = var6; // L: 8184
										Client.mouseCrossY = var7; // L: 8185
										Client.mouseCrossColor = 2; // L: 8186
										Client.mouseCrossState = 0; // L: 8187
										Client.destinationX = var0; // L: 8188
										Client.destinationY = var1; // L: 8189
										var9 = class21.getPacketBufferNode(ClientPacket.field2602, Client.packetWriter.isaacCipher); // L: 8191
										var9.packetBuffer.method6602(var3); // L: 8192
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8193
										Client.packetWriter.addNode(var9); // L: 8194
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3]; // L: 8103
									if (var15 != null) { // L: 8104
										Client.mouseCrossX = var6; // L: 8105
										Client.mouseCrossY = var7; // L: 8106
										Client.mouseCrossColor = 2; // L: 8107
										Client.mouseCrossState = 0; // L: 8108
										Client.destinationX = var0; // L: 8109
										Client.destinationY = var1; // L: 8110
										var9 = class21.getPacketBufferNode(ClientPacket.field2636, Client.packetWriter.isaacCipher); // L: 8112
										var9.packetBuffer.method6581(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8113
										var9.packetBuffer.method6602(var3); // L: 8114
										Client.packetWriter.addNode(var9); // L: 8115
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3]; // L: 8226
									if (var15 != null) { // L: 8227
										Client.mouseCrossX = var6; // L: 8228
										Client.mouseCrossY = var7; // L: 8229
										Client.mouseCrossColor = 2; // L: 8230
										Client.mouseCrossState = 0; // L: 8231
										Client.destinationX = var0; // L: 8232
										Client.destinationY = var1; // L: 8233
										var9 = class21.getPacketBufferNode(ClientPacket.field2620, Client.packetWriter.isaacCipher); // L: 8235
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8236
										var9.packetBuffer.method6602(var3); // L: 8237
										Client.packetWriter.addNode(var9); // L: 8238
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3]; // L: 8485
									if (var15 != null) { // L: 8486
										Client.mouseCrossX = var6; // L: 8487
										Client.mouseCrossY = var7; // L: 8488
										Client.mouseCrossColor = 2; // L: 8489
										Client.mouseCrossState = 0; // L: 8490
										Client.destinationX = var0; // L: 8491
										Client.destinationY = var1; // L: 8492
										var9 = class21.getPacketBufferNode(ClientPacket.field2656, Client.packetWriter.isaacCipher); // L: 8494
										var9.packetBuffer.writeShort(var3); // L: 8495
										var9.packetBuffer.method6594(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8496
										Client.packetWriter.addNode(var9); // L: 8497
									}
								} else {
									label642: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = ModeWhere.getWidgetChild(var1, var0); // L: 7833
												if (var16 != null) { // L: 7834
													var9 = class21.getPacketBufferNode(ClientPacket.field2598, Client.packetWriter.isaacCipher); // L: 7836
													var9.packetBuffer.writeIntME(var1); // L: 7837
													var9.packetBuffer.method6619(var16.itemId); // L: 7838
													var9.packetBuffer.method6600(Client.field788); // L: 7839
													var9.packetBuffer.writeInt(Decimator.selectedSpellWidget); // L: 7840
													var9.packetBuffer.method6619(Client.selectedSpellChildIndex); // L: 7841
													var9.packetBuffer.method6600(var0); // L: 7842
													Client.packetWriter.addNode(var9); // L: 7843
												}
												break label642;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6; // L: 8125
												Client.mouseCrossY = var7; // L: 8126
												Client.mouseCrossColor = 2; // L: 8127
												Client.mouseCrossState = 0; // L: 8128
												Client.destinationX = var0; // L: 8129
												Client.destinationY = var1; // L: 8130
												var8 = class21.getPacketBufferNode(ClientPacket.field2640, Client.packetWriter.isaacCipher); // L: 8132
												var8.packetBuffer.method6602(var0 + VertexNormal.baseX); // L: 8133
												var8.packetBuffer.method6594(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8134
												var8.packetBuffer.writeShort(var3); // L: 8135
												var8.packetBuffer.method6602(SoundSystem.baseY + var1); // L: 8136
												Client.packetWriter.addNode(var8); // L: 8137
												break label642;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6; // L: 7915
												Client.mouseCrossY = var7; // L: 7916
												Client.mouseCrossColor = 2; // L: 7917
												Client.mouseCrossState = 0; // L: 7918
												var8 = class21.getPacketBufferNode(ClientPacket.field2591, Client.packetWriter.isaacCipher); // L: 7920
												var8.packetBuffer.method6600(var3); // L: 7921
												Client.packetWriter.addNode(var8); // L: 7922
												break label642;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var6; // L: 8317
												Client.mouseCrossY = var7; // L: 8318
												Client.mouseCrossColor = 2; // L: 8319
												Client.mouseCrossState = 0; // L: 8320
												var13 = Client.npcs[var3]; // L: 8321
												if (var13 != null) { // L: 8322
													NPCComposition var17 = var13.definition; // L: 8323
													if (var17.transforms != null) { // L: 8324
														var17 = var17.transform();
													}

													if (var17 != null) { // L: 8325
														var11 = class21.getPacketBufferNode(ClientPacket.field2578, Client.packetWriter.isaacCipher); // L: 8327
														var11.packetBuffer.method6600(var17.id); // L: 8328
														Client.packetWriter.addNode(var11); // L: 8329
													}
												}
												break label642;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6; // L: 8242
												Client.mouseCrossY = var7; // L: 8243
												Client.mouseCrossColor = 2; // L: 8244
												Client.mouseCrossState = 0; // L: 8245
												var8 = class21.getPacketBufferNode(ClientPacket.field2646, Client.packetWriter.isaacCipher); // L: 8247
												var8.packetBuffer.method6600(var3); // L: 8248
												Client.packetWriter.addNode(var8); // L: 8249
												break label642;
											}

											if (var2 == 1005) {
												var16 = Frames.getWidget(var1); // L: 8552
												if (var16 != null && var16.itemQuantities[var0] >= 100000) { // L: 8553
													World.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + class260.ItemDefinition_get(var3).name);
												} else {
													var9 = class21.getPacketBufferNode(ClientPacket.field2646, Client.packetWriter.isaacCipher); // L: 8556
													var9.packetBuffer.method6600(var3); // L: 8557
													Client.packetWriter.addNode(var9); // L: 8558
												}

												Client.field747 = 0; // L: 8560
												GrandExchangeEvents.field3626 = Frames.getWidget(var1); // L: 8561
												Client.field841 = var0; // L: 8562
												break label642;
											}

											if (var2 != 1007) {
												if (var2 == 1009 || var2 == 1008 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
													class243.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 8385
												}
												break label642;
											}
										}

										var16 = ModeWhere.getWidgetChild(var1, var0); // L: 8119
										if (var16 != null) { // L: 8120
											class376.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5); // L: 8121
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 8579
			Client.isItemSelected = 0; // L: 8580
			WorldMapCacheName.invalidateWidget(Frames.getWidget(Player.selectedItemWidget)); // L: 8581
		}

		if (Client.isSpellSelected) { // L: 8583
			class5.Widget_runOnTargetLeave();
		}

		if (GrandExchangeEvents.field3626 != null && Client.field747 == 0) { // L: 8584
			WorldMapCacheName.invalidateWidget(GrandExchangeEvents.field3626);
		}

	} // L: 8585

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2124366444"
	)
	static void method1999() {
		if (Client.oculusOrbState == 1) { // L: 11504
			Client.field724 = true; // L: 11505
		}

	} // L: 11507
}
