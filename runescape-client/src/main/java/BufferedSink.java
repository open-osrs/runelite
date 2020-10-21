import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("BufferedSink")
public class BufferedSink implements Runnable {
	@ObfuscatedName("f")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("b")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -422941959
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("m")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1493204291
	)
	@Export("position")
	int position;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1377573981
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("k")
	@Export("exception")
	IOException exception;
	@ObfuscatedName("c")
	@Export("closed")
	boolean closed;

	BufferedSink(OutputStream var1, int var2) {
		this.position = 0; // L: 186
		this.limit = 0; // L: 187
		this.outputStream = var1; // L: 192
		this.capacity = var2 + 1; // L: 193
		this.buffer = new byte[this.capacity]; // L: 194
		this.thread = new Thread(this); // L: 195
		this.thread.setDaemon(true); // L: 196
		this.thread.start(); // L: 197
	} // L: 198

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	@Export("isClosed")
	boolean isClosed() {
		if (this.closed) { // L: 201
			try {
				this.outputStream.close(); // L: 203
				if (this.exception == null) {
					this.exception = new IOException(""); // L: 204
				}
			} catch (IOException var2) { // L: 206
				if (this.exception == null) {
					this.exception = new IOException(var2); // L: 207
				}
			}

			return true; // L: 209
		} else {
			return false; // L: 211
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-33"
	)
	@Export("write")
	void write(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) { // L: 261
			synchronized(this) { // L: 262
				if (this.exception != null) { // L: 263
					throw new IOException(this.exception.toString());
				} else {
					int var5;
					if (this.position <= this.limit) { // L: 265
						var5 = this.capacity - this.limit + this.position - 1;
					} else {
						var5 = this.position - this.limit - 1; // L: 266
					}

					if (var5 < var3) { // L: 267
						throw new IOException("");
					} else {
						if (var3 + this.limit <= this.capacity) { // L: 268
							System.arraycopy(var1, var2, this.buffer, this.limit, var3); // L: 269
						} else {
							int var6 = this.capacity - this.limit; // L: 272
							System.arraycopy(var1, var2, this.buffer, this.limit, var6); // L: 273
							System.arraycopy(var1, var6 + var2, this.buffer, 0, var3 - var6); // L: 274
						}

						this.limit = (var3 + this.limit) % this.capacity; // L: 276
						this.notifyAll(); // L: 277
					}
				}
			}
		} else {
			throw new IOException();
		}
	} // L: 279

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2058215649"
	)
	@Export("close")
	void close() {
		synchronized(this) { // L: 282
			this.closed = true; // L: 283
			this.notifyAll(); // L: 284
		} // L: 285

		try {
			this.thread.join(); // L: 287
		} catch (InterruptedException var3) { // L: 289
		}

	} // L: 290

	public void run() {
		do {
			int var1;
			synchronized(this) { // L: 217
				while (true) {
					if (this.exception != null) { // L: 219
						return;
					}

					if (this.position <= this.limit) { // L: 220
						var1 = this.limit - this.position;
					} else {
						var1 = this.capacity - this.position + this.limit; // L: 221
					}

					if (var1 > 0) { // L: 222
						break;
					}

					try {
						this.outputStream.flush(); // L: 224
					} catch (IOException var11) { // L: 226
						this.exception = var11; // L: 227
						return; // L: 228
					}

					if (this.isClosed()) { // L: 230
						return;
					}

					try {
						this.wait(); // L: 232
					} catch (InterruptedException var12) { // L: 234
					}
				}
			}

			try {
				if (var1 + this.position <= this.capacity) { // L: 238
					this.outputStream.write(this.buffer, this.position, var1); // L: 239
				} else {
					int var7 = this.capacity - this.position; // L: 242
					this.outputStream.write(this.buffer, this.position, var7); // L: 243
					this.outputStream.write(this.buffer, 0, var1 - var7); // L: 244
				}
			} catch (IOException var10) { // L: 247
				IOException var2 = var10;
				synchronized(this) { // L: 248
					this.exception = var2; // L: 249
					return; // L: 250
				}
			}

			synchronized(this) { // L: 253
				this.position = (var1 + this.position) % this.capacity; // L: 254
			} // L: 255
		} while(!this.isClosed()); // L: 256

	}
}
