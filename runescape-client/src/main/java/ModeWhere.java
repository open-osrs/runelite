import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	field3948("", 0, new class313[]{class313.field3915}),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	field3940("", 1, new class313[]{class313.field3917, class313.field3915}),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	field3938("", 2, new class313[]{class313.field3917, class313.field3916, class313.field3915}),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	field3939("", 3, new class313[]{class313.field3917}),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	field3955("", 4),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	field3941("", 5, new class313[]{class313.field3917, class313.field3915}),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	field3943("", 6, new class313[]{class313.field3915}),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	field3937("", 8, new class313[]{class313.field3917, class313.field3915}),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	field3944("", 9, new class313[]{class313.field3917, class313.field3916}),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	field3945("", 10, new class313[]{class313.field3917}),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	field3947("", 11, new class313[]{class313.field3917}),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	field3942("", 12, new class313[]{class313.field3917, class313.field3915}),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	field3936("", 13, new class313[]{class313.field3917});

	@ObfuscatedName("sl")
	@ObfuscatedGetter(
		intValue = -1096965871
	)
	static int field3951;
	@ObfuscatedName("cr")
	public static char field3954;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = -936877643
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -91884081
	)
	@Export("id")
	final int id;
	@ObfuscatedName("g")
	final Set field3950;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Llp;)V"
	)
	ModeWhere(String var3, int var4, class313[] var5) {
		this.field3950 = new HashSet();
		this.id = var4;
		class313[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class313 var8 = var6[var7];
			this.field3950.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field3950 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "14"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var3 = FaceNormal.getTileHeight(var0, var1, class20.Client_plane) - var2;
			var0 -= UserComparator7.cameraX;
			var3 -= AbstractByteArrayCopier.cameraY;
			var1 -= UserComparator10.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[UserComparator7.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[UserComparator7.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[class379.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class379.cameraYaw];
			int var8 = var6 * var1 + var0 * var7 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var5 * var3 - var4 * var1 >> 16;
			var1 = var5 * var1 + var4 * var3 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
