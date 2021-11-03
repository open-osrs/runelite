import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
public class class1 implements Callable {
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1698122621
	)
	@Export("gameCyclesToDo")
	protected static int gameCyclesToDo;
	@ObfuscatedName("k")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	final Buffer field3;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	final class3 field1;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lp;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lp;Lop;La;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field3 = var2; // L: 48
		this.field1 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field1.vmethod18(this.field3); // L: 53
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "284961543"
	)
	static final int method15(long var0, String var2) {
		Random var3 = new Random(); // L: 65
		Buffer var4 = new Buffer(128); // L: 66
		Buffer var5 = new Buffer(128); // L: 67
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0}; // L: 68 69 70 71 72
		var4.writeByte(10); // L: 73

		int var7;
		for (var7 = 0; var7 < 4; ++var7) { // L: 74
			var4.writeInt(var3.nextInt()); // L: 75
		}

		var4.writeInt(var6[0]); // L: 77
		var4.writeInt(var6[1]); // L: 78
		var4.writeLong(var0); // L: 79
		var4.writeLong(0L); // L: 80

		for (var7 = 0; var7 < 4; ++var7) { // L: 81
			var4.writeInt(var3.nextInt()); // L: 82
		}

		var4.encryptRsa(class65.field822, class65.field823); // L: 84
		var5.writeByte(10); // L: 85

		for (var7 = 0; var7 < 3; ++var7) { // L: 86
			var5.writeInt(var3.nextInt()); // L: 87
		}

		var5.writeLong(var3.nextLong()); // L: 89
		var5.writeLongMedium(var3.nextLong()); // L: 90
		if (Client.randomDatData != null) { // L: 92
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 93
		} else {
			byte[] var23 = ObjectSound.method1771(); // L: 96
			var5.writeBytes(var23, 0, var23.length); // L: 97
		}

		var5.writeLong(var3.nextLong()); // L: 99
		var5.encryptRsa(class65.field822, class65.field823); // L: 100
		var7 = Client.stringCp1252NullTerminatedByteSize(var2); // L: 101
		if (var7 % 8 != 0) { // L: 102
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7); // L: 103
		var8.writeStringCp1252NullTerminated(var2); // L: 104
		var8.offset = var7; // L: 105
		var8.xteaEncryptAll(var6); // L: 106
		Buffer var9 = new Buffer(var5.offset + var4.offset + var8.offset + 5); // L: 107
		var9.writeByte(2); // L: 108
		var9.writeByte(var4.offset); // L: 109
		var9.writeBytes(var4.array, 0, var4.offset); // L: 110
		var9.writeByte(var5.offset); // L: 111
		var9.writeBytes(var5.array, 0, var5.offset); // L: 112
		var9.writeShort(var8.offset); // L: 113
		var9.writeBytes(var8.array, 0, var8.offset); // L: 114
		String var10 = class114.method2545(var9.array); // L: 115

		try {
			URL var11 = new URL(HealthBar.method2246("services", false) + "m=accountappeal/login.ws"); // L: 117
			URLConnection var12 = var11.openConnection(); // L: 118
			var12.setDoInput(true); // L: 119
			var12.setDoOutput(true); // L: 120
			var12.setConnectTimeout(5000); // L: 121
			OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream()); // L: 122
			String var15 = "data2=" + class355.method6403(var10) + "&dest="; // L: 124
			int var17 = "passwordchoice.ws".length(); // L: 127
			StringBuilder var18 = new StringBuilder(var17); // L: 128

			for (int var19 = 0; var19 < var17; ++var19) { // L: 129
				char var20 = "passwordchoice.ws".charAt(var19); // L: 130
				if ((var20 < 'a' || var20 > 'z') && (var20 < 'A' || var20 > 'Z') && (var20 < '0' || var20 > '9') && var20 != '.' && var20 != '-' && var20 != '*' && var20 != '_') { // L: 131
					if (var20 == ' ') { // L: 132
						var18.append('+');
					} else {
						byte var21 = AbstractSocket.charToByteCp1252(var20); // L: 134
						var18.append('%'); // L: 135
						int var22 = var21 >> 4 & 15; // L: 136
						if (var22 >= 10) { // L: 137
							var18.append((char)(var22 + 55));
						} else {
							var18.append((char)(var22 + 48)); // L: 138
						}

						var22 = var21 & 15; // L: 139
						if (var22 >= 10) { // L: 140
							var18.append((char)(var22 + 55));
						} else {
							var18.append((char)(var22 + 48)); // L: 141
						}
					}
				} else {
					var18.append(var20);
				}
			}

			String var16 = var18.toString(); // L: 144
			var13.write(var15 + var16); // L: 146
			var13.flush(); // L: 147
			InputStream var24 = var12.getInputStream(); // L: 148
			var9 = new Buffer(new byte[1000]); // L: 149

			do {
				int var25 = var24.read(var9.array, var9.offset, 1000 - var9.offset); // L: 151
				if (var25 == -1) { // L: 152
					var13.close(); // L: 158
					var24.close(); // L: 159
					String var27 = new String(var9.array); // L: 160
					if (var27.startsWith("OFFLINE")) { // L: 161
						return 4; // L: 162
					} else if (var27.startsWith("WRONG")) { // L: 164
						return 7; // L: 165
					} else if (var27.startsWith("RELOAD")) { // L: 167
						return 3; // L: 168
					} else if (var27.startsWith("Not permitted for social network accounts.")) { // L: 170
						return 6; // L: 171
					} else {
						var9.xteaDecryptAll(var6); // L: 173

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) { // L: 174
							--var9.offset; // L: 175
						}

						var27 = new String(var9.array, 0, var9.offset); // L: 177
						if (Occluder.method4484(var27)) { // L: 178
							class91.openURL(var27, true, false); // L: 179
							return 2; // L: 180
						} else {
							return 5; // L: 182
						}
					}
				}

				var9.offset += var25; // L: 153
			} while(var9.offset < 1000); // L: 154

			return 5; // L: 155
		} catch (Throwable var26) { // L: 184
			var26.printStackTrace(); // L: 185
			return 5; // L: 186
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "207642979"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = ""; // L: 861
		Login.Login_response2 = "Enter your username/email & password."; // L: 862
		Login.Login_response3 = ""; // L: 863
		class275.method5201(2); // L: 864
		if (var0) { // L: 865
			Login.Login_password = "";
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 867
			if (class408.clientPreferences.rememberedUsername != null) { // L: 868
				Login.Login_username = class408.clientPreferences.rememberedUsername; // L: 869
				Client.Login_isUsernameRemembered = true; // L: 870
			} else {
				Client.Login_isUsernameRemembered = false; // L: 872
			}
		}

		ParamComposition.method3216(); // L: 874
	} // L: 875

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-2113911304"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1507
		Login.Login_response2 = var1; // L: 1508
		Login.Login_response3 = var2; // L: 1509
	} // L: 1510

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljf;II)V",
		garbageValue = "217206746"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3180 == null) { // L: 1007
			throw new RuntimeException(); // L: 1008
		} else {
			if (var0.field3194 == null) { // L: 1010
				var0.field3194 = new int[var0.field3180.length]; // L: 1011
			}

			var0.field3194[var1] = Integer.MAX_VALUE; // L: 1013
		}
	} // L: 1014

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(Ljf;III)V",
		garbageValue = "-989741563"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 4115
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !ApproximateRouteStrategy.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 4116
				SpriteMask var3 = var0.getSpriteMask(true); // L: 4117
				if (var3 == null) { // L: 4118
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 4119
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 4120
				if (var3.contains(var4, var5)) { // L: 4121
					var4 -= var3.width / 2; // L: 4122
					var5 -= var3.height / 2; // L: 4123
					int var6 = Client.camAngleY & 2047; // L: 4124
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 4125
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 4126
					int var9 = var4 * var8 + var7 * var5 >> 11; // L: 4127
					int var10 = var5 * var8 - var7 * var4 >> 11; // L: 4128
					int var11 = var9 + HealthBarDefinition.localPlayer.x >> 7; // L: 4129
					int var12 = HealthBarDefinition.localPlayer.y - var10 >> 7; // L: 4130
					PacketBufferNode var13 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2749, Client.packetWriter.isaacCipher); // L: 4132
					var13.packetBuffer.writeByte(18); // L: 4133
					var13.packetBuffer.method6962(var11 + class19.baseX); // L: 4134
					var13.packetBuffer.method6993(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 4135
					var13.packetBuffer.method7003(var12 + DefaultsGroup.baseY); // L: 4136
					var13.packetBuffer.writeByte(var4); // L: 4137
					var13.packetBuffer.writeByte(var5); // L: 4138
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 4139
					var13.packetBuffer.writeByte(57); // L: 4140
					var13.packetBuffer.writeByte(0); // L: 4141
					var13.packetBuffer.writeByte(0); // L: 4142
					var13.packetBuffer.writeByte(89); // L: 4143
					var13.packetBuffer.writeShort(HealthBarDefinition.localPlayer.x); // L: 4144
					var13.packetBuffer.writeShort(HealthBarDefinition.localPlayer.y); // L: 4145
					var13.packetBuffer.writeByte(63); // L: 4146
					Client.packetWriter.addNode(var13); // L: 4147
					Client.destinationX = var11; // L: 4148
					Client.destinationY = var12; // L: 4149
				}
			}

		}
	} // L: 4152
}
