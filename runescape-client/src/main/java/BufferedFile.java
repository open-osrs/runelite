import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("BufferedFile")
public class BufferedFile {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Ldk;"
	)
	@Export("accessFile")
	AccessFile accessFile;
	@ObfuscatedName("f")
	@Export("readBuffer")
	byte[] readBuffer;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = -7773729680030815835L
	)
	@Export("readBufferOffset")
	long readBufferOffset;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -846810907
	)
	@Export("readBufferLength")
	int readBufferLength;
	@ObfuscatedName("o")
	@Export("writeBuffer")
	byte[] writeBuffer;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		longValue = 5249231081498323007L
	)
	@Export("writeBufferOffset")
	long writeBufferOffset;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1558233611
	)
	@Export("writeBufferLength")
	int writeBufferLength;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = -6819476051574242871L
	)
	@Export("offset")
	long offset;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = -3728247331531750871L
	)
	@Export("fileLength")
	long fileLength;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = 2663146692618913943L
	)
	@Export("length")
	long length;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		longValue = 5720856138805191881L
	)
	@Export("fileOffset")
	long fileOffset;

	@ObfuscatedSignature(
		signature = "(Ldk;II)V"
	)
	public BufferedFile(AccessFile var1, int var2, int var3) throws IOException {
		this.readBufferOffset = -1L;
		this.writeBufferOffset = -1L;
		this.writeBufferLength = 0;
		this.accessFile = var1;
		this.length = this.fileLength = var1.length();
		this.readBuffer = new byte[var2];
		this.writeBuffer = new byte[var3];
		this.offset = 0L;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1424469113"
	)
	@Export("close")
	public void close() throws IOException {
		this.flush();
		this.accessFile.close();
	}

	@ObfuscatedName("f")
	@Export("seek")
	public void seek(long off) throws IOException {
		if (off < 0L) {
			throw new IOException("");
		}
		this.offset = off;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(B)J",
		garbageValue = "0"
	)
	@Export("length")
	public long length() {
		return this.length;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "([BI)V",
		garbageValue = "617965847"
	)
	@Export("readFully")
	public void readFully(byte[] b) throws IOException {
		this.read(b, 0, b.length);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "([BIIB)V",
		garbageValue = "-35"
	)
	@Export("read")
	public void read(byte[] b, int off, int len) throws IOException {
		try {
			if (len + off > b.length) {
				throw new ArrayIndexOutOfBoundsException(len + off - b.length);
			}

			if (-1L != this.writeBufferOffset && this.offset >= this.writeBufferOffset && this.offset + (long)len <= this.writeBufferOffset + (long)this.writeBufferLength) {
				System.arraycopy(this.writeBuffer, (int)(this.offset - this.writeBufferOffset), b, off, len);
				this.offset += (long)len;
				return;
			}

			long var4 = this.offset;
			int var6 = len;
			int var7;
			if (this.offset >= this.readBufferOffset && this.offset < this.readBufferOffset + (long)this.readBufferLength) {
				var7 = (int)((long)this.readBufferLength - (this.offset - this.readBufferOffset));
				if (var7 > len) {
					var7 = len;
				}

				System.arraycopy(this.readBuffer, (int)(this.offset - this.readBufferOffset), b, off, var7);
				this.offset += (long)var7;
				off += var7;
				len -= var7;
			}

			if (len > this.readBuffer.length) {
				this.accessFile.seek(this.offset);

				for (this.fileOffset = this.offset; len > 0; len -= var7) {
					var7 = this.accessFile.read(b, off, len);
					if (var7 == -1) {
						break;
					}

					this.fileOffset += (long)var7;
					this.offset += (long)var7;
					off += var7;
				}
			} else if (len > 0) {
				this.load();
				var7 = len;
				if (len > this.readBufferLength) {
					var7 = this.readBufferLength;
				}

				System.arraycopy(this.readBuffer, 0, b, off, var7);
				off += var7;
				len -= var7;
				this.offset += (long)var7;
			}

			if (-1L != this.writeBufferOffset) {
				if (this.writeBufferOffset > this.offset && len > 0) {
					var7 = off + (int)(this.writeBufferOffset - this.offset);
					if (var7 > len + off) {
						var7 = len + off;
					}

					while (off < var7) {
						b[off++] = 0;
						--len;
						++this.offset;
					}
				}

				long var8 = -1L;
				long var10 = -1L;
				if (this.writeBufferOffset >= var4 && this.writeBufferOffset < var4 + (long)var6) {
					var8 = this.writeBufferOffset;
				} else if (var4 >= this.writeBufferOffset && var4 < this.writeBufferOffset + (long)this.writeBufferLength) {
					var8 = var4;
				}

				if ((long)this.writeBufferLength + this.writeBufferOffset > var4 && this.writeBufferOffset + (long)this.writeBufferLength <= var4 + (long)var6) {
					var10 = (long)this.writeBufferLength + this.writeBufferOffset;
				} else if ((long)var6 + var4 > this.writeBufferOffset && (long)var6 + var4 <= this.writeBufferOffset + (long)this.writeBufferLength) {
					var10 = (long)var6 + var4;
				}

				if (var8 > -1L && var10 > var8) {
					int var12 = (int)(var10 - var8);
					System.arraycopy(this.writeBuffer, (int)(var8 - this.writeBufferOffset), b, (int)(var8 - var4) + off, var12);
					if (var10 > this.offset) {
						len = (int)((long)len - (var10 - this.offset));
						this.offset = var10;
					}
				}
			}
		} catch (IOException var13) {
			this.fileOffset = -1L;
			throw var13;
		}

		if (len > 0) {
			throw new EOFException();
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2020905321"
	)
	@Export("load")
	void load() throws IOException {
		this.readBufferLength = 0;
		if (this.fileOffset != this.offset) {
			this.accessFile.seek(this.offset);
			this.fileOffset = this.offset;
		}

		int var1;
		for (this.readBufferOffset = this.offset; this.readBufferLength < this.readBuffer.length; this.readBufferLength += var1) {
			var1 = this.accessFile.read(this.readBuffer, this.readBufferLength, this.readBuffer.length - this.readBufferLength);
			if (var1 == -1) {
				break;
			}

			this.fileOffset += (long)var1;
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "([BIII)V",
		garbageValue = "-601174169"
	)
	@Export("write")
	public void write(byte[] src, int srcIndex, int length) throws IOException {
		try {
			if (this.offset + (long)length > this.length) {
				this.length = this.offset + (long)length;
			}

			if (-1L != this.writeBufferOffset && (this.offset < this.writeBufferOffset || this.offset > this.writeBufferOffset + (long)this.writeBufferLength)) {
				this.flush();
			}

			if (this.writeBufferOffset != -1L && (long)length + this.offset > this.writeBufferOffset + (long)this.writeBuffer.length) {
				int var4 = (int)((long)this.writeBuffer.length - (this.offset - this.writeBufferOffset));
				System.arraycopy(src, srcIndex, this.writeBuffer, (int)(this.offset - this.writeBufferOffset), var4);
				this.offset += (long)var4;
				srcIndex += var4;
				length -= var4;
				this.writeBufferLength = this.writeBuffer.length;
				this.flush();
			}

			if (length <= this.writeBuffer.length) {
				if (length > 0) {
					if (this.writeBufferOffset == -1L) {
						this.writeBufferOffset = this.offset;
					}

					System.arraycopy(src, srcIndex, this.writeBuffer, (int)(this.offset - this.writeBufferOffset), length);
					this.offset += (long)length;
					if (this.offset - this.writeBufferOffset > (long)this.writeBufferLength) {
						this.writeBufferLength = (int)(this.offset - this.writeBufferOffset);
					}
				}
			} else {
				if (this.fileOffset != this.offset) {
					this.accessFile.seek(this.offset);
					this.fileOffset = this.offset;
				}

				this.accessFile.write(src, srcIndex, length);
				this.fileOffset += (long)length;
				if (this.fileOffset > this.fileLength) {
					this.fileLength = this.fileOffset;
				}

				long var10 = -1L;
				long var6 = -1L;
				if (this.offset >= this.readBufferOffset && this.offset < (long)this.readBufferLength + this.readBufferOffset) {
					var10 = this.offset;
				} else if (this.readBufferOffset >= this.offset && this.readBufferOffset < (long)length + this.offset) {
					var10 = this.readBufferOffset;
				}

				if (this.offset + (long)length > this.readBufferOffset && (long)length + this.offset <= (long)this.readBufferLength + this.readBufferOffset) {
					var6 = this.offset + (long)length;
				} else if ((long)this.readBufferLength + this.readBufferOffset > this.offset && this.readBufferOffset + (long)this.readBufferLength <= (long)length + this.offset) {
					var6 = (long)this.readBufferLength + this.readBufferOffset;
				}

				if (var10 > -1L && var6 > var10) {
					int var8 = (int)(var6 - var10);
					System.arraycopy(src, (int)(var10 + (long)srcIndex - this.offset), this.readBuffer, (int)(var10 - this.readBufferOffset), var8);
				}

				this.offset += (long)length;
			}

		} catch (IOException var9) {
			this.fileOffset = -1L;
			throw var9;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-931421226"
	)
	@Export("flush")
	void flush() throws IOException {
		if (this.writeBufferOffset == -1L) {
			return;
		}
		if (this.writeBufferOffset != this.fileOffset) {
			this.accessFile.seek(this.writeBufferOffset);
			this.fileOffset = this.writeBufferOffset;
		}

		this.accessFile.write(this.writeBuffer, 0, this.writeBufferLength);
		this.fileOffset += (long)(this.writeBufferLength * 1290782301) * -1558233611L;
		if (this.fileOffset > this.fileLength) {
			this.fileLength = this.fileOffset;
		}

		long var1 = -1L;
		long var3 = -1L;
		if (this.writeBufferOffset >= this.readBufferOffset && this.writeBufferOffset < (long)this.readBufferLength + this.readBufferOffset) {
			var1 = this.writeBufferOffset;
		} else if (this.readBufferOffset >= this.writeBufferOffset && this.readBufferOffset < this.writeBufferOffset + (long)this.writeBufferLength) {
			var1 = this.readBufferOffset;
		}

		if (this.writeBufferOffset + (long)this.writeBufferLength > this.readBufferOffset && this.writeBufferOffset + (long)this.writeBufferLength <= this.readBufferOffset + (long)this.readBufferLength) {
			var3 = this.writeBufferOffset + (long)this.writeBufferLength;
		} else if ((long)this.readBufferLength + this.readBufferOffset > this.writeBufferOffset && (long)this.readBufferLength + this.readBufferOffset <= (long)this.writeBufferLength + this.writeBufferOffset) {
			var3 = this.readBufferOffset + (long)this.readBufferLength;
		}

		if (var1 > -1L && var3 > var1) {
			int var5 = (int)(var3 - var1);
			System.arraycopy(this.writeBuffer, (int)(var1 - this.writeBufferOffset), this.readBuffer, (int)(var1 - this.readBufferOffset), var5);
		}

		this.writeBufferOffset = -1L;
		this.writeBufferLength = 0;

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Ljava/net/Socket;IIB)Lfu;",
		garbageValue = "110"
	)
	@Export("newBufferedNetSocket")
	public static AbstractSocket newBufferedNetSocket(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)Ljava/lang/String;",
		garbageValue = "-792629541"
	)
	@Export("colorStartTag")
	static String colorStartTag(int color) {
		return "<col=" + Integer.toHexString(color) + ">";
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		signature = "(I)Llz;",
		garbageValue = "-1653835085"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return class60.worldMap;
	}
}
