import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	@Export("definition")
	NPCComposition definition;

	NPC() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IBB)V",
		garbageValue = "20"
	)
	final void method2223(int var1, byte var2) {
		int var3 = super.pathX[0];
		int var4 = super.pathY[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) {
			++var3;
		}

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6) {
			--var4;
		}

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if (super.sequence != -1 && KitDefinition.SequenceDefinition_get(super.sequence).field1960 == 1) {
			super.sequence = -1;
		}

		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) {
			super.pathX[var5] = super.pathX[var5 - 1];
			super.pathY[var5] = super.pathY[var5 - 1];
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
		}

		super.pathX[0] = var3;
		super.pathY[0] = var4;
		super.pathTraversed[0] = var2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Lhl;",
		garbageValue = "126"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? KitDefinition.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || super.idleSequence == super.movementSequence && var1 != null ? null : KitDefinition.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					Model var4 = class21.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.field1147, 0);
						Model[] var5 = new Model[]{var3, var4};
						var3 = new Model(var5, 2);
					}
				}

				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "97"
	)
	final void method2234(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && KitDefinition.SequenceDefinition_get(super.sequence).field1960 == 1) {
			super.sequence = -1;
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (super.pathLength < 9) {
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) {
					super.pathX[var6] = super.pathX[var6 - 1];
					super.pathY[var6] = super.pathY[var6 - 1];
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
				}

				super.pathX[0] = var1;
				super.pathY[0] = var2;
				super.pathTraversed[0] = 1;
				return;
			}
		}

		super.pathLength = 0;
		super.field1129 = 0;
		super.field1164 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.pathX[0] * 128 + super.field1109 * 64;
		super.y = super.field1109 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1841514183"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-3271"
	)
	static final int method2232() {
		return ViewportMouse.ViewportMouse_x;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-57"
	)
	static void method2233() {
		class112.method2474(24);
		class17.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-7381"
	)
	static void method2235() {
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1281 = null;
		Client.packetWriter.field1293 = null;
		Client.packetWriter.field1288 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1290 = 0;
		Client.rebootTimer = 0;
		class7.method46();
		Client.minimapState = 0;
		Client.destinationX = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}

		class67.localPlayer = null;

		for (var0 = 0; var0 < Client.npcs.length; ++var0) {
			NPC var1 = Client.npcs[var0];
			if (var1 != null) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		ItemContainer.itemContainers = new NodeHashTable(32);
		UserList.updateGameState(30);

		for (var0 = 0; var0 < 100; ++var0) {
			Client.field710[var0] = true;
		}

		PacketBufferNode var2 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2718, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(class12.getWindowedMode());
		var2.packetBuffer.writeShort(Huffman.canvasWidth);
		var2.packetBuffer.writeShort(MouseRecorder.canvasHeight);
		Client.packetWriter.addNode(var2);
	}
}
