import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
public class class101 extends class103 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = 4280987442180721817L
	)
	long field1284;
	@ObfuscatedName("t")
	String field1283;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	final class106 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldn;)V"
	)
	class101(class106 var1) {
		this.this$0 = var1;
		this.field1284 = -1L;
		this.field1283 = null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;B)V",
		garbageValue = "0"
	)
	void vmethod2562(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1284 = var1.readLong();
		}

		this.field1283 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "1598392944"
	)
	void vmethod2567(ClanSettings var1) {
		var1.method2362(this.field1284, this.field1283, 0);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lie;I)V",
		garbageValue = "1929542167"
	)
	public static void method2229(Huffman var0) {
		class251.huffman = var0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Let;",
		garbageValue = "-71"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
