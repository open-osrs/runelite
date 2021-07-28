import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
public enum class99 implements Enumerated {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	field1276(3, 0),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	field1268(0, 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	field1267(2, 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	field1270(1, 3);

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	static class371 field1271;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 300633619
	)
	public final int field1269;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1149906791
	)
	@Export("id")
	final int id;

	class99(int var3, int var4) {
		this.field1269 = var3;
		this.id = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1806959663"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Leq;",
		garbageValue = "533845584"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
