import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("StudioGame")
public enum StudioGame implements Enumerated {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lib;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lib;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lib;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lib;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lib;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lib;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("gu")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("n")
	@Export("name")
	public final String name;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1640024773
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-995092303"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(II)Ljz;",
		garbageValue = "916487028"
	)
	@Export("getNpcDefinition")
	public static NPCDefinition getNpcDefinition(int var0) {
		NPCDefinition var1 = (NPCDefinition)NPCDefinition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCDefinition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCDefinition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		signature = "(IIIIII)V",
		garbageValue = "-1280022094"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		WorldMapElement.scrollBarSprites[0].drawAt(var0, var1);
		WorldMapElement.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field736);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field737);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field739);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field739);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field739);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field739);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field694);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field694);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var5 + var1 + 15, 16, Client.field694);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field694);
	}
}
