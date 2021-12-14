import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
public class class9 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	static final class9 field37;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	public static final class9 field36;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	static final class9 field44;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	static final class9 field38;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	static final class9 field39;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive1")
	static Archive archive1;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -171712909
	)
	int field45;
	@ObfuscatedName("j")
	String field35;
	@ObfuscatedName("w")
	boolean field42;
	@ObfuscatedName("n")
	boolean field43;

	static {
		field37 = new class9(0, "POST", true, true);
		field36 = new class9(1, "GET", true, false);
		field44 = new class9(2, "PUT", false, true);
		field38 = new class9(3, "PATCH", false, true);
		field39 = new class9(4, "DELETE", false, true);
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field45 = var1;
		this.field35 = var2;
		this.field42 = var3;
		this.field43 = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "17"
	)
	boolean method85() {
		return this.field42;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field45;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1278274271"
	)
	String method100() {
		return this.field35;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1849660708"
	)
	boolean method86() {
		return this.field43;
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "29"
	)
	static void method88() {
		if (Client.renderSelf) {
			Buddy.addPlayerToScene(class340.localPlayer, false);
		}

	}
}
