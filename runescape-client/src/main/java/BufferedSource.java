import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("BufferedSource")
public class BufferedSource implements Runnable {
	@ObfuscatedName("f")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("e")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 285742319
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("y")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 931339893
	)
	@Export("position")
	int position;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1604249391
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("m")
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-604765371"
	)
	@Export("isAvailable")
	boolean isAvailable(int var1) throws IOException {
		if (var1 == 0) { // L: 106
			return true;
		} else if (var1 > 0 && var1 < this.capacity) { // L: 107
			synchronized(this) { // L: 108
				int var3;
				if (this.position <= this.limit) { // L: 110
					var3 = this.limit - this.position;
				} else {
					var3 = this.capacity - this.position + this.limit; // L: 111
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "359780647"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-58"
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "315483925"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	@Export("close")
	void close() {
		synchronized(this) { // L: 170
			if (this.exception == null) {
				this.exception = new IOException(""); // L: 171
			}

			this.notifyAll(); // L: 172
		}

		try {
			this.thread.join(); // L: 175
		} catch (InterruptedException var3) { // L: 177
		}

	} // L: 178

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
					} else if (this.position <= this.limit) { // L: 79
						var1 = this.capacity - this.limit;
					} else {
						var1 = this.position - this.limit - 1; // L: 80
					}

					if (var1 > 0) { // L: 81
						break;
					}

					try {
						this.wait(); // L: 83
					} catch (InterruptedException var10) { // L: 85
					}
				}
			}

			int var7;
			try {
				var7 = this.inputStream.read(this.buffer, this.limit, var1); // L: 90
				if (var7 == -1) {
					throw new EOFException(); // L: 91
				}
			} catch (IOException var11) { // L: 93
				IOException var3 = var11;
				synchronized(this) { // L: 94
					this.exception = var3; // L: 95
					return; // L: 96
				}
			}

			synchronized(this) { // L: 99
				this.limit = (var7 + this.limit) % this.capacity; // L: 100
			} // L: 101
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-855272666"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		Client.scrollBarSprites[0].drawAt(var0, var1); // L: 10033
		Client.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 10034
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field685); // L: 10035
		int var5 = var3 * (var3 - 32) / var4; // L: 10036
		if (var5 < 8) { // L: 10037
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 10038
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field686); // L: 10039
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field688); // L: 10040
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field688); // L: 10041
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field688); // L: 10042
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field688); // L: 10043
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field818); // L: 10044
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field818); // L: 10045
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field818); // L: 10046
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field818); // L: 10047
	} // L: 10048
}
