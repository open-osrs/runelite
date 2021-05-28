import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("BufferedSource")
public class BufferedSource implements Runnable {
	@ObfuscatedName("v")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("n")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1742068389
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("y")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -189496199
	)
	@Export("position")
	int position;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1909735131
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("r")
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "6"
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2046252752"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "963599553"
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-989264976"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "715878078"
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

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1648779145"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (ObjectComposition.clientPreferences.soundEffectsVolume != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3376
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3377
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3378
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3379
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3380
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3381
			++Client.soundEffectCount; // L: 3382
		}

	} // L: 3384
}
