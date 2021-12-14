import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("EnumDefinition_archive")
	public static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("p")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("m")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("t")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -129402643
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -988434495
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("w")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("n")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("r")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	EnumComposition() {
		this.defaultStr = "null";
		this.outputCount = 0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1550875336"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)V",
		garbageValue = "-68"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) {
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.strVals = new String[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.strVals[var3] = var1.readStringCp1252NullTerminated();
				}
			} else if (var2 == 6) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.intVals = new int[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.intVals[var3] = var1.readInt();
				}
			}
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2125042449"
	)
	@Export("size")
	public int size() {
		return this.outputCount;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Lpl;",
		garbageValue = "1794851975"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var6 = ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0 + ((long)var3 << 42);
		SpritePixels var8;
		if (!var5) {
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6);
			if (var8 != null) {
				return var8;
			}
		}

		ItemComposition var9 = UserComparator6.ItemDefinition_get(var0);
		if (var1 > 1 && var9.countobj != null) {
			int var10 = -1;

			for (int var11 = 0; var11 < 10; ++var11) {
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) {
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) {
				var9 = UserComparator6.ItemDefinition_get(var10);
			}
		}

		Model var21 = var9.getModel(1);
		if (var21 == null) {
			return null;
		} else {
			SpritePixels var22 = null;
			if (var9.noteTemplate != -1) {
				var22 = getItemSprite(var9.note, 10, 1, 0, 0, true);
				if (var22 == null) {
					return null;
				}
			} else if (var9.notedId != -1) {
				var22 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false);
				if (var22 == null) {
					return null;
				}
			} else if (var9.placeholderTemplate != -1) {
				var22 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false);
				if (var22 == null) {
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels;
			int var13 = Rasterizer2D.Rasterizer2D_width;
			int var14 = Rasterizer2D.Rasterizer2D_height;
			int[] var15 = new int[4];
			Rasterizer2D.Rasterizer2D_getClipArray(var15);
			var8 = new SpritePixels(36, 32);
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32);
			Rasterizer2D.Rasterizer2D_clear();
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
			Rasterizer3D.method3913(16, 16);
			Rasterizer3D.field2276 = false;
			if (var9.placeholderTemplate != -1) {
				var22.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d;
			if (var5) {
				var16 = (int)(1.5D * (double)var16);
			} else if (var2 == 2) {
				var16 = (int)((double)var16 * 1.04D);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16;
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16;
			var21.calculateBoundsCylinder();
			var21.method4241(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var21.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d);
			if (var9.notedId != -1) {
				var22.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) {
				var8.outline(1);
			}

			if (var2 >= 2) {
				var8.outline(16777215);
			}

			if (var3 != 0) {
				var8.shadow(var3);
			}

			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32);
			if (var9.noteTemplate != -1) {
				var22.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) {
				Font var19 = ItemComposition.ItemDefinition_fontPlain11;
				String var20;
				if (var1 < 100000) {
					var20 = "<col=ffff00>" + var1 + "</col>";
				} else if (var1 < 10000000) {
					var20 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>";
				} else {
					var20 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>";
				}

				var19.draw(var20, 0, 9, 16776960, 1);
			}

			if (!var5) {
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14);
			Rasterizer2D.Rasterizer2D_setClipArray(var15);
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
			Rasterizer3D.field2276 = true;
			return var8;
		}
	}
}
