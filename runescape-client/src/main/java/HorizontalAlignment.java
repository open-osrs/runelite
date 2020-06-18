import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enumerated {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Ljc;"
	)
	field3488(2, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Ljc;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(1, 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Ljc;"
	)
	field3492(0, 2);

	@ObfuscatedName("bq")
	@Export("worldListURL")
	static String worldListURL;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1908984303
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1088861253
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
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
