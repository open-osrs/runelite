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

@ObfuscatedName("ar")
@Implements("RasterProvider")
public final class RasterProvider extends AbstractRasterProvider {
	@ObfuscatedName("c")
	@Export("component")
	Component component;
	@ObfuscatedName("l")
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "980097232"
	)
	@Export("setComponent")
	final void setComponent(Component var1) {
		this.component = var1; // L: 35
	} // L: 36

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-78"
	)
	@Export("drawFull")
	public final void drawFull(int var1, int var2) {
		this.drawFull0(this.component.getGraphics(), var1, var2); // L: 40
	} // L: 41

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "805431680"
	)
	@Export("draw")
	public final void draw(int var1, int var2, int var3, int var4) {
		this.draw0(this.component.getGraphics(), var1, var2, var3, var4); // L: 45
	} // L: 46

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;IIB)V",
		garbageValue = "0"
	)
	@Export("drawFull0")
	final void drawFull0(Graphics var1, int var2, int var3) {
		try {
			var1.drawImage(this.image, var2, var3, this.component); // L: 50
		} catch (Exception var5) { // L: 52
			this.component.repaint(); // L: 53
		}

	} // L: 55

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;IIIIB)V",
		garbageValue = "32"
	)
	@Export("draw0")
	final void draw0(Graphics var1, int var2, int var3, int var4, int var5) {
		try {
			Shape var6 = var1.getClip(); // L: 59
			var1.clipRect(var2, var3, var4, var5); // L: 60
			var1.drawImage(this.image, 0, 0, this.component); // L: 61
			var1.setClip(var6); // L: 62
		} catch (Exception var7) { // L: 64
			this.component.repaint(); // L: 65
		}

	} // L: 67
}
