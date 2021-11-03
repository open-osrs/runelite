import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public class class115 extends class116 {
	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("al")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1098796111
	)
	int field1368;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class115(class119 var1) {
		this.this$0 = var1;
		this.field1368 = -1; // L: 114
	} // L: 116

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		this.field1368 = var1.readUnsignedShort(); // L: 119
	} // L: 120

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.method2656(this.field1368); // L: 123
	} // L: 124

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([BB)Lgg;",
		garbageValue = "122"
	)
	static WorldMapSprite method2554(byte[] var0) {
		if (var0 == null) { // L: 19
			return new WorldMapSprite();
		} else {
			BufferedImage var2 = null; // L: 22

			SpritePixels var1;
			try {
				var2 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 24
				int var3 = var2.getWidth(); // L: 25
				int var4 = var2.getHeight(); // L: 26
				int[] var5 = new int[var4 * var3]; // L: 27
				PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var3, var4, var5, 0, var3); // L: 28
				var6.grabPixels(); // L: 29
				var1 = new SpritePixels(var5, var3, var4); // L: 30
				return new WorldMapSprite(var1.pixels); // L: 37
			} catch (IOException var8) { // L: 33
			} catch (InterruptedException var9) { // L: 34
			}

			var1 = new SpritePixels(0, 0); // L: 35
			return new WorldMapSprite(var1.pixels);
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-473426033"
	)
	public static String method2555(CharSequence var0) {
		return Message.method1149('*', var0.length()); // L: 201
	}
}
