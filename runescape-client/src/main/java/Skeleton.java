import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = 576812215
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1229428145
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1150264437
	)
	@Export("count")
	int count;
	@ObfuscatedName("o")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("g")
	@Export("labels")
	int[][] labels;

	Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 13
		Buffer var3 = new Buffer(var2); // L: 14
		this.count = var3.readUnsignedByte(); // L: 15
		this.transformTypes = new int[this.count]; // L: 16
		this.labels = new int[this.count][]; // L: 17

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) { // L: 18
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 19
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 20
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) { // L: 21
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

	} // L: 23

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1656377758"
	)
	static void method3899(int var0, String var1) {
		int var2 = Players.Players_count; // L: 8870
		int[] var3 = Players.Players_indices; // L: 8871
		boolean var4 = false; // L: 8872
		Username var5 = new Username(var1, ModeWhere.loginType); // L: 8873

		for (int var6 = 0; var6 < var2; ++var6) { // L: 8874
			Player var7 = Client.players[var3[var6]]; // L: 8875
			if (var7 != null && var7 != class35.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 8876
				PacketBufferNode var8;
				if (var0 == 1) { // L: 8877
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2571, Client.packetWriter.isaacCipher); // L: 8879
					var8.packetBuffer.method6483(var3[var6]); // L: 8880
					var8.packetBuffer.method6610(0); // L: 8881
					Client.packetWriter.addNode(var8); // L: 8882
				} else if (var0 == 4) { // L: 8884
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2565, Client.packetWriter.isaacCipher); // L: 8886
					var8.packetBuffer.method6483(var3[var6]); // L: 8887
					var8.packetBuffer.method6610(0); // L: 8888
					Client.packetWriter.addNode(var8); // L: 8889
				} else if (var0 == 6) { // L: 8891
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2600, Client.packetWriter.isaacCipher); // L: 8893
					var8.packetBuffer.method6449(0); // L: 8894
					var8.packetBuffer.method6484(var3[var6]); // L: 8895
					Client.packetWriter.addNode(var8); // L: 8896
				} else if (var0 == 7) { // L: 8898
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2613, Client.packetWriter.isaacCipher); // L: 8900
					var8.packetBuffer.writeByte(0); // L: 8901
					var8.packetBuffer.method6484(var3[var6]); // L: 8902
					Client.packetWriter.addNode(var8); // L: 8903
				}

				var4 = true; // L: 8905
				break;
			}
		}

		if (!var4) { // L: 8909
			WorldMapScaleHandler.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 8910
}
