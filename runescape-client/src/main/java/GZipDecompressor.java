import java.util.zip.Inflater;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
@Implements("GZipDecompressor")
public class GZipDecompressor {
	@ObfuscatedName("ck")
	public static char field378;
	@ObfuscatedName("m")
	@Export("inflater")
	Inflater inflater;

	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1000000"
	)
	GZipDecompressor(int var1, int var2, int var3) {
	}

	public GZipDecompressor() {
		this(-1, 1000000, 1000000);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lgr;[BB)V",
		garbageValue = "-105"
	)
	@Export("decompress")
	public void decompress(Buffer var1, byte[] var2) {
		if (var1.array[var1.offset] == 31 && var1.array[var1.offset + 1] == -117) {
			if (this.inflater == null) {
				this.inflater = new Inflater(true);
			}

			try {
				this.inflater.setInput(var1.array, var1.offset + 10, var1.array.length - (var1.offset + 8 + 10));
				this.inflater.inflate(var2);
			} catch (Exception var4) {
				this.inflater.reset();
				throw new RuntimeException("");
			}

			this.inflater.reset();
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(II)Ljq;",
		garbageValue = "-1060388349"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructDefinition StructDefinition_getStructDefinition(int var0) {
		StructDefinition var1 = (StructDefinition)StructDefinition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = StructDefinition.StructDefinition_archive.takeFile(34, var0);
		var1 = new StructDefinition();
		if (var2 != null) {
			var1.decode(new Buffer(var2));
		}

		var1.postDecode();
		StructDefinition.StructDefinition_cached.put(var1, (long)var0);
		return var1;
	}
}
