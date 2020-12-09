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
		this.id = var1;
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-5"
	)
	static final void method3155(String var0) {
		PacketBufferNode var1 = ItemContainer.getPacketBufferNode(ClientPacket.field2319, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(FloorDecoration.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1484457450"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) {
			NPC var2 = Client.npcs[Client.npcIndices[var1]];
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
				int var3 = var2.x >> 7;
				int var4 = var2.y >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.field941 * 68797504 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
					}

					long var5 = NPC.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
					var2.playerCycle = Client.cycle;
					ArchiveLoader.scene.drawEntity(GameObject.Client_plane, var2.x, var2.y, SecureRandomFuture.getTileHeight(var2.field941 * 108072960 - 64 + var2.x, var2.field941 * 108072960 - 64 + var2.y, GameObject.Client_plane), var2.field941 * 108072960 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "([Lhe;II)V",
		garbageValue = "-1212206355"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !DevicePcmPlayerProvider.isComponentHidden(var3))) {
				if (var3.type == 0) {
					if (!var3.isIf3 && DevicePcmPlayerProvider.isComponentHidden(var3) && var3 != EnumDefinition.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						NPCDefinition.method4759(var4.group);
					}
				}

				if (var3.type == 6) {
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var7 = class8.runCs1(var3);
						if (var7) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}

						if (var5 != -1) {
							SequenceDefinition var6 = ParamDefinition.SequenceDefinition_get(var5);

							for (var3.modelFrameCycle += Client.field850; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; CollisionMap.invalidateWidget(var3)) {
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
								++var3.modelFrame;
								if (var3.modelFrame >= var6.frameIds.length) {
									var3.modelFrame -= var6.frameCount;
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) {
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field2642 != 0 && !var3.isIf3) {
						int var8 = var3.field2642 >> 16;
						var5 = var3.field2642 << 16 >> 16;
						var8 *= Client.field850;
						var5 *= Client.field850;
						var3.modelAngleX = var8 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						CollisionMap.invalidateWidget(var3);
					}
				}
			}
		}

	}
}
