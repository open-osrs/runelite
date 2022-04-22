import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("fw")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1889(2, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(1, 1),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1890(0, 2);

	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	static class391 field1885;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 544424349
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -801699883
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 19
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lqq;",
		garbageValue = "2022945893"
	)
	public static IndexedSprite method3492() {
		IndexedSprite var0 = new IndexedSprite(); // L: 155
		var0.width = class451.SpriteBuffer_spriteWidth; // L: 156
		var0.height = class451.SpriteBuffer_spriteHeight; // L: 157
		var0.xOffset = class451.SpriteBuffer_xOffsets[0]; // L: 158
		var0.yOffset = class271.SpriteBuffer_yOffsets[0]; // L: 159
		var0.subWidth = class451.SpriteBuffer_spriteWidths[0]; // L: 160
		var0.subHeight = class451.SpriteBuffer_spriteHeights[0]; // L: 161
		var0.palette = NetFileRequest.SpriteBuffer_spritePalette; // L: 162
		var0.pixels = FriendLoginUpdate.SpriteBuffer_pixels[0]; // L: 163
		ArchiveDiskActionHandler.method5813(); // L: 164
		return var0; // L: 165
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;B)[F",
		garbageValue = "-127"
	)
	static float[] method3495(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4]; // L: 307

		try {
			JSONArray var3 = var0.getJSONArray(var1); // L: 309
			var2[0] = (float)var3.optDouble(0, 0.0D); // L: 310
			var2[1] = (float)var3.optDouble(1, 0.0D); // L: 311
			var2[2] = (float)var3.optDouble(2, 1.0D); // L: 312
			var2[3] = (float)var3.optDouble(3, 1.0D); // L: 313
		} catch (JSONException var4) { // L: 315
			var2[0] = 0.0F; // L: 316
			var2[1] = 0.0F; // L: 317
			var2[2] = 1.0F; // L: 318
			var2[3] = 1.0F; // L: 319
		}

		return var2; // L: 321
	}
}
