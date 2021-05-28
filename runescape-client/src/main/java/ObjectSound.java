import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1262714503
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 382039955
	)
	@Export("x")
	int x;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -377542945
	)
	@Export("y")
	int y;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1913199289
	)
	int field956;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 846164283
	)
	int field957;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	@Export("obj")
	ObjectComposition obj;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2101998419
	)
	int field958;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 2113426875
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1385478755
	)
	int field961;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1819837691
	)
	int field964;
	@ObfuscatedName("o")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1313201795
	)
	int field954;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("stream2")
	RawPcmStream stream2;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "10"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 50
		ObjectComposition var2 = this.obj.transform(); // L: 51
		if (var2 != null) { // L: 52
			this.soundEffectId = var2.ambientSoundId; // L: 53
			this.field958 = var2.int4 * 128; // L: 54
			this.field961 = var2.int5; // L: 55
			this.field964 = var2.int6; // L: 56
			this.soundEffectIds = var2.soundEffectIds; // L: 57
		} else {
			this.soundEffectId = -1; // L: 60
			this.field958 = 0; // L: 61
			this.field961 = 0; // L: 62
			this.field964 = 0; // L: 63
			this.soundEffectIds = null; // L: 64
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 66
			class308.pcmStreamMixer.removeSubStream(this.stream1); // L: 67
			this.stream1 = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Lio;IIII)V",
		garbageValue = "-1477565954"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		HealthBarUpdate.playPcmPlayers(); // L: 11121
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11122
		if (var4 != null) { // L: 11123
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 11124
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 11125
				int var5 = Client.camAngleY & 2047; // L: 11126
				int var6 = class93.localPlayer.x / 32 + 48; // L: 11127
				int var7 = 464 - class93.localPlayer.y / 32; // L: 11128
				GameEngine.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 11129

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 11130
					var16 = Client.mapIconXs[var8] * 4 + 2 - class93.localPlayer.x / 32; // L: 11131
					var10 = Client.mapIconYs[var8] * 4 + 2 - class93.localPlayer.y / 32; // L: 11132
					ObjectComposition.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 11133
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 11135
					for (var16 = 0; var16 < 104; ++var16) { // L: 11136
						NodeDeque var14 = Client.groundItems[class22.Client_plane][var8][var16]; // L: 11137
						if (var14 != null) { // L: 11138
							var11 = var8 * 4 + 2 - class93.localPlayer.x / 32; // L: 11139
							var12 = var16 * 4 + 2 - class93.localPlayer.y / 32; // L: 11140
							ObjectComposition.drawSpriteOnMinimap(var1, var2, var11, var12, class170.mapDotSprites[0], var4); // L: 11141
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 11145
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 11146
					if (var9 != null && var9.isVisible()) { // L: 11147
						NPCComposition var18 = var9.definition; // L: 11148
						if (var18 != null && var18.transforms != null) { // L: 11149
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 11150
							var11 = var9.x / 32 - class93.localPlayer.x / 32; // L: 11151
							var12 = var9.y / 32 - class93.localPlayer.y / 32; // L: 11152
							ObjectComposition.drawSpriteOnMinimap(var1, var2, var11, var12, class170.mapDotSprites[1], var4); // L: 11153
						}
					}
				}

				var8 = Players.Players_count; // L: 11157
				int[] var17 = Players.Players_indices; // L: 11158

				for (var10 = 0; var10 < var8; ++var10) { // L: 11159
					Player var15 = Client.players[var17[var10]]; // L: 11160
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class93.localPlayer) { // L: 11161
						var12 = var15.x / 32 - class93.localPlayer.x / 32; // L: 11162
						int var13 = var15.y / 32 - class93.localPlayer.y / 32; // L: 11163
						if (var15.isFriend()) { // L: 11164
							ObjectComposition.drawSpriteOnMinimap(var1, var2, var12, var13, class170.mapDotSprites[3], var4);
						} else if (class93.localPlayer.team != 0 && var15.team != 0 && var15.team == class93.localPlayer.team) { // L: 11165
							ObjectComposition.drawSpriteOnMinimap(var1, var2, var12, var13, class170.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) { // L: 11166
							ObjectComposition.drawSpriteOnMinimap(var1, var2, var12, var13, class170.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) { // L: 11167
							ObjectComposition.drawSpriteOnMinimap(var1, var2, var12, var13, class170.mapDotSprites[6], var4);
						} else {
							ObjectComposition.drawSpriteOnMinimap(var1, var2, var12, var13, class170.mapDotSprites[2], var4); // L: 11168
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 11171
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 11172
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex]; // L: 11173
						if (var19 != null) { // L: 11174
							var11 = var19.x / 32 - class93.localPlayer.x / 32; // L: 11175
							var12 = var19.y / 32 - class93.localPlayer.y / 32; // L: 11176
							MenuAction.worldToMinimap(var1, var2, var11, var12, WorldMapArea.mapMarkerSprites[1], var4); // L: 11177
						}
					}

					if (Client.hintArrowType == 2) { // L: 11180
						var10 = Client.hintArrowX * 4 - VertexNormal.baseX * 4 + 2 - class93.localPlayer.x / 32; // L: 11181
						var11 = Client.hintArrowY * 4 - SoundSystem.baseY * 4 + 2 - class93.localPlayer.y / 32; // L: 11182
						MenuAction.worldToMinimap(var1, var2, var10, var11, WorldMapArea.mapMarkerSprites[1], var4); // L: 11183
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 11185
						Player var20 = Client.players[Client.hintArrowPlayerIndex]; // L: 11186
						if (var20 != null) { // L: 11187
							var11 = var20.x / 32 - class93.localPlayer.x / 32; // L: 11188
							var12 = var20.y / 32 - class93.localPlayer.y / 32; // L: 11189
							MenuAction.worldToMinimap(var1, var2, var11, var12, WorldMapArea.mapMarkerSprites[1], var4); // L: 11190
						}
					}
				}

				if (Client.destinationX != 0) { // L: 11194
					var10 = Client.destinationX * 4 + 2 - class93.localPlayer.x / 32; // L: 11195
					var11 = Client.destinationY * 4 + 2 - class93.localPlayer.y / 32; // L: 11196
					ObjectComposition.drawSpriteOnMinimap(var1, var2, var10, var11, WorldMapArea.mapMarkerSprites[0], var4); // L: 11197
				}

				if (!class93.localPlayer.isHidden) { // L: 11199
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11201
			}

			Client.field780[var3] = true; // L: 11202
		}
	} // L: 11203

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1750320042"
	)
	static void method1761() {
		if (UserComparator3.field1444 != null) { // L: 11541
			Client.field717 = Client.cycle; // L: 11542
			UserComparator3.field1444.method5126(); // L: 11543

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 11544
				if (Client.players[var0] != null) { // L: 11545
					UserComparator3.field1444.method5117((Client.players[var0].x >> 7) + VertexNormal.baseX, (Client.players[var0].y >> 7) + SoundSystem.baseY); // L: 11546
				}
			}
		}

	} // L: 11550
}
