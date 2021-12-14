import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	field1829(0, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(2, 1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	field1826(1, 2);

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -947111311
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -968745241
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpj;B)V",
		garbageValue = "13"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex();
		int var1 = Client.localPlayerIndex;
		Player var2 = class340.localPlayer = Client.players[var1] = new Player();
		var2.index = var1;
		int var3 = var0.readBits(30);
		byte var4 = (byte)(var3 >> 28);
		int var5 = var3 >> 14 & 16383;
		int var6 = var3 & 16383;
		var2.pathX[0] = var5 - class131.baseX;
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6);
		var2.pathY[0] = var6 - TileItem.baseY;
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6);
		class20.Client_plane = var2.plane = var4;
		if (Players.field1248[var1] != null) {
			var2.read(Players.field1248[var1]);
		}

		Players.Players_count = 0;
		Players.Players_indices[++Players.Players_count - 1] = var1;
		Players.field1243[var1] = 0;
		Players.Players_emptyIdxCount = 0;

		for (int var7 = 1; var7 < 2048; ++var7) {
			if (var1 != var7) {
				int var8 = var0.readBits(18);
				int var9 = var8 >> 16;
				int var10 = var8 >> 8 & 597;
				int var11 = var8 & 597;
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28);
				Players.Players_orientations[var7] = 0;
				Players.Players_targetIndices[var7] = -1;
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7;
				Players.field1243[var7] = 0;
			}
		}

		var0.exportIndex();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Float;Ljava/lang/Float;I)V",
		garbageValue = "-2046579641"
	)
	static void method3294(Float var0, Float var1) {
		if (var0 + class112.field1361 < 1.3333334F) {
			float var2 = var0 - 2.0F;
			float var3 = var0 - 1.0F;
			float var4 = (float)Math.sqrt((double)(var2 * var2 - 4.0F * var3 * var3));
			float var5 = (var4 + -var2) * 0.5F;
			if (var1 + class112.field1361 > var5) {
				var1 = var5 - class112.field1361;
			} else {
				var5 = 0.5F * (-var2 - var4);
				if (var1 < class112.field1361 + var5) {
					var1 = class112.field1361 + var5;
				}
			}
		} else {
			var0 = 1.3333334F - class112.field1361;
			var1 = 0.33333334F - class112.field1361;
		}

	}
}
