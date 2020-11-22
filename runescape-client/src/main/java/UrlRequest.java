import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("f")
	@Export("url")
	final URL url;
	@ObfuscatedName("b")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("l")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1; // L: 96
	} // L: 97

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-225221070"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0; // L: 100
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-126"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0; // L: 104
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "118404213"
	)
	static void method3436() {
		Messages.Messages_channels.clear(); // L: 54
		Messages.Messages_hashTable.clear(); // L: 55
		Messages.Messages_queue.clear(); // L: 56
		Messages.Messages_count = 0; // L: 57
	} // L: 58

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-697232655"
	)
	static final boolean method3437(int var0, int var1) {
		ObjectDefinition var2 = ScriptEvent.getObjectDefinition(var0); // L: 499
		if (var1 == 11) { // L: 500
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4; // L: 501
		}

		return var2.method4764(var1); // L: 502
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(IIIILlc;Lho;I)V",
		garbageValue = "1829625632"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, Sprite var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 11451
		if (var6 > 4225 && var6 < 90000) { // L: 11452
			int var7 = Client.camAngleY & 2047; // L: 11453
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 11454
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 11455
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 11456
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11457
			double var12 = Math.atan2((double)var10, (double)var11); // L: 11458
			int var14 = var5.width / 2 - 25; // L: 11459
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 11460
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 11461
			byte var17 = 20; // L: 11462
			class219.redHintArrowSprite.method6303(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 11463
		} else {
			TileItem.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 11465
		}

	} // L: 11466
}
