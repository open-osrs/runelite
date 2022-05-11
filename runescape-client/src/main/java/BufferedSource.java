import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("BufferedSource")
public class BufferedSource implements Runnable {
	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("j")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("o")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("q")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1611590211
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("k")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1886855287
	)
	@Export("position")
	int position;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 360959185
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("p")
	@Export("exception")
	IOException exception;

	BufferedSource(InputStream var1, int var2) {
		this.position = 0; // L: 66
		this.limit = 0; // L: 67
		this.inputStream = var1; // L: 71
		this.capacity = var2 + 1; // L: 72
		this.buffer = new byte[this.capacity]; // L: 73
		this.thread = new Thread(this); // L: 74
		this.thread.setDaemon(true); // L: 75
		this.thread.start(); // L: 76
	} // L: 77

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-916314557"
	)
	@Export("isAvailable")
	boolean isAvailable(int var1) throws IOException {
		if (var1 == 0) { // L: 113
			return true;
		} else if (var1 > 0 && var1 < this.capacity) { // L: 114
			synchronized(this) { // L: 115
				int var3;
				if (this.position <= this.limit) { // L: 117
					var3 = this.limit - this.position;
				} else {
					var3 = this.capacity - this.position + this.limit; // L: 118
				}

				if (var3 < var1) { // L: 119
					if (this.exception != null) { // L: 120
						throw new IOException(this.exception.toString());
					} else {
						this.notifyAll(); // L: 121
						return false; // L: 122
					}
				} else {
					return true; // L: 124
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "377483853"
	)
	@Export("available")
	int available() throws IOException {
		synchronized(this) { // L: 129
			int var2;
			if (this.position <= this.limit) { // L: 131
				var2 = this.limit - this.position;
			} else {
				var2 = this.capacity - this.position + this.limit; // L: 132
			}

			if (var2 <= 0 && this.exception != null) { // L: 133
				throw new IOException(this.exception.toString()); // L: 134
			} else {
				this.notifyAll(); // L: 136
				return var2; // L: 137
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-18"
	)
	@Export("readUnsignedByte")
	int readUnsignedByte() throws IOException {
		synchronized(this) { // L: 142
			if (this.limit == this.position) { // L: 143
				if (this.exception != null) { // L: 144
					throw new IOException(this.exception.toString());
				} else {
					return -1; // L: 145
				}
			} else {
				int var2 = this.buffer[this.position] & 255; // L: 147
				this.position = (this.position + 1) % this.capacity; // L: 148
				this.notifyAll(); // L: 149
				return var2; // L: 150
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-720858367"
	)
	@Export("read")
	int read(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) { // L: 155
			synchronized(this) { // L: 156
				int var5;
				if (this.position <= this.limit) { // L: 158
					var5 = this.limit - this.position;
				} else {
					var5 = this.capacity - this.position + this.limit; // L: 159
				}

				if (var3 > var5) { // L: 160
					var3 = var5;
				}

				if (var3 == 0 && this.exception != null) { // L: 161
					throw new IOException(this.exception.toString());
				} else {
					if (var3 + this.position <= this.capacity) { // L: 162
						System.arraycopy(this.buffer, this.position, var1, var2, var3); // L: 163
					} else {
						int var6 = this.capacity - this.position; // L: 166
						System.arraycopy(this.buffer, this.position, var1, var2, var6); // L: 167
						System.arraycopy(this.buffer, 0, var1, var6 + var2, var3 - var6); // L: 168
					}

					this.position = (var3 + this.position) % this.capacity; // L: 170
					this.notifyAll(); // L: 171
					return var3; // L: 172
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1309478376"
	)
	@Export("close")
	void close() {
		synchronized(this) { // L: 177
			if (this.exception == null) {
				this.exception = new IOException(""); // L: 178
			}

			this.notifyAll(); // L: 179
		}

		try {
			this.thread.join(); // L: 182
		} catch (InterruptedException var3) { // L: 184
		}

	} // L: 185

	public void run() {
		while (true) {
			int var1;
			synchronized(this) { // L: 82
				while (true) {
					if (this.exception != null) { // L: 84
						return;
					}

					if (this.position == 0) { // L: 85
						var1 = this.capacity - this.limit - 1;
					} else if (this.position <= this.limit) { // L: 86
						var1 = this.capacity - this.limit;
					} else {
						var1 = this.position - this.limit - 1; // L: 87
					}

					if (var1 > 0) { // L: 88
						break;
					}

					try {
						this.wait(); // L: 90
					} catch (InterruptedException var10) { // L: 92
					}
				}
			}

			int var7;
			try {
				var7 = this.inputStream.read(this.buffer, this.limit, var1); // L: 97
				if (var7 == -1) {
					throw new EOFException(); // L: 98
				}
			} catch (IOException var11) { // L: 100
				IOException var3 = var11;
				synchronized(this) { // L: 101
					this.exception = var3; // L: 102
					return; // L: 103
				}
			}

			synchronized(this) { // L: 106
				this.limit = (var7 + this.limit) % this.capacity; // L: 107
			} // L: 108
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1918735565"
	)
	static final boolean method6702(char var0) {
		if (Character.isISOControl(var0)) { // L: 16
			return false;
		} else if (class78.isAlphaNumeric(var0)) { // L: 17
			return true;
		} else {
			char[] var1 = class424.field4621; // L: 19

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) { // L: 20
				var3 = var1[var2]; // L: 21
				if (var0 == var3) { // L: 22
					return true;
				}
			}

			var1 = class424.field4623; // L: 26

			for (var2 = 0; var2 < var1.length; ++var2) { // L: 27
				var3 = var1[var2]; // L: 28
				if (var0 == var3) { // L: 29
					return true;
				}
			}

			return false; // L: 32
		}
	}
}
