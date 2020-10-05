import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
public class BufferedSink implements Runnable {
	@ObfuscatedName("z")
	Thread thread;
	@ObfuscatedName("k")
	OutputStream outputStream;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 744968193
	)
	int capacity;
	@ObfuscatedName("t")
	byte[] buffer;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -683527295
	)
	int position;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 870280175
	)
	int limit;
	@ObfuscatedName("x")
	IOException exception;
	@ObfuscatedName("w")
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "803679823"
	)
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "256"
	)
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lic;Lic;Ljava/lang/String;Ljava/lang/String;I)Lkr;",
		garbageValue = "326512340"
	)
	public static Font method5983(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		int var4 = var0.getGroupId(var2); // L: 148
		int var5 = var0.getFileId(var4, var3); // L: 149
		return RouteStrategy.method3688(var0, var1, var4, var5); // L: 150
	}
}
