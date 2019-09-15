import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("BufferedSource")
public class BufferedSource implements Runnable {
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		signature = "Lio;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("c")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("x")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -957972311
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("g")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -499111829
	)
	@Export("position")
	int position;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1421427639
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("j")
	@Export("exception")
	IOException exception;

	BufferedSource(InputStream var1, int var2) {
		this.position = 0;
		this.limit = 0;
		this.inputStream = var1;
		this.capacity = var2 + 1;
		this.buffer = new byte[this.capacity];
		this.thread = new Thread(this);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(IB)Z",
		garbageValue = "-46"
	)
	@Export("isAvailable")
	boolean isAvailable(int var1) throws IOException {
		if (var1 == 0) {
			return true;
		} else if (var1 > 0 && var1 < this.capacity) {
			synchronized(this) {
				int var3;
				if (this.position <= this.limit) {
					var3 = this.limit - this.position;
				} else {
					var3 = this.capacity - this.position + this.limit;
				}

				if (var3 < var1) {
					if (this.exception != null) {
						throw new IOException(this.exception.toString());
					} else {
						this.notifyAll();
						return false;
					}
				} else {
					return true;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-266051829"
	)
	@Export("available")
	int available() throws IOException {
		synchronized(this) {
			int var2;
			if (this.position <= this.limit) {
				var2 = this.limit - this.position;
			} else {
				var2 = this.capacity - this.position + this.limit;
			}

			if (var2 <= 0 && this.exception != null) {
				throw new IOException(this.exception.toString());
			} else {
				this.notifyAll();
				return var2;
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "842069737"
	)
	@Export("readUnsignedByte")
	int readUnsignedByte() throws IOException {
		synchronized(this) {
			if (this.position == this.limit) {
				if (this.exception != null) {
					throw new IOException(this.exception.toString());
				} else {
					return -1;
				}
			} else {
				int var2 = this.buffer[this.position] & 255;
				this.position = (this.position + 1) % this.capacity;
				this.notifyAll();
				return var2;
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "([BIII)I",
		garbageValue = "372085290"
	)
	@Export("read")
	int read(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
			synchronized(this) {
				int var5;
				if (this.position <= this.limit) {
					var5 = this.limit - this.position;
				} else {
					var5 = this.capacity - this.position + this.limit;
				}

				if (var3 > var5) {
					var3 = var5;
				}

				if (var3 == 0 && this.exception != null) {
					throw new IOException(this.exception.toString());
				} else {
					if (var3 + this.position <= this.capacity) {
						System.arraycopy(this.buffer, this.position, var1, var2, var3);
					} else {
						int var6 = this.capacity - this.position;
						System.arraycopy(this.buffer, this.position, var1, var2, var6);
						System.arraycopy(this.buffer, 0, var1, var6 + var2, var3 - var6);
					}

					this.position = (var3 + this.position) % this.capacity;
					this.notifyAll();
					return var3;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-122132580"
	)
	@Export("close")
	void close() {
		synchronized(this) {
			if (this.exception == null) {
				this.exception = new IOException("");
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
			synchronized(this) {
				while (true) {
					if (this.exception != null) {
						return;
					}

					if (this.position == 0) {
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
						this.wait();
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
			}
		}
	}
}
