import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("m")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lke;Lke;I)I",
		garbageValue = "1966780392"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		return Client.worldId == var1.world && var2.world == Client.worldId ? (this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername())) : this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(ZB)V",
		garbageValue = "-1"
	)
	public static void method3343(boolean var0) {
		if (NetCache.NetCache_socket != null) {
			try {
				Buffer var1 = new Buffer(4);
				var1.writeByte(var0 ? 2 : 3);
				var1.writeMedium(0);
				NetCache.NetCache_socket.write(var1.array, 0, 4);
			} catch (IOException var4) {
				try {
					NetCache.NetCache_socket.close();
				} catch (Exception var3) {
				}

				++NetCache.NetCache_ioExceptions;
				NetCache.NetCache_socket = null;
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)[Lln;",
		garbageValue = "-1724028611"
	)
	@Export("SpriteBuffer_createSpriteArray")
	public static Sprite[] SpriteBuffer_createSpriteArray() {
		Sprite[] var0 = new Sprite[SpriteBuffer.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < SpriteBuffer.SpriteBuffer_spriteCount; ++var1) {
			Sprite var2 = var0[var1] = new Sprite();
			var2.width = SpriteBuffer.SpriteBuffer_spriteWidth;
			var2.height = SpriteBuffer.SpriteBuffer_spriteHeight;
			var2.yOffset = SpriteBuffer.SpriteBuffer_xOffsets[var1];
			var2.xOffset = SpriteBuffer.SpriteBuffer_yOffsets[var1];
			var2.subWidth = VarbitDefinition.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = SecureRandomCallable.SpriteBuffer_spriteHeights[var1];
			int var3 = var2.subHeight * var2.subWidth;
			byte[] var4 = SpriteBuffer.SpriteBuffer_pixels[var1];
			var2.pixels = new int[var3];

			for (int var5 = 0; var5 < var3; ++var5) {
				var2.pixels[var5] = SpriteBuffer.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		SpriteBuffer.SpriteBuffer_xOffsets = null;
		SpriteBuffer.SpriteBuffer_yOffsets = null;
		VarbitDefinition.SpriteBuffer_spriteWidths = null;
		SecureRandomCallable.SpriteBuffer_spriteHeights = null;
		SpriteBuffer.SpriteBuffer_spritePalette = null;
		SpriteBuffer.SpriteBuffer_pixels = ((byte[][])null);
		return var0;
	}
}
