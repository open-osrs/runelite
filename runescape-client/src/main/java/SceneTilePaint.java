import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 625864189
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -373675019
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -560012417
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -37282275
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -4240159
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("g")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -53596681
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "-19"
	)
	static final void method4479(String var0, int var1) {
		PacketBufferNode var2 = FriendSystem.getPacketBufferNode(ClientPacket.field2697, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(BufferedSink.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		var2.packetBuffer.method6819(var1);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(Lcf;IB)V",
		garbageValue = "51"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		if (var0.field1139 >= Client.cycle) {
			GameObject.method4495(var0);
		} else if (var0.field1140 >= Client.cycle) {
			class4.method21(var0);
		} else {
			class157.method2918(var0);
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1139 = 0;
			var0.field1140 = 0;
			var0.x = var0.field1137 * 64 + var0.pathX[0] * 128;
			var0.y = var0.field1137 * 64 + var0.pathY[0] * 128;
			var0.method2123();
		}

		if (class129.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1139 = 0;
			var0.field1140 = 0;
			var0.x = var0.field1137 * 64 + var0.pathX[0] * 128;
			var0.y = var0.field1137 * 64 + var0.pathY[0] * 128;
			var0.method2123();
		}

		if (var0.field1146 != 0) {
			if (var0.targetIndex != -1) {
				Object var2 = null;
				if (var0.targetIndex < 32768) {
					var2 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) {
					var2 = Client.players[var0.targetIndex - 32768];
				}

				if (var2 != null) {
					int var3 = var0.x - ((Actor)var2).x;
					int var4 = var0.y - ((Actor)var2).y;
					if (var3 != 0 || var4 != 0) {
						var0.orientation = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
					}
				} else if (var0.false0) {
					var0.targetIndex = -1;
					var0.false0 = false;
				}
			}

			if (var0.field1096 != -1 && (var0.pathLength == 0 || var0.field1151 > 0)) {
				var0.orientation = var0.field1096;
				var0.field1096 = -1;
			}

			int var5 = var0.orientation - var0.rotation & 2047;
			if (var5 == 0 && var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			if (var5 != 0) {
				++var0.field1145;
				boolean var7;
				if (var5 > 1024) {
					var0.rotation -= var0.field1146;
					var7 = true;
					if (var5 < var0.field1146 || var5 > 2048 - var0.field1146) {
						var0.rotation = var0.orientation;
						var7 = false;
					}

					if (var0.idleSequence == var0.movementSequence && (var0.field1145 > 25 || var7)) {
						if (var0.turnLeftSequence != -1) {
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				} else {
					var0.rotation += var0.field1146;
					var7 = true;
					if (var5 < var0.field1146 || var5 > 2048 - var0.field1146) {
						var0.rotation = var0.orientation;
						var7 = false;
					}

					if (var0.idleSequence == var0.movementSequence && (var0.field1145 > 25 || var7)) {
						if (var0.turnRightSequence != -1) {
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				}

				var0.rotation &= 2047;
			} else {
				var0.field1145 = 0;
			}
		}

		Player.method2114(var0);
	}
}
