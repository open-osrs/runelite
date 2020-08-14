import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
final class class2 implements class0 {
	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lkn;B)V",
		garbageValue = "0"
	)
	public void vmethod59(Object var1, Buffer var2) {
		this.method23((Long)var1, var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lkn;B)Ljava/lang/Object;",
		garbageValue = "114"
	)
	public Object vmethod47(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lkn;I)V",
		garbageValue = "2145124737"
	)
	void method23(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-12961"
	)
	@Export("getEntityIdUnderMouse")
	public static int getEntityIdUnderMouse(int var0) {
		return Language.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(ZLkb;I)V",
		garbageValue = "1542604247"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field687 = 0;
		Client.field718 = 0;
		UserList.method5333();

		int var2;
		while (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) {
			var2 = var1.readBits(15);
			if (var2 == 32767) {
				break;
			}

			boolean var3 = false;
			if (Client.npcs[var2] == null) {
				Client.npcs[var2] = new NPC();
				var3 = true;
			}

			NPC var4 = Client.npcs[var2];
			Client.npcIndices[++Client.npcCount - 1] = var2;
			var4.npcCycle = Client.cycle;
			int var5 = Client.defaultRotations[var1.readBits(3)];
			if (var3) {
				var4.orientation = var4.rotation = var5;
			}

			int var6 = var1.readBits(1);
			int var7 = var1.readBits(1);
			if (var7 == 1) {
				Client.field719[++Client.field718 - 1] = var2;
			}

			var4.definition = StudioGame.getNpcDefinition(var1.readBits(14));
			int var8;
			if (var0) {
				var8 = var1.readBits(8);
				if (var8 > 127) {
					var8 -= 256;
				}
			} else {
				var8 = var1.readBits(5);
				if (var8 > 15) {
					var8 -= 32;
				}
			}

			int var9;
			if (var0) {
				var9 = var1.readBits(8);
				if (var9 > 127) {
					var9 -= 256;
				}
			} else {
				var9 = var1.readBits(5);
				if (var9 > 15) {
					var9 -= 32;
				}
			}

			var4.field967 = var4.definition.size;
			var4.field1017 = var4.definition.rotation;
			if (var4.field1017 == 0) {
				var4.rotation = 0;
			}

			var4.walkSequence = var4.definition.walkSequence;
			var4.walkBackSequence = var4.definition.walkBackSequence;
			var4.walkLeftSequence = var4.definition.walkLeftSequence;
			var4.walkRightSequence = var4.definition.walkRightSequence;
			var4.idleSequence = var4.definition.idleSequence;
			var4.turnLeftSequence = var4.definition.turnLeftSequence;
			var4.turnRightSequence = var4.definition.turnRightSequence;
			var4.method2142(class60.localPlayer.pathX[0] + var9, class60.localPlayer.pathY[0] + var8, var6 == 1);
		}

		var1.exportIndex();
		BoundaryObject.method3389(var1);

		for (var2 = 0; var2 < Client.field687; ++var2) {
			int var10 = Client.field907[var2];
			if (Client.npcs[var10].npcCycle != Client.cycle) {
				Client.npcs[var10].definition = null;
				Client.npcs[var10] = null;
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) {
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
		} else {
			for (var2 = 0; var2 < Client.npcCount; ++var2) {
				if (Client.npcs[Client.npcIndices[var2]] == null) {
					throw new RuntimeException(var2 + "," + Client.npcCount);
				}
			}

		}
	}
}
