import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
public class class1 implements Callable {
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1191956543
	)
	static int field3;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	final Buffer field0;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	final class3 field1;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(La;Lot;Lk;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field0 = var2;
		this.field1 = var3;
	}

	public Object call() {
		return this.field1.vmethod17(this.field0);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lft;",
		garbageValue = "826334190"
	)
	public static HealthBarDefinition method12(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0);
			var1 = new HealthBarDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "-1744818632"
	)
	static final boolean method16(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;

		label69:
		while (true) {
			int var6 = var4.method7009();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;

			while (true) {
				int var9;
				while (!var8) {
					var9 = var4.readUShortSmart();
					if (var9 == 0) {
						continue label69;
					}

					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = var7 >> 6 & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
						ObjectComposition var15 = HitSplatDefinition.getObjectDefinition(var5);
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field641;
								var3 = false;
							}

							var8 = true;
						}
					}
				}

				var9 = var4.readUShortSmart();
				if (var9 == 0) {
					break;
				}

				var4.readUnsignedByte();
			}
		}
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1356134240"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (FriendsChat.pcmPlayer1 != null) {
			FriendsChat.pcmPlayer1.run();
		}

		if (UserComparator10.pcmPlayer0 != null) {
			UserComparator10.pcmPlayer0.run();
		}

	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1710532913"
	)
	static boolean method9() {
		return (Client.drawPlayerNames & 8) != 0;
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "13"
	)
	static final void method14(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		var5 = User.method5968(var5, var6);
		int var7 = 2048 - var3 & 2047;
		int var8 = 2048 - var4 & 2047;
		int var9 = 0;
		int var10 = 0;
		int var11 = var5;
		int var12;
		int var13;
		int var14;
		if (var7 != 0) {
			var12 = Rasterizer3D.Rasterizer3D_sine[var7];
			var13 = Rasterizer3D.Rasterizer3D_cosine[var7];
			var14 = var13 * var10 - var5 * var12 >> 16;
			var11 = var5 * var13 + var10 * var12 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			var12 = Rasterizer3D.Rasterizer3D_sine[var8];
			var13 = Rasterizer3D.Rasterizer3D_cosine[var8];
			var14 = var9 * var13 + var11 * var12 >> 16;
			var11 = var13 * var11 - var12 * var9 >> 16;
			var9 = var14;
		}

		WorldMapSection2.cameraX = var0 - var9;
		SpotAnimationDefinition.cameraY = var1 - var10;
		DevicePcmPlayerProvider.cameraZ = var2 - var11;
		ApproximateRouteStrategy.cameraPitch = var3;
		Fonts.cameraYaw = var4;
		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (WorldMapID.oculusOrbFocalPointX >> 7 != class129.localPlayer.x >> 7 || WorldMapRectangle.oculusOrbFocalPointY >> 7 != class129.localPlayer.y >> 7)) {
			var12 = class129.localPlayer.plane;
			var13 = (WorldMapID.oculusOrbFocalPointX >> 7) + FloorOverlayDefinition.baseX;
			var14 = (WorldMapRectangle.oculusOrbFocalPointY >> 7) + class320.baseY;
			PacketBufferNode var15 = FriendSystem.getPacketBufferNode(ClientPacket.field2707, Client.packetWriter.isaacCipher);
			var15.packetBuffer.writeShort(var14);
			var15.packetBuffer.method6861(Client.field570);
			var15.packetBuffer.method6841(var12);
			var15.packetBuffer.method6851(var13);
			Client.packetWriter.addNode(var15);
		}

	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1396434339"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		if (var1.length() > 9) {
			return " " + class54.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + class54.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class54.colorStartTag(16776960) + var1 + "</col>";
		}
	}
}
