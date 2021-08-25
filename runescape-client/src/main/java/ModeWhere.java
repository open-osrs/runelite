import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3811("", 0, new class301[]{class301.field3782}),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3800("", 1, new class301[]{class301.field3781, class301.field3782}),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3799("", 2, new class301[]{class301.field3781, class301.field3783, class301.field3782}),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3809("", 3, new class301[]{class301.field3781}),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3803("", 4),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3804("", 5, new class301[]{class301.field3781, class301.field3782}),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3801("", 6, new class301[]{class301.field3782}),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3806("", 8, new class301[]{class301.field3781, class301.field3782}),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3807("", 9, new class301[]{class301.field3781, class301.field3783}),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3808("", 10, new class301[]{class301.field3781}),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3813("", 11, new class301[]{class301.field3781}),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3810("", 12, new class301[]{class301.field3781, class301.field3782}),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3802("", 13, new class301[]{class301.field3781});

	@ObfuscatedName("fq")
	@ObfuscatedGetter(
		intValue = 1291133927
	)
	static int field3814;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -308798853
	)
	@Export("id")
	final int id;
	@ObfuscatedName("s")
	final Set field3805;

	static {
		method5408();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lkr;)V"
	)
	ModeWhere(String var3, int var4, class301[] var5) {
		this.field3805 = new HashSet();
		this.id = var4;
		class301[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class301 var8 = var6[var7];
			this.field3805.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field3805 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1665712539"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[Lki;",
		garbageValue = "-1660105485"
	)
	static ModeWhere[] method5408() {
		return new ModeWhere[]{field3810, field3800, field3813, field3802, field3803, field3808, field3804, field3801, field3807, field3811, field3809, field3806, field3799};
	}
}
