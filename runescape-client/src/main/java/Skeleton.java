import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1443412059
	)
	@Export("id")
	int id;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 815931901
	)
	@Export("count")
	int count;
	@ObfuscatedName("l")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("m")
	@Export("labels")
	int[][] labels;

	Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 13
		Buffer var3 = new Buffer(var2); // L: 14
		this.count = var3.readUnsignedByte(); // L: 15
		this.transformTypes = new int[this.count]; // L: 16
		this.labels = new int[this.count][]; // L: 17

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) { // L: 18
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 19
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 20
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) { // L: 21
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "-1635350138"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 23
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 24
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 26
					return; // L: 47
				} catch (Exception var4) { // L: 29
				}
			}

			if (class60.field453.startsWith("win")) { // L: 31
				MouseHandler.method1176(var0, 0); // L: 33
			} else if (class60.field453.startsWith("mac")) { // L: 37
				WorldMapManager.method735(var0, 1, "openjs"); // L: 38
			} else {
				MouseHandler.method1176(var0, 2); // L: 41
			}
		} else {
			MouseHandler.method1176(var0, 3); // L: 44
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Liw;IIS)Lle;",
		garbageValue = "8416"
	)
	static IndexedSprite method3215(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 64
		boolean var3;
		if (var4 == null) { // L: 65
			var3 = false; // L: 66
		} else {
			class217.SpriteBuffer_decode(var4); // L: 69
			var3 = true; // L: 70
		}

		if (!var3) { // L: 72
			return null;
		} else {
			IndexedSprite var5 = new IndexedSprite(); // L: 75
			var5.width = class336.SpriteBuffer_spriteWidth; // L: 76
			var5.height = class336.SpriteBuffer_spriteHeight; // L: 77
			var5.xOffset = class336.SpriteBuffer_xOffsets[0]; // L: 78
			var5.yOffset = class225.SpriteBuffer_yOffsets[0]; // L: 79
			var5.subWidth = class336.SpriteBuffer_spriteWidths[0]; // L: 80
			var5.subHeight = class336.SpriteBuffer_spriteHeights[0]; // L: 81
			var5.palette = WorldMapID.SpriteBuffer_spritePalette; // L: 82
			var5.pixels = class13.SpriteBuffer_pixels[0]; // L: 83
			class336.SpriteBuffer_xOffsets = null; // L: 85
			class225.SpriteBuffer_yOffsets = null; // L: 86
			class336.SpriteBuffer_spriteWidths = null; // L: 87
			class336.SpriteBuffer_spriteHeights = null; // L: 88
			WorldMapID.SpriteBuffer_spritePalette = null; // L: 89
			class13.SpriteBuffer_pixels = null; // L: 90
			return var5; // L: 94
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "11601118"
	)
	static boolean method3212(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1; // L: 814
	}
}
