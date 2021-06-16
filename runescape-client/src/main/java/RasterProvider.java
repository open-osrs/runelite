import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
@Implements("RasterProvider")
public final class RasterProvider extends AbstractRasterProvider {
	@ObfuscatedName("f")
	@Export("component")
	Component component;
	@ObfuscatedName("e")
	@Export("image")
	Image image;

	RasterProvider(int var1, int var2, Component var3) {
		super.width = var1; // L: 23
		super.height = var2; // L: 24
		super.pixels = new int[var2 * var1 + 1]; // L: 25
		DataBufferInt var4 = new DataBufferInt(super.pixels, super.pixels.length); // L: 26
		DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255); // L: 27
		WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(super.width, super.height), var4, (Point)null); // L: 28
		this.image = new BufferedImage(var5, var6, false, new Hashtable()); // L: 29
		this.setComponent(var3); // L: 30
		this.apply(); // L: 31
	} // L: 32

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "1"
	)
	@Export("setComponent")
	final void setComponent(Component var1) {
		this.component = var1; // L: 35
	} // L: 36

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-474214385"
	)
	@Export("drawFull")
	public final void drawFull(int var1, int var2) {
		this.drawFull0(this.component.getGraphics(), var1, var2); // L: 39
	} // L: 40

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "640"
	)
	@Export("draw")
	public final void draw(int var1, int var2, int var3, int var4) {
		this.draw0(this.component.getGraphics(), var1, var2, var3, var4); // L: 43
	} // L: 44

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;III)V",
		garbageValue = "-941399356"
	)
	@Export("drawFull0")
	final void drawFull0(Graphics var1, int var2, int var3) {
		try {
			var1.drawImage(this.image, var2, var3, this.component); // L: 48
		} catch (Exception var5) { // L: 50
			this.component.repaint(); // L: 51
		}

	} // L: 53

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;IIIII)V",
		garbageValue = "-1413696470"
	)
	@Export("draw0")
	final void draw0(Graphics var1, int var2, int var3, int var4, int var5) {
		try {
			Shape var6 = var1.getClip(); // L: 57
			var1.clipRect(var2, var3, var4, var5); // L: 58
			var1.drawImage(this.image, 0, 0, this.component); // L: 59
			var1.setClip(var6); // L: 60
		} catch (Exception var7) { // L: 62
			this.component.repaint(); // L: 63
		}

	} // L: 65
}
