import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
public enum HorizontalAlignment implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	field3479(1, 0),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	HorizontalAlignment_centered(0, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	field3481(2, 2);

	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1646295401
	)
	public final int value;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1817509831
	)
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 18
		this.id = var4; // L: 19
	} // L: 20

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "385513888"
	)
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lky;B)V",
		garbageValue = "-34"
	)
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 37
		int var1 = Client.localPlayerIndex; // L: 38
		Player var2 = WorldMapLabelSize.localPlayer = Client.players[var1] = new Player(); // L: 39
		var2.index = var1; // L: 40
		int var3 = var0.readBits(30); // L: 41
		byte var4 = (byte)(var3 >> 28); // L: 42
		int var5 = var3 >> 14 & 16383; // L: 43
		int var6 = var3 & 16383; // L: 44
		var2.pathX[0] = var5 - WorldMapManager.baseX; // L: 45
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6); // L: 46
		var2.pathY[0] = var6 - WorldMapLabel.baseY; // L: 47
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6); // L: 48
		Huffman.Client_plane = var2.plane = var4; // L: 49
		if (Players.field1277[var1] != null) { // L: 50
			var2.read(Players.field1277[var1]);
		}

		Players.Players_count = 0; // L: 51
		Players.Players_indices[++Players.Players_count - 1] = var1; // L: 52
		Players.field1285[var1] = 0; // L: 53
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
				Players.field1285[var7] = 0; // L: 65
			}
		}

		var0.exportIndex(); // L: 67
	} // L: 68
}
