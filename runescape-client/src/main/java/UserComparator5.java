import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkz;Lkz;B)I",
		garbageValue = "8"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) {
			if (var2.world == 0) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1; // L: 18
		}

		return this.compareUser(var1, var2); // L: 20
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 24
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-1024728099"
	)
	public static int method3500(CharSequence var0) {
		int var1 = var0.length(); // L: 9
		int var2 = 0; // L: 10

		for (int var3 = 0; var3 < var1; ++var3) { // L: 11
			char var4 = var0.charAt(var3); // L: 12
			if (var4 <= 127) { // L: 13
				++var2;
			} else if (var4 <= 2047) { // L: 14
				var2 += 2;
			} else {
				var2 += 3; // L: 15
			}
		}

		return var2; // L: 17
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CLgi;I)C",
		garbageValue = "-531904522"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 117
			if (var0 >= 192 && var0 <= 198) { // L: 118
				return 'A';
			}

			if (var0 == 199) { // L: 119
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) { // L: 120
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) { // L: 121
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 122
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) { // L: 123
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) { // L: 124
				return 'U';
			}

			if (var0 == 221) { // L: 125
				return 'Y';
			}

			if (var0 == 223) { // L: 126
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 127
				return 'a';
			}

			if (var0 == 231) { // L: 128
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) { // L: 129
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) { // L: 130
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) { // L: 131
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) { // L: 132
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) { // L: 133
				return 'u';
			}

			if (var0 == 253 || var0 == 255) { // L: 134
				return 'y';
			}
		}

		if (var0 == 338) { // L: 136
			return 'O';
		} else if (var0 == 339) { // L: 137
			return 'o';
		} else if (var0 == 376) { // L: 138
			return 'Y';
		} else {
			return var0; // L: 139
		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Lhe;III)V",
		garbageValue = "171068975"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3784
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !UserComparator9.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3785
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3786
				if (var3 == null) { // L: 3787
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3788
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3789
				if (var3.contains(var4, var5)) { // L: 3790
					var4 -= var3.width / 2; // L: 3791
					var5 -= var3.height / 2; // L: 3792
					int var6 = Client.camAngleY & 2047; // L: 3793
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3794
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3795
					int var9 = var4 * var8 + var7 * var5 >> 11; // L: 3796
					int var10 = var8 * var5 - var7 * var4 >> 11; // L: 3797
					int var11 = var9 + PlayerComposition.localPlayer.x >> 7; // L: 3798
					int var12 = PlayerComposition.localPlayer.y - var10 >> 7; // L: 3799
					PacketBufferNode var13 = ItemContainer.getPacketBufferNode(ClientPacket.field2272, Client.packetWriter.isaacCipher); // L: 3801
					var13.packetBuffer.writeByte(18); // L: 3802
					var13.packetBuffer.method5739(var11 + NetFileRequest.baseX); // L: 3803
					var13.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3804
					var13.packetBuffer.writeShortLE(var12 + class41.baseY); // L: 3805
					var13.packetBuffer.writeByte(var4); // L: 3806
					var13.packetBuffer.writeByte(var5); // L: 3807
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3808
					var13.packetBuffer.writeByte(57); // L: 3809
					var13.packetBuffer.writeByte(0); // L: 3810
					var13.packetBuffer.writeByte(0); // L: 3811
					var13.packetBuffer.writeByte(89); // L: 3812
					var13.packetBuffer.writeShort(PlayerComposition.localPlayer.x); // L: 3813
					var13.packetBuffer.writeShort(PlayerComposition.localPlayer.y); // L: 3814
					var13.packetBuffer.writeByte(63); // L: 3815
					Client.packetWriter.addNode(var13); // L: 3816
					Client.destinationX = var11; // L: 3817
					Client.destinationY = var12; // L: 3818
				}
			}

		}
	} // L: 3821
}
