import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("ag")
	protected static String field2547;
	@ObfuscatedName("bw")
	static String field2546;

	ModelData0() {
	} // L: 4

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-247398088"
	)
	public static void method4272() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 42
	} // L: 43

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1968551558"
	)
	public static String method4273(String var0) {
		int var1 = var0.length(); // L: 160
		char[] var2 = new char[var1]; // L: 161
		byte var3 = 2; // L: 162

		for (int var4 = 0; var4 < var1; ++var4) { // L: 163
			char var5 = var0.charAt(var4); // L: 164
			if (var3 == 0) { // L: 165
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 166
				char var6;
				if (var5 != 181 && var5 != 402) { // L: 169
					var6 = Character.toTitleCase(var5); // L: 173
				} else {
					var6 = var5; // L: 170
				}

				var5 = var6; // L: 175
			}

			if (Character.isLetter(var5)) { // L: 177
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 178
				if (Character.isSpaceChar(var5)) { // L: 179
					if (var3 != 2) { // L: 180
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 182
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 183
		}

		return new String(var2); // L: 185
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "558586673"
	)
	static void method4274(int var0, String var1) {
		int var2 = Players.Players_count; // L: 9124
		int[] var3 = Players.Players_indices; // L: 9125
		boolean var4 = false; // L: 9126
		Username var5 = new Username(var1, VarcInt.loginType); // L: 9127

		for (int var6 = 0; var6 < var2; ++var6) { // L: 9128
			Player var7 = Client.players[var3[var6]]; // L: 9129
			if (var7 != null && var7 != WorldMapSprite.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 9130
				PacketBufferNode var8;
				if (var0 == 1) { // L: 9131
					var8 = class135.getPacketBufferNode(ClientPacket.field2859, Client.packetWriter.isaacCipher); // L: 9133
					var8.packetBuffer.method7458(0); // L: 9134
					var8.packetBuffer.method7405(var3[var6]); // L: 9135
					Client.packetWriter.addNode(var8); // L: 9136
				} else if (var0 == 4) { // L: 9138
					var8 = class135.getPacketBufferNode(ClientPacket.field2884, Client.packetWriter.isaacCipher); // L: 9140
					var8.packetBuffer.method7394(var3[var6]); // L: 9141
					var8.packetBuffer.method7403(0); // L: 9142
					Client.packetWriter.addNode(var8); // L: 9143
				} else if (var0 == 6) { // L: 9145
					var8 = class135.getPacketBufferNode(ClientPacket.field2867, Client.packetWriter.isaacCipher); // L: 9147
					var8.packetBuffer.writeByte(0); // L: 9148
					var8.packetBuffer.method7555(var3[var6]); // L: 9149
					Client.packetWriter.addNode(var8); // L: 9150
				} else if (var0 == 7) { // L: 9152
					var8 = class135.getPacketBufferNode(ClientPacket.field2862, Client.packetWriter.isaacCipher); // L: 9154
					var8.packetBuffer.method7458(0); // L: 9155
					var8.packetBuffer.writeShort(var3[var6]); // L: 9156
					Client.packetWriter.addNode(var8); // L: 9157
				}

				var4 = true; // L: 9159
				break;
			}
		}

		if (!var4) { // L: 9163
			LoginScreenAnimation.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 9164
}
