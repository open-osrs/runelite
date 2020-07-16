import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = 1560721333
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("m")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Ljg;",
		garbageValue = "83996779"
	)
	@Export("getObjectDefinition")
	public static ObjectDefinition getObjectDefinition(int var0) {
		ObjectDefinition var1 = (ObjectDefinition)ObjectDefinition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectDefinition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectDefinition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1398023724"
	)
	static final void method927(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your friend list").toString();
		ObjectSound.addGameMessage(30, "", var1);
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "411559133"
	)
	static void method925() {
		if (class60.localPlayer.x >> 7 == Client.destinationX && class60.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(III)Ljava/lang/String;",
		garbageValue = "-266618010"
	)
	static final String method924(int var0, int var1) {
		int var2 = var1 - var0;
		if (var2 < -9) {
			return ItemContainer.colorStartTag(16711680);
		} else if (var2 < -6) {
			return ItemContainer.colorStartTag(16723968);
		} else if (var2 < -3) {
			return ItemContainer.colorStartTag(16740352);
		} else if (var2 < 0) {
			return ItemContainer.colorStartTag(16756736);
		} else if (var2 > 9) {
			return ItemContainer.colorStartTag(65280);
		} else if (var2 > 6) {
			return ItemContainer.colorStartTag(4259584);
		} else if (var2 > 3) {
			return ItemContainer.colorStartTag(8453888);
		} else {
			return var2 > 0 ? ItemContainer.colorStartTag(12648192) : ItemContainer.colorStartTag(16776960);
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Lhd;II)I",
		garbageValue = "623604092"
	)
	static final int method923(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = WorldMapSprite.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!KitDefinition.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) {
						var7 = class60.localPlayer.combatLevel;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = WorldMapSprite.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!KitDefinition.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.runEnergy;
					}

					if (var6 == 12) {
						var7 = Client.weight;
					}

					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = Widget.getVarbit(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = (class60.localPlayer.x >> 7) + class182.baseX;
					}

					if (var6 == 19) {
						var7 = (class60.localPlayer.y >> 7) + SecureRandomFuture.baseY;
					}

					if (var6 == 20) {
						var7 = var2[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-83"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = UserComparator4.getPacketBufferNode(ClientPacket.field2292, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(DynamicObject.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
