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
		this.id = var4; // L: 39
		class313[] var6 = var5; // L: 41

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 42
			class313 var8 = var6[var7]; // L: 43
			this.field3950.add(var8); // L: 44
		}

	} // L: 47

	ModeWhere(String var3, int var4) {
		this.field3950 = new HashSet(); // L: 32
		this.id = var4; // L: 35
	} // L: 36

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 51
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "14"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 6049
			int var3 = FaceNormal.getTileHeight(var0, var1, class20.Client_plane) - var2; // L: 6054
			var0 -= UserComparator7.cameraX; // L: 6055
			var3 -= AbstractByteArrayCopier.cameraY; // L: 6056
			var1 -= UserComparator10.cameraZ; // L: 6057
			int var4 = Rasterizer3D.Rasterizer3D_sine[UserComparator7.cameraPitch]; // L: 6058
			int var5 = Rasterizer3D.Rasterizer3D_cosine[UserComparator7.cameraPitch]; // L: 6059
			int var6 = Rasterizer3D.Rasterizer3D_sine[class379.cameraYaw]; // L: 6060
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class379.cameraYaw]; // L: 6061
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 6062
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 6063
			var0 = var8; // L: 6064
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 6065
			var1 = var5 * var1 + var4 * var3 >> 16; // L: 6066
			if (var1 >= 50) { // L: 6068
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 6069
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2; // L: 6070
			} else {
				Client.viewportTempX = -1; // L: 6073
				Client.viewportTempY = -1; // L: 6074
			}

		} else {
			Client.viewportTempX = -1; // L: 6050
			Client.viewportTempY = -1; // L: 6051
		}
	} // L: 6052 6076
}
