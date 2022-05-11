import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
public class class67 {
	@ObfuscatedName("o")
	static final BigInteger field875;
	@ObfuscatedName("q")
	static final BigInteger field871;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;

	static {
		field875 = new BigInteger("10001", 16); // L: 6
		field871 = new BigInteger("b53e1d1321015e2b89b11477ee53d8352f43919de31343ff871ec92cae904da943010aeeb8026f3499c5850107833d2068992bf58921ee3a16ead4ac3f5b0aba763660bd6e68e45b863c2d6364b1d6faa581596c56c1117caf3f637c8dd223d6272654c304d3de1c13c47ef929a582788a1f9058b01e13082fbe05d69591d05d", 16); // L: 7
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpx;IIIIIIB)V",
		garbageValue = "109"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 168
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 169

			while (true) {
				var7 = var0.readUnsignedByte(); // L: 171
				if (var7 == 0) { // L: 172
					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -GrandExchangeOfferUnitPriceComparator.method5846(var4 + var2 + 932731, 556238 + var3 + var5) * 8; // L: 173
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 174
					}
					break;
				}

				if (var7 == 1) { // L: 177
					int var8 = var0.readUnsignedByte(); // L: 178
					if (var8 == 1) { // L: 179
						var8 = 0;
					}

					if (var1 == 0) { // L: 180
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 181
					}
					break;
				}

				if (var7 <= 49) { // L: 184
					Tiles.Tiles_overlays[var1][var2][var3] = var0.readByte(); // L: 185
					Tiles.Tiles_shapes[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 186
					RunException.field4812[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 187
				} else if (var7 <= 81) { // L: 190
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 191
				} else {
					Tiles.Tiles_underlays[var1][var2][var3] = (byte)(var7 - 81); // L: 194
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte(); // L: 199
				if (var7 == 0) { // L: 200
					break;
				}

				if (var7 == 1) { // L: 201
					var0.readUnsignedByte(); // L: 202
					break;
				}

				if (var7 <= 49) { // L: 205
					var0.readUnsignedByte();
				}
			}
		}

	} // L: 208

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Llp;IB)Lqd;",
		garbageValue = "69"
	)
	public static IndexedSprite method1883(AbstractArchive var0, int var1) {
		if (!class28.method374(var0, var1)) { // L: 130
			return null;
		} else {
			IndexedSprite var3 = new IndexedSprite(); // L: 133
			var3.width = class453.SpriteBuffer_spriteWidth; // L: 134
			var3.height = class453.SpriteBuffer_spriteHeight; // L: 135
			var3.xOffset = class453.SpriteBuffer_xOffsets[0]; // L: 136
			var3.yOffset = class453.SpriteBuffer_yOffsets[0]; // L: 137
			var3.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[0]; // L: 138
			var3.subHeight = class453.SpriteBuffer_spriteHeights[0]; // L: 139
			var3.palette = Decimator.SpriteBuffer_spritePalette; // L: 140
			var3.pixels = class127.SpriteBuffer_pixels[0]; // L: 141
			VarcInt.method3325(); // L: 142
			return var3; // L: 145
		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1989518897"
	)
	static final void method1881(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12073
		class12.clientPreferences.updateSoundEffectVolume(var0); // L: 12074
	} // L: 12075
}
