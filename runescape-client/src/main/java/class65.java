import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
public class class65 {
	@ObfuscatedName("t")
	static final BigInteger field841;
	@ObfuscatedName("s")
	static final BigInteger field842;

	static {
		field841 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field842 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpj;ILck;II)V",
		garbageValue = "-2002121485"
	)
	static final void method1957(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class185.field2119.field2121;
		int var5;
		int var6;
		int var8;
		int var9;
		int var12;
		if ((var3 & 4) != 0) {
			var5 = var0.readUnsignedByte();
			int var7;
			int var10;
			int var16;
			if (var5 > 0) {
				for (var6 = 0; var6 < var5; ++var6) {
					var8 = -1;
					var9 = -1;
					var10 = -1;
					var7 = var0.readUShortSmart();
					if (var7 == 32767) {
						var7 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						var8 = var0.readUShortSmart();
						var10 = var0.readUShortSmart();
					} else if (var7 != 32766) {
						var9 = var0.readUShortSmart();
					} else {
						var7 = -1;
					}

					var16 = var0.readUShortSmart();
					var2.addHitSplat(var7, var9, var8, var10, Client.cycle, var16);
				}
			}

			var6 = var0.method7520();
			if (var6 > 0) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var0.readUShortSmart();
					var9 = var0.readUShortSmart();
					if (var9 != 32767) {
						var10 = var0.readUShortSmart();
						var16 = var0.method7392();
						var12 = var9 > 0 ? var0.method7394() : var16;
						var2.addHealthBar(var8, Client.cycle, var9, var10, var16, var12);
					} else {
						var2.removeHealthBar(var8);
					}
				}
			}
		}

		if ((var3 & 8192) != 0) {
			var4 = var0.readByte();
		}

		if ((var3 & 16384) != 0) {
			var2.field1132 = var0.method7396();
			var2.field1134 = var0.method7396();
			var2.field1133 = var0.method7397();
			var2.field1135 = var0.method7397();
			var2.field1136 = var0.method7403() + Client.cycle;
			var2.field1157 = var0.method7403() + Client.cycle;
			var2.field1138 = var0.method7499();
			if (var2.field1055) {
				var2.field1132 += var2.tileX;
				var2.field1134 += var2.tileY;
				var2.field1133 += var2.tileX;
				var2.field1135 += var2.tileY;
				var2.pathLength = 0;
			} else {
				var2.field1132 += var2.pathX[0];
				var2.field1134 += var2.pathY[0];
				var2.field1133 += var2.pathX[0];
				var2.field1135 += var2.pathY[0];
				var2.pathLength = 1;
			}

			var2.field1098 = 0;
		}

		if ((var3 & 128) != 0) {
			var2.targetIndex = var0.method7403();
			if (var2.targetIndex == 65535) {
				var2.targetIndex = -1;
			}
		}

		if ((var3 & 1) != 0) {
			var5 = var0.readUnsignedByte();
			byte[] var13 = new byte[var5];
			Buffer var14 = new Buffer(var13);
			var0.method7413(var13, 0, var5);
			Players.field1248[var1] = var14;
			var2.read(var14);
		}

		if ((var3 & 256) != 0) {
			for (var5 = 0; var5 < 3; ++var5) {
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 32) != 0) {
			var5 = var0.readUnsignedShort();
			PlayerType var19 = (PlayerType)class130.findEnumerated(SpotAnimationDefinition.PlayerType_values(), var0.method7520());
			boolean var17 = var0.method7394() == 1;
			var8 = var0.readUnsignedByte();
			var9 = var0.offset;
			if (var2.username != null && var2.appearance != null) {
				boolean var18 = false;
				if (var19.isUser && GameEngine.friendSystem.isIgnored(var2.username)) {
					var18 = true;
				}

				if (!var18 && Client.field590 == 0 && !var2.isHidden) {
					Players.field1257.offset = 0;
					var0.readBytes(Players.field1257.array, 0, var8);
					Players.field1257.offset = 0;
					String var11 = AbstractFont.escapeBrackets(class412.method7287(SequenceDefinition.method3689(Players.field1257)));
					var2.overheadText = var11.trim();
					var2.overheadTextColor = var5 >> 8;
					var2.overheadTextEffect = var5 & 255;
					var2.overheadTextCyclesRemaining = 150;
					var2.isAutoChatting = var17;
					var2.field1114 = var2 != class340.localPlayer && var19.isUser && "" != Client.field645 && var11.toLowerCase().indexOf(Client.field645) == -1;
					if (var19.isPrivileged) {
						var12 = var17 ? 91 : 1;
					} else {
						var12 = var17 ? 90 : 2;
					}

					if (var19.modIcon != -1) {
						class194.addGameMessage(var12, class221.method4705(var19.modIcon) + var2.username.getName(), var11);
					} else {
						class194.addGameMessage(var12, var2.username.getName(), var11);
					}
				}
			}

			var0.offset = var9 + var8;
		}

		if ((var3 & 2) != 0) {
			var5 = var0.method7499();
			if (var5 == 65535) {
				var5 = -1;
			}

			var6 = var0.method7520();
			class125.performPlayerAnimation(var2, var5, var6);
		}

		if ((var3 & 1024) != 0) {
			class185[] var15 = Players.field1246;
			class185[] var21 = new class185[]{class185.field2120, class185.field2123, class185.field2122, class185.field2119};
			var15[var1] = (class185)class130.findEnumerated(var21, var0.method7465());
		}

		if ((var3 & 2048) != 0) {
			var2.spotAnimation = var0.method7499();
			var5 = var0.method7412();
			var2.spotAnimationHeight = var5 >> 16;
			var2.field1130 = (var5 & 65535) + Client.cycle;
			var2.spotAnimationFrame = 0;
			var2.spotAnimationFrameCycle = 0;
			if (var2.field1130 > Client.cycle) {
				var2.spotAnimationFrame = -1;
			}

			if (var2.spotAnimation == 65535) {
				var2.spotAnimation = -1;
			}
		}

		if ((var3 & 512) != 0) {
			var2.field1141 = Client.cycle + var0.method7403();
			var2.field1140 = Client.cycle + var0.method7499();
			var2.field1143 = var0.readByte();
			var2.field1144 = var0.method7397();
			var2.field1095 = var0.readByte();
			var2.field1146 = (byte)var0.readUnsignedByte();
		}

		if ((var3 & 64) != 0) {
			var2.field1122 = var0.method7401();
			if (var2.pathLength == 0) {
				var2.orientation = var2.field1122;
				var2.field1122 = -1;
			}
		}

		if ((var3 & 8) != 0) {
			var2.overheadText = var0.readStringCp1252NullTerminated();
			if (var2.overheadText.charAt(0) == '~') {
				var2.overheadText = var2.overheadText.substring(1);
				class194.addGameMessage(2, var2.username.getName(), var2.overheadText);
			} else if (var2 == class340.localPlayer) {
				class194.addGameMessage(2, var2.username.getName(), var2.overheadText);
			}

			var2.isAutoChatting = false;
			var2.overheadTextColor = 0;
			var2.overheadTextEffect = 0;
			var2.overheadTextCyclesRemaining = 150;
		}

		if (var2.field1055) {
			if (var4 == 127) {
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class185 var22;
				if (var4 != class185.field2119.field2121) {
					class185[] var20 = new class185[]{class185.field2120, class185.field2123, class185.field2122, class185.field2119};
					var22 = (class185)class130.findEnumerated(var20, var4);
				} else {
					var22 = Players.field1246[var1];
				}

				var2.method2175(var2.tileX, var2.tileY, var22);
			}
		}

	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "843672691"
	)
	static final void method1958() {
		if (SoundSystem.ClanChat_inClanChat) {
			if (Players.friendsChat != null) {
				Players.friendsChat.sort();
			}

			for (int var0 = 0; var0 < Players.Players_count; ++var0) {
				Player var1 = Client.players[Players.Players_indices[var0]];
				var1.clearIsInFriendsChat();
			}

			SoundSystem.ClanChat_inClanChat = false;
		}

	}
}
