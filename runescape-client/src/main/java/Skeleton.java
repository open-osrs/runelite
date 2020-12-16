import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("he")
	@ObfuscatedGetter(
		intValue = -502356211
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1773427771
	)
	@Export("id")
	int id;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1481451601
	)
	@Export("count")
	int count;
	@ObfuscatedName("x")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("w")
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-5"
	)
	static final void method3155(String var0) {
		PacketBufferNode var1 = ItemContainer.getPacketBufferNode(ClientPacket.field2319, Client.packetWriter.isaacCipher); // L: 194
		var1.packetBuffer.writeByte(FloorDecoration.stringCp1252NullTerminatedByteSize(var0)); // L: 195
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 196
		Client.packetWriter.addNode(var1); // L: 197
	} // L: 198

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1484457450"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 4752
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 4753
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 4754
				int var3 = var2.x >> 7; // L: 4755
				int var4 = var2.y >> 7; // L: 4756
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 4757
					if (var2.field941 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 4758
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 4759
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 4760
					}

					long var5 = NPC.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 4762
					var2.playerCycle = Client.cycle; // L: 4763
					ArchiveLoader.scene.drawEntity(GameObject.Client_plane, var2.x, var2.y, SecureRandomFuture.getTileHeight(var2.field941 * 64 - 64 + var2.x, var2.field941 * 64 - 64 + var2.y, GameObject.Client_plane), var2.field941 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 4764
				}
			}
		}

	} // L: 4768

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "([Lhe;II)V",
		garbageValue = "-1212206355"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 10596
			Widget var3 = var0[var2]; // L: 10597
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !DevicePcmPlayerProvider.isComponentHidden(var3))) { // L: 10598 10599 10600
				if (var3.type == 0) { // L: 10601
					if (!var3.isIf3 && DevicePcmPlayerProvider.isComponentHidden(var3) && var3 != EnumComposition.mousedOverWidgetIf1) { // L: 10602
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 10603
					if (var3.children != null) { // L: 10604
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 10605
					if (var4 != null) { // L: 10606
						NPCComposition.method4759(var4.group);
					}
				}

				if (var3.type == 6) { // L: 10608
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 10609
						boolean var7 = class8.runCs1(var3); // L: 10610
						if (var7) { // L: 10612
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 10613
						}

						if (var5 != -1) { // L: 10614
							SequenceDefinition var6 = ParamDefinition.SequenceDefinition_get(var5); // L: 10615

							for (var3.modelFrameCycle += Client.field850; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; CollisionMap.invalidateWidget(var3)) { // L: 10616 10617 10624
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 10618
								++var3.modelFrame; // L: 10619
								if (var3.modelFrame >= var6.frameIds.length) { // L: 10620
									var3.modelFrame -= var6.frameCount; // L: 10621
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 10622
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field2642 != 0 && !var3.isIf3) { // L: 10628
						int var8 = var3.field2642 >> 16; // L: 10629
						var5 = var3.field2642 << 16 >> 16; // L: 10630
						var8 *= Client.field850; // L: 10631
						var5 *= Client.field850; // L: 10632
						var3.modelAngleX = var8 + var3.modelAngleX & 2047; // L: 10633
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 10634
						CollisionMap.invalidateWidget(var3); // L: 10635
					}
				}
			}
		}

	} // L: 10639
}
