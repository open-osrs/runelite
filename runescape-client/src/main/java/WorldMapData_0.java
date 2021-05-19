import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	WorldMapData_0() {
	} // L: 6

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "0"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 9
		if (var2 != WorldMapID.field2099.value) { // L: 10
			throw new IllegalStateException(""); // L: 11
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 13
			super.planes = var1.readUnsignedByte(); // L: 14
			super.regionXLow = var1.readUnsignedShort(); // L: 15
			super.regionYLow = var1.readUnsignedShort(); // L: 16
			super.regionX = var1.readUnsignedShort(); // L: 17
			super.regionY = var1.readUnsignedShort(); // L: 18
			super.groupId = var1.method6464(); // L: 19
			super.fileId = var1.method6464(); // L: 20
		}
	} // L: 21

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "1915938242"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 24
		super.floorUnderlayIds = new short[1][64][64]; // L: 25
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 26
		super.field2063 = new byte[super.planes][64][64]; // L: 27
		super.field2064 = new byte[super.planes][64][64]; // L: 28
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 29
		int var2 = var1.readUnsignedByte(); // L: 30
		if (var2 != class179.field2097.value) { // L: 31
			throw new IllegalStateException(""); // L: 32
		} else {
			int var3 = var1.readUnsignedByte(); // L: 34
			int var4 = var1.readUnsignedByte(); // L: 35
			if (var3 == super.regionX && var4 == super.regionY) { // L: 36
				for (int var5 = 0; var5 < 64; ++var5) { // L: 39
					for (int var6 = 0; var6 < 64; ++var6) { // L: 40
						this.readTile(var5, var6, var1); // L: 41
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 37
			}
		}
	} // L: 44

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) { // L: 47
			return false; // L: 48
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1; // L: 50
			return var2.regionX == super.regionX && super.regionY == var2.regionY; // L: 51
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8; // L: 55
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(Lcw;I)V",
		garbageValue = "-1306171247"
	)
	static final void method3145(PendingSpawn var0) {
		long var1 = 0L; // L: 7305
		int var3 = -1; // L: 7306
		int var4 = 0; // L: 7307
		int var5 = 0; // L: 7308
		if (var0.type == 0) { // L: 7309
			var1 = class5.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 7310
			var1 = class5.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 7311
			var1 = class5.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = class5.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y); // L: 7312
		}

		if (0L != var1) { // L: 7313
			int var6 = class5.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 7314
			var3 = class6.Entity_unpackID(var1); // L: 7315
			var4 = var6 & 31; // L: 7316
			var5 = var6 >> 6 & 3; // L: 7317
		}

		var0.objectId = var3; // L: 7319
		var0.field1203 = var4; // L: 7320
		var0.field1199 = var5; // L: 7321
	} // L: 7322

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1784576857"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		Script.method2014(); // L: 11215

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 11217
			if (var1.obj != null) { // L: 11218
				var1.set();
			}
		}

		int var3 = MusicPatchNode.VarpDefinition_get(var0).type; // L: 11221
		if (var3 != 0) { // L: 11222
			int var2 = Varps.Varps_main[var0]; // L: 11223
			if (var3 == 1) { // L: 11224
				if (var2 == 1) { // L: 11225
					class264.method4796(0.9D);
				}

				if (var2 == 2) { // L: 11226
					class264.method4796(0.8D);
				}

				if (var2 == 3) { // L: 11227
					class264.method4796(0.7D);
				}

				if (var2 == 4) { // L: 11228
					class264.method4796(0.6D);
				}
			}

			if (var3 == 3) { // L: 11230
				if (var2 == 0) { // L: 11231
					class23.method306(255);
				}

				if (var2 == 1) { // L: 11232
					class23.method306(192);
				}

				if (var2 == 2) { // L: 11233
					class23.method306(128);
				}

				if (var2 == 3) { // L: 11234
					class23.method306(64);
				}

				if (var2 == 4) { // L: 11235
					class23.method306(0);
				}
			}

			if (var3 == 4) { // L: 11237
				if (var2 == 0) { // L: 11238
					class20.updateSoundEffectVolume(127);
				}

				if (var2 == 1) { // L: 11239
					class20.updateSoundEffectVolume(96);
				}

				if (var2 == 2) { // L: 11240
					class20.updateSoundEffectVolume(64);
				}

				if (var2 == 3) { // L: 11241
					class20.updateSoundEffectVolume(32);
				}

				if (var2 == 4) { // L: 11242
					class20.updateSoundEffectVolume(0);
				}
			}

			if (var3 == 5) { // L: 11244
				Client.leftClickOpensMenu = var2;
			}

			if (var3 == 6) { // L: 11245
				Client.chatEffects = var2;
			}

			if (var3 == 9) { // L: 11246
				Client.field781 = var2;
			}

			if (var3 == 10) { // L: 11247
				if (var2 == 0) { // L: 11248
					Occluder.method4088(127);
				}

				if (var2 == 1) { // L: 11249
					Occluder.method4088(96);
				}

				if (var2 == 2) { // L: 11250
					Occluder.method4088(64);
				}

				if (var2 == 3) { // L: 11251
					Occluder.method4088(32);
				}

				if (var2 == 4) { // L: 11252
					Occluder.method4088(0);
				}
			}

			if (var3 == 17) { // L: 11254
				Client.followerIndex = var2 & 65535; // L: 11255
			}

			if (var3 == 18) { // L: 11257
				Client.playerAttackOption = (AttackOption)UserComparator4.findEnumerated(Renderable.method4080(), var2); // L: 11258
				if (Client.playerAttackOption == null) { // L: 11259
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var3 == 19) { // L: 11261
				if (var2 == -1) { // L: 11262
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 11263
				}
			}

			if (var3 == 22) { // L: 11265
				Client.npcAttackOption = (AttackOption)UserComparator4.findEnumerated(Renderable.method4080(), var2); // L: 11266
				if (Client.npcAttackOption == null) { // L: 11267
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 11269
}
