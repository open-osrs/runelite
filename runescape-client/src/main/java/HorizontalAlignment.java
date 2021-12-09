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
		this.value = var3; // L: 18
		this.id = var4; // L: 19
	} // L: 20

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 24
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpj;B)V",
		garbageValue = "13"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 37
		int var1 = Client.localPlayerIndex; // L: 38
		Player var2 = class340.localPlayer = Client.players[var1] = new Player(); // L: 39
		var2.index = var1; // L: 40
		int var3 = var0.readBits(30); // L: 41
		byte var4 = (byte)(var3 >> 28); // L: 42
		int var5 = var3 >> 14 & 16383; // L: 43
		int var6 = var3 & 16383; // L: 44
		var2.pathX[0] = var5 - class131.baseX; // L: 45
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6); // L: 46
		var2.pathY[0] = var6 - TileItem.baseY; // L: 47
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6); // L: 48
		class20.Client_plane = var2.plane = var4; // L: 49
		if (Players.field1248[var1] != null) { // L: 50
			var2.read(Players.field1248[var1]);
		}

		Players.Players_count = 0; // L: 51
		Players.Players_indices[++Players.Players_count - 1] = var1; // L: 52
		Players.field1243[var1] = 0; // L: 53
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
				Players.field1243[var7] = 0; // L: 65
			}
		}

		var0.exportIndex(); // L: 67
	} // L: 68

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Float;Ljava/lang/Float;I)V",
		garbageValue = "-2046579641"
	)
	static void method3294(Float var0, Float var1) {
		if (var0 + class112.field1361 < 1.3333334F) { // L: 314
			float var2 = var0 - 2.0F; // L: 315
			float var3 = var0 - 1.0F; // L: 316
			float var4 = (float)Math.sqrt((double)(var2 * var2 - 4.0F * var3 * var3)); // L: 317
			float var5 = (var4 + -var2) * 0.5F; // L: 318
			if (var1 + class112.field1361 > var5) { // L: 319
				var1 = var5 - class112.field1361; // L: 320
			} else {
				var5 = 0.5F * (-var2 - var4); // L: 323
				if (var1 < class112.field1361 + var5) { // L: 324
					var1 = class112.field1361 + var5; // L: 325
				}
			}
		} else {
			var0 = 1.3333334F - class112.field1361; // L: 330
			var1 = 0.33333334F - class112.field1361; // L: 331
		}

	} // L: 333
}
