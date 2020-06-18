import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
public class class219 {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lhe;"
	)
	@Export("huffman")
	public static Huffman huffman;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		signature = "Lbx;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)[Lif;",
		garbageValue = "0"
	)
	static VerticalAlignment[] method4106() {
		return new VerticalAlignment[]{VerticalAlignment.field3230, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field3226};
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)Liy;",
		garbageValue = "1818836653"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "527461459"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + UserComparator3.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}
}
