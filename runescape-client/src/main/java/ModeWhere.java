import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3819("", 0, new class301[]{class301.field3781}),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3817("", 1, new class301[]{class301.field3782, class301.field3781}),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3805("", 2, new class301[]{class301.field3782, class301.field3780, class301.field3781}),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3806("", 3, new class301[]{class301.field3782}),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3807("", 4),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3808("", 5, new class301[]{class301.field3782, class301.field3781}),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3809("", 6, new class301[]{class301.field3781}),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3811("", 8, new class301[]{class301.field3782, class301.field3781}),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3815("", 9, new class301[]{class301.field3782, class301.field3780}),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3812("", 10, new class301[]{class301.field3782}),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3813("", 11, new class301[]{class301.field3782}),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3803("", 12, new class301[]{class301.field3782, class301.field3781}),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3814("", 13, new class301[]{class301.field3782});

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static ClanSettings field3804;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = 1626624097
	)
	static int field3818;
	@ObfuscatedName("hp")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1200736709
	)
	@Export("id")
	final int id;
	@ObfuscatedName("s")
	final Set field3810;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lkh;)V"
	)
	ModeWhere(String var3, int var4, class301[] var5) {
		this.field3810 = new HashSet();
		this.id = var4;
		class301[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class301 var8 = var6[var7];
			this.field3810.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field3810 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "661199397"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "217948810"
	)
	static final void method5487() {
		if (Client.field722 != VertexNormal.Client_plane) {
			Client.field722 = VertexNormal.Client_plane;
			WorldMapSectionType.method3830(VertexNormal.Client_plane);
		}

	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1805506953"
	)
	static boolean method5483(int var0) {
		for (int var1 = 0; var1 < Client.field726; ++var1) {
			if (Client.field718[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
