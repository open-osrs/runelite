import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
public class class9 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	public static final class9 field32;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	public static final class9 field40;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	static final class9 field36;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	static final class9 field34;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	static final class9 field37;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1322409525
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -941198057
	)
	int field33;
	@ObfuscatedName("p")
	String field38;
	@ObfuscatedName("s")
	boolean field39;
	@ObfuscatedName("r")
	boolean field35;

	static {
		field32 = new class9(0, "POST", true, true); // L: 6
		field40 = new class9(1, "GET", true, false); // L: 7
		field36 = new class9(2, "PUT", false, true); // L: 8
		field34 = new class9(3, "PATCH", false, true); // L: 9
		field37 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field33 = var1; // L: 17
		this.field38 = var2; // L: 18
		this.field39 = var3; // L: 19
		this.field35 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field33; // L: 37
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-29760861"
	)
	boolean method76() {
		return this.field39; // L: 24
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-128"
	)
	public String method67() {
		return this.field38; // L: 28
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-791619446"
	)
	boolean method68() {
		return this.field35; // L: 32
	}
}
