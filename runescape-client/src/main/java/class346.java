import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public class class346 implements Iterator {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	class347 field4163;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -437378707
	)
	int field4162;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -797289567
	)
	int field4164;

	@ObfuscatedSignature(
		descriptor = "(Lmo;)V"
	)
	class346(class347 var1) {
		this.field4162 = 0; // L: 177
		this.field4164 = this.field4163.field4169; // L: 178
		this.field4163 = var1; // L: 181
	} // L: 182

	public boolean hasNext() {
		return this.field4162 < this.field4163.field4165; // L: 186
	}

	public Object next() {
		if (this.field4163.field4169 != this.field4164) { // L: 192
			throw new ConcurrentModificationException();
		} else if (this.field4162 < this.field4163.field4165) { // L: 193
			Object var1 = this.field4163.field4166[this.field4162].field4159; // L: 194
			++this.field4162; // L: 195
			return var1; // L: 196
		} else {
			throw new NoSuchElementException(); // L: 198
		}
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 203
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lkb;IIIS)V",
		garbageValue = "16250"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3450 == null) { // L: 1022
			throw new RuntimeException(); // L: 1023
		} else {
			var0.field3450[var1] = var2; // L: 1025
			var0.field3451[var1] = var3; // L: 1026
		}
	} // L: 1027

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Lqe;",
		garbageValue = "2024735229"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 365
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 366
			var4 = 1;
		}

		long var6 = ((long)var4 << 40) + ((long)var2 << 38) + (long)var0 + ((long)var1 << 16) + ((long)var3 << 42); // L: 367
		SpritePixels var8;
		if (!var5) { // L: 369
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6); // L: 370
			if (var8 != null) { // L: 371
				return var8;
			}
		}

		ItemComposition var9 = EnumComposition.ItemDefinition_get(var0); // L: 373
		if (var1 > 1 && var9.countobj != null) { // L: 374
			int var10 = -1; // L: 375

			for (int var11 = 0; var11 < 10; ++var11) { // L: 376
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 377
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 379
				var9 = EnumComposition.ItemDefinition_get(var10);
			}
		}

		Model var19 = var9.getModel(1); // L: 381
		if (var19 == null) { // L: 382
			return null;
		} else {
			SpritePixels var20 = null; // L: 383
			if (var9.noteTemplate != -1) { // L: 384
				var20 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 385
				if (var20 == null) { // L: 386
					return null;
				}
			} else if (var9.notedId != -1) { // L: 388
				var20 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 389
				if (var20 == null) { // L: 390
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 392
				var20 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 393
				if (var20 == null) { // L: 394
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 396
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 397
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 398
			int[] var15 = new int[4]; // L: 399
			Rasterizer2D.Rasterizer2D_getClipArray(var15); // L: 400
			var8 = new SpritePixels(36, 32); // L: 401
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 402
			Rasterizer2D.Rasterizer2D_clear(); // L: 403
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 404
			Rasterizer3D.method4021(16, 16); // L: 405
			Rasterizer3D.field2340 = false; // L: 406
			if (var9.placeholderTemplate != -1) { // L: 407
				var20.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d; // L: 408
			if (var5) { // L: 409
				var16 = (int)((double)var16 * 1.5D);
			} else if (var2 == 2) { // L: 410
				var16 = (int)(1.04D * (double)var16);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 411
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 412
			var19.calculateBoundsCylinder(); // L: 413
			var19.method4442(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var19.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d); // L: 414
			if (var9.notedId != -1) { // L: 415
				var20.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 416
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 417
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 418
				var8.shadow(var3);
			}

			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 419
			if (var9.noteTemplate != -1) { // L: 420
				var20.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 421
				ItemComposition.ItemDefinition_fontPlain11.draw(HitSplatDefinition.method3632(var1), 0, 9, 16776960, 1); // L: 422
			}

			if (!var5) { // L: 424
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14); // L: 425
			Rasterizer2D.Rasterizer2D_setClipArray(var15); // L: 426
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 427
			Rasterizer3D.field2340 = true; // L: 428
			return var8; // L: 429
		}
	}
}
