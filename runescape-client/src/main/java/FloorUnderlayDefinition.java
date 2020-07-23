import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("sh")
	@ObfuscatedSignature(
		signature = "Llp;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lec;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 582353211
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -50831355
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 88823617
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1334094789
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1647084533
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	public FloorUnderlayDefinition() {
		this.rgb = 0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-33176492"
	)
	@Export("postDecode")
	public void postDecode() {
		this.setHsl(this.rgb);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lkn;IB)V",
		garbageValue = "17"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(Lkn;IIB)V",
		garbageValue = "-93"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.rgb = var1.readMedium();
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "-14"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D;
		double var4 = (double)(var1 >> 8 & 255) / 256.0D;
		double var6 = (double)(var1 & 255) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var10 + var8) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.saturation = (int)(256.0D * var14);
		this.lightness = (int)(256.0D * var16);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

		if (var16 > 0.5D) {
			this.hueMultiplier = (int)(512.0D * var14 * (1.0D - var16));
		} else {
			this.hueMultiplier = (int)(512.0D * var16 * var14);
		}

		if (this.hueMultiplier < 1) {
			this.hueMultiplier = 1;
		}

		this.hue = (int)((double)this.hueMultiplier * var12);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "([BI)Llz;",
		garbageValue = "619951505"
	)
	@Export("convertJpgToSprite")
	public static final Sprite convertJpgToSprite(byte[] var0) {
		BufferedImage var1 = null;

		try {
			var1 = ImageIO.read(new ByteArrayInputStream(var0));
			int var2 = var1.getWidth();
			int var3 = var1.getHeight();
			int[] var4 = new int[var3 * var2];
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2);
			var5.grabPixels();
			return new Sprite(var4, var2, var3);
		} catch (IOException var7) {
		} catch (InterruptedException var8) {
		}

		return new Sprite(0, 0);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Object;ZB)[B",
		garbageValue = "101"
	)
	public static byte[] method4613(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var3 = (byte[])((byte[])var0);
			return var1 ? class195.method3748(var3) : var3;
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Llf;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1916318659"
	)
	static String method4612(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;IB)Z",
		garbageValue = "3"
	)
	static boolean method4608(String var0, int var1) {
		return GrandExchangeOfferTotalQuantityComparator.method165(var0, var1, "openjs");
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(IB)Z",
		garbageValue = "7"
	)
	@Export("Widget_isItemContainer")
	public static boolean Widget_isItemContainer(int var0) {
		return (var0 >> 30 & 1) != 0;
	}
}
