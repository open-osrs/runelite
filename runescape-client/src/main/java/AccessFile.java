import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
@Implements("AccessFile")
public final class AccessFile {
	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	@Export("mouseWheel")
	static class144 mouseWheel;
	@ObfuscatedName("am")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("l")
	@Export("file")
	RandomAccessFile file;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = -672899169781171493L
	)
	@Export("maxSize")
	final long maxSize;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 492034629015795711L
	)
	@Export("offset")
	long offset;

	public AccessFile(File var1, String var2, long var3) throws IOException {
		if (-1L == var3) {
			var3 = Long.MAX_VALUE;
		}

		if (var1.length() > var3) {
			var1.delete();
		}

		this.file = new RandomAccessFile(var1, var2);
		this.maxSize = var3;
		this.offset = 0L;
		int var5 = this.file.read();
		if (var5 != -1 && !var2.equals("r")) {
			this.file.seek(0L);
			this.file.write(var5);
		}

		this.file.seek(0L);
	}

	@ObfuscatedName("l")
	@Export("seek")
	final void seek(long var1) throws IOException {
		this.file.seek(var1);
		this.offset = var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([BIIS)V",
		garbageValue = "-18286"
	)
	@Export("write")
	public final void write(byte[] var1, int var2, int var3) throws IOException {
		if ((long)var3 + this.offset > this.maxSize) {
			this.file.seek(this.maxSize);
			this.file.write(1);
			throw new EOFException();
		} else {
			this.file.write(var1, var2, var3);
			this.offset += (long)var3;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "23"
	)
	@Export("close")
	public final void close() throws IOException {
		this.closeSync(false);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	@Export("closeSync")
	public final void closeSync(boolean var1) throws IOException {
		if (this.file != null) {
			if (var1) {
				try {
					this.file.getFD().sync();
				} catch (SyncFailedException var3) {
				}
			}

			this.file.close();
			this.file = null;
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1317310270"
	)
	@Export("length")
	public final long length() throws IOException {
		return this.file.length();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-1029557368"
	)
	@Export("read")
	public final int read(byte[] var1, int var2, int var3) throws IOException {
		int var4 = this.file.read(var1, var2, var3);
		if (var4 > 0) {
			this.offset += (long)var4;
		}

		return var4;
	}

	protected void finalize() throws Throwable {
		if (this.file != null) {
			System.out.println("");
			this.close();
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lkl;III)Lon;",
		garbageValue = "-528990707"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		return !VarbitComposition.method3102(var0, var1, var2) ? null : SoundCache.method784();
	}
}
