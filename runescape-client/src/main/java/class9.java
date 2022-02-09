import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public class class9 implements MouseWheel {
	@ObfuscatedName("uh")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static class317 field58;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	static final class9 field50;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	public static final class9 field49;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	static final class9 field55;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	static final class9 field54;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	static final class9 field51;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1100997319
	)
	int field52;
	@ObfuscatedName("i")
	String field53;
	@ObfuscatedName("w")
	boolean field47;
	@ObfuscatedName("v")
	boolean field48;

	static {
		field50 = new class9(0, "POST", true, true); // L: 6
		field49 = new class9(1, "GET", true, false); // L: 7
		field55 = new class9(2, "PUT", false, true); // L: 8
		field54 = new class9(3, "PATCH", false, true); // L: 9
		field51 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field52 = var1; // L: 17
		this.field53 = var2; // L: 18
		this.field47 = var3; // L: 19
		this.field48 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-303340189"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field52; // L: 37
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1355234344"
	)
	boolean method68() {
		return this.field47; // L: 24
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1862464539"
	)
	String method75() {
		return this.field53;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "413764611"
	)
	boolean method70() {
		return this.field48;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lje;I)V",
		garbageValue = "-797236841"
	)
	public static void method82(Huffman var0) {
		class13.huffman = var0; // L: 14
	} // L: 15

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-117"
	)
	public static int method83(int var0, int var1) {
		return (var0 << 8) + var1; // L: 13
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "619853761"
	)
	public static int method67(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 28
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 29
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 30
		var0 += var0 >>> 8; // L: 31
		var0 += var0 >>> 16; // L: 32
		return var0 & 255; // L: 33
	}
}
