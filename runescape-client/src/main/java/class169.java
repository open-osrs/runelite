import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public enum class169 implements Enumerated {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lfg;"
	)
	field2028(0, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lfg;"
	)
	field2023(1, 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lfg;"
	)
	field2024(2, 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lfg;"
	)
	field2025(3, 3);

	@ObfuscatedName("em")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		signature = "Lcu;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1619029739
	)
	public final int field2026;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1641384221
	)
	@Export("id")
	final int id;

	class169(int var3, int var4) {
		this.field2026 = var3;
		this.id = var4;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-995092303"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
