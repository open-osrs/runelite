import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
public class class119 {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = 7139269644262684297L
	)
	long field1403;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 949020309
	)
	int field1399;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	IterableNodeDeque field1400;

	@ObfuscatedSignature(
		descriptor = "(Lot;)V"
	)
	public class119(Buffer var1) {
		this.field1399 = -1;
		this.field1400 = new IterableNodeDeque();
		this.method2504(var1);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1866610837"
	)
	void method2504(Buffer var1) {
		this.field1403 = var1.readLong();
		this.field1399 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class138(this);
			} else if (var2 == 1) {
				var3 = new class114(this);
			} else if (var2 == 13) {
				var3 = new class131(this);
			} else if (var2 == 4) {
				var3 = new class123(this);
			} else if (var2 == 6) {
				var3 = new class130(this);
			} else if (var2 == 5) {
				var3 = new class115(this);
			} else if (var2 == 2) {
				var3 = new class120(this);
			} else if (var2 == 7) {
				var3 = new class113(this);
			} else if (var2 == 14) {
				var3 = new class117(this);
			} else if (var2 == 8) {
				var3 = new class134(this);
			} else if (var2 == 9) {
				var3 = new class140(this);
			} else if (var2 == 10) {
				var3 = new class126(this);
			} else if (var2 == 11) {
				var3 = new class121(this);
			} else if (var2 == 12) {
				var3 = new class125(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class135(this);
			}

			((class116)var3).vmethod2711(var1);
			this.field1400.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "-783636342"
	)
	public void method2509(ClanSettings var1) {
		if (this.field1403 == var1.field1450 && this.field1399 == var1.field1451) {
			for (class116 var2 = (class116)this.field1400.last(); var2 != null; var2 = (class116)this.field1400.previous()) {
				var2.vmethod2712(var1);
			}

			++var1.field1451;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2084228473"
	)
	static void method2511() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3676 == 0) {
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field3676 = 600;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-31"
	)
	static int method2510(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1);
		return Coord.NetCache_currentResponse != null && Coord.NetCache_currentResponse.key == var2 ? class138.NetCache_responseArchiveBuffer.offset * 99 / (class138.NetCache_responseArchiveBuffer.array.length - Coord.NetCache_currentResponse.padding) + 1 : 0;
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-668892222"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.isLowDetail && var0 != class391.Client_plane) {
				return;
			}

			long var7 = 0L;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;
			if (var1 == 0) {
				var7 = CollisionMap.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) {
				var7 = CollisionMap.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) {
				var7 = CollisionMap.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) {
				var7 = CollisionMap.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (0L != var7) {
				var12 = CollisionMap.scene.getObjectFlags(var0, var2, var3, var7);
				int var14 = HealthBarDefinition.Entity_unpackID(var7);
				int var15 = var12 & 31;
				int var16 = var12 >> 6 & 3;
				ObjectComposition var13;
				if (var1 == 0) {
					CollisionMap.scene.removeBoundaryObject(var0, var2, var3);
					var13 = HitSplatDefinition.getObjectDefinition(var14);
					if (var13.interactType != 0) {
						Client.collisionMaps[var0].method3325(var2, var3, var15, var16, var13.boolean1);
					}
				}

				if (var1 == 1) {
					CollisionMap.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) {
					CollisionMap.scene.removeGameObject(var0, var2, var3);
					var13 = HitSplatDefinition.getObjectDefinition(var14);
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) {
						return;
					}

					if (var13.interactType != 0) {
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var16, var13.boolean1);
					}
				}

				if (var1 == 3) {
					CollisionMap.scene.removeFloorDecoration(var0, var2, var3);
					var13 = HitSplatDefinition.getObjectDefinition(var14);
					if (var13.interactType == 1) {
						Client.collisionMaps[var0].method3321(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var12 = var0;
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var12 = var0 + 1;
				}

				class18.method279(var0, var12, var2, var3, var4, var5, var6, CollisionMap.scene, Client.collisionMaps[var0]);
			}
		}

	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ljd;I)Z",
		garbageValue = "1040294130"
	)
	static final boolean method2508(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method4901(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false);
			}

			if (var1 == 325) {
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = FriendSystem.getPacketBufferNode(ClientPacket.field2677, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
