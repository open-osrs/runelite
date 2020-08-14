import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("StructDefinition")
public class StructDefinition extends DualNode {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("StructDefinition_archive")
	static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	@Export("StructDefinition_cached")
	public static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	StructDefinition() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-98"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)V",
		garbageValue = "381784776"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lkn;II)V",
		garbageValue = "337645419"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = WorldMapElement.readStringIntParameters(var1, this.params);
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "48203250"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return Language.method3801(this.params, var1, var2);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1617799993"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return FloorUnderlayDefinition.method4612(this.params, var1, var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)[Lgu;",
		garbageValue = "8211"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field2191, ServerPacket.field2177, ServerPacket.field2200, ServerPacket.field2156, ServerPacket.field2211, ServerPacket.field2158, ServerPacket.field2219, ServerPacket.field2228, ServerPacket.field2161, ServerPacket.field2169, ServerPacket.field2224, ServerPacket.field2164, ServerPacket.field2155, ServerPacket.field2166, ServerPacket.field2167, ServerPacket.field2168, ServerPacket.field2181, ServerPacket.field2170, ServerPacket.field2232, ServerPacket.field2172, ServerPacket.field2173, ServerPacket.field2189, ServerPacket.field2171, ServerPacket.field2176, ServerPacket.field2165, ServerPacket.field2178, ServerPacket.field2175, ServerPacket.field2180, ServerPacket.field2240, ServerPacket.field2182, ServerPacket.field2183, ServerPacket.field2184, ServerPacket.field2185, ServerPacket.field2186, ServerPacket.field2187, ServerPacket.field2188, ServerPacket.field2160, ServerPacket.field2220, ServerPacket.field2162, ServerPacket.field2159, ServerPacket.field2199, ServerPacket.field2194, ServerPacket.field2157, ServerPacket.field2193, ServerPacket.field2197, ServerPacket.field2190, ServerPacket.field2223, ServerPacket.field2163, ServerPacket.field2201, ServerPacket.field2202, ServerPacket.field2203, ServerPacket.field2204, ServerPacket.field2205, ServerPacket.field2206, ServerPacket.field2207, ServerPacket.field2208, ServerPacket.field2209, ServerPacket.field2210, ServerPacket.field2230, ServerPacket.field2212, ServerPacket.field2213, ServerPacket.field2226, ServerPacket.field2215, ServerPacket.field2216, ServerPacket.field2217, ServerPacket.field2218, ServerPacket.field2196, ServerPacket.field2174, ServerPacket.field2221, ServerPacket.field2222, ServerPacket.field2235, ServerPacket.field2153, ServerPacket.field2225, ServerPacket.field2195, ServerPacket.field2227, ServerPacket.field2233, ServerPacket.field2229, ServerPacket.field2179, ServerPacket.field2231, ServerPacket.field2214, ServerPacket.field2154, ServerPacket.field2234, ServerPacket.field2198, ServerPacket.field2236, ServerPacket.field2237, ServerPacket.field2238};
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "1817057195"
	)
	public static String method4718(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var3 = var0[var1];
			return var3 == null ? "null" : var3.toString();
		} else {
			int var8 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var8; ++var5) {
				CharSequence var6 = var0[var5];
				if (var6 == null) {
					var4 += 4;
				} else {
					var4 += var6.length();
				}
			}

			StringBuilder var9 = new StringBuilder(var4);

			for (int var10 = var1; var10 < var8; ++var10) {
				CharSequence var7 = var0[var10];
				if (var7 == null) {
					var9.append("null");
				} else {
					var9.append(var7);
				}
			}

			return var9.toString();
		}
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Lhd;IIII)V",
		garbageValue = "-1082386904"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		Timer.playPcmPlayers();
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = class60.localPlayer.x / 32 + 48;
				int var7 = 464 - class60.localPlayer.y / 32;
				class3.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var9;
				int var10;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var9 = Client.mapIconXs[var8] * 4 + 2 - class60.localPlayer.x / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - class60.localPlayer.y / 32;
					GrandExchangeOffer.drawSpriteOnMinimap(var1, var2, var9, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var9 = 0; var9 < 104; ++var9) {
						NodeDeque var15 = Client.groundItems[TileItemPile.Client_plane][var8][var9];
						if (var15 != null) {
							var11 = var8 * 4 + 2 - class60.localPlayer.x / 32;
							var12 = var9 * 4 + 2 - class60.localPlayer.y / 32;
							GrandExchangeOffer.drawSpriteOnMinimap(var1, var2, var11, var12, AttackOption.mapDotSprites[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) {
					NPC var16 = Client.npcs[Client.npcIndices[var8]];
					if (var16 != null && var16.isVisible()) {
						NPCDefinition var18 = var16.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var11 = var16.x / 32 - class60.localPlayer.x / 32;
							var12 = var16.y / 32 - class60.localPlayer.y / 32;
							GrandExchangeOffer.drawSpriteOnMinimap(var1, var2, var11, var12, AttackOption.mapDotSprites[1], var4);
						}
					}
				}

				var8 = Players.Players_count;
				int[] var19 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var17 = Client.players[var19[var10]];
					if (var17 != null && var17.isVisible() && !var17.isHidden && var17 != class60.localPlayer) {
						var12 = var17.x / 32 - class60.localPlayer.x / 32;
						int var13 = var17.y / 32 - class60.localPlayer.y / 32;
						boolean var14 = false;
						if (class60.localPlayer.team != 0 && var17.team != 0 && var17.team == class60.localPlayer.team) {
							var14 = true;
						}

						if (var17.isFriend()) {
							GrandExchangeOffer.drawSpriteOnMinimap(var1, var2, var12, var13, AttackOption.mapDotSprites[3], var4);
						} else if (var14) {
							GrandExchangeOffer.drawSpriteOnMinimap(var1, var2, var12, var13, AttackOption.mapDotSprites[4], var4);
						} else if (var17.isClanMember()) {
							GrandExchangeOffer.drawSpriteOnMinimap(var1, var2, var12, var13, AttackOption.mapDotSprites[5], var4);
						} else {
							GrandExchangeOffer.drawSpriteOnMinimap(var1, var2, var12, var13, AttackOption.mapDotSprites[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var20 = Client.npcs[Client.hintArrowNpcIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - class60.localPlayer.x / 32;
							var12 = var20.y / 32 - class60.localPlayer.y / 32;
							WorldMapRectangle.worldToMinimap(var1, var2, var11, var12, class9.mapMarkerSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - class182.baseX * 4 + 2 - class60.localPlayer.x / 32;
						var11 = Client.hintArrowY * 4 - SecureRandomFuture.baseY * 4 + 2 - class60.localPlayer.y / 32;
						WorldMapRectangle.worldToMinimap(var1, var2, var10, var11, class9.mapMarkerSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var21 = Client.players[Client.hintArrowPlayerIndex];
						if (var21 != null) {
							var11 = var21.x / 32 - class60.localPlayer.x / 32;
							var12 = var21.y / 32 - class60.localPlayer.y / 32;
							WorldMapRectangle.worldToMinimap(var1, var2, var11, var12, class9.mapMarkerSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - class60.localPlayer.x / 32;
					var11 = Client.destinationY * 4 + 2 - class60.localPlayer.y / 32;
					GrandExchangeOffer.drawSpriteOnMinimap(var1, var2, var10, var11, class9.mapMarkerSprites[0], var4);
				}

				if (!class60.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field879[var3] = true;
		}
	}
}
