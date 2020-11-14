import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mr")
@Implements("AccessFile")
public final class AccessFile {
	@ObfuscatedName("f")
	@Export("file")
	RandomAccessFile file;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = 7305467514372323617L
	)
	@Export("maxSize")
	final long maxSize;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 6565072637966942499L
	)
	@Export("offset")
	long offset;

	public AccessFile(File var1, String var2, long var3) throws IOException {
		if (-1L == var3) { // L: 11
			var3 = Long.MAX_VALUE;
		}

		if (var1.length() > var3) { // L: 12
			var1.delete(); // L: 13
		}

		this.file = new RandomAccessFile(var1, var2); // L: 15
		this.maxSize = var3; // L: 16
		this.offset = 0L; // L: 17
		int var5 = this.file.read(); // L: 18
		if (var5 != -1 && !var2.equals("r")) { // L: 19
			this.file.seek(0L); // L: 20
			this.file.write(var5); // L: 21
		}

		this.file.seek(0L); // L: 23
	} // L: 24

	@ObfuscatedName("f")
	@Export("seek")
	final void seek(long var1) throws IOException {
		this.file.seek(var1); // L: 27
		this.offset = var1; // L: 28
	} // L: 29

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1653357535"
	)
	@Export("write")
	public final void write(byte[] var1, int var2, int var3) throws IOException {
		if (this.offset + (long)var3 > this.maxSize) { // L: 32
			this.file.seek(this.maxSize); // L: 33
			this.file.write(1); // L: 34
			throw new EOFException(); // L: 35
		} else {
			this.file.write(var1, var2, var3); // L: 37
			this.offset += (long)var3; // L: 38
		}
	} // L: 39

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "115800567"
	)
	@Export("close")
	public final void close() throws IOException {
		this.closeSync(false); // L: 42
	} // L: 43

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1735365545"
	)
	@Export("closeSync")
	public final void closeSync(boolean var1) throws IOException {
		if (this.file != null) { // L: 46
			if (var1) { // L: 47
				try {
					this.file.getFD().sync(); // L: 49
				} catch (SyncFailedException var3) { // L: 51
				}
			}

			this.file.close(); // L: 53
			this.file = null; // L: 54
		}

	} // L: 56

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "836289418"
	)
	@Export("length")
	public final long length() throws IOException {
		return this.file.length(); // L: 59
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "119"
	)
	@Export("read")
	public final int read(byte[] var1, int var2, int var3) throws IOException {
		int var4 = this.file.read(var1, var2, var3); // L: 63
		if (var4 > 0) {
			this.offset += (long)var4; // L: 64
		}

		return var4; // L: 65
	}

	protected void finalize() throws Throwable {
		if (this.file != null) { // L: 69
			System.out.println(""); // L: 70
			this.close(); // L: 71
		}

	} // L: 73
}
