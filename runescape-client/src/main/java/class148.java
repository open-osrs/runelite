import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public class class148 extends class126 {
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -7662104054816781627L
	)
	long field1673;
	@ObfuscatedName("l")
	String field1669;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldk;)V"
	)
	class148(class129 var1) {
		this.this$0 = var1;
		this.field1673 = -1L; // L: 194
		this.field1669 = null; // L: 195
	} // L: 197

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "703192976"
	)
	void vmethod3019(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1673 = var1.readLong(); // L: 202
		}

		this.field1669 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)V",
		garbageValue = "750335300"
	)
	void vmethod3020(ClanSettings var1) {
		var1.method2877(this.field1673, this.field1669); // L: 208
	} // L: 209

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2116759731"
	)
	public static boolean method3005(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field138[var0] : false; // L: 266 267
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1390458390"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5180
			int var3 = class92.getTileHeight(var0, var1, SoundSystem.Client_plane) - var2; // L: 5185
			var0 -= class414.cameraX; // L: 5186
			var3 -= WorldMapDecoration.cameraY; // L: 5187
			var1 -= GrandExchangeOfferOwnWorldComparator.cameraZ; // L: 5188
			int var4 = Rasterizer3D.Rasterizer3D_sine[class7.cameraPitch]; // L: 5189
			int var5 = Rasterizer3D.Rasterizer3D_cosine[class7.cameraPitch]; // L: 5190
			int var6 = Rasterizer3D.Rasterizer3D_sine[class7.cameraYaw]; // L: 5191
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class7.cameraYaw]; // L: 5192
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 5193
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5194
			var0 = var8; // L: 5195
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 5196
			var1 = var4 * var3 + var5 * var1 >> 16; // L: 5197
			if (var1 >= 50) { // L: 5199
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5200
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1; // L: 5201
			} else {
				Client.viewportTempX = -1; // L: 5204
				Client.viewportTempY = -1; // L: 5205
			}

		} else {
			Client.viewportTempX = -1; // L: 5181
			Client.viewportTempY = -1; // L: 5182
		}
	} // L: 5183 5207
}
