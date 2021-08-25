import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
public class class403 implements MouseWheel {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	public static final class403 field4332;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	public static final class403 field4323;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	static final class403 field4324;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	static final class403 field4325;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	static final class403 field4326;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	static final class403 field4327;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 884323919
	)
	final int field4328;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2090054673
	)
	final int field4331;

	static {
		field4332 = new class403(1, 0);
		field4323 = new class403(5, 2);
		field4324 = new class403(0, 5);
		field4325 = new class403(3, 6);
		field4326 = new class403(4, 7);
		field4327 = new class403(2, 8);
	}

	class403(int var1, int var2) {
		this.field4328 = var1;
		this.field4331 = var2;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "9"
	)
	public boolean method7084() {
		return this == field4323;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1665712539"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4331;
	}
}
