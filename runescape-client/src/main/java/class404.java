import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
public class class404 implements MouseWheel {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	public static final class404 field4344;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	public static final class404 field4348;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static final class404 field4343;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static final class404 field4346;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static final class404 field4345;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static final class404 field4349;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1980513539
	)
	final int field4347;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1627487491
	)
	final int field4341;

	static {
		field4344 = new class404(3, 0);
		field4348 = new class404(0, 2);
		field4343 = new class404(1, 5);
		field4346 = new class404(4, 6);
		field4345 = new class404(2, 7);
		field4349 = new class404(5, 8);
	}

	class404(int var1, int var2) {
		this.field4347 = var1;
		this.field4341 = var2;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "661199397"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4341;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-433884264"
	)
	public boolean method7148() {
		return this == field4348;
	}
}
