import java.util.zip.Inflater;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
@Implements("GZipDecompressor")
public class GZipDecompressor {
	@ObfuscatedName("f")
	@Export("inflater")
	Inflater inflater;

	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1000000"
	)
	GZipDecompressor(int var1, int var2, int var3) {
	} // L: 13

	public GZipDecompressor() {
		this(-1, 1000000, 1000000); // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lkb;[BI)V",
		garbageValue = "118989570"
	)
	@Export("decompress")
	public void decompress(Buffer var1, byte[] var2) {
		if (var1.array[var1.offset] == 31 && var1.array[var1.offset + 1] == -117) { // L: 16
			if (this.inflater == null) {
				this.inflater = new Inflater(true); // L: 17
			}

			try {
				this.inflater.setInput(var1.array, var1.offset + 10, var1.array.length - (var1.offset + 8 + 10)); // L: 19
				this.inflater.inflate(var2); // L: 20
			} catch (Exception var4) { // L: 22
				this.inflater.reset(); // L: 23
				throw new RuntimeException(""); // L: 24
			}

			this.inflater.reset(); // L: 26
		} else {
			throw new RuntimeException("");
		}
	} // L: 27
}
