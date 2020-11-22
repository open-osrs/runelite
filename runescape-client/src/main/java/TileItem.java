import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("TileItem")
public final class TileItem extends Entity {
	@ObfuscatedName("m")
	static byte[][][] field1273;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1111898775
	)
	@Export("musicTrackGroupId")
	public static int musicTrackGroupId;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 1784149291
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -459870843
	)
	@Export("id")
	int id;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 724722271
	)
	@Export("quantity")
	int quantity;

	TileItem() {
	} // L: 11

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Leh;",
		garbageValue = "-2070677844"
	)
	@Export("getModel")
	protected final Model getModel() {
		return AbstractWorldMapData.ItemDefinition_get(this.id).getModel(this.quantity); // L: 14
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lik;",
		garbageValue = "2051989358"
	)
	public static StudioGame[] method2237() {
		return new StudioGame[]{StudioGame.runescape, StudioGame.game3, StudioGame.game5, StudioGame.oldscape, StudioGame.game4, StudioGame.stellardawn}; // L: 17
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lju;",
		garbageValue = "458582933"
	)
	@Export("getParamDefinition")
	public static ParamDefinition getParamDefinition(int var0) {
		ParamDefinition var1 = (ParamDefinition)ParamDefinition.ParamDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = ParamDefinition.ParamDefinition_archive.takeFile(11, var0); // L: 23
			var1 = new ParamDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 26
			ParamDefinition.ParamDefinition_cached.put(var1, (long)var0); // L: 27
			return var1; // L: 28
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lks;B)V",
		garbageValue = "43"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 37
		int var1 = Client.localPlayerIndex; // L: 38
		Player var2 = PlayerType.localPlayer = Client.players[var1] = new Player(); // L: 39
		var2.index = var1; // L: 40
		int var3 = var0.readBits(30); // L: 41
		byte var4 = (byte)(var3 >> 28); // L: 42
		int var5 = var3 >> 14 & 16383; // L: 43
		int var6 = var3 & 16383; // L: 44
		var2.pathX[0] = var5 - FloorDecoration.baseX; // L: 45
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6); // L: 46
		var2.pathY[0] = var6 - WorldMapData_0.baseY; // L: 47
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6); // L: 48
		GrandExchangeOfferUnitPriceComparator.Client_plane = var2.plane = var4; // L: 49
		if (Players.field1284[var1] != null) { // L: 50
			var2.read(Players.field1284[var1]);
		}

		Players.Players_count = 0; // L: 51
		Players.Players_indices[++Players.Players_count - 1] = var1; // L: 52
		Players.field1282[var1] = 0; // L: 53
		Players.Players_emptyIdxCount = 0; // L: 54

		for (int var7 = 1; var7 < 2048; ++var7) { // L: 55
			if (var1 != var7) { // L: 56
				int var8 = var0.readBits(18); // L: 57
				int var9 = var8 >> 16; // L: 58
				int var10 = var8 >> 8 & 597; // L: 59
				int var11 = var8 & 597; // L: 60
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28); // L: 61
				Players.Players_orientations[var7] = 0; // L: 62
				Players.Players_targetIndices[var7] = -1; // L: 63
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7; // L: 64
				Players.field1282[var7] = 0; // L: 65
			}
		}

		var0.exportIndex(); // L: 67
	} // L: 68

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "181206884"
	)
	public static void method2239() {
		NPCDefinition.NpcDefinition_cached.clear(); // L: 266
		NPCDefinition.NpcDefinition_cachedModels.clear(); // L: 267
	} // L: 268

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1638276370"
	)
	static boolean method2235(int var0) {
		for (int var1 = 0; var1 < Client.field902; ++var1) { // L: 10802
			if (Client.field904[var1] == var0) { // L: 10803
				return true;
			}
		}

		return false; // L: 10805
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(IIIILlc;Lho;I)V",
		garbageValue = "1898087966"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, Sprite var4, SpriteMask var5) {
		if (var4 != null) { // L: 11469
			int var6 = Client.camAngleY & 2047; // L: 11470
			int var7 = var3 * var3 + var2 * var2; // L: 11471
			if (var7 <= 6400) { // L: 11472
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 11473
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 11474
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 11475
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11476
				if (var7 > 2500) {
					var4.method6296(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 11477
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 11478
				}

			}
		}
	} // L: 11479
}
