import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("BufferedSource")
public class BufferedSource implements Runnable {
	@ObfuscatedName("n")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("v")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1953404091
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("c")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -2146586711
	)
	@Export("position")
	int position;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2116402287
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("z")
	@Export("exception")
	IOException exception;

	BufferedSource(InputStream var1, int var2) {
		this.position = 0; // L: 59
		this.limit = 0; // L: 60
		this.inputStream = var1; // L: 64
		this.capacity = var2 + 1; // L: 65
		this.buffer = new byte[this.capacity]; // L: 66
		this.thread = new Thread(this); // L: 67
		this.thread.setDaemon(true); // L: 68
		this.thread.start(); // L: 69
	} // L: 70

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1444651631"
	)
	@Export("isAvailable")
	boolean isAvailable(int var1) throws IOException {
		if (var1 == 0) {
			return true;
		} else if (var1 > 0 && var1 < this.capacity) {
			synchronized(this) { // L: 108
				int var3;
				if (this.position <= this.limit) { // L: 110
					var3 = this.limit - this.position;
				} else {
					var3 = this.capacity - this.position + this.limit;
				}

				if (var3 < var1) { // L: 112
					if (this.exception != null) { // L: 113
						throw new IOException(this.exception.toString());
					} else {
						this.notifyAll(); // L: 114
						return false; // L: 115
					}
				} else {
					return true; // L: 117
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "5789"
	)
	@Export("available")
	int available() throws IOException {
		synchronized(this) { // L: 122
			int var2;
			if (this.position <= this.limit) { // L: 124
				var2 = this.limit - this.position;
			} else {
				var2 = this.capacity - this.position + this.limit; // L: 125
			}

			if (var2 <= 0 && this.exception != null) { // L: 126
				throw new IOException(this.exception.toString()); // L: 127
			} else {
				this.notifyAll(); // L: 129
				return var2; // L: 130
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1306188380"
	)
	@Export("readUnsignedByte")
	int readUnsignedByte() throws IOException {
		synchronized(this) { // L: 135
			if (this.limit == this.position) { // L: 136
				if (this.exception != null) { // L: 137
					throw new IOException(this.exception.toString());
				} else {
					return -1; // L: 138
				}
			} else {
				int var2 = this.buffer[this.position] & 255; // L: 140
				this.position = (this.position + 1) % this.capacity; // L: 141
				this.notifyAll(); // L: 142
				return var2; // L: 143
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "255172200"
	)
	@Export("read")
	int read(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) { // L: 148
			synchronized(this) { // L: 149
				int var5;
				if (this.position <= this.limit) { // L: 151
					var5 = this.limit - this.position;
				} else {
					var5 = this.capacity - this.position + this.limit; // L: 152
				}

				if (var3 > var5) { // L: 153
					var3 = var5;
				}

				if (var3 == 0 && this.exception != null) { // L: 154
					throw new IOException(this.exception.toString());
				} else {
					if (var3 + this.position <= this.capacity) { // L: 155
						System.arraycopy(this.buffer, this.position, var1, var2, var3); // L: 156
					} else {
						int var6 = this.capacity - this.position; // L: 159
						System.arraycopy(this.buffer, this.position, var1, var2, var6); // L: 160
						System.arraycopy(this.buffer, 0, var1, var6 + var2, var3 - var6); // L: 161
					}

					this.position = (var3 + this.position) % this.capacity; // L: 163
					this.notifyAll(); // L: 164
					return var3; // L: 165
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-489650908"
	)
	@Export("close")
	void close() {
		synchronized(this) { // L: 170
			if (this.exception == null) {
				this.exception = new IOException(""); // L: 171
			}

			this.notifyAll();
		}

		try {
			this.thread.join();
		} catch (InterruptedException var3) {
		}

	}

	public void run() {
		while (true) {
			int var1;
			synchronized(this) { // L: 75
				while (true) {
					if (this.exception != null) { // L: 77
						return;
					}

					if (this.position == 0) { // L: 78
						var1 = this.capacity - this.limit - 1;
					} else if (this.position <= this.limit) {
						var1 = this.capacity - this.limit;
					} else {
						var1 = this.position - this.limit - 1;
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.wait(); // L: 83
					} catch (InterruptedException var10) {
					}
				}
			}

			int var7;
			try {
				var7 = this.inputStream.read(this.buffer, this.limit, var1);
				if (var7 == -1) {
					throw new EOFException();
				}
			} catch (IOException var11) {
				IOException var3 = var11;
				synchronized(this) {
					this.exception = var3;
					return;
				}
			}

			synchronized(this) {
				this.limit = (var7 + this.limit) % this.capacity;
			} // L: 101
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lig;III)Llm;",
		garbageValue = "34379622"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 79
		boolean var3;
		if (var4 == null) { // L: 80
			var3 = false; // L: 81
		} else {
			GrandExchangeOfferNameComparator.SpriteBuffer_decode(var4); // L: 84
			var3 = true; // L: 85
		}

		if (!var3) { // L: 87
			return null;
		} else {
			SpritePixels var5 = new SpritePixels(); // L: 90
			var5.width = class336.SpriteBuffer_spriteWidth; // L: 91
			var5.height = class336.SpriteBuffer_spriteHeight; // L: 92
			var5.xOffset = class105.SpriteBuffer_xOffsets[0]; // L: 93
			var5.yOffset = class336.SpriteBuffer_yOffsets[0]; // L: 94
			var5.subWidth = class336.SpriteBuffer_spriteWidths[0]; // L: 95
			var5.subHeight = class225.SpriteBuffer_spriteHeights[0]; // L: 96
			int var6 = var5.subHeight * var5.subWidth; // L: 97
			byte[] var7 = class2.SpriteBuffer_pixels[0]; // L: 98
			var5.pixels = new int[var6]; // L: 99

			for (int var8 = 0; var8 < var6; ++var8) { // L: 100
				var5.pixels[var8] = HorizontalAlignment.SpriteBuffer_spritePalette[var7[var8] & 255];
			}

			class105.SpriteBuffer_xOffsets = null; // L: 102
			class336.SpriteBuffer_yOffsets = null; // L: 103
			class336.SpriteBuffer_spriteWidths = null; // L: 104
			class225.SpriteBuffer_spriteHeights = null; // L: 105
			HorizontalAlignment.SpriteBuffer_spritePalette = null; // L: 106
			class2.SpriteBuffer_pixels = null; // L: 107
			return var5; // L: 111
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)[Llm;",
		garbageValue = "49"
	)
	static SpritePixels[] method6103() {
		SpritePixels[] var0 = new SpritePixels[class336.SpriteBuffer_spriteCount]; // L: 172

		for (int var1 = 0; var1 < class336.SpriteBuffer_spriteCount; ++var1) { // L: 173
			SpritePixels var2 = var0[var1] = new SpritePixels(); // L: 174
			var2.width = class336.SpriteBuffer_spriteWidth; // L: 175
			var2.height = class336.SpriteBuffer_spriteHeight; // L: 176
			var2.xOffset = class105.SpriteBuffer_xOffsets[var1]; // L: 177
			var2.yOffset = class336.SpriteBuffer_yOffsets[var1]; // L: 178
			var2.subWidth = class336.SpriteBuffer_spriteWidths[var1]; // L: 179
			var2.subHeight = class225.SpriteBuffer_spriteHeights[var1]; // L: 180
			int var3 = var2.subHeight * var2.subWidth; // L: 181
			byte[] var4 = class2.SpriteBuffer_pixels[var1]; // L: 182
			var2.pixels = new int[var3]; // L: 183

			for (int var5 = 0; var5 < var3; ++var5) { // L: 184
				var2.pixels[var5] = HorizontalAlignment.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		class105.SpriteBuffer_xOffsets = null; // L: 187
		class336.SpriteBuffer_yOffsets = null; // L: 188
		class336.SpriteBuffer_spriteWidths = null; // L: 189
		class225.SpriteBuffer_spriteHeights = null; // L: 190
		HorizontalAlignment.SpriteBuffer_spritePalette = null; // L: 191
		class2.SpriteBuffer_pixels = null; // L: 192
		return var0; // L: 194
	}
}
