import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("BufferedSource")
public class BufferedSource implements Runnable {
	@ObfuscatedName("f")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("o")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1895389513
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("p")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 552004767
	)
	@Export("position")
	int position;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1147375927
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("k")
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
		descriptor = "(IB)Z",
		garbageValue = "-36"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-28"
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1857294674"
	)
	@Export("readUnsignedByte")
	int readUnsignedByte() throws IOException {
		synchronized(this) { // L: 135
			if (this.position == this.limit) { // L: 136
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "123"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-28"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;I)I",
		garbageValue = "689227004"
	)
	public static int method5917(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length(); // L: 21
		int var4 = var1; // L: 22

		for (int var5 = 0; var5 < var3; ++var5) { // L: 23
			char var6 = var2.charAt(var5); // L: 24
			if (var6 <= 127) { // L: 25
				var0[var4++] = (byte)var6; // L: 26
			} else if (var6 <= 2047) { // L: 28
				var0[var4++] = (byte)(192 | var6 >> 6); // L: 29
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 30
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f'); // L: 33
				var0[var4++] = (byte)(128 | var6 >> 6 & 63); // L: 34
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 35
			}
		}

		return var4 - var1; // L: 38
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "519434496"
	)
	static final void method5918() {
		int var0 = class16.menuX; // L: 7792
		int var1 = FontName.menuY; // L: 7793
		int var2 = Player.menuWidth; // L: 7794
		int var3 = class11.menuHeight; // L: 7795
		int var4 = 6116423; // L: 7796
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4); // L: 7797
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0); // L: 7798
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0); // L: 7799
		class368.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1); // L: 7800
		int var5 = MouseHandler.MouseHandler_x; // L: 7801
		int var6 = MouseHandler.MouseHandler_y; // L: 7802

		for (int var7 = 0; var7 < Client.menuOptionsCount; ++var7) { // L: 7803
			int var8 = var1 + (Client.menuOptionsCount - 1 - var7) * 15 + 31; // L: 7804
			int var9 = 16777215; // L: 7805
			if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) { // L: 7806
				var9 = 16776960;
			}

			class368.fontBold12.draw(class69.method1164(var7), var0 + 3, var8, var9, 0); // L: 7807
		}

		LoginScreenAnimation.method2198(class16.menuX, FontName.menuY, Player.menuWidth, class11.menuHeight); // L: 7809
	} // L: 7810
}
